package service;


import java.util.List;

import dto.Facultad;

public interface IFacultadService {

	public List<Facultad> listarFacultad();
			
	public Facultad guardarFacultad(Facultad facultad);
			
	public Facultad facultad(int id);
		
	public Facultad actualizarFacultad(Facultad facultad);
			
	public void eliminarFacultad(int id);
	
}
