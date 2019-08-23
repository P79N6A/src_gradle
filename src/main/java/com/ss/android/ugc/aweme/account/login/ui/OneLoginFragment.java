package com.ss.android.ugc.aweme.account.login.ui;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.sdk.account.api.c.e;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.i.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.login.c;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.w;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class OneLoginFragment extends BaseFragment implements u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32488a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f32489b = a.a();

    /* renamed from: c  reason: collision with root package name */
    OneLoginPhoneBean f32490c;

    /* renamed from: d  reason: collision with root package name */
    String f32491d;

    /* renamed from: e  reason: collision with root package name */
    String f32492e;

    /* renamed from: f  reason: collision with root package name */
    public PhonePassLoginView f32493f;
    com.ss.android.ugc.aweme.account.login.c.a g;
    b h;
    private TextView i;
    private TextView p;
    private d q;
    private View.OnClickListener r = new p(this);

    public final com.ss.android.mobilelib.b.a c() {
        return null;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32488a, false, 20642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32488a, false, 20642, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        try {
            if (isViewValid()) {
                if (getActivity() != null) {
                    this.f32493f.a();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32488a, false, 20643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32488a, false, 20643, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (isViewValid()) {
                if (getActivity() != null) {
                    this.f32493f.b();
                }
            }
        } catch (Exception unused) {
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f32488a, false, 20636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32488a, false, 20636, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        w.a(6, 1, "");
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f32488a, false, 20637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32488a, false, 20637, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        w.a(6, 4, "");
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32488a, false, 20639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32488a, false, 20639, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.h != null) {
            this.h.b();
        }
        if (this.g != null) {
            com.ss.android.ugc.aweme.account.login.c.a aVar = this.g;
            aVar.f22498b = true;
            if (aVar.f22499c != null) {
                aVar.f22499c.a();
            }
            this.g = null;
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f32488a, false, 20638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32488a, false, 20638, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        r.a("one_click_login_back", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", this.n).a("carrier", this.f32490c.getFromMobLabel()).f31599b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        if (r4.equals("mobile") != false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle d() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f32488a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            r4 = 0
            r5 = 20641(0x50a1, float:2.8924E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f32488a
            r5 = 0
            r6 = 20641(0x50a1, float:2.8924E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.os.Bundle> r8 = android.os.Bundle.class
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
        L_0x0026:
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r11.getArguments()
            r1.<init>(r2)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "mobile"
            r1.putString(r2, r3)
            java.lang.String r2 = "login_path"
            java.lang.String r3 = "one_login"
            r1.putString(r2, r3)
            java.lang.String r2 = "carrier_type"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f32488a
            r6 = 0
            r7 = 20640(0x50a0, float:2.8923E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = r11
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0064
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f32488a
            r7 = 0
            r8 = 20640(0x50a0, float:2.8923E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00b3
        L_0x0064:
            java.lang.String r3 = r11.f32492e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x006f
            java.lang.String r0 = ""
            goto L_0x00b3
        L_0x006f:
            java.lang.String r3 = ""
            java.lang.String r4 = r11.f32492e
            r5 = -1
            int r6 = r4.hashCode()
            r7 = -1429363305(0xffffffffaacda597, float:-3.6530216E-13)
            if (r6 == r7) goto L_0x009b
            r7 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r6 == r7) goto L_0x0092
            r0 = -840542575(0xffffffffcde65691, float:-4.83054112E8)
            if (r6 == r0) goto L_0x0088
            goto L_0x00a5
        L_0x0088:
            java.lang.String r0 = "unicom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 2
            goto L_0x00a6
        L_0x0092:
            java.lang.String r6 = "mobile"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x009b:
            java.lang.String r0 = "telecom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 1
            goto L_0x00a6
        L_0x00a5:
            r0 = -1
        L_0x00a6:
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00ab;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            r0 = r3
            goto L_0x00b3
        L_0x00ab:
            java.lang.String r0 = "ChinaUnicom"
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r0 = "ChinaTelecom"
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r0 = "ChinaMobile"
        L_0x00b3:
            r1.putString(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.OneLoginFragment.d():android.os.Bundle");
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32488a, false, 20633, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32488a, false, 20633, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f32490c = (OneLoginPhoneBean) arguments.getSerializable("one_login_phone");
            if (this.f32490c != null) {
                this.f32491d = this.f32490c.getMobile();
                this.f32492e = this.f32490c.getFrom();
            } else {
                this.f32490c = new OneLoginPhoneBean();
            }
        }
        this.g = new com.ss.android.ugc.aweme.account.login.c.a(getContext(), this.f32490c, this.n) {
            public static ChangeQuickRedirect h;

            public final void a(e eVar) {
                if (PatchProxy.isSupport(new Object[]{eVar}, this, h, false, 20646, new Class[]{e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar}, this, h, false, 20646, new Class[]{e.class}, Void.TYPE);
                    return;
                }
                super.a(eVar);
                if (eVar.f22248c != null) {
                    if (OneLoginFragment.this.getActivity() != null) {
                        if (OneLoginFragment.this.getActivity() instanceof c) {
                            ((c) OneLoginFragment.this.getActivity()).a(true);
                        }
                        ((com.ss.android.ugc.aweme.account.login.b) OneLoginFragment.this.getActivity()).a(OneLoginFragment.this.d());
                    }
                    if (OneLoginFragment.this.f32493f != null) {
                        OneLoginFragment.this.f32493f.a();
                    }
                    n.d(true);
                }
            }

            public final void d(@NotNull com.bytedance.sdk.account.i.b.b bVar) {
                if (PatchProxy.isSupport(new Object[]{bVar}, this, h, false, 20648, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, h, false, 20648, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE);
                    return;
                }
                super.d(bVar);
                com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.account.util.e.a(OneLoginFragment.this.getContext()), (int) C0906R.string.bk0).a();
                if (OneLoginFragment.this.l() != null) {
                    OneLoginFragment.this.l().c(i.a(LoginOrRegisterFragment.class, OneLoginFragment.this.getArguments()).a("from_one_login", true).a(), false);
                }
            }

            public final void c(@NotNull com.bytedance.sdk.account.i.b.b bVar) {
                int i2;
                com.ss.android.ugc.aweme.account.login.b bVar2;
                com.bytedance.sdk.account.i.b.b bVar3 = bVar;
                if (PatchProxy.isSupport(new Object[]{bVar3}, this, h, false, 20647, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar3}, this, h, false, 20647, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE);
                    return;
                }
                super.c(bVar);
                try {
                    i2 = Integer.valueOf(bVar3.f22434a).intValue();
                } catch (Exception unused) {
                    i2 = 0;
                }
                if (OneLoginFragment.this.isViewValid()) {
                    if (OneLoginFragment.this.getActivity() instanceof c) {
                        ((c) OneLoginFragment.this.getActivity()).a(false);
                    }
                    if (i2 != 1075) {
                        if (com.ss.android.ugc.aweme.account.util.d.f33086b.contains(Integer.valueOf(i2))) {
                            if (OneLoginFragment.this.getActivity() != null) {
                                com.bytedance.ies.dmt.ui.d.a.b(OneLoginFragment.this.getActivity().getApplicationContext(), (int) C0906R.string.dqv).a();
                                OneLoginFragment.this.getActivity().finish();
                            }
                        } else if (i2 == 2003 || i2 == 2004) {
                            AlertDialog.Builder a2 = p.a(OneLoginFragment.this.getContext());
                            a2.setMessage((CharSequence) bVar3.f22435b);
                            a2.setPositiveButton((int) C0906R.string.do4, r.f32644b);
                            a2.setNegativeButton((int) C0906R.string.pm, s.f32646b);
                            a2.show();
                        }
                        w.a(4, 3, (Object) bVar3.f22435b);
                        com.bytedance.ies.dmt.ui.d.a.c(OneLoginFragment.this.getContext(), (int) C0906R.string.bk0).a();
                        if (OneLoginFragment.this.l() != null) {
                            OneLoginFragment.this.l().c(i.a(LoginOrRegisterFragment.class, OneLoginFragment.this.getArguments()).a("from_one_login", true).a(), false);
                        }
                    } else if (bVar3 instanceof com.bytedance.sdk.account.i.b.d) {
                        FragmentActivity activity = OneLoginFragment.this.getActivity();
                        JSONObject jSONObject = ((com.bytedance.sdk.account.i.b.d) bVar3).f22437c;
                        if (OneLoginFragment.this.getActivity() instanceof com.ss.android.ugc.aweme.account.login.b) {
                            bVar2 = (com.ss.android.ugc.aweme.account.login.b) OneLoginFragment.this.getActivity();
                        } else {
                            bVar2 = null;
                        }
                        com.ss.android.ugc.aweme.account.login.a aVar = new com.ss.android.ugc.aweme.account.login.a(activity, i2, jSONObject, null, bVar2, OneLoginFragment.this.d());
                        com.ss.android.ugc.aweme.account.login.d.a(aVar);
                    }
                    if (OneLoginFragment.this.f32493f != null) {
                        OneLoginFragment.this.f32493f.a();
                    }
                }
            }
        };
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32488a, false, 20635, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32488a, false, 20635, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.q = com.bytedance.sdk.account.d.d.a(getContext());
        view.findViewById(C0906R.id.dms).setOnClickListener(this.r);
        this.i = (TextView) view.findViewById(C0906R.id.a8r);
        this.i.setText(this.f32491d);
        this.f32493f = (PhonePassLoginView) view.findViewById(C0906R.id.du4);
        this.p = (TextView) view.findViewById(C0906R.id.bun);
        if (TextUtils.equals(this.f32492e, "mobile")) {
            this.p.setText(String.format(o.b(C0906R.string.bk1), new Object[]{o.b(C0906R.string.bju)}));
        } else if (TextUtils.equals(this.f32492e, "telecom")) {
            this.p.setText(String.format(o.b(C0906R.string.bk1), new Object[]{o.b(C0906R.string.bjw)}));
        } else if (TextUtils.equals(this.f32492e, "unicom")) {
            this.p.setText(String.format(o.b(C0906R.string.bk1), new Object[]{o.b(C0906R.string.bjy)}));
        }
        this.f32493f.setLoginBtnEnable(true);
        this.f32493f.setLifecycleOwner(this);
        this.f32493f.setLoginListener(new q(this));
        this.f32493f.a(true, this.f32492e);
        r.a("page_land_one_click_login", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", this.n).a("carrier", this.f32490c.getFromMobLabel()).f31599b);
        if (Build.VERSION.SDK_INT >= 19) {
            View findViewById = view.findViewById(C0906R.id.cv4);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = com.ss.android.ugc.aweme.base.utils.p.c();
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32488a, false, 20634, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.p6, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32488a, false, 20634, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
