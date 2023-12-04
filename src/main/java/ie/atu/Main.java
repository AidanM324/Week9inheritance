package ie.atu;


public class Main {
    public static void main(String[] args) {
      Person myPerson = new Person("aidan", "ennistymon", "234");
        System.out.println(myPerson.toString());

        Customer myCustomer = new Customer();

        Customer myCustomer2 = new Customer("aidan", "ennis", "254", "123", true);

        System.out.println(myCustomer2.toString());



    }
}