package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase{
	
	public void testAdd() {
		ArithmeticSolver solver = new ArithmeticSlover();
		
		assertEquals(4, solver.add(2,2));
	}
	
	public void testSubract() {
		ArithmeticSolver solver = new ArithmeticSlover();
		
		assertEquals(4, solver.subtract(4,2));
	}
	
	public void testMultiply() {
		ArithmeticSolver solver = new ArithmeticSlover();
		
		assertEquals(16, solver.multiply(8,2));
	}
	
	public void testDivide() {
		ArithmeticSolver solver = new ArithmeticSlover();
		
		assertEquals(3, solver.divide(9,3));
	}
	
	public void testModulus() {
		ArithmeticSolver solver = new ArithmeticSlover();
		
		assertEquals(1, solver.divide(5,2 ));
	}
}
