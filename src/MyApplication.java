import Classes.Employee;
import Classes.Person;
import Classes.Student;
import Interfaces.Payable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args)
    {
        ArrayList<Person> persons = new ArrayList<>();

        Person erkhan = new Student("Erkhan" , "Piriyev" , 2.97);
        Person beybars = new Student("Beybars" , "Piriyev" , 2.88);
        Person pudge = new Student("Pudge" , "Momchegov" , 1.47);
        Person nursultan = new Employee("Nursultan" , "Khaimuldin" , "Teacher" , 500000);
        Person vitaliy = new Employee("Vitaliy", "Nalivkin" , "Guard" , 42500);

        persons.add(erkhan);
        persons.add(beybars);
        persons.add(pudge);
        persons.add(nursultan);
        persons.add(vitaliy);

        Collections.sort(persons);

        printData(persons);
    }

    private static void printData(Iterable<? extends Payable> payables)
    {
        for (Payable payable : payables)
        {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}