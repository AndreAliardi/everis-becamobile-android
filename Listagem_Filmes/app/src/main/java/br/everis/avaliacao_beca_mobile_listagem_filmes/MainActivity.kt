package br.everis.avaliacao_beca_mobile_listagem_filmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.everis.avaliacao_beca_mobile_listagem_filmes.api.MyRetrofit
import br.everis.avaliacao_beca_mobile_listagem_filmes.model.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    lateinit var recyclerMovies: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMovies = findViewById(R.id.recycler_movies)
        recyclerMovies.layoutManager = LinearLayoutManager(this)
    }

    private fun getData(){
        val call: Call<List<Movie>> = MyRetrofit.instance?.movieApi()?.getMovieApi() as Call<List<Movie>>

        call.enqueue(object : Callback<List<Movie>> {
            override fun onFailure(call: Call<List<Movie>>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>) {
                TODO("Not yet implemented")
            }

        }
}