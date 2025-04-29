class Calculator {
    int a=2;
    int b=9;

void display(){
    System.out.println("adding number"+(a+b));
    System.out.println("subtarcting number"+(a-b));
    System.out.println("multiplyig number"+(a*b));
    System.out.println("division"+(a/b));
    System.out.println("modulus"+(a%b));
}
}
public class SimpleCalculator{
    public static void main(String[] args){
    Calculator SC=new Calculator();
    SC.display();
    }
}
    
    
    
