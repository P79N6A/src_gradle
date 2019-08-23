package com.bytedance.android.livesdk.browser.fragment;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.bytedance.android.live.b.b;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.browser.jsbridge.a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.i;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.z;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.f.b.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.lang.ref.WeakReference;
import org.aspectj.lang.a;
import org.json.JSONObject;

public class WebDialogFragment extends BaseDialogFragment implements TTLiveBrowserFragment.a, TTLiveBrowserFragment.d, a {
    private static final /* synthetic */ a.C0900a E;

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f9368e;
    private View A;
    private boolean B;
    private long C;
    private long D;

    /* renamed from: f  reason: collision with root package name */
    public String f9369f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public TTLiveBrowserFragment q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public b w;
    public String x;
    private View y;
    private View z;

    public final void c() {
        this.B = true;
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f9368e, false, 3575, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f9368e, false, 3575, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        setCancelable(z2);
        getDialog().setCanceledOnTouchOutside(z2);
    }

    public final void a(com.bytedance.android.livesdk.browser.jsbridge.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f9368e, false, 3589, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f9368e, false, 3589, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.b.class}, Void.TYPE);
            return;
        }
        bVar.a().a("close", (d<?, ?>) new i<Object,Object>((DialogFragment) this));
        bVar.a().a("setHotsoon", (d<?, ?>) new z<Object,Object>(this));
        bVar.c().a("open_live", (com.bytedance.ies.f.a.d) new com.bytedance.android.livesdk.browser.jsbridge.c.a.a(new WeakReference(getActivity()), this));
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f9368e, false, 3590, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f9368e, false, 3590, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.a(str, jSONObject);
        }
    }

    private boolean d() {
        if (this.g == 0 && this.h == 0) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9368e, false, 3587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9368e, false, 3587, new Class[0], Void.TYPE);
            return;
        }
        this.D = System.currentTimeMillis();
        this.B = false;
        if (this.f8340c) {
            this.y.setVisibility(8);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f9368e, false, 3571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9368e, false, 3571, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        j.q().f().b((DialogFragment) this);
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f9368e, true, 3591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f9368e, true, 3591, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("WebDialogFragment.java", WebDialogFragment.class);
        E = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onCreate", "com.bytedance.android.livesdk.browser.fragment.WebDialogFragment", "android.os.Bundle", "savedInstanceState", "", "void"), 108);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9368e, false, 3588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9368e, false, 3588, new Class[0], Void.TYPE);
        } else if (this.f8340c) {
            if (this.B || (this.q.y != null && TextUtils.equals(this.q.y.getUrl(), "about:blank"))) {
                this.y.setVisibility(0);
            } else {
                this.y.setVisibility(8);
            }
            if (this.r) {
                if (this.j > 0) {
                    a(this.j);
                    return;
                }
                a(this.k, this.l, this.m, this.n);
            }
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f9368e, false, 3576, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f9368e, false, 3576, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (ac.a() == null || ac.a().getConfiguration().orientation != 2) {
                attributes.windowAnimations = C0906R.style.ww;
            } else {
                attributes.windowAnimations = C0906R.style.wv;
            }
            window.setAttributes(attributes);
            if (!this.u) {
                window.setDimAmount(0.0f);
            }
        }
        return onCreateDialog;
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f9368e, false, 3578, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f9368e, false, 3578, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (getDialog() != null) {
            a(getDialog(), this.g, this.h, this.i);
            if (this.j != 0) {
                a(this.j);
            } else {
                a(this.k, this.l, this.n, this.m);
            }
            Window window = getDialog().getWindow();
            if (window != null) {
                window.setLayout(ac.a((float) this.g), ac.a((float) this.h));
                if (d()) {
                    window.addFlags(32);
                    window.getAttributes().dimAmount = 0.0f;
                }
                window.setFlags(1024, 1024);
            }
        }
    }

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9368e, false, 3580, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9368e, false, 3580, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.q == null || this.q.y == null)) {
            WebView webView = this.q.y;
            if (webView instanceof RoundRectWebView) {
                int a2 = ac.a((float) i2);
                ((RoundRectWebView) webView).setRadius((float) a2);
                this.q.a(a2, a2);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f9368e, false, 3570, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f9368e, false, 3570, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        org.aspectj.lang.a a2 = org.aspectj.a.a.b.a(E, this, this, bundle);
        try {
            super.onCreate(bundle);
            setStyle(1, C0906R.style.vb);
            if (getActivity().getRequestedOrientation() == 0) {
                if (!this.s) {
                    this.o = 8;
                    this.j = 8;
                    this.h = (int) ac.e(ac.b() - (this.o * 2));
                    this.g = c.f69428f;
                }
                if (!this.t) {
                    this.i = 8388693;
                }
            }
            if (this.g <= 0) {
                this.g = c.f69428f;
            }
            if (this.h <= 0) {
                this.h = 400;
            }
            if (this.r) {
                this.h += 48;
            }
            if (this.j < 0) {
                this.j = 0;
            }
            if (this.k < 0) {
                this.k = 0;
            }
            if (this.l < 0) {
                this.l = 0;
            }
            if (this.n < 0) {
                this.n = 0;
            }
            if (this.m < 0) {
                this.m = 0;
            }
            if (this.i == 17) {
                if (((float) UIUtils.getScreenWidth(getContext())) < UIUtils.dip2Px(getContext(), 319.0f) || this.g > UIUtils.px2dip(getContext(), (float) UIUtils.getScreenWidth(getContext())) - 20) {
                    this.g = UIUtils.px2dip(getContext(), (float) UIUtils.getScreenWidth(getContext())) - 20;
                }
                if (((float) UIUtils.getScreenHeight(getContext())) < UIUtils.dip2Px(getContext(), 539.0f) || this.h > UIUtils.px2dip(getContext(), (float) UIUtils.getScreenHeight(getContext())) - 40) {
                    this.h = UIUtils.px2dip(getContext(), (float) UIUtils.getScreenHeight(getContext())) - 40;
                }
            }
            j.q().f().a((DialogFragment) this);
        } finally {
            com.bytedance.android.livesdk.a.a.a().c(a2);
        }
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9368e, false, 3583, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9368e, false, 3583, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.z.getLayoutParams();
        layoutParams.width = ac.a((float) i2);
        layoutParams.height = ac.a((float) i3);
        this.z.setLayoutParams(layoutParams);
        this.z.requestLayout();
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TTLiveBrowserFragment tTLiveBrowserFragment;
        Bundle bundle2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f9368e, false, 3577, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f9368e, false, 3577, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.C = System.currentTimeMillis();
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aeo, viewGroup2, false);
        this.y = inflate.findViewById(C0906R.id.cdx);
        this.z = inflate.findViewById(C0906R.id.dwx);
        this.A = inflate.findViewById(C0906R.id.az_);
        if (!d()) {
            a(true);
        } else {
            getDialog().hide();
        }
        ViewGroup.LayoutParams layoutParams = this.z.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(ac.a((float) this.o), ac.a((float) this.o), ac.a((float) this.o), ac.a((float) this.o));
        this.z.setLayoutParams(marginLayoutParams);
        if (PatchProxy.isSupport(new Object[0], this, f9368e, false, 3586, new Class[0], TTLiveBrowserFragment.class)) {
            tTLiveBrowserFragment = (TTLiveBrowserFragment) PatchProxy.accessDispatch(new Object[0], this, f9368e, false, 3586, new Class[0], TTLiveBrowserFragment.class);
        } else {
            tTLiveBrowserFragment = new TTLiveBrowserFragment();
            tTLiveBrowserFragment.f9358b = this.p;
            tTLiveBrowserFragment.n = this;
            tTLiveBrowserFragment.o = this.w;
            tTLiveBrowserFragment.a(this.x);
        }
        this.q = tTLiveBrowserFragment;
        TTLiveBrowserFragment tTLiveBrowserFragment2 = this.q;
        if (PatchProxy.isSupport(new Object[0], this, f9368e, false, 3584, new Class[0], Bundle.class)) {
            bundle2 = (Bundle) PatchProxy.accessDispatch(new Object[0], this, f9368e, false, 3584, new Class[0], Bundle.class);
        } else {
            bundle2 = new Bundle();
            bundle2.putString(PushConstants.WEB_URL, this.f9369f);
            bundle2.putBoolean("bundle_user_webview_title", false);
            bundle2.putBoolean("hide_nav_bar", true);
            if (this.v != -1) {
                bundle2.putInt("bundle_web_view_background_color", this.v);
            }
        }
        tTLiveBrowserFragment2.setArguments(bundle2);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(C0906R.id.dwx, this.q);
        beginTransaction.commitAllowingStateLoss();
        this.q.l = this;
        this.y.setOnClickListener(new n(this));
        inflate.post(new o(this));
        if (this.r) {
            this.A.setVisibility(0);
            this.A.setOnClickListener(new p(this));
        }
        return inflate;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f9368e, false, 3581, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f9368e, false, 3581, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.q == null || this.q.y == null)) {
            WebView webView = this.q.y;
            if (webView instanceof RoundRectWebView) {
                float f2 = (float) i2;
                float f3 = (float) i3;
                ((RoundRectWebView) webView).setRadius((float) ac.a(f2), (float) ac.a(f3), (float) ac.a((float) i4), (float) ac.a((float) i5));
                this.q.a(ac.a(f2), ac.a(f3));
            }
        }
    }

    public void a(Dialog dialog, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{dialog, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f9368e, false, 3579, new Class[]{Dialog.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f9368e, false, 3579, new Class[]{Dialog.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(dialog, i2, i3, i4, false);
    }

    private void a(Dialog dialog, int i2, int i3, int i4, boolean z2) {
        int i5 = i2;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{dialog, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), (byte) 0}, this, f9368e, false, 3582, new Class[]{Dialog.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {dialog, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), (byte) 0};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f9368e, false, 3582, new Class[]{Dialog.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = i4;
                attributes.width = ac.a((float) i5);
                attributes.height = ac.a((float) i6);
                window.setAttributes(attributes);
                a(i5, i6);
            }
        }
    }
}
