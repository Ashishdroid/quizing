package com.ashishramkissoon.quizzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class threshold extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threshold);

        final int[] thresholdArray=new int[]{R.drawable.nov18threshold,R.id.imageView2Nov17,R.drawable.nov16threshold,
                                                R.drawable.may18threshold,R.drawable.may17threshold,R.drawable.may16threshold};

       final ImageView  imageViewNov18=findViewById(R.id.imageView2Nov18);
     final   ImageView  imageViewMay18=findViewById(R.id.imageView2May18);
    final    ImageView  imageViewNov17=findViewById(R.id.imageView2Nov17);
     final    ImageView  imageViewMay17=findViewById(R.id.imageView2May17);
   final     ImageView  imageViewNov16=findViewById(R.id.imageView2Nov16);
   final     ImageView  imageViewMay16=findViewById(R.id.imageView2May16);



        String thresholdString[]=getResources().getStringArray(R.array.thresholdString);

        ListView lv=findViewById(R.id.listviewThreshold);

        lv.setAdapter(new ArrayAdapter<>(this,R.layout.list_item_threshold,thresholdString));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent intent=new Intent(threshold.this,nov18threshold.class);
                    startActivity(intent);


                    //imageViewNov18.setImageResource(thresholdArray[0]);
                }else if (i==1){
                    Intent intent=new Intent(threshold.this,may18threshold.class);
                    startActivity(intent);

                    //    imageViewMay18.setImageResource(thresholdArray[1]);
                }else if (i==2){
                    Intent intent=new Intent(threshold.this,nov17threshold.class);
                    startActivity(intent);


                    //  imageViewNov17.setImageResource(thresholdArray[2]);
                }else if (i==3){
                    Intent intent=new Intent(threshold.this,may17threshold.class);
                    startActivity(intent);

                    //imageViewMay17.setImageResource(thresholdArray[3]);
                }else if (i==4){
                    Intent intent=new Intent(threshold.this,nov16threshold.class);
                    startActivity(intent);

                    //imageViewNov16.setImageResource(thresholdArray[4]);
                }else if (i==5){
                    Intent intent=new Intent(threshold.this,may16threshold.class);
                    startActivity(intent);

                    //imageViewMay16.setImageResource(thresholdArray[5]);
                }

            }

        });
}
}
