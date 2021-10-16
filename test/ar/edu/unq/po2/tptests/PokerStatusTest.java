package ar.edu.unq.po2.tptests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	PokerStatus pokerStatus;
	
	@BeforeEach
	public void setUp() throws Exception {
		pokerStatus = new PokerStatus();
	}
	
	@Test
	public void hayPoquer() {
		boolean primerBool  = pokerStatus.verificar("10P", "10C", "10D", "10T", "1P");
		boolean segundoBool = pokerStatus.verificar("2P", "10C", "2D", "2T", "2C");
		boolean tercerBool  = pokerStatus.verificar("10P", "6C", "8D", "QT", "3P");
		assertTrue(primerBool && segundoBool && !tercerBool);
	}
}
