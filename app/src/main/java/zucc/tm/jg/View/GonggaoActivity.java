package zucc.tm.jg.View;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import zucc.tm.jg.R;
import zucc.tm.jg.adapter.gonggaoAdapter;

public class GonggaoActivity extends AppCompatActivity {
    private ListView list;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gonggao);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("添加项目");//设置Toolbar标题
        toolbar.setTitleTextColor(Color.parseColor("#ffffff")); //设置标题颜色
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        list = (ListView) findViewById(R.id.list);
        gonggaoAdapter adapter = new gonggaoAdapter(this);
        list.setAdapter(adapter);
    }

}