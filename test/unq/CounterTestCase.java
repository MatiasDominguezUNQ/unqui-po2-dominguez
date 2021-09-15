package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CounterTestCase {
	
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception{
		counter = new Counter();
		
		counter.addNumber(1245);
		counter.addNumber(333332);
		counter.addNumber(525678);
		counter.addNumber(72223);
		counter.addNumber(995);
		counter.addNumber(1111);
		counter.addNumber(111);
		counter.addNumber(11);
		counter.addNumber(1);
		counter.addNumber(42680);
		
	}
	
	@Test
	void test() {
		
		int number = counter.dissassembleNumber();
		assertEquals(number, 42680);
	}

}
