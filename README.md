# Emiles virtuella fordonsuthyrning

---

Detta är ett konsolbaserat fordonsuthyrningssystem byggt i Java. 
I programmet kan användaren hyra 3 olika sorters fordon, bilar, motorcyklar eller traktor. De kan välja att se vilka fordon de har hyrt och vad dagshyran för dessa kommer bli. De kan även välja att lämna tillbaka fordon och avsluta programmet. 

Programmet är siktar på att vara interaktiv och användarvänlig och är programmerad på ett objektorienterat sätt med olika klasser som hanterar olika delar av koden.

---

## Funktioner
**Hyra fordon:**
- Användare kan välja mellan ett antal tillgängliga fordon: bilar, motorcyklar och en traktor.

**Returnera fordon:**
- Användare kan returnera sina hyrda fordon.

**Visa hyresavtal:**
- Användare kan visa ett detaljerat hyresavtal med de hyrda fordonen och deras respektive hyreskostnader.

**Uppdatering i realtid:**
- Tillgängliga fordon uppdateras i realtid när användare hyr och returnerar fordon.

**Dynamiskt användargränssnitt:**
- Programmet presenterar tillgängliga alternativ på ett tydligt och dynamiskt sätt, vilket gör det lätt för användaren att navigera genom hyresprocessen.

### Krav
- Java 8 eller senare

---

## Programflöde
Användaren interagerar med programmet genom flera menyer:

**1. Huvudmeny:**
- Välj att hyra ett fordon, returnera ett fordon, visa hyresavtalet eller avsluta programmet.

**2. Fordonshyresmeny:**
- Välj ett fordonsalternativ (bil, motorcykel, traktor) och hyr ett fordon från det tillgängliga lagret.

**3. Returnera fordon:**
- Välj ett fordon att returnera från listan över hyrda fordon.

**4. Hyresavtal:**
- Visa detaljer om de hyrda fordonen och deras hyreskostnader.

**5. Avsluta:**
- Programmet beräknar den totala kostnaden och stänger av.

---

### Hur använder man programmet?
- Efter att programmet startat kommer du att presenteras med en meny.
- Följ instruktionerna och välj ett alternativ genom att skriva in siffran som motsvarar den åtgärd du vill utföra.
- För att hyra eller returnera ett fordon kommer programmet att uppdateras i realtid.
- För att avsluta, välj helt enkelt exit-alternativet och ditt hyresavtal kommer att skrivas ut.


### Exempel på användning
**Starta programmet**
1. Välj "1" för att välja ett fordon, välj ett fordon att hyra, t.ex "1" för bil
2. Välj "2" för att se hyrda fordon och lämna tillbaka dem
3. Välj "3" för att se en sammanställning av vilka fordon som är hyrda och den totala kostnaden
4. Avsluta genom att välja "4"

---

## Hur fungerar programmet?

### 1. Starta programmet
För att starta programmet kör ``Main``

### 2. Huvudmenyn
När programmet startar kommer användaren till huvudmenyn:
```
Hej, välkommen till Emiles fordonsbokning!
Var vänlig välj ett av alternativen

1. Välj mellan fordonsalternativen!
2. Lämna tillbaka fordon
3. Hyresavtal
4. Avsluta med kvitto
```
### 3. Hyra ett fordon
Välj **Alternativ 1** för att visa tillgängliga fordon att hyra. Programmet kommer att visa alla tillgängliga fordon samt dess lagersaldo.
```
Du kan välja mellan dessa fordon
1. Bil, lagersaldo: 4
2. Motorcykel, lagersaldo: 2
3. Traktor, lagersaldo: 1
4. Tillbaka
```
Användaren kan sedan välja vilket sorts fordon de vill hyra, t.ex **1** för bil. De får då upp vilka bilar som finns tillgängliga och vad dagshyran är. Efter att användaren valt ett fordon tas det bort från det tillgängliga lagret och listan uppdateras.

### 4. Lämna tillbaka ett fordon
Användaren kan välja **Alternativ 2** i huvudmenyn för att lämna tillbaka ett fordon. Programmet visar då upp vilka fordon som användaren hyr och användaren kan då välja vilket fordon de vill returna.
```
Vilken av dina fordon vill du lämna tillbaka?
1. Bil Volvo V70 - RegNr: ABC123, DagsHyra: 600 SEK
2. Motorcykel Suzuki GSX-8R - RegNr: SUP111, DagsHyra: 400 SEK
3. Tillbaka
```
Trycker användaren **2** kommer det första alternativet att tas från kundens lager och läggas tillbaka som hyralternativ.

### 5. Visa hyresavtal
Genom att välja **Alternativ 3** i huvudmenyn kan användaren se en sammanfattning över alla fordon som användaren har hyrt. Användaren kan se vad det är för sorts fordon, fordonsmodell, registeringsnummer och hyreskostnaden.
```
Ditt hyresavtal:

Hyrda bilar:
Bil Volvo V70 - RegNr: ABC123, DagsHyra: 600 SEK

Hyrda motorcyklar:
Motorcykel Suzuki GSX-8R - RegNr: SUP111, DagsHyra: 400 SEK

Hyrda traktorer:
Inga traktorer hyrda.

Total kostnad: 1000 SEK
Tack, hyr gärna fler fordon!
```
### 6. Avsluta programmet
Med **Alternativ 4** i huvudmenyn så avslutas programmet samt att den totala kostnaden skrivs ut.

---

### Bidra
Vill du bidra till det här projektet är det bara att göra en pull requests.






