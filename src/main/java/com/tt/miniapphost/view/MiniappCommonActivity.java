package com.tt.miniapphost.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.ICommonActivityProxy;
import com.tt.miniapphost.process.annotation.MiniAppProcess;

public abstract class MiniappCommonActivity extends FragmentActivity {
    protected ICommonActivityProxy mActivityProxy;

    /* access modifiers changed from: protected */
    @MiniAppProcess
    public abstract String getRealActivityClassName();

    @Nullable
    public ICommonActivityProxy getActivityProxy() {
        return this.mActivityProxy;
    }

    public View getSwipeBackLayout() {
        AppBrandLogger.d("MiniappCommonActivity", "onBackPressed");
        if (this.mActivityProxy != null) {
            return this.mActivityProxy.getSwipeBackLayout();
        }
        return null;
    }

    public void onBackPressed() {
        AppBrandLogger.d("MiniappCommonActivity", "onBackPressed");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AppBrandLogger.d("MiniappCommonActivity", "onDestroy");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onDestroy();
        }
    }

    public void onPause() {
        super.onPause();
        AppBrandLogger.d("MiniappCommonActivity", "onPause");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onPause();
        }
    }

    public void onResume() {
        super.onResume();
        AppBrandLogger.d("MiniappCommonActivity", "onResume");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onResume();
        }
    }

    public boolean swipeBackPriority() {
        if (this.mActivityProxy != null) {
            return this.mActivityProxy.swipeBackPriority();
        }
        if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @MiniAppProcess
    public void createRealActivity() throws Exception {
        this.mActivityProxy = (ICommonActivityProxy) Class.forName(getRealActivityClassName()).getDeclaredConstructor(new Class[]{FragmentActivity.class}).newInstance(new Object[]{this});
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onPostCreate(bundle);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onSaveInstanceState(bundle);
        }
    }

    public void setSwipeBackEnable(boolean z) {
        if (this.mActivityProxy != null) {
            this.mActivityProxy.setSwipeBackEnable(z);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AppBrandLogger.d("MiniappCommonActivity", "onNewIntent");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onNewIntent(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppBrandLogger.d("MiniappCommonActivity", "onCreate");
        try {
            createRealActivity();
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "MiniappCommonActivity", e2.getStackTrace());
            this.mActivityProxy = null;
        }
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onCreate(bundle);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onActivityResult(i, i2, intent);
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onRequestPermissionsResult(i, strArr, iArr);
        }
    }
}
