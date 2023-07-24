package com.springboot.app;
import java.util.Date;

public interface IProceso {

public void registrar(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
		String numeroDocumento, String tipoDocumento, Date fechaExpedicionDoc) throws Exception;
public Persona ver(String pNumeroDocu) throws Exception;
public void eliminar(String pNumeroDocu);
public void editar(String pNumeroDocumento, Date pFechaExped, String pPrimerNombre, String pSegundoNombre,
		String pPrimerApellido, String pSegundoApellido, String pTipoDocumento);

}
