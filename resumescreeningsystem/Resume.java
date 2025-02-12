package resumescreeningsystem;
import java.util.ArrayList;
import java.util.List;

class Resume {
    private final List<JobRole> jobRoles = new ArrayList<>();
    private final String resumeContent;

    public Resume(String resumeContent) {
        this.resumeContent = resumeContent;
    }

    // Add any job role
    public void addJobRole(JobRole jobRole) {
        jobRoles.add(jobRole);
    }

    // Process the resume for multiple job roles
    public void processResume() {
        System.out.println("Processing Resume: " + resumeContent);
        for (JobRole jobRole : jobRoles) {
            if (jobRole.evaluateResume(resumeContent)) {
                System.out.println("Suitable for: " + jobRole.getRoleName());
            } else {
                System.out.println("Not suitable for: " + jobRole.getRoleName());
            }
        }
        System.out.println("----------------------------");
    }
}

