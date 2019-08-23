package com.ss.android.ugc.aweme.account.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.f;
import com.ss.android.ugc.aweme.w;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/util/OneKeyBindUtil;", "", "()V", "getCurrentBindType", "Lcom/ss/android/ugc/aweme/account/util/OneKeyBindUtil$OneKeyBindType;", "shouldShowOneKeyBind", "", "OneKeyBindType", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33096a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f33097b = new k();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/account/util/OneKeyBindUtil$OneKeyBindType;", "", "(Ljava/lang/String;I)V", "NORMAL", "WITHOUT_SET_PASSWORD", "WITH_SET_PASSWORD", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public enum a {
        NORMAL,
        WITHOUT_SET_PASSWORD,
        WITH_SET_PASSWORD;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private k() {
    }

    @JvmStatic
    @NotNull
    public static final a a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f33096a, true, 21333, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f33096a, true, 21333, new Class[0], a.class);
        }
        f i2 = w.i();
        if (i2 != null) {
            i = i2.getOneBindType();
        }
        switch (i) {
            case 0:
                return a.NORMAL;
            case 1:
                return a.WITHOUT_SET_PASSWORD;
            case 2:
                return a.WITH_SET_PASSWORD;
            default:
                return a.NORMAL;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r3.intValue() != 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r2.intValue() != 0) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0114  */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f33096a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = 0
            r4 = 1
            r5 = 21334(0x5356, float:2.9895E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f33096a
            r5 = 1
            r6 = 21334(0x5356, float:2.9895E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            r1 = 1
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r3 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Exception -> 0x0078 }
            java.util.List r2 = r2.bp()     // Catch:{ Exception -> 0x0078 }
            android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ Exception -> 0x0078 }
            boolean r3 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r3)     // Catch:{ Exception -> 0x0078 }
            if (r3 != 0) goto L_0x0044
        L_0x0042:
            r2 = 0
            goto L_0x0079
        L_0x0044:
            android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ Exception -> 0x0078 }
            boolean r3 = com.ss.android.common.util.NetworkUtils.isWifi(r3)     // Catch:{ Exception -> 0x0078 }
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r2.get(r0)     // Catch:{ Exception -> 0x0078 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0078 }
            if (r3 != 0) goto L_0x0057
            goto L_0x005d
        L_0x0057:
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0078 }
            if (r3 == 0) goto L_0x005e
        L_0x005d:
            goto L_0x0042
        L_0x005e:
            android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ Exception -> 0x0078 }
            boolean r3 = com.ss.android.common.util.NetworkUtils.isWifi(r3)     // Catch:{ Exception -> 0x0078 }
            if (r3 != 0) goto L_0x0078
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x0078 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0078 }
            if (r2 != 0) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0078 }
            if (r2 == 0) goto L_0x0078
        L_0x0077:
            goto L_0x0042
        L_0x0078:
            r2 = 1
        L_0x0079:
            java.lang.Class<com.bytedance.sdk.account.i.a.b> r3 = com.bytedance.sdk.account.i.a.b.class
            com.bytedance.sdk.account.i.a.a r3 = com.bytedance.sdk.account.i.b.c.a(r3)
            com.bytedance.sdk.account.i.a.b r3 = (com.bytedance.sdk.account.i.a.b) r3
            if (r3 == 0) goto L_0x0088
            java.lang.String r3 = r3.a()
            goto L_0x008a
        L_0x0088:
            java.lang.String r3 = "others"
        L_0x008a:
            int r4 = r3.hashCode()
            r5 = -1429363305(0xffffffffaacda597, float:-3.6530216E-13)
            if (r4 == r5) goto L_0x00ef
            r5 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r4 == r5) goto L_0x00cd
            r5 = -1006804125(0xffffffffc3fd6363, float:-506.77646)
            if (r4 == r5) goto L_0x00c6
            r5 = -840542575(0xffffffffcde65691, float:-4.83054112E8)
            if (r4 == r5) goto L_0x00a4
            goto L_0x0111
        L_0x00a4:
            java.lang.String r4 = "unicom"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0111
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r3 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Exception -> 0x00ba }
            java.lang.Boolean r3 = r3.bm()     // Catch:{ Exception -> 0x00ba }
            goto L_0x00bc
        L_0x00ba:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x00bc:
            java.lang.String r4 = "try {\n                  …   true\n                }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            boolean r3 = r3.booleanValue()
            goto L_0x0112
        L_0x00c6:
            java.lang.String r4 = "others"
            boolean r3 = r3.equals(r4)
            goto L_0x0111
        L_0x00cd:
            java.lang.String r4 = "mobile"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0111
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r3 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r4 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Exception -> 0x00e3 }
            java.lang.Boolean r3 = r3.bo()     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00e5
        L_0x00e3:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x00e5:
            java.lang.String r4 = "try {\n                  …   true\n                }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            boolean r3 = r3.booleanValue()
            goto L_0x0112
        L_0x00ef:
            java.lang.String r4 = "telecom"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0111
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r3 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x0105 }
            java.lang.String r4 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Exception -> 0x0105 }
            java.lang.Boolean r3 = r3.bn()     // Catch:{ Exception -> 0x0105 }
            goto L_0x0107
        L_0x0105:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x0107:
            java.lang.String r4 = "try {\n                  …   true\n                }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            boolean r3 = r3.booleanValue()
            goto L_0x0112
        L_0x0111:
            r3 = 0
        L_0x0112:
            if (r3 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.account.util.k$a r3 = a()
            com.ss.android.ugc.aweme.account.util.k$a r4 = com.ss.android.ugc.aweme.account.util.k.a.NORMAL
            if (r3 == r4) goto L_0x011f
            if (r2 == 0) goto L_0x011f
            return r1
        L_0x011f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.util.k.b():boolean");
    }
}
