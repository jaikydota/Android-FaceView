package com.jaiky.test.replydialog;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jaiky.test.faceview.FaceView;

/**
 * 回复对话框
 *
 * @author Jaiky
 * @date 2015-3-30 PS: Not easy to write code, please indicate.
 */
public class ReplyDialog extends Dialog {

    private FaceView faceView;
    private EditText etContent;
    private ImageView ivFace;
    private LinearLayout llBtnReply;

    private Context mContext;

    public ReplyDialog(Context context) {
        super(context, R.style.MyNoFrame_Dialog);
        mContext = context;
        init();
    }

    private ReplyDialog(Context context, int theme) {
        super(context, theme);
        mContext = context;
        init();
    }

    private void init() {
        setContentView(R.layout.dialog_replyform);

        // 设置宽度
        Window window = getWindow();
        window.setGravity(Gravity.BOTTOM);
        LayoutParams lp = window.getAttributes();
        lp.width = LayoutParams.MATCH_PARENT;
        window.setAttributes(lp);

        ivFace = (ImageView) findViewById(R.id.dialog_reply_ivFace);
        etContent = (EditText) findViewById(R.id.dialog_reply_etContent);
        llBtnReply = (LinearLayout) findViewById(R.id.dialog_reply_llBtnReply);
        faceView = (FaceView) findViewById(R.id.face_view);
        faceView.setEdit(etContent);
        faceView.setBtnView(ivFace);

        // 弹出键盘
        etContent.setFocusable(true);
        etContent.setFocusableInTouchMode(true);
        etContent.requestFocus();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                InputMethodManager inputManager = (InputMethodManager) mContext
                        .getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.showSoftInput(etContent, 0);
            }
        }, 200);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ReplyDialog setContent(String content) {
        etContent.setText(content);
        return this;
    }

    public ReplyDialog setHintText(String hint) {
        etContent.setHint(hint);
        return this;
    }

    public String getContent() {
        return etContent.getText().toString();
    }

    public ReplyDialog setOnBtnCommitClickListener(
            android.view.View.OnClickListener onClickListener) {
        llBtnReply.setOnClickListener(onClickListener);
        return this;
    }
}
