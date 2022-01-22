package com.sidnikhin.spring.aop;

import org.springframework.stereotype.Component;

@Component("churchLibraryBean")
public class ChurchLibrary {
    public void getBible(){
        System.out.println("someone is getting a Bible!");
    }
    public void returnBible(){
        System.out.println("someone is returning a Bible!");
    }
    public void getMagazine(){
        System.out.println("someone is getting a Church Magazine!");
    }
    public void returnMagazine(){
        System.out.println("someone is returning a church Magazine!");
    }

}
