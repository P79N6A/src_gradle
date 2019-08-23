package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IntentAndroid")
public class IntentModule extends ReactContextBaseJavaModule {
    public String getName() {
        return "IntentAndroid";
    }

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getInitialURL(Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            String str = null;
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                String action = intent.getAction();
                Uri data = intent.getData();
                if ("android.intent.action.VIEW".equals(action) && data != null) {
                    str = data.toString();
                }
            }
            promise.resolve(str);
        } catch (Exception e2) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Could not get the initial URL : " + e2.getMessage()));
        }
    }

    @ReactMethod
    public void canOpenURL(String str, Promise promise) {
        boolean z;
        if (str == null || str.isEmpty()) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null) {
                z = true;
            } else {
                z = false;
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e2) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Could not check if URL '" + str + "' can be opened: " + e2.getMessage()));
        }
    }

    @ReactMethod
    public void openURL(String str, Promise promise) {
        String str2;
        if (str == null || str.isEmpty()) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            Activity currentActivity = getCurrentActivity();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            String packageName = getReactApplicationContext().getPackageName();
            ComponentName resolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
            if (resolveActivity != null) {
                str2 = resolveActivity.getPackageName();
            } else {
                str2 = "";
            }
            if (currentActivity == null || !packageName.equals(str2)) {
                intent.addFlags(268435456);
            }
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            } else {
                getReactApplicationContext().startActivity(intent);
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e2) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Could not open URL '" + str + "': " + e2.getMessage()));
        }
    }
}
