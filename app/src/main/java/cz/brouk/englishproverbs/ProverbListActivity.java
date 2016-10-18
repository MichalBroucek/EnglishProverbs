package cz.brouk.englishproverbs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

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

        final ArrayList<String> proverbListString = new ArrayList<String>();    // List of proverbs strings to be displayed

        Intent intent = getIntent();
        String searchString = intent.getStringExtra(MainActivity.PROVERB_SEARCH_STRING);

        if (searchString.equalsIgnoreCase(MainActivity.ALL_PROVERBS)) {
            proverbListString.addAll(MainActivity.proverbs.getAllProverbsString());
        }
        else {

            for (Proverb proverb : MainActivity.proverbs.getSearchedProverbs()) {
                proverbListString.add(proverb.getProverb());
            }
        }

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, proverbListString);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter(listAdapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                startProverbDetailActivity(view, proverbListString.get(position));
            }
        });
    }

    public void startProverbDetailActivity(View view, String proverbStr) {
        Intent intent = new Intent(this, ProverbDetail.class);

        Proverb proverb = MainActivity.proverbs.getProverb(proverbStr);

        intent.putExtra(MainActivity.PROVERB_TEXT, proverb.getProverb());
        intent.putExtra(MainActivity.PROVERB_DESCRIPTION, proverb.getDescription());
        startActivity(intent);
    }

}
