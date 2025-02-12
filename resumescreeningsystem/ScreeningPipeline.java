package resumescreeningsystem;

class ScreeningPipeline {
    public static void screenResumes(Resume resume) { // Removed "? extends JobRole"
        resume.processResume();
    }
}
