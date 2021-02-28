package com.example.recepieappcompose.network

import com.google.gson.annotations.SerializedName

class RecipeNetworkEntity (
    var pk: Int? = null,
    var title: String? = null,
    var publisher: String? = null,
    var rating: Int? = null,
    var source_url: String? = null,
    var description: String? = null,
    var cooking_instructions: String? = null,
    var ingredients: List<String>? = null,
    var date_added: String? = null,
    var date_updated: String? = null,
        ) {
}