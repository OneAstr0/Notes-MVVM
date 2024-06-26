package com.app.notes;

import androidx.cardview.widget.CardView;

import com.app.notes.model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
