package com.ss.android.ugc.aweme.viewshot;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class RNViewShotModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ReactApplicationContext reactContext;

    static class a extends GuardedAsyncTask<Void, Void> implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76531a;

        /* renamed from: b  reason: collision with root package name */
        private final File f76532b;

        /* renamed from: c  reason: collision with root package name */
        private final File f76533c;

        private a(ReactContext reactContext) {
            super(reactContext);
            this.f76532b = reactContext.getCacheDir();
            this.f76533c = reactContext.getExternalCacheDir();
        }

        private void a(@NonNull File file) {
            File file2 = file;
            if (PatchProxy.isSupport(new Object[]{file2}, this, f76531a, false, 89761, new Class[]{File.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{file2}, this, f76531a, false, 89761, new Class[]{File.class}, Void.TYPE);
                return;
            }
            File[] listFiles = file2.listFiles(this);
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        public final /* synthetic */ void doInBackgroundGuarded(Object[] objArr) {
            Object obj = (Void[]) objArr;
            if (PatchProxy.isSupport(new Object[]{obj}, this, f76531a, false, 89759, new Class[]{Void[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj}, this, f76531a, false, 89759, new Class[]{Void[].class}, Void.TYPE);
                return;
            }
            if (this.f76532b != null) {
                a(this.f76532b);
            }
            if (this.f76533c != null) {
                a(this.f76533c);
            }
        }

        /* synthetic */ a(ReactContext reactContext, byte b2) {
            this(reactContext);
        }

        public final boolean accept(File file, String str) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{file, str2}, this, f76531a, false, 89760, new Class[]{File.class, String.class}, Boolean.TYPE)) {
                return str2.startsWith("ReactNative-snapshot-image");
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{file, str2}, this, f76531a, false, 89760, new Class[]{File.class, String.class}, Boolean.TYPE)).booleanValue();
        }
    }

    public String getName() {
        return "RNViewShot";
    }

    public Map<String, Object> getConstants() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89753, new Class[0], Map.class)) {
            return Collections.emptyMap();
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89753, new Class[0], Map.class);
    }

    public void onCatalystInstanceDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89754, new Class[0], Void.TYPE);
            return;
        }
        super.onCatalystInstanceDestroy();
        new a(getReactApplicationContext(), (byte) 0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void releaseCapture(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 89755, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 89755, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String path = Uri.parse(str).getPath();
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                    file.delete();
                }
            }
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        ReadableMap readableMap2 = readableMap;
        Promise promise2 = promise;
        if (PatchProxy.isSupport(new Object[]{readableMap2, promise2}, this, changeQuickRedirect, false, 89757, new Class[]{ReadableMap.class, Promise.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableMap2, promise2}, this, changeQuickRedirect, false, 89757, new Class[]{ReadableMap.class, Promise.class}, Void.TYPE);
            return;
        }
        captureRef(-1, readableMap2, promise2);
    }

    @NonNull
    private File createTempFile(@NonNull Context context, @NonNull String str) throws IOException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, changeQuickRedirect, false, 89758, new Class[]{Context.class, String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context, str2}, this, changeQuickRedirect, false, 89758, new Class[]{Context.class, String.class}, File.class);
        }
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir != null && (cacheDir == null || externalCacheDir.getFreeSpace() > cacheDir.getFreeSpace())) {
            cacheDir = externalCacheDir;
        }
        return File.createTempFile("ReactNative-snapshot-image", ClassUtils.PACKAGE_SEPARATOR + str2, cacheDir);
    }

    @ReactMethod
    public void captureRef(int i, ReadableMap readableMap, Promise promise) {
        Integer num;
        Integer num2;
        Promise promise2;
        ReadableMap readableMap2 = readableMap;
        Promise promise3 = promise;
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), readableMap2, promise3}, this, changeQuickRedirect, false, 89756, new Class[]{Integer.TYPE, ReadableMap.class, Promise.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), readableMap2, promise3}, this, changeQuickRedirect, false, 89756, new Class[]{Integer.TYPE, ReadableMap.class, Promise.class}, Void.TYPE);
            return;
        }
        DisplayMetrics displayMetrics = getReactApplicationContext().getResources().getDisplayMetrics();
        String string = readableMap2.getString("format");
        if ("jpg".equals(string)) {
            i2 = 0;
        } else if ("webm".equals(string)) {
            i2 = 2;
        } else if ("raw".equals(string)) {
            i2 = -1;
        }
        double d2 = readableMap2.getDouble("quality");
        File file = null;
        if (readableMap2.hasKey("width")) {
            double d3 = (double) displayMetrics.density;
            double d4 = readableMap2.getDouble("width");
            Double.isNaN(d3);
            num = Integer.valueOf((int) (d3 * d4));
        } else {
            num = null;
        }
        if (readableMap2.hasKey("height")) {
            double d5 = (double) displayMetrics.density;
            double d6 = readableMap2.getDouble("height");
            Double.isNaN(d5);
            num2 = Integer.valueOf((int) (d5 * d6));
        } else {
            num2 = null;
        }
        String string2 = readableMap2.getString("result");
        Boolean valueOf = Boolean.valueOf(readableMap2.getBoolean("snapshotContentContainer"));
        try {
            if ("tmpfile".equals(string2)) {
                file = createTempFile(getReactApplicationContext(), string);
            }
            File file2 = file;
            Activity currentActivity = getCurrentActivity();
            UIManagerModule uIManagerModule = (UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class);
            r8 = r8;
            String str = string;
            promise2 = promise3;
            try {
                ViewShot viewShot = new ViewShot(i, str, i2, d2, num, num2, file2, string2, valueOf, this.reactContext, currentActivity, promise);
                uIManagerModule.addUIBlock(viewShot);
            } catch (Throwable unused) {
                promise2.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + i);
            }
        } catch (Throwable unused2) {
            promise2 = promise3;
            promise2.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + i);
        }
    }
}
