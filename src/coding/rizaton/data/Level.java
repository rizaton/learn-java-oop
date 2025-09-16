package coding.rizaton.data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private final String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
