package br.everis.avaliacao_beca_mobile_listagem_filmes.api

import br.everis.avaliacao_beca_mobile_listagem_filmes.model.Movie
import br.everis.avaliacao_beca_mobile_listagem_filmes.model.MovieInfo
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {
    @GET("week?api_key=876f44a49bfae740fca692cd990c780c")
    fun getMovieApi(): Call<Movie?>?

}