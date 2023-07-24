package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ClinicaApp {

    private PacienteController pacienteController;
    private MedicoController medicoController;
    
    @Autowired
    public ClinicaApp(MedicoServicio medicoServicio, PacienteServicio pacienteServicio) {
        medicoController= new MedicoController();
        pacienteController= new PacienteController();
    }

    @PostMapping("/medicos")
    public Medico crearMedico(@RequestBody Medico medico) {
        try {
			medicoController.getMedicoServicio().registrar(medico.getPrimerNombre(), medico.getSegundoNombre(),
			        medico.getPrimerApellido(), medico.getSegundoApellido(),
			        medico.getNumeroDocumento(), medico.getTipoDocumento(), medico.getFechaExpedicionDoc());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return medico;
    }

    @PostMapping("/pacientes")
    public Paciente crearPaciente(@RequestBody Paciente paciente) {
        try {
			pacienteController.getPacienteServicio().registrar(paciente.getPrimerNombre(), paciente.getSegundoNombre(),
			        paciente.getPrimerApellido(), paciente.getSegundoApellido(),
			        paciente.getNumeroDocumento(), paciente.getTipoDocumento(), paciente.getFechaExpedicionDoc());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return paciente;
    }

    @PutMapping("/medicos/{numeroDocumento}")
    public void editarMedico(@PathVariable String numeroDocumento,
                             @RequestParam String primerNombre,
                             @RequestParam String segundoNombre,
                             @RequestParam String primerApellido,
                             @RequestParam String segundoApellido,
                             @RequestParam String tipoDocumento,
                             @RequestParam Date fechaExpedicionDoc) {
    	medicoController.getMedicoServicio().editar(numeroDocumento, fechaExpedicionDoc, segundoNombre, primerApellido,
                segundoApellido, tipoDocumento, primerNombre);
    }

    @PutMapping("/pacientes/{numeroDocumento}")
    public void editarPaciente(@PathVariable String numeroDocumento,
                               @RequestParam String primerNombre,
                               @RequestParam String segundoNombre,
                               @RequestParam String primerApellido,
                               @RequestParam String segundoApellido,
                               @RequestParam String tipoDocumento,
                               @RequestParam Date fechaExpedicionDoc) {
    	medicoController.getMedicoServicio().editar(numeroDocumento, fechaExpedicionDoc, segundoNombre, primerApellido,
                segundoApellido, tipoDocumento, primerNombre);
    }

    @DeleteMapping("/medicos/{numeroDocumento}")
    public void eliminarMedico(@PathVariable String numeroDocumento) {
    	medicoController.getMedicoServicio().eliminar(numeroDocumento);
    }

    @DeleteMapping("/pacientes/{numeroDocumento}")
    public void eliminarPaciente(@PathVariable String numeroDocumento) {
        pacienteController.getPacienteServicio().eliminar(numeroDocumento);
    }

    @GetMapping("/medicos/{numeroDocumento}")
    public Medico verMedico(@PathVariable String numeroDocumento) {
       Medico respuesta= null; 
    	try {
			respuesta= medicoController.getMedicoServicio().ver(numeroDocumento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return respuesta;
    }

    @GetMapping("/pacientes/{numeroDocumento}")
    public Paciente verPaciente(@PathVariable String numeroDocumento) {
    	Paciente respuesta= null; 
    	try {
			respuesta=  pacienteController.getPacienteServicio().ver(numeroDocumento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return respuesta;
    }

    @GetMapping("/medicos")
    public ArrayList<Medico> verTodosMedicos() {
        return  medicoController.getMedicoServicio().verTodos();
    }

    @GetMapping("/pacientes")
    public List<Paciente> verTodosPacientes() {
        return  pacienteController.getPacienteServicio().verTodos();
    }
}
