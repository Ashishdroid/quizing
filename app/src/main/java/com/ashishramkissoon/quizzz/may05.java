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

public class may05 extends AppCompatActivity {

    int mIndex =0;
    int mQuestion;
    Toast toast;
    ProgressBar mProgressBar;
    int mscore;
    TextView mScoreTextView;
    char grade;




    private   answer[] mQuestionBank=new answer[]{
            new answer(R.drawable.m05q1,'A'),
            new answer(R.drawable.m05q2,'C'),
            new answer(R.drawable.m05q3,'D'),
            new answer(R.drawable.m05q4,'B'),
            new answer(R.drawable.m05q5,'B'),
            new answer(R.drawable.m05q6,'A'),
            new answer(R.drawable.m05q7,'C'),
            new answer(R.drawable.m05q8,'C'),
            new answer(R.drawable.m05q9,'A'),
            new answer(R.drawable.m05q10,'C'),
            new answer(R.drawable.m05q11,'C'),
            new answer(R.drawable.m05q12,'C'),
            new answer(R.drawable.m05q13,'C'),
            new answer(R.drawable.m05q14,'C'),
            new answer(R.drawable.m05q15,'C'),
            new answer(R.drawable.m05q16,'C'),
            new answer(R.drawable.m05q17,'B'),
            new answer(R.drawable.m05q18,'A'),
            new answer(R.drawable.m05q19,'B'),
            new answer(R.drawable.m05q20,'D'),
            new answer(R.drawable.m05q21,'B'),
            new answer(R.drawable.m05q22,'B'),
            new answer(R.drawable.m05q23,'A'),
            new answer(R.drawable.m05q24,'D'),
            new answer(R.drawable.m05q25,'B'),
            new answer(R.drawable.m05q26,'D'),
            new answer(R.drawable.m05q27,'B'),
            new answer(R.drawable.m05q28,'A'),
            new answer(R.drawable.m05q29,'C'),
            new answer(R.drawable.m05q30,'B'),
            new answer(R.drawable.m05q31,'A'),
            new answer(R.drawable.m05q32,'C'),
            new answer(R.drawable.m05q33,'C'),
            new answer(R.drawable.m05q34,'D'),
            new answer(R.drawable.m05q35,'C'),
            new answer(R.drawable.m05q36,'C'),
            new answer(R.drawable.m05q37,'B'),
            new answer(R.drawable.m05q38,'A'),
            new answer(R.drawable.m05q39,'D'),
            new answer(R.drawable.m05q40,'B'),
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
                R.drawable.m05q1, R.drawable.m05q2, R.drawable.m05q3, R.drawable.m05q4, R.drawable.m05q5, R.drawable.m05q6,
                R.drawable.m05q7,
                R.drawable.m05q8,
                R.drawable.m05q9, R.drawable.m05q10, R.drawable.m05q11, R.drawable.m05q12, R.drawable.m05q13, R.drawable.m05q14,
                R.drawable.m05q15, R.drawable.m05q16,
                R.drawable.m05q17, R.drawable.m05q18, R.drawable.m05q19, R.drawable.m05q20, R.drawable.m05q21, R.drawable.m05q22,
                R.drawable.m05q23, R.drawable.m05q24,
                R.drawable.m05q25, R.drawable.m05q26, R.drawable.m05q27, R.drawable.m05q28, R.drawable.m05q29, R.drawable.m05q30,
                R.drawable.m05q31, R.drawable.m05q32, R.drawable.m05q33, R.drawable.m05q34, R.drawable.m05q35, R.drawable.m05q36,
                R.drawable.m05q37, R.drawable.m05q37, R.drawable.m05q38, R.drawable.m05q39,R.drawable.m05q40};

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
                    AlertDialog.Builder alert = new AlertDialog.Builder(may05.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(may05.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(may05.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(may05.this);
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
