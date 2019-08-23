package com.bytedance.ies.uikit.base;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.ies.uikit.base.AppHooks;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.bytedance.ies.uikit.statusbar.WindowTintManager;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AbsActivity extends AppCompatActivity implements IComponent {
    public static int mStartNum = 0;
    private static volatile int sActivityId;
    private static Set<String> sActivitySet = new HashSet();
    private static WeakContainer<AbsActivity> sFinishedActivityContainer = new WeakContainer<>();
    private boolean mDisableOptimizeViewHierarchy;
    private BroadcastReceiver mExitAppReceiver;
    private String mKey;
    private WeakContainer<LifeCycleMonitor> mMonitors = new WeakContainer<>();
    protected boolean mStatusActive;
    protected boolean mStatusDestroyed;
    protected WindowTintManager mTintManager;

    /* access modifiers changed from: protected */
    public boolean enableInitHook() {
        return true;
    }

    public boolean enableMobClick() {
        return true;
    }

    public int getRootViewId() {
        return 0;
    }

    public int getStatusBarBgColor() {
        return -16777216;
    }

    public int getWindowsFlags() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void requestDisableOptimizeViewHierarchy() {
        this.mDisableOptimizeViewHierarchy = true;
    }

    /* access modifiers changed from: protected */
    public boolean useImmerseMode() {
        return true;
    }

    public WindowTintManager getTintManager() {
        return this.mTintManager;
    }

    public boolean isActive() {
        return this.mStatusActive;
    }

    public boolean isDestroyed2() {
        return this.mStatusDestroyed;
    }

    public boolean isViewValid() {
        if (!this.mStatusDestroyed) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int getStatusBarColor() {
        return getResources().getColor(C0906R.color.ej);
    }

    public void onStart() {
        super.onStart();
        if (mStartNum == 0) {
            AppHooks.AppBackgroundHook appBackgroundHook = AppHooks.getAppBackgroundHook();
            if (appBackgroundHook != null) {
                appBackgroundHook.onAppBackgoundSwitch(false);
            }
        }
        mStartNum++;
    }

    /* access modifiers changed from: protected */
    public void setStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getStatusBarColor());
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            StatusBarUtils.setColor(this, getStatusBarColor());
        }
    }

    public void onDestroy() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.mExitAppReceiver);
        super.onDestroy();
        this.mStatusDestroyed = true;
        if (!this.mMonitors.isEmpty()) {
            Iterator it2 = this.mMonitors.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onDestroy();
                }
            }
            this.mMonitors.clear();
        }
        onActivityDestroy(this);
        Logger.debug();
    }

    public void onPause() {
        super.onPause();
        this.mStatusActive = false;
        AppHooks.ActivityLifeCycleHook activityHook = AppHooks.getActivityHook();
        if (activityHook != null) {
            activityHook.onActivityPaused(this);
        }
        if (!this.mMonitors.isEmpty()) {
            Iterator it2 = this.mMonitors.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onPause();
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.mStatusActive = true;
        AppHooks.ActivityLifeCycleHook activityHook = AppHooks.getActivityHook();
        if (activityHook != null) {
            activityHook.onActivityResumed(this);
        }
        if (!this.mMonitors.isEmpty()) {
            Iterator it2 = this.mMonitors.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onResume();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        int i = mStartNum - 1;
        mStartNum = i;
        if (i == 0) {
            AppHooks.AppBackgroundHook appBackgroundHook = AppHooks.getAppBackgroundHook();
            if (appBackgroundHook != null) {
                appBackgroundHook.onAppBackgoundSwitch(true);
            }
        }
        this.mStatusActive = false;
        if (!this.mMonitors.isEmpty()) {
            Iterator it2 = this.mMonitors.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onStop();
                }
            }
        }
    }

    public static String getAliveActivitiesString() {
        if (sActivitySet == null || sActivitySet.isEmpty()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String next : sActivitySet) {
                if (i < sActivitySet.size() - 1) {
                    sb.append(next);
                    sb.append("|");
                } else {
                    sb.append(next);
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getFinishedActivitiesString() {
        if (sFinishedActivityContainer == null || sFinishedActivityContainer.isEmpty()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            Iterator it2 = sFinishedActivityContainer.iterator();
            while (it2.hasNext()) {
                AbsActivity absActivity = (AbsActivity) it2.next();
                if (absActivity != null && !sActivitySet.contains(absActivity.mKey) && absActivity.isFinishing()) {
                    if (i < sFinishedActivityContainer.size() - 1) {
                        sb.append(absActivity.mKey);
                        sb.append("|");
                    } else {
                        sb.append(absActivity.mKey);
                    }
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void onSupportContentChanged() {
        super.onSupportContentChanged();
        if (!this.mDisableOptimizeViewHierarchy) {
            View findViewById = findViewById(C0906R.id.a5);
            if (findViewById != null) {
                ViewParent parent = findViewById.getParent();
                if (FrameLayout.class.isInstance(parent)) {
                    View findViewById2 = findViewById(16908290);
                    if (FrameLayout.class.isInstance(findViewById2)) {
                        FrameLayout frameLayout = (FrameLayout) findViewById2;
                        if (frameLayout.getChildCount() == 1) {
                            View childAt = frameLayout.getChildAt(0);
                            frameLayout.removeAllViews();
                            FrameLayout frameLayout2 = (FrameLayout) parent;
                            frameLayout2.addView(childAt);
                            findViewById2.setId(-1);
                            frameLayout2.setId(16908290);
                        }
                    }
                }
            }
        }
    }

    public void registerLifeCycleMonitor(LifeCycleMonitor lifeCycleMonitor) {
        this.mMonitors.add(lifeCycleMonitor);
    }

    public void setStatusBarBgColor(int i) {
        this.mTintManager.setStatusBarTintColor(i);
    }

    public void unregisterLifeCycleMonitor(LifeCycleMonitor lifeCycleMonitor) {
        this.mMonitors.remove(lifeCycleMonitor);
    }

    public static void onActivityCreate(AbsActivity absActivity) {
        if (absActivity != null) {
            try {
                sFinishedActivityContainer.add(absActivity);
                sActivitySet.add(absActivity.mKey);
            } catch (Throwable unused) {
            }
        }
    }

    public static void onActivityDestroy(AbsActivity absActivity) {
        if (absActivity != null) {
            try {
                sActivitySet.remove(absActivity.mKey);
            } catch (Throwable unused) {
            }
        }
    }

    public void setContentView(int i) {
        super.setContentView(i);
        if (useImmerseMode()) {
            setStatusBarColor();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
            this.mKey = bundle.getString("abs_Activity_Key");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putString("abs_Activity_Key", this.mKey);
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
    }

    public void setContentView(View view) {
        super.setContentView(view);
        if (useImmerseMode()) {
            setStatusBarColor();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || !bundle.containsKey("abs_Activity_Key")) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getCanonicalName());
            sb.append("@");
            int i = sActivityId;
            sActivityId = i + 1;
            sb.append(i);
            this.mKey = sb.toString();
        } else {
            this.mKey = bundle.getString("abs_Activity_Key");
        }
        AppHooks.InitHook initHook = AppHooks.getInitHook();
        if (initHook != null && enableInitHook()) {
            initHook.tryInit(this);
        }
        this.mExitAppReceiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (!AbsActivity.this.isFinishing()) {
                    AbsActivity.this.finish();
                }
            }
        };
        LocalBroadcastManager.getInstance(this).registerReceiver(this.mExitAppReceiver, new IntentFilter("com.ss.android.common.app.action.exit_app"));
        onActivityCreate(this);
    }

    @TargetApi(21)
    public void initImmersion(View view, boolean z) {
        if (view == null && getRootViewId() > 0) {
            view = findViewById(getRootViewId());
        }
        if (view == null || getRootViewId() < 0) {
            if (getRootViewId() == -1 && Build.VERSION.SDK_INT > 19) {
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(getStatusBarBgColor());
            }
            return;
        }
        immersionWindow(view, z);
    }

    @TargetApi(19)
    public void immersionWindow(View view, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 19) {
            Window window = getWindow();
            window.clearFlags(67108864);
            int windowsFlags = getWindowsFlags();
            int statusBarBgColor = getStatusBarBgColor();
            if (Build.VERSION.SDK_INT >= 21) {
                View decorView = window.getDecorView();
                if (z) {
                    i = 0;
                } else {
                    i = 8192;
                }
                decorView.setSystemUiVisibility(i | 1280);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(getResources().getColor(17170445));
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
                window.addFlags(67108864);
            }
            this.mTintManager = new WindowTintManager(this, view, windowsFlags);
            this.mTintManager.setTintColor(statusBarBgColor);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setNavigationBarTintEnabled(false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AppHooks.ActivityResultHook activityResultHook = AppHooks.getActivityResultHook();
        if (activityResultHook == null || !activityResultHook.onActivityResult(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
