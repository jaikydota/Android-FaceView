package com.jaiky.test.faceview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html.ImageGetter;
import android.util.Log;

/**
 * Author by Jaiky, Email jaikydota@163.com, Date on 10/10/2014.
 * PS: Not easy to write code, please indicate.
 */
public class FaceImageGetter implements ImageGetter {
    /**
     * faceShowSize
     */
    private int faceShowSize = 20;
    private Context m_context;
    public FaceImageGetter(Context context) {
        m_context = context;
    }

    @Override
    public Drawable getDrawable(String source) {
        Log.d("XXX", source);
        if (source != null) {
            String imgName = getNameByPathName(getPathFileName(source));
            if (!isNumeric(imgName)) {
                return null;
            }
            // 判断表情是否存在
            int faceNum = FaceManager.getInstance().getFace(Integer.valueOf(imgName));
            if (faceNum == 0) {
                return null;
            } else {
                Drawable img = m_context.getResources().getDrawable(faceNum);
                int size = dip2px(m_context, faceShowSize);
                img.setBounds(0, 0, size, size);
                return img;
            }
        }
        return null;
    }


    public String getNameByPathName(String pathName){
        String[] splStr = pathName.split("\\.");
        return splStr[0];
    }

    public String getPathFileName(String filePath){
        int lastIndex = filePath.lastIndexOf("/");
        String filename = filePath.substring(lastIndex + 1);
        return filename;
    }

    public boolean isNumeric(String str) {
        if (isEmpty(str)) {
            return false;
        }
        for (int i = str.length(); --i >= 0;) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty(String str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }

    public int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}