package br.everis.avaliacao_beca_mobile_listagem_filmes

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.everis.avaliacao_beca_mobile_listagem_filmes.model.Movie

class MovieAdapter (
    private val context: Context,
    private val movieList: List<Movie>
) : RecyclerView.Adapter<MovieViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val movie_poster: ImageView = itemView.findViewById(R.id.movie_poster)
    val movie_title: TextView = itemView.findViewById(R.id.movie_title)
    val movie_voteAvarage: TextView = itemView.findViewById(R.id.movie_voteAvarage)
    val movie_releaseDate: TextView = itemView.findViewById(R.id.movie_releaseDate)
}