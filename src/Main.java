public class Main {
    public static void main(String[] args) {
        // Skapa en klass Personnummer som lagrar ett svenskt personnummer XXXXXX-XXXX
        //   - Validera att det är korrekt i konstruktorn
        //   - Lägg till toString
        //   - Lägg till isMan och isKvinna
        // Exempel: 561231-4913

        Personnummer pNr = new Personnummer("561231-4913");
        System.out.println(pNr.isMan());
    }
}