public class PastEvent extends Event {
    private static final double EVENT_COST = 0;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    private double pastEventCost;

    public PastEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays, totalEventDays);
        pastEventCost = EVENT_COST;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }

    public boolean getRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean extension) {
        requiresExtension = extension;
    }

    public double calculateEventCost() {
        return pastEventCost;
    }

    public void setPaymentDetails(String status, boolean extension) {
        paymentDetails = "The event cost was " + pastEventCost + " and the payment status is " + status + 
        "\n" + "The Customer requires extension?: " + extension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public String toString() {
        String details = "Conference Event details: " + "\n";
        details += "Event ID: " + getEventID() + "\n";
        details += "Event Name: " + getEventName() + "\n";
        details += "Event Location: " + getEventLocation() + "\n";
        details += "Total participants: " + getTotalParticipants() + "\n";
        details += "The payment details are as follows: " + "\n" + paymentDetails;
        return details;
    }
}