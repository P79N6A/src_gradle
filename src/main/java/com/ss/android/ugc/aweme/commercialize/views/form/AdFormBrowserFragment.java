package com.ss.android.ugc.aweme.commercialize.views.form;

import a.i;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.ui.webview.SSWebView;
import com.ss.android.sdk.activity.AbsBrowserFragment;
import com.ss.android.sdk.activity.IESBrowserFragment;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.b.b;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.c;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class AdFormBrowserFragment extends IESBrowserFragment implements View.OnClickListener {
    public static ChangeQuickRedirect ah = null;
    public static final String ai = "AdFormBrowserFragment";
    public TextView aj;
    public TextView ak;
    SSWebView al;
    public boolean am;
    public c an;
    public boolean ao;
    public boolean ap = true;
    private Aweme aq;
    private boolean ar;
    private View as;
    private e at;
    private boolean au;

    public final int a() {
        return C0906R.layout.o0;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 33118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 33118, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 33115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 33115, new Class[0], Void.TYPE);
            return;
        }
        if (!this.ao && !this.au) {
            g.b(getContext(), this.aq, (Map<String, String>) null);
            g.J(getContext(), this.aq);
            this.au = true;
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 33120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 33120, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        bg.d(this);
        getActivity().getWindow().setSoftInputMode(18);
        if (this.an != null && !this.ao) {
            this.an.a(this.ar);
        }
    }

    @Subscribe
    public void onEvent(AbsAdCardAction.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, ah, false, 33123, new Class[]{AbsAdCardAction.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, ah, false, 33123, new Class[]{AbsAdCardAction.b.class}, Void.TYPE);
            return;
        }
        if (this.an != null) {
            this.an.c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, ah, false, 33117, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, ah, false, 33117, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.al.setBackgroundColor(0);
        if (this.ap && b() != null) {
            String str = b().getSettings().getUserAgentString() + "/RevealType/Dialog";
            if (!StringUtils.isEmpty(str)) {
                b().getSettings().setUserAgentString(str);
            }
        }
        this.al.setCanTouch(true);
    }

    @Subscribe
    public void onEvent(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, ah, false, 33121, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, ah, false, 33121, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            a.a((Context) getActivity(), getString(C0906R.string.cgc)).a();
        }
        this.ar = true;
        if (this.an != null) {
            this.an.c();
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ah, false, 33116, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ah, false, 33116, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.acq) {
            if (PatchProxy.isSupport(new Object[]{3}, this, ah, false, 33119, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{3}, this, ah, false, 33119, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                this.at.a(3);
                if (!this.at.c() || !com.ss.android.ugc.aweme.commercialize.utils.g.b(getContext(), this.aq)) {
                    com.ss.android.ugc.aweme.commercialize.utils.g.c(getContext(), this.aq);
                }
            }
            if (this.an != null) {
                this.an.c();
            }
        } else if (id == C0906R.id.ai0) {
            g.o(getContext(), this.aq);
            if (this.an != null) {
                this.an.c();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, ah, false, 33111, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, ah, false, 33111, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        String string = getArguments().getString("aweme_id");
        if (j.a().a(string) != null) {
            this.aq = j.a().a(string);
        } else {
            this.aq = com.ss.android.ugc.aweme.feed.a.a().b(string);
        }
        getActivity().getWindow().setSoftInputMode(32);
        this.at = new e();
        this.at.a(getContext(), this.aq);
        bg.c(this);
    }

    @Subscribe
    public void onEvent(AbsAdCardAction.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, ah, false, 33122, new Class[]{AbsAdCardAction.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, ah, false, 33122, new Class[]{AbsAdCardAction.d.class}, Void.TYPE);
            return;
        }
        if (this.an != null) {
            switch (dVar.f40018a) {
                case 0:
                    this.an.b();
                    break;
                case 1:
                    this.an.a();
                    this.al.setVisibility(0);
                    f();
                    return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, ah, false, 33113, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, ah, false, 33113, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.aj = (TextView) view.findViewById(C0906R.id.acs);
        this.ak = (TextView) view.findViewById(C0906R.id.acq);
        this.al = (SSWebView) view.findViewById(C0906R.id.cu3);
        this.al.setOnFocusChangeListener(new a(this));
        this.as = view.findViewById(C0906R.id.ai0);
        this.as.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        c.a(this.aj);
        c.a(this.ak);
        this.f2548b = new AbsBrowserFragment.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40074a;

            public final void a() {
            }

            public final void a(WebResourceResponse webResourceResponse) {
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f40074a, false, 33126, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40074a, false, 33126, new Class[0], Void.TYPE);
                    return;
                }
                AdFormBrowserFragment.this.ak.setVisibility(0);
                AdFormBrowserFragment.this.aj.setVisibility(0);
                if (AdFormBrowserFragment.this.an != null && AdFormBrowserFragment.this.ap) {
                    AdFormBrowserFragment adFormBrowserFragment = AdFormBrowserFragment.this;
                    if (PatchProxy.isSupport(new Object[0], adFormBrowserFragment, AdFormBrowserFragment.ah, false, 33114, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], adFormBrowserFragment, AdFormBrowserFragment.ah, false, 33114, new Class[0], Void.TYPE);
                    } else {
                        adFormBrowserFragment.al.loadUrl("javascript:(function extra(){" + "var aa =document.createElement(\"link\");aa.type='text/css'; aa.rel='stylesheet'; aa.href='https://s3b.bytecdn.cn/ies/static/style/douyin/form.css?=12344567771';document.getElementsByTagName(\"head\")[0].appendChild(aa);" + "})();");
                        i.a(3000).a((a.g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(adFormBrowserFragment), i.f1052b);
                    }
                    AdFormBrowserFragment.this.an.a();
                }
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40074a, false, 33127, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40074a, false, 33127, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (AdFormBrowserFragment.this.an != null) {
                    AdFormBrowserFragment.this.an.b();
                    AdFormBrowserFragment.this.ao = true;
                }
            }

            @TargetApi(23)
            public final void a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (PatchProxy.isSupport(new Object[]{webResourceRequest, webResourceError}, this, f40074a, false, 33129, new Class[]{WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webResourceRequest, webResourceError}, this, f40074a, false, 33129, new Class[]{WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
                    return;
                }
                a(webResourceError.getErrorCode());
            }

            @TargetApi(23)
            public final void a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (PatchProxy.isSupport(new Object[]{webResourceRequest, webResourceResponse}, this, f40074a, false, 33130, new Class[]{WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webResourceRequest, webResourceResponse}, this, f40074a, false, 33130, new Class[]{WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE);
                    return;
                }
                if (AdFormBrowserFragment.this.an != null && !AdFormBrowserFragment.this.am) {
                    AdFormBrowserFragment.this.an.b();
                    AdFormBrowserFragment.this.am = true;
                    AdFormBrowserFragment.this.ao = true;
                }
            }

            public final void a(int i, String str, String str2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, this, f40074a, false, 33128, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, this, f40074a, false, 33128, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
                    return;
                }
                a(i);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, ah, false, 33112, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, ah, false, 33112, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
