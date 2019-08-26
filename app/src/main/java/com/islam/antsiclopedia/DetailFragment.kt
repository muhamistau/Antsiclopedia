package com.islam.antsiclopedia


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail.*
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.islam.antsiclopedia.entity.Ant
import kotlinx.android.synthetic.main.content.*


class DetailFragment : Fragment() {

    lateinit var ant: Ant

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        toolbar.setupWithNavController(findNavController())
        ant = DetailFragmentArgs.fromBundle(arguments!!).Ant

        toolbar.title = ant.name

        Glide.with(this).load(ant.imageUrl).into(header)

        latinName.text = ant.latin
        description.text = ant.description
    }
}
