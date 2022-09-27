package entity;

public class Person {
    private String username;
    private String email;

    public Person (String username, String email){
        this.username=username;
        this.email=email;
    }

    public void display(){
        System.out.println("Username is : " + this.username + " and email is : " + this.email);
    }
}
