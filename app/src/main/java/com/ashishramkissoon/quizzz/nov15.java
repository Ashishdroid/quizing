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

public class nov15 extends AppCompatActivity {

    int mIndex =0;
    int mQuestion;
    Toast toast;
    ProgressBar mProgressBar;
    int mscore;
    TextView mScoreTextView;
    char grade;

    private   answer[] mQuestionBank=new answer[]{
            new answer(R.drawable.n15q1,'B'),
            new answer(R.drawable.n15q2,'C'),
            new answer(R.drawable.n15q3,'A'),
            new answer(R.drawable.n15q4,'C'),
            new answer(R.drawable.n15q5,'B'),
            new answer(R.drawable.n15q6,'C'),
            new answer(R.drawable.n15q7,'A'),
            new answer(R.drawable.n15q8,'A'),
            new answer(R.drawable.n15q9,'B'),
            new answer(R.drawable.n15q10,'A'),
            new answer(R.drawable.n15q11,'B'),
            new answer(R.drawable.n15q12,'C'),
            new answer(R.drawable.n15q13,'A'),
            new answer(R.drawable.n15q14,'A'),
            new answer(R.drawable.n15q15,'B'),
            new answer(R.drawable.n15q16,'D'),
            new answer(R.drawable.n15q17,'A'),
            new answer(R.drawable.n15q18,'A'),
            new answer(R.drawable.n15q19,'C'),
            new answer(R.drawable.n15q20,'C'),
            new answer(R.drawable.n15q21,'B'),
            new answer(R.drawable.n15q22,'D'),
            new answer(R.drawable.n15q23,'B'),
            new answer(R.drawable.n15q24,'D'),
            new answer(R.drawable.n15q25,'C'),
            new answer(R.drawable.n15q26,'D'),
            new answer(R.drawable.n15q27,'D'),
            new answer(R.drawable.n15q28,'A'),
            new answer(R.drawable.n15q29,'B'),
            new answer(R.drawable.n15q30,'D'),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nov15);

        final Button a = findViewById(R.id.buttonA);
        final Button b = findViewById(R.id.buttonB);
        Button c = findViewById(R.id.buttonC);
        final Button d = findViewById(R.id.buttonD);
        final ImageView pic = findViewById(R.id.imageView);

        final ProgressBar mProgressBar = findViewById(R.id.progressBar2);
        final TextView mScoreTextView = findViewById(R.id.textView2);


        final int[] questionImage = new int[]{
                R.drawable.n15q1, R.drawable.n15q2, R.drawable.n15q3, R.drawable.n15q4, R.drawable.n15q5, R.drawable.n15q6,
                R.drawable.n15q7,
                R.drawable.n15q8,
                R.drawable.n15q9, R.drawable.n15q10, R.drawable.n15q11, R.drawable.n15q12, R.drawable.n15q13, R.drawable.n15q14,
                R.drawable.n15q15, R.drawable.n15q16,
                R.drawable.n15q17, R.drawable.n15q18, R.drawable.n15q19, R.drawable.n15q20, R.drawable.n15q21, R.drawable.n15q22,
                R.drawable.n15q23, R.drawable.n15q24,
                R.drawable.n15q25, R.drawable.n15q26, R.drawable.n15q27, R.drawable.n15q28, R.drawable.n15q29, R.drawable.n15q30};

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
                    AlertDialog.Builder alert = new AlertDialog.Builder(nov15.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(nov15.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(nov15.this);
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(nov15.this);
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
