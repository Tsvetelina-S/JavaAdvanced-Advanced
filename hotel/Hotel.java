package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public List<Person> collection;
    public String name;
    public int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        collection = new ArrayList<>();
    }
    public void add (Person person){
        //⦁	Method add(Person person) - adds an entity to the roster if there is room for it
        if(collection.size() < capacity){
            collection.add(person);
        }
    }

    public boolean remove (String name){
        // removes a person by given name, if such exists, and returns boolean
        for (Person person: collection) {
            if(name.equals(person.getName())){
                collection.remove(person);
                return true;
            }
        }
        return false;
    }
    public Person getPerson (String name, String hometown){
       // returns the people with the given name and hometown or null if there is no such person.
        for (Person person: collection) {
            if(person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
    public int getCount (){
        //⦁	Getter getCount() – returns the number of people.
        return collection.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The people in the hotel ").append(this.name).append(" are:").append(System.lineSeparator());
        for (Person person : collection) {
            sb.append(person).append(System.lineSeparator());
        }
        return sb.toString();
    }

    // // The people in the hotel Hilton are:
    //                // Person Mark: 11111, Age: 41, Hometown: Sofia
    //                // Person Lizzy: 31311, Age: 24, Hometown: Varna
    //                // Person Lucy: 54122, Age: 31, Hometown: Birmingham
    //                // Person Maria: 66611, Age: 41, Hometown: Sofia
}
