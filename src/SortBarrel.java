import java.util.ArrayList;

class SortBarrel{
    public ArrayList<Barrel> BarrelVolumeSort(ArrayList<Barrel> barrels){
        InsertionSort<Barrel> insertionSort = new InsertionSort<>();
        insertionSort.perform(barrels, new BarrelVolumeComparator());
        System.out.println("Sorted by Volume:");
        for (Barrel barrel : barrels) {
            System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
        }
        System.out.println();
        return barrels;
    }
    public ArrayList<Barrel> BarrelMaterialSort(ArrayList<Barrel> barrels){
        InsertionSort<Barrel> insertionSort = new InsertionSort<>();
        insertionSort.perform(barrels, new BarrelMaterialComparator());
        System.out.println("Sorted by Material:");
        for (Barrel barrel : barrels) {
            System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
        }
        System.out.println();
        return barrels;
    }
    public ArrayList<Barrel> BarrelContentSort(ArrayList<Barrel> barrels){
        InsertionSort<Barrel> insertionSort = new InsertionSort<>();
        insertionSort.perform(barrels, new BarrelContentComparator());
        System.out.println("Sorted by Contents:");
        for (Barrel barrel : barrels) {
            System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
        }
        System.out.println();
        return barrels;
    }
}