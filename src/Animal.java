public class Animal {
    private final String type;
    private final String eyeColor;
    private final boolean hasFur;

    private Animal(AnimalBuilder animalBuilder) {
        type = animalBuilder.type;
        eyeColor = animalBuilder.eyeColor;
        hasFur = animalBuilder.hasFur;
    }
    public String getType() {
        return type;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean getHasFur() {
        return hasFur;
    }
    public String toString(){
        return type +" "+ eyeColor +" "+ hasFur;
    }

    public static class AnimalBuilder {
        private String type;
        private String eyeColor;
        private boolean hasFur;

        public AnimalBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public AnimalBuilder setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public AnimalBuilder isHasFur(boolean hasFur) {
            this.hasFur = hasFur;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}