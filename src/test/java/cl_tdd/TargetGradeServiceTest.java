package cl_tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TargetGradeServiceTest {

//	@Test
//	public void testValidGrade() {
//	    TargetGradeService tg = new TargetGradeService();
//	    tg.setGrade("HD");
//	    // INTENTIONALLY FAILING TEST
//	    assertEquals("P", tg.getGrade());  // This will fail because grade is "HD"
//	}
	@Test
	public void testValidGrade() {
	    TargetGradeService tg = new TargetGradeService();
	    tg.setGrade("HD");
	    assertEquals("HD", tg.getGrade());  // Now it will pass
	}

}
