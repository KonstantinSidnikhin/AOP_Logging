package com.sidnikhin.spring.aop;

import org.springframework.stereotype.Component;

@Component ("uniLibraryBean")
public class UniLibrary {
    public void getBook(){
        System.out.println("taking a book from UniLibrary!");
    }
    public void returnBook(){
        System.out.println("returning a book to UniLibrary!");
    }
    public void getMagazin(){
        System.out.println("taking a Magazine from UniLibrary!");
    }
    public void returnMagazin(){
        System.out.println("returning a Magazine to UniLibrary!");
    }
}
