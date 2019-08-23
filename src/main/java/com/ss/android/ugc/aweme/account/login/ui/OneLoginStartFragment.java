package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.mobilelib.b.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import java.io.Serializable;
import java.util.Map;

public class OneLoginStartFragment extends BaseFragment implements u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32513a;

    /* renamed from: b  reason: collision with root package name */
    protected ThirdPartyLoginView f32514b;

    /* renamed from: c  reason: collision with root package name */
    protected OneLoginPhoneBean f32515c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f32516d = new t(this);

    public final a c() {
        return null;
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f32513a, false, 20674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32513a, false, 20674, new Class[0], Void.TYPE);
            return;
        }
        r.a("click_one_click_login", (Map) new b().a("enter_method", this.n).a("carrier", this.f32515c.getFromMobLabel()).f31599b);
        l().c(i.a(OneLoginFragment.class, getArguments()).a("one_login_phone", (Serializable) this.f32515c).a(), true);
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f32513a, false, 20673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32513a, false, 20673, new Class[0], Void.TYPE);
        } else if (getActivity() != null && (getActivity() instanceof LoginOrRegisterActivity)) {
            r.a("click_phone_login", (Map) new b().a("enter_method", this.n).a("carrier", this.f32515c.getFromMobLabel()).a("login_pad_type", w.i().getdUseNewLoginStyle()).f31599b);
            l().c(i.a(LoginOrRegisterFragment.class, getArguments()).a("from_one_login", true).a("enter_from", this.m).a("enter_method", this.n).a(), true);
        }
    }

    public void c(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f32513a, false, 20671, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f32513a, false, 20671, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View findViewById = view2.findViewById(C0906R.id.dms);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin += p.c();
        findViewById.setLayoutParams(layoutParams);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32513a, false, 20668, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32513a, false, 20668, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f32515c = (OneLoginPhoneBean) arguments.getSerializable("one_login_phone");
        }
        if (this.f32515c == null) {
            this.f32515c = new OneLoginPhoneBean();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32513a, false, 20670, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32513a, false, 20670, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f32514b = (ThirdPartyLoginView) view.findViewById(C0906R.id.dup);
        view.findViewById(C0906R.id.dms).setOnClickListener(this.f32516d);
        view.findViewById(C0906R.id.bul).setOnClickListener(this.f32516d);
        view.findViewById(C0906R.id.buo).setOnClickListener(this.f32516d);
        view.findViewById(C0906R.id.dn_).setOnClickListener(this.f32516d);
        view.findViewById(C0906R.id.dna).setOnClickListener(this.f32516d);
        this.f32514b.setEventType(this.m);
        this.f32514b.setPosition(this.n);
        ThirdPartyLoginView thirdPartyLoginView = this.f32514b;
        if (getArguments() == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = getArguments();
        }
        thirdPartyLoginView.setBundle(bundle2);
        if (w.i().getShowFeedback() == 1) {
            View findViewById = view.findViewById(C0906R.id.dn8);
            findViewById.setOnClickListener(this.f32516d);
            UIUtils.setViewVisibility(findViewById, 0);
        }
        c(view);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32513a, false, 20669, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.p7, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32513a, false, 20669, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        int i3 = i;
        Intent intent2 = intent;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32513a, false, 20672, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32513a, false, 20672, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i3 == 1001) {
            if (intent2 == null || !intent2.getBooleanExtra("need_finish_login", false)) {
                z = false;
            }
            AlertDialog alertDialog = null;
            if (intent2 != null) {
                str = intent2.getStringExtra("toast_tips");
            } else {
                str = null;
            }
            int i4 = -1;
            if (intent2 != null) {
                i4 = intent2.getIntExtra("error_code", -1);
            }
            if (intent2 != null) {
                str2 = intent2.getStringExtra("description");
            } else {
                str2 = null;
            }
            if ((i4 == 2003 || i4 == 2004) && !TextUtils.isEmpty(str2)) {
                AlertDialog.Builder a2 = com.ss.android.ugc.aweme.account.util.p.a(getActivity());
                a2.setMessage((CharSequence) str2);
                a2.setPositiveButton((int) C0906R.string.do4, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32517a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32517a, false, 20676, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32517a, false, 20676, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        com.ss.android.common.lib.a.a(OneLoginStartFragment.this.getActivity(), "login", "login_pop_confirm");
                        ((v) w.a(v.class)).a((Context) w.b(), String.format("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
                    }
                });
                a2.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32519a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32519a, false, 20677, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32519a, false, 20677, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        com.ss.android.common.lib.a.a(OneLoginStartFragment.this.getActivity(), "login", "login_pop_cancel");
                    }
                });
                alertDialog = a2.show();
            }
            if (!TextUtils.isEmpty(str) && getActivity() != null) {
                com.bytedance.ies.dmt.ui.d.a.b(getActivity().getApplicationContext(), str).a();
            }
            if (z && getActivity() != null) {
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                getActivity().finish();
            }
        }
        if (this.f32514b != null) {
            this.f32514b.a(i, i2, intent2);
        }
    }
}
