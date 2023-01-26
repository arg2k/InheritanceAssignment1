package Calculator;

public class TesterCalculator extends Calculator {
    public static void main(String[] args) {
    	Calculator c =  new Calculator();
        double avg3 = c.findAverage(1.22, 2.22, 3.22);
        double avg4 = c.findAverage(1.22, 2.22, 3.22, 4.22);
        double avg5 = c.findAverage(1.22, 2.22, 3.22, 4.22, 5.22);

        System.out.println("The average of three numbers: " + c.roundOff(avg3));
        System.out.println("The average of four numbers: " + c.roundOff(avg4));
        System.out.println("The average of five numbers: " + c.roundOff(avg5));
    }
}
