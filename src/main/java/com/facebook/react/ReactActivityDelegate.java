package com.facebook.react;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionListener;
import javax.annotation.Nullable;

public class ReactActivityDelegate {
    @Nullable
    private final Activity mActivity;
    @Nullable
    private DoubleTapReloadRecognizer mDoubleTapReloadRecognizer;
    @Nullable
    private final FragmentActivity mFragmentActivity;
    @Nullable
    private final String mMainComponentName;
    @Nullable
    public PermissionListener mPermissionListener;
    @Nullable
    private Callback mPermissionsCallback;
    @Nullable
    private ReactRootView mReactRootView;

    /* access modifiers changed from: protected */
    @Nullable
    public Bundle getLaunchOptions() {
        return null;
    }

    private Activity getPlainActivity() {
        return (Activity) getContext();
    }

    private Context getContext() {
        if (this.mActivity != null) {
            return this.mActivity;
        }
        return (Context) a.b(this.mFragmentActivity);
    }

    /* access modifiers changed from: protected */
    public ReactRootView createRootView() {
        return new ReactRootView(getContext());
    }

    public ReactInstanceManager getReactInstanceManager() {
        return getReactNativeHost().getReactInstanceManager();
    }

    /* access modifiers changed from: protected */
    public ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactNativeHost();
    }

    public boolean onBackPressed() {
        if (!getReactNativeHost().hasInstance()) {
            return false;
        }
        getReactNativeHost().getReactInstanceManager().onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostPause(getPlainActivity());
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.mReactRootView != null) {
            this.mReactRootView.unmountReactApplication();
            this.mReactRootView = null;
        }
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostDestroy(getPlainActivity());
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostResume(getPlainActivity(), (DefaultHardwareBackBtnHandler) getPlainActivity());
        }
        if (this.mPermissionsCallback != null) {
            this.mPermissionsCallback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (this.mMainComponentName != null) {
            loadApp(this.mMainComponentName);
        }
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
    }

    public boolean onNewIntent(Intent intent) {
        if (!getReactNativeHost().hasInstance()) {
            return false;
        }
        getReactNativeHost().getReactInstanceManager().onNewIntent(intent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void loadApp(String str) {
        if (this.mReactRootView == null) {
            this.mReactRootView = createRootView();
            this.mReactRootView.startReactApplication(getReactNativeHost().getReactInstanceManager(), str, getLaunchOptions());
            getPlainActivity().setContentView(this.mReactRootView);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }

    public ReactActivityDelegate(Activity activity, @Nullable String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    public ReactActivityDelegate(FragmentActivity fragmentActivity, @Nullable String str) {
        this.mFragmentActivity = fragmentActivity;
        this.mMainComponentName = str;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!getReactNativeHost().hasInstance() || !getReactNativeHost().getUseDeveloperSupport() || i != 90) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (!getReactNativeHost().hasInstance() || !getReactNativeHost().getUseDeveloperSupport() || i != 90) {
            return false;
        }
        getReactNativeHost().getReactInstanceManager().showDevOptionsDialog();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport()) {
            if (i == 82) {
                getReactNativeHost().getReactInstanceManager().showDevOptionsDialog();
                return true;
            } else if (((DoubleTapReloadRecognizer) a.b(this.mDoubleTapReloadRecognizer)).didDoubleTapR(i, getPlainActivity().getCurrentFocus())) {
                getReactNativeHost().getReactInstanceManager().getDevSupportManager().handleReloadJS();
                return true;
            }
        }
        return false;
    }

    public void onRequestPermissionsResult(final int i, final String[] strArr, final int[] iArr) {
        this.mPermissionsCallback = new Callback() {
            public void invoke(Object... objArr) {
                if (ReactActivityDelegate.this.mPermissionListener != null && ReactActivityDelegate.this.mPermissionListener.onRequestPermissionsResult(i, strArr, iArr)) {
                    ReactActivityDelegate.this.mPermissionListener = null;
                }
            }
        };
    }

    @TargetApi(23)
    public void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        getPlainActivity().requestPermissions(strArr, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onActivityResult(getPlainActivity(), i, i2, intent);
        }
    }
}
