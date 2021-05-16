package ru.sber.spring.bankomat.implementations;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.sber.spring.bankomat.enums.ColorTerminal;
import ru.sber.spring.bankomat.enums.Locations;
import ru.sber.spring.bankomat.interfaces.Location;
import ru.sber.spring.bankomat.interfaces.Screen;

@Component
public class Terminal implements Location, Screen {
    private Locations location;
    private int balance;
    private String name;
    private ColorTerminal color;
    private ScreenTerminal screenTerminal;

    public Terminal() {
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Terminal getNewTerminal(){
        return new Terminal(Locations.EUROPE, 1500, "sber bankomat", ColorTerminal.GREEN, new ScreenTerminal("Sharp", 17));
    }

    public Terminal(Locations location, int balance, String name, ColorTerminal color, ScreenTerminal screenTerminal) {
        this.location = location;
        this.balance = balance;
        this.name = name;
        this.color = color;
        this.screenTerminal = screenTerminal;
    }

    @Override
    public Locations showLocation() {
        return location;
    }

    @Override
    public int showBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Terminal name: " + name + "\nLocation: " + showLocation() + "\nColor: " + color +
                "\nBalance: " + showBalance() + "\nScreen model: " + screenTerminal.getModel() +
                "\nDiagonal: " + screenTerminal.getDiagonal();
    }
}



