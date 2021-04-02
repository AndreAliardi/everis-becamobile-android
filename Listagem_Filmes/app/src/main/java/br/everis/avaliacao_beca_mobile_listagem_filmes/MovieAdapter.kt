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
    private val movieList: Movie
) : RecyclerView.Adapter<MovieViewHolder>(){

    companion object{
        private const val POSTER_BASE_URL = "https://image.tmdb.org/t/p/w342"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
        MovieViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item, parent, false))

    override fun getItemCount(): Int = movieList.results.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movieInfo = movieList.results.get(position)
        holder.movieTitle.text = movieInfo.title
        holder.movieReleaseDate.text = movieInfo.release_date
        holder.movieVoteAverage.text = movieInfo.vote_average
        Glide.with(context).load(POSTER_BASE_URL + movieInfo.poster_path).into(holder.moviePosterPath)
    }
}

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val movieTitle: TextView = itemView.findViewById(R.id.movie_title)
    val movieReleaseDate: TextView = itemView.findViewById(R.id.movie_releaseDate)
    val movieVoteAverage: TextView = itemView.findViewById(R.id.movie_voteAvarage)
    val moviePosterPath: ImageView = itemView.findViewById(R.id.movie_poster)

}