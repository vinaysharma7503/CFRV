package com.example.cfrv;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Car> cars;
    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<Car>();
        cars.add(new Car("Volkswagen","Polo","Abhishek","+919985462468"));
        cars.add(new Car("Mercedes","E200","Vinay Sharma","+919971536526"));
        cars.add(new Car("Nissan","Sunny","Mohit","+916452355224"));
    }
}
