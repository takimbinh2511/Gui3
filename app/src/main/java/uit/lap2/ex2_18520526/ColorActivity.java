package uit.lap2.ex2_18520526;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ColorActivity extends AppCompatActivity {

    RadioButton radio_red, radio_green, radio_blue, radio_gray;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivty_color);

        View color_view = findViewById(R.id.view_color);
        radio_red = findViewById(R.id.radio_red);
        radio_green = findViewById(R.id.radio_green);
        radio_blue = findViewById(R.id.radio_blue);
        radio_gray = findViewById(R.id.radio_gray);

        radio_red.setOnClickListener((View view) -> color_view.setBackgroundResource(R.color.red));
        radio_green.setOnClickListener((View view) -> color_view.setBackgroundResource(R.color.green));
        radio_blue.setOnClickListener((View view) -> color_view.setBackgroundResource(R.color.blue));
        radio_gray.setOnClickListener((View view) -> color_view.setBackgroundResource(R.color.gray));
    }
}
