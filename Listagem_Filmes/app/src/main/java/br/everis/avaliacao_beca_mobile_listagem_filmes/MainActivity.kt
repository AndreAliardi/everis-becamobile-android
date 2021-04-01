package br.everis.avaliacao_beca_mobile_listagem_filmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.everis.avaliacao_beca_mobile_listagem_filmes.api.MyRetrofit
import br.everis.avaliacao_beca_mobile_listagem_filmes.model.Movie
import br.everis.avaliacao_beca_mobile_listagem_filmes.model.MovieInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity(), ClickMovieDetailListener {

    lateinit var recyclerMovies: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMovies = findViewById(R.id.recycler_movies)
        recyclerMovies.layoutManager = LinearLayoutManager(this)
        getData()
    }

    private fun getData(){
        val call: Call<Movie> = MyRetrofit.instance?.movieApi()?.getMovieApi() as Call<Movie>

        call.enqueue(object : Callback<Movie> {
            override fun onFailure(call: Call<Movie>, t: Throwable) {
                Log.d("Response", t.toString())
                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                val adapter = MovieAdapter(this@MainActivity, response.body()!!)
                recyclerMovies.adapter = adapter
            }
        })
    }

    override fun clickMovieDetail(movieInfo: MovieInfo) {
        TODO("Not yet implemented")
    }
}