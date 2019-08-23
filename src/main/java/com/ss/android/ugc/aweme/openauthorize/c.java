package com.ss.android.ugc.aweme.openauthorize;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.utils.bh;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/AwemeAuthorizeTerminalUtil;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f58364a = f58364a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f58365b = f58365b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f58366c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f58367d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final a f58368e = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J,\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/AwemeAuthorizeTerminalUtil$Companion;", "", "()V", "AUTHORIZE_TERMINAL_KEY", "", "AUTHRORIZE_CANCEL", "", "getAUTHRORIZE_CANCEL", "()I", "AUTHRORIZE_FAIL", "getAUTHRORIZE_FAIL", "AUTHRORIZE_SUCCESS", "getAUTHRORIZE_SUCCESS", "TAG", "createExtraData", "Lorg/json/JSONObject;", "errorCode", "errorMsg", "clientKey", "monitorAuthorize", "", "result", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58369a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(int i, int i2, @Nullable String str, @Nullable String str2) {
            JSONObject b2;
            String str3;
            String str4 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str4, str2}, this, f58369a, false, 63359, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str4, str2}, this, f58369a, false, 63359, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "monitorAuthorize(%d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str4}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            String str5 = c.f58365b;
            a aVar = this;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str4, str2}, aVar, f58369a, false, 63360, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class)) {
                a aVar2 = aVar;
                b2 = (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str4, str2}, aVar2, f58369a, false, 63360, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class);
            } else {
                bh a2 = bh.a();
                if (i2 != 0) {
                    bh a3 = a2.a("error_code", Integer.valueOf(i2)).a("error_desc", str4);
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    a3.a("client_key", str3);
                }
                b2 = a2.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "eventJsonBuilder.build()");
            }
            n.a(str5, i, b2);
        }
    }
}
