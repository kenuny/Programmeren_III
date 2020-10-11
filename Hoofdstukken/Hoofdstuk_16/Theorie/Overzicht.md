# H16: Generic Collections

> Niet kennen enkel opfrissen bestaande methodes en klassen

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

##### I. HashMap



##### II. TreeMap



<br>