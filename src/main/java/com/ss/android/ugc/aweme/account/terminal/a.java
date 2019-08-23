package com.ss.android.ugc.aweme.account.terminal;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/AccountBusinessTerminalUtils;", "", "()V", "Companion", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32775a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static String f32776b = "";
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static String f32777c = "";

    /* renamed from: d  reason: collision with root package name */
    public static final C0415a f32778d = new C0415a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001eH\u0007J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0004H\u0007J!\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0002\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/AccountBusinessTerminalUtils$Companion;", "", "()V", "ACCOUNT_BUSINESS_MONITOR", "", "ACCOUNT_BUSINESS_TYPE", "AUTO_LOGOUT_TERMINAL_TYPE", "ERROR_CODE", "LOGIN_FAIL_TERMINAL_TYPE", "RETRY_AFTER_TWO_STEP_AUTH", "SPECIAL_CONDITION_TYPE", "TAG", "URL_PATH", "sLoginFailedReason", "sLoginFailedReason$annotations", "getSLoginFailedReason", "()Ljava/lang/String;", "setSLoginFailedReason", "(Ljava/lang/String;)V", "sLogoutReason", "sLogoutReason$annotations", "getSLogoutReason", "setSLogoutReason", "createExtraData", "Lorg/json/JSONObject;", "type", "errorMsg", "monitorAutoLogout", "", "hasLogout", "", "monitorLoginFailed", "loginSuccessfully", "monitorSpecialCondition", "monitorTwoStepAuth", "currentUrlPath", "currentErrorCode", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.account.terminal.a$a  reason: collision with other inner class name */
    public static final class C0415a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32779a;

        private C0415a() {
        }

        @NotNull
        public static String a() {
            return a.f32776b;
        }

        public /* synthetic */ C0415a(byte b2) {
            this();
        }

        public final void a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f32779a, false, 20934, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f32779a, false, 20934, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
            a.f32776b = str2;
        }

        public final void b(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f32779a, false, 20935, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f32779a, false, 20935, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
            a.f32777c = str2;
        }

        @JvmStatic
        public final void c(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f32779a, false, 20939, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f32779a, false, 20939, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "errorMsg");
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "monitorSpecialCondition(%s, %s )", Arrays.copyOf(new Object[]{"special_condition", str2}, 2)), "java.lang.String.format(locale, format, *args)");
            }
            n.a("monitor_account_business", 0, a("special_condition", a()));
        }

        @JvmStatic
        public final JSONObject a(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f32779a, false, 20940, new Class[]{String.class, String.class}, JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f32779a, false, 20940, new Class[]{String.class, String.class}, JSONObject.class);
            }
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a();
            a2.a("type", str3);
            if (!TextUtils.isEmpty(str4)) {
                a2.a("error_desc", str4);
            }
            JSONObject b2 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            return b2;
        }
    }

    @NotNull
    public static final String a() {
        return f32777c;
    }

    public static final void a(@NotNull String str) {
        f32776b = str;
    }

    public static final void b(@NotNull String str) {
        f32777c = str;
    }

    @JvmStatic
    public static final void c(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f32775a, true, 20932, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f32775a, true, 20932, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f32778d.c(str2);
    }
}
