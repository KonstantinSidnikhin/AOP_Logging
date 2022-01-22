package com.sidnikhin.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
//    @Pointcut("execution (public void *(..))")
//    public void allGetMethods(){}

//    @Before("allGetMethods()")
//    public void beforeGetBook(){
//        System.out.println("someone is gonna take a book!");
//    }
//    @Pointcut("execution(* com.sidnikhin.spring.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void com.sidnikhin.spring.aop.UniLibrary.returnMagazin())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsFromUniLibraryExceptReturnMagazine(){}
//    @Pointcut("execution(public void com.sidnikhin.spring.aop.Library.getBook())")
//    public void getBookFromLibrary(){}






    @Pointcut("execution(public void com.sidnikhin.spring.aop.ChurchLibrary.*Bible())")
    public void bibleActions(){}

//    @Before("allMethodsFromUniLibraryExceptReturnMagazine()")
//    public void loggingOfLibrary(){
//        System.out.println("Log:all but return Magazine in Unilibrary");
//    }
//    @Before("getBookFromLibrary()")
//    public void loggingOfGetBookFromLibrary(){
//        System.out.println("log : getBook from Library");
//    }
    @Before("bibleActions()")
        public void churchLibLogging(){
            System.out.println("log: something is happening with the bible!");
        }


}
