package Models;

/**
 * This class loads the recipe information from the Restaurant API, Documenu.
 * Last Updated 03/24/2021
 * @author Andy Cruse
 */
public class Restaurant extends APIBaseClass {

    protected String ipAddress;
    protected double latitude;
    protected double longitude;
    protected int distance;
    protected String totalResults;
    protected String data;
    protected String restaurantName;
    protected String restaurantPhone;
    protected String restaurantWebsite;
    protected String hours;
    protected String priceRange;
    protected String[] cuisines;
    protected String address;
    protected final String TOTAL_RESULTS = "totalResults";
    protected final String DATA = "data";
    protected final String RESTAURANT_NAME = "restaurant_name";
    protected final String RESTAURANT_PHONE = "restaurant_phone";
    protected final String RESTAURANT_WEBSITE = "restaurant_website";
    protected final String HOURS = "hours";
    protected final String PRICE_RANGE = "price_range";
    protected final String CUISINE = "cuisines";
    protected final String ADDRESS = "formatted";

    public void Restaurant() {}

    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return the Number of Results
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantResults(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.TOTAL_RESULTS).toString();
            rest.setTotalResults(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setTotalResults("!NA!");
        }
        return rest;
    }

    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return the Restaurant Data Set
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantData(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.DATA).toString();
            rest.setData(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setData("!NA!");
        }
        return rest;
    }
    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return Restaurant Name
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantName(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.RESTAURANT_NAME).toString();
            rest.setRestaurantName(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setRestaurantName("!NA!");
        }
        return rest;
    }

    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return Restaurant Phone Number
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantPhone(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.RESTAURANT_PHONE).toString();
            rest.setRestaurantName(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setRestaurantName("!NA!");
        }
        return rest;
    }

    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return Restaurant Website
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantWebsite(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.RESTAURANT_WEBSITE).toString();
            rest.setRestaurantName(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setRestaurantName("!NA!");
        }
        return rest;
    }

    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return Restaurant Hours
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantHours(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.HOURS).toString();
            rest.setRestaurantName(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setRestaurantName("!NA!");
        }
        return rest;
    }

    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return Restaurant Price Range
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantPriceRange(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.PRICE_RANGE).toString();
            rest.setRestaurantName(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setRestaurantName("!NA!");
        }
        return rest;
    }

    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return Restaurant Cuisines
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantCuisines(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.CUISINE).toString();
            rest.setRestaurantName(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setRestaurantName("!NA!");
        }
        return rest;
    }

    /**
     * Static method creates a Restaurant object based on latitude, longtitude, a distance radius in miles, and a specified cuisine
     * This method connects with the Restaurant API to return Restaurant Address
     * @param _latitude, _longitude, _distance, _cuisine
     * @return Restaurant rest
     */
    public static Restaurant loadRestaurantAddress(double _latitude, double _longitude, int _distance, String _cuisine) {
        Restaurant rest = new Restaurant();
        rest.setLatitude(_latitude);
        rest.setLongitude(_longitude);
        rest.setDistance(_distance);
        String title;
        try {
            title = rest.myRestaurantAPI.loadRestaurantItem(_latitude, _longitude, _distance, _cuisine, rest.ADDRESS).toString();
            rest.setRestaurantName(title.toString());
        }
        catch (NullPointerException ex) {
            rest.setRestaurantName("!NA!");
        }
        return rest;
    }

    //=============== GETTERS =============
    public String getIpAddress() {
        return this.ipAddress;
    }
    public double getLatitude() {
        return this.latitude;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public int getDistance() {
        return this.distance;
    }
    public String getTotalResults() {
        return this.totalResults;
    }
    public String getData() {
        return this.data;
    }
    public String getRestaurantName() {
        return this.restaurantName;
    }
    public String getRestaurantPhone() {
        return this.restaurantPhone;
    }
    public String getRestaurantWebsite() {
        return this.restaurantWebsite;
    }
    public String getHours() {
        return this.hours;
    }
    public String getPriceRange() {
        return this.priceRange;
    }
    public String[] getCuisines() {
        return this.cuisines;
    }
    public String getAddress() {
        return this.address;
    }

    //=============== SETTERS =============
    public void setIpAddress(String _ipAddress) {
        this.ipAddress = _ipAddress;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public void setTotalResults(String _totalResults) {
        this.totalResults = _totalResults;
    }
    public void setData(String _data) {
        this.data = _data;
    }
    public void setRestaurantName(String _restaurantName) {
        this.restaurantName = _restaurantName;
    }
    public void setRestaurantPhone(String _restaurantPhone) {
        this.restaurantPhone = _restaurantPhone;
    }
    public void setRestaurantWebsite(String _restaurantWebsite) {
        this.restaurantWebsite = _restaurantWebsite;
    }
    public void setHours(String _hours) {
        this.hours = _hours;
    }
    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }
    public void setCuisines(String[] cuisines) {
        this.cuisines = cuisines;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
