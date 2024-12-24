class Barrel {
    private int volume; //Объём
    private String storedMaterial; //Хранимый материал
    private String material; //Материал

    public Barrel(int volume, String storedMaterial, String material) {
        this.volume = volume;
        this.storedMaterial = storedMaterial;
        this.material = material;
    }

    public int getVolume() {
        return volume;
    }

    public String getStoredMaterial() {
        return storedMaterial;
    }

    public String getMaterial() {
        return material;
    }

    public static class BarrelBuilder {
        private int volume;
        private String storedMaterial;
        private String material;

        public BarrelBuilder setVolume(int volume) {
            this.volume = volume;
            return this;
        }

        public BarrelBuilder setStoredMaterial(String storedMaterial) {
            this.storedMaterial = storedMaterial;
            return this;
        }

        public BarrelBuilder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public Barrel build() {
            return new Barrel(volume, storedMaterial, material);
        }
    }
}
