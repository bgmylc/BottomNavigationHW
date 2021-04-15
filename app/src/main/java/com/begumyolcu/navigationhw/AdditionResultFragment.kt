package com.begumyolcu.navigationhw

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_addition_result.view.*
import kotlinx.android.synthetic.main.fragment_multiplication_result.view.*


class AdditionResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_addition_result, container, false)

        val bundle: AdditionResultFragmentArgs by navArgs()
        val resultAdd = bundle.toplamaSonuc

        tasarim.textViewAddResult.text = "Toplama Sonuç: " + resultAdd.toString()

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

