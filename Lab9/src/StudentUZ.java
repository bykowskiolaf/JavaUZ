// a class that extends Student and adds a new field wydzial
public class StudentUZ extends Student {
    private String wydzial;

    public void ustawWydzial(String wydzial) {
        this.wydzial = wydzial;
    }

    public String getWydzial() {
        return wydzial;
    }
}
