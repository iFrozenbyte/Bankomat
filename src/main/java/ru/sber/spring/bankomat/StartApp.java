package ru.sber.spring.bankomat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sber.spring.bankomat.implementations.Terminal;

public class StartApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("MyAppContext.xml");
        Terminal terminalOne = (Terminal) context.getBean("getNewTerminal");
        System.out.println(terminalOne.getNewTerminal());
        //Terminal terminal = new Terminal(Locations.EUROPE, 1500, "sber bankomat", ColorTerminal.GREEN, new ScreenTerminal("Sharp", 17));
        //System.out.println(terminal);
    }
}