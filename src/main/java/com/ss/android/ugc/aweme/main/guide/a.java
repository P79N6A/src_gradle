package com.ss.android.ugc.aweme.main.guide;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guide/FissionSPManager;", "", "()V", "checkInstallTime", "", "context", "Landroid/content/Context;", "m", "", "checkUserActive", "n", "more", "checkUserOpenFrequent", "clearNinePatchBubbleState", "", "getHasShowedFeedPendantToday", "getHasShowedNinePatchBubble", "getSP", "Landroid/content/SharedPreferences;", "setHasShowedFeedPendantToday", "setHasShowedNinePatchBubble", "Companion", "Inner", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54799a = null;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f54800b = f54800b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final String f54801c = f54801c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f54802d = f54802d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final String f54803e = f54803e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final String f54804f = f54804f;
    @NotNull
    public static final String g = g;
    public static final C0631a h = new C0631a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guide/FissionSPManager$Companion;", "", "()V", "BUBBLE_STATE", "", "getBUBBLE_STATE", "()Ljava/lang/String;", "FISSION_SP_NAME", "getFISSION_SP_NAME", "LAST_SHOW_FEED_PENDANT_DATE", "getLAST_SHOW_FEED_PENDANT_DATE", "ONEDAY", "", "getONEDAY", "()I", "OPEN_TIME", "getOPEN_TIME", "TABLE_APP_OPEN", "getTABLE_APP_OPEN", "get", "Lcom/ss/android/ugc/aweme/main/guide/FissionSPManager;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.main.guide.a$a  reason: collision with other inner class name */
    public static final class C0631a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54805a;

        private C0631a() {
        }

        @NotNull
        public final a a() {
            if (!PatchProxy.isSupport(new Object[0], this, f54805a, false, 58058, new Class[0], a.class)) {
                return b.a();
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, f54805a, false, 58058, new Class[0], a.class);
        }

        public /* synthetic */ C0631a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guide/FissionSPManager$Inner;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/main/guide/FissionSPManager;", "getInstance", "()Lcom/ss/android/ugc/aweme/main/guide/FissionSPManager;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54806a = new b();
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private static final a f54807b = new a();

        private b() {
        }

        @NotNull
        public static a a() {
            return f54807b;
        }
    }

    public final SharedPreferences a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f54799a, false, 58049, new Class[]{Context.class}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context2}, this, f54799a, false, 58049, new Class[]{Context.class}, SharedPreferences.class);
        }
        SharedPreferences a2 = c.a(context2, f54800b, 0);
        Intrinsics.checkExpressionValueIsNotNull(a2, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return a2;
    }

    public final void b(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f54799a, false, 58053, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f54799a, false, 58053, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        a(context).edit().putString(f54801c, String.valueOf(instance.getTimeInMillis())).apply();
    }

    public final boolean c(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f54799a, false, 58054, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f54799a, false, 58054, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        String string = a(context).getString(f54801c, PushConstants.PUSH_TYPE_NOTIFY);
        if (string == null) {
            return false;
        }
        try {
            float parseFloat = Float.parseFloat(string);
            if (parseFloat == 0.0f) {
                return false;
            }
            if (((float) System.currentTimeMillis()) - parseFloat < ((float) f54802d)) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x014f, code lost:
        if ((r3.getCount() + r2) <= r1) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@org.jetbrains.annotations.NotNull android.content.Context r24, int r25, int r26, boolean r27) {
        /*
            r23 = this;
            r0 = r24
            r1 = r26
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r12 = 1
            r3[r12] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)
            r13 = 2
            r3[r13] = r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r27)
            r14 = 3
            r3[r14] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f54799a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r12] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r13] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r14] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r6 = 0
            r7 = 58055(0xe2c7, float:8.1352E-41)
            r4 = r23
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0082
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r15[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r15[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r15[r13] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r27)
            r15[r14] = r0
            com.meituan.robust.ChangeQuickRedirect r17 = f54799a
            r18 = 0
            r19 = 58055(0xe2c7, float:8.1352E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r14] = r1
            java.lang.Class r21 = java.lang.Boolean.TYPE
            r16 = r23
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0082:
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            r2 = 0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ all -> 0x015d }
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r3 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r3)     // Catch:{ all -> 0x015d }
            java.lang.String r3 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)     // Catch:{ all -> 0x015d }
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r0     // Catch:{ all -> 0x015d }
            android.database.sqlite.SQLiteDatabase r0 = r0.getAppOpenReadDB()     // Catch:{ all -> 0x015d }
            r14 = 1
            java.lang.String r15 = f54803e     // Catch:{ all -> 0x015d }
            r16 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
            r3.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r4 = f54804f     // Catch:{ all -> 0x015d }
            r3.append(r4)     // Catch:{ all -> 0x015d }
            java.lang.String r4 = " > ?"
            r3.append(r4)     // Catch:{ all -> 0x015d }
            java.lang.String r17 = r3.toString()     // Catch:{ all -> 0x015d }
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ all -> 0x015d }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015d }
            int r6 = f54802d     // Catch:{ all -> 0x015d }
            int r6 = r6 * 7
            long r6 = (long) r6     // Catch:{ all -> 0x015d }
            long r4 = r4 - r6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x015d }
            r3[r10] = r4     // Catch:{ all -> 0x015d }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r13 = r0
            r18 = r3
            android.database.Cursor r3 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x015d }
            if (r3 != 0) goto L_0x00d9
            return r10
        L_0x00d9:
            java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x015b }
            java.lang.String r5 = "calendar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)     // Catch:{ all -> 0x015b }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015b }
            r4.setTimeInMillis(r5)     // Catch:{ all -> 0x015b }
            r5 = 11
            r4.set(r5, r10)     // Catch:{ all -> 0x015b }
            r5 = 12
            r4.set(r5, r10)     // Catch:{ all -> 0x015b }
            r5 = 13
            r4.set(r5, r10)     // Catch:{ all -> 0x015b }
            r5 = 14
            r4.set(r5, r10)     // Catch:{ all -> 0x015b }
            r14 = 1
            java.lang.String r15 = f54803e     // Catch:{ all -> 0x015b }
            r16 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r5.<init>()     // Catch:{ all -> 0x015b }
            java.lang.String r6 = f54804f     // Catch:{ all -> 0x015b }
            r5.append(r6)     // Catch:{ all -> 0x015b }
            java.lang.String r6 = " = ?"
            r5.append(r6)     // Catch:{ all -> 0x015b }
            java.lang.String r17 = r5.toString()     // Catch:{ all -> 0x015b }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ all -> 0x015b }
            long r6 = r4.getTimeInMillis()     // Catch:{ all -> 0x015b }
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x015b }
            r5[r10] = r4     // Catch:{ all -> 0x015b }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r13 = r0
            r18 = r5
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "todayCursor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)     // Catch:{ all -> 0x0158 }
            int r0 = r4.getCount()     // Catch:{ all -> 0x0158 }
            if (r0 <= 0) goto L_0x013d
            r2 = 0
            goto L_0x013e
        L_0x013d:
            r2 = 1
        L_0x013e:
            if (r27 == 0) goto L_0x014a
            int r0 = r3.getCount()     // Catch:{ all -> 0x0158 }
            int r0 = r0 + r2
            if (r0 < r1) goto L_0x0148
            goto L_0x0151
        L_0x0148:
            r12 = 0
            goto L_0x0151
        L_0x014a:
            int r0 = r3.getCount()     // Catch:{ all -> 0x0158 }
            int r0 = r0 + r2
            if (r0 > r1) goto L_0x0148
        L_0x0151:
            r3.close()
            r4.close()
            return r12
        L_0x0158:
            r0 = move-exception
            r2 = r4
            goto L_0x015f
        L_0x015b:
            r0 = move-exception
            goto L_0x015f
        L_0x015d:
            r0 = move-exception
            r3 = r2
        L_0x015f:
            if (r3 == 0) goto L_0x0164
            r3.close()
        L_0x0164:
            if (r2 == 0) goto L_0x0169
            r2.close()
        L_0x0169:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.guide.a.a(android.content.Context, int, int, boolean):boolean");
    }
}
