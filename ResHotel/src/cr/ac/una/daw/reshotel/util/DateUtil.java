package cr.ac.una.daw.reshotel.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String ISO8601_DATE_FORMAT = "dd/MM/yyyy";

	/**
	 * Devuelve la intancia fecha del string dado.
	 * 
	 * @param date
	 *            String con formato ISO8601
	 * @return
	 * @throws ParseException
	 */
	public static Date parseISO8601(String date) throws ParseException {
		Date result = null;

		if (date != null && date.length() > 0) {
			System.out.println(date);
			SimpleDateFormat dateFormat = new SimpleDateFormat(
					ISO8601_DATE_FORMAT);

			result = dateFormat.parse(date);
		}

		return result;
	}
}
