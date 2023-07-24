package com.springboot.app;
import java.util.Date;

public class PacienteController {
	private PacienteServicio pacienteServicio;

	public PacienteServicio getPacienteServicio() {
		return pacienteServicio;
	}
	public void setPacienteServicio(PacienteServicio pacienteServicio) {
		this.pacienteServicio = pacienteServicio;
	}
	public void crear(String pPrimerNombre, String pPrimerApellido, String pSegundoNombre,  String pSegundoApellido, String pNumeroDocumento, String pTipoDocumento,
			Date pFechaExpedicionDoc ) 
	{
		try {
			pacienteServicio.registrar(pPrimerNombre, pSegundoNombre, pPrimerApellido, pSegundoApellido, pNumeroDocumento, pTipoDocumento, pFechaExpedicionDoc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void editar(String pPrimerNombre, String pPrimerApellido, String pSegundoNombre,  String pSegundoApellido, String pNumeroDocumento, String pTipoDocumento, Date pFechaExpedicionDoc )
	{
		pacienteServicio.editar(pNumeroDocumento,pFechaExpedicionDoc,pPrimerNombre,pSegundoNombre,pPrimerApellido,pSegundoApellido,pTipoDocumento);
	}
	public PacienteController() {
		super();
		pacienteServicio = new PacienteServicio();

	}
	public void getInfo(String pNumeroDocu)
	{ 
		try {
			pacienteServicio.ver(pNumeroDocu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	public void eliminar(String pNumeroDocu)
	{
		pacienteServicio.eliminar(pNumeroDocu);
	}

}
