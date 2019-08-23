package com.ss.android.ugc.aweme.base.component;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.lancet.c;

public class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34702a;

    /* renamed from: b  reason: collision with root package name */
    public C0446a f34703b;

    /* renamed from: c  reason: collision with root package name */
    private View f34704c;

    /* renamed from: com.ss.android.ugc.aweme.base.component.a$a  reason: collision with other inner class name */
    public static class C0446a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34709a;

        /* renamed from: b  reason: collision with root package name */
        public String f34710b;
    }

    public a(Context context) {
        super(context, C0906R.style.ti);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f34702a, false, 24549, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f34702a, false, 24549, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        getWindow().addFlags(67108864);
        setContentView(C0906R.layout.ac6);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        ((TextView) findViewById(C0906R.id.title)).setText(C0906R.string.b9);
        View findViewById = findViewById(C0906R.id.ix);
        this.f34704c = findViewById(C0906R.id.cv0);
        findViewById.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34705a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f34705a, false, 24551, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f34705a, false, 24551, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                a.this.hide();
            }
        });
        WebView webView = (WebView) findViewById(C0906R.id.dx6);
        String str = this.f34703b.f34710b;
        if (PatchProxy.isSupport(new Object[]{webView, str}, null, b.f34711a, true, 24554, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, null, b.f34711a, true, 24554, new Class[]{WebView.class, String.class}, Void.TYPE);
        } else {
            c.a(str);
            webView.loadUrl(str);
        }
        Button button = (Button) findViewById(C0906R.id.buf);
        button.setVisibility(8);
        button.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34707a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f34707a, false, 24552, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f34707a, false, 24552, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                a.this.hide();
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f34702a, false, 24550, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34702a, false, 24550, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f34704c.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getContext());
        }
    }
}
