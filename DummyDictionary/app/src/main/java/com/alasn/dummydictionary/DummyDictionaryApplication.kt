package com.alasn.dummydictionary

import android.app.Application
import com.alasn.dummydictionary.data.DummyDictionaryDatabase
import com.alasn.dummydictionary.repository.DictionaryRepository

class DummyDictionaryApplication : Application() {
    val dataBase by lazy {
        DummyDictionaryDatabase.getInstance(this)
    }

    fun getDictionaryRepository() = with(dataBase) {
        DictionaryRepository(wordDao(), synonymDao(), antonymDao())
    }
}

