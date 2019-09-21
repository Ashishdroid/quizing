
package com.ashishramkissoon.quizzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class listViewYouTube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_you_tube);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        String versions[]=getResources().getStringArray(R.array.versions);
////
        ListView lv=findViewById(R.id.listview);
//
       lv.setAdapter(new ArrayAdapter<>(this,R.layout.list_item,versions));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //TextView tv=(TextView) view;
                //Toast.makeText(listViewYouTube.this,tv.getText().toString(),Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    Intent n18 = new Intent(listViewYouTube.this, MainActivity.class);
                    startActivity(n18);
                } else if (position == 1) {
                    Intent m18 = new Intent(listViewYouTube.this, may18.class);
                    startActivity(m18);
                } else if (position == 2) {
                    Intent n17 = new Intent(listViewYouTube.this, nov17.class);
                    startActivity(n17);
                } else if (position == 3) {
                    Intent m17 = new Intent(listViewYouTube.this, may17.class);
                    startActivity(m17);
                } else if (position == 4) {
                    Intent n16 = new Intent(listViewYouTube.this, nov16.class);
                    startActivity(n16);
                } else if (position == 5) {
                    Intent m16 = new Intent(listViewYouTube.this, may16.class);
                    startActivity(m16);
                } else if (position == 6) {
                    Intent n15 = new Intent(listViewYouTube.this, nov15.class);
                    startActivity(n15);
                } else if (position == 7) {
                    Intent m15 = new Intent(listViewYouTube.this, may15.class);
                    startActivity(m15);
                } else if (position == 8) {
                    Intent n14 = new Intent(listViewYouTube.this, nov14.class);
                    startActivity(n14);
                } else if (position == 9) {
                    Intent m14 = new Intent(listViewYouTube.this, may14.class);
                    startActivity(m14);
                } else if (position == 10) {
                    Intent n13 = new Intent(listViewYouTube.this, nov13.class);
                    startActivity(n13);
                } else if (position == 11) {
                    Intent m13 = new Intent(listViewYouTube.this, may13.class);
                    startActivity(m13);
                } else if (position == 12) {
                    Intent n12 = new Intent(listViewYouTube.this, nov12.class);
                    startActivity(n12);
                } else if (position == 13) {
                    Intent m12 = new Intent(listViewYouTube.this, may12.class);
                    startActivity(m12);
                } else if (position == 14) {
                    Intent n11 = new Intent(listViewYouTube.this, nov11.class);
                    startActivity(n11);
                } else if (position == 15) {
                    Intent m11 = new Intent(listViewYouTube.this, may11.class);
                    startActivity(m11);
                } else if (position == 16) {
                    Intent n10 = new Intent(listViewYouTube.this, nov10.class);
                    startActivity(n10);
                } else if (position == 17) {
                    Intent m10 = new Intent(listViewYouTube.this, may10.class);
                    startActivity(m10);
                } else if (position == 18) {
                    Intent n09 = new Intent(listViewYouTube.this, nov09.class);
                    startActivity(n09);
                } else if (position == 19) {
                    Intent m09 = new Intent(listViewYouTube.this, may09.class);
                    startActivity(m09);
                } else if (position == 20) {
                    Intent n08 = new Intent(listViewYouTube.this, nov08.class);
                    startActivity(n08);
                } else if (position == 21) {
                    Intent m08 = new Intent(listViewYouTube.this, may08.class);
                    startActivity(m08);
                } else if (position == 22) {
                    Intent n07 = new Intent(listViewYouTube.this, nov07.class);
                    startActivity(n07);
                } else if (position == 23) {
                    Intent m07 = new Intent(listViewYouTube.this, may07.class);
                    startActivity(m07);
                }else if (position == 24) {
                    Intent n06 = new Intent(listViewYouTube.this, nov06.class);
                    startActivity(n06);
                } else if (position == 25) {
                    Intent m06 = new Intent(listViewYouTube.this, may06.class);
                    startActivity(m06);
                } else if (position == 26) {
                    Intent n05 = new Intent(listViewYouTube.this, nov05.class);
                    startActivity(n05);
                } else if (position == 27) {
                    Intent m05 = new Intent(listViewYouTube.this, may05.class);
                    startActivity(m05);
                }else if (position == 28) {
                    Intent n04 = new Intent(listViewYouTube.this, nov04.class);
                    startActivity(n04);
                } else if (position == 29) {
                    Intent m04 = new Intent(listViewYouTube.this, may04.class);
                    startActivity(m04);
                }else if (position == 30) {
                    Intent n03 = new Intent(listViewYouTube.this, nov03.class);
                    startActivity(n03);
                } else if (position == 31) {
                    Intent m03 = new Intent(listViewYouTube.this, may03.class);
                    startActivity(m03);
                }
            }
        });

    }
}

