package heylee.step2_ugly;

import heylee.BankFixture;
import heylee.step1_failure.FailureBankDao;
import heylee.step1_failure.FailureBankService;
import heylee.step1_failure.FailureInsuranceDao;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class UglyBankServiceTest extends BankFixture {

    @Test
    public void transferSuccess() throws SQLException
    {
        UglyBankDao uglyBankDao = new UglyBankDao();
        UglyInsuranceDao uglyInsuranceDao = new UglyInsuranceDao();

        UglyBankService bankService = new UglyBankService(dataSource);

        bankService.setUglyBankDao(uglyBankDao);
        bankService.setUglyInsuranceDao(uglyInsuranceDao);

        bankService.transfer(1111, 2222, 200);

        assertEquals(800, getBankAmount(1111));
        assertEquals(1200, getInsuranceAmount(2222));

    }

    @Test
    public void transferFailure() throws SQLException
    {
        UglyBankDao uglyBankDao = new UglyBankDao();
        UglyInsuranceDao uglyInsuranceDao = new UglyInsuranceDao();

        UglyBankService bankService = new UglyBankService(dataSource);

        bankService.setUglyBankDao(uglyBankDao);
        bankService.setUglyInsuranceDao(uglyInsuranceDao);

        int toNonExistId = 3333;
        bankService.transfer(1111, toNonExistId, 200);

        assertEquals(1000, getBankAmount(1111));
        assertEquals(1000, getInsuranceAmount(2222));
    }
}
