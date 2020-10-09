# H16: Generic Collections



#### 1. Inleiding

- De meeste voorkomende datastructuren zijn <u>gestandaardiseerd en efficiënt</u> geïmplementeerd. Wat zorgt voor **herbruikbare** code.

<br>

#### 2. Overzicht Collection Framework

*Wat is een collection?*

- Een *collection* is een <u>datastructuur</u> of in andere woorden -een object- dat <u>referenties naar andere objecten</u> bijhoudt. De objecten hebben een <u>*is een*</u> relatie met de collection.

*Wat is een collection framework?*

- Een collection framework is een raamwerk (= uniforme architectuur) voor het <u>weergeven</u> en <u>manipuleren</u> van <u>verschillende soorten collections</u>, waardoor collections onafhankelijk van hun implementatie kunnen worden gemanipuleerd. [Collection Framework Hierarchy](https://github.com/DeSmetElias/Programmeren_III/blob/master/Hoofdstukken/Hoofdstuk_16/Theorie/Afbeeldingen/java-collection-framework-hierarchy.jpg).

*Verschil tussen klasse Arrays en Klasse Collections?*

- Bij Klasse array moet je eerst de array omzetten via `asList( )` om een  er vervolgens bewerkingen op uit te voeren. Bij collections kan je rechtstreeks op de collection bewerkingen uitvoeren.

<br>

#### 3. Klasse Array

- Zie OOP2 H7 Deel 2

<br>

#### 4. Interface Collection & Klasse Collection

- Interface `Collection <E>`
  - De interface `Collection <E>` bevat bulk operaties. Met andere woorden operaties die worden uitgevoerd op een hele collection.
  - Een operatie ofwel bewerking is het toevoegen of verwijderen van een object uit de collection (verzameling). Of om een object te vergelijken met andere objecten in de collection.
- Klasse `Collections`
  - De klasse `Collection` bevat statische methodes die de collections manipuleren. De bewerkingen worden op de hele collectie uitgevoerd. 
  - De klasse `Collection` erft deze statische methodes rechtstreeks van de klasse Object. 

<br>

#### 5. List interface

- `List` erft rechtstreeks van de interface `Collection`.
- `List` implementeer de klassen `ArrayList<E>`, `LinkedList<E>` en `Vector<E>`.

- <u>Geordende collection</u> waarbij <u>duplicaten toegelaten</u> zijn.
- Index start op <u>0</u>.