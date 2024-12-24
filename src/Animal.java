public class Animal {
    private final String type; //Вид
    private final String eyesColor; //Цвет глаз
    private final boolean fur; //Есть шерсть/нет

    public Animal(String type, String eyesColor, boolean fur) {
        this.type = type;
        this.eyesColor = eyesColor;
        this.fur = fur;
    }

    public String getType() {
        return type;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public boolean isFur() {
        return fur;
    }

    public static class AnimalBuilder {
        private String type;
        private String eyesColor;
        private boolean fur;

        public AnimalBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public AnimalBuilder setEyesColor(String eyesColor) {
            this.eyesColor = eyesColor;
            return this;
        }

        public AnimalBuilder setFur(boolean fur) {
            this.fur = fur;
            return this;
        }

        public Animal build() {
            return new Animal(type, eyesColor, fur);
        }
    }
}

