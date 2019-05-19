package com.example.tryl.ActionMode;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.tryl.R;

public class ActionModeActivity extends AppCompatActivity {
    private ImageView image;
    private Toolbar mtoolbar;
    private ActionMode actionMode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_mode);

        mtoolbar=findViewById(R.id.atoolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("Action mode");

        image = findViewById(R.id.image_actionMode);

        image.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (actionMode != null) {

                    return false;
                } else {

                    actionMode = ActionModeActivity.this.startActionMode(callback);

                }
                return true;
            }
        });
    }

    private ActionMode.Callback callback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            getMenuInflater().inflate(R.menu.floating_contextual_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("selected");
            return true;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            switch (menuItem.getItemId()) {
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            actionMode = null;

        }
    };
}
