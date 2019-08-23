package com.ss.android.ugc.aweme.account.login.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.common.utility.android.ContactsUtil;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.account.d.a;
import com.ss.android.ugc.aweme.account.globallistener.GlobalListener;
import com.ss.android.ugc.aweme.account.login.b;
import com.ss.android.ugc.aweme.account.login.c;
import com.ss.android.ugc.aweme.account.login.e.a;
import com.ss.android.ugc.aweme.account.login.g;
import com.ss.android.ugc.aweme.account.login.j;
import com.ss.android.ugc.aweme.account.login.m;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.main.h.d;
import com.ss.android.ugc.aweme.main.h.r;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.w;
import org.json.JSONObject;

public abstract class BaseLoginOrRegisterActivity extends AmeBaseActivity implements GlobalListener.b, b, c {
    private static int B = 101;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32361a = null;
    public static final int o = 101;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    protected a A;
    private String C;
    private ProgressDialog D;
    @BindView(2131493065)
    ViewGroup mFragmentContainer;
    @BindView(2131493387)
    DmtStatusView mStatusView;
    public j t;
    public BaseFragment u;
    protected long v;
    public String w;
    public a.C0407a x;
    public SparseArray<i> y = new SparseArray<>(4);
    protected String z;

    public final int a() {
        return C0906R.layout.cc;
    }

    public abstract void f();

