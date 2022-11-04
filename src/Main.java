public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise number 1: ");

        Calculator calc = new Calculator();

        int x = 210;
        int y = 14;


        int z = calc.sum(x, y);
        System.out.println(z);

        float a = calc.multiplication(x, y);
        System.out.println(a);

        System.out.println("Exercise number 3: ");

        LogicalOp logicalOp = new LogicalOp();
        int bigger = logicalOp.checkBiggerNumber(5, 14);
        System.out.println("The bigger number from the selected list is: " + bigger);

        System.out.println("Exercise number 4: ");

        String textChecker = logicalOp.checkText("FastTrackIT");
        System.out.println(textChecker);
        String textChecker2 = logicalOp.checkText("portocala");
        System.out.println(textChecker2);

        System.out.println("Exercise number 5: ");

        String Iverify = logicalOp.returnTxtNr("FastTrackIT", 3);
        System.out.println(Iverify);
        String Iverify2 = logicalOp.returnTxtNr("FastandFurious", 5);
        System.out.println(Iverify2);
        String Iverify3 = logicalOp.returnTxtNr("FastandFurious", 3);
        System.out.println(Iverify3);

        System.out.println("Exercise number 6: ");

        String orCondition = logicalOp.orCondition(6);
        System.out.println(orCondition);
        String orCondition2 = logicalOp.orCondition(3);
        System.out.println(orCondition2);

        System.out.println("Exercise number 7: ");

        String greaterThanEqual = logicalOp.greaterThanEqual(1);
        System.out.println(greaterThanEqual);
        String greaterThanEqual2 = logicalOp.greaterThanEqual(4);
        System.out.println(greaterThanEqual2);
        String greaterThanEqual3 = logicalOp.greaterThanEqual(5);
        System.out.println(greaterThanEqual3);

        System.out.println("Exercise number 8: ");

        logicalOp.printNumber(7);
        logicalOp.printNumber(100);

        System.out.println("Exercise number 9: ");

        boolean isNumberEven = logicalOp.isNumberEven(5);
        System.out.println(isNumberEven);
        boolean isNumberEven2 = logicalOp.isNumberEven(4);
        System.out.println(isNumberEven2);

        System.out.println("Exercise number 10: ");

        boolean isEligibleToVote = logicalOp.isEligibleToVote(16);
        System.out.println(isEligibleToVote);

        System.out.println("Exercise number 11: ");

        int returnBiggestNumber = logicalOp.returnBiggestNumber(3,77,400);
        System.out.println(returnBiggestNumber);

    }
}
