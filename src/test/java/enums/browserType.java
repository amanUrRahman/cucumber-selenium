package enums;

public enum browserType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    SAFARI("safari");

    private String browser;

    browserType(String browser) {
        this.browser = browser;
    }

    public String getBrowser(){
        return this.browser;
    }
}
