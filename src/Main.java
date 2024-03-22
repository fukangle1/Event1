public class Main {
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent = new ConferenceEvent("C001", "Tech Conference", "Convention Center", "John Doe", 50.0, 2, 3, true, 5.0, true, 8.0, true, 10.0);
        System.out.println(conferenceEvent.toString());
        System.out.println("Total Event Cost: $" + conferenceEvent.calculateEventCost());

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent("M001", "Music Festival", "Outdoor Arena", "Jane Smith", 10.0, 50, 2, true, 2.0);
        System.out.println(musicConcertEvent.toString());
        System.out.println("Total Event Cost: $" + musicConcertEvent.calculateEventCost());
    }
}