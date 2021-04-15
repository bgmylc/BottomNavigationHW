package com.begumyolcu.navigationhw

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_addition.view.*


class AdditionFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_addition, container, false)

        tasarim.buttonAdd.setOnClickListener {
           var addResult = 0
            try {
                val addOne = Integer.parseInt(tasarim.textInputAddOne.text.toString())
                val addTwo = Integer.parseInt(tasarim.textInputAddTwo.text.toString())
                addResult = addOne + addTwo
            }

            catch (e: NumberFormatException){

                addResult = 0
            }
            val gecis = AdditionFragmentDirections.addResultGecis(addResult)
            Navigation.findNavController(it).navigate(gecis)

        }

        (activity as AppCompatActivity).delegate.setSupportActionBar(toolbarHome)

        return tasarim
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    
}