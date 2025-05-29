package cl_tdd;

import java.util.HashSet;
import java.util.Set;

public class SubjectSelectionService {
    private final Set<String> availableSubjects = new HashSet<>();
    private final Set<String> selectedSubjects = new HashSet<>();

    {
        availableSubjects.add("SIT333");
        availableSubjects.add("SIT330");
        availableSubjects.add("SIT310");
        availableSubjects.add("SIT764");
    }

    public String selectSubject(String subjectCode) {
        if (!availableSubjects.contains(subjectCode)) {
            return "Error: Invalid subject code";
        }
        if (selectedSubjects.contains(subjectCode)) {
            return "Error: Subject already selected";
        }
        selectedSubjects.add(subjectCode);
        return "Subject " + subjectCode + " added successfully";
    }

    public Set<String> getSelectedSubjects() {
        return selectedSubjects;
    }

    public void clearSelections() {
        selectedSubjects.clear();
    }
}
