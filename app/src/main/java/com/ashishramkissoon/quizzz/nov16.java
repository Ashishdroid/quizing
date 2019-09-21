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

public class nov16 extends AppCompatActivity {

    int mIndex =0;
    int mQuestion;
    Toast toast;
    ProgressBar mProgressBar;
    int mscore;
    TextView mScoreTextView;
    char grade;




    private   answer[] mQuestionBank=new answer[]{
            new answer(R.drawable.n16q1,'D'),
            new answer(R.drawable.n16q2,'B'),
            new answer(R.drawable.n16q3,'B'),
            new answer(R.drawable.n16q4,'C'),
            new answer(R.drawable.n16q5,'D'),
            new answer(R.drawable.n16q6,'D'),
            new answer(R.drawable.n16q7,'C'),
            new answer(R.drawable.n16q8,'A'),
            new answer(R.drawable.n16q9,'D'),
            new answer(R.drawable.n16q10,'D'),
            new answer(R.drawable.n16q11,'D'),
            new answer(R.drawable.n16q12,'C'),
            new answer(R.drawable.n16q13,'B'),
            new answer(R.drawable.n16q14,'C'),
            new answer(R.drawable.n16q16,'B'),
            new answer(R.drawable.n16q17,'C'),
            new answer(R.drawable.n16q18,'C'),
            new answer(R.drawable.n16q19,'B'),
            new answer(R.drawable.n16q20,'A'),
            new answer(R.drawable.n16q21,'A'),
            new answer(R.drawable.n16q22,'D'),
            new answer(R.drawable.n16q23,'B'),
            new answer(R.drawable.n16q24,'D'),
            new answer(R.drawable.n16q25,'C'),
            new answer(R.drawable.n16q26,'C'),
            new answer(R.drawable.n16q27,'C'),
            new answer(R.drawable.n16q28,'D'),
            new answer(R.drawable.n16q29,'A'),
            new answer(R.drawable.n16q30,'A'),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nov16);


        final Button a = findViewById(R.id.buttonA);
        final Button b = findViewById(R.id.buttonB);
        Button c = findViewById(R.id.buttonC);
        final Button d = findViewById(R.id.buttonD);
        final ImageView pic = findViewById(R.id.imageView);

        final ProgressBar mProgressBar = findViewById(R.id.progressBar2);
        final TextView mScoreTextView = findViewById(R.id.textView2);


        final int[] questionImage = new int[]{
                R.drawable.n16q1, R.drawable.n16q2, R.drawable.n16q3, R.drawable.n16q4, R.drawable.n16q5, R.drawable.n16q6,
                R.drawable.n16q7,
                R.drawable.n16q8,
                R.drawable.n16q9, R.drawable.n16q10, R.drawable.n16q11, R.drawable.n16q12, R.drawable.n16q13, R.drawable.n16q14,
                R.drawable.n16q16,
                R.drawable.n16q17, R.drawable.n16q18, R.drawable.n16q19, R.drawable.n16q20, R.drawable.n16q21, R.drawable.n16q22,
                R.drawable.n16q23, R.drawable.n16q24,
                R.drawable.n16q25, R.drawable.n16q26, R.drawable.n16q27, R.drawable.n16q28, R.drawable.n16q29, R.drawable.n16q30};

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
                    AlertDialog.Builder alert = new AlertDialog.Builder(nov16.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(nov16.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(nov16.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(nov16.this);
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
