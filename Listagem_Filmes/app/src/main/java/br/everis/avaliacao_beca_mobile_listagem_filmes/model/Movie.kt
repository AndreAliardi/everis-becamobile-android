package br.everis.avaliacao_beca_mobile_listagem_filmes.model

import com.google.gson.annotations.SerializedName

data class Movie(

    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: List<MovieInfo>


)