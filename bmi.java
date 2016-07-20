import java.util.Scanner;
 
class Bodymassindex {
    public static void main (String [] args) {
 
        Scanner input = new Scanner (System.in);
         
        int weight;
        int height;
        int bMI;
         
        System.out.println ("Enter Your Weight in KG's: ");
        weight = input.nextInt();
        System.out.println ("Enter Your Height in Inches: ");
        height = input.nextInt();
        bMI = (weight) / (height * height);
        System.out.printf ("Your Body Mass Index (BMI) is %d\n\n", bMI);

        
                         if (bMI < 18.5) {
                                
		System.out.println ("Your are in Underweight");
		} 
                              else if (bMI >=18.5 && bMI <= 24.9) {
		System.out.println ("Your are in Normal Weight");
		}
                                else if (bMI >= 25 && bMI <= 29.9) {
		System.out.println ("Your are in Overweight");
		}
                                    else {
			System.out.println ("Your are in Obese");
		}
        	
	}
        
        }

