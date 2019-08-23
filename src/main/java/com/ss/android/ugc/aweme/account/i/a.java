package com.ss.android.ugc.aweme.account.i;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J<\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J(\u0010\u0012\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J(\u0010\u0013\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J2\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/account/log/AccountLoginAlogHelper;", "Lcom/ss/android/ugc/aweme/account/log/BaseAccountAlogHelper;", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "onLoginFail", "", "errorCode", "errorMsg", "part", "Lcom/ss/android/ugc/aweme/account/log/AccountLoginAlogHelper$ALogLoginPart;", "loginMethod", "Lcom/ss/android/ugc/aweme/account/log/AccountLoginAlogHelper$ALogLoginMethod;", "extraInfo", "onLoginSuccess", "onPartFail", "onPartSuccess", "onSomePart", "onUpdateUserInfo", "userInfo", "Lcom/bytedance/sdk/account/user/IBDAccountUserEntity;", "onUpdateUserInfoResultCheck", "showLoginPage", "from", "startLogin", "enterMethod", "ALogLoginMethod", "ALogLoginPart", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31982a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final a f31983b = new a();
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final String f31984e = f31984e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/account/log/AccountLoginAlogHelper$ALogLoginMethod;", "", "(Ljava/lang/String;I)V", "DEFAULT", "EMAIL_PASS", "USER_NAME_PASS", "PHONE_NUMBER_PASS", "PHONE_SMS", "THIRD_PARTY", "ONE_LOGIN", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.account.i.a$a  reason: collision with other inner class name */
    public enum C0406a {
        DEFAULT,
        EMAIL_PASS,
        USER_NAME_PASS,
        PHONE_NUMBER_PASS,
        PHONE_SMS,
        THIRD_PARTY,
        ONE_LOGIN;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/account/log/AccountLoginAlogHelper$ALogLoginPart;", "", "(Ljava/lang/String;I)V", "GET_THIRD_PARTY_AUTH_INFO", "SSO_WITH_THIRD_PARTY", "HIT_VERIFY_STRATEGY", "HIT_NO_TRUST_DEVICE", "REFRESH_AWEME_USER", "USER_OPERATOR_AFTER_LOGIN", "CHECK_PRIVACY_ACCEPT", "ONE_LOGIN_GET_TOKEN", "ONE_LOGIN_BY_TOKEN", "LOGIN_BY_PASS", "LOGIN_BY_PHONE_SMS", "THIRD_MATCH_SETTING_BEFORE_LOGIN", "THIRD_MATCH_SETTING_AFTER_LOGIN", "THIRD_MATCH_SETTING_CLICK", "THIRD_LOGIN_AGE_GATE", "PHONE_NUMBER_INVALID", "NEED_INTERCEPTE", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public enum b {
        GET_THIRD_PARTY_AUTH_INFO,
        SSO_WITH_THIRD_PARTY,
        HIT_VERIFY_STRATEGY,
        HIT_NO_TRUST_DEVICE,
        REFRESH_AWEME_USER,
        USER_OPERATOR_AFTER_LOGIN,
        CHECK_PRIVACY_ACCEPT,
        ONE_LOGIN_GET_TOKEN,
        ONE_LOGIN_BY_TOKEN,
        LOGIN_BY_PASS,
        LOGIN_BY_PHONE_SMS,
        THIRD_MATCH_SETTING_BEFORE_LOGIN,
        THIRD_MATCH_SETTING_AFTER_LOGIN,
        THIRD_MATCH_SETTING_CLICK,
        THIRD_LOGIN_AGE_GATE,
        PHONE_NUMBER_INVALID,
        NEED_INTERCEPTE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private a() {
    }

    @NotNull
    public final String a() {
        return f31984e;
    }

    @JvmStatic
    public static final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f31982a, true, 20028, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f31982a, true, 20028, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event", "login success");
        hashMap.put(PushConstants.EXTRA, str2);
        a aVar = f31983b;
        String hashMap2 = hashMap.toString();
        Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
        aVar.c(hashMap2);
    }

    @JvmStatic
    public static final void b(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f31982a, true, 20034, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f31982a, true, 20034, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on update user info result check");
        hashMap.put("errorMsg", str2);
        a aVar = f31983b;
        String hashMap2 = hashMap.toString();
        Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
        aVar.c(hashMap2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (r1 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0061, code lost:
        if (r0 == null) goto L_0x0063;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.b r21, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.C0406a r22, @org.jetbrains.annotations.Nullable java.lang.String r23) {
        /*
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r21
            r12 = 1
            r4[r12] = r22
            r13 = 2
            r4[r13] = r23
            com.meituan.robust.ChangeQuickRedirect r6 = f31982a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$b> r5 = com.ss.android.ugc.aweme.account.i.a.b.class
            r9[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r5 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 20029(0x4e3d, float:2.8067E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r21
            r14[r12] = r22
            r14[r13] = r23
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f31982a
            r17 = 1
            r18 = 20029(0x4e3d, float:2.8067E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$b> r1 = com.ss.android.ugc.aweme.account.i.a.b.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r1 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x004d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "event"
            java.lang.String r5 = "login part success"
            r3.put(r4, r5)
            java.lang.String r4 = "part"
            if (r21 == 0) goto L_0x0063
            java.lang.String r0 = r21.name()
            if (r0 != 0) goto L_0x0065
        L_0x0063:
            java.lang.String r0 = ""
        L_0x0065:
            r3.put(r4, r0)
            java.lang.String r0 = "loginMethod"
            if (r22 == 0) goto L_0x0072
            java.lang.String r1 = r22.name()
            if (r1 != 0) goto L_0x0074
        L_0x0072:
            java.lang.String r1 = ""
        L_0x0074:
            r3.put(r0, r1)
            java.lang.String r0 = "extra"
            if (r23 != 0) goto L_0x007e
            java.lang.String r1 = ""
            goto L_0x0080
        L_0x007e:
            r1 = r23
        L_0x0080:
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.account.i.a r0 = f31983b
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "map.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.i.a.a(com.ss.android.ugc.aweme.account.i.a$b, com.ss.android.ugc.aweme.account.i.a$a, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (r1 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0061, code lost:
        if (r0 == null) goto L_0x0063;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.b r21, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.C0406a r22, @org.jetbrains.annotations.Nullable java.lang.String r23) {
        /*
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r21
            r12 = 1
            r4[r12] = r22
            r13 = 2
            r4[r13] = r23
            com.meituan.robust.ChangeQuickRedirect r6 = f31982a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$b> r5 = com.ss.android.ugc.aweme.account.i.a.b.class
            r9[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r5 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 20031(0x4e3f, float:2.807E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r21
            r14[r12] = r22
            r14[r13] = r23
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f31982a
            r17 = 1
            r18 = 20031(0x4e3f, float:2.807E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$b> r1 = com.ss.android.ugc.aweme.account.i.a.b.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r1 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x004d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "event"
            java.lang.String r5 = "on some part"
            r3.put(r4, r5)
            java.lang.String r4 = "part"
            if (r21 == 0) goto L_0x0063
            java.lang.String r0 = r21.name()
            if (r0 != 0) goto L_0x0065
        L_0x0063:
            java.lang.String r0 = ""
        L_0x0065:
            r3.put(r4, r0)
            java.lang.String r0 = "loginMethod"
            if (r22 == 0) goto L_0x0072
            java.lang.String r1 = r22.name()
            if (r1 != 0) goto L_0x0074
        L_0x0072:
            java.lang.String r1 = ""
        L_0x0074:
            r3.put(r0, r1)
            java.lang.String r0 = "extra"
            if (r23 != 0) goto L_0x007e
            java.lang.String r1 = ""
            goto L_0x0080
        L_0x007e:
            r1 = r23
        L_0x0080:
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.account.i.a r0 = f31983b
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "map.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.i.a.b(com.ss.android.ugc.aweme.account.i.a$b, com.ss.android.ugc.aweme.account.i.a$a, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0088, code lost:
        if (r1 == null) goto L_0x008a;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(@org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.C0406a r24, @org.jetbrains.annotations.Nullable java.lang.String r25) {
        /*
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r22
            r12 = 1
            r4[r12] = r23
            r13 = 2
            r4[r13] = r24
            r14 = 3
            r4[r14] = r25
            com.meituan.robust.ChangeQuickRedirect r6 = f31982a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r5 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r9[r13] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r14] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 20027(0x4e3b, float:2.8064E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005c
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r22
            r4[r12] = r23
            r4[r13] = r24
            r4[r14] = r25
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = f31982a
            r18 = 1
            r19 = 20027(0x4e3b, float:2.8064E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r1 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class r21 = java.lang.Void.TYPE
            r15 = r4
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x005c:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "event"
            java.lang.String r5 = "start login"
            r3.put(r4, r5)
            java.lang.String r4 = "from"
            if (r22 != 0) goto L_0x006f
            java.lang.String r0 = ""
            goto L_0x0071
        L_0x006f:
            r0 = r22
        L_0x0071:
            r3.put(r4, r0)
            java.lang.String r0 = "enterMethod"
            if (r23 != 0) goto L_0x007b
            java.lang.String r1 = ""
            goto L_0x007d
        L_0x007b:
            r1 = r23
        L_0x007d:
            r3.put(r0, r1)
            java.lang.String r0 = "loginMethod"
            if (r24 == 0) goto L_0x008a
            java.lang.String r1 = r24.name()
            if (r1 != 0) goto L_0x008c
        L_0x008a:
            java.lang.String r1 = ""
        L_0x008c:
            r3.put(r0, r1)
            java.lang.String r0 = "extra"
            if (r25 != 0) goto L_0x0096
            java.lang.String r1 = ""
            goto L_0x0098
        L_0x0096:
            r1 = r25
        L_0x0098:
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.account.i.a r0 = f31983b
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "map.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.i.a.a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.account.i.a$a, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        if (r1 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        if (r1 == null) goto L_0x00a7;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(@org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.b r25, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.C0406a r26, @org.jetbrains.annotations.Nullable java.lang.String r27) {
        /*
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r23
            r12 = 1
            r4[r12] = r24
            r13 = 2
            r4[r13] = r25
            r14 = 3
            r4[r14] = r26
            r15 = 4
            r4[r15] = r27
            com.meituan.robust.ChangeQuickRedirect r6 = f31982a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$b> r5 = com.ss.android.ugc.aweme.account.i.a.b.class
            r9[r13] = r5
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r5 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r9[r14] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r15] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 20032(0x4e40, float:2.8071E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x006a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r23
            r4[r12] = r24
            r4[r13] = r25
            r4[r14] = r26
            r4[r15] = r27
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f31982a
            r19 = 1
            r20 = 20032(0x4e40, float:2.8071E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$b> r1 = com.ss.android.ugc.aweme.account.i.a.b.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r1 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r4
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x006a:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "event"
            java.lang.String r5 = "login fail"
            r3.put(r4, r5)
            java.lang.String r4 = "errorCode"
            if (r23 != 0) goto L_0x007d
            java.lang.String r0 = ""
            goto L_0x007f
        L_0x007d:
            r0 = r23
        L_0x007f:
            r3.put(r4, r0)
            java.lang.String r0 = "errorMsg"
            if (r24 != 0) goto L_0x0089
            java.lang.String r1 = ""
            goto L_0x008b
        L_0x0089:
            r1 = r24
        L_0x008b:
            r3.put(r0, r1)
            java.lang.String r0 = "part"
            if (r25 == 0) goto L_0x0098
            java.lang.String r1 = r25.name()
            if (r1 != 0) goto L_0x009a
        L_0x0098:
            java.lang.String r1 = ""
        L_0x009a:
            r3.put(r0, r1)
            java.lang.String r0 = "loginMethod"
            if (r26 == 0) goto L_0x00a7
            java.lang.String r1 = r26.name()
            if (r1 != 0) goto L_0x00a9
        L_0x00a7:
            java.lang.String r1 = ""
        L_0x00a9:
            r3.put(r0, r1)
            java.lang.String r0 = "extra"
            if (r27 != 0) goto L_0x00b3
            java.lang.String r1 = ""
            goto L_0x00b5
        L_0x00b3:
            r1 = r27
        L_0x00b5:
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.account.i.a r0 = f31983b
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "map.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.i.a.b(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.account.i.a$b, com.ss.android.ugc.aweme.account.i.a$a, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        if (r1 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        if (r1 == null) goto L_0x00a7;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(@org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.b r25, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.account.i.a.C0406a r26, @org.jetbrains.annotations.Nullable java.lang.String r27) {
        /*
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r23
            r12 = 1
            r4[r12] = r24
            r13 = 2
            r4[r13] = r25
            r14 = 3
            r4[r14] = r26
            r15 = 4
            r4[r15] = r27
            com.meituan.robust.ChangeQuickRedirect r6 = f31982a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$b> r5 = com.ss.android.ugc.aweme.account.i.a.b.class
            r9[r13] = r5
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r5 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r9[r14] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r15] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 20030(0x4e3e, float:2.8068E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x006a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r23
            r4[r12] = r24
            r4[r13] = r25
            r4[r14] = r26
            r4[r15] = r27
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f31982a
            r19 = 1
            r20 = 20030(0x4e3e, float:2.8068E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$b> r1 = com.ss.android.ugc.aweme.account.i.a.b.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.i.a$a> r1 = com.ss.android.ugc.aweme.account.i.a.C0406a.class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r4
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x006a:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "event"
            java.lang.String r5 = "login part fail"
            r3.put(r4, r5)
            java.lang.String r4 = "errorCode"
            if (r23 != 0) goto L_0x007d
            java.lang.String r0 = ""
            goto L_0x007f
        L_0x007d:
            r0 = r23
        L_0x007f:
            r3.put(r4, r0)
            java.lang.String r0 = "errorMsg"
            if (r24 != 0) goto L_0x0089
            java.lang.String r1 = ""
            goto L_0x008b
        L_0x0089:
            r1 = r24
        L_0x008b:
            r3.put(r0, r1)
            java.lang.String r0 = "part"
            if (r25 == 0) goto L_0x0098
            java.lang.String r1 = r25.name()
            if (r1 != 0) goto L_0x009a
        L_0x0098:
            java.lang.String r1 = ""
        L_0x009a:
            r3.put(r0, r1)
            java.lang.String r0 = "loginMethod"
            if (r26 == 0) goto L_0x00a7
            java.lang.String r1 = r26.name()
            if (r1 != 0) goto L_0x00a9
        L_0x00a7:
            java.lang.String r1 = ""
        L_0x00a9:
            r3.put(r0, r1)
            java.lang.String r0 = "extra"
            if (r27 != 0) goto L_0x00b3
            java.lang.String r1 = ""
            goto L_0x00b5
        L_0x00b3:
            r1 = r27
        L_0x00b5:
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.account.i.a r0 = f31983b
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "map.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.i.a.a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.account.i.a$b, com.ss.android.ugc.aweme.account.i.a$a, java.lang.String):void");
    }
}
