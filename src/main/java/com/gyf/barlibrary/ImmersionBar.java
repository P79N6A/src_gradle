package com.gyf.barlibrary;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.database.ContentObserver;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.FloatRange;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@TargetApi(19)
public class ImmersionBar {
    private static final int IMMERSION_NAVIGATION_BAR_VIEW = 2131167320;
    private static final int IMMERSION_STATUS_BAR_VIEW = 2131167321;
    private static Map<String, ImmersionBar> mImmersionBarMap = new HashMap();
    public Activity mActivity;
    public BarConfig mBarConfig;
    public BarParams mBarParams;
    public ViewGroup mContentView;
    public ViewGroup mDecorView;
    private Dialog mDialog;
    private FitsKeyboard mFitsKeyboard;
    private int mFitsStatusBarType;
    private Fragment mFragment;
    private boolean mHasNavigationBarColor;
    private String mImmersionBarName;
    private boolean mIsFitsLayoutOverlap;
    private boolean mIsFitsNotch;
    private boolean mIsFragment;
    public int mNavigationBarHeight;
    public int mNavigationBarWidth;
    private ContentObserver mNavigationObserver;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private Map<String, BarParams> mTagMap;
    private Window mWindow;

    public BarParams getBarParams() {
        return this.mBarParams;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public static ImmersionBar with(@NonNull Fragment fragment) {
        if (fragment.getActivity() != null) {
            Map<String, ImmersionBar> map = mImmersionBarMap;
            ImmersionBar immersionBar = map.get(fragment.getActivity().toString() + fragment.toString());
            if (immersionBar != null) {
                return immersionBar;
            }
            ImmersionBar immersionBar2 = new ImmersionBar(fragment);
            Map<String, ImmersionBar> map2 = mImmersionBarMap;
            map2.put(fragment.getActivity().toString() + fragment.toString(), immersionBar2);
            return immersionBar2;
        }
        throw new IllegalArgumentException("Activity不能为空!!!");
    }

    public ImmersionBar transparentStatusBar() {
        this.mBarParams.statusBarColor = 0;
        return this;
    }

    public void init() {
        updateBarParams();
        setBar();
        fitsLayoutOverlap();
        fitsKeyboard();
        transformView();
    }

    public ImmersionBar reset() {
        this.mBarParams = new BarParams();
        this.mFitsStatusBarType = 0;
        return this;
    }

    public ImmersionBar transparentBar() {
        this.mBarParams.statusBarColor = 0;
        this.mBarParams.navigationBarColor = 0;
        this.mBarParams.fullScreen = true;
        return this;
    }

    public ImmersionBar transparentNavigationBar() {
        this.mBarParams.navigationBarColor = 0;
        this.mBarParams.fullScreen = true;
        return this;
    }

    private void fitsNotchScreen() {
        if (Build.VERSION.SDK_INT >= 28 && !this.mIsFitsNotch) {
            WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.mWindow.setAttributes(attributes);
            this.mIsFitsNotch = true;
        }
    }

    public static boolean isSupportNavigationIconDark() {
        if (OSUtils.isMIUI6Later() || Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean isSupportStatusBarDarkFont() {
        if (OSUtils.isMIUI6Later() || OSUtils.isFlymeOS4Later() || Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public ImmersionBar removeSupportAllView() {
        if (this.mBarParams.viewMap.size() != 0) {
            this.mBarParams.viewMap.clear();
        }
        return this;
    }

    private void adjustDarkModeParams() {
        boolean z;
        boolean z2 = true;
        if (this.mBarParams.autoStatusBarDarkModeEnable) {
            if (this.mBarParams.statusBarColor == 0 || this.mBarParams.statusBarColor <= -4539718) {
                z = false;
            } else {
                z = true;
            }
            statusBarDarkFont(z, this.mBarParams.autoStatusBarDarkModeAlpha);
        }
        if (this.mBarParams.autoNavigationBarDarkModeEnable) {
            if (this.mBarParams.navigationBarColor == 0 || this.mBarParams.navigationBarColor <= -4539718) {
                z2 = false;
            }
            navigationBarDarkIcon(z2, this.mBarParams.autoNavigationBarDarkModeAlpha);
        }
    }

    private void cancelListener() {
        if (this.mActivity != null) {
            if (this.mNavigationObserver != null) {
                this.mActivity.getContentResolver().unregisterContentObserver(this.mNavigationObserver);
                this.mNavigationObserver = null;
            }
            if (this.mFitsKeyboard != null) {
                this.mFitsKeyboard.cancel();
                this.mFitsKeyboard = null;
            }
        }
    }

    private void fitsLayoutOverlap() {
        if (Build.VERSION.SDK_INT >= 19 && !this.mIsFitsLayoutOverlap) {
            switch (this.mFitsStatusBarType) {
                case 1:
                    setTitleBar(this.mActivity, this.mBarParams.titleBarView);
                    this.mIsFitsLayoutOverlap = true;
                    return;
                case 2:
                    setTitleBarMarginTop(this.mActivity, this.mBarParams.titleBarView);
                    this.mIsFitsLayoutOverlap = true;
                    return;
                case 3:
                    setStatusBarView(this.mActivity, this.mBarParams.statusBarView);
                    this.mIsFitsLayoutOverlap = true;
                    break;
            }
        }
    }

    private void fitsWindows() {
        if (Build.VERSION.SDK_INT < 21 || OSUtils.isEMUI3_x()) {
            fitsWindowsBelowLOLLIPOP();
            if (!this.mIsFragment && OSUtils.isEMUI3_x()) {
                fitsWindowsEMUI();
            }
            return;
        }
        fitsWindowsAboveLOLLIPOP();
    }

    private void updateBarParams() {
        adjustDarkModeParams();
        if (Build.VERSION.SDK_INT >= 19) {
            if (OSUtils.isEMUI3_x() && this.mBarParams.navigationBarWithKitkatEnable) {
                this.mBarParams.navigationBarWithKitkatEnable = this.mBarParams.navigationBarWithEMUI3Enable;
            }
            this.mBarConfig = new BarConfig(this.mActivity);
            if (this.mIsFragment) {
                ImmersionBar immersionBar = mImmersionBarMap.get(this.mActivity.toString());
                if (immersionBar != null) {
                    immersionBar.mBarParams = this.mBarParams;
                }
            }
        }
    }

    public void destroy() {
        cancelListener();
        Iterator<Map.Entry<String, ImmersionBar>> it2 = mImmersionBarMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry next = it2.next();
            if (((String) next.getKey()).contains(this.mImmersionBarName) || ((String) next.getKey()).equals(this.mImmersionBarName)) {
                it2.remove();
            }
        }
    }

    private void fitsKeyboard() {
        if (Build.VERSION.SDK_INT >= 19) {
            if (this.mIsFragment) {
                ImmersionBar immersionBar = mImmersionBarMap.get(this.mActivity.toString());
                if (immersionBar != null) {
                    if (immersionBar.mBarParams.keyboardEnable) {
                        if (immersionBar.mFitsKeyboard == null) {
                            immersionBar.mFitsKeyboard = new FitsKeyboard(immersionBar, immersionBar.mActivity, immersionBar.mWindow);
                        }
                        immersionBar.mFitsKeyboard.enable(immersionBar.mBarParams.keyboardMode);
                    } else if (immersionBar.mFitsKeyboard != null) {
                        immersionBar.mFitsKeyboard.disable();
                    }
                }
            } else if (this.mBarParams.keyboardEnable) {
                if (this.mFitsKeyboard == null) {
                    this.mFitsKeyboard = new FitsKeyboard(this, this.mActivity, this.mWindow);
                }
                this.mFitsKeyboard.enable(this.mBarParams.keyboardMode);
            } else if (this.mFitsKeyboard != null) {
                this.mFitsKeyboard.disable();
            }
        }
    }

    private void fitsWindowsAboveLOLLIPOP() {
        int i;
        if (checkFitsSystemWindows(this.mDecorView.findViewById(16908290))) {
            if (this.mBarParams.isSupportActionBar) {
                setPadding(0, this.mBarConfig.getActionBarHeight(), 0, 0);
            }
            return;
        }
        if (!this.mBarParams.fits || this.mFitsStatusBarType != 4) {
            i = 0;
        } else {
            i = this.mBarConfig.getStatusBarHeight();
        }
        if (this.mBarParams.isSupportActionBar) {
            i = this.mBarConfig.getStatusBarHeight() + this.mBarConfig.getActionBarHeight();
        }
        setPadding(0, i, 0, 0);
    }

    private void fitsWindowsEMUI() {
        final View findViewById = this.mDecorView.findViewById(IMMERSION_NAVIGATION_BAR_VIEW);
        if (!this.mBarParams.navigationBarEnable || !this.mBarParams.navigationBarWithKitkatEnable) {
            findViewById.setVisibility(8);
        } else if (findViewById != null && this.mNavigationObserver == null) {
            this.mNavigationObserver = new ContentObserver(new Handler()) {
                public void onChange(boolean z) {
                    int i;
                    int i2;
                    ImmersionBar.this.mBarConfig = new BarConfig(ImmersionBar.this.mActivity);
                    int paddingBottom = ImmersionBar.this.mContentView.getPaddingBottom();
                    int paddingRight = ImmersionBar.this.mContentView.getPaddingRight();
                    if (!(ImmersionBar.this.mActivity == null || ImmersionBar.this.mActivity.getContentResolver() == null)) {
                        if (Settings.System.getInt(ImmersionBar.this.mActivity.getContentResolver(), "navigationbar_is_min", 0) == 1) {
                            findViewById.setVisibility(8);
                        } else {
                            findViewById.setVisibility(0);
                            if (!ImmersionBar.checkFitsSystemWindows(ImmersionBar.this.mDecorView.findViewById(16908290))) {
                                if (ImmersionBar.this.mNavigationBarHeight == 0) {
                                    ImmersionBar.this.mNavigationBarHeight = ImmersionBar.this.mBarConfig.getNavigationBarHeight();
                                }
                                if (ImmersionBar.this.mNavigationBarWidth == 0) {
                                    ImmersionBar.this.mNavigationBarWidth = ImmersionBar.this.mBarConfig.getNavigationBarWidth();
                                }
                                if (!ImmersionBar.this.mBarParams.hideNavigationBar) {
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                                    if (ImmersionBar.this.mBarConfig.isNavigationAtBottom()) {
                                        layoutParams.gravity = 80;
                                        layoutParams.height = ImmersionBar.this.mNavigationBarHeight;
                                        if (!ImmersionBar.this.mBarParams.fullScreen) {
                                            i2 = ImmersionBar.this.mNavigationBarHeight;
                                            i = i2;
                                            paddingRight = 0;
                                            findViewById.setLayoutParams(layoutParams);
                                            paddingBottom = i;
                                        }
                                    } else {
                                        layoutParams.gravity = 8388613;
                                        layoutParams.width = ImmersionBar.this.mNavigationBarWidth;
                                        if (!ImmersionBar.this.mBarParams.fullScreen) {
                                            paddingRight = ImmersionBar.this.mNavigationBarWidth;
                                            i = 0;
                                            findViewById.setLayoutParams(layoutParams);
                                            paddingBottom = i;
                                        }
                                    }
                                    i2 = 0;
                                    i = i2;
                                    paddingRight = 0;
                                    findViewById.setLayoutParams(layoutParams);
                                    paddingBottom = i;
                                }
                            }
                        }
                        paddingBottom = 0;
                        paddingRight = 0;
                    }
                    ImmersionBar.this.setPadding(0, ImmersionBar.this.mContentView.getPaddingTop(), paddingRight, paddingBottom);
                }
            };
            if (!(this.mActivity == null || this.mActivity.getContentResolver() == null || this.mNavigationObserver == null)) {
                this.mActivity.getContentResolver().registerContentObserver(Settings.System.getUriFor("navigationbar_is_min"), true, this.mNavigationObserver);
            }
        }
    }

    private void initBarBelowLOLLIPOP() {
        this.mWindow.addFlags(67108864);
        setupStatusBarView();
        if (this.mBarConfig.hasNavigationBar() || OSUtils.isEMUI3_x()) {
            if (!this.mBarParams.navigationBarEnable || !this.mBarParams.navigationBarWithKitkatEnable) {
                this.mWindow.clearFlags(134217728);
            } else {
                this.mWindow.addFlags(134217728);
            }
            if (this.mNavigationBarHeight == 0) {
                this.mNavigationBarHeight = this.mBarConfig.getNavigationBarHeight();
            }
            if (this.mNavigationBarWidth == 0) {
                this.mNavigationBarWidth = this.mBarConfig.getNavigationBarWidth();
            }
            setupNavBarView();
        }
    }

    private void setBar() {
        if (Build.VERSION.SDK_INT >= 19) {
            int i = 256;
            if (Build.VERSION.SDK_INT < 21 || OSUtils.isEMUI3_x()) {
                initBarBelowLOLLIPOP();
            } else {
                fitsNotchScreen();
                i = setNavigationIconDark(setStatusBarDarkFont(initBarAboveLOLLIPOP(256)));
            }
            int hideBar = hideBar(i);
            fitsWindows();
            this.mDecorView.setSystemUiVisibility(hideBar);
        }
        if (OSUtils.isMIUI6Later()) {
            setMIUIBarDark(this.mWindow, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.mBarParams.statusBarDarkFont);
            if (this.mBarParams.navigationBarEnable) {
                setMIUIBarDark(this.mWindow, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", this.mBarParams.navigationBarDarkIcon);
            }
        }
        if (OSUtils.isFlymeOS4Later()) {
            if (this.mBarParams.flymeOSStatusBarFontColor != 0) {
                FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(this.mActivity, this.mBarParams.flymeOSStatusBarFontColor);
                return;
            }
            FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(this.mActivity, this.mBarParams.statusBarDarkFont);
        }
    }

    private void setupNavBarView() {
        FrameLayout.LayoutParams layoutParams;
        View findViewById = this.mDecorView.findViewById(IMMERSION_NAVIGATION_BAR_VIEW);
        if (findViewById == null) {
            findViewById = new View(this.mActivity);
            findViewById.setId(IMMERSION_NAVIGATION_BAR_VIEW);
            this.mDecorView.addView(findViewById);
        }
        if (this.mBarConfig.isNavigationAtBottom()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.mBarConfig.getNavigationBarHeight());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.mBarConfig.getNavigationBarWidth(), -1);
            layoutParams.gravity = 8388613;
        }
        findViewById.setLayoutParams(layoutParams);
        findViewById.setBackgroundColor(ColorUtils.blendARGB(this.mBarParams.navigationBarColor, this.mBarParams.navigationBarColorTransform, this.mBarParams.navigationBarAlpha));
        if (!this.mBarParams.navigationBarEnable || !this.mBarParams.navigationBarWithKitkatEnable || this.mBarParams.hideNavigationBar) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
        }
    }

    private void setupStatusBarView() {
        View findViewById = this.mDecorView.findViewById(IMMERSION_STATUS_BAR_VIEW);
        if (findViewById == null) {
            findViewById = new View(this.mActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mBarConfig.getStatusBarHeight());
            layoutParams.gravity = 48;
            findViewById.setLayoutParams(layoutParams);
            findViewById.setVisibility(0);
            findViewById.setId(IMMERSION_STATUS_BAR_VIEW);
            this.mDecorView.addView(findViewById);
        }
        if (this.mBarParams.statusBarColorEnabled) {
            findViewById.setBackgroundColor(ColorUtils.blendARGB(this.mBarParams.statusBarColor, this.mBarParams.statusBarColorTransform, this.mBarParams.statusBarAlpha));
        } else {
            findViewById.setBackgroundColor(ColorUtils.blendARGB(this.mBarParams.statusBarColor, 0, this.mBarParams.statusBarAlpha));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void fitsWindowsBelowLOLLIPOP() {
        /*
            r5 = this;
            android.view.ViewGroup r0 = r5.mDecorView
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            boolean r0 = checkFitsSystemWindows(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0020
            com.gyf.barlibrary.BarParams r0 = r5.mBarParams
            boolean r0 = r0.isSupportActionBar
            if (r0 == 0) goto L_0x001f
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getActionBarHeight()
            r5.setPadding(r1, r0, r1, r1)
        L_0x001f:
            return
        L_0x0020:
            com.gyf.barlibrary.BarParams r0 = r5.mBarParams
            boolean r0 = r0.fits
            if (r0 == 0) goto L_0x0032
            int r0 = r5.mFitsStatusBarType
            r2 = 4
            if (r0 != r2) goto L_0x0032
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getStatusBarHeight()
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            com.gyf.barlibrary.BarParams r2 = r5.mBarParams
            boolean r2 = r2.isSupportActionBar
            if (r2 == 0) goto L_0x0046
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getStatusBarHeight()
            com.gyf.barlibrary.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getActionBarHeight()
            int r0 = r0 + r2
        L_0x0046:
            com.gyf.barlibrary.BarConfig r2 = r5.mBarConfig
            boolean r2 = r2.hasNavigationBar()
            if (r2 == 0) goto L_0x009a
            com.gyf.barlibrary.BarParams r2 = r5.mBarParams
            boolean r2 = r2.navigationBarEnable
            if (r2 == 0) goto L_0x009a
            com.gyf.barlibrary.BarParams r2 = r5.mBarParams
            boolean r2 = r2.navigationBarWithKitkatEnable
            if (r2 == 0) goto L_0x009a
            com.gyf.barlibrary.BarParams r2 = r5.mBarParams
            boolean r2 = r2.fullScreen
            if (r2 != 0) goto L_0x0078
            com.gyf.barlibrary.BarConfig r2 = r5.mBarConfig
            boolean r2 = r2.isNavigationAtBottom()
            if (r2 == 0) goto L_0x0071
            com.gyf.barlibrary.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarHeight()
            r3 = r2
            r2 = 0
            goto L_0x007a
        L_0x0071:
            com.gyf.barlibrary.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarWidth()
            goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            r3 = 0
        L_0x007a:
            com.gyf.barlibrary.BarParams r4 = r5.mBarParams
            boolean r4 = r4.hideNavigationBar
            if (r4 == 0) goto L_0x008b
            com.gyf.barlibrary.BarConfig r4 = r5.mBarConfig
            boolean r4 = r4.isNavigationAtBottom()
            if (r4 == 0) goto L_0x0089
            goto L_0x009b
        L_0x0089:
            r2 = 0
            goto L_0x009c
        L_0x008b:
            com.gyf.barlibrary.BarConfig r4 = r5.mBarConfig
            boolean r4 = r4.isNavigationAtBottom()
            if (r4 != 0) goto L_0x009c
            com.gyf.barlibrary.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarWidth()
            goto L_0x009c
        L_0x009a:
            r2 = 0
        L_0x009b:
            r3 = 0
        L_0x009c:
            r5.setPadding(r1, r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.barlibrary.ImmersionBar.fitsWindowsBelowLOLLIPOP():void");
    }

    private void transformView() {
        if (this.mBarParams.viewMap.size() != 0) {
            for (Map.Entry next : this.mBarParams.viewMap.entrySet()) {
                View view = (View) next.getKey();
                Integer valueOf = Integer.valueOf(this.mBarParams.statusBarColor);
                Integer valueOf2 = Integer.valueOf(this.mBarParams.statusBarColorTransform);
                for (Map.Entry entry : ((Map) next.getValue()).entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    valueOf2 = (Integer) entry.getValue();
                    valueOf = num;
                }
                if (view != null) {
                    if (Math.abs(this.mBarParams.viewAlpha - 0.0f) == 0.0f) {
                        view.setBackgroundColor(ColorUtils.blendARGB(valueOf.intValue(), valueOf2.intValue(), this.mBarParams.statusBarAlpha));
                    } else {
                        view.setBackgroundColor(ColorUtils.blendARGB(valueOf.intValue(), valueOf2.intValue(), this.mBarParams.viewAlpha));
                    }
                }
            }
        }
    }

    public static boolean hasNotchScreen(@NonNull View view) {
        return NotchUtils.hasNotchScreen(view);
    }

    public static void hideStatusBar(@NonNull Window window) {
        window.setFlags(1024, 1024);
    }

    public ImmersionBar autoDarkModeEnable(boolean z) {
        return autoDarkModeEnable(z, 0.0f);
    }

    public ImmersionBar autoNavigationBarDarkModeEnable(boolean z) {
        return autoNavigationBarDarkModeEnable(z, 0.0f);
    }

    public ImmersionBar autoStatusBarDarkModeEnable(boolean z) {
        return autoStatusBarDarkModeEnable(z, 0.0f);
    }

    @Deprecated
    public ImmersionBar fixMarginAtBottom(boolean z) {
        this.mBarParams.fixMarginAtBottom = z;
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColorInt(@ColorInt int i) {
        this.mBarParams.flymeOSStatusBarFontColor = i;
        return this;
    }

    public ImmersionBar fullScreen(boolean z) {
        this.mBarParams.fullScreen = z;
        return this;
    }

    public ImmersionBar keyboardMode(int i) {
        this.mBarParams.keyboardMode = i;
        return this;
    }

    public ImmersionBar navigationBarAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.navigationBarAlpha = f2;
        return this;
    }

    public ImmersionBar navigationBarColorInt(@ColorInt int i) {
        this.mBarParams.navigationBarColor = i;
        return this;
    }

    public ImmersionBar navigationBarColorTransformInt(@ColorInt int i) {
        this.mBarParams.navigationBarColorTransform = i;
        return this;
    }

    public ImmersionBar navigationBarDarkIcon(boolean z) {
        return navigationBarDarkIcon(z, 0.0f);
    }

    public ImmersionBar navigationBarEnable(boolean z) {
        this.mBarParams.navigationBarEnable = z;
        return this;
    }

    public ImmersionBar navigationBarWithEMUI3Enable(boolean z) {
        this.mBarParams.navigationBarWithEMUI3Enable = z;
        return this;
    }

    public ImmersionBar navigationBarWithKitkatEnable(boolean z) {
        this.mBarParams.navigationBarWithKitkatEnable = z;
        return this;
    }

    public ImmersionBar statusBarAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.statusBarAlpha = f2;
        return this;
    }

    public ImmersionBar statusBarColorInt(@ColorInt int i) {
        this.mBarParams.statusBarColor = i;
        return this;
    }

    public ImmersionBar statusBarColorTransformEnable(boolean z) {
        this.mBarParams.statusBarColorEnabled = z;
        return this;
    }

    public ImmersionBar statusBarColorTransformInt(@ColorInt int i) {
        this.mBarParams.statusBarColorTransform = i;
        return this;
    }

    public ImmersionBar statusBarDarkFont(boolean z) {
        return statusBarDarkFont(z, 0.0f);
    }

    public ImmersionBar supportActionBar(boolean z) {
        this.mBarParams.isSupportActionBar = z;
        return this;
    }

    public ImmersionBar titleBar(@IdRes int i) {
        return titleBar(i, true);
    }

    public ImmersionBar viewAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.viewAlpha = f2;
        return this;
    }

    private ImmersionBar(DialogFragment dialogFragment) {
        this(dialogFragment, dialogFragment.getDialog());
    }

    @TargetApi(14)
    public static int getActionBarHeight(@NonNull Activity activity) {
        return new BarConfig(activity).getActionBarHeight();
    }

    @TargetApi(14)
    public static int getNavigationBarHeight(@NonNull Activity activity) {
        return new BarConfig(activity).getNavigationBarHeight();
    }

    @TargetApi(14)
    public static int getNavigationBarWidth(@NonNull Activity activity) {
        return new BarConfig(activity).getNavigationBarWidth();
    }

    @TargetApi(14)
    public static int getStatusBarHeight(@NonNull Activity activity) {
        return new BarConfig(activity).getStatusBarHeight();
    }

    @TargetApi(14)
    public static boolean hasNavigationBar(@NonNull Activity activity) {
        return new BarConfig(activity).hasNavigationBar();
    }

    public static boolean hasNotchScreen(@NonNull Activity activity) {
        return new BarConfig(activity).hasNotchScreen();
    }

    @TargetApi(14)
    public static boolean isNavigationAtBottom(@NonNull Activity activity) {
        return new BarConfig(activity).isNavigationAtBottom();
    }

    private int setNavigationIconDark(int i) {
        if (Build.VERSION.SDK_INT < 26 || !this.mBarParams.navigationBarDarkIcon) {
            return i;
        }
        return i | 16;
    }

    private int setStatusBarDarkFont(int i) {
        if (Build.VERSION.SDK_INT < 23 || !this.mBarParams.statusBarDarkFont) {
            return i;
        }
        return i | 8192;
    }

    public ImmersionBar addViewSupportTransformColor(View view) {
        return addViewSupportTransformColorInt(view, this.mBarParams.statusBarColorTransform);
    }

    public ImmersionBar barAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.statusBarAlpha = f2;
        this.mBarParams.navigationBarAlpha = f2;
        return this;
    }

    public ImmersionBar barColor(@ColorRes int i) {
        return barColorInt(ContextCompat.getColor(this.mActivity, i));
    }

    public ImmersionBar barColorInt(@ColorInt int i) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        return this;
    }

    public ImmersionBar barColorTransform(@ColorRes int i) {
        return barColorTransformInt(ContextCompat.getColor(this.mActivity, i));
    }

    public ImmersionBar barColorTransformInt(@ColorInt int i) {
        this.mBarParams.statusBarColorTransform = i;
        this.mBarParams.navigationBarColorTransform = i;
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColor(@ColorRes int i) {
        this.mBarParams.flymeOSStatusBarFontColor = ContextCompat.getColor(this.mActivity, i);
        return this;
    }

    public ImmersionBar keyboardEnable(boolean z) {
        return keyboardEnable(z, this.mBarParams.keyboardMode);
    }

    public ImmersionBar navigationBarColor(@ColorRes int i) {
        return navigationBarColorInt(ContextCompat.getColor(this.mActivity, i));
    }

    public ImmersionBar navigationBarColorTransform(@ColorRes int i) {
        return navigationBarColorTransformInt(ContextCompat.getColor(this.mActivity, i));
    }

    public ImmersionBar setOnKeyboardListener(OnKeyboardListener onKeyboardListener) {
        if (this.mBarParams.onKeyboardListener == null) {
            this.mBarParams.onKeyboardListener = onKeyboardListener;
        }
        return this;
    }

    public ImmersionBar statusBarColor(@ColorRes int i) {
        return statusBarColorInt(ContextCompat.getColor(this.mActivity, i));
    }

    public ImmersionBar statusBarColorTransform(@ColorRes int i) {
        return statusBarColorTransformInt(ContextCompat.getColor(this.mActivity, i));
    }

    public ImmersionBar statusBarView(@IdRes int i) {
        return statusBarView(this.mActivity.findViewById(i));
    }

    private ImmersionBar(Fragment fragment) {
        this((Activity) fragment.getActivity(), fragment);
    }

    private static boolean isEmpty(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static ImmersionBar with(@NonNull Activity activity) {
        ImmersionBar immersionBar = mImmersionBarMap.get(activity.toString());
        if (immersionBar != null) {
            return immersionBar;
        }
        ImmersionBar immersionBar2 = new ImmersionBar(activity);
        mImmersionBarMap.put(activity.toString(), immersionBar2);
        return immersionBar2;
    }

    public ImmersionBar addTag(String str) {
        if (!isEmpty(str)) {
            this.mTagMap.put(str, this.mBarParams.clone());
            return this;
        }
        throw new IllegalArgumentException("tag不能为空");
    }

    public ImmersionBar barColorTransform(String str) {
        return barColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar fitsSystemWindows(boolean z) {
        this.mBarParams.fits = z;
        if (!this.mBarParams.fits) {
            this.mFitsStatusBarType = 0;
        } else if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 4;
        }
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColor(String str) {
        this.mBarParams.flymeOSStatusBarFontColor = Color.parseColor(str);
        return this;
    }

    public ImmersionBar getTag(String str) {
        if (!isEmpty(str)) {
            BarParams barParams = this.mTagMap.get(str);
            if (barParams != null) {
                this.mBarParams = barParams.clone();
            }
            return this;
        }
        throw new IllegalArgumentException("tag不能为空");
    }

    public ImmersionBar navigationBarColorTransform(String str) {
        return navigationBarColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar statusBarColorTransform(String str) {
        return statusBarColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar titleBarMarginTop(View view) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 2;
        }
        this.mBarParams.titleBarView = view;
        return this;
    }

    public static boolean checkFitsSystemWindows(View view) {
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (((childAt instanceof DrawerLayout) && checkFitsSystemWindows(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    private int hideBar(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            switch (this.mBarParams.barHide) {
                case FLAG_HIDE_BAR:
                    i |= 518;
                    break;
                case FLAG_HIDE_STATUS_BAR:
                    i |= 1028;
                    break;
                case FLAG_HIDE_NAVIGATION_BAR:
                    i |= 514;
                    break;
                case FLAG_SHOW_BAR:
                    i |= 0;
                    break;
            }
        }
        return i | 4096;
    }

    public static void setFitsSystemWindows(Activity activity) {
        if (activity != null) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ViewGroup) && !(childAt instanceof DrawerLayout)) {
                    childAt.setFitsSystemWindows(true);
                    ((ViewGroup) childAt).setClipToPadding(true);
                }
            }
        }
    }

    public ImmersionBar removeSupportView(View view) {
        if (view != null) {
            Map map = this.mBarParams.viewMap.get(view);
            if (!(map == null || map.size() == 0)) {
                this.mBarParams.viewMap.remove(view);
            }
            return this;
        }
        throw new IllegalArgumentException("View参数不能为空");
    }

    public ImmersionBar statusBarView(View view) {
        if (view == null) {
            return this;
        }
        this.mBarParams.statusBarView = view;
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 3;
        }
        return this;
    }

    public ImmersionBar titleBarMarginTop(@IdRes int i) {
        if (this.mFragment == null || this.mFragment.getView() == null) {
            return titleBarMarginTop(this.mActivity.findViewById(i));
        }
        return titleBarMarginTop(this.mFragment.getView().findViewById(i));
    }

    private ImmersionBar(Activity activity) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mWindow = this.mActivity.getWindow();
        this.mImmersionBarName = this.mActivity.toString();
        this.mBarParams = new BarParams();
        this.mDecorView = (ViewGroup) this.mWindow.getDecorView();
        this.mContentView = (ViewGroup) this.mDecorView.findViewById(16908290);
    }

    public ImmersionBar barColor(String str) {
        return barColorInt(Color.parseColor(str));
    }

    public ImmersionBar hideBar(BarHide barHide) {
        this.mBarParams.barHide = barHide;
        if (Build.VERSION.SDK_INT == 19 || OSUtils.isEMUI3_x()) {
            if (this.mBarParams.barHide == BarHide.FLAG_HIDE_NAVIGATION_BAR || this.mBarParams.barHide == BarHide.FLAG_HIDE_BAR) {
                this.mBarParams.hideNavigationBar = true;
            } else {
                this.mBarParams.hideNavigationBar = false;
            }
        }
        return this;
    }

    public ImmersionBar navigationBarColor(String str) {
        return navigationBarColorInt(Color.parseColor(str));
    }

    public ImmersionBar statusBarColor(String str) {
        return statusBarColorInt(Color.parseColor(str));
    }

    public ImmersionBar titleBar(View view) {
        if (view == null) {
            return this;
        }
        return titleBar(view, true);
    }

    @RequiresApi(api = 21)
    private int initBarAboveLOLLIPOP(int i) {
        if (!this.mHasNavigationBarColor) {
            this.mBarParams.defaultNavigationBarColor = this.mWindow.getNavigationBarColor();
            this.mHasNavigationBarColor = true;
        }
        int i2 = i | 1024;
        if (this.mBarParams.fullScreen && this.mBarParams.navigationBarEnable) {
            i2 |= 512;
        }
        this.mWindow.clearFlags(67108864);
        if (this.mBarConfig.hasNavigationBar()) {
            this.mWindow.clearFlags(134217728);
        }
        this.mWindow.addFlags(Integer.MIN_VALUE);
        if (this.mBarParams.statusBarColorEnabled) {
            this.mWindow.setStatusBarColor(ColorUtils.blendARGB(this.mBarParams.statusBarColor, this.mBarParams.statusBarColorTransform, this.mBarParams.statusBarAlpha));
        } else {
            this.mWindow.setStatusBarColor(ColorUtils.blendARGB(this.mBarParams.statusBarColor, 0, this.mBarParams.statusBarAlpha));
        }
        if (this.mBarParams.navigationBarEnable) {
            this.mWindow.setNavigationBarColor(ColorUtils.blendARGB(this.mBarParams.navigationBarColor, this.mBarParams.navigationBarColorTransform, this.mBarParams.navigationBarAlpha));
        } else {
            this.mWindow.setNavigationBarColor(this.mBarParams.defaultNavigationBarColor);
        }
        return i2;
    }

    public static ImmersionBar with(@NonNull DialogFragment dialogFragment) {
        if (dialogFragment.getActivity() != null) {
            Map<String, ImmersionBar> map = mImmersionBarMap;
            ImmersionBar immersionBar = map.get(dialogFragment.getActivity().toString() + dialogFragment.toString());
            if (immersionBar != null) {
                return immersionBar;
            }
            ImmersionBar immersionBar2 = new ImmersionBar(dialogFragment);
            Map<String, ImmersionBar> map2 = mImmersionBarMap;
            map2.put(dialogFragment.getActivity().toString() + dialogFragment.toString(), immersionBar2);
            return immersionBar2;
        }
        throw new IllegalArgumentException("Activity不能为空!!!");
    }

    private ImmersionBar(Activity activity, Dialog dialog) {
        this(activity, dialog, "");
    }

    public ImmersionBar fitsSystemWindowsInt(boolean z, @ColorInt int i) {
        return fitsSystemWindowsInt(z, i, -16777216, 0.0f);
    }

    public ImmersionBar autoNavigationBarDarkModeEnable(boolean z, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.autoNavigationBarDarkModeEnable = z;
        this.mBarParams.autoNavigationBarDarkModeAlpha = f2;
        return this;
    }

    public ImmersionBar autoStatusBarDarkModeEnable(boolean z, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.autoStatusBarDarkModeEnable = z;
        this.mBarParams.autoStatusBarDarkModeAlpha = f2;
        return this;
    }

    public ImmersionBar fitsSystemWindows(boolean z, @ColorRes int i) {
        return fitsSystemWindowsInt(z, ContextCompat.getColor(this.mActivity, i));
    }

    public ImmersionBar navigationBarColorInt(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.navigationBarAlpha = f2;
        return this;
    }

    public ImmersionBar statusBarColorInt(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.statusBarAlpha = f2;
        return this;
    }

    public ImmersionBar titleBar(@IdRes int i, View view) {
        return titleBar(view.findViewById(i), true);
    }

    public ImmersionBar titleBarMarginTop(@IdRes int i, View view) {
        return titleBarMarginTop(view.findViewById(i));
    }

    public static void setStatusBarView(Activity activity, View view) {
        if (!(activity == null || view == null || Build.VERSION.SDK_INT < 19)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = getStatusBarHeight(activity);
            view.setLayoutParams(layoutParams);
        }
    }

    public ImmersionBar addViewSupportTransformColor(View view, @ColorRes int i) {
        return addViewSupportTransformColorInt(view, ContextCompat.getColor(this.mActivity, i));
    }

    public ImmersionBar autoDarkModeEnable(boolean z, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.autoStatusBarDarkModeEnable = z;
        this.mBarParams.autoStatusBarDarkModeAlpha = f2;
        this.mBarParams.autoNavigationBarDarkModeEnable = z;
        this.mBarParams.autoNavigationBarDarkModeAlpha = f2;
        return this;
    }

    public ImmersionBar barColor(@ColorRes int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return barColorInt(ContextCompat.getColor(this.mActivity, i), (float) i);
    }

    public ImmersionBar barColorInt(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.statusBarAlpha = f2;
        this.mBarParams.navigationBarAlpha = f2;
        return this;
    }

    public ImmersionBar keyboardEnable(boolean z, int i) {
        this.mBarParams.keyboardEnable = z;
        this.mBarParams.keyboardMode = i;
        return this;
    }

    public ImmersionBar navigationBarColor(@ColorRes int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return navigationBarColorInt(ContextCompat.getColor(this.mActivity, i), f2);
    }

    public ImmersionBar navigationBarDarkIcon(boolean z, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.navigationBarDarkIcon = z;
        if (!z || isSupportNavigationIconDark()) {
            this.mBarParams.navigationBarAlpha = 0.0f;
        } else {
            this.mBarParams.navigationBarAlpha = f2;
        }
        return this;
    }

    public ImmersionBar statusBarColor(@ColorRes int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return statusBarColorInt(ContextCompat.getColor(this.mActivity, i), f2);
    }

    public ImmersionBar statusBarDarkFont(boolean z, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.statusBarDarkFont = z;
        if (!z || isSupportStatusBarDarkFont()) {
            this.mBarParams.flymeOSStatusBarFontColor = 0;
            this.mBarParams.statusBarAlpha = 0.0f;
        } else {
            this.mBarParams.statusBarAlpha = f2;
        }
        return this;
    }

    public ImmersionBar statusBarView(@IdRes int i, View view) {
        return statusBarView(view.findViewById(i));
    }

    public static void setTitleBarMarginTop(Activity activity, View view) {
        if (!(activity == null || view == null || Build.VERSION.SDK_INT < 19)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(activity), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public ImmersionBar addViewSupportTransformColorInt(View view, @ColorInt int i) {
        if (view != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(this.mBarParams.statusBarColor), Integer.valueOf(i));
            this.mBarParams.viewMap.put(view, hashMap);
            return this;
        }
        throw new IllegalArgumentException("View参数不能为空");
    }

    public ImmersionBar titleBar(@IdRes int i, boolean z) {
        if (this.mFragment == null || this.mFragment.getView() == null) {
            return titleBar(this.mActivity.findViewById(i), z);
        }
        return titleBar(this.mFragment.getView().findViewById(i), z);
    }

    public static void setTitleBar(final Activity activity, final View view) {
        if (!(activity == null || view == null || Build.VERSION.SDK_INT < 19)) {
            final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams.height == -2 || layoutParams.height == -1) {
                view.post(new Runnable() {
                    public final void run() {
                        layoutParams.height = view.getHeight() + ImmersionBar.getStatusBarHeight(activity);
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + ImmersionBar.getStatusBarHeight(activity), view.getPaddingRight(), view.getPaddingBottom());
                    }
                });
            } else {
                layoutParams.height += getStatusBarHeight(activity);
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + getStatusBarHeight(activity), view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    public static ImmersionBar with(@NonNull Activity activity, @NonNull Dialog dialog) {
        Map<String, ImmersionBar> map = mImmersionBarMap;
        ImmersionBar immersionBar = map.get(activity.toString() + dialog.toString());
        if (immersionBar != null) {
            return immersionBar;
        }
        ImmersionBar immersionBar2 = new ImmersionBar(activity, dialog);
        Map<String, ImmersionBar> map2 = mImmersionBarMap;
        map2.put(activity.toString() + dialog.toString(), immersionBar2);
        return immersionBar2;
    }

    public ImmersionBar addViewSupportTransformColor(View view, String str) {
        return addViewSupportTransformColorInt(view, Color.parseColor(str));
    }

    public ImmersionBar barColor(String str, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return barColorInt(Color.parseColor(str), f2);
    }

    public ImmersionBar navigationBarColor(String str, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return navigationBarColorInt(Color.parseColor(str), f2);
    }

    public ImmersionBar statusBarColor(String str, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return statusBarColorInt(Color.parseColor(str), f2);
    }

    public ImmersionBar titleBar(View view, boolean z) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 1;
        }
        this.mBarParams.titleBarView = view;
        this.mBarParams.statusBarColorEnabled = z;
        return this;
    }

    private ImmersionBar(Activity activity, Fragment fragment) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mFragment = fragment;
        if (this.mActivity == null) {
            throw new IllegalArgumentException("Activity不能为空!!!");
        } else if (mImmersionBarMap.get(this.mActivity.toString()) != null) {
            this.mIsFragment = true;
            this.mWindow = this.mActivity.getWindow();
            this.mImmersionBarName = activity.toString() + fragment.toString();
            this.mBarParams = new BarParams();
            this.mDecorView = (ViewGroup) this.mWindow.getDecorView();
            this.mContentView = (ViewGroup) this.mDecorView.findViewById(16908290);
        } else {
            throw new IllegalArgumentException("必须先在宿主Activity初始化");
        }
    }

    public static ImmersionBar with(@NonNull Activity activity, @NonNull Fragment fragment) {
        Map<String, ImmersionBar> map = mImmersionBarMap;
        ImmersionBar immersionBar = map.get(activity.toString() + fragment.toString());
        if (immersionBar != null) {
            return immersionBar;
        }
        ImmersionBar immersionBar2 = new ImmersionBar(activity, fragment);
        Map<String, ImmersionBar> map2 = mImmersionBarMap;
        map2.put(activity.toString() + fragment.toString(), immersionBar2);
        return immersionBar2;
    }

    private ImmersionBar(DialogFragment dialogFragment, Dialog dialog) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = dialogFragment.getActivity();
        this.mFragment = dialogFragment;
        this.mDialog = dialog;
        if (this.mActivity == null) {
            throw new IllegalArgumentException("Activity不能为空!!!");
        } else if (this.mDialog == null) {
            throw new IllegalArgumentException("DialogFragment中的dialog不能为空");
        } else if (mImmersionBarMap.get(this.mActivity.toString()) != null) {
            this.mWindow = this.mDialog.getWindow();
            this.mImmersionBarName = this.mActivity.toString() + dialogFragment.toString();
            this.mBarParams = new BarParams();
            this.mDecorView = (ViewGroup) this.mWindow.getDecorView();
            this.mContentView = (ViewGroup) this.mDecorView.findViewById(16908290);
        } else {
            throw new IllegalArgumentException("必须先在宿主Activity初始化");
        }
    }

    @Deprecated
    public static ImmersionBar with(@NonNull DialogFragment dialogFragment, @NonNull Dialog dialog) {
        if (dialogFragment.getActivity() != null) {
            Map<String, ImmersionBar> map = mImmersionBarMap;
            ImmersionBar immersionBar = map.get(dialogFragment.getActivity().toString() + dialogFragment.toString());
            if (immersionBar != null) {
                return immersionBar;
            }
            ImmersionBar immersionBar2 = new ImmersionBar(dialogFragment, dialog);
            Map<String, ImmersionBar> map2 = mImmersionBarMap;
            map2.put(dialogFragment.getActivity().toString() + dialogFragment.toString(), immersionBar2);
            return immersionBar2;
        }
        throw new IllegalArgumentException("Activity不能为空!!!");
    }

    public ImmersionBar navigationBarColorInt(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.navigationBarColorTransform = i2;
        this.mBarParams.navigationBarAlpha = f2;
        return this;
    }

    public ImmersionBar statusBarColorInt(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.statusBarColorTransform = i2;
        this.mBarParams.statusBarAlpha = f2;
        return this;
    }

    public ImmersionBar titleBar(@IdRes int i, View view, boolean z) {
        return titleBar(view.findViewById(i), z);
    }

    public ImmersionBar addViewSupportTransformColor(View view, @ColorRes int i, @ColorRes int i2) {
        return addViewSupportTransformColorInt(view, ContextCompat.getColor(this.mActivity, i), ContextCompat.getColor(this.mActivity, i2));
    }

    public ImmersionBar barColor(@ColorRes int i, @ColorRes int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return barColorInt(ContextCompat.getColor(this.mActivity, i), ContextCompat.getColor(this.mActivity, i2), f2);
    }

    public ImmersionBar barColorInt(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.statusBarColorTransform = i2;
        this.mBarParams.navigationBarColorTransform = i2;
        this.mBarParams.statusBarAlpha = f2;
        this.mBarParams.navigationBarAlpha = f2;
        return this;
    }

    public ImmersionBar navigationBarColor(@ColorRes int i, @ColorRes int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return navigationBarColorInt(ContextCompat.getColor(this.mActivity, i), ContextCompat.getColor(this.mActivity, i2), f2);
    }

    public ImmersionBar statusBarColor(@ColorRes int i, @ColorRes int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return statusBarColorInt(ContextCompat.getColor(this.mActivity, i), ContextCompat.getColor(this.mActivity, i2), f2);
    }

    @SuppressLint({"PrivateApi"})
    private void setMIUIBarDark(Window window, String str, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField(str).getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
                if (z) {
                    method.invoke(window, new Object[]{Integer.valueOf(i), Integer.valueOf(i)});
                } else {
                    method.invoke(window, new Object[]{0, Integer.valueOf(i)});
                }
            } catch (Exception unused) {
            }
        }
    }

    public ImmersionBar addViewSupportTransformColorInt(View view, @ColorInt int i, @ColorInt int i2) {
        if (view != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
            this.mBarParams.viewMap.put(view, hashMap);
            return this;
        }
        throw new IllegalArgumentException("View参数不能为空");
    }

    private ImmersionBar(Activity activity, Dialog dialog, String str) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mDialog = dialog;
        if (this.mActivity == null) {
            throw new IllegalArgumentException("Activity不能为空!!!");
        } else if (this.mDialog == null) {
            throw new IllegalArgumentException("dialog不能为空");
        } else if (mImmersionBarMap.get(this.mActivity.toString()) != null) {
            this.mWindow = this.mDialog.getWindow();
            this.mImmersionBarName = activity.toString() + dialog.toString() + str;
            this.mBarParams = new BarParams();
            this.mDecorView = (ViewGroup) this.mWindow.getDecorView();
            this.mContentView = (ViewGroup) this.mDecorView.findViewById(16908290);
        } else {
            throw new IllegalArgumentException("必须先在宿主Activity初始化");
        }
    }

    @Deprecated
    public static ImmersionBar with(@NonNull Activity activity, @NonNull Dialog dialog, @NonNull String str) {
        Map<String, ImmersionBar> map = mImmersionBarMap;
        ImmersionBar immersionBar = map.get(activity.toString() + dialog.toString() + str);
        if (immersionBar != null) {
            return immersionBar;
        }
        ImmersionBar immersionBar2 = new ImmersionBar(activity, dialog, str);
        Map<String, ImmersionBar> map2 = mImmersionBarMap;
        map2.put(activity.toString() + dialog.toString() + str, immersionBar2);
        return immersionBar2;
    }

    public ImmersionBar addViewSupportTransformColor(View view, String str, String str2) {
        return addViewSupportTransformColorInt(view, Color.parseColor(str), Color.parseColor(str2));
    }

    public ImmersionBar barColor(String str, String str2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return barColorInt(Color.parseColor(str), Color.parseColor(str2), f2);
    }

    public ImmersionBar navigationBarColor(String str, String str2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return navigationBarColorInt(Color.parseColor(str), Color.parseColor(str2), f2);
    }

    public ImmersionBar statusBarColor(String str, String str2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return statusBarColorInt(Color.parseColor(str), Color.parseColor(str2), f2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (this.mContentView != null) {
            this.mContentView.setPadding(i, i2, i3, i4);
        }
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }

    public ImmersionBar fitsSystemWindows(boolean z, @ColorRes int i, @ColorRes int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return fitsSystemWindowsInt(z, ContextCompat.getColor(this.mActivity, i), ContextCompat.getColor(this.mActivity, i2), f2);
    }

    public ImmersionBar fitsSystemWindowsInt(boolean z, @ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.mBarParams.fits = z;
        this.mBarParams.contentColor = i;
        this.mBarParams.contentColorTransform = i2;
        this.mBarParams.contentAlpha = f2;
        if (!this.mBarParams.fits) {
            this.mFitsStatusBarType = 0;
        } else if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 4;
        }
        this.mContentView.setBackgroundColor(ColorUtils.blendARGB(this.mBarParams.contentColor, this.mBarParams.contentColorTransform, this.mBarParams.contentAlpha));
        return this;
    }
}
