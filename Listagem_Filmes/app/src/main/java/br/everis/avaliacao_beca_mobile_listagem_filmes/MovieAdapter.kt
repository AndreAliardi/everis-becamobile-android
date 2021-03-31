package br.everis.avaliacao_beca_mobile_listagem_filmes

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val movie_poster: ImageView = itemView.findViewById(R.id.movie_poster)
    val movie_title: TextView = itemView.findViewById(R.id.movie_title)
    val movie_voteAvarage: TextView = itemView.findViewById(R.id.movie_voteAvarage)
    val movie_releaseDate: TextView = itemView.findViewById(R.id.movie_releaseDate)
}