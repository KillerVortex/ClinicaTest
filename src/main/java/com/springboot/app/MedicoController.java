package com.springboot.app;
import java.util.Date;

public class MedicoController  {
    private MedicoServicio medicoServicio;
	public Medico crear(String pPrimerNombre, String pPrimerApellido, String pSegundoNombre,  String pSegundoApellido, String pNumeroDocumento, String pTipoDocumento,
			Date pFechaExpedicionDoc ) {
		Medico nuevoMedico = new Medico(pPrimerNombre,pSegundoNombre,pPrimerApellido,pSegundoApellido,pNumeroDocumento,pTipoDocumento,pFechaExpedicionDoc);
		return nuevoMedico;
	}


	public MedicoServicio getMedicoServicio() {
		return medicoServicio;
	}


	public void setMedicoServicio(MedicoServicio medicoServicio) {
		this.medicoServicio = medicoServicio;
	}


	public void editar(String pPrimerNombre, String pPrimerApellido, String pSegundoNombre,  String pSegundoApellido, String pNumeroDocumento, String pTipoDocumento, Date pFechaExpedicionDoc ) {
	
		medicoServicio.editar(pNumeroDocumento,pFechaExpedicionDoc,pPrimerNombre,pSegundoNombre,pPrimerApellido,pSegundoApellido,pTipoDocumento);

	}
	public void getInfo(String pNumeroDocu)
	{
      try {
		medicoServicio.ver(pNumeroDocu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void eliminar(String pNumeroDocu)
	{
      medicoServicio.eliminar(pNumeroDocu);
	}
}
