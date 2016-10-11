package cz.brouk.englishproverbs;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProverbListActivity extends Activity {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proverb_list);

        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView );

        ArrayList<String> proverbList = new ArrayList<String>();
        proverbList.addAll( MainActivity.proverbs.getAllProverbs() );

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, proverbList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter(listAdapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                stupitFce(view, position);
//                Toast.makeText(getApplicationContext(),
//                        "Click ListItem Number " + position, Toast.LENGTH_LONG)
//                        .show();
            }
        });
    }

    public void stupitFce(View view, int position) {
        // random proverb detail in new Activity
        Intent intent = new Intent(this, ProverbDetail.class);
        Proverb proverb = MainActivity.proverbs.getProverb(position);
        intent.putExtra(MainActivity.PROVERB_TEXT, proverb.getProverb());
        intent.putExtra(MainActivity.PROVERB_DESCRIPTION, proverb.getDescription());
        startActivity(intent);
    }

}
