package br.everis.avaliacao_beca_mobile_listagem_filmes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.everis.avaliacao_beca_mobile_listagem_filmes.model.Movie
import com.bumptech.glide.Glide


class MovieAdapter (
    private val context: Context,
    private val movieList: List<Movie>
) : RecyclerView.Adapter<MovieViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
        MovieViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item, parent, false))

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: Movie = movieList[position]

        holder.movie_title.text = movie.title ?: ""
        holder.movie_releaseDate.text = movie.release_date ?: ""
        holder.movie_voteAvarage.text = movie.vote_avarage ?: ""
        Glide.with(context).load(movie.poster_path).into(holder.movie_poster)
    }

}

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val movie_poster: ImageView = itemView.findViewById(R.id.movie_poster)
    val movie_title: TextView = itemView.findViewById(R.id.movie_title)
    val movie_voteAvarage: TextView = itemView.findViewById(R.id.movie_voteAvarage)
    val movie_releaseDate: TextView = itemView.findViewById(R.id.movie_releaseDate)
}