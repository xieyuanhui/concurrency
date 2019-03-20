package com.xd.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Stack;

@Controller
@Slf4j
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int l = a.length;
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(3);
        stack.pop();
        stack.empty();
        System.out.println(stack);
    }
}
