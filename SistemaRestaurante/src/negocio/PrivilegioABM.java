package negocio;
import dao.PrivilegioDao;
import java.util.List;
import datos.Privilegio;
public class PrivilegioABM {
	private PrivilegioDao dao = new PrivilegioDao();

	public int agregarPrivilegio(String privilegio){
		Privilegio p = new Privilegio(privilegio);
		return dao.agregarPrivilegio(p);
	}

	public void modificarPrivilegio(Privilegio privilegio){
		dao.actualizarPrivilegio(privilegio);
	}

	public void eliminarPrivilegio(long idPrivilegio){
		Privilegio p = dao.traerPrivilegio(idPrivilegio);
		dao.eliminarPrivilegio(p);
	}

	public Privilegio traerPrivilegio(long idPrivilegio){
		return dao.traerPrivilegio(idPrivilegio);
	}

	public List<Privilegio> traerPrivilegio(){
		return dao.traerPrivilegio();
	}

	public Privilegio traerPrivilegioCompleto (long idPrivilegio){
		return dao.traerPrivilegioCompleto(idPrivilegio);
	}

}
