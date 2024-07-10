import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
	public static void main( String[] args ) {

		try {
			OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

			String dataFormat = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ITALY));

			System.out.println(dataFormat);

		}catch( DateTimeParseException e ){
			System.err.println("La data inserita non è formattata correttamente");
		}
	}
}