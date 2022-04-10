package uit.lap2.ex2_18520526;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMenu, btnColor, btnCalculator, btnInfo, btnIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu = findViewById(R.id.btn_MenuOption);
        btnColor = findViewById(R.id.btn_ChangeColor);
        btnCalculator = findViewById(R.id.btn_Calculator);
        btnInfo = findViewById(R.id.btn_Contact);
        btnIntent = findViewById(R.id.btn_Intent);

        btnMenu.setOnClickListener((View view) -> ToMenu());
        btnColor.setOnClickListener((View view) -> ToChangeColor());
        btnCalculator.setOnClickListener((View view) -> ToCalculator());
        btnInfo.setOnClickListener((View view) -> ToContactInfo());
        btnIntent.setOnClickListener((View view) -> ToIntent());
        getSupportActionBar().hide();

    }

    private void ToMenu() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    private void ToChangeColor() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, ColorActivity.class);
        startActivity(intent);
    }

    private void ToCalculator() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, CalculatorActivity.class);
        startActivity(intent);
    }

    private void ToContactInfo() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, ContactActivity.class);
        startActivity(intent);
    }

    private void ToIntent() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, IntentActivity.class);
        startActivity(intent);
    }

}