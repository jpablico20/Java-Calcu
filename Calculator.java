public class Calculator {
    private int num1;
    private int num2;

    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }

    public int add(){
        return num1 + num2;
    }

    public int sub(){
        return num1 - num2;
    }

    public int multiply(){
        return num1 * num2;
    }

    public int div(){
        return num1 / num2;
    }

}
