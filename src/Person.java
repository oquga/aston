class Person {
    private String gender; //Пол
    private int age; //Возраст
    private String surname; //Фамилия

    public Person(String gender, int age, String surname) {
        this.gender = gender;
        this.age = age;
        this.surname = surname;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getSurname() {
        return surname;
    }

    public static class PersonBuilder {
        private String gender;
        private int age;
        private String surname;

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Person build() {
            return new Person(gender, age, surname);
        }
    }
}
