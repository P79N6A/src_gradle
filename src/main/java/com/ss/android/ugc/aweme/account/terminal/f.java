package com.ss.android.ugc.aweme.account.terminal;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/SendCodeTerminalUtils;", "", "()V", "Companion", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32801a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f32802b = f32802b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f32803c = f32803c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f32804d = f32804d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f32805e = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J,\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J6\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J,\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/SendCodeTerminalUtils$Companion;", "", "()V", "SEND_CODE_TERMINAL_KLEY", "", "SEND_WHATSAPP_CODE_TERMINAL_KLEY", "TAG", "createExtraData", "Lorg/json/JSONObject;", "errorCode", "", "errorMsg", "scenario", "sendFrom", "monitorSendCode", "", "result", "monitorSendWhatsappCode", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32806a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        private JSONObject a(int i, @Nullable String str, int i2, @Nullable String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f32806a, false, 20986, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f32806a, false, 20986, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, JSONObject.class);
            }
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a();
            if (i != 0) {
                a2.a("error_code", Integer.valueOf(i)).a("error_desc", str3);
            }
            a2.a("send_type", Integer.valueOf(i2));
            if (str4 != null) {
                a2.a("send_from", str4);
            }
            JSONObject b2 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            return b2;
        }

        @JvmStatic
        public final void a(@TerminalConstants.StatusType int i, int i2, int i3, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f32806a, false, 20983, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f32806a, false, 20983, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            a(i, i2, i3, str, null);
        }

        @JvmStatic
        private void a(@TerminalConstants.StatusType int i, int i2, int i3, @Nullable String str, @Nullable String str2) {
            String str3 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, null}, this, f32806a, false, 20984, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, null}, this, f32806a, false, 20984, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "SendCode(%d, %d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            n.a(f.f32803c, i, a(i3, str3, i2, (String) null));
        }
    }

    @JvmStatic
    public static final void a(@TerminalConstants.StatusType int i, int i2, int i3, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, null, f32801a, true, 20979, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, null, f32801a, true, 20979, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f32805e.a(i, i2, i3, str2);
    }
}
