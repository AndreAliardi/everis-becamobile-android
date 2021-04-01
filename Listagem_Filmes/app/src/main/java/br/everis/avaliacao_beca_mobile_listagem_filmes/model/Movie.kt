package br.everis.avaliacao_beca_mobile_listagem_filmes.model

import com.google.gson.annotations.SerializedName
//Informações padrões
//capa, título, gênero, data lançamento, id

//quando seleciona o filme:
//capa, título, rating, sinopse, id

data class Movie(
//    teste com outra API
//    val title: String?,
//    val userId: Int?,
//    val id: Int?,
//    val body: String?

    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: List<MovieInfo>


)