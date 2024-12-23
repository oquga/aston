public class Animal {
    private String type;
    private String eyeColor;
    private boolean hasFur;
    private Animal(Animal.AnimalBuilder animalBuilder){
        type = animalBuilder.type;
        eyeColor = animalBuilder.eyeColor;
        hasFur = animalBuilder.hasFur;
        //this.findStrategy = new AnimalFindStrategy();
    }
    public static class AnimalBuilder{
        private String type;
        private String eyeColor;
        private boolean hasFur;

        public AnimalBuilder(String type){
            this.type = type;
        }
        public Animal.AnimalBuilder isHasEyeColor(String eyeColor){
            this.eyeColor = eyeColor;
            return this;
        }
        public Animal.AnimalBuilder isHasFur(boolean hasFur){
            this.hasFur = hasFur;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }

    public String getType(){
        return type;
    }
    public String getEyeColor(){
        return eyeColor;
    }
    public boolean getHasFur(){
        return hasFur;
    }
}
