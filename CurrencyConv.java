//A simple program to convert currencies -by Alpha X
import java.util.*;
class CurrencyConv
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]convert INR");
        System.out.println("[2]convert USD");
        System.out.println("[3]convert EURO");
        System.out.println("[4]convert GPB");
        System.out.println("[5]convert JPY");
        int ch = sc.nextInt();
        double inr=0,usd=0,euro=0,gpb=0,jpy=0;
        
        switch(ch)
        {
            case 1://INR converter
                System.out.println("[1]convert INR to USD");
                System.out.println("[2]convert INR to EURO");
                System.out.println("[3]convert INR to GPB");
                System.out.println("[4]convert INR to JPY");
                int sh = sc.nextInt();
                switch(sh)
                {
                  case 1:
                      System.out.println("Enter the amount in INR");
                      inr = sc.nextDouble();
                      usd = 0.015* inr;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(usd+" USD [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                  case 2:
                      System.out.println("Enter the amount in INR");
                      inr = sc.nextDouble();
                      euro = 0.001 * inr;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(euro+" EURO [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                  case 3:
                      System.out.println("Enter the amount in INR");
                      inr = sc.nextDouble();
                      gpb = 0.0090 * inr;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(gpb+" GPB [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                  case 4:
                      System.out.println("Enter the amount in INR");
                      inr = sc.nextDouble();
                      jpy = 1.75 * inr;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(jpy+" JPY [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                }
                break;
                
                
             case 2://USD converter
                 System.out.println("[1]convert USD to INR");
                 System.out.println("[2]convert USD to EURO");
                 System.out.println("[3]convert USD to GPB");
                 System.out.println("[4]convert USD to JPY");
                 int th = sc.nextInt();
                 switch(th)
                 {
                    case 1:
                        System.out.println("Enter the amount in USD");
                        usd = sc.nextDouble();
                        inr = usd / 0.015;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(inr+" INR [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                    case 2:
                        System.out.println("Enter the amount in USD");
                        usd = sc.nextDouble();
                        euro = usd * 0.85;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(euro+" EURO [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                    case 3:
                        System.out.println("Enter the amount in USD");
                        usd = sc.nextDouble();
                        gpb = usd * 0.75;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(gpb+" GPB [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                    case 4:
                        System.out.println("Enter the amount in USD");
                        usd = sc.nextDouble();
                        jpy = usd * 147;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(jpy+" JPY [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                        
                 }
                 break;
            case 3://EURO converter
                System.out.println("[1]convert EURO to INR");
                System.out.println("[2]convert EURO to USD");
                System.out.println("[3]convert EURO to GPB");
                System.out.println("[4]convert EURO to JPY");
                int fh = sc.nextInt();
                switch(fh)
                {
                  case 1:
                      System.out.println("Enter the amount in EURO");
                      euro = sc.nextDouble();
                      inr = euro * 102.85;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(inr+" INR [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                  case 2:
                      System.out.println("Enter the amount in EURO");
                      euro = sc.nextDouble();
                      usd = euro * 1.20;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(usd+" USD [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                  case 3:
                      System.out.println("Enter the amount in EURO");
                      euro = sc.nextDouble();
                      gpb = euro * 0.90;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(gpb+" GPB [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                  case 4:
                      System.out.println("Enter the amount in EURO");
                      euro = sc.nextDouble();
                      jpy = euro * 172.5;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(jpy+" JPY [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                  
                      
                }
                break;
            case 4://GPB converter
                System.out.println("[1]convert GPB to INR");
                System.out.println("[2]convert GPB to USD");
                System.out.println("[3]convert GPB to EURO");
                System.out.println("[4]convert GPB to JPY");
                int fih = sc.nextInt();
                switch(fih)
                {
                    case 1:
                      System.out.println("Enter the amount in GPB");
                      gpb = sc.nextDouble();
                      inr = gpb * 119.30;
                      System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                      System.out.println(inr+" INR [approx]");
                      System.out.println("                                                                          - by alphax");
                      System.out.println("INSTAGRAM - @alphax.empire");
                      break;
                    case 2:
                        System.out.println("Enter the amount in GPB");
                        gpb = sc.nextDouble();
                        usd = gpb * 1.35;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(usd+" USD [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                    case 3:
                        System.out.println("Enter the amount in GPB");
                        gpb = sc.nextDouble();
                        euro = gpb * 1.17;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(euro+" EURO [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                    case 4:
                        System.out.println("Enter the amount in GPB");
                        gpb = sc.nextDouble();
                        jpy = gpb * 199;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(jpy+" JPY [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                        
                }
                break;
            case 5://JPY converter
                System.out.println("[1]convert GPB to INR");
                System.out.println("[2]convert GPB to USD");
                System.out.println("[3]convert GPB to EURO");
                System.out.println("[4]convert GPB to GPB");
                int sih = sc.nextInt();
                switch(sih)
                {
                    case 1:
                        System.out.println("Enter the amount in JPY");
                        jpy = sc.nextDouble();
                        inr = jpy * 0.60;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(inr+" INR [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                    case 2:
                        System.out.println("Enter the amount in JPY");
                        jpy = sc.nextDouble();
                        usd = jpy * 0.0070;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(usd+" USD [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                    case 3:
                        System.out.println("Enter the amount in JPY");
                        jpy = sc.nextDouble();
                        euro = jpy * 0.0060;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(euro+" EURO [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                    case 4:
                        System.out.println("Enter the amount in JPY");
                        jpy = sc.nextDouble();
                        gpb = jpy * 0.005;
                        System.out.println("_________________________________CALCULATING IN MILLISECONDS_________________________________");
                        System.out.println(gpb+" GPB [approx]");
                        System.out.println("                                                                          - by alphax");
                        System.out.println("INSTAGRAM - @alphax.empire");
                        break;
                }
                
                
                    
            

                 
                 
             
        }
            
        
        
        
        
    }
}