package com.ss.android.ugc.aweme.music.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.lancet.c;

public class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56683a;

    /* renamed from: b  reason: collision with root package name */
    public a f56684b;

    /* renamed from: c  reason: collision with root package name */
    private View f56685c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56688a;

        /* renamed from: b  reason: collision with root package name */
        public String f56689b;

        /* renamed from: c  reason: collision with root package name */
        public String f56690c;
    }

    public b(Context context) {
        super(context, C0906R.style.ti);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f56683a, false, 60550, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f56683a, false, 60550, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        getWindow().addFlags(67108864);
        getWindow().requestFeature(1);
        try {
            setContentView(C0906R.layout.ac6);
        } catch (Resources.NotFoundException unused) {
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        TextView textView = (TextView) findViewById(C0906R.id.title);
        if (!TextUtils.isEmpty(this.f56684b.f56690c)) {
            textView.setText(this.f56684b.f56690c);
        } else {
            textView.setText(C0906R.string.jy);
        }
        View findViewById = findViewById(C0906R.id.ix);
        this.f56685c = findViewById(C0906R.id.cv0);
        findViewById.setOnClickListener(new c(this));
        WebView webView = (WebView) findViewById(C0906R.id.dx6);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56686a;

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (PatchProxy.isSupport(new Object[]{webView, str}, this, f56686a, false, 60554, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str}, this, f56686a, false, 60554, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
                }
                Uri parse = Uri.parse(str);
                String lowerCase = parse.getScheme().toLowerCase();
                if (parse == null || !"market".equals(lowerCase)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addFlags(268435456);
                webView.getContext().startActivity(intent);
                return true;
            }
        });
        String str = this.f56684b.f56689b;
        if (PatchProxy.isSupport(new Object[]{webView, str}, null, e.f56695a, true, 60556, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, null, e.f56695a, true, 60556, new Class[]{WebView.class, String.class}, Void.TYPE);
        } else {
            c.a(str);
            webView.loadUrl(str);
        }
        ((Button) findViewById(C0906R.id.buf)).setOnClickListener(new d(this));
        if (PatchProxy.isSupport(new Object[0], this, f56683a, false, 60551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56683a, false, 60551, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f56685c.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getContext());
        }
    }
}
