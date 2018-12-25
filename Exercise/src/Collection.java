import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Collection

{


    List<Integer[]> collection_new = new ArrayList<Integer[]>();

    void add ()
    {
      //  collection_new.add(new Integer[]{randInt(), randInt(), randInt(),randInt(), randInt(), randInt(),randInt(), randInt()});
        collection_new.add(new Integer[]{5,4,3,5,3,6,1,0});


    }
    void add(int x ,Integer y[])
    {


      //  collection_new.add(x,);
        collection_new.add(x,y);




    }

    void remove(int x)
{

    collection_new.remove(x);

}

    public static int randInt() {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((8 - 1) + 1) + 1;

        return randomNum;
    }


    void sort (int x, Integer[] element)

    {
        int c;
        int buffer;
       boolean done = false;
        while (done == false)
        {
            done = true;
            for (c=0 ; c<element.length-1; c++)

            {

                    if (element[c]>element[c+1])
                    {
                        done = false;
                        int temp = element[c];
                        element[c]=element[c+1];
                        element[c+1]=temp;
                    }

            }



        }
        System.out.println(Arrays.toString(element));

}}
