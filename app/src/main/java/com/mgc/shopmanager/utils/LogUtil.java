package com.mgc.shopmanager.utils;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by zxl on 2019/11/19.
 */

public class LogUtil {
    public static final int VERBOSE = 1;

    public static final int DEBUG = 2;

    public static final int INFO = 3;

    public static final int WARN = 4;

    public static final int ERROR = 5;

    public static final int NOTHING = 6;

    public static int LEVEL = VERBOSE;

    private static StringBuffer sb = new StringBuffer();


    private static String getFunctionName() {
        StackTraceElement[] sts = Thread.currentThread().getStackTrace();
        if (sts == null) {
            return null;
        }
        for (StackTraceElement st : sts) {
            if (st.isNativeMethod()) {
                continue;
            }
            if (st.getClassName().equals(Thread.class.getName())) {
                continue;
            }
            if (st.getClassName().equals(LogUtil.class.getName())) {
                continue;
            }

            return "[" + Thread.currentThread().getName() + "(" + Thread.currentThread().getId()
                    + "): " + st.getFileName() + ":" + st.getLineNumber() + " " + st.getMethodName() + "]";
        }
        return null;
    }



    private static String createMessage(String msg) {
        sb.delete(0, sb.length());
        sb.append(getFunctionName());
        sb.append("-");
        sb.append(msg);
        return sb.toString();
    }

    public static void v(String tag, String msg) {
        if (LEVEL <= VERBOSE) {
            Log.v(tag, createMessage(msg));
        }
    }

    public static void d( String msg) {
        String tag = "mgc";
        if (LEVEL <= DEBUG) {
            if (!TextUtils.isEmpty(msg)) {
                //因为String的length是字符数量不是字节数量所以为了防止中文字符过多，
                //  把4*1024的MAX字节打印长度改为2001字符数
                int max_str_length = 2001 - tag.length();
                //大于4000时
                while (msg.length() > max_str_length) {
                    Log.d(tag, msg.substring(0, max_str_length));
                    msg = msg.substring(max_str_length);
                }
                //剩余部分
                Log.d(tag, createMessage(msg));
            }
        }
    }

    public static void d(String tag, String msg) {
        if (LEVEL <= DEBUG) {
            if (!TextUtils.isEmpty(msg)) {
                //因为String的length是字符数量不是字节数量所以为了防止中文字符过多，
                //  把4*1024的MAX字节打印长度改为2001字符数
                int max_str_length = 2001 - tag.length();
                //大于4000时
                while (msg.length() > max_str_length) {
                    Log.d(tag, msg.substring(0, max_str_length));
                    msg = msg.substring(max_str_length);
                }
                //剩余部分
                Log.d(tag, createMessage(msg));
            }
        }
    }

    public static void i(String tag, String msg) {
        if (LEVEL <= INFO) {
            Log.i(tag, createMessage(msg));
        }
    }

    public static void w(String tag, String msg) {
        if (LEVEL <= WARN) {
            Log.w(tag, createMessage(msg));
        }
    }

    public static void e(String tag, String msg) {
        if (LEVEL <= ERROR) {
            if (!TextUtils.isEmpty(msg)) {

                //因为String的length是字符数量不是字节数量所以为了防止中文字符过多，
                //  把4*1024的MAX字节打印长度改为2001字符数
                int max_str_length = 2001 - tag.length();
                //大于4000时
                while (msg.length() > max_str_length) {
                    Log.e(tag, msg.substring(0, max_str_length));
                    msg = msg.substring(max_str_length);
                }
                //剩余部分
                Log.e(tag, createMessage(msg));
            }
        }
    }

}
