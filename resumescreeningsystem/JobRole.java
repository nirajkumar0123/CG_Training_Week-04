package resumescreeningsystem;

abstract class JobRole {
    private final String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public abstract boolean evaluateResume(String resumeContent);
}
