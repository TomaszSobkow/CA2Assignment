package com.exceptions;

public class MyException extends Exception{

    public MyException(String message){
        super(message);
        System.out.print( message+"\n");
    }




}
