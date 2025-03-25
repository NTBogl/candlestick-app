package com.example.candlestick.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Candle {

    private String symbol;
    private double open;
    private double close;
    private double high;
    private double low;
    private long timestamp;

    public Candle() {
        // ОБЯЗАТЕЛЬНО: пустой конструктор нужен для Jackson
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("open")
    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    @JsonProperty("close")
    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    @JsonProperty("high")
    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @JsonProperty("low")
    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    @JsonProperty("timestamp")
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
