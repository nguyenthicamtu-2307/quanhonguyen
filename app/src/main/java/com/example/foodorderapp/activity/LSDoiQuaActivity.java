
package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;

import java.util.ArrayList;

public class LSDoiQuaActivity extends AppCompatActivity {
    ListView lvmonPQ,lvmonPQ1,lvmonPQ2;
    ArrayList<Mon> arraymon;
    MonAdapter monAdapter,monAdapter1,monAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phieudoiqua);

        monAdapter = new MonAdapter(this,R.layout.rowdoiqua,arraymon);
        lvmonPQ.setAdapter(monAdapter);
        monAdapter1 = new MonAdapter(this,R.layout.rowdoiqua,arraymon);
        lvmonPQ1.setAdapter(monAdapter1);
        monAdapter2 = new MonAdapter(this,R.layout.rowdoiqua,arraymon);
        lvmonPQ2.setAdapter(monAdapter2);



    }

}
