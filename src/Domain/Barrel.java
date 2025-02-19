package Domain;

public class Barrel {
    private final double volume;
    private final String material;
    private final String content;

    private Barrel(BarrelBuilder barrelBuilder) {
        volume = barrelBuilder.volume;
        material = barrelBuilder.material;
        content = barrelBuilder.content;
    }
  
    public double getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material;
    }

    public String getContent() {
        return content;
    }
  
    public String toString(){
        return "Volume: "+volume +", Made of: "+ material +", Contains: "+ content;
    }

    public static class BarrelBuilder {
        private double volume;
        private String material;
        private String content;

        public BarrelBuilder setVolume(double volume) {
            this.volume = volume;
            return this;
        }

        public BarrelBuilder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public BarrelBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public Barrel build() {
            return new Barrel(this);
        }
    }
}

