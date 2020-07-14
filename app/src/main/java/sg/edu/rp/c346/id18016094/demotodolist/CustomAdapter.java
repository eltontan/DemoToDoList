package sg.edu.rp.c346.id18016094.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ToDoItem>{

    Context parent_context;
    int layout_id;
    private ArrayList<ToDoItem> alToDo;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        alToDo = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.tv1);
        TextView tvDate = rowView.findViewById(R.id.tv2);

        // Obtain the Android Version information based on the position
        // Set values to the TextView to display the corresponding information

        tvTitle.setText(alToDo.get(position).getTitle());
        tvDate.setText(alToDo.get(position).toString());

        return rowView;
    }
}