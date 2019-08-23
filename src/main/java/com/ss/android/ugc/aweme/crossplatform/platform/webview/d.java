package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.view.View;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IWebChromeStatus;", "", "onHideCustomView", "", "onShowCustomView", "view", "Landroid/view/View;", "callback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface d {
    void a();

    void a(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback customViewCallback);
}
