public class Barrel {
    private double volume;
    private String madeOf;
    private String contains;
    private Barrel(Barrel.BarrelBuilder barrelBuilder){
        volume = barrelBuilder.volume;
        madeOf = barrelBuilder.madeOf;
        contains = barrelBuilder.contains;
        //this.findStrategy = new BarrelFindStrategy();
    }

    public static class BarrelBuilder{
        private double volume;
        private String madeOf;
        private String contains;
        public BarrelBuilder(double volume){
            this.volume = volume;
        }
        public Barrel.BarrelBuilder isHasMadeOf(String madeOf){
            this.madeOf = madeOf;
            return this;
        }
        public Barrel.BarrelBuilder isHasContains(String contains){
            this.contains = contains;
            return this;
        }

        public Barrel build(){
            return new Barrel(this);
        }
    }
    public double getVolume() {
        return volume;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public String getContains() {
        return contains;
    }
}
