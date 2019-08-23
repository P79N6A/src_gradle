package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.commercialize.c.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0005H&J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\u0005H&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/cards/IAdHalfWebPageFragment;", "", "enableScrollWebViewInside", "", "enable", "", "enableTouchWebViewInside", "getFragment", "Landroid/support/v4/app/Fragment;", "getWebView", "Landroid/webkit/WebView;", "initAdHalfPageLoadListener", "simplePageLoadListener", "Lcom/ss/android/ugc/aweme/commercialize/listener/SimplePageLoadListener;", "initCloseBtnRes", "closeBtnRes", "", "initHalfWebPageAction", "halfWebPageAction", "Lcom/ss/android/ugc/aweme/commercialize/views/cards/IHalfWebPageAction;", "loadSuccess", "loadUrl", "url", "", "renderSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface j {
    void a(@NotNull f fVar);

    void a(@NotNull k kVar);

    void a(@Nullable String str);

    void a(boolean z);

    @NotNull
    WebView b();

    void b(@IdRes int i);

    void b(boolean z);

    @NotNull
    Fragment f();

    boolean g();

    boolean h();
}
