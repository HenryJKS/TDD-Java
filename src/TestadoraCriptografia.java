import static org.junit.Assert.*;

import org.junit.Test;

//Classes de teste de criptografia
public class TestadoraCriptografia {
	 //Teste de criptografia da letra A
	
	@Test
	public void testeCriptografaA() {
		Criptografadora cripto = new Criptografadora();
		int retornoCriptografia = cripto.criptografar("A");
		assertEquals(retornoCriptografia, 19);
		
	}
	
	@Test
	public void testeCriptografaB() {
		Criptografadora cripto = new Criptografadora();
		int retornoCriptografia = cripto.criptografar("B");
		assertEquals(retornoCriptografia, 11);
		
	}
	
	@Test
	public void testeCriptografaC() {
		Criptografadora cripto = new Criptografadora();
		int retornoCriptografia = cripto.criptografar("C");
		assertEquals(retornoCriptografia, 71);
	}
	
	@Test
	public void testeCriptografa$() {
		Criptografadora cripto = new Criptografadora();
		int retornoCriptografia = cripto.criptografar("$");
		assertEquals(retornoCriptografia, 0);
	}
	
	@Test
	public void testeCriptografaFalse() {
		Criptografadora cripto = new Criptografadora();
		int retornoCriptografia = cripto.criptografar("$");
		assertFalse(retornoCriptografia == 5);
	}
	
	@Test
	public void testeCriptografaTrue() {
		Criptografadora cripto = new Criptografadora();
		int retornoCriptografia = cripto.criptografar("$");
		assertTrue(retornoCriptografia == 0);
	}
	
	@Test
	public void testeProg() {
		Criptografadora prog = new Criptografadora();
		int retornoY = prog.ProgX(false, 0, 0, 0);
		assertEquals(retornoY, -1);
	}
	
	


}
