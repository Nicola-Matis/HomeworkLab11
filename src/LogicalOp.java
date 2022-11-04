//3.
public class LogicalOp {
    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    //4.
    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison.";
        } else {
            return "Got to try some more";
        }
    }

    //5.
    public String returnTxtNr(String text, int nr) {
        if (text.equals("FastTrackIT") && nr <= 3) {
            return text + " " + nr;
        } else if (!text.equals("FastTrackIT") && nr >= 4) {
            return nr + " " + text;
        } else {
            return "Neither conditions are true";

        }
    }

    //6.
    public String orCondition(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }
    }

    //7.
    public String greaterThanEqual(int number) {
        if (number < 3) {
            return "The number is lower than 3";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number > 3 && number != 4) ;
        {
            return "The number is greater than 3 and not equal to 4";
        }
    }

    //8.
    public void printNumber (int number) {

        switch (number) {

            case 0:

                System.out.println("The number is 0");

                break;

            case 1:

                System.out.println("The number is 1");

                break;

            case 2:

                System.out.println("The number is 2");

                break;

            case 3:

                System.out.println("The number is 3");

                break;

            case 4:

                System.out.println("The number is 4");

                break;

            case 5:

                System.out.println("The number is 5");

                break;

            case 6:

                System.out.println("The number is 6");

                break;

            case 7:

                System.out.println("The number is 7");

                break;

            case 8:

                System.out.println("The number is 8");

                break;

            case 9:

                System.out.println("The number is 9");

                break;

            default:

                System.out.println("Not allowed");
        }
    }

    //9.

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //10.

    public boolean isEligibleToVote(int number) {
        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //11.

    public int returnBiggestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
