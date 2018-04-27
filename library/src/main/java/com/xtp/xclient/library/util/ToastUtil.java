package com.xtp.xclient.library.util;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.widget.Toast;

import com.xtp.xclient.library.base.BaseApplication;

public class ToastUtil {
    private static Toast mToast = null;

    @SuppressLint("ShowToast")
    public static void showToast(String text) {
        if (TextUtils.isEmpty(text)) return;

        if (null != mToast) {
            mToast.setText(text);
        } else {
            mToast = Toast.makeText(BaseApplication.getInstance(), text, Toast.LENGTH_SHORT);
            mToast.setDuration(Toast.LENGTH_LONG);
        }
        mToast.show();
    }
}
