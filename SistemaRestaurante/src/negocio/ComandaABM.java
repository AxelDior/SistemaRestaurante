package negocio;
import dao.ComandaDao;

import java.util.GregorianCalendar;
import java.util.List;

import datos.Camarero;
import datos.Cliente;
import datos.Comanda;
import datos.Mesa;
public class ComandaABM {
	private ComandaDao dao = new ComandaDao();

	public int agregarComanda(GregorianCalendar fecha, Mesa mesa, boolean activo){
		Comanda c = new Comanda (fecha, mesa, activo);
		return dao.agregarComanda(c);
	}

	public void modificarComanda(Comanda comanda){
		dao.actualizarComanda(comanda);
	}

	public void eliminarComanda(long idComanda){
		Comanda c = dao.traerComanda(idComanda);
		dao.eliminarComanda(c);
	}

	public Comanda traerComanda(long idComanda){
		return dao.traerComanda(idComanda);
	}
	public List<Comanda> traerComandaMesa(long idMesa){
		return dao.traerComandaMesa(idMesa);
	}

	public List<Comanda> traerComanda(){
		return dao.traerComanda();
	}

	public Comanda traerComandaCompleto (long idComanda){
		return dao.traerComandaCompleto(idComanda);
	}

}
