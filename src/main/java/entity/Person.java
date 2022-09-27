package entity;

public class Person {
    private String username;

    public Person (String username){
        this.username=username;
    }

    public void display(){
        System.out.println("Username is : " + this.username);
    }
}
