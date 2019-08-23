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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/DeleteDeviceTerminalUtils;", "", "()V", "Companion", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32786a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f32787b = f32787b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f32788c = f32788c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f32789d = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/account/terminal/DeleteDeviceTerminalUtils$Companion;", "", "()V", "DELETE_DEVICE_TERMIANL_KEY", "", "TAG", "createExtraData", "Lorg/json/JSONObject;", "errorCode", "", "errorMsg", "monitorDeleteDevice", "", "result", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32790a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        private JSONObject a(int i, @Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f32790a, false, 20950, new Class[]{Integer.TYPE, String.class}, JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f32790a, false, 20950, new Class[]{Integer.TYPE, String.class}, JSONObject.class);
            }
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a();
            if (i != 0) {
                a2.a("error_code", Integer.valueOf(i)).a("error_desc", str2);
            }
            JSONObject b2 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            return b2;
        }

        @JvmStatic
        public final void a(@TerminalConstants.StatusType int i, int i2, @Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f32790a, false, 20949, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f32790a, false, 20949, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "monitorDeleteDevice(%d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            n.a(c.f32788c, i, a(i2, str2));
        }
    }

    @JvmStatic
    public static final void a(@TerminalConstants.StatusType int i, int i2, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, null, f32786a, true, 20947, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, null, f32786a, true, 20947, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f32789d.a(i, i2, str2);
    }
}
