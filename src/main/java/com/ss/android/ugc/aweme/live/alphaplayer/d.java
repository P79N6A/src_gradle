package com.ss.android.ugc.aweme.live.alphaplayer;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53242a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f53243b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f53244c;

    /* renamed from: d  reason: collision with root package name */
    public String f53245d;

    /* renamed from: e  reason: collision with root package name */
    private String f53246e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f53247f;
    private String g;
    private String h;
    private a i;
    private a j;
    private String k;

    public enum a {
        ScaleToFill(0),
        ScaleAspectFitCenter(1),
        ScaleAspectFill(2),
        TopFill(3),
        BottomFill(4),
        LeftFill(5),
        RightFill(6),
        TopFit(7),
        BottomFit(8),
        LeftFit(9),
        RightFit(10);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        int index;

        public static a convertFrom(int i) {
            switch (i) {
                case 0:
                    return ScaleToFill;
                case 1:
                    return ScaleAspectFitCenter;
                case 2:
                    return ScaleAspectFill;
                case 3:
                    return TopFill;
                case 4:
                    return BottomFill;
                case 5:
                    return LeftFill;
                case 6:
                    return RightFill;
                case e.l:
                    return TopFit;
                case 8:
                    return BottomFit;
                case 9:
                    return LeftFit;
                case 10:
                    return RightFit;
                default:
                    return ScaleAspectFill;
            }
        }

        private a(int i) {
            this.index = i;
        }
    }

    public final a b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f53242a, false, 55459, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f53242a, false, 55459, new Class[]{Integer.TYPE}, a.class);
        } else if (this.i == null || this.j == null) {
            String str = "landscape";
            if (1 == i2) {
                str = "portrait";
            }
            try {
                return a.convertFrom(this.f53247f.getJSONObject(str).getInt("align"));
            } catch (JSONException e2) {
                this.f53245d = Log.getStackTraceString(e2);
                return a.ScaleAspectFill;
            }
        } else if (1 == i2) {
            return this.i;
        } else {
            return this.j;
        }
    }

    public final String a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f53242a, false, 55458, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f53242a, false, 55458, new Class[]{Integer.TYPE}, String.class);
        } else if (TextUtils.isEmpty(this.g) || TextUtils.isEmpty(this.h)) {
            String str = "landscape";
            if (1 == i2) {
                str = "portrait";
            }
            try {
                return this.k + File.separator + this.f53247f.getJSONObject(str).getString("path");
            } catch (JSONException e2) {
                this.f53245d = Log.getStackTraceString(e2);
                return "";
            }
        } else if (1 == i2) {
            return this.g;
        } else {
            return this.h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0122, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0126, code lost:
        r10.f53245d = android.util.Log.getStackTraceString(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0 A[SYNTHETIC, Splitter:B:41:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5 A[Catch:{ IOException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011a A[SYNTHETIC, Splitter:B:57:0x011a] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0122 A[Catch:{ IOException -> 0x011e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.live.alphaplayer.d a(java.lang.String r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f53242a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.live.alphaplayer.d> r7 = com.ss.android.ugc.aweme.live.alphaplayer.d.class
            r4 = 0
            r5 = 55452(0xd89c, float:7.7705E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0035
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f53242a
            r4 = 0
            r5 = 55452(0xd89c, float:7.7705E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.live.alphaplayer.d> r7 = com.ss.android.ugc.aweme.live.alphaplayer.d.class
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.live.alphaplayer.d r0 = (com.ss.android.ugc.aweme.live.alphaplayer.d) r0
            return r0
        L_0x0035:
            r10.k = r11
            java.lang.String r0 = r10.k
            java.lang.String r1 = java.io.File.separator
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.k
        L_0x0048:
            r0.append(r1)
            java.lang.String r1 = "config.json"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0062
        L_0x0055:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.k
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            goto L_0x0048
        L_0x0062:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r10.k
            r1.<init>(r2)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x012d
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x012d
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00ad }
            java.lang.String r0 = "UTF-8"
            r3.<init>(r2, r0)     // Catch:{ IOException -> 0x00ad }
            int r0 = r2.available()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            char[] r4 = new char[r0]     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r3.read(r4)     // Catch:{ IOException -> 0x00a5, all -> 0x00a7 }
            r3.close()     // Catch:{ IOException -> 0x00a5, all -> 0x00a7 }
            r2.close()     // Catch:{ IOException -> 0x00a5, all -> 0x00a7 }
            r3.close()     // Catch:{ IOException -> 0x009d }
            r2.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00c8
        L_0x009d:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r10.f53245d = r0
            goto L_0x00c8
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ab
        L_0x00a7:
            r0 = move-exception
            goto L_0x00b3
        L_0x00a9:
            r0 = move-exception
            r4 = r1
        L_0x00ab:
            r1 = r3
            goto L_0x00b8
        L_0x00ad:
            r0 = move-exception
            r4 = r1
            goto L_0x00b8
        L_0x00b0:
            r0 = move-exception
            r2 = r1
            r3 = r2
        L_0x00b3:
            r1 = r0
            goto L_0x0118
        L_0x00b5:
            r0 = move-exception
            r2 = r1
            r4 = r2
        L_0x00b8:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0115 }
            r10.f53245d = r0     // Catch:{ all -> 0x0115 }
            if (r1 == 0) goto L_0x00c3
            r1.close()     // Catch:{ IOException -> 0x009d }
        L_0x00c3:
            if (r2 == 0) goto L_0x00c8
            r2.close()     // Catch:{ IOException -> 0x009d }
        L_0x00c8:
            if (r4 == 0) goto L_0x012d
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f53242a
            r4 = 0
            r5 = 55460(0xd8a4, float:7.7716E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00ff
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f53242a
            r4 = 0
            r5 = 55460(0xd8a4, float:7.7716E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x012d
        L_0x00ff:
            r10.f53246e = r0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010b }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x010b }
            r10.f53247f = r1     // Catch:{ JSONException -> 0x010b }
            r10.f53244c = r8     // Catch:{ JSONException -> 0x010b }
            goto L_0x012d
        L_0x010b:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r10.f53245d = r0
            r10.f53244c = r9
            goto L_0x012d
        L_0x0115:
            r0 = move-exception
            r3 = r1
            goto L_0x00b3
        L_0x0118:
            if (r3 == 0) goto L_0x0120
            r3.close()     // Catch:{ IOException -> 0x011e }
            goto L_0x0120
        L_0x011e:
            r0 = move-exception
            goto L_0x0126
        L_0x0120:
            if (r2 == 0) goto L_0x012c
            r2.close()     // Catch:{ IOException -> 0x011e }
            goto L_0x012c
        L_0x0126:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r10.f53245d = r0
        L_0x012c:
            throw r1
        L_0x012d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.d.a(java.lang.String):com.ss.android.ugc.aweme.live.alphaplayer.d");
    }
}
