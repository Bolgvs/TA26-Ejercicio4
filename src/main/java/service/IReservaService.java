package service;

import java.util.List;

import dto.Reserva;

public interface IReservaService {

	public List<Reserva> listarReserva(); 
			
	public Reserva guardarReserva(Reserva reserva);
			
	public Reserva reserva(int id);
			
	public Reserva actualizarReserva(Reserva reserva);
			
	public void eliminarReserva(int id);
}
