package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "DialogManagerAndroid")
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    static final Map<String, Object> CONSTANTS = MapBuilder.of("buttonClicked", "buttonClicked", "dismissed", "dismissed", "buttonPositive", -1, "buttonNegative", -2, "buttonNeutral", -3);
    static final String KEY_MESSAGE = "message";
    public boolean mIsInForeground;

    class AlertFragmentListener implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        private final Callback mCallback;
        private boolean mCallbackConsumed;

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.mCallbackConsumed && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.mCallback.invoke("dismissed");
                this.mCallbackConsumed = true;
            }
        }

        public AlertFragmentListener(Callback callback) {
            this.mCallback = callback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!this.mCallbackConsumed && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.mCallback.invoke("buttonClicked", Integer.valueOf(i));
                this.mCallbackConsumed = true;
            }
        }
    }

    class FragmentManagerHelper {
        @Nullable
        private final FragmentManager mFragmentManager;
        @Nullable
        private Object mFragmentToShow;
        @Nullable
        private final android.support.v4.app.FragmentManager mSupportFragmentManager;

        private boolean isUsingSupportLibrary() {
            if (this.mSupportFragmentManager != null) {
                return true;
            }
            return false;
        }

        private void dismissExisting() {
            if (isUsingSupportLibrary()) {
                SupportAlertFragment supportAlertFragment = (SupportAlertFragment) this.mSupportFragmentManager.findFragmentByTag("com.facebook.catalyst.react.dialog.DialogModule");
                if (supportAlertFragment != null) {
                    supportAlertFragment.dismissAllowingStateLoss();
                }
                return;
            }
            AlertFragment alertFragment = (AlertFragment) this.mFragmentManager.findFragmentByTag("com.facebook.catalyst.react.dialog.DialogModule");
            if (alertFragment != null) {
                alertFragment.dismissAllowingStateLoss();
            }
        }

        public void showPendingAlert() {
            UiThreadUtil.assertOnUiThread();
            if (this.mFragmentToShow != null) {
                if (isUsingSupportLibrary()) {
                    ((SupportAlertFragment) this.mFragmentToShow).show(this.mSupportFragmentManager, "com.facebook.catalyst.react.dialog.DialogModule");
                } else {
                    ((AlertFragment) this.mFragmentToShow).show(this.mFragmentManager, "com.facebook.catalyst.react.dialog.DialogModule");
                }
                this.mFragmentToShow = null;
            }
        }

        public FragmentManagerHelper(FragmentManager fragmentManager) {
            this.mFragmentManager = fragmentManager;
        }

        public FragmentManagerHelper(android.support.v4.app.FragmentManager fragmentManager) {
            this.mSupportFragmentManager = fragmentManager;
        }

        public void showNewAlert(boolean z, Bundle bundle, Callback callback) {
            AlertFragmentListener alertFragmentListener;
            UiThreadUtil.assertOnUiThread();
            dismissExisting();
            if (callback != null) {
                alertFragmentListener = new AlertFragmentListener(callback);
            } else {
                alertFragmentListener = null;
            }
            if (isUsingSupportLibrary()) {
                SupportAlertFragment supportAlertFragment = new SupportAlertFragment(alertFragmentListener, bundle);
                if (z) {
                    if (bundle.containsKey("cancelable")) {
                        supportAlertFragment.setCancelable(bundle.getBoolean("cancelable"));
                    }
                    supportAlertFragment.show(this.mSupportFragmentManager, "com.facebook.catalyst.react.dialog.DialogModule");
                } else {
                    this.mFragmentToShow = supportAlertFragment;
                }
            } else {
                AlertFragment alertFragment = new AlertFragment(alertFragmentListener, bundle);
                if (z) {
                    if (bundle.containsKey("cancelable")) {
                        alertFragment.setCancelable(bundle.getBoolean("cancelable"));
                    }
                    alertFragment.show(this.mFragmentManager, "com.facebook.catalyst.react.dialog.DialogModule");
                    return;
                }
                this.mFragmentToShow = alertFragment;
            }
        }
    }

    public String getName() {
        return "DialogManagerAndroid";
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsInForeground = false;
    }

    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    public void onHostResume() {
        this.mIsInForeground = true;
        FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.showPendingAlert();
        } else {
            FLog.w(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @Nullable
    private FragmentManagerHelper getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        if (currentActivity instanceof FragmentActivity) {
            return new FragmentManagerHelper(((FragmentActivity) currentActivity).getSupportFragmentManager());
        }
        return new FragmentManagerHelper(currentActivity.getFragmentManager());
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, final Callback callback2) {
        final FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        final Bundle bundle = new Bundle();
        if (readableMap.hasKey(PushConstants.TITLE)) {
            bundle.putString(PushConstants.TITLE, readableMap.getString(PushConstants.TITLE));
        }
        if (readableMap.hasKey("message")) {
            bundle.putString("message", readableMap.getString("message"));
        }
        if (readableMap.hasKey("buttonPositive")) {
            bundle.putString("button_positive", readableMap.getString("buttonPositive"));
        }
        if (readableMap.hasKey("buttonNegative")) {
            bundle.putString("button_negative", readableMap.getString("buttonNegative"));
        }
        if (readableMap.hasKey("buttonNeutral")) {
            bundle.putString("button_neutral", readableMap.getString("buttonNeutral"));
        }
        if (readableMap.hasKey("items")) {
            ReadableArray array = readableMap.getArray("items");
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray("items", charSequenceArr);
        }
        if (readableMap.hasKey("cancelable")) {
            bundle.putBoolean("cancelable", readableMap.getBoolean("cancelable"));
        }
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                fragmentManagerHelper.showNewAlert(DialogModule.this.mIsInForeground, bundle, callback2);
            }
        });
    }
}
