package _10_Mockito1;

public class Addition {

    private Operation ops;

    public Addition(Operation ops){
        this.ops = ops;
    }

    public int extraOperation(){
        int[] additionOperatonResult = ops.additionOperation();
        int greatest = Integer.MIN_VALUE;
        for (int x : additionOperatonResult) {
            if(x > greatest){
                greatest = x;
            }
        }
        return greatest;
    }

}
