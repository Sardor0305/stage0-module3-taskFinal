package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
            int s;
        while (number>0){
            s = number%10;
            System.out.print(s) ;
          
            number = number/10;

        }
    }
}
