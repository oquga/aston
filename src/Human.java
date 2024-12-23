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
        public HumanBuilder SetGender(String gender){
            this.gender = gender;
            return this;
        }
        public HumanBuilder SetAge(int age){
            this.age = age;
            return this;
        }

        public Human build(){
            return new Human(this);
        }
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
