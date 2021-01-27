public class Calculator extends Object {
    String LastResult;
    @Override
    public String toString(){
        return LastResult;
    }

    public int sum(int x, int y){
        LastResult = Integer.toString(x+y);
        return x+y;
    }

    public int division(int x, int y){
        return x/y;
    }

    public int subtraction(int x, int y){
        return x-y;
    }

    public int module(int x, int y){
        return Math.abs(x-y);
    }
}
