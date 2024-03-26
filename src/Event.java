public abstract class Event {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private double cost;
    private int participants;
    private int days;

    public Event(String id, String name, String location, String contact,
                 double cost, int participants, int days) {
        eventID = id;
        eventName = name;
        eventLocation = location;
        pointOfContact = contact;
        this.cost = cost;
        this.participants = participants;
        this.days = days;
    }

    public abstract double calculateEventCost();

    // Getters and setters
    public String getEventID() { return eventID; }
    public void setEventID(String id) { eventID = id; }
    public String getEventName() { return eventName; }
    public void setEventName(String name) { eventName = name; }
    public String getEventLocation() { return eventLocation; }
    public void setEventLocation(String location) { eventLocation = location; }
    public String getEventPointOfContact() { return pointOfContact; }
    public void setEventPointOfContact(String contact) { pointOfContact = contact; }
    public double getEventCost() { return cost; }
    public void setEventCost(double cost) { this.cost = cost; }
    public int getTotalParticipants() { return participants; }
    public void setTotalParticipants(int num) { participants = num; }
    public int getTotalEventDays() { return days; }
    public void setTotalEventDays(int numDays) { days = numDays; }

    @Override
    public String toString() {
        return "Event{" +
                "ID='" + eventID + '\'' +
                ", Name='" + eventName + '\'' +
                ", Location='" + eventLocation + '\'' +
                ", Contact='" + pointOfContact + '\'' +
                ", Cost=" + cost +
                ", Participants=" + participants +
                ", Days=" + days +
                '}';
    }
}