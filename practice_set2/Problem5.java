class Converter{
    // double celsius;
    
    void toFahrenheit(double celsius){
        double fahrenheit= (celsius*1.8)+32;
        System.out.println(celsius +" celsius is "+fahrenheit+" fahrenheit");
    }
}
public class Problem5 {
    public static void main(String[] args) {
        Converter convert=new Converter();
        convert.toFahrenheit(32);
    }
}
