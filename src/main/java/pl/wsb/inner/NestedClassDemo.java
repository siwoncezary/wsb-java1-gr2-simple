package pl.wsb.inner;

import java.time.LocalDate;

public class NestedClassDemo {
    public static void main(String[] args) {
        Person person = Person.builder().firstName("Adam").lastName("Nowak").build(); //ALT + ENTER
        Person person1 = Person.builder().firstName("Ewa").lastName("Kowal").birthDate(LocalDate.of(2000, 10, 10)).build();
        System.out.println(person);
        System.out.println(person1);
    }
}
