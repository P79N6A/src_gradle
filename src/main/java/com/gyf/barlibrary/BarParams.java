package com.gyf.barlibrary;

import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

public class BarParams implements Cloneable {
    @FloatRange(from = 0.0d, to = 1.0d)
    float autoNavigationBarDarkModeAlpha;
    boolean autoNavigationBarDarkModeEnable;
    @FloatRange(from = 0.0d, to = 1.0d)
    float autoStatusBarDarkModeAlpha;
    boolean autoStatusBarDarkModeEnable;
    BarHide barHide = BarHide.FLAG_SHOW_BAR;
    @FloatRange(from = 0.0d, to = 1.0d)
    float contentAlpha = 0.0f;
    @ColorInt
    int contentColor = 0;
    @ColorInt
    int contentColorTransform = -16777216;
    int defaultNavigationBarColor = -16777216;
    public boolean fits = false;
    @Deprecated
    boolean fixMarginAtBottom = false;
    @ColorInt
    int flymeOSStatusBarFontColor;
    public boolean fullScreen;
    boolean hideNavigationBar;
    boolean isSupportActionBar = false;
    public boolean keyboardEnable = false;
    int keyboardMode = 18;
    @FloatRange(from = 0.0d, to = 1.0d)
    float navigationBarAlpha;
    @ColorInt
    int navigationBarColor = -16777216;
    @ColorInt
    int navigationBarColorTransform = -16777216;
    boolean navigationBarDarkIcon;
    boolean navigationBarEnable = true;
    boolean navigationBarWithEMUI3Enable = true;
    boolean navigationBarWithKitkatEnable = true;
    OnKeyboardListener onKeyboardListener;
    @FloatRange(from = 0.0d, to = 1.0d)
    float statusBarAlpha;
    @ColorInt
    int statusBarColor;
    boolean statusBarColorEnabled = true;
    @ColorInt
    int statusBarColorTransform = -16777216;
    boolean statusBarDarkFont;
    View statusBarView;
    View titleBarView;
    @FloatRange(from = 0.0d, to = 1.0d)
    float viewAlpha = 0.0f;
    Map<View, Map<Integer, Integer>> viewMap = new HashMap();

    /* access modifiers changed from: protected */
    public BarParams clone() {
        try {
            return (BarParams) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
