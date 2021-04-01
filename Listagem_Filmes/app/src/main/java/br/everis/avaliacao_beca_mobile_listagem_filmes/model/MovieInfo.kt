package br.everis.avaliacao_beca_mobile_listagem_filmes.model

import com.google.gson.annotations.SerializedName

data class MovieInfo (
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("title") val title: String,
    @SerializedName("id") val id: String,
//    @SerializedName("genre_ids") val genre_ids: List<String>,
    @SerializedName("release_date") val release_date: String
)