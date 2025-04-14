README:

https://github.com/Imm-Marco/Prova.git

Questo metodo permette di avere una piccola agenda interattiva nel quale poter inserire 10 appuntamenti.
Per ogni appuntamento può anche essere inserita una data.

Ho creato due package - model, view.

MODEL:
In model ho inserito creato il metodo ToDo, che descrive ogni todo come composto da due stringhe: appuntamento e data.

VIEW:
In view ho creato il main.
Main -
Il programma è strutturato con un do while.
La condizione del while è che l'input utente sia diverso da 'q' o '4'.

All'interno del main ho creato un metodo stampa menù per indicare all'utente le sue opzioni.

Dopo aver aperto il main ho creato un Array di lunghezza 10 chiamandolo arrayTODO.

Ho aperto uno scanner permettendo all'utente di selezionare la funzione dal menù.
A questo punto ho aperto uno switch per ogni opzione presente in menù.

CASE 1:
Permette all'utente di selezionare uno slot (posizione nell'array) e inserire appuntamento e data.

Ho creato un if per stabilire se l'input dell'utente fosse corretto (ovvero tra 1 e 10) e ho modificato l'input utente sottraendogli un 1 in modo tale da permettere corrispondenza tra inserimento del numero positivo da parte dell'utente e l'ordine zero based dell'array.

Una volta stabilita la correttezza dello slot, ho chiesto all'utente appuntamento e data. 
Ho richiamato il metodo ToDO e con un for ho inserito i dati all'interno dell'array.
Infine ho stampato l'array con un for each.

CASE 2: 
Permette all'utente di vuotare uno slot.

Il metodo è simile al CASE 1, con la differenza che quando viene richiamato il metodo ToDo appuntamento e data sono dichiarati come fixed values composti da due stringhe "Vuoto".

CASE 3:
Permette all'utente di stampare la lista dei ToDo.

Ho utilizzato un for each per stampare l'array.

CASE 4: 
Permette all'utente di uscire dal programma

Il sistema da un messaggio di uscita e rende true le condizioni stabilite dal while chiudendo il programma.

@ 2025 Marco
