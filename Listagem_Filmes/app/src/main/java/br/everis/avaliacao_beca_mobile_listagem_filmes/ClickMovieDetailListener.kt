package br.everis.avaliacao_beca_mobile_listagem_filmes

import br.everis.avaliacao_beca_mobile_listagem_filmes.model.MovieInfo

interface ClickMovieDetailListener {
    fun clickMovieDetail(movieInfo: MovieInfo)
}