package algonquin.cst2335.ju000013;



import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import algonquin.cst2335.ju000013.sunrisesunsetApi.SunriseSunsetLookupActivity;
import algonquin.cst2335.ju000013.recipeapi.RecipeSearchActivity;
import algonquin.cst2335.ju000013.songApi.SongSearchActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_toobar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item_1){
            Intent intent = new Intent(MainActivity.this, SunriseSunsetLookupActivity.class);
            startActivity(intent);
        } else if (id == R.id.item_2) {
            Intent intent = new Intent(MainActivity.this, RecipeSearchActivity.class);
            startActivity(intent);
        } else if (id == R.id.item_3) {
            Intent intent = new Intent(MainActivity.this, DictionaryApiActivity.class);
            startActivity(intent);
        } else if (id == R.id.item_4) {
            Intent intent = new Intent(MainActivity.this, SongSearchActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSunriseSunsetLookup = findViewById(R.id.button1);
        Button buttonRecipeSearch = findViewById(R.id.button2);
        Button buttonDictionaryApi = findViewById(R.id.button3);
        Button buttonSongSearch = findViewById(R.id.button4);


        Toolbar tool_bar = findViewById(R.id.toolbar);
        setSupportActionBar(tool_bar);

        buttonRecipeSearch.setOnClickListener(click ->{
            Intent intent = new Intent(MainActivity.this, RecipeSearchActivity.class);
            startActivity(intent);
        });

        buttonDictionaryApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DictionaryApiActivity.class);
                startActivity(intent);
            }
        });


        buttonSunriseSunsetLookup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SunriseSunsetLookupActivity.class);
                startActivity(intent);
              }
        });

        /**
         * Set click listener for Deezer Song Search API
         */
        buttonSongSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Replace DeezerSongSearchApiActivity.class with the actual class name for this activity
                 */
                Intent intent = new Intent(MainActivity.this, SongSearchActivity.class);
                startActivity(intent);
            }
        });

    }
}
