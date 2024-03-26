public class ConferenceEvent extends Event {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                           double eventCost, int totalParticipants, int totalEventDays,
                           boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost,
                           boolean dinnerRequired, double dinnerCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    @Override
    public double calculateEventCost() {
        double totalCost = super.getEventCost();
        if (breakfastRequired) {
            totalCost += breakfastCost * getTotalParticipants();
        }
        if (lunchRequired) {
            totalCost += lunchCost * getTotalParticipants();
        }
        if (dinnerRequired) {
            totalCost += dinnerCost * getTotalParticipants();
        }
        return totalCost;
    }

    // Getters and setters
    public boolean isBreakfastRequired() { return breakfastRequired; }
    public void setBreakfastRequired(boolean breakfastRequired) { this.breakfastRequired = breakfastRequired; }
    public double getBreakfastCost() { return breakfastCost; }
    public void setBreakfastCost(double breakfastCost) { this.breakfastCost = breakfastCost; }
    public boolean isLunchRequired() { return lunchRequired; }
    public void setLunchRequired(boolean lunchRequired) { this.lunchRequired = lunchRequired; }
    public double getLunchCost() { return lunchCost; }
    public void setLunchCost(double lunchCost) { this.lunchCost = lunchCost; }
    public boolean isDinnerRequired() { return dinnerRequired; }
    public void setDinnerRequired(boolean dinnerRequired) { this.dinnerRequired = dinnerRequired; }
    public double getDinnerCost() { return dinnerCost; }
    public void setDinnerCost(double dinnerCost) { this.dinnerCost = dinnerCost; }

    @Override
    public String toString() {
        return super.toString() + " ConferenceEvent{" +
                "breakfastRequired=" + breakfastRequired +
                ", breakfastCost=" + breakfastCost +
                ", lunchRequired=" + lunchRequired +
                ", lunchCost=" + lunchCost +
                ", dinnerRequired=" + dinnerRequired +
                ", dinnerCost=" + dinnerCost +
                '}';
    }
}
