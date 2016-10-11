package cz.brouk.englishproverbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public final static String PROVERB_TEXT = "cz.brouk.englishproverbs.PROVERB_TEXT";
    public final static String PROVERB_DESCRIPTION = "cz.brouk.englishproverbs.PROVERB_DESCRIPTION";

    public static ProverbFactory proverbs;
    private String randomProverbText;
    private String randomProverbDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeProverbs();
        Button buttonRandom = (Button) findViewById(R.id.button_random);
        buttonRandom.setText(this.randomProverbText);
    }

    public void searchProverb(View view) {
        // search for proverbs and create new Activity
    }

    public void allProverbs(View view) {
        // list of all proverbs in new Activity
        Intent intent = new Intent(this, ProverbListActivity.class);
        startActivity(intent);
    }

    public void randomProverbDetail(View view) {
        // random proverb detail in new Activity
        Intent intent = new Intent(this, ProverbDetail.class);
        intent.putExtra(PROVERB_TEXT, this.randomProverbText);
        intent.putExtra(PROVERB_DESCRIPTION, this.randomProverbDescription);
        startActivity(intent);
    }

    private void initializeProverbs() {
        this.proverbs = new ProverbFactory();
        Proverb randomProverb = this.proverbs.getRandomProverb();
        this.randomProverbText = randomProverb.getProverb();
        this.randomProverbDescription = randomProverb.getDescription();
    }



}
