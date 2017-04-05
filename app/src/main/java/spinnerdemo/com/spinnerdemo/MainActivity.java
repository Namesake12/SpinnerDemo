package spinnerdemo.com.spinnerdemo;

import android.support.v7.app.*;
import android.os.*;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp1 = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adpt = ArrayAdapter.createFromResource(this, R.array.options, android.R.layout.simple_spinner_item);
        adpt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adpt);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("position","Selected position is "+position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
