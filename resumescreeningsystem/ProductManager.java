package resumescreeningsystem;

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public boolean evaluateResume(String resumeContent) {
        return resumeContent.contains("Leadership") || resumeContent.contains("Market Research");
    }
}
