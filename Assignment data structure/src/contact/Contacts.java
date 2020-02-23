package contact;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Contacts {
    String first_Name;
    String last_Name;
    String phone_Number;
    String email_Address;
    private String j;

    public Contacts(String first_Name, String last_Name, String phone_Number, String email_Address) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.phone_Number = phone_Number;
        this.email_Address = email_Address;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public String getEmail_address() {
        return email_Address;
    }

    public static Contacts createContact(String first_Name, String last_Name, String phone_Number, String email_Address) {
        return new Contacts(first_Name, last_Name, phone_Number, email_Address);
    }

    ArrayList<String> list = new ArrayList<String>();
    HashMap<String, String> hash_map = new HashMap<String, String>();

    public ArrayList<String> getList(String first_Name, String last_Name, String phone_Number, String email_Address) {
        return list;
    }

    public void store(String first_Name, String last_Name, String phone_Number, String email_Address) {
        list.add(first_Name);
        list.add(last_Name);
        list.add(phone_Number);
        list.add(email_Address);
    }

    public void printList() {
        System.out.println("Contact list is ready: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void insertMap(String a, String b) {

        hash_map.put(a, b);
    }

    public void search(String first, String second) {

        if (!hash_map.containsKey(first)) {
            System.out.println("Match not Found");
        } else {
            System.out.println(" Match Found");
        }
    }

    public void remove(String k) {
        list.remove(k);
    }

}