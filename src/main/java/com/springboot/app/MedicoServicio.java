package com.springboot.app;
import java.util.ArrayList;
import java.util.Date;

public class MedicoServicio implements IProceso{
	public MedicoServicio() {
		super();
		medicoList= new ArrayList<Medico>();
	}

	private ArrayList<Medico> medicoList;
	public ArrayList<Medico> getMedicoList() {
		return medicoList;
	}

	public void setMedicoList(ArrayList<Medico> medicoList) {
		this.medicoList = medicoList;
	}

	public void editar(String pNumeroDocumento, Date pFechaExped, String pPrimerNombre, String pSegundoNombre, String pPrimerApellido, String pSegundoApellido, String pTipoDocumento) {
		 
		boolean encontrado=false;
		for(int i=0;i<medicoList.size()&&!encontrado;i++)
		{
			if(medicoList.get(i).getNumeroDocumento()==pNumeroDocumento)
			{  
				medicoList.get(i).setPrimerNombre(pPrimerNombre);
				medicoList.get(i).setSegundoApellido(pSegundoApellido);
				medicoList.get(i).setPrimerApellido(pPrimerApellido);
				medicoList.get(i).setSegundoApellido(pSegundoApellido);
				medicoList.get(i).setTipoDocumento(pTipoDocumento);
				medicoList.get(i).setFechaExpedicionDoc(pFechaExped);	
				encontrado = true;
			}
		}
	}

	@Override
	public void registrar(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
		
			
	    String numeroDocumento, String tipoDocumento, Date fechaExpedicionDoc) {
		Medico nuevo =new Medico (primerNombre,segundoNombre, primerApellido, segundoApellido, numeroDocumento, tipoDocumento, fechaExpedicionDoc);
		medicoList.add(nuevo);
	}

	public Medico ver(String pNumeroDocumento) {
		Medico medicoVer=null;
		boolean encontrado=false;
		for(int i=0;i<medicoList.size()&&!encontrado;i++)
		{

			if(medicoList.get(i).getNumeroDocumento()==pNumeroDocumento)
			{
				medicoVer = medicoList.get(i);		
				encontrado = true;
			}
		}
		return medicoVer;

	}

	public void eliminar(String pNumeroDocumento) {
		boolean encontrado=false;
		for(int i=0;i<medicoList.size()&&!encontrado;i++)
		{

			if(medicoList.get(i).getNumeroDocumento()==pNumeroDocumento)
			{			
				medicoList.remove(i);
				encontrado = true;
			}
		}


	}

	public ArrayList<Medico> verTodos() {
		return medicoList;
	}


}
