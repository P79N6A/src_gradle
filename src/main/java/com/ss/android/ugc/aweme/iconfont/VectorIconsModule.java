package com.ss.android.ugc.aweme.iconfont;

import android.graphics.Typeface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;

public class VectorIconsModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, Typeface> sTypefaceCache = new HashMap();

    public String getName() {
        return "RNVectorIconsModule";
    }

    VectorIconsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x01bd A[SYNTHETIC, Splitter:B:31:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01cf A[SYNTHETIC, Splitter:B:39:0x01cf] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01d6 A[SYNTHETIC, Splitter:B:45:0x01d6] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x01b0=Splitter:B:28:0x01b0, B:36:0x01c2=Splitter:B:36:0x01c2} */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getImageForFont(java.lang.String r26, java.lang.String r27, java.lang.Integer r28, java.lang.Integer r29, com.facebook.react.bridge.Callback r30) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            r3 = r29
            r4 = r30
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r13 = 0
            r6[r13] = r0
            r14 = 1
            r6[r14] = r1
            r15 = 2
            r6[r15] = r28
            r16 = 3
            r6[r16] = r3
            r17 = 4
            r6[r17] = r4
            com.meituan.robust.ChangeQuickRedirect r8 = changeQuickRedirect
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r13] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r14] = r7
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            r11[r15] = r7
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            r11[r16] = r7
            java.lang.Class<com.facebook.react.bridge.Callback> r7 = com.facebook.react.bridge.Callback.class
            r11[r17] = r7
            java.lang.Class r12 = java.lang.Void.TYPE
            r9 = 0
            r10 = 49953(0xc321, float:6.9999E-41)
            r7 = r25
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0077
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r13] = r0
            r6[r14] = r1
            r6[r15] = r28
            r6[r16] = r3
            r6[r17] = r4
            com.meituan.robust.ChangeQuickRedirect r20 = changeQuickRedirect
            r21 = 0
            r22 = 49953(0xc321, float:6.9999E-41)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r0[r15] = r1
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r0[r16] = r1
            java.lang.Class<com.facebook.react.bridge.Callback> r1 = com.facebook.react.bridge.Callback.class
            r0[r17] = r1
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r6
            r19 = r25
            r23 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x0077:
            com.facebook.react.bridge.ReactApplicationContext r5 = r25.getReactApplicationContext()
            java.io.File r6 = r5.getCacheDir()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = r6.getAbsolutePath()
            r7.append(r6)
            java.lang.String r6 = "/"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "@"
            r8.<init>(r9)
            int r9 = (int) r7
            float r10 = (float) r9
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x00b0
            java.lang.String r9 = java.lang.Integer.toString(r9)
            goto L_0x00b4
        L_0x00b0:
            java.lang.String r9 = java.lang.Float.toString(r7)
        L_0x00b4:
            r8.append(r9)
            java.lang.String r9 = "x"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r9 = r28.intValue()
            float r9 = (float) r9
            float r9 = r9 * r7
            int r7 = java.lang.Math.round(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ":"
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = ":"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            int r9 = r9.hashCode()
            r10 = 32
            java.lang.String r9 = java.lang.Integer.toString(r9, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = "_"
            r10.append(r6)
            int r2 = r28.intValue()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = ".png"
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "file://"
            r6.<init>(r8)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.io.File r8 = new java.io.File
            r8.<init>(r2)
            boolean r2 = r8.exists()
            r9 = 0
            if (r2 == 0) goto L_0x013c
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r9
            r0[r14] = r6
            r4.invoke(r0)
            return
        L_0x013c:
            com.facebook.react.views.text.ReactFontManager r2 = com.facebook.react.views.text.ReactFontManager.getInstance()
            android.content.res.AssetManager r5 = r5.getAssets()
            android.graphics.Typeface r0 = r2.getTypeface(r0, r13, r5)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r2.setTypeface(r0)
            int r0 = r29.intValue()
            r2.setColor(r0)
            float r0 = (float) r7
            r2.setTextSize(r0)
            r2.setAntiAlias(r14)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r3 = r27.length()
            r2.getTextBounds(r1, r13, r3, r0)
            int r3 = r0.width()
            int r5 = r0.height()
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r5, r7)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            int r7 = r0.left
            int r7 = -r7
            float r7 = (float) r7
            int r0 = r0.top
            int r0 = -r0
            float r0 = (float) r0
            r5.drawText(r1, r7, r0, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x01c1, IOException -> 0x01af }
            r1.<init>(r8)     // Catch:{ FileNotFoundException -> 0x01c1, IOException -> 0x01af }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x01aa, IOException -> 0x01a7, all -> 0x01a4 }
            r2 = 100
            r3.compress(r0, r2, r1)     // Catch:{ FileNotFoundException -> 0x01aa, IOException -> 0x01a7, all -> 0x01a4 }
            r1.flush()     // Catch:{ FileNotFoundException -> 0x01aa, IOException -> 0x01a7, all -> 0x01a4 }
            r1.close()     // Catch:{ FileNotFoundException -> 0x01aa, IOException -> 0x01a7, all -> 0x01a4 }
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ FileNotFoundException -> 0x01c1, IOException -> 0x01af }
            r0[r13] = r9     // Catch:{ FileNotFoundException -> 0x01c1, IOException -> 0x01af }
            r0[r14] = r6     // Catch:{ FileNotFoundException -> 0x01c1, IOException -> 0x01af }
            r4.invoke(r0)     // Catch:{ FileNotFoundException -> 0x01c1, IOException -> 0x01af }
            return
        L_0x01a4:
            r0 = move-exception
            r9 = r1
            goto L_0x01d4
        L_0x01a7:
            r0 = move-exception
            r9 = r1
            goto L_0x01b0
        L_0x01aa:
            r0 = move-exception
            r9 = r1
            goto L_0x01c2
        L_0x01ad:
            r0 = move-exception
            goto L_0x01d4
        L_0x01af:
            r0 = move-exception
        L_0x01b0:
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01ad }
            r1[r13] = r0     // Catch:{ all -> 0x01ad }
            r4.invoke(r1)     // Catch:{ all -> 0x01ad }
            if (r9 == 0) goto L_0x01d3
            r9.close()     // Catch:{ IOException -> 0x01c0 }
        L_0x01c0:
            return
        L_0x01c1:
            r0 = move-exception
        L_0x01c2:
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01ad }
            r1[r13] = r0     // Catch:{ all -> 0x01ad }
            r4.invoke(r1)     // Catch:{ all -> 0x01ad }
            if (r9 == 0) goto L_0x01d3
            r9.close()     // Catch:{ IOException -> 0x01d2 }
        L_0x01d2:
            return
        L_0x01d3:
            return
        L_0x01d4:
            if (r9 == 0) goto L_0x01d9
            r9.close()     // Catch:{ IOException -> 0x01d9 }
        L_0x01d9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.iconfont.VectorIconsModule.getImageForFont(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.facebook.react.bridge.Callback):void");
    }
}
