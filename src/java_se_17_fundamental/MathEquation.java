package java_se_17_fundamental;



    public class MathEquation {
        double leftVal;
        double rightVal;
        char opCode;
        double result;

        private static int numberOfCalculation;
        private static double sumOfResult;


        //public MathEquation(){}


        public MathEquation (char opCode){
            this.opCode = opCode;

        }

        public MathEquation(char opCode, double leftVal, double rightVal){
            this(opCode);
            this.leftVal = leftVal;
            this.rightVal = rightVal;

        }


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

            numberOfCalculation++;
            sumOfResult += result;
        }

        public static double getAverageResult() {
            return sumOfResult / numberOfCalculation;
        }

        /*
        public void setLeftVal(double leftVal) {

        }

        public void setRightVal(double rightVal) {

        }

        public void setOpCode(char opCode) {

        }
        **/
    }
