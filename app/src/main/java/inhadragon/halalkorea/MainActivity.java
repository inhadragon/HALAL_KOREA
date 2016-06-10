package inhadragon.halalkorea;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "semua lancar alhamdullillah");

        Button btnsnacks = (Button)(findViewById(R.id.btnsnacks));
        btnsnacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snack = new Intent(MainActivity.this,SnacksActivity.class);
                startActivity(snack);

                Log.i(TAG, "makancokicoki");

            }
        });
        Button btndairyproducts = (Button)(findViewById(R.id.btndairyproduct));
        btndairyproducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DAIRY = new Intent(MainActivity.this,DairyProductActivity.class);
                startActivity(DAIRY);
                Log.i(TAG, "kitaminumsusu");

            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    }



