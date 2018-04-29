package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"6730323923", "John", "Smith"},
            {"3473489823", "Ivone", "Novak"},
            {"3983402302", "Jessie", "Pinkman"},
            {"5923981230", "Walter", "White"},
            {"8823032923", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + " " + workers[n][1] + " "
                + workers[n][2] + " " + salaries[n];
    }
    public String[][] getWorkers(){
        return workers;
    }
    public double[] getSalaries(){
        return salaries;
    }
}
