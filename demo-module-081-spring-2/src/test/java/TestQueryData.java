import model.DemoUser;
import model.Department;
import model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import util.HibernateUtil;

import java.util.List;

public class TestQueryData {

    @Test
    public void test() {

        Session session = HibernateUtil.getSession();
        try {
            session.getTransaction().begin();

            String sql = "select u from " + DemoUser.class.getName() + " u order by u.updateTime desc ";

            Query<DemoUser> query = session.createQuery(sql);

            List<DemoUser> list = query.getResultList();

            for (DemoUser user : list) {
                System.out.println(user.getName() + " --- " + user.getUpdateTime());
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Test
    public void test2() {

        Session session = HibernateUtil.getSession();
        try {
            session.getTransaction().begin();
            String depName = "ITS";

            String sql = "select e from " + Employee.class.getName() + " e where e.department.name=:depName";

            Query<Employee> query = session.createQuery(sql);

            query.setParameter("depName", depName);

            List<Employee> list = query.getResultList();

            for (Employee e : list) {
                System.out.println(e.getName() + " --- " + e.getDepartment().getName());
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Test
    public void test3() {
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();

//            session.load();
//            session.find();
//            session.persist();
//            session.save();
//            session.saveOrUpdate();
//            session.merge();
//            session.refresh();
//            session.delete();
//            session.remove();
//            session.evict();
//            session.clear();

            String sql = "select e.name,e.department.name from " + Employee.class.getName() + " e ";
            Query<Object[]> query = session.createQuery(sql);
            List<Object[]> list = query.getResultList();

            for (Object[] emp : list) {
                System.out.println(emp[0]);
                System.out.println(emp[1]);
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Test
    public void testPersistent() {
        Session session = HibernateUtil.getSession();
        Department department = null;
        try {
            session.beginTransaction();

            // Persistent object.
            department = findDepartment(session, "SSS");

            // Changing something on Persistent object.
            department.setName("ITS-Changed");

            // Use session.flush () to actively push the changes to the DB.
            // It works for all changed Persistent objects.
            session.flush();

            // Changing something on Persistent object 2.
            department.setName("ITS-Changed-two");

            session.getTransaction().commit();


        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Test
    public void testTransientToPersistent() {
        Session session = HibernateUtil.getSession();

    }

    private Department findDepartment(Session session, String depName) {
        String sql = "Select d from " + Department.class.getName() + " d "//
                + " Where d.name = :deptNo";
        Query<Department> query = session.createQuery(sql);
        query.setParameter("deptNo", depName);
        return query.getSingleResult();
    }
}
