//This project uses the bubble sort algorithm to sort contacts and their phone numbers
public class Contact implements Comparable<Contact> {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int compareTo(Contact other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
    
    public static void bubbleSort(Contact[] contacts) {
        boolean swapped;
        for (int i = 0; i < contacts.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < contacts.length - i - 1; j++) {
                if (contacts[j].compareTo(contacts[j + 1]) > 0) {
                    Contact temp = contacts[j];
                    contacts[j] = contacts[j + 1];
                    contacts[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Stop iteration if the array is already sorted
        }
    }
    
    public static void main(String[] args) {
        Contact[] contacts = {
            new Contact("Alice", "123-456-7890"),
            new Contact("Bob", "987-654-3210"),
            new Contact("Charlie", "555-555-5555")
        };

        System.out.println("Before sorting:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        bubbleSort(contacts);

        System.out.println("\nAfter sorting:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

}


