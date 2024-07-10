import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

	Main testing = new Main();

	OffsetDateTime data = OffsetDateTime.parse("2024-05-20T15:06:00Z");

	@Test
	public void TestPattern(){
		String formattedDate = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ITALY));
		assertEquals("20 maggio 2024", formattedDate, "Controlla che il formato della data stampata sia corretto");
	}

	@Test
	public void TestException(){
		assertThrows(DateTimeParseException.class, () ->
			{OffsetDateTime testData = OffsetDateTime.parse("2024-05-2015:06:00Z");
			}, "Controlla che se la data viene inserita in un formato non corretto viene lanciata un'eccezione");
	}

}