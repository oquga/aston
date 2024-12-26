package Domain;

public class Human {
    private final String surname;
    private final int age;
    private final String gender;

    private Human(HumanBuilder humanBuilder) {
        surname = humanBuilder.surname;
        age = humanBuilder.age;
        gender = humanBuilder.gender;
    }
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public String toString(){
        return "Surname " +surname + ", Age: " + age +", Gender: "+ gender;
    }

    public static class HumanBuilder {
        private String surname;
        private int age;
        private String gender;

        public HumanBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public HumanBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public HumanBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }
}

