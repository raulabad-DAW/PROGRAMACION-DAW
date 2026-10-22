# RESPOSTES

**5. Observa aquests dos fragments que guarden exactament la mateixa informació sobre tasques quotidianes:**

Opció A (XML):
``` xml
<tasques>
<tasca estat="completada">
<descripcio>Posar aigua a bullir</descripcio>
</tasca>
<tasca estat="pendent">
<descripcio>Coure els fideus 3 minuts</descripcio>
</tasca>
</tasques>
```
Opció B (Markdown):
- [x] Posar aigua a bullir
- [ ] Coure els fideus 3 minuts

**a) Quina de les dues opcions és més ràpida d'escriure i més fàcil de llegir per a un humà quan s'obre el fitxer en un editor de text pla sense cap visor?**

L'opció més ràpida i fàcil de llegir per a un humà és clarament la de Markdown, ja que és més intuïtiva i més fàcil d'entendre el que es vol expressar a les llistes, perquè no cal obrir ni tancar etiquetes ni escriure atributs.

**b) Si l'Opció B és tan simple, per quina raó un sistema informàtic o una base de dades preferiria rebria/processar la informació en format XML (Opció A) quan s'envien dades entre servidors?**

Un sistema informàtic prefereix XML perquè té una estructura definida i estricta que permet que la màquina l'entengui directament; a més, cada dada té un significat explícit que mostra una estructura jeràrquica, fent que tot sigui previsible i verificable. En canvi, Markdown simplement és text pla que pot ser interpretat de manera diferent.

**6. Per què creus que Markdown és l'estàndard dels README.md a GitHub?**

Markdown és l’estàndard dels README.md a GitHub perquè és text pla que es pot escriure en qualsevol editor, és molt simple d’aprendre i GitHub el renderitza automàticament a la portada del repositori, mostrant títols, enllaços, taules i blocs de codi amb ressaltat de sintaxi sense fer res més.

**7. Imagina que estàs buscant una llibreria de codi a GitHub per al teu projecte. Quins beneficis té per a tu com a desenvolupador/a trobar la documentació en un fitxer README.md ben estructurat directament a la portada del repositori en lloc d'un fitxer adjunt en PDF o un document XML?**

Trobar la documentació en un README.md em permet accedir-hi immediatament, sense descarregar ni obrir cap altre programa. A més, com que el README és dins del repositori, permet que evolucioni amb el codi segons el criteri del programador. En canvi, un PDF pot quedar obsolet, o en el cas d'un XML, resulta incòmode de llegir, sense possibilitat de copiar directament els blocs de codi ni de col·laborar entre els participants del projecte.

**8. Raona quin format (XML o Markdown) utilitzaries en cadascun d'aquests dos casos reals de DAM/DAW:**

*Cas 1: Vols escriure els apunts d'un mòdul o la guia d'instal·lació del teu projecte perquè la llegeixin els teus companys de classe.*

Utilitzaria Markdown perquè és més còmode per a la lectura i la col·laboració entre els participants mitjançant GitHub, permetent una actualització constant.

*Cas 2: Vols crear un fitxer de configuració on una aplicació hagi de llegir les dades dels usuaris de forma estructurada.*

Utilitzaria XML, perquè el lector és un programa que necessita una estructura definida i sense ambigüitats, i XML permet definir exactament quines dades hi ha amb etiquetes, atributs, cosa que Markdown no pot fer. 
