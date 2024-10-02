package com.prachi.generics.comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int r, float m){
        this.rollNo = r;
        this.marks = m;
    }

    @Override
    public String toString() {
        return rollNo +
                "," + marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        //if diff === 0 both are equal
        //if diff < 1 o is bigger
        return diff;

        //or
//        return Integer.compare(this.marks, o.marks);
    }
}