    static {
        int i = B + 1;
        B = i;
        p = i;
        int i2 = B + 1;
        B = i2;
        q = i2;
        int i3 = B + 1;
        B = i3;
        r = i3;
        int i4 = B + 1;
        B = i4;
        s = i4;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20445, new Class[0], Void.TYPE);
            return;
        }
        try {
            getSupportFragmentManager().popBackStack();
        } catch (Exception unused) {
        }
    }

    public void dismissProgressDialog() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20453, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20453, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null && this.D.isShowing()) {
            this.D.dismiss();
        }
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, f32361a, false, 20447, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(this.w, "toutiao");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20447, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20444, new Class[0], Void.TYPE);
        } else if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            com.ss.android.ugc.aweme.account.util.j.a(this, false, true);
        } else {
            b();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20432, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        w.a(7, 1, "");
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20433, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20438, new Class[0], Void.TYPE);
            return;
        }
        ((d) w.a(d.class)).a("login");
        this.u = new LoginOrRegisterFragment();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.putString("enter_type", "click_login");
            this.u.setArguments(extras);
        }
        this.mFragmentContainer.setVisibility(0);
        a(this.u, false);
        this.mStatusView.setVisibility(8);
        bc.b(this.A);
    }

    public ProgressDialog showProgressDialog() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20452, new Class[0], ProgressDialog.class)) {
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20452, new Class[0], ProgressDialog.class);
        }
        if (this.D == null) {
            this.D = p.b(this);
            this.D.setMessage(getString(C0906R.string.bc0));
            this.D.setCanceledOnTouchOutside(false);
        }
        if (!this.D.isShowing()) {
            this.D.show();
        }
        return this.D;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20442, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        GlobalListener.a((GlobalListener.b) this);
        GlobalListener.a(1);
        overridePendingTransition(0, C0906R.anim.bp);
        ((r) w.a(r.class)).a(this);
        int intExtra = getIntent().getIntExtra("bundle_flow_type", o);
        if ((intExtra == q || intExtra == r || intExtra == s) && (this.u instanceof m) && ((m) this.u).o_()) {
            g.a(new BaseLoginMethod());
        }
        if (!(this.u instanceof ThirdPartyLoginFragment) || ((ThirdPartyLoginFragment) this.u).f32576b) {
            new Handler().postDelayed(a.f32607b, 200);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20443, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.t != null) {
            j jVar = this.t;
            boolean h = w.h();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(h ? (byte) 1 : 0)}, jVar, j.f32245a, false, 20097, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                j jVar2 = jVar;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(h)}, jVar2, j.f32245a, false, 20097, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("send_code_success_count", jVar.f32246b);
                jSONObject.put("send_code_failed_count", jVar.f32247c);
                jSONObject.put("send_voice_code_success_count", jVar.f32248d);
                jSONObject.put("send_voice_code_failed_count", jVar.f32249e);
                jSONObject.put("login_success_count", jVar.f32250f);
                jSONObject.put("login_failed_count", jVar.g);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
                jSONObject = new JSONObject();
            }
            n.a("phone_login_monitor", h ? 1 : 0, jSONObject);
        }
    }

    public final void c() {
        String str;
        i.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20436, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        this.C = getIntent().getStringExtra("enter_from");
        this.z = getIntent().getStringExtra("enter_method");
        this.v = System.currentTimeMillis();
        int intExtra = getIntent().getIntExtra("bundle_flow_type", o);
        this.w = getIntent().getStringExtra("bundle_from");
        if (intExtra == o) {
            f();
        } else if (intExtra == q) {
            d();
        } else if (intExtra == r) {
            if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20439, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20439, new Class[0], Void.TYPE);
            } else {
                ((d) w.a(d.class)).a("login");
                this.u = new PhonePassLoginFragment();
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    extras.putString("enter_type", "click_login");
                    this.u.setArguments(extras);
                }
                this.mFragmentContainer.setVisibility(0);
                a(this.u, false);
                this.mStatusView.setVisibility(8);
                bc.b(this.A);
            }
        } else if (intExtra == s) {
            if (PatchProxy.isSupport(new Object[0], this, f32361a, false, 20440, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32361a, false, 20440, new Class[0], Void.TYPE);
            } else {
                ((d) w.a(d.class)).a("login");
                this.u = new ThirdPartyLoginFragment();
                Bundle extras2 = getIntent().getExtras();
                if (extras2 != null) {
                    extras2.putString("enter_type", "click_login");
                    this.u.setArguments(extras2);
                }
                this.mFragmentContainer.setVisibility(0);
                a(this.u, false);
                this.mStatusView.setVisibility(8);
                bc.b(this.A);
            }
        } else if (intExtra == p) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
                if (telephonyManager == null) {
                    str = "";
                } else {
                    str = ContactsUtil.getLocalMobile(telephonyManager);
                }
            } catch (Exception unused) {
                str = "";
            }
            Class<PhonePassLoginFragment> cls = PhonePassLoginFragment.class;
            if (PatchProxy.isSupport(new Object[]{cls}, null, i.f33091a, true, 21315, new Class[]{Class.class}, i.a.class)) {
                aVar = (i.a) PatchProxy.accessDispatch(new Object[]{cls}, null, i.f33091a, true, 21315, new Class[]{Class.class}, i.a.class);
            } else {
                aVar = new i.a(cls, null, (byte) 0);
            }
            b(aVar.a("key_input_phone_num", str).a("enter_from", this.C).a("enter_type", "click_login").a("enter_method", this.z).a(), true);
            this.x.setRawInput(str);
            this.mFragmentContainer.setVisibility(0);
        } else {
            finish();
        }
        this.t = new j();
    }

    public final void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f32361a, false, 20437, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f32361a, false, 20437, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 4) {
            finish();
        } else {
            if (i2 == 1) {
                GlobalListener.a((GlobalListener.b) this);
                super.finish();
            }
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f32361a, false, 20455, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f32361a, false, 20455, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.t != null) {
            j jVar = this.t;
            if (z2) {
                jVar.f32246b++;
                return;
            }
            jVar.f32247c++;
        }
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f32361a, false, 20456, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f32361a, false, 20456, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.t != null) {
            j jVar = this.t;
            if (z2) {
                jVar.f32248d++;
                return;
            }
            jVar.f32249e++;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f32361a, false, 20435, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f32361a, false, 20435, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onRestoreInstanceState(bundle);
        this.x = new a.C0407a().setRawInput(bundle2.getString("phone_number_raw_input")).setCountryCode(bundle2.getInt("phone_number_country_code")).setNationalNumber(bundle2.getLong("phone_number_nation_number"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32361a, false, 20434, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32361a, false, 20434, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putString("phone_number_raw_input", this.x.getRawInput());
        bundle.putInt("phone_number_country_code", this.x.getCountryCode());
        bundle.putLong("phone_number_nation_number", this.x.getNationalNumber());
    }

    public final void a(@NonNull Bundle bundle) {
        boolean z2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f32361a, false, 20446, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f32361a, false, 20446, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.account.login.i.f32242b)) {
            bundle2.putString("enter_from", com.ss.android.ugc.aweme.account.login.i.f32242b);
        }
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.account.login.i.f32241a)) {
            bundle2.putString("enter_method", com.ss.android.ugc.aweme.account.login.i.f32241a);
        }
        if (PatchProxy.isSupport(new Object[0], null, w.f50726a, true, 19472, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, w.f50726a, true, 19472, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (w.m().getLoginParam() == null || !w.m().getLoginParam().i) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            bundle2.putBoolean("only_login", true);
        }
        if ("mobile".equals(bundle2.getString("platform"))) {
            bundle2.putInt("user_mode", 0);
            com.ss.android.ugc.aweme.account.util.r.a(bundle).b((a.g<TResult, a.i<TContinuationResult>>) new b<TResult,a.i<TContinuationResult>>(bundle2)).b(c.f32611b).b(new d(bundle2), a.i.f1052b).a((a.g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(this), a.i.f1052b);
            if (e()) {
                showProgressDialog();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f32361a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 20431(0x4fcf, float:2.863E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f32361a
            r3 = 0
            r4 = 20431(0x4fcf, float:2.863E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            com.ss.android.ugc.aweme.account.login.e.a$a r0 = new com.ss.android.ugc.aweme.account.login.e.a$a
            r0.<init>()
            com.ss.android.ugc.aweme.account.login.e.a r1 = com.ss.android.ugc.aweme.account.login.e.a.a((android.content.Context) r17)
            java.lang.Class<com.ss.android.ugc.aweme.main.h.s> r2 = com.ss.android.ugc.aweme.main.h.s.class
            java.lang.Object r2 = com.ss.android.ugc.aweme.w.a((java.lang.Class<T>) r2)
            com.ss.android.ugc.aweme.main.h.s r2 = (com.ss.android.ugc.aweme.main.h.s) r2
            java.lang.String r2 = r2.a()
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.getCountry()
            int r1 = r1.a(r2, r3)
            com.ss.android.ugc.aweme.account.login.e.a$a r0 = r0.setCountryCode(r1)
            r7.x = r0
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.DEFAULT
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.login.g.f32230a
            r13 = 1
            r14 = 20087(0x4e77, float:2.8148E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.account.login.model.LoginMethodName> r2 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod> r16 = com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod.class
            r15 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0091
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.login.g.f32230a
            r13 = 1
            r14 = 20087(0x4e77, float:2.8148E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.account.login.model.LoginMethodName> r1 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.class
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod> r16 = com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod.class
            r15 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r0 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r0
            goto L_0x0124
        L_0x0091:
            java.lang.String r1 = "methodName"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.account.login.g r1 = com.ss.android.ugc.aweme.account.login.g.f32233d
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x00ab
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r0 = new com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 7
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0124
        L_0x00ab:
            com.ss.android.ugc.aweme.account.login.g r1 = com.ss.android.ugc.aweme.account.login.g.f32233d
            r1.d()
            java.util.List<com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod> r1 = com.ss.android.ugc.aweme.account.login.g.f32231b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x00bf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r4 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r4
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r4 = r4.getLoginMethodName()
            if (r4 == r0) goto L_0x00d4
            r4 = 1
            goto L_0x00d5
        L_0x00d4:
            r4 = 0
        L_0x00d5:
            if (r4 == 0) goto L_0x00bf
            r2.add(r3)
            goto L_0x00bf
        L_0x00db:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r0 = r2.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x00eb
            r0 = 0
            goto L_0x0115
        L_0x00eb:
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r2 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r2
            java.util.Date r2 = r2.getExpires()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x00f8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0114
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r4 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r4
            java.util.Date r4 = r4.getExpires()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 >= 0) goto L_0x00f8
            r1 = r3
            r2 = r4
            goto L_0x00f8
        L_0x0114:
            r0 = r1
        L_0x0115:
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r0 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r0
            if (r0 != 0) goto L_0x0124
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r0 = new com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0124:
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod
            if (r1 == 0) goto L_0x015f
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r2 = "need_auto_fill_latest_login_info"
            boolean r1 = r1.getBooleanExtra(r2, r8)
            if (r1 == 0) goto L_0x015f
            com.ss.android.ugc.aweme.account.login.e.a$a r1 = r7.x
            com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod r0 = (com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod) r0
            com.ss.android.ugc.aweme.account.login.e.a$a r2 = r0.getPhoneNumber()
            int r2 = r2.getCountryCode()
            r1.setCountryCode(r2)
            com.ss.android.ugc.aweme.account.login.e.a$a r1 = r7.x
            com.ss.android.ugc.aweme.account.login.e.a$a r0 = r0.getPhoneNumber()
            long r2 = r0.getNationalNumber()
            r1.setNationalNumber(r2)
            com.ss.android.ugc.aweme.account.login.e.a$a r0 = r7.x
            com.ss.android.ugc.aweme.account.login.e.a$a r1 = r7.x
            long r1 = r1.getNationalNumber()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setRawInput(r1)
        L_0x015f:
            com.ss.android.ugc.aweme.account.d.a r0 = new com.ss.android.ugc.aweme.account.d.a
            com.ss.android.ugc.aweme.account.view.b r1 = new com.ss.android.ugc.aweme.account.view.b
            r1.<init>(r7)
            r0.<init>(r7, r1)
            r7.A = r0
            com.ss.android.ugc.aweme.account.d.a r0 = r7.A
            r0.setCanceledOnTouchOutside(r9)
            super.onCreate(r18)
            r0 = 2130968664(0x7f040058, float:1.7545988E38)
            r7.overridePendingTransition(r0, r9)
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r7
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.globallistener.GlobalListener.f31971a
            r13 = 1
            r14 = 19968(0x4e00, float:2.7981E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.account.globallistener.GlobalListener$b> r1 = com.ss.android.ugc.aweme.account.globallistener.GlobalListener.b.class
            r0[r9] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r15 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x01a9
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r7
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.globallistener.GlobalListener.f31971a
            r13 = 1
            r14 = 19968(0x4e00, float:2.7981E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.account.globallistener.GlobalListener$b> r1 = com.ss.android.ugc.aweme.account.globallistener.GlobalListener.b.class
            r0[r9] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r15 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x01a9:
            java.util.List<com.ss.android.ugc.aweme.account.globallistener.GlobalListener$b> r0 = com.ss.android.ugc.aweme.account.globallistener.GlobalListener.f31973c
            r0.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity.onCreate(android.os.Bundle):void");
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f32361a, false, 20457, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f32361a, false, 20457, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.t != null) {
            this.t.a(z2);
        }
    }

    public final void b(Fragment fragment, boolean z2) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f32361a, false, 20450, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, Byte.valueOf(z2)}, this, f32361a, false, 20450, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE);
        } else if (getSupportFragmentManager().getFragments() == null) {
            getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, fragment2).commitAllowingStateLoss();
        } else if (!z2 || getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.setCustomAnimations(C0906R.anim.cv, C0906R.anim.dc, C0906R.anim.d2, C0906R.anim.d6);
            beginTransaction.replace(C0906R.id.aic, fragment2);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        } else {
            b();
        }
    }

    public final void c(Fragment fragment, boolean z2) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f32361a, false, 20451, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, Byte.valueOf(z2)}, this, f32361a, false, 20451, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE);
        } else if (getSupportFragmentManager().getFragments() == null) {
            getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, fragment2).commitAllowingStateLoss();
        } else if (!z2 || getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.setCustomAnimations(C0906R.anim.cz, C0906R.anim.d8, C0906R.anim.cx, C0906R.anim.da);
            beginTransaction.replace(C0906R.id.aic, fragment2);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        } else {
            b();
        }
    }

    public final void a(Fragment fragment, boolean z2) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, (byte) 0}, this, f32361a, false, 20449, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, (byte) 0}, this, f32361a, false, 20449, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE);
        } else if (getSupportFragmentManager().getFragments() == null) {
            getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, fragment2).commitAllowingStateLoss();
        } else {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(C0906R.id.aic, fragment2);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32361a, false, 20441, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32361a, false, 20441, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (this.u != null) {
            int i3 = i;
            int i4 = i2;
            this.u.onActivityResult(i, i2, intent2);
        }
        if (w.h()) {
            finish();
        }
    }
}
