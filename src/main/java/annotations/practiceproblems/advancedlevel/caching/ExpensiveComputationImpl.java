package annotations.practiceproblems.advancedlevel.caching;

public class ExpensiveComputationImpl implements ExpensiveComputation {

    @Override
    @CacheResult  // Apply caching
    public int computeFactorial(int n) {
        System.out.println("Computing factorial for: " + n);
        if (n == 0) return 1;
        return n * computeFactorial(n - 1);
    }
}

