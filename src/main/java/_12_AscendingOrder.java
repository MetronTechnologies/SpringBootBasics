import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _12_AscendingOrder {

    private static ArrayList<Double> numbersArray = new ArrayList<>();
    private static Double[] theArray = {1349.560, 1349.562, 1349.56256, 1349.5637, 1349.5641, 1349.565, 1349.566};

    private static ArrayList<Double> numbArrays = new ArrayList<>();


    private static void theList(Double[] anArray){
        ArrayList<Double> aList = new ArrayList<>(Arrays.asList(anArray));
        numbArrays = aList;
    }

    private static ArrayList<Double> sorter(){
        double smallest = Integer.MAX_VALUE;
        double answer = 0;
        int index = 0;
        for (Double numbArray : numbArrays) {
            if (numbArray < smallest) {
                smallest = numbArray;
                answer = smallest;
                index = numbArrays.indexOf(numbArray);
            }
        }
        numbArrays.remove(index);
        numbersArray.add(answer);
        return numbArrays;
    }

    public static void main(String[] args) {
        theList(theArray);
        while (numbArrays.size() != 0) {
            ArrayList<Double> result = sorter();
            System.out.println(result);
            if(numbArrays.size() > 1){
                System.out.println("Still ok");
            }
        }
        System.out.println(numbersArray);
    }

}
