package com.example.tryl.ActionMode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tryl.R;

import java.util.ArrayList;
import java.util.List;



public class ActionModeMultipleChoiceSelectorActivity extends AppCompatActivity {
    private static final String TAG = "ActionModeMultipleChoic";

    private ListView listView;

    private String[] country_names;

    List dataProvider= new ArrayList();

    List selection= new ArrayList();

    ArrayAdapter<String> adapter;

    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_mode_multiple_choice_selector);
        listView=findViewById(R.id.listview_multiple_choice);
        country_names=getResources().getStringArray(R.array.countries_name);

        for (String items:country_names){
            dataProvider.add(items);

        }
        adapter= new ArrayAdapter<String>(getApplicationContext(),R.layout.floating_conteual_menu_custom_layout,R.id.country_name,dataProvider);
        listView.setAdapter(adapter);

        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
                if (checked){
                    selection.add(dataProvider.get(position));
                    count++;
                    mode.setTitle(count+"Items Selected");
                }
                else {
                    selection.remove(dataProvider.get(position));
                    count--;
                    mode.setTitle(count+"Items Selected");
                }
            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                getMenuInflater().inflate(R.menu.floating_contextual_menu,menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                mode.setTitle(" 1 Items Selected");
                return true;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                switch (item.getItemId()){
                    case R.id.delete:

                        for (Object items:selection){
                            String ITEM=items.toString();
                            dataProvider.remove(ITEM);

                        }

                        adapter.notifyDataSetChanged();
                        mode.finish();

                }
                return true;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                count=0;
                selection.clear();

            }
        });

    }
}
