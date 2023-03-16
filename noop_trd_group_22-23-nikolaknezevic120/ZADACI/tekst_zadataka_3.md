# TREĆA GRUPA ZADATAKA 
---

<div style="text-align:justify">


## ZADATAK 3-1 ![simple](https://img.shields.io/badge/complexity-**-green):

U problemu koji je pred vama pretpostavljamo da imamo klijenta koji radi s objektima sa sučeljem koje definira operacije nad nekom sekvencijalnom strukurom podataka. Sučelje je poznato:
  
  
```java 
  
 interface SeqDataStructureOperations<E>{
    /**
     * delete all elements from data structure
     */
    void deleteAllElements();

    /**
     * Test if an element is in data structure.
     * Returns true if is in, and contrary false
     * @param element - some good define element
     * @return true or false
     */
    boolean containElement(E element);


    /**
     * Check if data structure is empty.
     * @return true if it is empty
     */
    boolean structureIsEmpty();

    /**
     * Gets element from defined index position.
     * @param position
     * @return element
     */
    E getElementFromPosition(int position);

    /**
     * Provides number of elements in the structure.
     * @return number of elements
     */
    int sizeOfStructure();

    /**
     * Removes an element from defined position.
     * @param position - index position
     * @return E - element from defined index position
     */
    E removeFromPosition(int position);
}


```
  
Klijent (`OperationCLS`) delegira očekivanoj sekvencijalnoj strukturi sljedeće operacije:
  
  - `performClearAllOperation()`
  - `elementInStructure(E element)`
  - `getElementFromPosition(int indxPos)`
  - `getSize()`
  - `removeElement(int indxPos)`
  
Napravite očekivanu klasu `ArrayListLikeSequentalDataStructure` koja implementira promatrano sučelje, a kao strukturu podatka ima `ArrayList` zadanu kao kompozicijski element. Lako zaključujete da trebate promotriti JAVA API za `ArrayList` kako biste implementirali ovu klasu kako treba.  
  
U jednom trenutku javlja se potreba da klijent radi sa strukturom podataka koja ne slijedi zadano sučelje, jer je struktura u vidu niza bilo kojih dobro definiranih elemenata `E` &rarr; `E[]`. Riješite problem primjenom pripadnog predloška koji će omogućiti klijentu da radi sa strukturama podataka `E[]` bez potrebe da se bilo što mijenja u njegovom kodu. moguća logika testiranja rješenja:
  
```
  1. Kreirajte niz cijelih brojeva
  2. Kreirajte ArrayList iz tog niza
  3. Kreirajte očekivanu klasu za klijenta 
  4. Klijentu dodijelite tu strukturu podataka i testirajte sve metode
  5. Klijentu dodijelite prilagođenu strukturu koja omata niz (dakle sada nemate listu nego niz)
  6. Provedite testiranje svih metoda s ovom strukturom podataka
```
  
  Mogući konzolni izlaz:
  
  ```
Element from first position: 0
Now size is: 8
Contains element 311: false
Before removal: 
[-10, 0, 23, 230, -44, 40, 76, 1000]
Removing element from position 4  -> element is: -44
[-10, 0, 23, 230, 40, 76, 1000]
Get, but not remove element from 0 position -> element: -10
After getting info of zero index element: 
[-10, 0, 23, 230, 40, 76, 1000]

Calling clear all operation....
Deleting all elements from data structure...
[]
  
////////////////////////////////////////////////////////////////////////////////////////
  
Element from first position: 0
Now size is: 8
Contains element 311: false
Before removal: 
[-10, 0, 23, 230, -44, 40, 76, 1000]
Removing element from position 4  -> element is: -44
[-10, 0, 23, 230, null, 40, 76, 1000]
Get, but not remove element from 0 position -> element: -10
After getting info of zero index element: 
[-10, 0, 23, 230, null, 40, 76, 1000]

Calling clear all operation....
Deleting all elements...
Before del operation: 
[-10, 0, 23, 230, null, 40, 76, 1000]
After del operation: 
[null, null, null, null, null, null, null, null]
  
  ```

 ## ZADATAK 3-2 ![simple](https://img.shields.io/badge/complexity-**-green):
 
