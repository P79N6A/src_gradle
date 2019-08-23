package com.dylanvann.fastimage1;

import android.app.Activity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public class FastImageViewModule extends ReactContextBaseJavaModule {
    public String getName() {
        return "FastImageView";
    }

    FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void preload(final ReadableArray readableArray) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() {
                public final void run() {
                    Object obj;
                    for (int i = 0; i < readableArray.size(); i++) {
                        ReadableMap map = readableArray.getMap(i);
                        e a2 = f.a(currentActivity, map);
                        RequestManager with = Glide.with(currentActivity.getApplicationContext());
                        if (a2.a()) {
                            obj = a2.getSource();
                        } else if (a2.isResource()) {
                            obj = a2.getUri();
                        } else {
                            obj = a2.b();
                        }
                        with.load(obj).apply(f.a(map)).preload();
                    }
                }
            });
        }
    }
}
