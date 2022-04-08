package com.alasn.contadorviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.alasn.contadorviewmodel.databinding.ActivityMainBinding
import kotlinx.coroutines.newSingleThreadContext

class MainActivity : AppCompatActivity() {

    //Data
    private var scoreTeamA = 0
    private var scoreTeamB = 0

    private val viewModel:MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.textTeamA.setText(viewModel.number)

        binding.actionPointA.setOnClickListener {
            binding.textTeamA.text = viewModel.addNumber().toString()
        }

    }
}