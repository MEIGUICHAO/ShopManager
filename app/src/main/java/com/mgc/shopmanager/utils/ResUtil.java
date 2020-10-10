package com.mgc.shopmanager.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;

import com.mgc.shopmanager.base.BaseApplicaton;

public class ResUtil {



    public static int getColorWithAlpha(float alpha, int baseColor) {
        int a = Math.min(255, Math.max(0, (int) (alpha * 255))) << 24;
        int rgb = 0x00ffffff & baseColor;
        return a + rgb;
    }
    /**
     * get color
     *
     * @param res
     * @return
     */
    public static int getC(@ColorRes int res) {
        return ContextCompat.getColor(BaseApplicaton.getContext(), res);
    }

    /**
     * get String
     *
     * @param res
     * @return
     */
    public static String getS(@StringRes int res) {
        return BaseApplicaton.getContext().getString(res);
    }

    /**
     * get String
     *
     * @param res
     * @return
     */
    public static String getS(@StringRes int res, Object... formatArgs) {
        return BaseApplicaton.getContext().getString(res, formatArgs);
    }

    /**
     * get String
     *
     * @param res        有占位符的String res
     * @param resReplace 要替换的String res
     * @return
     */
    public static String getS(@StringRes int res, @StringRes int resReplace) {
        return BaseApplicaton.getContext().getString(res, getS(resReplace));
    }


    /**
     * get String
     *
     * @param res         有两个占位符的String res
     * @param resReplace1 要替换的String res
     * @param resReplace2 要替换的String res
     * @return
     */
    public static String getS(@StringRes int res, @StringRes int resReplace1, @StringRes int resReplace2) {
        return getS(res, getS(resReplace1), getS(resReplace2));
    }

    /**
     * get String
     *
     * @param res         有三个占位符的String res
     * @param resReplace1 要替换的String res
     * @param resReplace2 要替换的String res
     * @param resReplace3 要替换的String res
     * @return
     */
    public static String getS(@StringRes int res, @StringRes int resReplace1, @StringRes int resReplace2, @StringRes int resReplace3) {
        return getS(res, getS(resReplace1), getS(resReplace2), getS(resReplace3));
    }

    /**
     * 获取尺寸
     */
    public static float getDimen(Context context, @DimenRes int id) {
        return context.getResources().getDimension(id);
    }

    /**
     * 获取Drawable
     */
    public static Drawable getDrawable(Context context, @DrawableRes int id) {
        return ContextCompat.getDrawable(context, id);
    }

    /**
     * 根据名字获取ID
     */
    public static int getId(String name, String type) {
        int id = 0;
        try {
            id = BaseApplicaton.getContext().getResources().getIdentifier(name, type,
                    BaseApplicaton.getContext().getPackageName());
        } catch (Exception e) {
        }
        return id;
    }

    /**
     * 去掉小数点后面的 0
     *
     * @param d
     * @return
     */
    public static String getText(double d) {
        return d % 1 == 0 ? (int) d + "" : d + "";
    }
}
