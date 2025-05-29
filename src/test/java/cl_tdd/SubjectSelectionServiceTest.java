package cl_tdd;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubjectSelectionServiceTest {

    private SubjectSelectionService service;

    @BeforeEach
    public void setUp() {
        service = new SubjectSelectionService();
    }

    @Test
    public void testValidSubjectSelection() {
        String result = service.selectSubject("SIT333");
        assertEquals("Subject SIT333 added successfully", result);
        assertTrue(service.getSelectedSubjects().contains("SIT333"));
    }

    @Test
    public void testInvalidSubjectSelection() {
        String result = service.selectSubject("ABC123");
        assertEquals("Error: Invalid subject code", result);
    }

    @Test
    public void testDuplicateSubjectSelection() {
        service.selectSubject("SIT310");
        String result = service.selectSubject("SIT310");
        assertEquals("Error: Subject already selected", result);
    }

    @Test
    public void testMultipleSubjectSelections() {
        service.selectSubject("SIT330");
        service.selectSubject("SIT764");
        Set<String> selected = service.getSelectedSubjects();
        assertEquals(2, selected.size());
        assertTrue(selected.contains("SIT330"));
        assertTrue(selected.contains("SIT764"));
    }
}
