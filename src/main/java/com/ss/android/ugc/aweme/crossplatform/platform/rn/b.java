package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import android.text.TextUtils;
import com.bytedance.ies.g.a;
import com.bytedance.ies.geckoclient.model.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.sdk.c.g;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007\u001a(\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0014H\b\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0017\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\f\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u0015"}, d2 = {"absoluteDir", "Ljava/io/File;", "Lcom/bytedance/ies/geckoclient/model/GeckoPackage;", "getAbsoluteDir", "(Lcom/bytedance/ies/geckoclient/model/GeckoPackage;)Ljava/io/File;", "isDirValid", "", "(Lcom/bytedance/ies/geckoclient/model/GeckoPackage;)Z", "offlineBundleInfo", "Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/model/RNBundleInfo;", "getOfflineBundleInfo", "(Lcom/bytedance/ies/geckoclient/model/GeckoPackage;)Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/model/RNBundleInfo;", "shouldCheckBundleInfo", "getShouldCheckBundleInfo", "getOfflineBundlePath", "", "bundleName", "searchDir", "matcher", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40834a;

    @Nullable
    @JvmOverloads
    public static final String c(@NotNull d dVar) {
        d dVar2 = dVar;
        if (!PatchProxy.isSupport(new Object[]{dVar2}, null, f40834a, true, 34334, new Class[]{d.class}, String.class)) {
            return a(dVar2, null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{dVar2}, null, f40834a, true, 34334, new Class[]{d.class}, String.class);
    }

    public static final boolean a(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, null, f40834a, true, 34328, new Class[]{d.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar2}, null, f40834a, true, 34328, new Class[]{d.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "$this$shouldCheckBundleInfo");
        if (dVar2.g == 0) {
            return true;
        }
        return false;
    }

    private static File d(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, null, f40834a, true, 34330, new Class[]{d.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{dVar2}, null, f40834a, true, 34330, new Class[]{d.class}, File.class);
        } else if (TextUtils.isEmpty(dVar2.f20792d) || TextUtils.equals("null", dVar2.f20792d)) {
            return null;
        } else {
            BaseAppData a2 = BaseAppData.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "BaseAppData.inst()");
            g o = a2.o();
            if (o == null) {
                Intrinsics.throwNpe();
            }
            a a3 = a.a(o.a());
            Intrinsics.checkExpressionValueIsNotNull(a3, "iesOfflineCache");
            return new File(a3.f20692a, dVar2.f20792d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[Catch:{ Exception -> 0x00bc, Throwable -> 0x00d2 }] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo b(@org.jetbrains.annotations.NotNull com.bytedance.ies.geckoclient.model.d r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f40834a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.ies.geckoclient.model.d> r3 = com.bytedance.ies.geckoclient.model.d.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo> r8 = com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo.class
            r3 = 0
            r5 = 1
            r6 = 34332(0x861c, float:4.811E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f40834a
            r13 = 1
            r14 = 34332(0x861c, float:4.811E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.ies.geckoclient.model.d> r0 = com.bytedance.ies.geckoclient.model.d.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo> r16 = com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo r0 = (com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo) r0
            return r0
        L_0x0037:
            java.lang.String r1 = "$this$offlineBundleInfo"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            r1 = 0
            java.io.File r0 = d(r17)     // Catch:{ Throwable -> 0x00d2 }
            if (r0 == 0) goto L_0x0074
            boolean r2 = r0.exists()     // Catch:{ Throwable -> 0x00d2 }
            if (r2 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r0 = r1
        L_0x004b:
            if (r0 == 0) goto L_0x0074
            java.io.File[] r0 = r0.listFiles()     // Catch:{ Throwable -> 0x00d2 }
            if (r0 == 0) goto L_0x0074
            int r2 = r0.length     // Catch:{ Throwable -> 0x00d2 }
        L_0x0054:
            if (r9 >= r2) goto L_0x006c
            r3 = r0[r9]     // Catch:{ Throwable -> 0x00d2 }
            java.lang.String r4 = "bundle_info.json"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x00d2 }
            java.lang.String r5 = r3.getName()     // Catch:{ Throwable -> 0x00d2 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x00d2 }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ Throwable -> 0x00d2 }
            if (r4 == 0) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            int r9 = r9 + 1
            goto L_0x0054
        L_0x006c:
            r3 = r1
        L_0x006d:
            if (r3 == 0) goto L_0x0074
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x00d2 }
            goto L_0x0075
        L_0x0074:
            r0 = r1
        L_0x0075:
            if (r0 == 0) goto L_0x00d2
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x00d2 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x00d2 }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x00d2 }
            if (r2 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r0 = r1
        L_0x0084:
            if (r0 == 0) goto L_0x00d2
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x00d2 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x00d2 }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Throwable -> 0x00d2 }
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch:{ Throwable -> 0x00d2 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x00d2 }
            r3.<init>(r2, r0)     // Catch:{ Throwable -> 0x00d2 }
            java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ Throwable -> 0x00d2 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00d2 }
            r2 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r2)     // Catch:{ Throwable -> 0x00d2 }
            r2 = r0
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ Throwable -> 0x00d2 }
            r0 = r2
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ Throwable -> 0x00ca, all -> 0x00c7 }
            java.io.Reader r0 = (java.io.Reader) r0     // Catch:{ Throwable -> 0x00ca, all -> 0x00c7 }
            java.lang.String r0 = kotlin.io.p.b(r0)     // Catch:{ Throwable -> 0x00ca, all -> 0x00c7 }
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch:{ Throwable -> 0x00d2 }
            if (r0 == 0) goto L_0x00d2
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00bc }
            r2.<init>()     // Catch:{ Exception -> 0x00bc }
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo> r3 = com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo.class
            java.lang.Object r0 = r2.fromJson((java.lang.String) r0, (java.lang.Class<T>) r3)     // Catch:{ Exception -> 0x00bc }
            com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo r0 = (com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo) r0     // Catch:{ Exception -> 0x00bc }
            goto L_0x00c3
        L_0x00bc:
            r0 = move-exception
            com.ss.android.ugc.aweme.fe.b.e r2 = com.ss.android.ugc.aweme.fe.b.e.f44417b     // Catch:{ Throwable -> 0x00d2 }
            r2.a(r0)     // Catch:{ Throwable -> 0x00d2 }
            r0 = r1
        L_0x00c3:
            if (r0 == 0) goto L_0x00d2
            r1 = r0
            goto L_0x00d2
        L_0x00c7:
            r0 = move-exception
            r3 = r1
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
        L_0x00ce:
            kotlin.io.CloseableKt.closeFinally(r2, r3)     // Catch:{ Throwable -> 0x00d2 }
            throw r0     // Catch:{ Throwable -> 0x00d2 }
        L_0x00d2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.rn.b.b(com.bytedance.ies.geckoclient.model.d):com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull com.bytedance.ies.geckoclient.model.d r19, @org.jetbrains.annotations.Nullable java.lang.String r20) {
        /*
            r0 = r19
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r5 = f40834a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.ies.geckoclient.model.d> r4 = com.bytedance.ies.geckoclient.model.d.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 34333(0x861d, float:4.8111E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r20
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f40834a
            r15 = 1
            r16 = 34333(0x861d, float:4.8111E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.ies.geckoclient.model.d> r1 = com.bytedance.ies.geckoclient.model.d.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0046:
            java.lang.String r3 = "$this$getOfflineBundlePath"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.io.File r3 = d(r19)
            r4 = 0
            if (r3 == 0) goto L_0x0097
            boolean r5 = r3.exists()
            if (r5 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = r4
        L_0x005a:
            if (r3 == 0) goto L_0x0097
            java.io.File[] r3 = r3.listFiles()
            if (r3 == 0) goto L_0x0097
            int r5 = r3.length
            r6 = 0
        L_0x0064:
            if (r6 >= r5) goto L_0x008f
            r7 = r3[r6]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "name"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r9)
            r9 = r20
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x007e
            java.lang.String r9 = ".jsbundle"
            goto L_0x0085
        L_0x007e:
            if (r20 != 0) goto L_0x0083
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0083:
            r9 = r20
        L_0x0085:
            boolean r8 = kotlin.text.StringsKt.endsWith$default(r8, r9, r10, r2, r4)
            if (r8 == 0) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            int r6 = r6 + 1
            goto L_0x0064
        L_0x008f:
            r7 = r4
        L_0x0090:
            if (r7 == 0) goto L_0x0097
            java.lang.String r1 = r7.getAbsolutePath()
            goto L_0x0098
        L_0x0097:
            r1 = r4
        L_0x0098:
            if (r1 == 0) goto L_0x00cc
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r1 = r4
        L_0x00a7:
            if (r1 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.app.d.c r2 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r3 = "gecko_channel"
            java.lang.String r0 = r0.f20791c
            com.ss.android.ugc.aweme.app.d.c r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = "file_path"
            com.ss.android.ugc.aweme.app.d.c r0 = r0.a((java.lang.String) r2, (java.lang.String) r1)
            org.json.JSONObject r0 = r0.b()
            java.lang.String r2 = "rn_get_offline_bundle"
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r2, (int) r3, (org.json.JSONObject) r0)
            return r1
        L_0x00cc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.rn.b.a(com.bytedance.ies.geckoclient.model.d, java.lang.String):java.lang.String");
    }
}
