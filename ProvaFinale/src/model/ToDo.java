package model;

public class ToDo {

String appuntamento;
String data;


public ToDo(String appuntamento, String data) {
	
	this.appuntamento= appuntamento;
	this.data= data;

}

@Override
public String toString() {
	return "ToDo [APPUNTAMENTO = " + appuntamento + ", DATA = " + data + "]";
}


}





