public class UtilityMethods {
    void printCurrency(double value){
        System.out.printf("%.2f\n", value);
    }
    int add(int a, int b){
        return a + b;
    }
    double division(int a, int b){
        return (double) a / (double) b;
    }

    String getTheAnswerToTheUltimateQuestionOfLife_TheUniverse_And_Everything(){
        try{
            Thread.sleep(750);
        }catch(InterruptedException e){}
        return "42";
    }

    public static void main(String[] args) {
        UtilityMethods app = new UtilityMethods();
        System.out.println(app.add(1,2));
        System.out.println(app.division(5,2));
        System.out.println(app.getTheAnswerToTheUltimateQuestionOfLife_TheUniverse_And_Everything());
    }
}
