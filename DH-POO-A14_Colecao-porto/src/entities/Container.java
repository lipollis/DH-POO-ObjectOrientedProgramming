package entities;

public class Container implements Comparable<Container> {
    private int numID;
    private String paisOrigem;
    private boolean perigoso;

    public Container(int numID, String paisOrigem, boolean perigoso) {
        this.numID = numID;
        this.paisOrigem = paisOrigem;
        this.perigoso = perigoso;
    }

    public Container(int numID, boolean perigoso) {
        this.numID = numID;
        this.paisOrigem = "Desconhecido";
        this.perigoso = perigoso;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

    @Override
    public int compareTo(Container container) {
        if (this.numID == container.getNumID())
            return 0;
        else if (this.numID > container.getNumID())
            return 1;
        else
            return -1;
    }
}
