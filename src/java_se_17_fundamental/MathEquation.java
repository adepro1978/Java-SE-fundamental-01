package java_se_17_fundamental;



    public class MathEquation {
        double leftVal;
        double rightVal;
        char opCode;
        double result;

        void execute( ) {

            switch (opCode) {

                case 'a':
                    result = leftVal + rightVal;
                    break;
                case 's':
                    result = leftVal - rightVal;
                    break;
                case 'm':
                    result = leftVal * rightVal;
                    break;
                case 'd':
                    result = leftVal / rightVal;


                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opCode);
            }
        }
    }
