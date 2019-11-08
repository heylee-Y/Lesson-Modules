package spring.pojo;

import org.springframework.stereotype.Component;

//@Component
public class Source {

    private String fruit;
    private String sugar;
    private String size;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void printFruit() {
        System.out.println("Source fruit: " + this.fruit);
    }

    public void printSize() {
        System.out.println("Source fruit: " + this.size);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }

}
