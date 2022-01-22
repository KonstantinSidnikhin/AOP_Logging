package com.sidnikhin.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary=context.getBean("uniLibraryBean",UniLibrary.class);
        Library library=context.getBean("libraryBean",Library.class);
        uniLibrary.getMagazin();
        uniLibrary.returnMagazin();
        library.getBook();
        context.close();
    }


}
