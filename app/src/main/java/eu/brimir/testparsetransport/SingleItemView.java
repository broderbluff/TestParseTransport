package eu.brimir.testparsetransport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Patrik on 2015-07-18.
 */
public class SingleItemView extends Activity {
    // Declare Variables
    TextView txtname;
    String name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from singleitemview.xml
        setContentView(R.layout.singleitemview);

        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();

        // Get the name
        name = i.getStringExtra("name");

        // Locate the TextView in singleitemview.xml
        txtname = (TextView) findViewById(R.id.name);

        // Load the text into the TextView
        txtname.setText(name);

    }
}