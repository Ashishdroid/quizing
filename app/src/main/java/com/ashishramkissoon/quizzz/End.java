package com.ashishramkissoon.quizzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class End extends ListActivity implements AdapterView.OnItemClickListener {

    public static final String EXTRA_ITEM_TITLE="extra.item.title";

    TextView tv1;

/**    String[] paperNames={"Nov 18_qp_12","June 18_qp_12","Nov 17_qp_12","June 17_qp_12","Nov 16_qp_12","June 16_qp_12",
                        "Nov 15_qp_12","June 15_qp_12","Nov 14_qp_12","June 14_qp_12","Nov 13_qp_12","June 13_qp_12","Nov 12_qp_12"
            ,"June 12_qp_12","Nov 11_qp_12","June 11_qp_12","Nov 10_qp_12","June 10_qp_12","Nov 09_qp_12","June 09_qp_12","Nov 08_qp_12"
            ,"June 08_qp_12","Nov 07_qp_12","June 07_qp_12","Nov 06_qp_12","June 06_qp_12","Nov 05_qp_12","June 05_qp_12","Nov 04_qp_12"
            ,"June 04_qp_12","Nov 03_qp_12","June 03_qp_12","Nov 02_qp_12"};

    ArrayAdapter<String>adapter;
**/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      //  tv1=findViewById(R.id.tv1);
     //   tv1.setTextSize(20);

  /**      adapter=new ArrayAdapter<String>(End.this,R.layout.content_end,paperNames);
        setListAdapter(adapter);

        ListView lstView=getListView();
        lstView.setOnItemClickListener(End.this);

**/


        String versions[]=getResources().getStringArray(R.array.versions);

        ListView lv=findViewById(R.id.listview);

        lv.setAdapter(new ArrayAdapter<>(this,R.layout.list_item,versions));




    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        String itemValue= parent.getItemAtPosition(position).toString();
     //   Toast.makeText(End.this,itemValue,Toast.LENGTH_SHORT).show();

        if(position==0) {
            Intent n18 = new Intent(End.this, MainActivity.class);
            startActivity(n18);
        }else if (position==1){
            Intent m18 = new Intent(End.this, may18.class);
            startActivity(m18);
        }else if (position==2){
            Intent n17=new Intent(End.this,nov17.class);
            startActivity(n17);
        }else if (position==3){
            Intent m17=new Intent(End.this,may17.class);
            startActivity(m17);
        }else if (position==4){
            Intent n16=new Intent(End.this, nov16.class);
            startActivity(n16);
        }else if(position==5){
            Intent m16=new Intent(End.this, may16.class);
            startActivity(m16);
        }else if(position==6){
            Intent n15= new Intent(End.this, nov15.class);
            startActivity(n15);
        }else if(position==7){
            Intent m15= new Intent(End.this,may15.class);
            startActivity(m15);
        }else if(position==8){
            Intent n14=new Intent(End.this,nov14.class);
            startActivity(n14);
        }else if (position==9){
            Intent m14=new Intent(End.this,may14.class);
            startActivity(m14);
        }else if (position==10){
            Intent n13=new Intent(End.this,nov13.class);
            startActivity(n13);
        }else if (position==11){
            Intent m13=new Intent(End.this,may13.class);
            startActivity(m13);
        }else if(position==12){
            Intent n12 = new Intent(End.this, nov12.class);
            startActivity(n12);
        }else if(position==13){
            Intent m12=new Intent(End.this,may12.class);
            startActivity(m12);
        }
    }
}


