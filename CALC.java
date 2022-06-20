import java.util.Scanner; 
//import java.lang.Math


class CALC {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Calculator");
        System.out.println("Enter operator:");
    
        String operator = myObj.nextLine();  // Read user input
        if (operator.equals("?")){
            System.out.println("All current operators:");
            System.out.println("[+] ==> plus");
            System.out.println("[-] ==> minus");
            System.out.println("[*] ==> multiplication");
            System.out.println("[/] ==> division");
            System.out.println("[^] ==> power");
            System.out.println("[#] ==> square root");
            System.out.println("[!] ==> Factorial");
        }
        System.out.println("The current operator is (" + operator + ")");
        System.out.println("Enter number 1:");
        String n1 = myObj.nextLine();
        if(operator.equals("!")){
            try{
                int int1 = Integer.parseInt(n1);
                int i,fact=1;
                int number=int1;// notre nombre pour faire les calculs nécessaires dans la classe Factorial
                for(i=1;i<=number;i++){
                    fact=fact*i;
                }
                System.out.println("="+fact);
                }
            catch (NumberFormatException ex){
                System.out.println("ERROR: Your first number is not an Integer");
            }
            System.exit(0);
    }  
        if(operator.equals("#")){
            try{
                int int1 = Integer.parseInt(n1);
            // int int2 = Integer.parseInt(n2);
                //int resp = int1 ** 2;
            
                double resp = Math.sqrt(int1);
                System.out.println("="+resp);
            }
            catch (NumberFormatException ex){
                System.out.println("ERROR: Your first number is not an Integer");
            }
            System.exit(0);
    }
    //System.out.println(n1);
        System.out.println("Enter number 2:");
        String n2 = myObj.nextLine();
        //System.out.println(n2);
        System.out.println("operation => " + n1 + " "+operator+" "+n2);
        myObj.close();


        if (operator.equals("+")){
            try{
                int int1 = Integer.parseInt(n1);
                int int2 = Integer.parseInt(n2);
                int resp = int1 + int2;
                System.out.println("="+resp);
            }
            catch (NumberFormatException ex){
                System.out.println("ERROR: one of the two number is not an integer");
            }
            





            
        }

        if(operator.equals("-")){
            try{
                int int1 = Integer.parseInt(n1);
                int int2 = Integer.parseInt(n2);
                int resp = int1 - int2;
                System.out.println("="+resp);
            }
            catch (NumberFormatException ex){
                System.out.println("ERROR: one of the two number is not an integer");
            }
        }

        if(operator.equals("*")){
            try{
                int int1 = Integer.parseInt(n1);
                int int2 = Integer.parseInt(n2);
                int resp = int1 * int2;
                System.out.println("="+resp);
            }
            catch (NumberFormatException ex){
                System.out.println("ERROR: one of the two number is not an integer");
            }
        }

        if(operator.equals("/")){
            try{
                int int1 = Integer.parseInt(n1);
                int int2 = Integer.parseInt(n2);
                int resp = int1 / int2;
                System.out.println("="+resp);
            }
            catch (NumberFormatException ex){
                System.out.println("ERROR: one of the two number is not an integer");
            }
        }

        if(operator.equals("^")){
            try{
                int int1 = Integer.parseInt(n1);
                int int2 = Integer.parseInt(n2);
                //int resp = int1 ** 2;
                double resp = Math.pow(int1, int2);
                System.out.println("="+resp);
            }
            catch (NumberFormatException ex){
                System.out.println("ERROR: one of the two number is not an integer");
            }
        }      
    }
}



