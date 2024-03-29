package Zad4;

// Stosując wyrażenia lambda należy wyświetlić zawartość listy obiektów dla klasy
//Samochod znajdującej się w liście 5. Stosując kolekcje należy wyodrębnić pole
//„pojemność silnika” i wartości posortować rosnąco.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Sort {
    public static void main(String[] args) {
        List<Samochod> listaSamochodow = new ArrayList<>();
        listaSamochodow.add(new Samochod("Marka1", "Model1", 1.6, Samochod.bodyType.SEDAN, Samochod.engineType.GAS, 2010, LocalDate.of(2010, 1, 1), 20000));
        listaSamochodow.add(new Samochod("Marka2", "Model2", 2.0, Samochod.bodyType.SUV, Samochod.engineType.DIESEL, 2015, LocalDate.of(2015, 5, 20), 30000));
        listaSamochodow.add(new Samochod("Marka3", "Model3", 1.2, Samochod.bodyType.HATCHBACK, Samochod.engineType.ELECTRIC, 2020, LocalDate.of(2020, 8, 15), 25000));

        // show contents of the list
        listaSamochodow.forEach(samochod -> System.out.println(samochod));

        // sorting by engine size and printing the list
        System.out.println("\nLista samochodów posortowana wg pojemności silnika:");
        listaSamochodow.stream()
                .sorted(Comparator.comparingDouble(Samochod::getEngineSize))
                .forEach(samochod -> System.out.println(STR."\{samochod.getEngineSize()} - \{samochod}"));
    }
}
