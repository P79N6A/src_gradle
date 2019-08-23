package com.ss.android.ugc.webpcompat;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.facebook.imagepipeline.nativecode.d;
import com.taobao.android.dexposed.DexposedBridge;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.Method;

public class WebpCompatManager {
    protected static Method decodeByteArrayMethod;
    protected static Method decodeFileDescriptorMethod;
    protected static Method decodeFileMethod;
    protected static Method decodeStreamMethod;
    private static WebpCompatManager instance = new WebpCompatManager();
    private boolean mInited;
    public IWebpErrorCallback mWebpErrorCallback;

    public static WebpCompatManager getInstance() {
        return instance;
    }

    private boolean loadDexposedLibrary() {
        try {
            System.loadLibrary("dexposed");
            return true;
        } catch (Throwable th) {
            if (this.mWebpErrorCallback != null) {
                this.mWebpErrorCallback.onWebpError(1, th.toString());
            }
            return false;
        }
    }

    private boolean loadWebpSupportLibrary() {
        try {
            d.ensure();
            return true;
        } catch (Exception e2) {
            if (this.mWebpErrorCallback != null) {
                this.mWebpErrorCallback.onWebpError(5, e2.toString());
            }
            return false;
        }
    }

    public WebpCompatManager() {
        Class<BitmapFactory> cls = BitmapFactory.class;
        try {
            decodeByteArrayMethod = cls.getDeclaredMethod("decodeByteArray", new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, BitmapFactory.Options.class});
            decodeFileDescriptorMethod = cls.getDeclaredMethod("decodeFileDescriptor", new Class[]{FileDescriptor.class, Rect.class, BitmapFactory.Options.class});
            decodeStreamMethod = cls.getDeclaredMethod("decodeStream", new Class[]{InputStream.class, Rect.class, BitmapFactory.Options.class});
            decodeFileMethod = cls.getDeclaredMethod("decodeFile", new Class[]{String.class, BitmapFactory.Options.class});
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0093, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void init(com.ss.android.ugc.webpcompat.IWebpErrorCallback r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mInited     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0092
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0094 }
            r1 = 17
            if (r0 > r1) goto L_0x0092
            boolean r0 = r8.loadDexposedLibrary()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0092
            boolean r0 = r8.loadWebpSupportLibrary()     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0018
            goto L_0x0092
        L_0x0018:
            r8.mWebpErrorCallback = r9     // Catch:{ all -> 0x0094 }
            com.facebook.webpsupport.WebpBitmapFactoryImpl r9 = new com.facebook.webpsupport.WebpBitmapFactoryImpl     // Catch:{ all -> 0x0094 }
            r9.<init>()     // Catch:{ all -> 0x0094 }
            com.ss.android.ugc.webpcompat.WebpCompatManager$1 r0 = new com.ss.android.ugc.webpcompat.WebpCompatManager$1     // Catch:{ all -> 0x0094 }
            r0.<init>()     // Catch:{ all -> 0x0094 }
            r9.setBitmapCreator(r0)     // Catch:{ all -> 0x0094 }
            com.ss.android.ugc.webpcompat.WebpCompatManager$2 r0 = new com.ss.android.ugc.webpcompat.WebpCompatManager$2     // Catch:{ all -> 0x0094 }
            r0.<init>()     // Catch:{ all -> 0x0094 }
            r9.setWebpErrorLogger(r0)     // Catch:{ all -> 0x0094 }
            com.ss.android.ugc.webpcompat.WebpCompatManager$3 r0 = new com.ss.android.ugc.webpcompat.WebpCompatManager$3     // Catch:{ all -> 0x0094 }
            r0.<init>(r9)     // Catch:{ all -> 0x0094 }
            java.lang.String r9 = "decodeStream"
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0094 }
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0094 }
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            r5 = 1
            r2[r5] = r3     // Catch:{ all -> 0x0094 }
            java.lang.Class<android.graphics.BitmapFactory$Options> r3 = android.graphics.BitmapFactory.Options.class
            r6 = 2
            r2[r6] = r3     // Catch:{ all -> 0x0094 }
            r3 = 3
            r2[r3] = r0     // Catch:{ all -> 0x0094 }
            r8.replaceBitmapFactory(r9, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r9 = "decodeFile"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0094 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2[r4] = r7     // Catch:{ all -> 0x0094 }
            java.lang.Class<android.graphics.BitmapFactory$Options> r7 = android.graphics.BitmapFactory.Options.class
            r2[r5] = r7     // Catch:{ all -> 0x0094 }
            r2[r6] = r0     // Catch:{ all -> 0x0094 }
            r8.replaceBitmapFactory(r9, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r9 = "decodeByteArray"
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0094 }
            java.lang.Class<byte[]> r7 = byte[].class
            r2[r4] = r7     // Catch:{ all -> 0x0094 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0094 }
            r2[r5] = r7     // Catch:{ all -> 0x0094 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0094 }
            r2[r6] = r7     // Catch:{ all -> 0x0094 }
            java.lang.Class<android.graphics.BitmapFactory$Options> r7 = android.graphics.BitmapFactory.Options.class
            r2[r3] = r7     // Catch:{ all -> 0x0094 }
            r2[r1] = r0     // Catch:{ all -> 0x0094 }
            r8.replaceBitmapFactory(r9, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r9 = "decodeFileDescriptor"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0094 }
            java.lang.Class<java.io.FileDescriptor> r2 = java.io.FileDescriptor.class
            r1[r4] = r2     // Catch:{ all -> 0x0094 }
            java.lang.Class<android.graphics.Rect> r2 = android.graphics.Rect.class
            r1[r5] = r2     // Catch:{ all -> 0x0094 }
            java.lang.Class<android.graphics.BitmapFactory$Options> r2 = android.graphics.BitmapFactory.Options.class
            r1[r6] = r2     // Catch:{ all -> 0x0094 }
            r1[r3] = r0     // Catch:{ all -> 0x0094 }
            r8.replaceBitmapFactory(r9, r1)     // Catch:{ all -> 0x0094 }
            r8.mInited = r5     // Catch:{ all -> 0x0094 }
            monitor-exit(r8)
            return
        L_0x0092:
            monitor-exit(r8)
            return
        L_0x0094:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.webpcompat.WebpCompatManager.init(com.ss.android.ugc.webpcompat.IWebpErrorCallback):void");
    }

    private void replaceBitmapFactory(String str, Object... objArr) {
        try {
            DexposedBridge.findAndHookMethod(BitmapFactory.class, str, objArr);
        } catch (Exception e2) {
            if (this.mWebpErrorCallback != null) {
                this.mWebpErrorCallback.onWebpError(2, e2.toString());
            }
        }
    }
}
