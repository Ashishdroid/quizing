package com.ashishramkissoon.quizzz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mIndex =0;
    int mQuestion;
    Toast toast;
    ProgressBar mProgressBar;
    int mscore;
    TextView mScoreTextView;
    char grade;
/**
    public static final String EXTRA_ITEM_TITLE="extra.item.title";
    public static final String Exercise_weight="weight lifting";
    public static final String Exercise_Y="yoga";
    public static final String Exercise_CARDIO="cardio";
    public static final String Exercise_C="c";
**/

    private   answer[] mQuestionBank=new answer[]{
            new answer(R.drawable.q1,'C'),
            new answer(R.drawable.q2,'D'),
            new answer(R.drawable.q3,'C'),
            new answer(R.drawable.q4,'D'),
            new answer(R.drawable.q5,'A'),
            new answer(R.drawable.q6,'D'),
            new answer(R.drawable.q7,'B'),
            new answer(R.drawable.q8,'B'),
            new answer(R.drawable.q9,'D'),
            new answer(R.drawable.q10,'B'),
            new answer(R.drawable.q11,'B'),
            new answer(R.drawable.q12,'B'),
            new answer(R.drawable.q13,'C'),
            new answer(R.drawable.q14,'D'),
            new answer(R.drawable.q15,'D'),
            new answer(R.drawable.q16,'C'),
            new answer(R.drawable.q17,'C'),
            new answer(R.drawable.q18,'B'),
            new answer(R.drawable.q19,'A'),
            new answer(R.drawable.q20,'B'),
            new answer(R.drawable.q21,'A'),
            new answer(R.drawable.q22,'A'),
            new answer(R.drawable.q23,'C'),
            new answer(R.drawable.q24,'A'),
            new answer(R.drawable.q25,'B'),
            new answer(R.drawable.q26,'B'),
            new answer(R.drawable.q27,'D'),
            new answer(R.drawable.q28,'B'),
            new answer(R.drawable.q29,'D'),
            new answer(R.drawable.q30,'C'),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button a=findViewById(R.id.buttonA);
        final Button b=findViewById(R.id.buttonB);
        Button c=findViewById(R.id.buttonC);
        final Button d=findViewById(R.id.buttonD);
      final  ImageView pic=findViewById(R.id.imageView);

       final ProgressBar mProgressBar= findViewById(R.id.progressBar2);
       final TextView mScoreTextView=findViewById(R.id.textView2);


        final int[] questionImage=new int[]{
                R.drawable.q1,R.drawable.q2,R.drawable.q3,R.drawable.q4,R.drawable.q5,R.drawable.q6,R.drawable.q7,R.drawable.q8,
                R.drawable.q9,R.drawable.q10,R.drawable.q11,R.drawable.q12,R.drawable.q13,R.drawable.q14,R.drawable.q15,R.drawable.q16,
                R.drawable.q17,R.drawable.q18,R.drawable.q19,R.drawable.q20,R.drawable.q21,R.drawable.q22,R.drawable.q23,R.drawable.q24,
                R.drawable.q25,R.drawable.q26,R.drawable.q27,R.drawable.q28,R.drawable.q29,R.drawable.q30};

        mQuestion=mQuestionBank[mIndex].getmQuestionId();
        pic.setImageResource(mQuestion);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          //      if (questionNo>29){
                  //  loadLastpage(MainActivity.Exercise_CARDIO);
           //     }
                checkAnswer('A');
         //   updateQuestion();
/**                if (mIndex<=29){
                pic.setImageResource(questionImage[mIndex]);
                }else{
                    loadLastpage(MainActivity.Exercise_CARDIO);
                }
               mIndex++;
 **/
                mIndex=(mIndex+1)%mQuestionBank.length;

                if(mscore>=24 && mscore<=30){
                    grade='A';
                }else if (mscore>=19 && mscore<=23){
                    grade='B';
                }else if (mscore>=15 && mscore<=18){
                    grade='C';
                }else if (mscore>=13 && mscore<=14){
                    grade='D';
                }else if (mscore>=11 && mscore<=12){
                    grade='E';
                }else{
                    grade='F';
                }

                if (mIndex==0){
                    AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Over");
                    alert.setCancelable(false);
                    alert.setMessage("You got grade "+ grade);
                    alert.setPositiveButton("close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();

                }
                mQuestion=mQuestionBank[mIndex].getmQuestionId();
                pic.setImageResource(mQuestion);

                int Progress_Bar_Increment=(int)Math.ceil(100.0/mQuestionBank.length);
                mProgressBar.incrementProgressBy(Progress_Bar_Increment);

                mScoreTextView.setText("score "+ mscore +"/"+mQuestionBank.length);

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    if (questionNo>29){
            //        loadLastpage(MainActivity.Exercise_Y);
              //  }
                checkAnswer('B');
            //    updateQuestion();

/**                       if (mIndex<=29){
                           pic.setImageResource(questionImage[mIndex]);
                       }else{
                           loadLastpage(MainActivity.Exercise_CARDIO);

                       }
                mIndex++;
 **/
                mIndex=(mIndex+1)%mQuestionBank.length;

                if(mscore>=24 && mscore<=30){
                    grade='A';
                }else if (mscore>=19 && mscore<=23){
                    grade='B';
                }else if (mscore>=15 && mscore<=18){
                    grade='C';
                }else if (mscore>=13 && mscore<=14){
                    grade='D';
                }else if (mscore>=11 && mscore<=12){
                    grade='E';
                }else{
                    grade='F';
                }


                if (mIndex==0){
                    AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Over");
                    alert.setCancelable(false);
                    alert.setMessage("You got grade "+ grade);
                    alert.setPositiveButton("close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();

                }
                mQuestion=mQuestionBank[mIndex].getmQuestionId();
                pic.setImageResource(mQuestion);

                int Progress_Bar_Increment=(int)Math.ceil(100.0/mQuestionBank.length);
                mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                mScoreTextView.setText("score "+ mscore +"/"+mQuestionBank.length);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   if (questionNo>29){
              //      loadLastpage(MainActivity.Exercise_weight);
            //    }

                checkAnswer('C');
            //    updateQuestion();
/**
                         if (mIndex<=29){
                              pic.setImageResource(questionImage[mIndex]);
                          }else{
                              loadLastpage(MainActivity.Exercise_CARDIO);
                          }
                mIndex++;
 **/
                mIndex=(mIndex+1)%mQuestionBank.length;

                if(mscore>=24 && mscore<=30){
                    grade='A';
                }else if (mscore>=19 && mscore<=23){
                    grade='B';
                }else if (mscore>=15 && mscore<=18){
                    grade='C';
                }else if (mscore>=13 && mscore<=14){
                    grade='D';
                }else if (mscore>=11 && mscore<=12){
                    grade='E';
                }else{
                    grade='F';
                }

                if (mIndex==0){
                    AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Over");
                    alert.setCancelable(false);
                    alert.setMessage("You got grade "+ grade);
                    alert.setPositiveButton("close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();

                }
                mQuestion=mQuestionBank[mIndex].getmQuestionId();
                pic.setImageResource(mQuestion);

                int Progress_Bar_Increment=(int)Math.ceil(100.0/mQuestionBank.length);
                mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                mScoreTextView.setText("score "+ mscore +"/"+mQuestionBank.length);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   if (questionNo>29){
             //       loadLastpage(MainActivity.Exercise_C);
              //  }
                checkAnswer('D');
             //   updateQuestion();

             /**         if (mIndex<=29){
                          pic.setImageResource(questionImage[mIndex]);
                      }else{
                          loadLastpage(MainActivity.Exercise_CARDIO);
                      }
                mIndex++;
            **/
                mIndex=(mIndex+1)%mQuestionBank.length;

                if(mscore>=24 && mscore<=30){
                    grade='A';
                }else if (mscore>=19 && mscore<=23){
                    grade='B';
                }else if (mscore>=15 && mscore<=18){
                    grade='C';
                }else if (mscore>=13 && mscore<=14){
                    grade='D';
                }else if (mscore>=11 && mscore<=12){
                    grade='E';
                }else{
                    grade='F';
                }


                if (mIndex==0){
                    AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Over");
                    alert.setCancelable(false);
                    alert.setMessage("You got grade "+ grade);
                    alert.setPositiveButton("close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();

                }
                mQuestion=mQuestionBank[mIndex].getmQuestionId();
                pic.setImageResource(mQuestion);

                int Progress_Bar_Increment=(int)Math.ceil(100.0/mQuestionBank.length);
                mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                mScoreTextView.setText("score "+ mscore +"/"+mQuestionBank.length);

            }
        });
    }

    private void checkAnswer(char userSelection){
        char correctAnswer= mQuestionBank[mIndex].getAnswerABCD();
        if (toast!=null){
            toast.cancel();
        }
        if (userSelection==correctAnswer){
            toast=Toast.makeText(getApplicationContext(),R.string.correct_toast,Toast.LENGTH_SHORT);
            mscore++;
        }else{
            toast=Toast.makeText(getApplicationContext(),R.string.incorrect_toast,Toast.LENGTH_SHORT);
        }
        toast.show();
    }


/**
    private void loadLastpage(String next) {
        Intent intent=new Intent(MainActivity.this,End.class);
        startActivity(intent);
    }
**/
}
