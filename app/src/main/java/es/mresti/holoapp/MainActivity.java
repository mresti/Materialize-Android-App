package es.mresti.holoapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

  ListView listView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listView = (ListView) findViewById(R.id.list);

    // Defined Array values to show in ListView
    String[] values = new String[] {"Android 1.0 Apple Pie",
        "Android 1.1 Banana Bread",
        "Android 1.5 Cupcake",
        "Android 1.6 Donut",
        "Android 2.0/2.1 Eclair",
        "Android 2.2 Froyo",
        "Android 2.3 Gingerbread",
        "Android 3.x Honeycomb",
        "Android 4.0.x Ice Cream Sandwich",
        "Android 4.1/4.2/4.3 Jelly Bean",
        "Android 5.0 Lollipop"
    };

    // Define a new Adapter
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1, android.R.id.text1, values);

    // Assign adapter to ListView
    listView.setAdapter(adapter);

    // ListView Item Click Listener
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

      @Override
      public void onItemClick(AdapterView<?> parent, View view,
                              int position, long id) {

        // ListView Clicked item index
        int itemPosition = position;

        // ListView Clicked item value
        String itemValue = (String) listView.getItemAtPosition(position);

        // Show Alert
        Toast.makeText(getApplicationContext(),
            "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
            .show();

      }

    });
  }
}
