package com.smredlabs.fragmentexample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ArticleFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // get context
        val context = container!!.context

        // Change title in the Action Bar
        (activity as AppCompatActivity).supportActionBar?.title = "Articles"

        val view = inflater.inflate(R.layout.fragment_article, container, false)
        val article = view.findViewById<TextView>(R.id.tvArticle)
        article.text = "I am in Article Fragment"

        return view
    }


}