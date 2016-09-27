package com.example.library.opensourcelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zealjiang on 2016/9/27 15:56.
 * Email: zealjiang@126.com
 */

public class ToastUtils {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

}
