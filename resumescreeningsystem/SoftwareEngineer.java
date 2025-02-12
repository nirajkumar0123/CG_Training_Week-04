package resumescreeningsystem;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public boolean evaluateResume(String resumeContent) {
        return resumeContent.contains("Java") || resumeContent.contains("Data Structures");
    }
}
