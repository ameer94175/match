package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivitySearchBinding

class SearchActivity : BaseActivity<ActivitySearchBinding>() {
    override val LOG_TAG: String="SEARCH_ACTIVITY"
    override val bindgInFlater: (LayoutInflater) -> ActivitySearchBinding=ActivitySearchBinding::inflate


    override fun setup() {

    }

    override fun addCallbaks() {

    }

}