package uit.lap2.ex2_18520526;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {
    EditText edit_email, edit_name, edit_project;
    Button btn_ShowContactInfo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getLayout();
        btn_ShowContactInfo.setOnClickListener((View view) -> {
            Intent intent = new Intent(getApplicationContext(), ContactFinishActivity.class);
            Bundle i = putBundle();
            intent.putExtras(i);
            startActivity(intent);
        });
    }
    private void getLayout(){
        btn_ShowContactInfo = findViewById(R.id.btn_ViewInfo);
        edit_email = findViewById(R.id.edit_email);
        edit_name = findViewById(R.id.edit_name);
        edit_project = findViewById(R.id.edit_project);
    }
    private Bundle putBundle(){
        Bundle bundle = new Bundle();
        bundle.putString("nameKey", edit_email.getText().toString());
        bundle.putString("emailKey", edit_email.getText().toString());
        bundle.putString("projectKey", edit_project.getText().toString());

        return bundle;
    }
}
