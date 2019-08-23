package com.ss.android.ugc.aweme.app;

import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsSchemeHelper;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34151a = null;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f34152b = f34152b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final String f34153c = f34153c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final String f34154d = f34154d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f34155e = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsSchemeHelper$Companion;", "", "()V", "SCHEME_LOCALSDK", "", "getSCHEME_LOCALSDK", "()Ljava/lang/String;", "SCHEME_SNSSDK", "getSCHEME_SNSSDK", "SCHEME_SSLOCAL", "getSCHEME_SSLOCAL", "getCustomScheme", "isSelfScheme", "", "scheme", "tryConvertScheme", "url", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34156a;

        private a() {
        }

        @NotNull
        public static String a() {
            return e.f34153c;
        }

        @JvmStatic
        @NotNull
        public final String b() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f34156a, false, 22233, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f34156a, false, 22233, new Class[0], String.class);
            } else if (com.ss.android.g.a.b()) {
                if (TextUtils.isEmpty(com.ss.android.g.a.d())) {
                    str = "musically";
                } else {
                    str = com.ss.android.g.a.d();
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "if (TextUtils.isEmpty(I1…ontroller.getPushScheme()");
                return str;
            } else {
                return a() + com.ss.android.sdk.e.a();
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final boolean a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f34156a, false, 22235, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f34156a, false, 22235, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "scheme");
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            if (Intrinsics.areEqual((Object) e.f34152b, (Object) str2)) {
                return true;
            }
            String b2 = b();
            if (StringUtils.isEmpty(b2) || !Intrinsics.areEqual((Object) b2, (Object) str2)) {
                return false;
            }
            return true;
        }
    }

    @JvmStatic
    @NotNull
    public static final String a() {
        return PatchProxy.isSupport(new Object[0], null, f34151a, true, 22230, new Class[0], String.class) ? (String) PatchProxy.accessDispatch(new Object[0], null, f34151a, true, 22230, new Class[0], String.class) : f34155e.b();
    }
}
