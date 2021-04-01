package br.everis.avaliacao_beca_mobile_listagem_filmes.model

import com.google.gson.annotations.SerializedName
//Informações padrões
//capa, título, gênero, data lançamento

//quando seleciona o filme:
//capa, título, rating, sinopse

data class Movie(
//    teste com outra API
//    val title: String?,
//    val userId: Int?,
//    val id: Int?,
//    val body: String?

    @SerializedName("page") val page: Int,
    @SerializedName("result") val result: List<MovieInfo>

//    @SerializedName("page")
//    val page: Int?,
//    @SerializedName("results")
//    val results: List<Objects>,
//    @SerializedName("adult")
//    val adult: Boolean?,
//    @SerializedName("backdrop_path")
//    val backdrop_path: String?,
//    @SerializedName("genre_ids")
//    val genre_ids: List<Int>?,
//    @SerializedName("id")
//    val id: Int?,
//    @SerializedName("media_type")
//    val media_type: String?,
//    @SerializedName("original_language")
//    val original_language: String?,
//    @SerializedName("original_title")
//    val original_title: String?,
//    @SerializedName("overview")
//    val overview: String?,
//    @SerializedName("popularity")
//    val popularity: Float?,
//    @SerializedName("poster_path")
//    val poster_path: String?,
//    @SerializedName("release_date")
//    val release_date: String?,
//    @SerializedName("title")
//    val title: String?,
//    @SerializedName("video")
//    val video: Boolean?,
//    @SerializedName("vote_avarage")
//    val vote_avarage: String?,
//    @SerializedName("vote_count")
//    val vote_count: Int?
)