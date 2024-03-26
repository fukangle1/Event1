public class Main {
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent = new ConferenceEvent(
            "001", "Conference", "Conference Center", "Emily",
            20000, 300, 3, true, 15.0, true, 30.0, true, 45.0);

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent(
            "002", "Concert", "Stadium", "Alice",
            15000, 5000, 1, true, 10.0);

        PastEvent pastEvent = new PastEvent(
            "003", "Event", "Classroom", "Kitty",
            100, 2);

        System.out.println("Conference Event Details:");
        System.out.println(conferenceEvent.toString());
        System.out.println("Total Conference Event Cost: $" + conferenceEvent.calculateEventCost());

        System.out.println("\nMusic Concert Event Details:");
        System.out.println(musicConcertEvent.toString());
        System.out.println("Total Music Concert Event Cost: $" + musicConcertEvent.calculateEventCost());

        System.out.println("\nPast Event Details:");
        System.out.println(pastEvent.toString());
        System.out.println("Total Past Event Cost: $" + pastEvent.calculateEventCost());
    }
}
