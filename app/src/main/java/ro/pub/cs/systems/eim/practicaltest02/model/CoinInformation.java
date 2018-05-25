package ro.pub.cs.systems.eim.practicaltest02.model;

public class CoinInformation {
    String time;
    String usd;
    String eur;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsd() {
        return usd;
    }

    public CoinInformation(String time, String usd, String eur) {
        this.time = time;
        this.usd = usd;
        this.eur = eur;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getEur() {
        return eur;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }
}
