package com.ss.android.ugc.aweme.account.terminal;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/LogoutTerminalUtils;", "", "()V", "Companion", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32795a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f32796b = f32796b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f32797c = f32797c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f32798d = f32798d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f32799e = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J,\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/LogoutTerminalUtils$Companion;", "", "()V", "LOGOUT_TERMINAL_KEY", "", "SWITCH_TERMINAL_KEY", "TAG", "createExtraData", "Lorg/json/JSONObject;", "errorCode", "", "errorMsg", "scene", "monitorLogout", "", "result", "monitorSwitchAccount", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32800a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        private JSONObject a(int i, @Nullable String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, f32800a, false, 20978, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, f32800a, false, 20978, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class);
            }
            Intrinsics.checkParameterIsNotNull(str4, "scene");
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a();
            if (i != 0) {
                a2.a("error_code", Integer.valueOf(i)).a("error_desc", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                a2.a(PushConstants.EXTRA, str4);
            }
            JSONObject b2 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            return b2;
        }

        @JvmStatic
        public final void a(@TerminalConstants.StatusType int i, int i2, @Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f32800a, false, 20977, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f32800a, false, 20977, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "SwitchAccount(%d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            n.a(e.f32798d, i, a(i2, str2, ""));
        }

        @JvmStatic
        public final void a(@TerminalConstants.StatusType int i, @NotNull String str, int i2, @Nullable String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f32800a, false, 20976, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f32800a, false, 20976, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "scene");
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "Logout(%d, %s, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            n.a(e.f32797c, i, a(i2, str4, str3));
        }
    }

    @JvmStatic
    public static final void a(@TerminalConstants.StatusType int i, int i2, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, null, f32795a, true, 20974, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, null, f32795a, true, 20974, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f32799e.a(i, i2, str2);
    }

    @JvmStatic
    public static final void a(@TerminalConstants.StatusType int i, @NotNull String str, int i2, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, f32795a, true, 20973, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, f32795a, true, 20973, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f32799e.a(i, str3, i2, str4);
    }
}
