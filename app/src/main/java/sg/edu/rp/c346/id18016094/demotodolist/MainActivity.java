package sg.edu.rp.c346.id18016094.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView tv, tv2;
    ArrayAdapter aa;
    ArrayList<ToDoItem> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        lv = (ListView)this.findViewById(R.id.listlist);

        al = new ArrayList<ToDoItem>();

        Calendar c = Calendar.getInstance();
        c.set(2020, 8, 1);
        Calendar c1 = Calendar.getInstance();
        c1.set(2020, 8, 2);

        ToDoItem item1 = new ToDoItem("Go for date", c);
        ToDoItem item2 = new ToDoItem("Go for haircut", c1);
        al.add(item1);
        al.add(item2);

        aa = new CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(aa);
    }
}
