import java.util.ArrayList;

class SortBarrel{
    public ArrayList<Barrel> BarrelVolumeSort(ArrayList<Barrel> barrels){
        InsertionSort<Barrel> insertionSort = new InsertionSort<>();
        insertionSort.perform(barrels, new BarrelVolumeComparator());
        return barrels;
    }
    public ArrayList<Barrel> BarrelMaterialSort(ArrayList<Barrel> barrels){
        InsertionSort<Barrel> insertionSort = new InsertionSort<>();
        insertionSort.perform(barrels, new BarrelMaterialComparator());
        return barrels;
    }
    public ArrayList<Barrel> BarrelContentSort(ArrayList<Barrel> barrels){
        InsertionSort<Barrel> insertionSort = new InsertionSort<>();
        insertionSort.perform(barrels, new BarrelContentComparator());
        return barrels;
    }
}