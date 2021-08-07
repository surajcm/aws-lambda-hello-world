package com.suraj.mylambda;

import com.amazonaws.services.lambda.runtime.Context;

public class LambdaApp {
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello World - " + input;
    }
}
