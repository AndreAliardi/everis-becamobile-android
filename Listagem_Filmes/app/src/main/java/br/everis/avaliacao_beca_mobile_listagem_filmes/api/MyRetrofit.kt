package br.everis.avaliacao_beca_mobile_listagem_filmes.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofit {

    private val retrofit: Retrofit
    fun movieApi(): MovieApi{
        return retrofit.create(MovieApi::class.java)
    }

    companion object{
        private const val BASE_URL = "https://api.themoviedb.org/3/trending/movie/"
        var myRetrofit: MyRetrofit? = null

        @get:Synchronized
        val instance: MyRetrofit?
            get() {
                if (myRetrofit == null) {
                    myRetrofit = MyRetrofit()
                }
                return myRetrofit
            }
    }

    init {
        retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}