package br.com.mariojp.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailNotifierTest {

	@Test
	void dry_run_should_not_touch_smtp() {
	    System.setProperty("DRY_RUN", "true");
	    System.clearProperty("SMTP_AVAILABLE");

	    var notifier = new EmailNotifier(new NoOpMailSender());

	    assertDoesNotThrow(() -> notifier.welcome(new User("Ana", "ana@example.com")),
	            "Com DIP, o DRY_RUN usa a implementação NoOp, evitando o SMTP real");
	}
}