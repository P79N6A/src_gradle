package com.bytedance.ies.uikit.statusbar;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Method;

public class WindowTintManager {
    public static String sNavBarOverride;
    private final SystemBarConfig mConfig;
    private int mFlag;
    private boolean mNavBarAvailable;
    private boolean mNavBarTintEnabled;
    private View mNavBarTintView;
    private View mRootView;
    private boolean mStatusBarAvailable;
    private boolean mStatusBarTintEnabled;
    private View mStatusBarTintView;

    public static class SystemBarConfig {
        private final int mActionBarHeight;
        private final boolean mHasNavigationBar;
        private final boolean mInPortrait;
        private final int mNavigationBarHeight;
        private final int mNavigationBarWidth;
        private final float mSmallestWidthDp;
        private final int mStatusBarHeight;
        private final boolean mTranslucentNavBar;
        private final boolean mTranslucentStatusBar;

        public int getActionBarHeight() {
            return this.mActionBarHeight;
        }

        public int getNavigationBarHeight() {
            return this.mNavigationBarHeight;
        }

        public int getNavigationBarWidth() {
            return this.mNavigationBarWidth;
        }

        public int getStatusBarHeight() {
            return this.mStatusBarHeight;
        }

        public boolean hasNavigtionBar() {
            return this.mHasNavigationBar;
        }

        public int getPixelInsetBottom() {
            if (!this.mTranslucentNavBar || !isNavigationAtBottom()) {
                return 0;
            }
            return this.mNavigationBarHeight;
        }

        public int getPixelInsetRight() {
            if (!this.mTranslucentNavBar || isNavigationAtBottom()) {
                return 0;
            }
            return this.mNavigationBarWidth;
        }

        public boolean isNavigationAtBottom() {
            if (this.mSmallestWidthDp >= 600.0f || this.mInPortrait) {
                return true;
            }
            return false;
        }

        public int getPixelInsetTop(boolean z) {
            int i;
            int i2 = 0;
            if (this.mTranslucentStatusBar) {
                i = this.mStatusBarHeight;
            } else {
                i = 0;
            }
            if (z) {
                i2 = this.mActionBarHeight;
            }
            return i + i2;
        }

        @TargetApi(14)
        private int getNavigationBarHeight(Context context) {
            String str;
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !hasNavBar(context)) {
                return 0;
            }
            if (this.mInPortrait) {
                str = "navigation_bar_height";
            } else {
                str = "navigation_bar_height_landscape";
            }
            return getInternalDimensionSize(resources, str);
        }

