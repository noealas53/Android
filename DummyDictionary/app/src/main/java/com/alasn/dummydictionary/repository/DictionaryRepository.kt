package com.alasn.dummydictionary.repository

import com.alasn.dummydictionary.data.dao.AntonymDao
import com.alasn.dummydictionary.data.dao.SynonymDao
import com.alasn.dummydictionary.data.dao.WordDao
import com.alasn.dummydictionary.data.model.Word

class DictionaryRepository(
    private val wordDoa: WordDao,
    val synonymDao: SynonymDao,
    val antonymDao: AntonymDao
) {

    fun getAllWords() = wordDoa.getAllWords()

    suspend fun addWord(word: Word) {
        wordDoa.insertWord(word)
    }
}