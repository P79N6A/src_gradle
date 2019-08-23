package com.ss.android.ugc.aweme.fastimage;

import android.app.Activity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FastImageViewModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getName() {
        return "FastImageView";
    }

    FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        final ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, this, changeQuickRedirect, false, 39342, new Class[]{ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableArray2}, this, changeQuickRedirect, false, 39342, new Class[]{ReadableArray.class}, Void.TYPE);
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44162a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f44162a, false, 39343, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f44162a, false, 39343, new Class[0], Void.TYPE);
                        return;
                    }
                    for (int i = 0; i < readableArray2.size(); i++) {
                        Fresco.getImagePipeline().prefetchToBitmapCache(ImageRequest.fromUri(readableArray2.getMap(i).getString("uri")), currentActivity.getApplicationContext());
                    }
                }
            });
        }
    }
}
