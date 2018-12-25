import java.util.*;




public class Exercise  {

    public static void main(String[] args)
    {

        Collection element = new Collection();
        element.add();
        element.add();
        element.remove(1);
        element.collection_new.get(0);
        element.sort(0,element.collection_new.get(0));
        Integer arr[] = new Integer [] {1,2,3,4,5,6,7,8};
        element.add(1,arr);



    }

    List<Integer[]> collection_new = new ArrayList<Integer[]>();


     Exercise()
    {
        collection_new.add(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
    }






}


interface Alist
{

    int size();
    Void add(int x);
    Void remove (int position);
    Void add(int position, int x);
    Void sort();


}





