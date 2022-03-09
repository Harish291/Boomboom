package harish.project.boomboom;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    //defining objects
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connecting xml to java
        imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("ImageButton", "clicked");
                //forwading mainactivity to startgame using Intent
                Intent intent = new Intent(MainActivity.this,StartGame.class);
                startActivity(intent);
                finish();
            }
        });
    }


}
