package model;

public class PobierzPytanieIOdpowiedzi{
    private int idPytanie;
    private int idOdpowiedzi;

    public int getIdPytanie() {
        return idPytanie;
    }
    public void setIdPytanie(int idPytanie) {
        this.idPytanie = idPytanie;
    }

    public int getIdOdpowiedzi() {
        return idOdpowiedzi;
    }
    public void setIdOdpowiedzi(int idOdpowiedzi) {
        this.idOdpowiedzi = idOdpowiedzi;
    }

    public PobierzPytanieIOdpowiedzi() {}
    public PobierzPytanieIOdpowiedzi(int idPytanie, int idOdpowiedzi) {
        this.idOdpowiedzi = idOdpowiedzi;
        this.idPytanie = idPytanie;
    }
}


