package Models;

/**
 * This class loads the recipe information from the Food API.
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
 * Last Updated 03/24/2021
 * @author Andy Cruse, modified by Edward Hicks
=======
 * Last Updated 02/14/2021
 * @author Andy Cruse
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
=======
 * Last Updated 02/14/2021
 * @author Andy Cruse
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
 */
public class Recipe extends APIBaseClass {

    protected int id;
    protected String title;
    protected String summary;
    protected Boolean isVegetarian;
    protected Boolean isVegan;
    protected Double pricePerServing;
    protected Integer readyInMinutes;
    protected Integer servings;
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
    protected final String ITEM_TITLE = "title";
    protected final String ITEM_SUMMARY = "summary";
    protected final String ITEM_IS_VEGETARIAN = "vegetarian";
    protected final String ITEM_IS_VEGAN = "vegan";
    protected final String ITEM_PRICE_PER_SERVING = "pricePerServing";
    protected final String ITEM_READY_IN_MINUTES = "readyInMinutes";
    protected final String ITEM_SERVINGS = "servings";
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java

    public void Recipe() {}

    /**
     * Static method creates a Recipe object based on a given ID number.
     * The method connects to the Food API to retrieve the Recipe Title.
     * @param _id
     * @return Recipe recipe
     */
    public static Recipe loadRecipeTitleById(int _id) {
        Recipe recipe = new Recipe();
        recipe.setId(_id);
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
        String title;
        try {
            title = Recipe.myFoodAPI.loadRecipeItem(_id, recipe.ITEM_TITLE).toString();
            recipe.setTitle(title.toString());
        }
        catch (NullPointerException ex) {
            recipe.setTitle("!NA!");
=======
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        String title = Recipe.myFoodAPI.loadRecipeTitleById(_id);
        if (title == null) {
            return null;
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        }
        return recipe;
    }

    /**
     * Static method creates a Recipe object based on a given ID number.
     * The method connects to the Food API to retrieve the Recipe Summary
     * @param _id
     * @return Recipe recipe
     */
    public static Recipe loadSummaryById(int _id) {
        Recipe recipe = new Recipe();
        recipe.setId(_id);
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
        String summary;
        try {
            summary = Recipe.myFoodAPI.loadRecipeItem(_id, recipe.ITEM_SUMMARY).toString();
            recipe.setSummary(summary);
        }
        catch (NullPointerException ex) {
            recipe.setSummary("!NA!");
=======
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        String summary = Recipe.myFoodAPI.loadSummaryById(_id);
        if (summary == null) {
            return null;
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        }
        return recipe;
    }

    /**
     * Static method creates a Recipe object based on a given ID number.
     * The method connects to the Food API to determine if Recipe is Vegetarian.
     * @param _id
     * @return Recipe recipe
     */
    public static Recipe loadIsVegetarianById(int _id) {
        Recipe recipe = new Recipe();
        recipe.setId(_id);
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
        Boolean isVegetarian;
        try {
            isVegetarian = Boolean.parseBoolean(myFoodAPI.loadRecipeItem(_id, recipe.ITEM_IS_VEGETARIAN).toString());
            recipe.setIsVegetarian(isVegetarian);
        }
        catch (NullPointerException ex) {
            recipe.setIsVegetarian(false);
=======
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        Boolean isVegetarian = Recipe.myFoodAPI.loadIsVegetarianById(_id);
        if (isVegetarian == null) {
            return null;
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        }
        return recipe;
    }

    /**
     * Static method creates a Recipe object based on a given ID number.
     * The method connects to the Food API to determine if Recipe is Vegan.
     * @param _id
     * @return Recipe recipe
     */
    public static Recipe loadIsVeganById(int _id) {
        Recipe recipe = new Recipe();
        recipe.setId(_id);
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
        Boolean isVegan;
        try {
            isVegan = Boolean.parseBoolean(Recipe.myFoodAPI.loadRecipeItem(_id, recipe.ITEM_IS_VEGAN).toString());
            recipe.setIsVegan(isVegan);
        }
        catch (NullPointerException ex) {
            recipe.setIsVegan(false);
=======
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        Boolean isVegan = Recipe.myFoodAPI.loadIsVeganById(_id);
        if (isVegan == null) {
            return null;
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        }
        return recipe;
    }

    /**
     * Static method creates a Recipe object based on a given ID number.
     * The method connects to the Food API to retrieve the Recipe Price per Serving
     * @param _id
     * @return Recipe recipe
     */
    public static Recipe loadPricePerServingById(int _id) {
        Recipe recipe = new Recipe();
        recipe.setId(_id);
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
        Double pricePerServing;
        try {
            pricePerServing = Double.parseDouble(Recipe.myFoodAPI.loadRecipeItem(_id, recipe.ITEM_PRICE_PER_SERVING).toString());
            recipe.setPricePerServing(pricePerServing);
        }
        catch (NullPointerException ex) {
            recipe.setPricePerServing(0d);
=======
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        Double pricePerServing = Recipe.myFoodAPI.loadPricePerServingById(_id);
        if (pricePerServing == null){
            return null;
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        }
        return recipe;
    }

    /**
     * Static method creates a Recipe object based on a given ID number.
     * The method connects to the Food API to retrieve the Recipe Cook time in Minutes
     * @param _id
     * @return Recipe recipe
     */
    public static Recipe loadReadyInMinutesById(int _id) {
        Recipe recipe = new Recipe();
        recipe.setId(_id);
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
        Integer minutes;
        try {
            minutes = Integer.parseInt(Recipe.myFoodAPI.loadRecipeItem(_id, recipe.ITEM_READY_IN_MINUTES).toString());
            recipe.setReadyInMinutes(minutes);
        }
        catch (NullPointerException ex) {
            recipe.setReadyInMinutes(0);
=======
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        Integer minutes = Recipe.myFoodAPI.loadReadyInMinutesById(_id);
        if (minutes == null){
            return null;
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        }
        return recipe;
    }

    /**
     * Static method creates a Recipe object based on a given ID number.
     * The method connects to the Food API to retrieve the Recipe number of Servings
     * @param _id
     * @return Recipe recipe
     */
    public static Recipe loadServingsById(int _id) {
        Recipe recipe = new Recipe();
        recipe.setId(_id);
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
<<<<<<< HEAD:Nakama Scouter/src/Models/Recipe.java
        Integer servings;
        try {
            servings = Integer.parseInt(Recipe.myFoodAPI.loadRecipeItem(_id, recipe.ITEM_SERVINGS).toString());
            recipe.setServings(servings);
        }
        catch (NullPointerException ex) {
            recipe.setServings(0);
=======
=======
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        Integer servings = Recipe.myFoodAPI.loadServingsById(_id);
        if (servings == null){
            return null;
>>>>>>> parent of 4cd4337 (Merge pull request #3 from Aka-sha/echicks):Food API/src/Models/Recipe.java
        }
        return recipe;
    }

    //=============== GETTERS =============
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSummary() {
        return this.summary;
    }

    public Boolean getIsVegetarian() {
        return this.isVegetarian;
    }

    public Boolean getIsVegan() {
        return this.isVegan;
    }

    public Double getPricePerServing() {
        return this.pricePerServing;
    }

    public Integer getReadyInMinutes() {
        return this.readyInMinutes;
    }

    public Integer getServings() {
        return this.servings;
    }

    //=============== SETTERS ==============
    public void setId(int _id) {
        this.id = _id;
    }

    public void setTitle(String _title) {
        this.title = _title;
    }

    public void setSummary(String _summary) {
        this.summary = _summary;
    }

    public void setIsVegetarian(Boolean _isVegetarian) {
        this.isVegetarian = _isVegetarian;
    }

    public void setIsVegan(Boolean _isVegan) {
        this.isVegan = _isVegan;
    }

    public void setPricePerServing(Double _pricePerServing) {
        this.pricePerServing = _pricePerServing;
    }

    public void setReadyInMinutes(Integer _readyInMinutes) {
        this.readyInMinutes = _readyInMinutes;
    }

    public void setServings(Integer _servings) {
        this.servings = _servings;
    }
}