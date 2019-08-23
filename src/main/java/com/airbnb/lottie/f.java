package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.support.annotation.WorkerThread;
import android.util.JsonReader;
import com.airbnb.lottie.c.g;
import com.airbnb.lottie.d.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, k<LottieComposition>> f4825a = new HashMap();

    private static String a(@RawRes int i) {
        return "rawRes_" + i;
    }

    @WorkerThread
    public static j<LottieComposition> a(InputStream inputStream, @Nullable String str) {
        return a(inputStream, str, true);
    }

    @WorkerThread
    public static j<LottieComposition> a(Context context, String str) {
        return new c(context, str).a();
    }

    public static k<LottieComposition> b(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        return a(str, (Callable<j<LottieComposition>>) new Callable<j<LottieComposition>>() {
            public final /* synthetic */ Object call() throws Exception {
                return f.c(applicationContext, str);
            }
        });
    }

    @WorkerThread
    public static j<LottieComposition> b(Context context, @RawRes int i) {
        try {
            return a(context.getResources().openRawResource(i), a(i));
        } catch (Resources.NotFoundException e2) {
            return new j<>((Throwable) e2);
        }
    }

    @Nullable
    private static g a(LottieComposition lottieComposition, String str) {
        for (g next : lottieComposition.getImages().values()) {
            if (next.f4856d.equals(str)) {
                return next;
            }
        }
        return null;
    }

    @WorkerThread
    public static j<LottieComposition> c(Context context, String str) {
        try {
            String str2 = "asset_" + str;
            if (str.endsWith(".zip")) {
                return a(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return a(context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new j<>((Throwable) e2);
        }
    }

    @WorkerThread
    public static j<LottieComposition> a(String str, @Nullable String str2) {
        return b(new JsonReader(new StringReader(str)), str2);
    }

    @WorkerThread
    public static j<LottieComposition> a(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return b(zipInputStream, str);
        } finally {
            com.airbnb.lottie.f.f.a((Closeable) zipInputStream);
        }
    }

    @WorkerThread
    private static j<LottieComposition> b(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        lottieComposition = (LottieComposition) a(zipInputStream, str, false).f4882a;
                    } else if (nextEntry.getName().contains(".png")) {
                        String[] split = nextEntry.getName().split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new j<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                g a2 = a(lottieComposition, (String) entry.getKey());
                if (a2 != null) {
                    a2.f4858f = (Bitmap) entry.getValue();
                }
            }
            for (Map.Entry next : lottieComposition.getImages().entrySet()) {
                if (((g) next.getValue()).f4858f == null) {
                    return new j<>((Throwable) new IllegalStateException("There is no image for " + ((g) next.getValue()).f4856d));
                }
            }
            g.a().a(str, lottieComposition);
            return new j<>(lottieComposition);
        } catch (IOException e2) {
            return new j<>((Throwable) e2);
        }
    }

    public static k<LottieComposition> a(Context context, @RawRes final int i) {
        final Context applicationContext = context.getApplicationContext();
        return a(a(i), (Callable<j<LottieComposition>>) new Callable<j<LottieComposition>>() {
            public final /* synthetic */ Object call() throws Exception {
                return f.b(applicationContext, i);
            }
        });
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0104 A[Catch:{ Exception -> 0x0177 }] */
    @android.support.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.j<com.airbnb.lottie.LottieComposition> b(android.util.JsonReader r22, @android.support.annotation.Nullable java.lang.String r23) {
        /*
            r0 = r22
            float r1 = com.airbnb.lottie.f.f.a()     // Catch:{ Exception -> 0x0177 }
            android.support.v4.util.LongSparseArray r8 = new android.support.v4.util.LongSparseArray     // Catch:{ Exception -> 0x0177 }
            r8.<init>()     // Catch:{ Exception -> 0x0177 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0177 }
            r7.<init>()     // Catch:{ Exception -> 0x0177 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x0177 }
            r9.<init>()     // Catch:{ Exception -> 0x0177 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x0177 }
            r10.<init>()     // Catch:{ Exception -> 0x0177 }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ Exception -> 0x0177 }
            r12.<init>()     // Catch:{ Exception -> 0x0177 }
            android.support.v4.util.SparseArrayCompat r11 = new android.support.v4.util.SparseArrayCompat     // Catch:{ Exception -> 0x0177 }
            r11.<init>()     // Catch:{ Exception -> 0x0177 }
            com.airbnb.lottie.LottieComposition r13 = new com.airbnb.lottie.LottieComposition     // Catch:{ Exception -> 0x0177 }
            r13.<init>()     // Catch:{ Exception -> 0x0177 }
            r22.beginObject()     // Catch:{ Exception -> 0x0177 }
            r2 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r14 = 0
        L_0x0032:
            boolean r15 = r22.hasNext()     // Catch:{ Exception -> 0x0177 }
            if (r15 == 0) goto L_0x0148
            java.lang.String r15 = r22.nextName()     // Catch:{ Exception -> 0x0177 }
            r16 = -1
            int r17 = r15.hashCode()     // Catch:{ Exception -> 0x0177 }
            r18 = 2
            r19 = 1
            switch(r17) {
                case -1408207997: goto L_0x00a7;
                case -1109732030: goto L_0x009d;
                case 104: goto L_0x0093;
                case 118: goto L_0x0089;
                case 119: goto L_0x007f;
                case 3276: goto L_0x0075;
                case 3367: goto L_0x006b;
                case 3553: goto L_0x0061;
                case 94623709: goto L_0x0056;
                case 97615364: goto L_0x004b;
                default: goto L_0x0049;
            }     // Catch:{ Exception -> 0x0177 }
        L_0x0049:
            goto L_0x00b1
        L_0x004b:
            java.lang.String r3 = "fonts"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 8
            goto L_0x00b2
        L_0x0056:
            java.lang.String r3 = "chars"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 9
            goto L_0x00b2
        L_0x0061:
            java.lang.String r3 = "op"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 3
            goto L_0x00b2
        L_0x006b:
            java.lang.String r3 = "ip"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 2
            goto L_0x00b2
        L_0x0075:
            java.lang.String r3 = "fr"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 4
            goto L_0x00b2
        L_0x007f:
            java.lang.String r3 = "w"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 0
            goto L_0x00b2
        L_0x0089:
            java.lang.String r3 = "v"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 5
            goto L_0x00b2
        L_0x0093:
            java.lang.String r3 = "h"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 1
            goto L_0x00b2
        L_0x009d:
            java.lang.String r3 = "layers"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 6
            goto L_0x00b2
        L_0x00a7:
            java.lang.String r3 = "assets"
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0177 }
            if (r3 == 0) goto L_0x00b1
            r3 = 7
            goto L_0x00b2
        L_0x00b1:
            r3 = -1
        L_0x00b2:
            switch(r3) {
                case 0: goto L_0x0138;
                case 1: goto L_0x012f;
                case 2: goto L_0x0125;
                case 3: goto L_0x0116;
                case 4: goto L_0x010c;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00be;
                default: goto L_0x00b5;
            }     // Catch:{ Exception -> 0x0177 }
        L_0x00b5:
            r21 = r11
            r20 = r12
            r22.skipValue()     // Catch:{ Exception -> 0x0177 }
            goto L_0x0140
        L_0x00be:
            com.airbnb.lottie.e.r.a(r0, r13, r11)     // Catch:{ Exception -> 0x0177 }
            goto L_0x00cd
        L_0x00c2:
            com.airbnb.lottie.e.r.a(r0, r12)     // Catch:{ Exception -> 0x0177 }
            goto L_0x00cd
        L_0x00c6:
            com.airbnb.lottie.e.r.a((android.util.JsonReader) r0, (com.airbnb.lottie.LottieComposition) r13, (java.util.Map) r9, (java.util.Map) r10)     // Catch:{ Exception -> 0x0177 }
            goto L_0x00cd
        L_0x00ca:
            com.airbnb.lottie.e.r.a((android.util.JsonReader) r0, (com.airbnb.lottie.LottieComposition) r13, (java.util.List<com.airbnb.lottie.c.c.d>) r7, (android.support.v4.util.LongSparseArray<com.airbnb.lottie.c.c.d>) r8)     // Catch:{ Exception -> 0x0177 }
        L_0x00cd:
            r21 = r11
            r20 = r12
            goto L_0x0140
        L_0x00d3:
            java.lang.String r3 = r22.nextString()     // Catch:{ Exception -> 0x0177 }
            java.lang.String r15 = "\\."
            java.lang.String[] r3 = r3.split(r15)     // Catch:{ Exception -> 0x0177 }
            r15 = 0
            r16 = r3[r15]     // Catch:{ Exception -> 0x0177 }
            int r15 = java.lang.Integer.parseInt(r16)     // Catch:{ Exception -> 0x0177 }
            r16 = r3[r19]     // Catch:{ Exception -> 0x0177 }
            int r0 = java.lang.Integer.parseInt(r16)     // Catch:{ Exception -> 0x0177 }
            r3 = r3[r18]     // Catch:{ Exception -> 0x0177 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0177 }
            r20 = r12
            r12 = 4
            if (r15 < r12) goto L_0x0100
            if (r15 <= r12) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            if (r0 < r12) goto L_0x0100
            if (r0 <= r12) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            if (r3 < 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r19 = 0
        L_0x0102:
            if (r19 != 0) goto L_0x0109
            java.lang.String r0 = "Lottie only supports bodymovin >= 4.4.0"
            r13.addWarning(r0)     // Catch:{ Exception -> 0x0177 }
        L_0x0109:
            r21 = r11
            goto L_0x0140
        L_0x010c:
            r20 = r12
            double r14 = r22.nextDouble()     // Catch:{ Exception -> 0x0177 }
            float r14 = (float) r14     // Catch:{ Exception -> 0x0177 }
            r12 = r20
            goto L_0x0144
        L_0x0116:
            r21 = r11
            r20 = r12
            double r11 = r22.nextDouble()     // Catch:{ Exception -> 0x0177 }
            float r0 = (float) r11     // Catch:{ Exception -> 0x0177 }
            r3 = 1008981770(0x3c23d70a, float:0.01)
            float r6 = r0 - r3
            goto L_0x0140
        L_0x0125:
            r21 = r11
            r20 = r12
            double r11 = r22.nextDouble()     // Catch:{ Exception -> 0x0177 }
            float r5 = (float) r11     // Catch:{ Exception -> 0x0177 }
            goto L_0x0140
        L_0x012f:
            r21 = r11
            r20 = r12
            int r4 = r22.nextInt()     // Catch:{ Exception -> 0x0177 }
            goto L_0x0140
        L_0x0138:
            r21 = r11
            r20 = r12
            int r2 = r22.nextInt()     // Catch:{ Exception -> 0x0177 }
        L_0x0140:
            r12 = r20
            r11 = r21
        L_0x0144:
            r0 = r22
            goto L_0x0032
        L_0x0148:
            r21 = r11
            r20 = r12
            r22.endObject()     // Catch:{ Exception -> 0x0177 }
            float r0 = (float) r2     // Catch:{ Exception -> 0x0177 }
            float r0 = r0 * r1
            int r0 = (int) r0     // Catch:{ Exception -> 0x0177 }
            float r2 = (float) r4     // Catch:{ Exception -> 0x0177 }
            float r2 = r2 * r1
            int r1 = (int) r2     // Catch:{ Exception -> 0x0177 }
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ Exception -> 0x0177 }
            r2 = 0
            r3.<init>(r2, r2, r0, r1)     // Catch:{ Exception -> 0x0177 }
            r2 = r13
            r4 = r5
            r5 = r6
            r6 = r14
            r11 = r21
            r12 = r20
            r2.init(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0177 }
            com.airbnb.lottie.c.g r0 = com.airbnb.lottie.c.g.a()     // Catch:{ Exception -> 0x0177 }
            r1 = r23
            r0.a(r1, r13)     // Catch:{ Exception -> 0x0177 }
            com.airbnb.lottie.j r0 = new com.airbnb.lottie.j     // Catch:{ Exception -> 0x0177 }
            r0.<init>(r13)     // Catch:{ Exception -> 0x0177 }
            return r0
        L_0x0177:
            r0 = move-exception
            com.airbnb.lottie.j r1 = new com.airbnb.lottie.j
            r1.<init>((java.lang.Throwable) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.f.b(android.util.JsonReader, java.lang.String):com.airbnb.lottie.j");
    }

    public static k<LottieComposition> a(final JsonReader jsonReader, @Nullable final String str) {
        return a(str, (Callable<j<LottieComposition>>) new Callable<j<LottieComposition>>() {
            public final /* synthetic */ Object call() throws Exception {
                return f.b(jsonReader, str);
            }
        });
    }

    static k<LottieComposition> a(final String str, Callable<j<LottieComposition>> callable) {
        if (f4825a.containsKey(str)) {
            return f4825a.get(str);
        }
        k<LottieComposition> kVar = new k<>(callable);
        kVar.a((h<T>) new h<LottieComposition>() {
            public final /* synthetic */ void a(Object obj) {
                f.f4825a.remove(str);
            }
        });
        kVar.c(new h<Throwable>() {
            public final /* synthetic */ void a(Object obj) {
                f.f4825a.remove(str);
            }
        });
        f4825a.put(str, kVar);
        return kVar;
    }

    @WorkerThread
    private static j<LottieComposition> a(InputStream inputStream, @Nullable String str, boolean z) {
        try {
            return b(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.airbnb.lottie.f.f.a((Closeable) inputStream);
            }
        }
    }
}
