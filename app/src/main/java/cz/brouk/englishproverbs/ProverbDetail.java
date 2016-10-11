package cz.brouk.englishproverbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class ProverbDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proverb_detail);

        Intent intent = getIntent();

        String proverbTextStr = intent.getStringExtra(MainActivity.PROVERB_TEXT);
        TextView proverbText = (TextView) findViewById(R.id.proverb_text);
        proverbText.setText(proverbTextStr);

        String proverbDescriptionStr = intent.getStringExtra(MainActivity.PROVERB_DESCRIPTION);
        TextView proverbTextDescription = (TextView) findViewById(R.id.proverb_description);
        proverbTextDescription.setText(proverbDescriptionStr);

    }
}
