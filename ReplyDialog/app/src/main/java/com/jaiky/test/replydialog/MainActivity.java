package com.jaiky.test.replydialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jaiky.test.faceview.FaceImageGetter;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView tvShow;

    FaceImageGetter mFaceImageGetter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        tvShow = (TextView) findViewById(R.id.tvShow);

        mFaceImageGetter = new FaceImageGetter(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ReplyDialog replyDialog = new ReplyDialog(MainActivity.this);
                replyDialog.setHintText("回复某人的评论...")
                .setOnBtnCommitClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        replyDialog.dismiss();
                        Log.d("XXX", replyDialog.getContent());
                        tvShow.setText(Html.fromHtml(replyDialog.getContent(), mFaceImageGetter, null));
                    }
                })
                .show();

            }
        });

    }
}
