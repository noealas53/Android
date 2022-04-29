package com.alasn.dummydictionary

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alasn.dummydictionary.repository.DictionaryRepository

class WordViewModel(private val repository: DictionaryRepository): ViewModel() {
    val words = repository.words
}

class WordViewModelFactory(private val repository: DictionaryRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WordViewModel::class.java)) {
            return WordViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}