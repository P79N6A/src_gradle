package com.ss.android.ugc.aweme.commercialize;

import a.g;
import a.i;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.ui.webview.SSWebView;
import com.ss.android.sdk.activity.IESBrowserFragment;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.commercialize.c.d;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.utils.a;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class EasterEggFragment extends IESBrowserFragment implements View.OnClickListener, f {
    public static ChangeQuickRedirect ah;
    k ai;
    public boolean aj;
    long ak;
    public boolean al;
    private SSWebView am;
    private ImageView an;
    private View ao;
    private AnimatedImageView ap;
    private d aq;

    public final int a() {
        return C0906R.layout.nl;
    }

    public final void a(boolean z) {
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30318, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 30318, new Class[0], Void.TYPE);
            return;
        }
        c("load_fail");
        i();
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30320, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 30320, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 30321, new Class[0], Void.TYPE);
            return;
        }
        h();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 30322, new Class[0], Void.TYPE);
            return;
        }
        if (!this.aj && !this.aq.f38533c && !this.al) {
            this.aj = true;
            this.am.setVisibility(0);
            f();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 30314, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (Build.VERSION.SDK_INT >= 17) {
            this.am.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 30316, new Class[0], Void.TYPE);
            return;
        }
        r.a("show_egg_ad", (Map) g());
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 30323, new Class[0], Void.TYPE);
            return;
        }
        i.a(7000).a((g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(this), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public HashMap<String, String> g() {
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30317, new Class[0], HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[0], this, ah, false, 30317, new Class[0], HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", this.ai.getEnterFrom());
        hashMap.put("search_keyword", this.ai.getKeyWords());
        hashMap.put("egg_ad_id", c.c(this.ai.getEasterEggInfo()));
        return hashMap;
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, ah, false, 30324, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, ah, false, 30324, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.am.setBackgroundColor(0);
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, ah, false, 30325, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, ah, false, 30325, new Class[]{String.class}, Void.TYPE);
        } else if (!this.al && !this.aj) {
            this.al = true;
            HashMap<String, String> g = g();
            g.put("fail_type", str);
            r.a("show_egg_ad_fail", (Map) g);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, ah, false, 30312, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, ah, false, 30312, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.ai = (k) getArguments().getSerializable("pageParams");
        }
        this.aq = new d(this, false);
        this.f2548b = this.aq;
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ah, false, 30319, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ah, false, 30319, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.ts) {
            i();
            HashMap<String, String> g = g();
            g.put("disappear_method", "click_close_button");
            g.put("duration", String.valueOf(System.currentTimeMillis() - this.ak));
            if (this.ai != null) {
                g.put("enter_from", this.ai.getEnterFrom());
                g.put("egg_ad_id", this.ai.getEasterEggInfo().getId());
            }
            r.a("egg_ad_disappear", (Map) g);
            return;
        }
        if (id == C0906R.id.a9a && this.ai != null) {
            com.ss.android.ugc.aweme.commercialize.model.i easterEggInfo = this.ai.getEasterEggInfo();
            com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), c.g(easterEggInfo), c.f(easterEggInfo), c.h(easterEggInfo));
            HashMap<String, String> g2 = g();
            g2.put("enter_from", this.ai.getEnterFrom());
            g2.put("egg_ad_id", this.ai.getEasterEggInfo().getId());
            g2.put("duration", String.valueOf(System.currentTimeMillis() - this.ak));
            g2.put("enter_method", "click_carton");
            r.a("click_egg_ad", (Map) g2);
            i();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, ah, false, 30313, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, ah, false, 30313, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.am = (SSWebView) view.findViewById(C0906R.id.cu3);
        this.an = (ImageView) view.findViewById(C0906R.id.ts);
        this.ap = (AnimatedImageView) view.findViewById(C0906R.id.a8b);
        this.an.setOnClickListener(this);
        com.ss.android.ugc.aweme.utils.c.a(this.an);
        this.ao = view.findViewById(C0906R.id.a9a);
        this.ao.setOnClickListener(this);
        if (PatchProxy.isSupport(new Object[0], this, ah, false, 30315, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ah, false, 30315, new Class[0], Void.TYPE);
        } else if (this.ai != null) {
            String a2 = c.a(this.ai.getEasterEggInfo());
            if (!c.b(this.ai.getEasterEggInfo())) {
                h();
            } else if (TextUtils.equals(a2, "web")) {
                this.am.setVisibility(4);
            } else if (TextUtils.equals(a2, "gif") || TextUtils.equals(a2, "webp")) {
                UrlModel e2 = c.e(this.ai.getEasterEggInfo());
                if (!c.a(e2)) {
                    h();
                } else {
                    this.ap.setVisibility(0);
                    e.a(this.ap, e2, true, new a(true, this.ap) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f38416a;

                        public final void onFailure(String str, Throwable th) {
                            if (PatchProxy.isSupport(new Object[]{str, th}, this, f38416a, false, 30329, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str, th}, this, f38416a, false, 30329, new Class[]{String.class, Throwable.class}, Void.TYPE);
                                return;
                            }
                            super.onFailure(str, th);
                            EasterEggFragment.this.h();
                        }

                        /* renamed from: a */
                        public final void onFinalImageSet(String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
                            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f38416a, false, 30328, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f38416a, false, 30328, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                                return;
                            }
                            super.onFinalImageSet(str, imageInfo, animatable);
                            if (!EasterEggFragment.this.al) {
                                EasterEggFragment.this.aj = true;
                                EasterEggFragment.this.f();
                            }
                        }
                    });
                }
            }
        }
        this.ak = System.currentTimeMillis();
        i.a((long) (AbTestManager.a().ba() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)).a((g<TResult, TContinuationResult>) new i<TResult,TContinuationResult>(this), i.f1052b);
    }
}
