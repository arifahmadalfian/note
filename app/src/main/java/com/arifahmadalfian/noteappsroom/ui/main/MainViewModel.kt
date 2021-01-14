package com.arifahmadalfian.noteappsroom.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.arifahmadalfian.noteappsroom.database.Note
import com.arifahmadalfian.noteappsroom.repository.NoteRepository

class MainViewModel(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(sort: String): LiveData<PagedList<Note>> {
        return LivePagedListBuilder(mNoteRepository.getAllNotes(sort), 20).build()
    }
}