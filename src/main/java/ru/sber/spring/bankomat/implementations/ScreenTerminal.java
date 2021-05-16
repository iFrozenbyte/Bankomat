package ru.sber.spring.bankomat.implementations;

public class ScreenTerminal{
    private String model;
    private int diagonal;

    public ScreenTerminal(String model, int diagonal) {
        this.model = model;
        this.diagonal = diagonal;
    }

    public String getModel() {
        return model;
    }

    public int getDiagonal() {
        return diagonal;
    }
}
