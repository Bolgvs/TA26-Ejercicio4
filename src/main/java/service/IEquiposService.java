package service;

import java.util.List;

import dto.Equipos;

public interface IEquiposService {
	
	public List<Equipos> listarEquipos();
	
	public Equipos guardarEquipos(Equipos equipos);
	
	public Equipos equipos(int id);
	
	public Equipos actualizarEquipos(Equipos equipos);
	
	public void eliminarEquipos(int id);
	
}

