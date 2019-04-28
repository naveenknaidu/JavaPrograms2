package Lab1;

public class TestSuiteCase {
    public static void main(String[] args){
    SuiteCase suitecase = new SuiteCase();
    SuiteCase mySuiteCase = new SuiteCase("yello","Wooden",4,false,11.99);
    SuiteCase yourSuiteCase = new SuiteCase("Black","LeATHER");
    SuiteCase pSuiteCase = new SuiteCase("Red",true);

    mySuiteCase.printValue();
        System.out.println(SuiteCase.getNoOfSuiteCases());

    }
}
