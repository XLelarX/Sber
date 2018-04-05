package com.company;

class Employee implements Comparable {
    private String name;
    private String surname;
    private Rank status;
    private int profit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Rank getStatus() {
        return status;
    }

    public void setStatus(Rank status) {
        this.status = status;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Employee) {
            Employee second = (Employee) o;
            if (this.surname.compareToIgnoreCase(second.getSurname()) == 0) {
                return this.profit - second.getProfit();
            } else {
                return this.surname.compareToIgnoreCase(second.getSurname());
            }
        }
        return -1;
    }

}
