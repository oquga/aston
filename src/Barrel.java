import java.util.Comparator;

class BarrelVolumeComparator implements Comparator<Barrel> {
    @Override
    public int compare(Barrel o1, Barrel o2) {
        return Double.compare(o1.getVolume(), o2.getVolume());
    }
}

class BarrelMaterialComparator implements Comparator<Barrel> {
    @Override
    public int compare(Barrel o1, Barrel o2) {
        return o1.getMaterial().compareTo(o2.getMaterial());
    }
}
class BarrelContentComparator implements Comparator<Barrel> {
    @Override
    public int compare(Barrel o1, Barrel o2) {
        return o1.getContent().compareTo(o2.getContent());
    }
}

public class Barrel {

    private double volume;
    private String material;
    private String content;
    private Barrel(Barrel.BarrelBuilder barrelBuilder){
        volume = barrelBuilder.volume;
        material = barrelBuilder.material;
        content = barrelBuilder.content;
        //this.findStrategy = new BarrelFindStrategy();
    }

    public static class BarrelBuilder{
        private double volume;
        private String material;
        private String content;
        public BarrelBuilder(double volume){
            this.volume = volume;
        }
        public Barrel.BarrelBuilder SetMadeOf(String material){
            this.material = material;
            return this;
        }
        public Barrel.BarrelBuilder SetContains(String content){
            this.content = content;
            return this;
        }

        public Barrel build(){
            return new Barrel(this);
        }
    }
    public double getVolume() {
        return volume;
    }

    public String getMaterial() { return material; }

    public String getContent() {
        return content;
    }
}
