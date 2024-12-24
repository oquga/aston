import java.util.Comparator;

class HumanGenderComparator implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}

class HumanSurnameComparator implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
class HumanAgeComparator implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}

public class Human {




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
