//Управление списком абитуриентов и их фильтрация

import java.util.ArrayList;
import java.util.List;

public class TestResultProcessor
{
    private List<Applicant> applicants;

    public TestResultProcessor()
    {
        this.applicants = new ArrayList<>();
    }

    public void addApplicant(Applicant applicant)
    {
        if (applicants.size() >= 500)
        {
            throw new IllegalStateException("Превышено максимальное количество абитуриентов.");
        }
        this.applicants.add(applicant);
    }

    public List<Applicant> getAdmittedApplicants()
    {
        List<Applicant> admitted = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.isAdmitted()) {
                admitted.add(applicant);
            }
        }
        return admitted;
    }


    @Override
    public String toString()
    {
        return "TestResultProcessor{" + "applicants=" + applicants + '}';
    }
}
