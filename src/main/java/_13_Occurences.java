import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _13_Occurences {
    private static int[] arrayTwo = {1, 2, 3, 4, 1, 2, 1, 2, 6, 7, 5, 7, 9, 3, 10};
    private static ArrayList<Integer> arrayOne = new ArrayList<>();
    private static ArrayList<Integer> arrayThree = new ArrayList<>();

    private static ArrayList<Integer> removeOccurences(int[] thisArray){
        for(int x=0; x<thisArray.length; x++){
            if(arrayOne.contains(thisArray[x])){
                continue;
            } else {
                arrayOne.add(thisArray[x]);
            }
        }
        return arrayOne;
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.println(List.of(arrayTwo));
        ArrayList<Integer> answer1 = removeOccurences(arrayTwo);
        System.out.println(answer1);
        for(int i : arrayOne){
            for(int x: arrayTwo){
                if(i == x){
                    count++;
                }
            }
            if(count>1){
                arrayThree.add(i);
            }
            System.out.println(i + "appears -> "  + count + " time");
            count = 0;
        }
        System.out.println(arrayThree);
    }


}
