package com.mapbox.mapboxsdk.storage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.d;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileSource {

    /* renamed from: a  reason: collision with root package name */
    public static final Lock f26787a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public static final Lock f26788b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public static String f26789c;

    /* renamed from: d  reason: collision with root package name */
    public static String f26790d;

    /* renamed from: e  reason: collision with root package name */
    private static FileSource f26791e;
    @Keep
    private long nativePtr;

    @Keep
    public interface ResourceTransformCallback {
        String onURL(int i, String str);
    }

    public static class a extends AsyncTask<Context, Void, String[]> {
        private a() {
        }

        /* access modifiers changed from: protected */
        public final void onCancelled() {
            FileSource.a();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String[] strArr = (String[]) obj;
            FileSource.f26789c = strArr[0];
            FileSource.f26790d = strArr[1];
            FileSource.a();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            Context[] contextArr = (Context[]) objArr;
            return new String[]{FileSource.b(contextArr[0]), contextArr[0].getCacheDir().getAbsolutePath()};
        }
    }

    @Keep
    private native void initialize(String str, String str2, AssetManager assetManager);

    @Keep
    public native void activate();

    @Keep
    public native void deactivate();

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    @Keep
    public native String getAccessToken();

    @Keep
    public native boolean isActivated();

    @Keep
    public native void setAccessToken(@NonNull String str);

    @Keep
    public native void setApiBaseUrl(String str);

    @Keep
    public native void setResourceTransform(ResourceTransformCallback resourceTransformCallback);

    public static void a() {
        f26787a.unlock();
        f26788b.unlock();
    }

    private static String d(Context context) {
        f26787a.lock();
        try {
            if (f26789c == null) {
                f26789c = b(context);
            }
            return f26789c;
        } finally {
            f26787a.unlock();
        }
    }

    @UiThread
    public static synchronized FileSource a(Context context) {
        FileSource fileSource;
        synchronized (FileSource.class) {
            if (f26791e == null) {
                f26791e = new FileSource(d(context), context.getResources().getAssets());
            }
            fileSource = f26791e;
        }
        return fileSource;
    }

    public static String c(Context context) {
        f26788b.lock();
        try {
            if (f26790d == null) {
                f26790d = context.getCacheDir().getAbsolutePath();
            }
            return f26790d;
        } finally {
            f26788b.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0028, Exception -> 0x001c }
            java.lang.String r2 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0028, Exception -> 0x001c }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0028, Exception -> 0x001c }
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0028, Exception -> 0x001c }
            if (r2 == 0) goto L_0x0033
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0028, Exception -> 0x001c }
            java.lang.String r2 = "com.mapbox.SetStorageExternal"
            boolean r1 = r1.getBoolean(r2, r0)     // Catch:{ NameNotFoundException -> 0x0028, Exception -> 0x001c }
            goto L_0x0034
        L_0x001c:
            r1 = move-exception
            java.lang.String r2 = "Mbgl-FileSource"
            java.lang.String r3 = "Failed to read the storage key: "
            com.mapbox.mapboxsdk.log.Logger.e(r2, r3, r1)
            com.mapbox.mapboxsdk.b.a((java.lang.Exception) r1)
            goto L_0x0033
        L_0x0028:
            r1 = move-exception
            java.lang.String r2 = "Mbgl-FileSource"
            java.lang.String r3 = "Failed to read the package metadata: "
            com.mapbox.mapboxsdk.log.Logger.e(r2, r3, r1)
            com.mapbox.mapboxsdk.b.a((java.lang.Exception) r1)
        L_0x0033:
            r1 = 0
        L_0x0034:
            r2 = 0
            if (r1 == 0) goto L_0x006b
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r3 = "mounted"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = "mounted_ro"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            goto L_0x0054
        L_0x004c:
            java.lang.String r1 = "Mbgl-FileSource"
            java.lang.String r3 = "External storage was requested but it isn't readable. For API level < 18 make sure you've requested READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE permissions in your app Manifest (defaulting to internal storage)."
            com.mapbox.mapboxsdk.log.Logger.w(r1, r3)
            goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            if (r0 == 0) goto L_0x006b
            java.io.File r0 = r4.getExternalFilesDir(r2)     // Catch:{ NullPointerException -> 0x0060 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ NullPointerException -> 0x0060 }
            goto L_0x006c
        L_0x0060:
            r0 = move-exception
            java.lang.String r1 = "Mbgl-FileSource"
            java.lang.String r3 = "Failed to obtain the external storage path: "
            com.mapbox.mapboxsdk.log.Logger.e(r1, r3, r0)
            com.mapbox.mapboxsdk.b.a((java.lang.Exception) r0)
        L_0x006b:
            r0 = r2
        L_0x006c:
            if (r0 != 0) goto L_0x0076
            java.io.File r4 = r4.getFilesDir()
            java.lang.String r0 = r4.getAbsolutePath()
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.storage.FileSource.b(android.content.Context):java.lang.String");
    }

    private FileSource(String str, AssetManager assetManager) {
        initialize(d.a(), str, assetManager);
    }
}
