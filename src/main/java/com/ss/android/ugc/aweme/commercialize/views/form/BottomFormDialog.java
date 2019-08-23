package com.ss.android.ugc.aweme.commercialize.views.form;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.sdk.activity.AbsBrowserFragment;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.views.AdCornerBrowserFragment;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public class BottomFormDialog extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2964a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f2965b;

    /* renamed from: c  reason: collision with root package name */
    public int f2966c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2967d;

    /* renamed from: e  reason: collision with root package name */
    private String f2968e;

    /* renamed from: f  reason: collision with root package name */
    private Long f2969f;
    private String g;
    private boolean h;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2964a, false, 33169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2964a, false, 33169, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialog", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialog", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2964a, false, 33170, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2964a, false, 33170, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialog", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f2964a, false, 33166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2964a, false, 33166, new Class[0], Void.TYPE);
            return;
        }
        View currentFocus = getCurrentFocus();
        b.a((Activity) this, currentFocus);
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        super.finish();
        overridePendingTransition(C0906R.anim.bo, C0906R.anim.bp);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2964a, false, 33163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2964a, false, 33163, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (!this.h) {
            if (this.f2966c == 8) {
                g.G(this, this.f2965b);
            } else if (this.f2966c == 2 || this.f2966c == 10) {
                g.K(this, this.f2965b);
            }
        }
        bg.d(this);
    }

    public void dismiss(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f2964a, false, 33165, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f2964a, false, 33165, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    @OnClick({2131494390})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f2964a, false, 33162, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f2964a, false, 33162, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.ai1) {
            finish();
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.commercialize.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2964a, false, 33168, new Class[]{com.ss.android.ugc.aweme.commercialize.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2964a, false, 33168, new Class[]{com.ss.android.ugc.aweme.commercialize.b.b.class}, Void.TYPE);
            return;
        }
        a.a((Context) k.a(), getString(C0906R.string.cgc)).a();
        this.h = true;
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2964a, false, 33167, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2964a, false, 33167, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putString(PushConstants.WEB_URL, this.f2968e);
        bundle.putLong("ad_id", this.f2969f.longValue());
        bundle.putString("bundle_download_app_log_extra", this.g);
        bundle.putSerializable("aweme_id", this.f2965b.getAid());
        bundle.putSerializable("click_from", Integer.valueOf(this.f2966c));
    }

    private void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2964a, false, 33164, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2964a, false, 33164, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.f2966c = bundle.getInt("click_from");
            this.f2968e = bundle.getString(PushConstants.WEB_URL);
            this.f2969f = Long.valueOf(bundle.getLong("ad_id"));
            this.g = bundle.getString("bundle_download_app_log_extra");
            String string = bundle.getString("aweme_id", "");
            if (j.a().a(string) != null) {
                this.f2965b = j.a().a(string);
            } else {
                this.f2965b = com.ss.android.ugc.aweme.feed.a.a().b(string);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2964a, false, 33160, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2964a, false, 33160, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialog", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.aj);
        bg.c(this);
        if (bundle != null || getIntent() == null) {
            a(bundle);
        } else {
            a(getIntent().getExtras());
        }
        if (PatchProxy.isSupport(new Object[0], this, f2964a, false, 33161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2964a, false, 33161, new Class[0], Void.TYPE);
        } else if (!TextUtils.isEmpty(this.f2968e)) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager != null) {
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                if (beginTransaction != null) {
                    AdCornerBrowserFragment adCornerBrowserFragment = new AdCornerBrowserFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(PushConstants.WEB_URL, this.f2968e);
                    bundle2.putLong("ad_id", this.f2969f.longValue());
                    bundle2.putString("bundle_download_app_log_extra", this.g);
                    bundle2.putBoolean("bundle_show_download_status_bar", false);
                    adCornerBrowserFragment.setArguments(bundle2);
                    adCornerBrowserFragment.f2548b = new AbsBrowserFragment.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f40087a;

                        public final void a() {
                        }

                        public final void b() {
                        }

                        public final void a(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40087a, false, 33171, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40087a, false, 33171, new Class[]{Integer.TYPE}, Void.TYPE);
                            } else if (BottomFormDialog.this.f2966c == 8) {
                                g.H(BottomFormDialog.this, BottomFormDialog.this.f2965b);
                            } else {
                                if (BottomFormDialog.this.f2966c == 2 || BottomFormDialog.this.f2966c == 10) {
                                    g.L(BottomFormDialog.this, BottomFormDialog.this.f2965b);
                                }
                            }
                        }

                        public final void a(WebResourceResponse webResourceResponse) {
                            if (PatchProxy.isSupport(new Object[]{webResourceResponse}, this, f40087a, false, 33172, new Class[]{WebResourceResponse.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{webResourceResponse}, this, f40087a, false, 33172, new Class[]{WebResourceResponse.class}, Void.TYPE);
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 21) {
                                a(webResourceResponse.getStatusCode());
                            }
                        }

                        @TargetApi(23)
                        public final void a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            if (PatchProxy.isSupport(new Object[]{webResourceRequest, webResourceError}, this, f40087a, false, 33174, new Class[]{WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{webResourceRequest, webResourceError}, this, f40087a, false, 33174, new Class[]{WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
                                return;
                            }
                            a(webResourceError.getErrorCode());
                        }

                        public final void a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            if (PatchProxy.isSupport(new Object[]{webResourceRequest, webResourceResponse}, this, f40087a, false, 33175, new Class[]{WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{webResourceRequest, webResourceResponse}, this, f40087a, false, 33175, new Class[]{WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE);
                            } else if (!BottomFormDialog.this.f2967d) {
                                if (BottomFormDialog.this.f2966c == 8) {
                                    g.H(BottomFormDialog.this, BottomFormDialog.this.f2965b);
                                    BottomFormDialog.this.f2967d = true;
                                    return;
                                }
                                if (BottomFormDialog.this.f2966c == 2 || BottomFormDialog.this.f2966c == 10) {
                                    g.L(BottomFormDialog.this, BottomFormDialog.this.f2965b);
                                    BottomFormDialog.this.f2967d = true;
                                }
                            }
                        }

                        public final void a(int i, String str, String str2) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, this, f40087a, false, 33173, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, this, f40087a, false, 33173, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
                                return;
                            }
                            a(i);
                        }
                    };
                    beginTransaction.replace(C0906R.id.n_, adCornerBrowserFragment, "BrowserFragment");
                    beginTransaction.commitAllowingStateLoss();
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialog", "onCreate", false);
    }
}
