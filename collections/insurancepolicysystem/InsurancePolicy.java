package insurancepolicysystem;

import java.util.Date;
import java.util.Objects;

public class InsurancePolicy {
    private final String policyNumber;
    private final String policyholderName;
    private final Date expiryDate;
    private final String coverageType;
    private final double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy that = (InsurancePolicy) obj;
        return Objects.equals(policyNumber, that.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" + "Number='" + policyNumber + '\'' + ", Holder='" + policyholderName + '\'' +
                ", Expiry=" + expiryDate + ", Coverage='" + coverageType + '\'' + ", Premium=" + premiumAmount + '}';
    }
}
