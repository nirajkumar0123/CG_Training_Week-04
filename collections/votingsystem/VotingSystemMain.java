package votingsystem;

public class VotingSystemMain {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");

        // Display votes in order received
        votingSystem.displayVotesInOrder();

        // Display results sorted by candidate name
        votingSystem.displaySortedResults();

        // Display final results sorted by vote count
        votingSystem.displayResultsByVoteCount();
    }
}

