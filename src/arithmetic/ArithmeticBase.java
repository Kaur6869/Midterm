/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 02/19
 */
public class ArithmeticBase 
{

    private OP OP;
/* 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
        String s= sc.next();
       
        
        /*
        }*/

    private ArithmeticBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double calculate(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
        public enum OP{PLUS, MINUS,TIMES, DIVIDE};
        private final OP suit;

        public ArithmeticBase(OP v){
        suit = v;
}

public OP getOP(){
return this.OP;
}
        public double x,y;
        
        public ArithmticBase(double x, double y){
            
        }
      // double calculate(double x, double y) 
       
        ArithmeticBase r= new ArithmeticBase();
        double result = r.calculate(1,2);
        //System.out.println("result :" +result); 
    
   
}
