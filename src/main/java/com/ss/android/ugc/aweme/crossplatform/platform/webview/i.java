package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0007J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/WebViewInterceptHelper;", "", "()V", "addBlackList", "", "data", "", "", "addWhiteList", "intercept", "Landroid/webkit/WebResourceResponse;", "ref", "url", "isInBlackList", "", "isInWhiteList", "isNeedIntercept", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40985a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f40986b = new i();

    /* renamed from: c  reason: collision with root package name */
    public static final a f40987c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final CopyOnWriteArrayList<String> f40988d = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private static final CopyOnWriteArrayList<String> f40989e = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/WebViewInterceptHelper$Companion;", "", "()V", "BLACK_LIST", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", "INSTANCE", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/WebViewInterceptHelper;", "WHITE_LIST", "get", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        @NotNull
        public static i a() {
            return i.f40986b;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private i() {
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            List bH = b2.bH();
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b3 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "SettingsReader.get()");
            List bG = b3.bG();
            if (!j.a((Collection<T>) bG)) {
                Intrinsics.checkExpressionValueIsNotNull(bG, "whiteList");
                if (PatchProxy.isSupport(new Object[]{bG}, this, f40985a, false, 34527, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bG}, this, f40985a, false, 34527, new Class[]{List.class}, Void.TYPE);
                } else if (!j.a((Collection<T>) bG)) {
                    f40988d.addAll(bG);
                }
            }
            if (!j.a((Collection<T>) bH)) {
                Intrinsics.checkExpressionValueIsNotNull(bH, "blackList");
                if (PatchProxy.isSupport(new Object[]{bH}, this, f40985a, false, 34526, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bH}, this, f40985a, false, 34526, new Class[]{List.class}, Void.TYPE);
                } else {
                    if (!j.a((Collection<T>) bH)) {
                        f40989e.addAll(bH);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private final boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f40985a, false, 34524, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f40985a, false, 34524, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!j.a((Collection<T>) f40988d)) {
            Iterator<String> it2 = f40988d.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "host");
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) next, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f40985a, false, 34525, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f40985a, false, 34525, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!j.a((Collection<T>) f40989e)) {
            Iterator<String> it2 = f40989e.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "host");
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) next, false, 2, (Object) null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f40985a, false, 34522, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f40985a, false, 34522, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "ref");
        CharSequence charSequence = str2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        if (StringsKt.contains$default(charSequence, (CharSequence) "https", false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) "http", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final WebResourceResponse a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f40985a, false, 34521, new Class[]{String.class, String.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f40985a, false, 34521, new Class[]{String.class, String.class}, WebResourceResponse.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "ref");
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.WEB_URL);
        if (!b(str, str2)) {
            return null;
        }
        return new f().a(str3, str4);
    }

    private final boolean b(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f40985a, false, 34523, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f40985a, false, 34523, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        CharSequence charSequence = str2;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence charSequence2 = str;
            if (!TextUtils.isEmpty(charSequence2)) {
                if ((!StringsKt.contains$default(charSequence2, (CharSequence) "https", false, 2, (Object) null) && !StringsKt.contains$default(charSequence2, (CharSequence) "http", false, 2, (Object) null)) || ((!StringsKt.contains$default(charSequence, (CharSequence) "http", false, 2, (Object) null) && !StringsKt.contains$default(charSequence, (CharSequence) "https", false, 2, (Object) null)) || StringsKt.contains$default(charSequence, (CharSequence) "/v1/list?rdn", false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) "google-analytics.com", false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) "cdn.polyfill.io", false, 2, (Object) null))) {
                    return false;
                }
                AbTestManager a2 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                if (!a2.p()) {
                    return false;
                }
                AbTestManager a3 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                if (a3.q()) {
                    if (StringsKt.contains$default(charSequence2, (CharSequence) "ttnet_intercept=0", false, 2, (Object) null)) {
                        return false;
                    }
                    return c(str);
                } else if (StringsKt.contains$default(charSequence2, (CharSequence) "ttnet_intercept=1", false, 2, (Object) null)) {
                    return true;
                } else {
                    return b(str);
                }
            }
        }
        return false;
    }
}
