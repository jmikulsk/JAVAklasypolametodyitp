package KlasyPolaMetody;

public class Vars {
    int i; // zadeklarowana zmienna egzemplarzal(albo pole klasy)
    static int j = 2; // zmienna klasowa(pole statyczne)

    public int change() {
        int k = 7;
        return i + (k + j);
    }

    public static void main(String[] args) {
        int i = 77;
        Vars v = new Vars();
        v.i =9;

        System.out.println("Wyświetlamy zmienną egzemplarza dla v:  "+ v.i);
        Vars vv = new Vars();
        vv.i=5;
        System.out.println("Wyśietlamy zmienna egzemplarza dla vv  "+ vv.i);
        System.out.println("WYświetlamy zmienną klasowa( statyczna) j : " +j);
        System.out.println("WYświetlamy zmienną lokalną:   " +i);


    }
    void show(){};

}
