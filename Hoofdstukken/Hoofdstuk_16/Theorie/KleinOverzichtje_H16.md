# H16: Generic Collections



#### 1. Inleiding

- In het collection framework zitten de meest voorkomende datastructuren <u>gestandaardiseerd en efficiënt</u> geïmplementeerd. Wat zorgt voor **herbruikbare** code.

<br>

#### 2. Overzicht Collection Framework

*Wat is een collection?*

- Een *collection* is een <u>datastructuur</u> of in andere woorden -een object- dat <u>referenties naar andere objecten</u> bijhoudt. De objecten hebben een <u>*is een*</u> relatie met de collection.

*Wat is een collection framework?*

- Een *collection framework* is een raamwerk (= uniforme architectuur) voor het <u>weergeven</u> en <u>manipuleren</u> van <u>verschillende soorten collections</u>, waardoor collections onafhankelijk van hun implementatie kunnen worden gemanipuleerd. [Collection Framework Hierarchy](https://github.com/DeSmetElias/Programmeren_III/blob/master/Hoofdstukken/Hoofdstuk_16/Theorie/Afbeeldingen/java-collection-framework-hierarchy.jpg).

*Verschil tussen klasse Arrays en Klasse Collections?*

- Bij de *klasse array* moet je eerst de array omzetten via `asList( )` om een  er vervolgens bewerkingen op uit te voeren. Bij *collections* kan je rechtstreeks op de collection bewerkingen uitvoeren.

<br>

#### 3. Klasse Arrays

De klasse Arrays bevat verschillende methoden voor het manipuleren van een array.

- ***<u>asList()</u>***

  ```java
  // Methode zet een array om in een statische lijst:
  List<T> naamLijst = Arrays.asList(array);
  
  // Methode rechtstreeks omzetten in een dynamische lijst:
  List<T> naamLijst = new ArrayList<>(Arrays.asList(array));
  
  ```

  



- ***<u>binarySearch()</u>***

  ```java
  // Zoekt in de volledige array of een element voortkomt.
  // Positieve retour: element bestaat al en bevind zicht op retourwaarde
  // Negatieve retour: element bestaat nog niet en moet zich op absolute waarde retour waarde bevinden.
  
  int locatie = Arrays.binarySearch(array, {startInd, endInd,} key);
  ```



- ***<u>copyOf()</u>*** & ***<u>copyOfRange()</u>***

  ```java
  // Kopieert de volledige array:
  String[] arrayCopy = Arrays.copyOf(arrayInit, arrayInit.length);
  
  // Kopieert een deel van de initiele array:
  String[] arrayCopy = Arrays.copyOfRange(arrayInit, start, end);
  ```



- ***<u>equals()</u>***

  ```java
  // Retourneert true indien beide objecten gelijk zijn.
  boolean b = array[0].equals(object);
  
  // Retourneert indien beide arrays gelijk zijn.
  boolean b = Arrays.equals(array1, array2);
  ```



- ***<u>fill()</u>***

  ```java
  // Vult elke waarde van de array op met de meegegeven waarde.
  // Indien er al een waarde inzit wordt deze overgeschreven.
  int[] filledInArray = new int[10];
  Arrays.fill(filledInArray, 1);
  ```



- ***<u>sort()</u>***

  ```java
  // Sorteert array op natuurlijke wijze
  Arrays.sort(array);
  
  // Sorteert array reverse
  Arrays.sort(array, Collections.reverseOrder());
  ```

  

- ***<u>toString()</u>***

  ```java
  // Retourneert een String representatie van de array
  System.out.println(Arrays.toString(array));
  ```

<br>

#### 4. Interface Collection & Klasse Collection

- Interface `Collection <E>`
  - De interface `Collection <E>` bevat bulk operaties. Met andere woorden operaties die worden uitgevoerd op een hele collection.
  - Een operatie ofwel bewerking is het toevoegen of verwijderen van een object uit de collection (verzameling). Of om een object te vergelijken met andere objecten in de collection.
  - Bevat de interfaces `Set<E>` , `List<E>` en `Queue<E>`.
- Klasse `Collections`
  - De klasse `Collection` bevat statische methodes die de collections manipuleren. De bewerkingen worden op de hele collectie uitgevoerd. 
  - De klasse `Collection` erft deze statische methodes rechtstreeks van de klasse Object. 

<br>

#### 5. List interface

- `List` implementeer de klassen `ArrayList<E>`, `LinkedList<E>` en `Vector<E>`.



***1. ArrayList\<E>***

- Een ArrayList is een <u>dynamische array</u> m.a.w. een array waarvan de grootte kan wijzigen na declaratie. Een ArrayList implementeert <u>alle methodes van de interface List</u>. In een ArrayList kunnen <u>alle soorten types</u> geplaatst worden inclusief een null-object.

- *Wanneer gebruiken:* Bij vaak **zoeken** en **aanpassen** van elementen.

  

***<u>Constructor ArrayList()</u>*** 

```java
// Maakt een lege ArrayList aan met een initiele capaciteit van 10:
List<T> naamArrayList = new ArrayList<T>():

// Maakt een ArrayList aan en geeft een collection mee:
List<T> naamArrayList = new ArrayList<T>( Arrays.asList( array )):
```

<br>

***2. LinkedList\<E>***

- Maakt gebruik van nodes, implementeer alle methodes van de interface List en laat alle soorten types doe inclusief het null-object. Indexering gebeurt aan het begin en einde.

- *Wanneer gebruiken:* Bij vaak **creëren** en **verwijderen** van elementen.



***<u>Constructor LinkedList()</u>*** 

```java
// Maakt een lege LinkedList aan:
List<T> naamLinkedList = new LinkedList<T>():

// Maakt een ArrayList aan en geeft een collection mee:
List<T> naamLinkedList = new LinkedList<T>( Arrays.asList( array )):
```

<br>

##### List Implementaties

- Verschil tussen ***<u>add()</u>***  & ***<u>addAll()</u>*** 

  ```java
  // Voegt een element achteraan de Arraylist toe: 
  lijst.add( element );
  
  // Voegt een element toe op de opgegeven index:
  lijst.add( index, element);
  
  // Voegt een volledige collectie toe aan de lijst evt met indexering:
  lijst.add( [index,] collection );  
  ```



- ***<u>get()</u>*** & ***<u>indexOf</u>***

  ```java
  // Retourneert het element op de opgegeven index:
  lijst.get( index );
  
  // Retourneer de index van het opgegeven element indien het niet bestaat -1:
  lijst.indexOf( object );
  
  // Combinatie komt vaak voor
  lijst.get(lijst.indexOf( index ));
  ```



- ***<u>remove()</u>*** & ***<u>removeAll()</u>***

  ```java
  // Verwijderen van een element vs het verwijderen van een collectie
  lijst.remove( object );
  lijst.remove( collection );
  
  // Deel van een lijst verwijderen
  lijst.removeRange( from , to );
  ```



-  **<u>retainAll()</u>**

  ```java
  // Verwijdert alle element uit de lijst die ook in de andere lijst zitten:
  lijst1.retainAll( lijst2 ); 
  
  Lijst1 = 1, 2, 3
  Lijst2 = 2, 3, 4
  Lijst1.retainAll( Lijst2 ) == 1
  ```



- ***<u>subList()</u>*** & ***<u>clear()</u>***

  ```java
  // Retourneert een deellijst van de oorspronkelijke lijst
  List<T> naamLijst = lijst.subList( startIndex, totIndex );
  
  // Verwijdert inhoud vd lijst Maar de lijst an sich wordt niet verwijdert.
  lijst.clear();
  
  // Combinatie: Verwijdert elk element in de list opgegeven in de sublist.
  lijst.subList( startIndex, totIndex ).clear()
  ```

<br>

#### 6. Collection Framework

**1. List algoritmen**

```java
// sort: sorteert de collectie op natuurlijke wijze:
Collections.sort( list );

// sort: sorteert de collectie reverse (ingebouwde comparator):
Collections.sort( list, Collections.reverseOrder( ) );

// sort: sorteert de collectie reverse ( method reverse() ):
Collections.sort( list );
Collections.reverse( list ):

// binarySearch
Collections.binarySearch( list, object );

// reverse: draait om
Collections.reverse( list );

// shuffle: randomized volgorde
Collections.shuffle( list );

// fill: vervangt indien nodig overschijft elk element met opgegeven element:
Collections.fill( list, key );

// Copy
Collections.copy( destinationList, sourceList );
```

<br>

**2. Collection algoritmen**

```java
// min
Collections.min( list );

// max
Collections.max( list );

// addAll
Collections.addAll( listWhichAdded, listFromAdded );

// frequency: aantal keer een object voortkomt
Collections.frequency( list, key );

// disjoint: retourneert true indien beide collections niks gemeen hebben.
Collections.disjoint( lijst1 , lijst2);
```

