package com.example.tryl.PopupMenu;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.tryl.R;

public class PopupEventHandler implements PopupMenu.OnMenuItemClickListener {

    Context context;

    public PopupEventHandler(Context context) {
        this.context = context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.delete:
                Toast.makeText(context, "Deleteddddd", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
