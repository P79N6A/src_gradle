package com.ss.android.ugc.aweme.account.terminal;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.terminal.TerminalConstants;
import com.ss.android.ugc.aweme.base.n;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/LoginTerminalUtils;", "", "()V", "Companion", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32791a;

    /* renamed from: b  reason: collision with root package name */
    public static long f32792b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f32793c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0007J4\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\"\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0003J$\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J,\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J,\u0010\"\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J6\u0010#\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0004H\u0007J\"\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J,\u0010&\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/LoginTerminalUtils$Companion;", "", "()V", "EMAIL_OR_USERNAME_LOGIN_TERMINAL_KEY", "", "ONE_BIND_TERMINAL_KEY", "ONE_LOGIN_TERMINAL_KEY", "PHONE_PASSWORD_TERMINAL_KEY", "PHONE_SMS_TERMINAL_KEY", "TAG", "THIRD_PARTY_TERMINAL_KEY", "startAuthTime", "", "startAuthTime$annotations", "getStartAuthTime", "()J", "setStartAuthTime", "(J)V", "createExtraData", "Lorg/json/JSONObject;", "errorCode", "", "errorMsg", "platform", "carrierType", "errorType", "createThirdPartyExtraData", "monitorEmailOrUsernameLogin", "", "result", "monitorLogin", "", "bundle", "Landroid/os/Bundle;", "monitorOneBind", "monitorOneLogin", "monitorPhonePasswordLogin", "monitorPhoneSmsLogin", "monitorThirdPartyLogin", "parsePlatformNameToTerminalName", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32794a;

        private a() {
        }

        private static long a() {
            return d.f32792b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x008b, code lost:
            if (r0 == null) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d9, code lost:
            if (r2 == null) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0079, code lost:
            if (r0 == null) goto L_0x007e;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r17, int r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.Nullable android.os.Bundle r20) {
            /*
                r16 = this;
                r7 = r17
                r8 = r18
                r9 = r19
                r10 = r20
                r11 = 4
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
                r12 = 0
                r0[r12] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
                r13 = 1
                r0[r13] = r1
                r14 = 2
                r0[r14] = r9
                r15 = 3
                r0[r15] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f32794a
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r12] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r13] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r14] = r1
                java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                r5[r15] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 20962(0x51e2, float:2.9374E-41)
                r1 = r16
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0071
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
                r0[r12] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
                r0[r13] = r1
                r0[r14] = r9
                r0[r15] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f32794a
                r3 = 0
                r4 = 20962(0x51e2, float:2.9374E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r12] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r13] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r14] = r1
                java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                r5[r15] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r16
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0071:
                if (r10 == 0) goto L_0x007e
                java.lang.String r0 = "carrier_type"
                java.lang.String r0 = r10.getString(r0)
                if (r0 != 0) goto L_0x007c
                goto L_0x007e
            L_0x007c:
                r4 = r0
                goto L_0x0081
            L_0x007e:
                java.lang.String r0 = ""
                goto L_0x007c
            L_0x0081:
                if (r10 == 0) goto L_0x008d
                java.lang.String r0 = "login_path"
                java.lang.String r1 = ""
                java.lang.String r0 = r10.getString(r0, r1)
                if (r0 != 0) goto L_0x008f
            L_0x008d:
                java.lang.String r0 = ""
            L_0x008f:
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1250497972: goto L_0x00f1;
                    case -1028668664: goto L_0x00e1;
                    case -262499015: goto L_0x00c1;
                    case 1440398223: goto L_0x00af;
                    case 1938103376: goto L_0x0097;
                    default: goto L_0x0096;
                }
            L_0x0096:
                goto L_0x0101
            L_0x0097:
                java.lang.String r1 = "one_login"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0101
                r0 = r16
                com.ss.android.ugc.aweme.account.terminal.d$a r0 = (com.ss.android.ugc.aweme.account.terminal.d.a) r0
                r1 = r7 ^ 1
                java.lang.String r5 = "type_normal"
                r2 = r18
                r3 = r19
                r0.a((int) r1, (int) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5)
                return
            L_0x00af:
                java.lang.String r1 = "email_or_username"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0101
                r0 = r16
                com.ss.android.ugc.aweme.account.terminal.d$a r0 = (com.ss.android.ugc.aweme.account.terminal.d.a) r0
                r1 = r7 ^ 1
                r0.a((int) r1, (int) r8, (java.lang.String) r9)
                goto L_0x0101
            L_0x00c1:
                java.lang.String r1 = "third_party_auth"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0101
                r0 = r16
                com.ss.android.ugc.aweme.account.terminal.d$a r0 = (com.ss.android.ugc.aweme.account.terminal.d.a) r0
                r1 = r7 ^ 1
                if (r10 == 0) goto L_0x00db
                java.lang.String r2 = "platform"
                java.lang.String r3 = ""
                java.lang.String r2 = r10.getString(r2, r3)
                if (r2 != 0) goto L_0x00dd
            L_0x00db:
                java.lang.String r2 = ""
            L_0x00dd:
                r0.a((int) r1, (java.lang.String) r2, (int) r8, (java.lang.String) r9)
                return
            L_0x00e1:
                java.lang.String r1 = "phone_sms"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0101
                r0 = r16
                com.ss.android.ugc.aweme.account.terminal.d$a r0 = (com.ss.android.ugc.aweme.account.terminal.d.a) r0
                r0.b(r7, r8, r9)
                return
            L_0x00f1:
                java.lang.String r1 = "phone_password"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0101
                r0 = r16
                com.ss.android.ugc.aweme.account.terminal.d$a r0 = (com.ss.android.ugc.aweme.account.terminal.d.a) r0
                r0.a((boolean) r7, (int) r8, (java.lang.String) r9)
                return
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.terminal.d.a.a(boolean, int, java.lang.String, android.os.Bundle):void");
        }

        @JvmStatic
        public final void a(boolean z, int i, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), str}, this, f32794a, false, 20963, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), str}, this, f32794a, false, 20963, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "PhonePasswordLogin(%b, %d, %s)", Arrays.copyOf(new Object[]{Boolean.valueOf(z), Integer.valueOf(i), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            n.a("monitor_login_phone_passport", z ^ true ? 1 : 0, a(i, str, "", ""));
        }

        @JvmStatic
        public final void a(@TerminalConstants.StatusType int i, @NotNull String str, int i2, @Nullable String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f32794a, false, 20965, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f32794a, false, 20965, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "platform");
            a aVar = this;
            String a2 = aVar.a(str3);
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "ThirdPartyLogin(%d, %s, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), a2, Integer.valueOf(i2), str4}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            n.a("monitor_login_thirdparty", i, aVar.a(i2, str4, a2));
        }

        @JvmStatic
        public final void a(@TerminalConstants.StatusType int i, int i2, @Nullable String str, @NotNull String str2, @NotNull @TerminalConstants.OneLoginErrorType String str3) {
            String str4 = str2;
            String str5 = str3;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, str4, str5}, this, f32794a, false, 20966, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str4, str5};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f32794a, false, 20966, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str4, "carrierType");
            Intrinsics.checkParameterIsNotNull(str5, "errorType");
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "OneLogin(%d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            n.a("monitor_login_quick", i, a(i2, str, "", str2, str3));
        }

        @JvmStatic
        public final void a(@TerminalConstants.StatusType int i, int i2, @Nullable String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, str4}, this, f32794a, false, 20967, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, str4}, this, f32794a, false, 20967, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str4, "carrierType");
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "OneBind(%d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            n.a("monitor_bind_quick", i, a(i2, str3, "", str4));
        }

        @JvmStatic
        private void a(@TerminalConstants.StatusType int i, int i2, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f32794a, false, 20968, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f32794a, false, 20968, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "EmailOrUsernameLogin(%b, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            n.a("monitor_login_email", i, a(i2, str, "", ""));
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(long j) {
            d.f32792b = 0;
        }

        @JvmStatic
        @NotNull
        private String a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f32794a, false, 20972, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f32794a, false, 20972, new Class[]{String.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "platform");
            switch (str.hashCode()) {
                case -1530308138:
                    if (str2.equals("qzone_sns")) {
                        return "qq";
                    }
                    break;
                case -1134307907:
                    if (str2.equals("toutiao")) {
                        return "toutiao";
                    }
                    break;
                case -791575966:
                    if (str2.equals("weixin")) {
                        return "weixin";
                    }
                    break;
                case -471473230:
                    if (str2.equals("sina_weibo")) {
                        return "weibo";
                    }
                    break;
                case 635922494:
                    if (str2.equals("toutiao_v2")) {
                        return "toutiao";
                    }
                    break;
            }
            return str2;
        }

        @JvmStatic
        public final void b(boolean z, int i, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), str}, this, f32794a, false, 20964, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), str}, this, f32794a, false, 20964, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "PhoneSmsLogin(%b, %d, %s)", Arrays.copyOf(new Object[]{Boolean.valueOf(z), Integer.valueOf(i), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            n.a("monitor_login_phone_sms", z ^ true ? 1 : 0, a(i, str, "", ""));
        }

        @JvmStatic
        private JSONObject a(int i, String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, f32794a, false, 20971, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, f32794a, false, 20971, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class);
            }
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a();
            long currentTimeMillis = System.currentTimeMillis() - a();
            a(0);
            if (i != 0) {
                a2.a("error_code", Integer.valueOf(i)).a("error_desc", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                a2.a("platform", str4);
            }
            a2.a("time", Long.valueOf(currentTimeMillis));
            JSONObject b2 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            return b2;
        }

        /* access modifiers changed from: private */
        @JvmStatic
        @NotNull
        public JSONObject a(int i, @Nullable String str, @NotNull String str2, @NotNull String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, str5, str6}, this, f32794a, false, 20969, new Class[]{Integer.TYPE, String.class, String.class, String.class}, JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str4, str5, str6}, this, f32794a, false, 20969, new Class[]{Integer.TYPE, String.class, String.class, String.class}, JSONObject.class);
            }
            Intrinsics.checkParameterIsNotNull(str5, "platform");
            Intrinsics.checkParameterIsNotNull(str6, "carrierType");
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a();
            if (i != 0) {
                a2.a("error_code", Integer.valueOf(i)).a("error_desc", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                a2.a("platform", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                a2.a("carrier_type", str6);
            }
            JSONObject b2 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            return b2;
        }

        @JvmStatic
        @NotNull
        private JSONObject a(int i, @Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str5, str6, str7, str8}, this, f32794a, false, 20970, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}, JSONObject.class)) {
                Object[] objArr = {Integer.valueOf(i), str5, str6, str7, str8};
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, f32794a, false, 20970, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}, JSONObject.class);
            }
            Intrinsics.checkParameterIsNotNull(str6, "platform");
            Intrinsics.checkParameterIsNotNull(str7, "carrierType");
            Intrinsics.checkParameterIsNotNull(str8, "errorType");
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a();
            if (i != 0) {
                a2.a("error_code", Integer.valueOf(i)).a("error_desc", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                a2.a("platform", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                a2.a("carrier_type", str7);
            }
            a2.a("type", str8);
            JSONObject b2 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            return b2;
        }
    }

    @JvmStatic
    public static final void a(@TerminalConstants.StatusType int i, @NotNull String str, int i2, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, f32791a, true, 20954, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, f32791a, true, 20954, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f32793c.a(i, str3, i2, str4);
    }

    @JvmStatic
    public static final void a(boolean z, int i, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{(byte) 0, Integer.valueOf(i), str2}, null, f32791a, true, 20953, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0, Integer.valueOf(i), str2}, null, f32791a, true, 20953, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f32793c.b(false, i, str2);
    }

    @JvmStatic
    public static final void a(boolean z, int i, @Nullable String str, @Nullable Bundle bundle) {
        String str2 = str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), str2, bundle2}, null, f32791a, true, 20951, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), str2, bundle2}, null, f32791a, true, 20951, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, Bundle.class}, Void.TYPE);
            return;
        }
        f32793c.a(z, i, str2, bundle2);
    }
}
