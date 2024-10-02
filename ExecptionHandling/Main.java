package com.prachi.ExecptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            int c = a/b;
//            divide(a,b);
            throw new CustomException("Wrong name");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always execute");
        }
    }

    static  int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("b is zero");
        }
        return a/b;
    }
}
