public class MusicConcertEvent extends Event {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                             double eventCost, int totalParticipants, int totalEventDays,
                             boolean merchandiseRequired, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    public double calculateEventCost() {
        double totalCost = getEventCost();
        if (merchandiseRequired) {
            totalCost += merchandiseCost * getTotalParticipants();
        }
        return totalCost;
    }

    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }

    public void setMerchandiseRequired(boolean required) {
        merchandiseRequired = required;
    }

    public double getMerchandiseCost() {
        return merchandiseCost;
    }

    public void setMerchandiseCost(double cost) {
        merchandiseCost = cost;
    }

    public String toString() {
        return super.toString() + " MusicConcertEvent{" +
                "merchandiseRequired=" + merchandiseRequired +
                ", merchandiseCost=" + merchandiseCost +
                '}';
    }
}

