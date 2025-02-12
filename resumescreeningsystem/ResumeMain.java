package resumescreeningsystem;

public class ResumeMain {
    public static void main(String[] args) {
        // Resume for a candidate with Software Engineering and Data Science skills
        Resume resume1 = new Resume("Java, Data Structures, Machine Learning");
        resume1.addJobRole(new SoftwareEngineer());
        resume1.addJobRole(new DataScientist());

        // Resume for a candidate with Data Science skills
        Resume resume2 = new Resume("Python, Machine Learning, Statistics");
        resume2.addJobRole(new DataScientist());

        // Resume for a candidate with Product Management skills
        Resume resume3 = new Resume("Leadership, Market Research, Agile");
        resume3.addJobRole(new ProductManager());

        // Screening resumes dynamically
        ScreeningPipeline.screenResumes(resume1);
        ScreeningPipeline.screenResumes(resume2);
        ScreeningPipeline.screenResumes(resume3);
    }
}


