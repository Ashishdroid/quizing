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

public class may09 extends AppCompatActivity {

    int mIndex =0;
    int mQuestion;
    Toast toast;
    ProgressBar mProgressBar;
    int mscore;
    TextView mScoreTextView;
    char grade;




    private   answer[] mQuestionBank=new answer[]{
            new answer(R.drawable.m09q1,'D'),
            new answer(R.drawable.m09q2,'A'),
            new answer(R.drawable.m09q3,'B'),
            new answer(R.drawable.m09q4,'B'),
            new answer(R.drawable.m09q5,'C'),
            new answer(R.drawable.m09q6,'A'),
            new answer(R.drawable.m09q7,'C'),
            new answer(R.drawable.m09q8,'B'),
            new answer(R.drawable.m09q9,'C'),
            new answer(R.drawable.m09q10,'B'),
            new answer(R.drawable.m09q11,'B'),
            new answer(R.drawable.m09q12,'A'),
            new answer(R.drawable.m09q13,'B'),
            new answer(R.drawable.m09q14,'B'),
            new answer(R.drawable.m09q15,'D'),
            new answer(R.drawable.m09q16,'C'),
            new answer(R.drawable.m09q17,'A'),
            new answer(R.drawable.m09q18,'A'),
            new answer(R.drawable.m09q19,'C'),
            new answer(R.drawable.m09q20,'B'),
            new answer(R.drawable.m09q21,'C'),
            new answer(R.drawable.m09q22,'B'),
            new answer(R.drawable.m09q23,'B'),
            new answer(R.drawable.m09q24,'A'),
            new answer(R.drawable.m09q25,'C'),
            new answer(R.drawable.m09q26,'D'),
            new answer(R.drawable.m09q27,'B'),
            new answer(R.drawable.m09q28,'C'),
            new answer(R.drawable.m09q29,'D'),
            new answer(R.drawable.m09q30,'C'),
            new answer(R.drawable.m09q31,'D'),
            new answer(R.drawable.m09q32,'C'),
            new answer(R.drawable.m09q33,'B'),
            new answer(R.drawable.m09q34,'A'),
            new answer(R.drawable.m09q35,'A'),
            new answer(R.drawable.m09q36,'B'),
            new answer(R.drawable.m09q37,'D'),
            new answer(R.drawable.m09q38,'B'),
            new answer(R.drawable.m09q39,'B'),
            new answer(R.drawable.m09q40,'D'),
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_may12);

        final Button a = findViewById(R.id.buttonA);
        final Button b = findViewById(R.id.buttonB);
        Button c = findViewById(R.id.buttonC);
        final Button d = findViewById(R.id.buttonD);
        final ImageView pic = findViewById(R.id.imageView);

        final ProgressBar mProgressBar = findViewById(R.id.progressBar2);
        final TextView mScoreTextView = findViewById(R.id.textView2);


        final int[] questionImage = new int[]{
                R.drawable.m09q1, R.drawable.m09q2, R.drawable.m09q3, R.drawable.m09q4, R.drawable.m09q5, R.drawable.m09q6,
                R.drawable.m09q7,
                R.drawable.m09q8,
                R.drawable.m09q9, R.drawable.m09q10, R.drawable.m09q11, R.drawable.m09q12, R.drawable.m09q13, R.drawable.m09q14,
                R.drawable.m09q15, R.drawable.m09q16,
                R.drawable.m09q17, R.drawable.m09q18, R.drawable.m09q19, R.drawable.m09q20, R.drawable.m09q21, R.drawable.m09q22,
                R.drawable.m09q23, R.drawable.m09q24,
                R.drawable.m09q25, R.drawable.m09q26, R.drawable.m09q27, R.drawable.m09q28, R.drawable.m09q29, R.drawable.m09q30,
                R.drawable.m09q31, R.drawable.m09q32, R.drawable.m09q33, R.drawable.m09q34, R.drawable.m09q35, R.drawable.m09q36,
                R.drawable.m09q37, R.drawable.m09q37, R.drawable.m09q38, R.drawable.m09q39,R.drawable.m09q40};

        mQuestion = mQuestionBank[mIndex].getmQuestionId();
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
                mIndex = (mIndex + 1) % mQuestionBank.length;

