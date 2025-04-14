package view;

import java.util.Scanner;

import model.ToDo;
public class Main {
//----------------- STAMPA MENU -------------------------------------
public static void stampaMenu(){
		System.out.println("----MENU----");
		System.out.println("1. Inserisci nuovo ToDo");
		System.out.println("2. Elimina un ToDo");
		System.out.println("3. Stampa Lista ToDo");		
		System.out.println("4. Chiudi Programma");
		System.out.println("------------");	
	}	

//--------------------------------------- MAIN ----------------------------s
	public static void main(String[] args) {


ToDo [] arrayTODO = new ToDo [10]; //apro array

//-------------------- APRO SCANNER ------------------------
Scanner input = new Scanner(System.in);
char scelta;
do {
	stampaMenu();

scelta = input.next().toLowerCase().charAt(0);

//-------------- APRO SWITCH MENU -------------------------------------------------
switch (scelta) {
case '1': //inserisci un nuovo todo

		
	System.out.println("Hai 10 slot disponibili. Selezionare lo Slot inserendo un numero da 1 a 10.");
	{
	int x=input.nextInt(10)-1;
		
	if (x<=10) {
	System.out.println("Digitare nuovo ToDo.");
		String dafare= input.next();
	System.out.println("Ora digita la Data");
		String data= input.next();
	
	ToDo T = new ToDo (dafare, data);
	
	
	for(int i=0; i<arrayTODO.length; i++) {
		
		arrayTODO[x]=T;
	}
for (ToDo toDo : arrayTODO) {
	System.out.println(toDo);
}
System.out.println("");

	}else {
		System.out.println("Scelta non valida. Inserire un numero da 1 a 10.");
	}
	}
	
	break;
 
case '2': //elimina todo
System.out.println("Digitare lo Slot da Vuotare");
int x=input.nextInt()-1;
if (x<=10) {
ToDo T = new ToDo (" vuoto"," vuoto");
	
	for(int i=0; i<arrayTODO.length; i++) {
		
		arrayTODO[x]=T;
	}
for (ToDo toDo : arrayTODO) {
	System.out.println(toDo);
}

System.out.println("Lo slot è stato liberato");
}else {
	System.out.println("Scelta non valida. Inserire un numero da 1 a 10.");
}
	break;

case '3': //Stampa lista todo
	
	for (ToDo toDo : arrayTODO) {
		System.out.println(toDo);
	}
	
	break;
 
case '4':  //CHiudi sistema
	System.out.println("Uscita dal Programma");
	break;
default:
	System.out.println("Scelta non valida. Riprova");
}


System.out.println();

}
while (scelta != 'q' && scelta !='Q' && scelta != '4'); 

System.out.println("Chiusura programma");
}

}

	


