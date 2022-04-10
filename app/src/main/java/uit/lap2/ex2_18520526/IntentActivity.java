package uit.lap2.ex2_18520526;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity extends AppCompatActivity {

    Button btn_call, btn_send, btn_map, btn_web;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        btn_call = findViewById(R.id.btn_call);
        btn_send = findViewById(R.id.btn_send);
        btn_map = findViewById(R.id.btn_map);
        btn_web = findViewById(R.id.btn_web);


        btn_call.setOnClickListener((View view) -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:" + "123456789"));
            startActivity(callIntent);
        });

        btn_web.setOnClickListener((View view) -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
            startActivity(intent);
        });

        btn_send.setOnClickListener((View view) -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(android.content.Intent.EXTRA_TEXT,"Hello everyone");
            startActivity(intent);
        });

        btn_map.setOnClickListener((View view) -> {
            String url = "https://www.google.com/maps/place/Vi%E1%BB%87t+Nam/@15.6285078,96.8669929,5z/data=!3m1!4b1!4m5!3m4!1s0x31157a4d736a1e5f:0xb03bb0c9e2fe62be!8m2!3d14.058324!4d108.277199?hl=vi-VN";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

    }
}
