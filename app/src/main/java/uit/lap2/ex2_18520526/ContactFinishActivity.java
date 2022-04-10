package uit.lap2.ex2_18520526;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactFinishActivity extends AppCompatActivity {

    TextView text_name, text_email, text_project;
    Button btn_Finish;
    String name, email, project;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_contact);

        text_name = findViewById(R.id.text_name);
        text_email = findViewById(R.id.text_email);
        text_project = findViewById(R.id.text_project);
        btn_Finish = findViewById(R.id.btn_ViewFinish);

        getBundle();
        btn_Finish.setOnClickListener((View view) -> {
//            Turn back activity
            finish();
        });
    }
    private void getBundle() {
        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("nameKey");
        email = bundle.getString("emailKey");
        project = bundle.getString("projectKey");

        text_name.setText(name);
        text_email.setText(email);
        text_project.setText(project);
    }
}
