fun main() {
    val recipe = Recipe("onions", "50 minutes", "gas", "hnm")
    println(recipe.displayRecipe())

    val moroccanRecipe = MoroccanRecipe("Kienyeji", "onions", "50 minutes", "gas", "hnm")
    println(moroccanRecipe.displayRecipe())

    val ethiopianRecipe = EthiopianRecipe("Kienyeji", "onions", "50 minutes", "gas", "hnm")
    println(ethiopianRecipe.displayRecipe())
}



open class Recipe(val uniqueIngredients: String, val preparationTime: String, val cookingMethod: String, val nutritional: String) {
    open fun displayRecipe(): String {
        return "The meals served in most countries have different $uniqueIngredients, $preparationTime, and its own $cookingMethod and $nutritional."
    }
}

class MoroccanRecipe(val name: String, uniqueIngredients: String, preparationTime: String, cookingMethod: String, nutritional: String) : Recipe(uniqueIngredients, preparationTime, cookingMethod, nutritional) {
    override fun displayRecipe(): String {
        return "The meals from Morocco have $uniqueIngredients, $preparationTime, and its own $cookingMethod and $nutritional. The food is $name."
    }
}

open class EthiopianRecipe(val spices: String, uniqueIngredients: String, preparationTime: String, cookingMethod: String, nutritional: String) : Recipe(uniqueIngredients, preparationTime, cookingMethod, nutritional) {
    override fun displayRecipe(): String {
        return "The meals from Ethiopia have $spices, $uniqueIngredients, $preparationTime, and its own $cookingMethod and $nutritional."
    }
}

class NigerianRecipe(val cookingOil: String, spices: String, uniqueIngredients: String, preparationTime: String, cookingMethod: String, nutritional: String) : EthiopianRecipe(spices, uniqueIngredients, preparationTime, cookingMethod, nutritional) {
    override fun displayRecipe(): String {
        return "The meals from Nigeria have $uniqueIngredients, $preparationTime, and its own $cookingMethod and $nutritional."
    }
}