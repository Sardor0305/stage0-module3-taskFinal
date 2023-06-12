package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int s = 0;
        while (number>0){
            s = s + number%10;

            number = number/10;

        }
        System.out.println(s);



    
    }
}
