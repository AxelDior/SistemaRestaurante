package negocio;
import dao.MesaDao;
import java.util.List;
import datos.EstadoMesa;
import datos.Mesa;
import datos.Salon;
public class MesaABM {
	private MesaDao dao = new MesaDao();

	public int agregarMesa(EstadoMesa estadoMesa, Salon salon){
		Mesa m = new Mesa (estadoMesa, salon);
		return dao.agregarMesa(m);
	}

	public void modificarMesa(Mesa mesa){
		dao.actualizarMesa(mesa);
	}

	public void eliminarMesa(long idMesa){
		Mesa m = dao.traerMesa(idMesa);
		dao.eliminarMesa(m);
	}

	public Mesa traerMesa(long idMesa){
		return dao.traerMesa(idMesa);
	}

	public List<Mesa> traerMesa(){
		return dao.traerMesa();
	}
	
}