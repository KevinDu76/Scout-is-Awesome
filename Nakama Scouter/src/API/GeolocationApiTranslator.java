package API;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * The class is used to translate the information retrieved from the Geolocation API.
 * The contents from connecting to the API URL produces a readable JSON file.
<<<<<<< HEAD:Nakama Scouter/src/API/GeolocationApiTranslator.java
 * Last Updated 03/23/2021
=======
 * Last Updated 02/14/2021
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/API/FoodApiTranslator.java
 * @author Andy Cruse
 */

public class GeolocationApiTranslator implements GeolocationApiInterface{
    private static final String baseURL = "http://ip-api.com/json/";

    /**
<<<<<<< HEAD:Nakama Scouter/src/API/GeolocationApiTranslator.java
     * This method is used to connect to the Location API via a URL and add the contents to a JSON file.
     * Then, the file is read to a String.
     * @param _ipAddress, _loadItem
     * @return _loadItem
     */
    @Override
    public Object loadLocation(String _ipAddress, String _loadItem){
=======
     * This method is used to connect to the Food API via a URL and add the contents to a JSON file.
     * Then the file is read to a String.
     * @param _id
     * @return String title
     */
    @Override
    public String loadRecipeTitleById(int _id) {
        // Builds base url string
        String searchString = new String("/recipes/" + _id + "/information?apiKey=" + FoodApiTranslator.apiKey);
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/API/FoodApiTranslator.java
        try{
            URL url = new URL(GeolocationApiTranslator.baseURL + _ipAddress + "?fields=status,city,lat,lon,query");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            // Build the content from the buffered input
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Close connections
            in.close();
            connection.disconnect();
            // Extract JSON object
            JSONObject obj = new JSONObject(content.toString());
            String title = obj.getString("title");
            return title;
        } catch (Exception ex) {
            return null;
        }
    }
<<<<<<< HEAD:Nakama Scouter/src/API/GeolocationApiTranslator.java
}
=======

    /**
     * This method is used to connect to the Food API via a URL and add the contents to a JSON file.
     * Then the file is read to a String.
     * @param _id
     * @return String summary
     */
    @Override
    public String loadSummaryById(int _id) {
        // Builds base url string
        String searchString = new String("/recipes/" + _id + "/information?apiKey=" + FoodApiTranslator.apiKey);
        try{
            URL url = new URL(FoodApiTranslator.baseURL + searchString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            // Build the content from the buffered input
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Close connections
            in.close();
            connection.disconnect();
            // Extract JSON object
            JSONObject obj = new JSONObject(content.toString());
            String summary = obj.getString("summary");
            return summary;
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * This method is used to connect to the Food API via a URL and add the contents to a JSON file.
     * Then the file is read to a String.
     * @param _id
     * @return Boolean vegetarian
     */
    @Override
    public Boolean loadIsVegetarianById(int _id) {
        // Builds base url string
        String searchString = new String("/recipes/" + _id + "/information?apiKey=" + FoodApiTranslator.apiKey);
        try{
            URL url = new URL(FoodApiTranslator.baseURL + searchString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            // Build the content from the buffered input
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Close connections
            in.close();
            connection.disconnect();
            // Extract JSON object
            JSONObject obj = new JSONObject(content.toString());
            Boolean vegetarian = obj.getBoolean("vegetarian");
            return vegetarian;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * This method is used to connect to the Food API via a URL and add the contents to a JSON file.
     * Then the file is read to a String.
     * @param _id
     * @return Boolean vegan
     */
    @Override
    public Boolean loadIsVeganById(int _id) {
        // Builds base url string
        String searchString = new String("/recipes/" + _id + "/information?apiKey=" + FoodApiTranslator.apiKey);
        try{
            URL url = new URL(FoodApiTranslator.baseURL + searchString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            // Build the content from the buffered input
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Close connections
            in.close();
            connection.disconnect();
            // Extract JSON object
            JSONObject obj = new JSONObject(content.toString());
            Boolean vegan = obj.getBoolean("vegan");
            return vegan;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * This method is used to connect to the Food API via a URL and add the contents to a JSON file.
     * Then the file is read to a String.
     * @param _id
     * @return Double pricePerServing
     */
    @Override
    public Double loadPricePerServingById(int _id) {
        // Builds base url string
        String searchString = new String("/recipes/" + _id + "/information?apiKey=" + FoodApiTranslator.apiKey);
        try{
            URL url = new URL(FoodApiTranslator.baseURL + searchString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            // Build the content from the buffered input
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Close connections
            in.close();
            connection.disconnect();
            // Extract JSON object
            JSONObject obj = new JSONObject(content.toString());
            Double pricePerServing = obj.getDouble("pricePerServing");
            return pricePerServing;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * This method is used to connect to the Food API via a URL and add the contents to a JSON file.
     * Then the file is read to a String.
     * @param _id
     * @return Integer readyInMinutes
     */
    @Override
    public Integer loadReadyInMinutesById(int _id) {
        // Builds base url string
        String searchString = new String("/recipes/" + _id + "/information?apiKey=" + FoodApiTranslator.apiKey);
        try{
            URL url = new URL(FoodApiTranslator.baseURL + searchString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            // Build the content from the buffered input
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Close connections
            in.close();
            connection.disconnect();
            // Extract JSON object
            JSONObject obj = new JSONObject(content.toString());
            Integer readyInMinutes = obj.getInt("readyInMinutes");
            return readyInMinutes;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * This method is used to connect to the Food API via a URL and add the contents to a JSON file.
     * Then the file is read to a String.
     * @param _id
     * @return Integer servingsNum
     */
    @Override
    public Integer loadServingsById(int _id) {
        // Builds base url string
        String searchString = new String("/recipes/" + _id + "/information?apiKey=" + FoodApiTranslator.apiKey);
        try{
            URL url = new URL(FoodApiTranslator.baseURL + searchString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            // Build the content from the buffered input
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Close connections
            in.close();
            connection.disconnect();
            // Extract JSON object
            JSONObject obj = new JSONObject(content.toString());
            Integer servingsNum = obj.getInt("servings");
            return servingsNum;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/API/FoodApiTranslator.java
