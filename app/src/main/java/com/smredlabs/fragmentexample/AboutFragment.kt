package com.smredlabs.fragmentexample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class AboutFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        (activity as AppCompatActivity).supportActionBar?.title = "About"

        val about = view.findViewById<TextView>(R.id.tvAbout)
        about.text = "In about fragment"

        return view
    }

}