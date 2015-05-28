Narrative: As a logIn user I want to create my own recipe
Scenario: As a logIn user I want to create my own recipe
Meta: @author Severskaya

GivenStories: givenStories/GivenUserLigInForCreateRecipe.story

When the user clicks on Create Recipe Button
And the user enters Title in Create recipe
And the user enters Description in Create recipe
And the user enters Coocking Time Hours in Create recipe
And the user enters Coocking Time Minutes in Create recipe
And the user enters Quantity of Dish in Create recipe
And the user clicks on Cuisine in Create recipe
And the user chooses Cuisine in Create recipe
And the user clicks on Category in create recipe
And the user chooses Category in Create recipe
And the user clicks on Marker in Create recipe
And the user enters Ingredient Name in Create recipe
And the user clicks on Complexity in Create recipe
And the user chooses Complexity in Create recipe
And the user enters Steps in Create recipe
And the user enters Count of Ingredients in Create recipe
And the user clicks on Type of Ingredients in Create recipe
And the user chooses Type of Ingredient in Create recipe
And the user presses Create Button in Create recipe
Then the user should see the message 'Рецепт был успешно создан'