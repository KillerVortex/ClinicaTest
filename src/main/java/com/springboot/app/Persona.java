package com.springboot.app;
import java.util.Date;

public class Persona {
public String primerNombre;
public String segundoNombre;
public String primerApellido;
public String segundoApellido;
public String numeroDocumento;
public String tipoDocumento;
public Date fechaExpedicionDoc;
public String getPrimerNombre() {
	return primerNombre;
}
public void setPrimerNombre(String primerNombre) {
	this.primerNombre = primerNombre;
}
public String getSegundoNombre() {
	return segundoNombre;
}

public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
		String numeroDocumento, String tipoDocumento, Date fechaExpedicionDoc) {
	super();
	this.primerNombre = primerNombre;
	this.segundoNombre = segundoNombre;
	this.primerApellido = primerApellido;
	this.segundoApellido = segundoApellido;
	this.numeroDocumento = numeroDocumento;
	this.tipoDocumento = tipoDocumento;
	this.fechaExpedicionDoc = fechaExpedicionDoc;
}
public String getTipoDocumento() {
	return tipoDocumento;
}
public void setTipoDocumento(String tipoDocumento) {
	this.tipoDocumento = tipoDocumento;
}
public void setSegundoNombre(String segundoNombre) {
	this.segundoNombre = segundoNombre;
}
public String getPrimerApellido() {
	return primerApellido;
}
public void setPrimerApellido(String primerApellido) {
	this.primerApellido = primerApellido;
}
public String getSegundoApellido() {
	return segundoApellido;
}
public void setSegundoApellido(String segundoApellido) {
	this.segundoApellido = segundoApellido;
}
public String getNumeroDocumento() {
	return numeroDocumento;
}
public void setNumeroDocumento(String numeroDocumento) {
	this.numeroDocumento = numeroDocumento;
}
public Date getFechaExpedicionDoc() {
	return fechaExpedicionDoc;
}
public void setFechaExpedicionDoc(Date fechaExpedicionDoc) {
	this.fechaExpedicionDoc = fechaExpedicionDoc;
}




}
