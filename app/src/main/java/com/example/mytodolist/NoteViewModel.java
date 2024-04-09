package com.example.mytodolist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private NoteReposatory noteReposatory;
    private LiveData<List<Note>> notelist;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        noteReposatory =new NoteReposatory(application);
        notelist = noteReposatory.getAllData();
    }

    public void insert(Note note) {
        noteReposatory.insertData(note);
    }
    public void update(Note note) {
        noteReposatory.updateData(note);
    }
    public void delete(Note note) {
        noteReposatory.deleteData(note);
    }
    public LiveData<List<Note>> getAllNotes(){
        return notelist;
    }
}
