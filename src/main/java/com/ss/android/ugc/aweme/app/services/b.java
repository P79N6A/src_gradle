package com.ss.android.ugc.aweme.app.services;

import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J&\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/AccountHelperService;", "Lcom/ss/android/ugc/aweme/main/service/IAccountHelperService;", "()V", "AppsFlyerUtilsTrackLoginSuccess", "", "platform", "", "appendCommonParams", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "friendUploadToken", "accessToken", "secret", "getLoginViewBanner", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getLoginViewTitleForMoneyGrowth", "getUserApi", "loadWebViewUrl", "url", "webView", "Landroid/webkit/WebView;", "recommendAppUponAuth", "context", "Landroid/content/Context;", "platformName", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.ss.android.ugc.aweme.main.h.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34272a;

    public final void a(@NotNull StringBuilder sb) {
        StringBuilder sb2 = sb;
        if (PatchProxy.isSupport(new Object[]{sb2}, this, f34272a, false, 23579, new Class[]{StringBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sb2}, this, f34272a, false, 23579, new Class[]{StringBuilder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(sb2, "sb");
        e.a(sb);
    }

    public final void a(@Nullable String str, @Nullable WebView webView) {
        if (PatchProxy.isSupport(new Object[]{str, webView}, this, f34272a, false, 23581, new Class[]{String.class, WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, webView}, this, f34272a, false, 23581, new Class[]{String.class, WebView.class}, Void.TYPE);
            return;
        }
        e.a(str, webView);
    }
}
