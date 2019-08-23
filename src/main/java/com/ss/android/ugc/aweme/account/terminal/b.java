package com.ss.android.ugc.aweme.account.terminal;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/BindPhoneTerminalUtils;", "", "()V", "Companion", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32780a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f32781b = f32781b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f32782c = f32782c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f32783d = f32783d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f32784e = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0003J,\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J,\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/BindPhoneTerminalUtils$Companion;", "", "()V", "BIND_MOBILE_TERMINAL_KEY", "", "CHANGE_MOBILE_TERMINAL_KEY", "TAG", "createExtraData", "Lorg/json/JSONObject;", "errorCode", "", "errorMsg", "scene", "monitorBindMobile", "", "result", "monitorChangeMobile", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32785a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final JSONObject a(int i, String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, f32785a, false, 20946, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, f32785a, false, 20946, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class);
            }
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a();
            if (i != 0) {
                a2.a("error_code", Integer.valueOf(i)).a("error_desc", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                a2.a("scene", str4);
            }
            JSONObject b2 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            return b2;
        }

        @JvmStatic
        public final void a(@TerminalConstants.StatusType int i, @NotNull String str, int i2, @Nullable String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f32785a, false, 20944, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f32785a, false, 20944, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "scene");
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "BindMobile(%d, %s, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            n.a(b.f32782c, i, a(i2, str4, str3));
        }
    }

    @JvmStatic
    public static final void a(@TerminalConstants.StatusType int i, @NotNull String str, int i2, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, f32780a, true, 20941, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, f32780a, true, 20941, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f32784e.a(i, str3, i2, str4);
    }

    @JvmStatic
    public static final void b(@TerminalConstants.StatusType int i, @NotNull String str, int i2, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, f32780a, true, 20942, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, f32780a, true, 20942, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a aVar = f32784e;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, aVar, a.f32785a, false, 20945, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str3, Integer.valueOf(i2), str4};
            ChangeQuickRedirect changeQuickRedirect = a.f32785a;
            Object[] objArr2 = objArr;
            a aVar2 = aVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, 20945, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "scene");
        if (com.ss.android.ugc.aweme.g.a.a()) {
            Locale locale = Locale.US;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
            Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "ChangeMobile(%d, %s, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, 4)), "java.lang.String.format(locale, format, *args)");
        }
        n.a(f32783d, i, aVar.a(i2, str4, str3));
    }
}
