package com.begumyolcu.navigationhw

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_addition.view.*
import kotlinx.android.synthetic.main.fragment_multiplication.view.*
import java.lang.NumberFormatException


class MultiplicationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tasarim = inflater.inflate(R.layout.fragment_multiplication, container, false)

        tasarim.buttonMultiplication.setOnClickListener {
            var multResult = 0
            try {
                val multOne = Integer.parseInt(tasarim.textMultiplicationOne.text.toString())
                val multTwo = Integer.parseInt(tasarim.textMultiplicationTwo.text.toString())
                multResult = multOne * multTwo
            }
            catch (e: NumberFormatException){
                multResult = 0
            }

            val gecis = MultiplicationFragmentDirections.multResultGecis(multResult)
            Navigation.findNavController(it).navigate(gecis)

        }

        (activity as AppCompatActivity).setSupportActionBar(toolbarHome)

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