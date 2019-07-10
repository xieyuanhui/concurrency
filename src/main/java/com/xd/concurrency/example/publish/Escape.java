package com.xd.concurrency.example.publish;

import com.xd.concurrency.annoations.NotRecommend;
import com.xd.concurrency.annoations.NotThreadSafe;

@NotThreadSafe
@NotRecommend
public class Escape {

    private int thisCabBeEscape = 0;

    public Escape() {
        new InnerClass();
    }

    private class InnerClass {
        public  InnerClass() {
            System.out.println(Escape.this.thisCabBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
