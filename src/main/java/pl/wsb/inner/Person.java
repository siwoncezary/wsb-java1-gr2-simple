package pl.wsb.inner;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String phone;
    //Przykład konstruktorów teleskopowych
    public Person(){
    }
    public Person(String firstName){
        this.firstName = firstName;
    }
    public Person(String firstName, String lastName){
        this(firstName);
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this(firstName, lastName);
        this.birthDate = birthDate;
    }
    //koniec konstruktorów teleskopowych

    public Person(String firstName, String lastName, LocalDate birthDate, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    static public RequireFirstName builder(){
        return (RequireFirstName) new Builder();
    }

    interface RequireFirstName{
        RequireLastName firstName(String firstName);
    }
    interface RequireLastName{
        Builder lastName(String lastName);
    }

    public static class Builder implements RequireLastName, RequireFirstName {

        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private String phone;

        private Builder(){
        }

        public RequireLastName firstName(String firstName){
            this.firstName = firstName;
            return (RequireLastName) this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder birthDate(LocalDate date){
            this.birthDate = date;
            return this;
        }

        public Person build(){
            return new Person(firstName, lastName, birthDate);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", phone='" + phone + '\'' +
                '}';
    }
}
