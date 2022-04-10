package uit.lap2.ex2_18520526;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageView image = findViewById(R.id.image_background);
        registerForContextMenu(image);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuItem = getMenuInflater();
        menuItem.inflate(R.menu.menu_option,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(MenuActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater image = getMenuInflater();
        image.inflate(R.menu.menu_context,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast.makeText(MenuActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }

}