        @TargetApi(14)
        private int getNavigationBarWidth(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !hasNavBar(context)) {
                return 0;
            }
            return getInternalDimensionSize(resources, "navigation_bar_width");
        }

        @TargetApi(14)
        private int getActionBarHeight(Context context) {
            if (Build.VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        @SuppressLint({"NewApi"})
        private float getSmallestWidthDp(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            return Math.min(((float) displayMetrics.widthPixels) / displayMetrics.density, ((float) displayMetrics.heightPixels) / displayMetrics.density);
        }

        @TargetApi(14)
        private boolean hasNavBar(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier != 0) {
                boolean z = resources.getBoolean(identifier);
                if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(WindowTintManager.sNavBarOverride)) {
                    z = false;
                } else if (PushConstants.PUSH_TYPE_NOTIFY.equals(WindowTintManager.sNavBarOverride)) {
                    z = true;
                }
                return z;
            } else if (!ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return true;
            } else {
                return false;
            }
        }

        private int getInternalDimensionSize(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        private SystemBarConfig(Activity activity, boolean z, boolean z2) {
            boolean z3;
            Resources resources = activity.getResources();
            boolean z4 = false;
            if (resources.getConfiguration().orientation == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.mInPortrait = z3;
            this.mSmallestWidthDp = getSmallestWidthDp(activity);
            this.mStatusBarHeight = getInternalDimensionSize(resources, "status_bar_height");
            this.mActionBarHeight = getActionBarHeight(activity);
            this.mNavigationBarHeight = getNavigationBarHeight(activity);
            this.mNavigationBarWidth = getNavigationBarWidth(activity);
            this.mHasNavigationBar = this.mNavigationBarHeight > 0 ? true : z4;
            this.mTranslucentStatusBar = z;
            this.mTranslucentNavBar = z2;
        }
    }

    public SystemBarConfig getConfig() {
        return this.mConfig;
    }

    public int getFlag() {
        return this.mFlag;
    }

    public boolean isNavBarTintEnabled() {
        return this.mNavBarTintEnabled;
    }

    public boolean isStatusBarTintEnabled() {
        return this.mStatusBarTintEnabled;
    }

    public int getStatusBarHeight() {
        return this.mConfig.getStatusBarHeight();
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                sNavBarOverride = (String) declaredMethod.invoke(null, new Object[]{"qemu.hw.mainkeys"});
            } catch (Throwable unused) {
                sNavBarOverride = null;
            }
        }
    }

    public void setTintAlpha(float f2) {
        setStatusBarAlpha(f2);
        setNavigationBarAlpha(f2);
    }

    public void setTintColor(int i) {
        setStatusBarTintColor(i);
        setNavigationBarTintColor(i);
    }

    public void setTintDrawable(Drawable drawable) {
        setStatusBarTintDrawable(drawable);
        setNavigationBarTintDrawable(drawable);
    }

    public void setTintResource(int i) {
        setStatusBarTintResource(i);
        setNavigationBarTintResource(i);
    }

    @TargetApi(11)
    public void setNavigationBarAlpha(float f2) {
        if (this.mNavBarAvailable && Build.VERSION.SDK_INT >= 11) {
            this.mNavBarTintView.setAlpha(f2);
        }
    }

    public void setNavigationBarTintColor(int i) {
        if (this.mNavBarAvailable) {
            this.mNavBarTintView.setBackgroundColor(i);
        }
    }

    public void setNavigationBarTintDrawable(Drawable drawable) {
        if (this.mNavBarAvailable) {
            this.mNavBarTintView.setBackgroundDrawable(drawable);
        }
    }

    public void setNavigationBarTintResource(int i) {
        if (this.mNavBarAvailable) {
            this.mNavBarTintView.setBackgroundResource(i);
        }
    }

    @TargetApi(11)
    public void setStatusBarAlpha(float f2) {
        if (this.mStatusBarAvailable && Build.VERSION.SDK_INT >= 11) {
            this.mStatusBarTintView.setAlpha(f2);
        }
    }

    public void setStatusBarTintColor(int i) {
        if (this.mStatusBarAvailable) {
            this.mStatusBarTintView.setBackgroundColor(i);
        }
    }

    public void setStatusBarTintDrawable(Drawable drawable) {
        if (this.mStatusBarAvailable) {
            this.mStatusBarTintView.setBackgroundDrawable(drawable);
        }
    }

    public void setStatusBarTintResource(int i) {
        if (this.mStatusBarAvailable) {
            this.mStatusBarTintView.setBackgroundResource(i);
        }
    }

    public void setNavigationBarTintEnabled(boolean z) {
        int i;
        this.mNavBarTintEnabled = z;
        if (this.mNavBarAvailable) {
            View view = this.mNavBarTintView;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setStatusBarTintEnabled(boolean z) {
        int i;
        this.mStatusBarTintEnabled = z;
        if (this.mStatusBarAvailable) {
            View view = this.mStatusBarTintView;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void changeStatusBarVisual(int i) {
        if (this.mStatusBarTintView != null) {
            ViewGroup.LayoutParams layoutParams = this.mRootView.getLayoutParams();
            if (i != this.mStatusBarTintView.getVisibility()) {
                this.mStatusBarTintView.setVisibility(i);
                if (i == 8) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin -= this.mConfig.getStatusBarHeight();
                    return;
                }
                ((FrameLayout.LayoutParams) layoutParams).topMargin += this.mConfig.getStatusBarHeight();
            }
        }
    }

    private void setupNavBarView(Context context, ViewGroup viewGroup, View view) {
        FrameLayout.LayoutParams layoutParams;
        this.mNavBarTintView = new View(context);
        if (this.mConfig.isNavigationAtBottom()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.mConfig.getNavigationBarHeight());
            layoutParams.gravity = 80;
            if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin = this.mConfig.getNavigationBarHeight();
            }
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.mConfig.getNavigationBarWidth(), -1);
            layoutParams.gravity = 5;
        }
        this.mNavBarTintView.setLayoutParams(layoutParams);
        this.mNavBarTintView.setBackgroundColor(-16777216);
        this.mNavBarTintView.setVisibility(8);
        viewGroup.addView(this.mNavBarTintView);
    }

    private void setupStatusBarView(Context context, ViewGroup viewGroup, View view) {
        this.mStatusBarTintView = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mConfig.getStatusBarHeight());
        layoutParams.gravity = 48;
        if (this.mNavBarAvailable && !this.mConfig.isNavigationAtBottom()) {
            layoutParams.rightMargin = this.mConfig.getNavigationBarWidth();
        }
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = this.mConfig.getStatusBarHeight();
        }
        this.mStatusBarTintView.setLayoutParams(layoutParams);
        this.mStatusBarTintView.setBackgroundColor(-16777216);
        this.mStatusBarTintView.setVisibility(8);
        viewGroup.addView(this.mStatusBarTintView);
    }

    /* JADX INFO: finally extract failed */
    @TargetApi(19)
    public WindowTintManager(Activity activity, View view, int i) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        this.mRootView = view;
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.mStatusBarAvailable = obtainStyledAttributes.getBoolean(0, false);
                this.mNavBarAvailable = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (!((attributes.flags & 67108864) == 0 && (attributes.flags & Integer.MIN_VALUE) == 0) && (i & 1) == 0) {
                    this.mStatusBarAvailable = true;
                }
                if ((attributes.flags & 134217728) != 0) {
                    this.mNavBarAvailable = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.mConfig = new SystemBarConfig(activity, this.mStatusBarAvailable, this.mNavBarAvailable);
        if (!this.mConfig.hasNavigtionBar()) {
            this.mNavBarAvailable = false;
        }
        if (this.mStatusBarAvailable) {
            setupStatusBarView(activity, viewGroup, view);
        }
        if (this.mNavBarAvailable) {
            setupNavBarView(activity, viewGroup, view);
        }
        this.mFlag = i;
    }
}