Ovaj zadatak obrađuje problematiku dinamičkog dodavanja željenog ponašanja objektima neke dobro definirane klase koja se prema potrebi može koristiti u izvornom obliku gdje se to traži.  Kreirajte aplikaciju koja neku tekstualnu datoteku može zapisati u izvornom obliku, potom je može spremiti komprimiranu ili enkriptiranu, a naravno moguća je i kombinacija da je prvo kodiramo pa komprimiramo. Zbog jednostavnosti osigurajte rad samo s tekstualnim datotekama. Dodatni uvjet je da izvor teksta koji predstavlja polazni sadržaj datoteke može biti dobiven iz bilo koje postojeće `.txt` datoteke ili dohvaćanjem cijelog sadržaja neke **web stranice** poznavajući isprava Url te stranice. Očekuje se da je moguće i pročitati zapisani sadržaj. Primjerice mogući tok zapisa i čitanja:
  
  `tekst from URL` &Rarr; `content for txt file` &Rarr; `encryption` &Rarr; `compress` &Rarr; `write in file with defined path`
  
  `read from defined path` &Rarr; `decompress` &Rarr; `decrypt` &Rarr; `show content in console`
  
  
  Polazno sučelje je `DataSource` koje je zadano:
  
  ```java
  interface  DataSource {

    void writeData(String data, File file);
    String readData(File file);
}
  ```
 Drugo sučelje koje vam je zadano je `DataProvider`:
  
  ```java
  public interface DataProvider {

    String provideDataFromSource(String source);
}
  ```
  
Komprimiranje i kodiranje ostvarujete preko apstraktne klase koja omata bilo koji `DataSource`. 
  
  > **SAVJET:**  razmislite što je write kod kriptiranja, a što read; isto tako i kod kodiranja

 Za komprimiranje pogledajte API od `Deflater`, a konačno komprimiranje je vezano uz ptimjenu `Base64.getEncoder()`. Za dekomprimiranje pogledajte API od `Inflater`. Uz kodiranje i dekordiranje pogledajte API klase `Base64`. 
  
  > **VAŽNO:** U svakom slučaju očeuje se da se String zapisuje u datoteku, neovisno radi li se o mogućim omatajućim kombinacijama ili čistoj txt datoteci.
  
Moguća logika testiranja rešnja:
  
  ```
  1. Kreirajte jedan DataProvider -> npr. URL
  2. Dohvaćeni sadržaj kodirajte, pa komprimiranog zapišite u željenu datoteku (uvijek će biti neki txt -> npr. compressEncryptDataFile.txt
  3. Nakon uspješnog zapisa počitajte sadržaj te datoteke i prikažite u konzoli
  ```
  
Rezultat vam je lako kontrolirati jer pročitani sadržaj more odgovarati dohvaćenom sadržaju s poznatg URL-a. Isto tako kontrola kompresije je jednostavna jer datoteka koja je direktno zapisana bez kompresije zauzima više memorijskog prostora od istog komprimirnog sadržaja. Ispravnot kodiranja se još lakše provjeri &rarr; dovoljno je otvoriti txt datoteku s kodiranim sadržajem da se uvjerite kako postupak funkcionira. 

## ZADATAK 3-3 ![simple](https://img.shields.io/badge/complexity-**-green):

Vaš zadatak je kreirati aplikaciju kojom možete rezervirati bilo koji tip transporta u logističkom lancu koji za početak uključuje:
  
  - avio transport
  - transport brodovima
  - transport kamionima
  - transport kombijima 
  
Pojednostavljeno ćemo smatrati kako je svaki tip transpora neograničeno raspoloživ na način da se izborom pojedniačnog tipa uvijek generira jedan primjerak odabranog transporta. Aplikacija ne zna kako se taj postupak kreiranja provodi i potpuno je agnostična za svaki dozvoljeni izbor transporta. Štoviše, ako se uvede novi tip transporta tada se u klijentskom dijelu aplikacije neće trebati ništa mijenjati. 
  
 Mogući konzolni izlaz za slučaj kada je izbaran transport brodom je: 
  
 ```
Created: BoatTransportation@6acbcfc0
BoatTransportation performs transport!
 ```
  
  
> **NAPOMENA** Radni tok **commita** treba slijediti uputu iz polazne **Readme** datoteke ovog repozitorija
  

  
  </div>
 
