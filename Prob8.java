public class Prob8{

    public static void main(String[] args) {
       
        int totalPopulation = 80000;
        double percentMen = 52.0;
        double percentLiteracy = 48.0;
        double percentLiterateMen = 35.0;

        int numberOfMen = (int) (percentMen / 100.0 * totalPopulation);
        int numberOfWomen = totalPopulation - numberOfMen;

        
        int numberOfLiterateMen = (int) (percentLiterateMen / 100.0 * numberOfMen);
        int numberOfLiterateWomen = (int) (percentLiteracy / 100.0 * numberOfWomen);

        
        int numberOfIlliterateMen = numberOfMen - numberOfLiterateMen;
        int numberOfIlliterateWomen = totalPopulation - numberOfLiterateMen - numberOfLiterateWomen;

        
        System.out.println("Total number of illiterate men: " + numberOfIlliterateMen);
        System.out.println("Total number of illiterate women: " + numberOfIlliterateWomen);
    }
}