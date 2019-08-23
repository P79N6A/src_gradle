package com.ss.android.ugc.aweme.commercialize.utils;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007J4\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0007J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/CommerceReportUrlBuilder;", "", "()V", "appendReportUrlParameter", "Landroid/net/Uri$Builder;", "builder", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "reportFrom", "", "reportType", "extra", "getReportMobMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "from", "getReportUrlParameter", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39827a;

    /* renamed from: b  reason: collision with root package name */
    public static final t f39828b = new t();

    private t() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0079, code lost:
        if (r0 == null) goto L_0x007b;
     */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap<java.lang.String, java.lang.String> a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.feed.model.Aweme r19, @org.jetbrains.annotations.NotNull java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f39827a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.util.HashMap> r9 = java.util.HashMap.class
            r4 = 0
            r6 = 1
            r7 = 32444(0x7ebc, float:4.5464E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f39827a
            r15 = 1
            r16 = 32444(0x7ebc, float:4.5464E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.util.HashMap> r18 = java.util.HashMap.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.HashMap r0 = (java.util.HashMap) r0
            return r0
        L_0x0046:
            java.lang.String r2 = "aweme"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "from"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "enter_from"
            r2.put(r3, r1)
            java.lang.String r1 = "author_id"
            java.lang.String r3 = r19.getAuthorUid()
            r2.put(r1, r3)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r19.getAwemeRawAd()
            if (r0 == 0) goto L_0x007b
            java.lang.Long r0 = r0.getGroupId()
            if (r0 == 0) goto L_0x007b
            long r3 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r3)
            if (r0 != 0) goto L_0x007d
        L_0x007b:
            java.lang.String r0 = ""
        L_0x007d:
            r2.put(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.t.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):java.util.HashMap");
    }

    @JvmStatic
    @NotNull
    public static final Uri.Builder a(@NotNull Aweme aweme, @NotNull String str, @NotNull String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4}, null, f39827a, true, 32441, new Class[]{Aweme.class, String.class, String.class}, Uri.Builder.class)) {
            return (Uri.Builder) PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4}, null, f39827a, true, 32441, new Class[]{Aweme.class, String.class, String.class}, Uri.Builder.class);
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        Intrinsics.checkParameterIsNotNull(str3, "reportFrom");
        Intrinsics.checkParameterIsNotNull(str4, "reportType");
        return a(new Uri.Builder(), aweme2, str3, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a4, code lost:
        if (r7 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b7, code lost:
        if (r7 == null) goto L_0x00b9;
     */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri.Builder a(@org.jetbrains.annotations.NotNull android.net.Uri.Builder r23, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.feed.model.Aweme r24, @org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull java.lang.String r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f39827a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.net.Uri$Builder> r6 = android.net.Uri.Builder.class
            r10[r12] = r6
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r6 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r10[r13] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r14] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r15] = r6
            java.lang.Class<android.net.Uri$Builder> r11 = android.net.Uri.Builder.class
            r6 = 0
            r8 = 1
            r9 = 32442(0x7eba, float:4.5461E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0068
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            r5[r14] = r2
            r5[r15] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f39827a
            r19 = 1
            r20 = 32442(0x7eba, float:4.5461E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.net.Uri$Builder> r1 = android.net.Uri.Builder.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<android.net.Uri$Builder> r22 = android.net.Uri.Builder.class
            r16 = r5
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            android.net.Uri$Builder r0 = (android.net.Uri.Builder) r0
            return r0
        L_0x0068:
            java.lang.String r4 = "builder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r4)
            java.lang.String r4 = "aweme"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r4)
            java.lang.String r4 = "reportFrom"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r4)
            java.lang.String r4 = "reportType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "log_extra"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r24.getAwemeRawAd()
            if (r7 == 0) goto L_0x00a6
            java.lang.String r7 = r7.getLogExtra()
            if (r7 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r24.getAwemeRawAd()
            if (r7 != 0) goto L_0x009b
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x009b:
            java.lang.String r8 = "aweme.awemeRawAd!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            java.lang.String r7 = r7.getLogExtra()
            if (r7 != 0) goto L_0x00a8
        L_0x00a6:
            java.lang.String r7 = ""
        L_0x00a8:
            r5.put(r6, r7)
            java.lang.String r6 = "cid"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r24.getAwemeRawAd()
            if (r7 == 0) goto L_0x00b9
            java.lang.String r7 = r7.getCreativeIdStr()
            if (r7 != 0) goto L_0x00bb
        L_0x00b9:
            java.lang.String r7 = ""
        L_0x00bb:
            r5.put(r6, r7)
            com.google.gson.Gson r5 = new com.google.gson.Gson
            r5.<init>()
            java.lang.String r4 = r5.toJson((java.lang.Object) r4)
            java.lang.String r5 = "Gson().toJson(extraMap)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.net.Uri$Builder r0 = a(r0, r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.t.a(android.net.Uri$Builder, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):android.net.Uri$Builder");
    }

    @JvmStatic
    @NotNull
    public static final Uri.Builder a(@NotNull Uri.Builder builder, @NotNull Aweme aweme, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Long l;
        Uri.Builder builder2 = builder;
        Aweme aweme2 = aweme;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{builder2, aweme2, str4, str5, str6}, null, f39827a, true, 32443, new Class[]{Uri.Builder.class, Aweme.class, String.class, String.class, String.class}, Uri.Builder.class)) {
            Object[] objArr = {builder2, aweme2, str4, str5, str6};
            return (Uri.Builder) PatchProxy.accessDispatch(objArr, null, f39827a, true, 32443, new Class[]{Uri.Builder.class, Aweme.class, String.class, String.class, String.class}, Uri.Builder.class);
        }
        Intrinsics.checkParameterIsNotNull(builder2, "builder");
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        Intrinsics.checkParameterIsNotNull(str4, "reportFrom");
        Intrinsics.checkParameterIsNotNull(str5, "reportType");
        Intrinsics.checkParameterIsNotNull(str6, PushConstants.EXTRA);
        Uri.Builder appendQueryParameter = builder2.appendQueryParameter("report_type", str5).appendQueryParameter("item_id", aweme.getAid()).appendQueryParameter("owner_id", aweme.getAuthorUid());
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("user_id", a2.getCurUserId());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            l = awemeRawAd.getGroupId();
        } else {
            l = null;
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("group_id", String.valueOf(l)).appendQueryParameter("report_from", str4);
        Object service = ServiceManager.get().getService(I18nManagerService.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…nagerService::class.java)");
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("app_language", ((I18nManagerService) service).getAppLanguage()).appendQueryParameter(PushConstants.EXTRA, str6);
        i a3 = i.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "AppContextInfoManager.inst()");
        Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("app_name", a3.getAppName()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android");
        i a4 = i.a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "AppContextInfoManager.inst()");
        Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("version", a4.getVersion()).appendQueryParameter("install_id", AppLog.getInstallId());
        Intrinsics.checkExpressionValueIsNotNull(appendQueryParameter6, "builder\n                …\", AppLog.getInstallId())");
        return appendQueryParameter6;
    }
}
