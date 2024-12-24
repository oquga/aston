import static java.lang.Integer.compare;

public class Human{
    private String surname;
    private int age;
    private String gender;
    private Human(HumanBuilder humanBuilder){
        surname = humanBuilder.surname;
        age = humanBuilder.age;
        gender = humanBuilder.gender;
        //this.findStrategy = new HumanFindStrategy();
    }


    public static class HumanBuilder{
        private String surname;
        private int age;
        private String gender;

        public HumanBuilder(String surname){
            this.surname = surname;
        }
        public HumanBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }
        public HumanBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public Human build(){
            return new Human(this);
        }
    }

    public int compareAgeTo(Human anotherHuman) {
        return compare(this.age, anotherHuman.getAge());
    }



    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
}
