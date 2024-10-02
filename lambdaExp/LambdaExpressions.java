package com.prachi.lambdaExp;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<6; i++){
            arr.add(i+1);
        }

        // arr.forEach((item) -> System.out.println(item+2));

        //using Consumer interface
//        Consumer<Integer> list = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        };

        //using lambda expression
        Consumer<Integer> list = (i) -> System.out.println(i+2);
        arr.forEach(list);

        MathOperation sum = (a,b) -> a+b;
        MathOperation mul = (a,b) -> a*b;
        MathOperation sub = (a,b) -> a-b;

        LambdaExpressions obj = new LambdaExpressions();
        System.out.println(obj.operate(7,9,mul));
        System.out.println(obj.operate(7,9,sum));
        System.out.println(obj.operate(67,9,sub));

    }

    private int operate(int a, int b, MathOperation op){
        return op.operation(a,b);
    }
}

interface MathOperation{
    int operation(int a, int b);
}
