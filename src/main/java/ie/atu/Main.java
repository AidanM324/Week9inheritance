package ie.atu;


public class Main {
    public static void main(String[] args) {
      Person myPerson = new Person("aidan", "ennistymon", "234");
        System.out.println(myPerson.toString());

        Customer myCustomer = new Customer();

        Customer myCustomer2 = new Customer("aidan", "ennis", "254", "123", true);


        myCustomer.setName("Aidan");
        myCustomer.setUserAddress("callura");
        myCustomer.setUserNumber("789");
        myCustomer.setCustNo("456");
        myCustomer.setMailingList(true);

        System.out.println("Customer Name: " + myCustomer.setName() + "Customer Address: " + myCustomer.setUserAddress() + "Customer Telephone Number: " + myCustomer.setUserNumber() +
                "Customer Number: " + myCustomer.setCustNo() + "Customer Name: " + myCustomer.setMailingList());

        System.out.println(myCustomer2.toString());



    }
}