import java.util.Scanner;

public class myCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("1. calculate area of triangel\n2. convert celsius to fahrenheit\n3. Odd or even number");
        int value = scanner.nextInt();
        switch (value) {
            case 1: System.out.println("height=");
                    float h = scanner.nextFloat(); 
                    System.out.println("base=");
                    float b = scanner.nextFloat(); 
                    
                    float areaResult=calculateAreaOfTriangle( b, h);
                    System.out.println("The triangle area is:"+ areaResult);
                    break;   
            case 2: System.out.println("Celsius=");
                    double  = scanner.nextDouble();  
                break;  
            case 3: System.out.println("20");  
                break;  
                //Default case statement  
            default:System.out.println("try again");  
        
        }
}
    public static float calculateAreaOfTriangle(float b, float h){ 
        float area ;  
        area = ( b*h) / 2 ;  
        return(area);  
    }
    public double convertCelsiusToFahrenheit(){  
        double fahrenheit, celsius;
        fahrenheit = ( celsius * 1.8) + 32;
        System.out.println(
            " value of temperature in fahrenheit:"
            + fahrenheit);
    }
    public int oddOrEven(){ 
        int number;
        if ( % 2==0){  
            System.out.println("its even");
        }else{
            System.out.println("its uneven");
        }
        
    }
}
