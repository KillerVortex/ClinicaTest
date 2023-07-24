package com.springboot.app;
import java.util.ArrayList;
import java.util.Date;

public class PacienteServicio implements IProceso {
	public PacienteServicio() {
		super();
		this.pacienteList = new ArrayList<Paciente>();
	}

	private ArrayList<Paciente> pacienteList;

	public ArrayList<Paciente> getPacienteList() {
		return pacienteList;
	}

	public void setPacienteList(ArrayList<Paciente> pacienteList) {
		this.pacienteList = pacienteList;
	}

	


	public void registrar(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String numeroDocumento, String tipoDocumento, Date fechaExpedicionDoc) throws Exception {
		Paciente aBuscar=ver(numeroDocumento);
		if(aBuscar!=null)
		{
			throw new Exception("El paciente ya se encuentra registrado");
		}
		else
		{
			
		
		Paciente nuevo =new Paciente (primerNombre,segundoNombre, primerApellido, segundoApellido, numeroDocumento, tipoDocumento, fechaExpedicionDoc);
		pacienteList.add(nuevo);
		}
		
		
		
	}
	public ArrayList<Paciente> verTodos() {
        return pacienteList;
    }

	public Paciente ver(String pNumeroDocumento) throws Exception {
		Paciente pacienteVer=null;
		boolean encontrado=false;
		for(int i=0;i<pacienteList.size()&&!encontrado;i++)
		{

			if(pacienteList.get(i).getNumeroDocumento()==pNumeroDocumento)
			{
				pacienteVer = pacienteList.get(i);		
				encontrado = true;
			}
		}
		if(pacienteVer==null)
				{
			throw new Exception("no se encontró el paciente");
				}
		return pacienteVer;
	}


	public void eliminar(String pNumeroDocumento) {
		boolean encontrado=false;
		for(int i=0;i<pacienteList.size()&&!encontrado;i++)
		{

			if(pacienteList.get(i).getNumeroDocumento()==pNumeroDocumento)
			{			
				pacienteList.remove(i);
				encontrado = true;
			}
		}


	}

	public void editar(String pNumeroDocumento, Date pFechaExped, String pPrimerNombre, String pSegundoNombre, String pPrimerApellido, String pSegundoApellido, String pTipoDocumento) {
		 

		boolean encontrado=false;
		for(int i=0;i<pacienteList.size()&&!encontrado;i++)
		{
			if(pacienteList.get(i).getNumeroDocumento()==pNumeroDocumento)
			{  
				pacienteList.get(i).setPrimerNombre(pPrimerNombre);
				pacienteList.get(i).setSegundoApellido(pSegundoApellido);
				pacienteList.get(i).setPrimerApellido(pPrimerApellido);
				pacienteList.get(i).setSegundoApellido(pSegundoApellido);
				pacienteList.get(i).setTipoDocumento(pTipoDocumento);
				pacienteList.get(i).setFechaExpedicionDoc(pFechaExped);	
				encontrado = true;
			}
		}
	}








}
