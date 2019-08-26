package com.islam.antsiclopedia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.islam.antsiclopedia.entity.Ant
import kotlinx.android.synthetic.main.item_ant.view.*

class AntListAdapter(
    private val context: Context,
    private val ants: List<Ant>,
    private val listener: (Ant) -> Unit
) : RecyclerView.Adapter<AntListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder = ViewHolder(LayoutInflater.from(parent.context)
        .inflate(R.layout.item_ant, parent, false))

    override fun getItemCount(): Int {
        return ants.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentAnt = ants[position]

        Glide.with(context).load(currentAnt.imageUrl).into(holder.image) // Set Ant Image
        holder.name.text = currentAnt.name
        holder.latin.text = currentAnt.latin

        holder.bind(currentAnt, listener) // Bind current item with an OnClickListener
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.antImage
        val name: TextView = view.antName
        val latin: TextView = view.antLatinName

        fun bind(ant: Ant, listener: (Ant) -> Unit) {
            view.setOnClickListener { listener(ant) }
        }
    }

}