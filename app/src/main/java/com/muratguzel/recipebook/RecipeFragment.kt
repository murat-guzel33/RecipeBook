package com.muratguzel.recipebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class RecipeFragment : Fragment() {
    var foodImage : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        foodImage = view?.findViewById(R.id.foodImage)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val saveButton = view.findViewById<Button>(R.id.saveButton)
        val foodImage = view.findViewById<ImageView>(R.id.foodImage)
        saveButton.setOnClickListener {
            kaydet(it)
        }
        foodImage.setOnClickListener {
            gorselSec(it)
        }
    }

    private fun kaydet(view: View) {
        // save to sqlite
    }

    private fun gorselSec(view: View) {
        activity?.let {


        }

    }
}
