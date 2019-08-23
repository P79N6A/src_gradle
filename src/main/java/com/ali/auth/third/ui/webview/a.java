package com.ali.auth.third.ui.webview;

import android.view.View;

public class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseWebViewActivity f5072a;

    a(BaseWebViewActivity baseWebViewActivity) {
        this.f5072a = baseWebViewActivity;
    }

    public void onClick(View view) {
        this.f5072a.onBackHistory();
    }
}
