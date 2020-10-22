# H16: Generic Collections

>  Niet kennen enkel opfrissen van  bestaande methodes en klassen.

## Inleiding

***Inleiding:***

- In het collection framework zitten de meest voorkomende datastructuren <u>gestandaardiseerd en efficiënt</u> geïmplementeerd. Wat zorgt voor **herbruikbare** code.

***Wat is een collection?***

- Een *collection* is een <u>datastructuur</u> of in andere woorden -een object- dat <u>referenties naar andere objecten</u> bijhoudt. De objecten hebben een <u>*is een*</u> relatie met de collection.

***Wat is een collection framework?***

- Een *collection framework* is een raamwerk (= uniforme architectuur) voor het <u>weergeven</u> en <u>manipuleren</u> van <u>verschillende soorten collections</u>, waardoor collections onafhankelijk van hun implementatie kunnen worden gemanipuleerd. [Collection Framework Hierarchy](https://github.com/DeSmetElias/Programmeren_III/blob/master/Hoofdstukken/Aanvullingen/Afbeeldingen/java-collection-framework-hierarchy.jpg).

***Verschil tussen klasse Arrays en Klasse Collections?***

- Bij de *klasse array* moet je eerst de array omzetten via `asList( )` om een  er vervolgens bewerkingen op uit te voeren. Bij *collections* kan je rechtstreeks op de collection bewerkingen uitvoeren.

***Verschil tussen interface Collection en Klasse Collections:***

- Interface `Collection <E>`
  - De interface `Collection <E>` bevat bulk operaties. Met andere woorden operaties die worden uitgevoerd op een hele collection.
  - Een operatie ofwel bewerking is het toevoegen of verwijderen van een object uit de collection (verzameling). Of om een object te vergelijken met andere objecten in de collection.
  - Bevat de interfaces `Set<E>` , `List<E>` en `Queue<E>`.
- Klasse `Collections`
  - De klasse `Collection` bevat statische methodes die de collections manipuleren. De bewerkingen worden op de hele collectie uitgevoerd. 
  - De klasse `Collection` erft deze statische methodes rechtstreeks van de klasse Object. 

<br>

## Klasse Arrays

De klasse Arrays bevat verschillende methoden voor het manipuleren van een array.

```java
// asList()
// Methode zet een array om in een statische lijst:
List<T> naamLijst = Arrays.asList(array);

// Methode rechtstreeks omzetten in een dynamische lijst:
List<T> naamLijst = new ArrayList<>(Arrays.asList(array));


// binarySearch()
// Zoekt in de volledige array of een element voortkomt.
// Positieve retour: element bestaat al en bevind zicht op retourwaarde
// Negatieve retour: element bestaat nog niet en moet zich op absolute waarde retour waarde bevinden.

int locatie = Arrays.binarySearch(array, {startInd, endInd,} key);


// copyOf() en copyOfRange()
// Kopieert de volledige array:
String[] arrayCopy = Arrays.copyOf(arrayInit, arrayInit.length);

// Kopieert een deel van de initiele array:
String[] arrayCopy = Arrays.copyOfRange(arrayInit, start, end);


// equals()
// Retourneert true indien beide objecten gelijk zijn.
boolean b = array[0].equals(object);

// Retourneert indien beide arrays gelijk zijn.
boolean b = Arrays.equals(array1, array2);


// fill()
// Vult elke waarde van de array op met de meegegeven waarde.
// Indien er al een waarde inzit wordt deze overgeschreven.
int[] filledInArray = new int[10];
Arrays.fill(filledInArray, 1);


// sort()
// Sorteert array op natuurlijke wijze
Arrays.sort(array);

// Sorteert array reverse
Arrays.sort(array, Collections.reverseOrder());


// toString()
// Retourneert een String representatie van de array
System.out.println(Arrays.toString(array));
```

<br>

## Class Collection

**1. List algoritmen**

```java
// addAll
// binarySearch
// copy ----------------------------> Collections.copy( dest, source );
// enumeration
// fill ----------------------------> Collections.fill( list, key );
// indexOfSubList
// lastIndexOfSubList
// max
// min
// nCopies
// replaceAll
// reverse -------------------------> Collections.reverse( list );
// reverseOrder
// Rotate 
// shuffle -------------------------> Collections.shuffle( list );
// singletonList
// singletonMap
// sort ----------------------------> Collections.sort( list );
// swap
// synchronizedCollection
// unmodifiableCollection
```

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

<br>

## Collection framework

*<u>Overzicht van de collection methodes:</u>*

```java
// Element toevoegen
boolean add (Object o);

// Collection toevoegen
boolean addAll (Collection<?> c);

// Alle elementen verwijderen
void clear ();

// Controlleert of de Collection een element bevat
boolean contains (Object o); 

// Controlleert of Collection een de waarden ve andere Collection bevat
boolean containsAll (Collection<?> o);

// Controleert of een element gelijk is
boolean equals (Object o); 

// Nog updaten
int hashCode (); 

// Controleert of de Collection leeg is
boolean isEmpty (); 

// Itereert elk element (zonder indexing)
Iterator<E> iterator ();

// Verwijdert een element
boolean remove (Object o);

// Verwijdert elk object dat in de ene Collection zit uit de andere Collection
boolean removeAll (Collection<?> c);

// Verwijdert elk element dat niet in de Collection zit uit de andere Collection
boolean retainAll (Collection<?> c);

// Geeft de grootte van de Collection terug
int size ();

// Om een Collection om te zette naar een array.
Object[] toArray ();
```

<br>

#### 1. List

> Een List is een ongeordende Collection **met** mogelijkheid van duplicaten.  Er is
> directe toegang tot de elementen met behulp van een index, die een integer is.
> Concrete klassen moeten deze toegang zo efficiënt mogelijk realiseren.

*<u>Overzicht van de methodes:</u>*

```java
// Element toevoegen
void add ( [int index], E element );

// Collection toevoegen
boolean addAll ( Collection<?> c );

// Retourneert het element op de opgegeven index. (Vaak gebruikt met indexOf)
E get ( int index );

// Retourneert de index van het opgegeven object
int indexOf( Object o );

// Retourneert de index van het opgegeven object startend achteraan.
int lastIndexOf( Object o );

// Doorloopt de lijst (indexing: start en einde)
ListIterator<E> listIterator( [int index] );

// Verwijdert element op opgegeven index
E remove ( int index );

// Verandert de waarde op de opgegeven index naar het opgegeven element
E set (int index, E element );

// Maakt een sublist vanaf fronIndex tot toIndex (exclusief)
List<E> sublist ( int fromIndex, int toIndex);
```

##### I. ArrayList

*<u>Constructor ArrayList</u>*

```java
// Maakt een lege ArrayList aan met een initiele capaciteit van 10:
List<T> naamArrayList = new ArrayList<T>():

// Maakt een ArrayList aan en geeft een collection mee:
List<T> naamArrayList = new ArrayList<T>( Arrays.asList( array )):
```

##### II. LinkedList

*<u>Overzicht van de methodes:</u>*

```java
// Maakt een lege LinkedList aan
List<T> naamLinkedList = new LinkedList<T>();

// Maakt een LinkedList aan en vult deze met opgegeven Collection
List<T> naamLinkedList = new LinkedList<T>( Arrays.asList( array ) );

// Voegt een object vooraan toe
void addFirst( O object );

// Voegt een object achteraan toe
void addLast ( O object );

// Cloned lijst ->  LinkedList<String> llCopy = (LinkedList) ll.clone();
Object clone ();

// Retourneert het eerste object.
E getFirst ();

// Retourneert het laatste object.
E getLast ();

// Verwijdert het eerste object.
E removeFirst ();

// Verwijdert het laatste object.
E removeLast ();
```

<br>

#### 2. Set

##### I. HashSet

> Is een **ongeordende** set dat geen duplicaten bevat.

```java
// Constructor
Set<String> hs = new HashSet<>();

// Element toevoegen in set
hs.add("Elias");

// Element verwijderen uit set
hs.remove( key );

// Alle elementen verwijderen
hs.clear();
```



##### II. TreeSet

> Is een **geordende** set dat geen duplicaten bevat.

```java
// Constructor
Set<String> st = new TreeSet<>();

// Element toevoegen
st.add("Elias");

// Toont het eerste element
st.first();

// Toon het laatste element
st.last();

// Toon de values groter/kleiner dan de opgegeven waarde
st.higher( key );
st.lower( key );

// Verwijder element
st.remove( key );
st.pollFirst(); // Verwijdert eerste element
st.pollLast(); // Verwijdert laatste element
st.clear(); // Vewijdert elk element in de TreeSet

// Draait de set om
st.descendingSet();

// Iterator
st.iterator(); // Plaatst iterator op de set
st.descendingIterator; // Plaatst iterator op de set in descending volgorde

// Maakt een deelset
st.subSet( startIndex, endIndex );
```



<br>

#### 3. Queue

##### I. PriorityQueue

> Werkt volgens voorrangregels voorbeeld ziekenhuis. Wie er het ergst aan toe is wordt eerst geholpen. Taken met een hogere prioriteit krijgen voorrang.

```java
// Constructor
Queue<Double> prioQueue = new PriorityQueue<>();

// Element toevoegen
prioQueue.offer("Elias");
prioQueue.add("Elias");

// Element verwijderen
prioQueue.poll(); // Bovenste element verwijderen (hoogste prioriteit)
prioQueue.remove ( Object o); // element verwijderen (onafhankelijk van locatie)

// Bovenste element tonen
prioQueue.peek(); // Is het element met hoogste prioriteit

// | 3 | 4 | 5 | -> Desondaks 5 het laatst is toegevoegd heeft het de hoogste 
// prioriteit (grootste getal) en wordt dat het "bovenste" element.
```



##### II. ArrayDeque

> Werkt volgens het LIFO-principe (= upgrade van de klassieke stack)

```java
// Constructor
Deque<T> name = new ArrayDeque;

// element toevoegen (6 verschillende manieren)
name.add("Elias");
name.addFirst("Elias");
name.addLast("Elias");
name.offer("Elias");
name.offerFirst("Elias");
name.offerLast("Elias");

// Toegang verkrijgen tot een element
name.getFirst();
name.getLast();
name.peek();
name.peekFirst();
name.peekLast();

// Verwijderen van elementen
name.pop();
name.poll();
name.pollFirst();
name.pollLast(); // niet de bedoeling

// Verwijderen van volledige ArrayDeque
name.clear();  
```





## Map

> Een map associeert **keys met values**. Elke key in moet <u>uniek</u> zijn, de value kan een duplicaat zijn

##### I. HashMap

> Een HashMap\<K, V> is **ongeordend**.

```java
// Constructor
Map<String, Integer> hmap = new HashMap<>();

// elementen toevoegen 
hmap.put("Elias", 1999);

// Aantal elementen opvragen
hmap.size();

// Kijken of key bestaat
hmap.containsKey( key );

// Value van een key opvragen
hmap.get( key );

// Alle sleutels opvragen
hmap.keySet();

// Alle values opvragen
hmap.values();

// Alle KVP's opvragen
hmap.entrySet();
```



##### II. TreeMap

> Een TreeMap\<K, V> is **geordend**.

```java
// Idemdito aan Hashmap maar alles is geordend.
```



<br>