                if (mscore >= 24 && mscore <= 30) {
                    grade = 'A';
                } else if (mscore >= 19 && mscore <= 23) {
                    grade = 'B';
                } else if (mscore >= 15 && mscore <= 18) {
                    grade = 'C';
                } else if (mscore >= 13 && mscore <= 14) {
                    grade = 'D';
                } else if (mscore >= 11 && mscore <= 12) {
                    grade = 'E';
                } else {
                    grade = 'F';
                }

                if (mIndex == 0) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(may09.this);
                    alert.setTitle("Over");
                    alert.setCancelable(false);
                    alert.setMessage("You got grade " + grade);
                    alert.setPositiveButton("close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();

                }
                mQuestion = mQuestionBank[mIndex].getmQuestionId();
                pic.setImageResource(mQuestion);

                int Progress_Bar_Increment = (int) Math.ceil(100.0 / mQuestionBank.length);
                mProgressBar.incrementProgressBy(Progress_Bar_Increment);

                mScoreTextView.setText("score " + mscore + "/" + mQuestionBank.length);

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
                mIndex = (mIndex + 1) % mQuestionBank.length;

                if (mscore >= 24 && mscore <= 30) {
                    grade = 'A';
                } else if (mscore >= 19 && mscore <= 23) {
                    grade = 'B';
                } else if (mscore >= 15 && mscore <= 18) {
                    grade = 'C';
                } else if (mscore >= 13 && mscore <= 14) {
                    grade = 'D';
                } else if (mscore >= 11 && mscore <= 12) {
                    grade = 'E';
                } else {
                    grade = 'F';
                }


                if (mIndex == 0) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(may09.this);
                    alert.setTitle("Over");
                    alert.setCancelable(false);
                    alert.setMessage("You got grade " + grade);
                    alert.setPositiveButton("close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();

                }
                mQuestion = mQuestionBank[mIndex].getmQuestionId();
                pic.setImageResource(mQuestion);

                int Progress_Bar_Increment = (int) Math.ceil(100.0 / mQuestionBank.length);
                mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                mScoreTextView.setText("score " + mscore + "/" + mQuestionBank.length);
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
                mIndex = (mIndex + 1) % mQuestionBank.length;

                if (mscore >= 24 && mscore <= 30) {
                    grade = 'A';
                } else if (mscore >= 19 && mscore <= 23) {
                    grade = 'B';
                } else if (mscore >= 15 && mscore <= 18) {
                    grade = 'C';
                } else if (mscore >= 13 && mscore <= 14) {
                    grade = 'D';
                } else if (mscore >= 11 && mscore <= 12) {
                    grade = 'E';
                } else {
                    grade = 'F';
                }

                if (mIndex == 0) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(may09.this);
                    alert.setTitle("Over");
                    alert.setCancelable(false);
                    alert.setMessage("You got grade " + grade);
                    alert.setPositiveButton("close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();

                }
                mQuestion = mQuestionBank[mIndex].getmQuestionId();
                pic.setImageResource(mQuestion);

                int Progress_Bar_Increment = (int) Math.ceil(100.0 / mQuestionBank.length);
                mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                mScoreTextView.setText("score " + mscore + "/" + mQuestionBank.length);
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
                mIndex = (mIndex + 1) % mQuestionBank.length;

                if (mscore >= 24 && mscore <= 30) {
                    grade = 'A';
                } else if (mscore >= 19 && mscore <= 23) {
                    grade = 'B';
                } else if (mscore >= 15 && mscore <= 18) {
                    grade = 'C';
                } else if (mscore >= 13 && mscore <= 14) {
                    grade = 'D';
                } else if (mscore >= 11 && mscore <= 12) {
                    grade = 'E';
                } else {
                    grade = 'F';
                }


                if (mIndex == 0) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(may09.this);
                    alert.setTitle("Over");
                    alert.setCancelable(false);
                    alert.setMessage("You got grade " + grade);
                    alert.setPositiveButton("close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();

                }
                mQuestion = mQuestionBank[mIndex].getmQuestionId();
                pic.setImageResource(mQuestion);

                int Progress_Bar_Increment = (int) Math.ceil(100.0 / mQuestionBank.length);
                mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                mScoreTextView.setText("score " + mscore + "/" + mQuestionBank.length);

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
