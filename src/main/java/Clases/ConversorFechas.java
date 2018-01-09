package Clases;
import java.beans.PropertyEditorSupport;
import java.time.LocalDate;

/**
 * 
 * @author Ismael Martin R
 * 
 *         Clase para convertir fechas a String, para utilizarlas en el contexto
 *         del programa.
 *
 */
public class ConversorFechas extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		LocalDate fecha = LocalDate.parse(String.valueOf(getValue()));
		return (fecha != null ? fecha.toString() : " ");
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(LocalDate.parse(text));
	}

}
