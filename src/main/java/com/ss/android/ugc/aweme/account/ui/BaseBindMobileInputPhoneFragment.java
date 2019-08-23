package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.k;
import com.bytedance.sdk.account.f.b.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2;
import com.ss.android.ugc.aweme.account.fragment.VerificationCodeFragmentV2;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.account.login.a.s;
import com.ss.android.ugc.aweme.account.terminal.f;
import com.ss.android.ugc.aweme.account.view.StateButton;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.main.h.p;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.w;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public abstract class BaseBindMobileInputPhoneFragment extends BaseAccountFragment {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f32867e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f32868f = a.a();
    private d A;

    /* renamed from: a  reason: collision with root package name */
    private String f32869a;

    /* renamed from: b  reason: collision with root package name */
    private int f32870b;

    /* renamed from: c  reason: collision with root package name */
    private String f32871c;
    protected int g;
    public int h;
    public String i;
    public String w;
    public String x;
    public String y;
    long z;

    public final int w() {
        return 1;
    }

    private int A() {
        return this.h;
    }

    @StringRes
    private int z() {
        if (PatchProxy.isSupport(new Object[0], this, f32867e, false, 21075, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f32867e, false, 21075, new Class[0], Integer.TYPE)).intValue();
        } else if (com.ss.android.g.a.a()) {
            return C0906R.string.mj;
        } else {
            return C0906R.string.mc;
        }
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f32867e, false, 21086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32867e, false, 21086, new Class[0], Void.TYPE);
            return;
        }
        super.t();
        a((View) this.u);
    }

    public final boolean v() {
        if (!PatchProxy.isSupport(new Object[0], this, f32867e, false, 21079, new Class[0], Boolean.TYPE)) {
            return m();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32867e, false, 21079, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences y() {
        if (!PatchProxy.isSupport(new Object[0], this, f32867e, false, 21078, new Class[0], SharedPreferences.class)) {
            return c.a(w.b(), "com.ss.spipe_bind", 0);
        }
        return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f32867e, false, 21078, new Class[0], SharedPreferences.class);
    }

    public final void u() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f32867e, false, 21080, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32867e, false, 21080, new Class[0], Void.TYPE);
        } else if (this.u != null && isViewValid() && this.mBtnLogin != null) {
            final String r = r();
            if (!m()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) w.b(), getResources().getString(C0906R.string.duc)).a();
                return;
            }
            g();
            if (this.g == 1) {
                this.h = g.q;
                this.A.a(r, "", A(), 0, this.x, 1, 0, "", this.y, new s(this) {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f32875c;

                    public final void b(com.bytedance.sdk.account.api.call.c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32875c, false, 21090, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32875c, false, 21090, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                            return;
                        }
                        f.a(1, BaseBindMobileInputPhoneFragment.this.h, cVar.error, cVar.errorMsg);
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                StateButton.a.a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            if (cVar.error == 1057) {
                                BaseBindMobileInputPhoneFragment.this.a(cVar);
                                return;
                            }
                            if (!TextUtils.isEmpty(cVar.errorMsg)) {
                                com.bytedance.ies.dmt.ui.d.a.b(BaseBindMobileInputPhoneFragment.this.getContext(), cVar.errorMsg).a();
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void g(com.bytedance.sdk.account.api.call.c<k> cVar) {
                        VerificationCodeFragment verificationCodeFragment;
                        BaseAccountActivity baseAccountActivity;
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32875c, false, 21089, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32875c, false, 21089, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                            return;
                        }
                        super.g(cVar);
                        f.a(0, BaseBindMobileInputPhoneFragment.this.h, 0, "");
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid() && BaseBindMobileInputPhoneFragment.this.u != null) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                StateButton.a.a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            if (TextUtils.isEmpty(BaseBindMobileInputPhoneFragment.this.y)) {
                                baseAccountActivity = (BaseAccountActivity) BaseBindMobileInputPhoneFragment.this.getActivity();
                                verificationCodeFragment = VerificationCodeFragment.b(4, r, "", BaseBindMobileInputPhoneFragment.this.x, BaseBindMobileInputPhoneFragment.this.i);
                            } else {
                                baseAccountActivity = (BaseAccountActivity) BaseBindMobileInputPhoneFragment.this.getActivity();
                                String str = r;
                                String str2 = BaseBindMobileInputPhoneFragment.this.y;
                                String str3 = BaseBindMobileInputPhoneFragment.this.i;
                                if (PatchProxy.isSupport(new Object[]{4, str, "", str2, str3}, null, VerificationCodeFragment.f32946b, true, 21203, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}, VerificationCodeFragment.class)) {
                                    Object[] objArr = {4, str, "", str2, str3};
                                    Object[] objArr2 = objArr;
                                    verificationCodeFragment = (VerificationCodeFragment) PatchProxy.accessDispatch(objArr2, null, VerificationCodeFragment.f32946b, true, 21203, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}, VerificationCodeFragment.class);
                                } else {
                                    verificationCodeFragment = VerificationCodeFragment.a(str3, 4, str, ad.a().a("password", "").a("unusable_mobile_ticket", str2).f75487b);
                                }
                            }
                            baseAccountActivity.a(verificationCodeFragment);
                        }
                    }
                });
            } else if (this.g == 2 || this.g == 5) {
                if (this.g == 5) {
                    KeyboardUtils.c(this.mEditText);
                }
                this.h = g.h;
                this.A.a(r, "", A(), 0, "", 1, 0, new s(this) {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f32877c;

                    /* renamed from: a */
                    public final void g(com.bytedance.sdk.account.api.call.c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32877c, false, 21091, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32877c, false, 21091, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                            return;
                        }
                        super.g(cVar);
                        f.a(0, BaseBindMobileInputPhoneFragment.this.h, 0, "");
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            if (BaseBindMobileInputPhoneFragment.this.u != null) {
                                BaseBindMobileInputPhoneFragment.this.h();
                                BaseBindMobileInputPhoneFragment.this.d(r);
                            }
                            if (TextUtils.equals(BaseBindMobileInputPhoneFragment.this.i, "live")) {
                                w.a(p.class);
                            }
                        }
                    }

                    public final void b(com.bytedance.sdk.account.api.call.c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32877c, false, 21092, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32877c, false, 21092, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                            return;
                        }
                        f.a(1, BaseBindMobileInputPhoneFragment.this.h, cVar.error, cVar.errorMsg);
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            BaseBindMobileInputPhoneFragment.this.h();
                            if (TextUtils.equals(BaseBindMobileInputPhoneFragment.this.i, "live")) {
                                w.a(p.class);
                            }
                            if (cVar.error == 1057) {
                                if (TextUtils.equals(BaseBindMobileInputPhoneFragment.this.i, "authorize_force_bind")) {
                                    com.bytedance.ies.dmt.ui.d.a.c(BaseBindMobileInputPhoneFragment.this.getContext(), (int) C0906R.string.bj).a();
                                } else {
                                    BaseBindMobileInputPhoneFragment.this.a(cVar);
                                }
                            } else if (cVar.error == 2015) {
                                BaseBindMobileInputPhoneFragment.this.a(r, (DialogInterface.OnClickListener) new k(this, r));
                            } else {
                                if (!TextUtils.isEmpty(cVar.errorMsg)) {
                                    com.bytedance.ies.dmt.ui.d.a.b(BaseBindMobileInputPhoneFragment.this.getContext(), cVar.errorMsg).a();
                                }
                            }
                        }
                    }
                });
            } else if (this.g == 4) {
                this.h = g.u;
                this.A.a(r, "", A(), (i) new s(this) {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f32879c;

                    /* renamed from: a */
                    public final void g(com.bytedance.sdk.account.api.call.c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32879c, false, 21094, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32879c, false, 21094, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                            return;
                        }
                        super.g(cVar);
                        f.a(0, BaseBindMobileInputPhoneFragment.this.h, 0, "");
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid() && BaseBindMobileInputPhoneFragment.this.u != null) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                StateButton.a.a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            BaseBindMobileInputPhoneFragment.this.e(r);
                        }
                    }

                    public final void b(com.bytedance.sdk.account.api.call.c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32879c, false, 21095, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32879c, false, 21095, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                            return;
                        }
                        f.a(1, BaseBindMobileInputPhoneFragment.this.h, cVar.error, cVar.errorMsg);
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                StateButton.a.a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            if (cVar.error == 1057) {
                                BaseBindMobileInputPhoneFragment.this.a(cVar);
                            } else if (cVar.error == 2015) {
                                BaseBindMobileInputPhoneFragment.this.a(r, (DialogInterface.OnClickListener) new l(this, r));
                            } else {
                                if (!TextUtils.isEmpty(cVar.errorMsg)) {
                                    com.bytedance.ies.dmt.ui.d.a.b(BaseBindMobileInputPhoneFragment.this.getContext(), cVar.errorMsg).a();
                                }
                            }
                        }
                    }
                });
            } else if (this.g == 3) {
                this.h = g.y;
                this.A.a(r, "", A(), 0, this.x, 1, 0, "", this.y, new s(this) {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f32881c;

                    /* renamed from: a */
                    public final void g(com.bytedance.sdk.account.api.call.c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32881c, false, 21097, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32881c, false, 21097, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                            return;
                        }
                        super.g(cVar);
                        f.a(0, BaseBindMobileInputPhoneFragment.this.h, 0, "");
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid() && BaseBindMobileInputPhoneFragment.this.u != null) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                StateButton.a.a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            ((BaseAccountActivity) BaseBindMobileInputPhoneFragment.this.getActivity()).a(VerificationCodeFragment.b(3, r, "", "", BaseBindMobileInputPhoneFragment.this.i));
                        }
                    }

                    public final void b(com.bytedance.sdk.account.api.call.c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32881c, false, 21098, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32881c, false, 21098, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                            return;
                        }
                        f.a(1, BaseBindMobileInputPhoneFragment.this.h, cVar.error, cVar.errorMsg);
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                StateButton.a.a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            if (!TextUtils.isEmpty(cVar.errorMsg)) {
                                com.bytedance.ies.dmt.ui.d.a.b(BaseBindMobileInputPhoneFragment.this.getContext(), cVar.errorMsg).a();
                            }
                        }
                    }
                });
                StateButton.a.a(this.mBtnLogin);
            }
            if (this.i == null || !this.i.contains("third_party_")) {
                str = this.i;
            } else {
                str = "log_in";
            }
            r.a("send_sms", (Map) new b().a("send_method", "user_click").a("send_reason", this.h).a("enter_from", str).f31599b);
        }
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f32867e, false, 21073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32867e, false, 21073, new Class[0], Void.TYPE);
            return;
        }
        e();
        if (PatchProxy.isSupport(new Object[0], this, f32867e, false, 21074, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32867e, false, 21074, new Class[0], Void.TYPE);
        } else {
            this.z = y().getLong("last_show_bind_dialog_time", 0);
        }
        if (getArguments() != null) {
            this.g = getArguments().getInt("type");
            this.i = getArguments().getString("enter_from");
            this.x = getArguments().getString("ticket");
            this.w = com.ss.android.ugc.aweme.account.util.d.a(this.i);
            this.y = getArguments().getString("unusable_mobile_ticket");
            this.f32869a = getArguments().getString("profile_key");
            this.u.setHint(C0906R.string.ml);
            this.f32870b = getArguments().getInt("proaccount_switch_type");
            this.f32871c = getArguments().getString("proaccount_category");
            if (this.g == 1) {
                this.mTitleHint.setText(C0906R.string.mf);
                this.mTxtHint.setText(C0906R.string.ma);
            } else if (this.g == 5) {
                this.backBtn.setImageResource(2130839367);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 10.0f), (int) UIUtils.dip2Px(getContext(), 32.0f), 0);
                layoutParams.addRule(3, C0906R.id.dnb);
                this.mLLContainer.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(0, 0, 0, 0);
                layoutParams2.gravity = 16;
                this.s.setLayoutParams(layoutParams2);
                this.mPhoneDownView.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(9, -1);
                layoutParams3.addRule(3, this.mRlTitle.getId());
                layoutParams3.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 40.0f), (int) UIUtils.dip2Px(getContext(), 32.0f), 0);
                this.mTitleHint.setLayoutParams(layoutParams3);
                this.mTitleHint.setGravity(8388611);
                this.mTitleHint.setText(C0906R.string.bqc);
                this.mTitleHint.setTextSize(32.0f);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 8.0f), (int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 28.0f));
                layoutParams4.addRule(9, -1);
                layoutParams4.addRule(3, this.mTitleHint.getId());
                this.mTxtHint.setGravity(8388611);
                this.mTxtHint.setLayoutParams(layoutParams4);
                this.mTxtHint.setTextColor(getResources().getColor(C0906R.color.i4));
                this.mTxtHint.setText(C0906R.string.anq);
                this.mBtnPreAccount.setVisibility(0);
                this.mBtnLogin.setVisibility(8);
                this.mBtnPreAccount.setText(getString(C0906R.string.n1));
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams5.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 12.0f), (int) UIUtils.dip2Px(getContext(), 32.0f), 0);
                layoutParams5.addRule(3, C0906R.id.a8g);
                this.mPasswordTip.setLayoutParams(layoutParams5);
                this.mPasswordTip.setVisibility(0);
                this.mPasswordTip.setText(C0906R.string.bdb);
                this.mPasswordTip.setGravity(8388611);
                this.mDmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
                this.mPhoneContainer.setBackgroundResource(0);
            } else if (this.g == 2) {
                this.mTitleHint.setText(C0906R.string.mk);
                this.mTxtHint.setText(z());
                if (this.i != null && this.i.contains("third_party_")) {
                    this.mRightText.setVisibility(0);
                    this.backBtn.setVisibility(4);
                    if (!com.bytedance.ies.dmt.ui.common.d.a().f20314a && w.i().isForbidSkipBindPhone() && w.j()) {
                        this.mRightText.setVisibility(4);
                    }
                }
                if (TextUtils.equals(this.i, "authorize_force_bind")) {
                    this.mTitleHint.setText(C0906R.string.b96);
                    this.mTxtHint.setVisibility(8);
                    this.mRightText.setVisibility(4);
                    this.backBtn.setImageDrawable(ContextCompat.getDrawable(getContext(), 2130838753));
                    if ((getActivity() instanceof BaseAccountActivity) && getActivity().getSupportFragmentManager().getBackStackEntryCount() > 1) {
                        this.backBtn.setImageDrawable(ContextCompat.getDrawable(getContext(), 2130838751));
                    }
                }
            } else if (this.g == 4) {
                this.mTitleHint.setText(C0906R.string.mk);
                this.mTxtHint.setText(z());
            } else if (this.g == 3) {
                if (com.ss.android.g.a.a()) {
                    this.mTitleHint.setText(C0906R.string.mg);
                    this.mTxtHint.setText(C0906R.string.dqt);
                } else {
                    this.mTitleHint.setText(C0906R.string.md);
                    this.mTxtHint.setText(C0906R.string.rv);
                    this.u.setHint("");
                }
            }
            this.A = com.bytedance.sdk.account.d.d.a(getContext());
        }
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f32867e, false, 21083, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32867e, false, 21083, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((BaseAccountActivity) getActivity()).a(VerificationCodeFragment.a(this.i, 8, str, ad.a().a("profile_key", this.f32869a).f75487b));
    }

    public final void a(final com.bytedance.sdk.account.api.call.c<k> cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32867e, false, 21084, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32867e, false, 21084, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
            return;
        }
        if (cVar != null && cVar.error == 1057) {
            r.a("phone_bundling_conflict_alert", (Map) new b().a("enter_from", "log_in").a("platform", com.ss.android.ugc.aweme.account.k.a.a(this.w)).f31599b);
            new a.C0185a(getContext()).a((int) C0906R.string.m_).b((int) C0906R.string.m8).a((int) C0906R.string.m7, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32887a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32887a, false, 21101, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32887a, false, 21101, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    r.a("phone_bundling_conflict_check", (Map) new b().a("enter_from", "log_in").a("platform", com.ss.android.ugc.aweme.account.k.a.a(BaseBindMobileInputPhoneFragment.this.w)).f31599b);
                    String str = ((k) cVar.f22251a).f22392d;
                    if (!TextUtils.isEmpty(str)) {
                        Map<String, String> a2 = com.ss.android.account.token.a.a(str);
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry next : a2.entrySet()) {
                            try {
                                jSONObject.put((String) next.getKey(), next.getValue());
                            } catch (Exception unused) {
                            }
                        }
                        ((v) w.a(v.class)).a((Context) w.b(), AppLog.addCommonParams(str, false), jSONObject.toString());
                    }
                    dialogInterface.dismiss();
                }
            }).b((int) C0906R.string.m6, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32885a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32885a, false, 21100, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32885a, false, 21100, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    r.a("phone_bundling_conflict_cancel", (Map) new b().a("enter_from", "log_in").a("platform", com.ss.android.ugc.aweme.account.k.a.a(BaseBindMobileInputPhoneFragment.this.w)).f31599b);
                    dialogInterface.dismiss();
                }
            }).a().a().setCanceledOnTouchOutside(false);
        }
    }

    public final void c(String str) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f32867e, false, 21076, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32867e, false, 21076, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a() && this.g == 2) {
            if (PatchProxy.isSupport(new Object[0], this, f32867e, false, 21077, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32867e, false, 21077, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (TimeUnit.DAYS.toMillis(1) <= System.currentTimeMillis() - this.z && !TextUtils.isEmpty(this.w)) {
                z2 = com.ss.android.ugc.aweme.account.util.d.b(this.w);
            }
            if (!z2) {
                AlertDialog create = com.ss.android.ugc.aweme.account.util.p.a(getContext()).setMessage((int) C0906R.string.n3).setNegativeButton((int) C0906R.string.ce3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32873a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32873a, false, 21088, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32873a, false, 21088, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        BaseBindMobileInputPhoneFragment.super.c(BaseBindMobileInputPhoneFragment.this.w);
                    }
                }).setPositiveButton((int) C0906R.string.mt, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setCancelable(false).create();
                create.setCanceledOnTouchOutside(false);
                create.show();
                this.z = System.currentTimeMillis();
                a.i.a((Callable<TResult>) new j<TResult>(this), (Executor) a.i.f1051a);
                return;
            }
        }
        super.c(this.w);
    }

    public final void d(String str) {
        Fragment fragment;
        BaseAccountActivity baseAccountActivity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f32867e, false, 21082, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f32867e, false, 21082, new Class[]{String.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof BindMobileActivityV2)) {
            if (activity != null) {
                if (this.g != 5) {
                    baseAccountActivity = (BaseAccountActivity) activity;
                    fragment = VerificationCodeFragment.b(5, str2, "", "", this.i);
                } else {
                    baseAccountActivity = (BaseAccountActivity) activity;
                    String str3 = this.i;
                    int i2 = this.f32870b;
                    String str4 = this.f32871c;
                    if (PatchProxy.isSupport(new Object[]{9, str2, "", "", str3, Integer.valueOf(i2), str4}, null, VerificationCodeFragment.f32946b, true, 21202, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, Integer.TYPE, String.class}, VerificationCodeFragment.class)) {
                        fragment = (VerificationCodeFragment) PatchProxy.accessDispatch(new Object[]{9, str2, "", "", str3, Integer.valueOf(i2), str4}, null, VerificationCodeFragment.f32946b, true, 21202, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, Integer.TYPE, String.class}, VerificationCodeFragment.class);
                    } else {
                        fragment = VerificationCodeFragment.a(str3, 9, str2, ad.a().a("password", "").a("ticket", "").a("proaccount_switch_type", i2).a("proaccount_category", str4).f75487b);
                    }
                }
            }
        } else if (this.g != 5) {
            baseAccountActivity = (BaseAccountActivity) activity;
            fragment = VerificationCodeFragmentV2.a(5, str2, "", "", this.i);
        } else {
            baseAccountActivity = (BaseAccountActivity) activity;
            fragment = VerificationCodeFragmentV2.a(9, str2, "", "", this.i);
        }
        baseAccountActivity.a(fragment);
    }

    public final void a(String str, final DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{str, onClickListener}, this, f32867e, false, 21081, new Class[]{String.class, DialogInterface.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, onClickListener}, this, f32867e, false, 21081, new Class[]{String.class, DialogInterface.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.A.b(str, null, A(), new com.ss.android.ugc.aweme.account.login.a.v(this) {

            /* renamed from: d  reason: collision with root package name */
            public static ChangeQuickRedirect f32883d;

            public final void b(com.bytedance.sdk.account.api.call.c<k> cVar) {
            }

            /* renamed from: a */
            public final void g(com.bytedance.sdk.account.api.call.c<k> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32883d, false, 21099, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32883d, false, 21099, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                super.g(cVar);
                if (BaseBindMobileInputPhoneFragment.this.getActivity() != null) {
                    AlertDialog.Builder a2 = com.ss.android.ugc.aweme.account.util.p.a(BaseBindMobileInputPhoneFragment.this.getActivity());
                    a2.setTitle((int) C0906R.string.bmd).setMessage((int) C0906R.string.bme).setNegativeButton((int) C0906R.string.anv, onClickListener).setCancelable(false);
                    bc.a(a2.create());
                }
            }
        });
        r.a("send_voice_verification_code", (Map) new b().a("send_reason", String.valueOf(A())).a("send_method", "anti_spam").f31599b);
    }
}
