package br.everis.avaliacao_beca_mobile_listagem_filmes.api

import br.everis.avaliacao_beca_mobile_listagem_filmes.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {
    @GET("day?api_key=876f44a49bfae740fca692cd990c780c")
    fun getMovieApi(): Call<List<Movie?>?>?
}