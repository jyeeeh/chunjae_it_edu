package com.mystudy.thr;

public class InsufficientException extends Exception{
        public InsufficientException(){

        }

        public InsufficientException(String message){
            super(message);
        }
}
