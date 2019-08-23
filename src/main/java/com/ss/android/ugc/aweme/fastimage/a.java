package com.ss.android.ugc.aweme.fastimage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.imagepipeline.common.Priority;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44166a;

    /* renamed from: b  reason: collision with root package name */
    static final Map<String, C0552a> f44167b = new HashMap<String, C0552a>() {
        {
            put("immutable", C0552a.IMMUTABLE);
            put("web", C0552a.WEB);
            put("cacheOnly", C0552a.CACHE_ONLY);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    static final Map<String, Priority> f44168c = new HashMap<String, Priority>() {
        {
            put("low", Priority.LOW);
            put("normal", Priority.MEDIUM);
            put("high", Priority.HIGH);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final Drawable f44169d = new ColorDrawable(0);

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, ImageView.ScaleType> f44170e = new HashMap<String, ImageView.ScaleType>() {
        {
            put("contain", ImageView.ScaleType.FIT_CENTER);
            put("cover", ImageView.ScaleType.CENTER_CROP);
            put("stretch", ImageView.ScaleType.FIT_XY);
            put("center", ImageView.ScaleType.CENTER);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.fastimage.a$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f44171a = new int[C0552a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.ss.android.ugc.aweme.fastimage.a$a[] r0 = com.ss.android.ugc.aweme.fastimage.a.C0552a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44171a = r0
                int[] r0 = f44171a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.fastimage.a$a r1 = com.ss.android.ugc.aweme.fastimage.a.C0552a.WEB     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44171a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.fastimage.a$a r1 = com.ss.android.ugc.aweme.fastimage.a.C0552a.CACHE_ONLY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44171a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.fastimage.a$a r1 = com.ss.android.ugc.aweme.fastimage.a.C0552a.IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fastimage.a.AnonymousClass4.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fastimage.a$a  reason: collision with other inner class name */
    public enum C0552a {
        IMMUTABLE,
        WEB,
        CACHE_ONLY;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T a(java.lang.String r23, java.lang.String r24, java.util.Map<java.lang.String, T> r25, com.facebook.react.bridge.ReadableMap r26) {
        /*
            r0 = r23
            r2 = r25
            r3 = r26
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r24
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f44166a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r12] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r13] = r6
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r10[r14] = r6
            java.lang.Class<com.facebook.react.bridge.ReadableMap> r6 = com.facebook.react.bridge.ReadableMap.class
            r10[r15] = r6
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r6 = 0
            r8 = 1
            r9 = 39332(0x99a4, float:5.5116E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0068
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r24
            r5[r14] = r2
            r5[r15] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f44166a
            r19 = 1
            r20 = 39332(0x99a4, float:5.5116E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r14] = r1
            java.lang.Class<com.facebook.react.bridge.ReadableMap> r1 = com.facebook.react.bridge.ReadableMap.class
            r0[r15] = r1
            java.lang.Class<java.lang.Object> r22 = java.lang.Object.class
            r16 = r5
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0068:
            r5 = 0
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = r3.getString(r0)     // Catch:{ NoSuchKeyException -> 0x0070 }
            goto L_0x0071
        L_0x0070:
            r3 = r5
        L_0x0071:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r24
            r5[r14] = r2
            r5[r15] = r3
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f44166a
            r8 = 1
            r9 = 39331(0x99a3, float:5.5114E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r12] = r11
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r13] = r11
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            r10[r14] = r11
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r15] = r11
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x00ce
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r24
            r5[r14] = r2
            r5[r15] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f44166a
            r19 = 1
            r20 = 39331(0x99a3, float:5.5114E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<java.lang.Object> r22 = java.lang.Object.class
            r16 = r5
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x00ce:
            if (r3 != 0) goto L_0x00d3
            r1 = r24
            goto L_0x00d4
        L_0x00d3:
            r1 = r3
        L_0x00d4:
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L_0x00db
            return r2
        L_0x00db:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "FastImage, invalid "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " : "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fastimage.a.a(java.lang.String, java.lang.String, java.util.Map, com.facebook.react.bridge.ReadableMap):java.lang.Object");
    }
}
