package eg.gov.iti.tripplanner.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import eg.gov.iti.tripplanner.R;

/**
 * Created by Ahmed_Mokhtar on 3/30/2018.
 */

public class ReminderNoteAdapter extends ArrayAdapter<String> {

    public ReminderNoteAdapter(Context context, List<String> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View customView = convertView;

        if (customView == null) {
            customView = LayoutInflater.from(getContext()).inflate(R.layout.reminder_note_cell, parent, false);
        }

        String note = getItem(position);

        TextView noteTextView = customView.findViewById(R.id.reminder_note_text_view);
        noteTextView.setText(note);

        return customView;
    }
}
