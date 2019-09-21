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


public class may14 extends AppCompatActivity {

    int mIndex =0;
    int mQuestion;
    Toast toast;
    ProgressBar mProgressBar;
    int mscore;
    TextView mScoreTextView;
    char grade;

    private   answer[] mQuestionBank=new answer[]{
            new answer(R.drawable.m14q1,'C'),
            new answer(R.drawable.m14q2,'B'),
            new answer(R.drawable.m14q3,'A'),
            new answer(R.drawable.m14q4,'C'),
            new answer(R.drawable.m14q5,'B'),
            new answer(R.drawable.m14q6,'B'),
            new answer(R.drawable.m14q7,'B'),
            new answer(R.drawable.m14q8,'C'),
            new answer(R.drawable.m14q9,'C'),
            new answer(R.drawable.m14q10,'C'),
            new answer(R.drawable.m14q11,'D'),
            new answer(R.drawable.m14q12,'B'),
            new answer(R.drawable.m14q13,'C'),
            new answer(R.drawable.m14q14,'D'),
            new answer(R.drawable.m14q15,'D'),
            new answer(R.drawable.m14q16,'A'),
            new answer(R.drawable.m14q17,'A'),
            new answer(R.drawable.m14q18,'B'),
            new answer(R.drawable.m14q19,'C'),
            new answer(R.drawable.m14q20,'A'),
            new answer(R.drawable.m14q21,'C'),
            new answer(R.drawable.m14q22,'A'),
            new answer(R.drawable.m14q23,'A'),
            new answer(R.drawable.m14q24,'B'),
            new answer(R.drawable.m14q25,'D'),
            new answer(R.drawable.m14q26,'A'),
            new answer(R.drawable.m14q27,'A'),
            new answer(R.drawable.m14q28,'D'),
            new answer(R.drawable.m14q29,'D'),
            new answer(R.drawable.m14q30,'C'),
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_may14);

        final Button a=findViewById(R.id.buttonA);
        final Button b=findViewById(R.id.buttonB);
        Button c=findViewById(R.id.buttonC);
        final Button d=findViewById(R.id.buttonD);
        final  ImageView pic=findViewById(R.id.imageView);

        final ProgressBar mProgressBar= findViewById(R.id.progressBar2);
        final TextView mScoreTextView=findViewById(R.id.textView2);


        final int[] questionImage=new int[]{
                R.drawable.m14q1,R.drawable.m14q2,R.drawable.m14q3,R.drawable.m14q4,R.drawable.m14q5,R.drawable.m14q6,R.drawable.m14q7,
                R.drawable.m14q8,
                R.drawable.m14q9,R.drawable.m14q10,R.drawable.m14q11,R.drawable.m14q12,R.drawable.m14q13,R.drawable.m14q14,
                R.drawable.m14q15,R.drawable.m14q16,
                R.drawable.m14q17,R.drawable.m14q18,R.drawable.m14q19,R.drawable.m14q20,R.drawable.m14q21,R.drawable.m14q22,
                R.drawable.m14q23,R.drawable.m14q24,
                R.drawable.m14q25,R.drawable.m14q26,R.drawable.m14q27,R.drawable.m14q28,R.drawable.m14q29,R.drawable.m14q30};

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
                    AlertDialog.Builder alert =new AlertDialog.Builder(may14.this);
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
                    AlertDialog.Builder alert =new AlertDialog.Builder(may14.this);
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
                    AlertDialog.Builder alert =new AlertDialog.Builder(may14.this);
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
                    AlertDialog.Builder alert =new AlertDialog.Builder(may14.this);
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
}
