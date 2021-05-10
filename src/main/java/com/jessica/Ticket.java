package com.jessica;

public class Ticket {
    int origin;
    int destination;
    int prices;

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public int getOrigin() {
        return origin;
    }

    public int getDestination() {
        return destination;
    }

    public int getPrices() {
        return prices;
    }

    public Ticket() {
    }

    public Ticket(int origin, int destination, int prices) {
        this.origin = origin;
        this.destination = destination;
        this.prices = prices;
    }
}
