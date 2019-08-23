package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.api.call.e;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.i;
import com.bytedance.sdk.account.f.b.a.j;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.account.login.a.h;
import com.ss.android.ugc.aweme.account.login.a.s;
import com.ss.android.ugc.aweme.account.login.ui.InputCaptchaFragment;
import com.ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.ss.android.ugc.aweme.account.terminal.f;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.account.view.StateButton;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.w;
import java.util.Map;
import org.json.JSONObject;

public class VerificationCodeFragment extends BaseAccountFragment implements WeakHandler.IHandler {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f32946b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f32947c = a.a();
    public String A;
    boolean B;
    boolean C;
    public d D;
    public InputCaptchaFragment.a E = new InputCaptchaFragment.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32951a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f32951a, false, 21232, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32951a, false, 21232, new Class[0], Void.TYPE);
                return;
            }
            VerificationCodeFragment.this.i();
            VerificationCodeFragment.this.D.a(g.u, (com.bytedance.sdk.account.f.b.a.g) new com.bytedance.sdk.account.f.b.a.g() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32953c;

                public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
                }

                /* renamed from: a */
                public final void g(c<i> cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32953c, false, 21233, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32953c, false, 21233, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    if (!(cVar == null || cVar.f22251a == null || TextUtils.isEmpty(((i) cVar.f22251a).f22383a))) {
                        VerificationCodeFragment.this.a(((i) cVar.f22251a).f22383a, null, ((i) cVar.f22251a).l, VerificationCodeFragment.this.E);
                    }
                }

                public final void a(c<i> cVar, int i) {
                    if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32953c, false, 21234, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32953c, false, 21234, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(cVar.errorMsg)) {
                        com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), cVar.errorMsg).a();
                    }
                }
            });
        }

        public final void b(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32951a, false, 21231, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32951a, false, 21231, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            VerificationCodeFragment.this.D.a(VerificationCodeFragment.this.mEditText.getText().toString(), g.s, true, 0, VerificationCodeFragment.this.x, VerificationCodeFragment.this.F);
        }
    };
    public j F = new j() {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f32959c;

        public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
            e eVar = (e) baseApiResponse;
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f32959c, false, 21256, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f32959c, false, 21256, new Class[]{e.class}, Void.TYPE);
            } else if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.getActivity() != null) {
                Intent intent = new Intent();
                intent.putExtra("ticket", eVar.f22258a);
                VerificationCodeFragment.this.getActivity().setResult(-1, intent);
                VerificationCodeFragment.this.getActivity().finish();
            }
        }

        public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
            e eVar = (e) baseApiResponse;
            if (PatchProxy.isSupport(new Object[]{eVar, str}, this, f32959c, false, 21257, new Class[]{e.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, str}, this, f32959c, false, 21257, new Class[]{e.class, String.class}, Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                VerificationCodeFragment.this.a(str, eVar.errorMsg, g.s, VerificationCodeFragment.this.E);
            }
        }

        public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
            e eVar = (e) baseApiResponse;
            if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f32959c, false, 21258, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f32959c, false, 21258, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (VerificationCodeFragment.this.isViewValid()) {
                StateButton.a.a(VerificationCodeFragment.this.mBtnLogin);
                VerificationCodeFragment.this.backBtn.setEnabled(true);
                if (com.ss.android.ugc.aweme.account.util.d.f33086b.contains(Integer.valueOf(eVar.error))) {
                    Intent intent = new Intent();
                    intent.putExtra("error_code", eVar.error);
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        VerificationCodeFragment.this.getActivity().setResult(0, intent);
                        VerificationCodeFragment.this.getActivity().finish();
                    }
                } else if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.errorMsg)) {
                    com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), eVar.errorMsg).a();
                }
            }
        }
    };
    private String G;
    private String H;
    private int I;
    private WeakHandler J;

    /* renamed from: a  reason: collision with root package name */
    private String f32948a;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32949e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f32950f = 60;
    protected int g;
    protected String h;
    public String i;
    public String w;
    public String x;
    public int y;
    boolean z;

    private String G() {
        return this.h;
    }

    public final int w() {
        if ((this.g != 5 || this.z) && this.g != 8 && (this.g != 9 || this.z)) {
            return 0;
        }
        return 3;
    }

    private void F() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21219, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32983a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f32983a, false, 21273, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32983a, false, 21273, new Class[0], Void.TYPE);
                    return;
                }
                while (VerificationCodeFragment.this.f32949e) {
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f32985a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f32985a, false, 21274, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f32985a, false, 21274, new Class[0], Void.TYPE);
                                return;
                            }
                            if (VerificationCodeFragment.this.f32950f < 0) {
                                VerificationCodeFragment.this.A();
                            } else if (VerificationCodeFragment.this.mTxtTimer != null) {
                                TextView textView = VerificationCodeFragment.this.mTxtTimer;
                                Resources resources = VerificationCodeFragment.this.getContext().getResources();
                                VerificationCodeFragment verificationCodeFragment = VerificationCodeFragment.this;
                                int i = verificationCodeFragment.f32950f;
                                verificationCodeFragment.f32950f = i - 1;
                                textView.setText(resources.getString(C0906R.string.bzq, new Object[]{Integer.valueOf(i)}));
                            }
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    private String H() {
        if (!PatchProxy.isSupport(new Object[0], this, f32946b, false, 21227, new Class[0], String.class)) {
            return this.mEditText.getText().toString();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21227, new Class[0], String.class);
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21220, new Class[0], Void.TYPE);
            return;
        }
        this.f32949e = false;
        if (this.mTxtTimer != null) {
            this.mTxtTimer.setText(getString(C0906R.string.bzk));
        }
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21224, new Class[0], Void.TYPE);
            return;
        }
        w.a(this.I, this.A, (IAccountService.h) new IAccountService.h() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32961a;

            public final void a(int i, int i2, @Nullable Object obj) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f32961a, false, 21259, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f32961a, false, 21259, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
                    return;
                }
                if (i == 14 && i2 == 1) {
                    User k = w.k();
                    if (k == null || !k.isSecret()) {
                        if (VerificationCodeFragment.this.isViewValid()) {
                            KeyboardUtils.c(VerificationCodeFragment.this.backBtn);
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            VerificationCodeFragment.this.A();
                            VerificationCodeFragment.this.h();
                        }
                        if (VerificationCodeFragment.this.getActivity() != null) {
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                        w.l();
                        w.a(7, 1, (Object) null);
                        r.a("switch_to_pro_account_success", (Map) b.a().a("category", VerificationCodeFragment.this.A).f31599b);
                        return;
                    }
                    VerificationCodeFragment.this.C();
                } else {
                    if (VerificationCodeFragment.this.isViewValid()) {
                        KeyboardUtils.c(VerificationCodeFragment.this.backBtn);
                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                        VerificationCodeFragment.this.A();
                        VerificationCodeFragment.this.h();
                    }
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) VerificationCodeFragment.this.getActivity(), (int) C0906R.string.bgg).a();
                    }
                }
            }
        });
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21225, new Class[0], Void.TYPE);
            return;
        }
        w.a((Handler) this.J, false);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21218, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f32949e = false;
    }

    private void D() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21211, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21211, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            int indexOf = getString(C0906R.string.doa).indexOf(37);
            if (indexOf != -1) {
                SpannableString spannableString = new SpannableString(String.format(getString(C0906R.string.doa), new Object[]{this.h}));
                t.a(spannableString, new ForegroundColorSpan(Color.parseColor("#face15")), indexOf, this.h.length() + indexOf, 17);
                this.mTxtHint.setText(spannableString);
            }
        }
    }

    private void E() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21213, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21213, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            String str = this.h;
            String format = String.format(getString(C0906R.string.mi), new Object[]{str});
            int indexOf = format.indexOf(str);
            SpannableString spannableString = new SpannableString(format);
            t.a(spannableString, new ForegroundColorSpan(Color.parseColor("#face15")), indexOf, this.h.length() + indexOf, 17);
            this.mTxtHint.setText(spannableString);
        }
    }

    public final boolean v() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21226, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21226, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((this.g == 5 || this.g == 9) && !this.z) {
            if (this.mEditText.getText().length() != 4 || this.mPasswordEt == null || TextUtils.isEmpty(this.mPasswordEt.getText())) {
                return false;
            }
            return true;
        } else if (this.mEditText.getText().length() == 4) {
            return true;
        } else {
            return false;
        }
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21208, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21208, new Class[0], Void.TYPE);
            return;
        }
        String str = this.h;
        AnonymousClass15 r1 = new k<com.ss.android.ugc.aweme.account.model.d>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32967a;

            public final void onFailure(Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f32967a, false, 21264, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f32967a, false, 21264, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                VerificationCodeFragment.this.x();
                Context context = VerificationCodeFragment.this.getContext();
                if (context != null) {
                    if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                        com.bytedance.ies.dmt.ui.d.a.b(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getErrorMsg()).a();
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.bgg).a();
                }
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                boolean z;
                com.ss.android.ugc.aweme.account.model.d dVar = (com.ss.android.ugc.aweme.account.model.d) obj;
                if (PatchProxy.isSupport(new Object[]{dVar}, this, f32967a, false, 21263, new Class[]{com.ss.android.ugc.aweme.account.model.d.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dVar}, this, f32967a, false, 21263, new Class[]{com.ss.android.ugc.aweme.account.model.d.class}, Void.TYPE);
                    return;
                }
                FragmentActivity activity = VerificationCodeFragment.this.getActivity();
                if (activity != null && (activity instanceof BaseAccountActivity)) {
                    VerificationCodeFragment.this.x();
                    if (dVar != null) {
                        if (PatchProxy.isSupport(new Object[0], dVar, com.ss.android.ugc.aweme.account.model.d.f32750a, false, 20910, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], dVar, com.ss.android.ugc.aweme.account.model.d.f32750a, false, 20910, new Class[0], Boolean.TYPE)).booleanValue();
                        } else if (!TextUtils.equals(dVar.f32751b, "success") || dVar.f32752c == null || dVar.f32752c.f32753a != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            if (!dVar.f32752c.f32754b) {
                                new a.C0185a(VerificationCodeFragment.this.getContext()).b((int) C0906R.string.se).a((int) C0906R.string.bjh, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                    }
                                }).a().a();
                                return;
                            } else if (dVar.f32752c.f32756d) {
                                ((BaseAccountActivity) activity).a(BindMobileInputPhoneFragment.a(ad.a().a("type", 1).a("unusable_mobile_ticket", dVar.f32752c.f32755c).a("enter_from", "").f75487b));
                                return;
                            } else {
                                ((v) w.a(v.class)).a((Context) activity, String.format("https://security.snssdk.com/passport/mobile/change_unusable/verify_page?app_name=aweme&ticket=%s&phone=%s", new Object[]{dVar.f32752c.f32755c, com.ss.android.ugc.aweme.account.util.g.a(VerificationCodeFragment.this.h)}), true);
                                return;
                            }
                        }
                    }
                    if (dVar != null && !TextUtils.isEmpty(dVar.f32751b)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) activity, dVar.f32751b).a();
                    }
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{str, r1}, null, AccountApiInModule.f31674a, true, 19595, new Class[]{String.class, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, r1}, null, AccountApiInModule.f31674a, true, 19595, new Class[]{String.class, k.class}, Void.TYPE);
            return;
        }
        l.a(AccountApiInModule.f31675b.checkPhoneNumberUnusable(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, com.ss.android.ugc.aweme.account.util.g.a(str)), r1, com.ss.android.ugc.aweme.account.base.a.f31688b);
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21217, new Class[0], Void.TYPE);
            return;
        }
        this.D.b(this.h, null, this.y, new com.ss.android.ugc.aweme.account.login.a.v(this) {

            /* renamed from: d  reason: collision with root package name */
            public static ChangeQuickRedirect f32978d;

            public final void b(c<com.bytedance.sdk.account.f.a.k> cVar) {
            }

            /* renamed from: a */
            public final void g(c<com.bytedance.sdk.account.f.a.k> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32978d, false, 21272, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32978d, false, 21272, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                super.g(cVar);
                if (VerificationCodeFragment.this.getActivity() != null) {
                    AlertDialog.Builder a2 = p.a(VerificationCodeFragment.this.getActivity());
                    a2.setTitle((int) C0906R.string.bmd).setMessage((int) C0906R.string.bme).setNegativeButton((int) C0906R.string.anv, (DialogInterface.OnClickListener) null).setCancelable(false);
                    bc.a(a2.create());
                }
            }
        });
        r.a("send_voice_verification_code", (Map) new b().a("send_reason", String.valueOf(this.y)).a("send_method", "anti_spam").f31599b);
    }

    @OnClick({2131493493})
    public void reSendCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21216, new Class[0], Void.TYPE);
            return;
        }
        if (this.f32950f < 0) {
            if (this.g == 1) {
                i2 = g.m;
            } else if (this.g == 3) {
                i2 = g.y;
            } else if (this.g == 4) {
                i2 = g.q;
            } else if (this.g == 5 || this.g == 9) {
                i2 = g.h;
            } else if (this.g == 6) {
                i2 = g.s;
            } else if (this.g == 7) {
                i2 = g.s;
            } else if (this.g == 8) {
                i2 = g.u;
            }
            this.y = i2;
            this.D.a(this.h, "", this.y, 0, this.f32948a, 1, 0, this.x, this.H, new s(this) {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32976c;

                /* renamed from: a */
                public final void g(c<com.bytedance.sdk.account.f.a.k> cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32976c, false, 21270, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32976c, false, 21270, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    super.g(cVar);
                    f.a(0, VerificationCodeFragment.this.y, 0, "");
                }

                public final void b(c<com.bytedance.sdk.account.f.a.k> cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32976c, false, 21271, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32976c, false, 21271, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    f.a(1, VerificationCodeFragment.this.y, cVar.error, cVar.errorMsg);
                    if (com.ss.android.ugc.aweme.account.util.d.f33086b.contains(Integer.valueOf(cVar.error))) {
                        Intent intent = new Intent();
                        intent.putExtra("error_code", cVar.error);
                        if (VerificationCodeFragment.this.getActivity() != null) {
                            VerificationCodeFragment.this.getActivity().setResult(0, intent);
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                    } else if (cVar.error == 2015) {
                        VerificationCodeFragment.this.z();
                    } else {
                        if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(cVar.errorMsg)) {
                            com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), cVar.errorMsg).a();
                        }
                    }
                }
            });
            r.a("send_sms", (Map) new b().a("send_method", "user_click").a("send_reason", this.y).a("enter_method", com.ss.android.ugc.aweme.account.login.i.f32241a).a("enter_from", com.ss.android.ugc.aweme.account.login.i.f32242b).f31599b);
            this.f32950f = 60;
            this.f32949e = true;
            F();
            r.a((Context) getActivity(), "resend_click", "verification_code", w.e(), 0);
        }
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21222, new Class[0], Void.TYPE);
            return;
        }
        this.backBtn.setEnabled(false);
        if (this.g != 9 || !this.B) {
            if (this.g == 1) {
                A();
                this.D.a(this.w, (com.bytedance.sdk.account.api.a.b) new com.bytedance.sdk.account.api.a.b() {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f32987c;

                    public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                        com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                        if (PatchProxy.isSupport(new Object[]{bVar}, this, f32987c, false, 21237, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar}, this, f32987c, false, 21237, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE);
                        } else if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.mEditText != null) {
                            VerificationCodeFragment.this.D.a(VerificationCodeFragment.this.mEditText.getText().toString(), VerificationCodeFragment.this.w, "", (com.bytedance.sdk.account.f.b.a.c) new h(VerificationCodeFragment.this) {

                                /* renamed from: d  reason: collision with root package name */
                                public static ChangeQuickRedirect f32989d;

                                /* renamed from: a */
                                public final void g(c<com.bytedance.sdk.account.f.a.c> cVar) {
                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32989d, false, 21239, new Class[]{c.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32989d, false, 21239, new Class[]{c.class}, Void.TYPE);
                                        return;
                                    }
                                    if (VerificationCodeFragment.this.isViewValid() && cVar.f22251a != null) {
                                        StateButton.a.a(VerificationCodeFragment.this.mBtnLogin);
                                        com.bytedance.ies.dmt.ui.d.a.a((Context) w.b(), (int) C0906R.string.s1).a();
                                        w.a(8, 1, (Object) ((com.bytedance.sdk.account.f.a.c) cVar.f22251a).f22367b);
                                        VerificationCodeFragment.this.getActivity().setResult(-1);
                                        VerificationCodeFragment.this.getActivity().finish();
                                    }
                                }

                                public final void b(c<com.bytedance.sdk.account.f.a.c> cVar) {
                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32989d, false, 21240, new Class[]{c.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32989d, false, 21240, new Class[]{c.class}, Void.TYPE);
                                        return;
                                    }
                                    if (VerificationCodeFragment.this.isViewValid()) {
                                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                                        StateButton.a.a(VerificationCodeFragment.this.mBtnLogin);
                                        if (!TextUtils.isEmpty(cVar.errorMsg)) {
                                            com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), cVar.errorMsg).a();
                                        }
                                    }
                                    r.a((Context) w.b(), "toast_show", "psd_error", w.e(), 0);
                                }
                            });
                        }
                    }

                    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                        com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                        if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i)}, this, f32987c, false, 21238, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i)}, this, f32987c, false, 21238, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (VerificationCodeFragment.this.isViewValid() && !TextUtils.isEmpty(bVar.errorMsg)) {
                            com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), bVar.errorMsg).a();
                        }
                    }
                });
            } else if (this.g == 3) {
                StateButton.a.b(this.mBtnLogin);
                this.D.a(this.mEditText.getText().toString(), g.y, true, 1, "", (j) new j() {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f32991c;

                    public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                        e eVar = (e) baseApiResponse;
                        if (PatchProxy.isSupport(new Object[]{eVar}, this, f32991c, false, 21241, new Class[]{e.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{eVar}, this, f32991c, false, 21241, new Class[]{e.class}, Void.TYPE);
                            return;
                        }
                        if (VerificationCodeFragment.this.isViewValid()) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            StateButton.a.a(VerificationCodeFragment.this.mBtnLogin);
                            VerificationCodeFragment.this.A();
                        }
                        ((BaseAccountActivity) VerificationCodeFragment.this.getActivity()).a(BindMobileInputPhoneFragment.a(ad.a().a("type", 1).a("ticket", eVar.f22258a).a("enter_from", VerificationCodeFragment.this.i).f75487b));
                    }

                    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                        e eVar = (e) baseApiResponse;
                        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f32991c, false, 21242, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f32991c, false, 21242, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        r.a((Context) w.b(), "toast_show", "psd_error", w.e(), 0);
                        if (VerificationCodeFragment.this.mBtnLogin != null) {
                            StateButton.a.a(VerificationCodeFragment.this.mBtnLogin);
                        }
                        if (VerificationCodeFragment.this.backBtn != null) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                        }
                        if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.errorMsg)) {
                            com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), eVar.errorMsg).a();
                        }
                    }
                });
            } else if (this.g == 4) {
                StateButton.a.b(this.mBtnLogin);
                String obj = this.mEditText.getText().toString();
                String str = this.h;
                String str2 = this.f32948a;
                String str3 = this.H;
                AnonymousClass5 r6 = new com.ss.android.ugc.aweme.account.login.a.a(this, this.h, this.mEditText.getText().toString().trim(), this.f32948a, this.H) {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f32993c;

                    public final void onFailure(Throwable th) {
                        if (PatchProxy.isSupport(new Object[]{th}, this, f32993c, false, 21245, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f32993c, false, 21245, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.account.terminal.b.b(1, "changePhone", -10000, th.getMessage());
                    }

                    public final void a(JSONObject jSONObject) {
                        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f32993c, false, 21243, new Class[]{JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f32993c, false, 21243, new Class[]{JSONObject.class}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.account.terminal.b.b(0, "changePhone", 0, "");
                        User k = w.k();
                        if (k != null) {
                            try {
                                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("mobile");
                                    k.setPhoneBinded(true);
                                    k.setBindPhone(optString);
                                    w.a(7, 1, (Object) new com.ss.android.ugc.aweme.j(optString, optJSONObject.toString()));
                                    com.bytedance.ies.dmt.ui.d.a.a((Context) VerificationCodeFragment.this.getActivity(), (int) C0906R.string.bc2).a();
                                    VerificationCodeFragment.this.getActivity().finish();
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (VerificationCodeFragment.this.isViewValid()) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            StateButton.a.a(VerificationCodeFragment.this.mBtnLogin);
                            VerificationCodeFragment.this.A();
                            com.bytedance.ies.dmt.ui.d.a.a((Context) VerificationCodeFragment.this.getActivity(), (int) C0906R.string.bc2).a();
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                    }

                    public final void b(JSONObject jSONObject) {
                        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f32993c, false, 21244, new Class[]{JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f32993c, false, 21244, new Class[]{JSONObject.class}, Void.TYPE);
                            return;
                        }
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        int optInt = optJSONObject.optInt("error_code");
                        String optString = optJSONObject.optString("description");
                        com.ss.android.ugc.aweme.account.terminal.b.b(1, "changePhone", optInt, optString);
                        if (VerificationCodeFragment.this.isViewValid()) {
                            StateButton.a.a(VerificationCodeFragment.this.mBtnLogin);
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            if ((optInt == 2003 || optInt == 2004) && !TextUtils.isEmpty(optString)) {
                                VerificationCodeFragment.this.e(optString);
                            }
                            com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), optString).a();
                        }
                        r.a((Context) w.b(), "toast_show", "psd_error", w.e(), 0);
                    }
                };
                AccountApiInModule.a(obj, str, "", str2, str3, r6);
            } else {
                if (this.g == 5 || this.g == 9) {
                    if (this.z || !TextUtils.isEmpty(this.mPasswordEt.getText())) {
                        if (this.g == 9) {
                            KeyboardUtils.c(this.mEditText);
                        }
                        final String a2 = com.ss.android.ugc.aweme.account.util.d.a(this.i);
                        r.a("phone_bundling_submit", (Map) new b().a("enter_from", "log_in").a("platform", com.ss.android.ugc.aweme.account.k.a.a(a2)).f31599b);
                        g();
                        String trim = this.mPasswordEt.getText().toString().trim();
                        if (!this.z) {
                            this.D.a(trim, (com.bytedance.sdk.account.api.a.b) new com.bytedance.sdk.account.api.a.b() {

                                /* renamed from: c  reason: collision with root package name */
                                public static ChangeQuickRedirect f32995c;

                                public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                                    com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f32995c, false, 21246, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f32995c, false, 21246, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE);
                                    } else if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.mEditText != null && !TextUtils.isEmpty(VerificationCodeFragment.this.mEditText.getText())) {
                                        VerificationCodeFragment.this.d(a2);
                                    }
                                }

                                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                                    com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                                    if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i)}, this, f32995c, false, 21247, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i)}, this, f32995c, false, 21247, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.account.terminal.b.a(1, "checkPWD", bVar.error, bVar.errorMsg);
                                    if (VerificationCodeFragment.this.isViewValid()) {
                                        r.a("phone_bundling_success", (Map) new b().a("enter_from", "log_in").a("status", 0).a("error_code", bVar.error).a("platform", com.ss.android.ugc.aweme.account.k.a.a(a2)).f31599b);
                                        VerificationCodeFragment.this.h();
                                        if (!TextUtils.isEmpty(bVar.errorMsg)) {
                                            com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), bVar.errorMsg).a();
                                        }
                                    }
                                }
                            });
                        } else {
                            this.D.a(G(), H(), "", 0, (com.bytedance.sdk.account.f.b.a.b) new com.ss.android.ugc.aweme.account.login.a.f(this) {

                                /* renamed from: c  reason: collision with root package name */
                                public static ChangeQuickRedirect f32998c;

                                /* renamed from: a */
                                public final void g(c<com.bytedance.sdk.account.f.a.b> cVar) {
                                    String str;
                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32998c, false, 21248, new Class[]{c.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32998c, false, 21248, new Class[]{c.class}, Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.account.terminal.b.a(0, "bindPhone", 0, "");
                                    VerificationCodeFragment.this.B = true;
                                    User k = w.k();
                                    if (k != null) {
                                        com.ss.android.account.b.a aVar = ((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22365f.b().get("mobile");
                                        if (aVar != null) {
                                            str = aVar.f2419e;
                                        } else {
                                            str = "";
                                        }
                                        k.setPhoneBinded(true);
                                        k.setBindPhone(str);
                                        if (VerificationCodeFragment.this.g == 9) {
                                            VerificationCodeFragment.this.B();
                                        } else {
                                            w.a(7, 1, (Object) new com.ss.android.ugc.aweme.j(str, ((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22365f.f22520e.toString()));
                                        }
                                    }
                                    if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.g != 9) {
                                        KeyboardUtils.c(VerificationCodeFragment.this.backBtn);
                                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                                        VerificationCodeFragment.this.A();
                                        VerificationCodeFragment.this.h();
                                        if (VerificationCodeFragment.this.getActivity() != null) {
                                            ((AccountOpeModel) ViewModelProviders.of(VerificationCodeFragment.this.getActivity()).get(AccountOpeModel.class)).f32739b.postValue(new com.ss.android.ugc.aweme.account.model.b(((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22360a, ((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22365f.f22520e.toString()));
                                            VerificationCodeFragment.this.getActivity().setResult(-1);
                                            VerificationCodeFragment.this.getActivity().finish();
                                        }
                                    }
                                }

                                public final void b(c<com.bytedance.sdk.account.f.a.b> cVar) {
                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32998c, false, 21249, new Class[]{c.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32998c, false, 21249, new Class[]{c.class}, Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.account.terminal.b.a(1, "bindPhone", cVar.error, cVar.errorMsg);
                                    r.a("phone_bundling_success", (Map) new b().a("enter_from", "log_in").a("status", 0).a("error_code", cVar.error).a("platform", com.ss.android.ugc.aweme.account.k.a.a(a2)).f31599b);
                                    if ((cVar.error == 2004 || cVar.error == 2003) && !TextUtils.isEmpty(cVar.errorMsg)) {
                                        VerificationCodeFragment.this.e(cVar.errorMsg);
                                        return;
                                    }
                                    if (VerificationCodeFragment.this.isViewValid()) {
                                        VerificationCodeFragment.this.h();
                                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                                    }
                                    User k = w.k();
                                    if (k != null) {
                                        k.setBindPhone("");
                                    }
                                    if (!(VerificationCodeFragment.this.g == 9 || VerificationCodeFragment.this.getActivity() == null)) {
                                        ((AccountOpeModel) ViewModelProviders.of(VerificationCodeFragment.this.getActivity()).get(AccountOpeModel.class)).f32739b.postValue(new com.ss.android.ugc.aweme.account.model.b(((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22360a, cVar.errorMsg));
                                    }
                                    if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(cVar.errorMsg)) {
                                        com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), cVar.errorMsg).a();
                                    }
                                    r.a((Context) w.b(), "toast_show", "psd_error", w.e(), 0);
                                }
                            });
                        }
                    }
                } else if (this.g == 6) {
                    StateButton.a.b(this.mBtnLogin);
                    this.D.a(this.mEditText.getText().toString(), g.s, true, 0, "", (j) new j() {

                        /* renamed from: c  reason: collision with root package name */
                        public static ChangeQuickRedirect f33001c;

                        public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                            e eVar = (e) baseApiResponse;
                            if (PatchProxy.isSupport(new Object[]{eVar}, this, f33001c, false, 21250, new Class[]{e.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{eVar}, this, f33001c, false, 21250, new Class[]{e.class}, Void.TYPE);
                            } else if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.getActivity() != null) {
                                Intent intent = new Intent();
                                intent.putExtra("ticket", eVar.f22258a);
                                VerificationCodeFragment.this.getActivity().setResult(-1, intent);
                                VerificationCodeFragment.this.getActivity().finish();
                            }
                        }

                        public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                            e eVar = (e) baseApiResponse;
                            if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f33001c, false, 21251, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f33001c, false, 21251, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (VerificationCodeFragment.this.isViewValid()) {
                                StateButton.a.a(VerificationCodeFragment.this.mBtnLogin);
                                VerificationCodeFragment.this.backBtn.setEnabled(true);
                                if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.errorMsg)) {
                                    com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), eVar.errorMsg).a();
                                }
                            }
                        }
                    });
                } else if (this.g == 7) {
                    StateButton.a.b(this.mBtnLogin);
                    this.D.a(this.mEditText.getText().toString(), g.s, true, 0, this.x, this.F);
                } else if (this.g == 8) {
                    if (TextUtils.isEmpty(this.mPasswordEt.getText().toString())) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bnc).a();
                    } else {
                        StateButton.a.b(this.mBtnLogin);
                        this.D.a(this.h, this.mEditText.getText().toString(), this.G, "", (com.bytedance.sdk.account.f.b.a.a) new com.ss.android.ugc.aweme.account.login.a.d(this) {

                            /* renamed from: d  reason: collision with root package name */
                            public static ChangeQuickRedirect f33003d;

                            /* renamed from: a */
                            public final void g(c<com.bytedance.sdk.account.f.a.a> cVar) {
                                if (PatchProxy.isSupport(new Object[]{cVar}, this, f33003d, false, 21252, new Class[]{c.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f33003d, false, 21252, new Class[]{c.class}, Void.TYPE);
                                    return;
                                }
                                if (!(cVar.f22251a == null || ((com.bytedance.sdk.account.f.a.a) cVar.f22251a).f22359e == null)) {
                                    w.a(((com.bytedance.sdk.account.f.a.a) cVar.f22251a).f22359e);
                                }
                                if (VerificationCodeFragment.this.getActivity() != null) {
                                    VerificationCodeFragment.this.getActivity().setResult(-1);
                                    VerificationCodeFragment.this.getActivity().finish();
                                }
                            }

                            public final void b(c<com.bytedance.sdk.account.f.a.a> cVar) {
                                if (PatchProxy.isSupport(new Object[]{cVar}, this, f33003d, false, 21253, new Class[]{c.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f33003d, false, 21253, new Class[]{c.class}, Void.TYPE);
                                } else if (com.ss.android.ugc.aweme.account.util.d.f33086b.contains(Integer.valueOf(cVar.error))) {
                                    Intent intent = new Intent();
                                    intent.putExtra("error_code", cVar.error);
                                    if (VerificationCodeFragment.this.getActivity() != null) {
                                        VerificationCodeFragment.this.getActivity().setResult(0, intent);
                                        VerificationCodeFragment.this.getActivity().finish();
                                    }
                                } else {
                                    if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(cVar.errorMsg)) {
                                        com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), cVar.errorMsg).a();
                                    }
                                }
                            }
                        });
                    }
                }
            }
        } else if (this.C) {
            User k = w.k();
            if (k != null && k.isSecret()) {
                C();
            }
        } else {
            B();
        }
    }

    public void f() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21210, new Class[0], Void.TYPE);
            return;
        }
        this.g = getArguments().getInt("type");
        this.h = getArguments().getString("mobile");
        this.w = getArguments().getString("password");
        this.f32948a = getArguments().getString("ticket");
        this.x = getArguments().getString("ticket");
        this.H = getArguments().getString("unusable_mobile_ticket");
        this.G = getArguments().getString("profile_key");
        this.i = getArguments().getString("enter_from");
        this.I = getArguments().getInt("proaccount_switch_type");
        this.A = getArguments().getString("proaccount_category");
        this.mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.mEditText.setHint(C0906R.string.b1s);
        this.mTxtTimer.setVisibility(0);
        if (this.g == 3) {
            if (com.ss.android.g.a.a()) {
                this.mTitleHint.setText(C0906R.string.mg);
                D();
            } else {
                this.mTitleHint.setText(C0906R.string.f4481me);
                if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21212, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21212, new Class[0], Void.TYPE);
                } else if (!TextUtils.isEmpty(this.h)) {
                    int indexOf = getString(C0906R.string.ru).indexOf(37);
                    if (indexOf != -1) {
                        SpannableString spannableString = new SpannableString(String.format(getString(C0906R.string.ru), new Object[]{this.h}));
                        t.a(spannableString, new ForegroundColorSpan(Color.parseColor("#face15")), indexOf, this.h.length() + indexOf, 17);
                        this.mTxtHint.setText(spannableString);
                    }
                }
            }
            this.mBtnLogin.setBackgroundResource(2130838185);
            str = "modify_phone";
            if (!com.ss.android.ugc.aweme.i18n.c.a()) {
                if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21207, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21207, new Class[0], Void.TYPE);
                } else {
                    String str3 = this.h;
                    AnonymousClass14 r1 = new k<com.ss.android.ugc.aweme.account.model.c>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f32963a;

                        public final void onFailure(Throwable th) {
                            Throwable th2 = th;
                            if (PatchProxy.isSupport(new Object[]{th2}, this, f32963a, false, 21261, new Class[]{Throwable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{th2}, this, f32963a, false, 21261, new Class[]{Throwable.class}, Void.TYPE);
                                return;
                            }
                            Context context = VerificationCodeFragment.this.getContext();
                            if (context != null) {
                                if (th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                                    com.bytedance.ies.dmt.ui.d.a.b(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) th2).getErrorMsg()).a();
                                    return;
                                }
                                com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.bgg).a();
                            }
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            boolean z;
                            com.ss.android.ugc.aweme.account.model.c cVar = (com.ss.android.ugc.aweme.account.model.c) obj;
                            if (PatchProxy.isSupport(new Object[]{cVar}, this, f32963a, false, 21260, new Class[]{com.ss.android.ugc.aweme.account.model.c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{cVar}, this, f32963a, false, 21260, new Class[]{com.ss.android.ugc.aweme.account.model.c.class}, Void.TYPE);
                                return;
                            }
                            Context context = VerificationCodeFragment.this.getContext();
                            if (context != null) {
                                if (cVar != null) {
                                    if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.account.model.c.f32745a, false, 20909, new Class[0], Boolean.TYPE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.account.model.c.f32745a, false, 20909, new Class[0], Boolean.TYPE)).booleanValue();
                                    } else if (!TextUtils.equals(cVar.f32746b, "success") || cVar.f32747c == null || cVar.f32747c.f32748a != 0) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        if (!cVar.f32747c.f32749b) {
                                            if (VerificationCodeFragment.this.mSafeCheckHint != null) {
                                                VerificationCodeFragment.this.mSafeCheckHint.setVisibility(8);
                                            }
                                            VerificationCodeFragment verificationCodeFragment = VerificationCodeFragment.this;
                                            if (PatchProxy.isSupport(new Object[0], verificationCodeFragment, VerificationCodeFragment.f32946b, false, 21209, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], verificationCodeFragment, VerificationCodeFragment.f32946b, false, 21209, new Class[0], Void.TYPE);
                                            } else {
                                                verificationCodeFragment.D.a(1, (com.bytedance.sdk.account.api.a.a) new com.bytedance.sdk.account.api.a.a() {

                                                    /* renamed from: c  reason: collision with root package name */
                                                    public static ChangeQuickRedirect f32970c;

                                                    public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                                                        com.bytedance.sdk.account.api.c.a aVar = (com.bytedance.sdk.account.api.c.a) baseApiResponse;
                                                        if (PatchProxy.isSupport(new Object[]{aVar}, this, f32970c, false, 21265, new Class[]{com.bytedance.sdk.account.api.c.a.class}, Void.TYPE)) {
                                                            PatchProxy.accessDispatch(new Object[]{aVar}, this, f32970c, false, 21265, new Class[]{com.bytedance.sdk.account.api.c.a.class}, Void.TYPE);
                                                        } else if ("true".equalsIgnoreCase(aVar.f22243c) && VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.mSafeCheckHint != null) {
                                                            VerificationCodeFragment.this.mSafeCheckHint.setVisibility(0);
                                                            VerificationCodeFragment.this.mSafeCheckHint.setOnClickListener(new View.OnClickListener() {

                                                                /* renamed from: a  reason: collision with root package name */
                                                                public static ChangeQuickRedirect f32972a;

                                                                public final void onClick(View view) {
                                                                    if (PatchProxy.isSupport(new Object[]{view}, this, f32972a, false, 21267, new Class[]{View.class}, Void.TYPE)) {
                                                                        PatchProxy.accessDispatch(new Object[]{view}, this, f32972a, false, 21267, new Class[]{View.class}, Void.TYPE);
                                                                        return;
                                                                    }
                                                                    ClickInstrumentation.onClick(view);
                                                                    ((BaseAccountActivity) VerificationCodeFragment.this.getActivity()).a(BindMobileInputPhoneFragment.a("", 1));
                                                                }
                                                            });
                                                        }
                                                    }

                                                    public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                                                        com.bytedance.sdk.account.api.c.a aVar = (com.bytedance.sdk.account.api.c.a) baseApiResponse;
                                                        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f32970c, false, 21266, new Class[]{com.bytedance.sdk.account.api.c.a.class, Integer.TYPE}, Void.TYPE)) {
                                                            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f32970c, false, 21266, new Class[]{com.bytedance.sdk.account.api.c.a.class, Integer.TYPE}, Void.TYPE);
                                                            return;
                                                        }
                                                        if (VerificationCodeFragment.this.isViewValid() && !TextUtils.isEmpty(aVar.errorMsg)) {
                                                            com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), aVar.errorMsg).a();
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (VerificationCodeFragment.this.mSafeCheckHint != null) {
                                            VerificationCodeFragment.this.mSafeCheckHint.setVisibility(0);
                                            VerificationCodeFragment.this.mSafeCheckHint.setText(C0906R.string.bby);
                                            VerificationCodeFragment.this.mSafeCheckHint.setOnClickListener(new View.OnClickListener() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f32965a;

                                                public final void onClick(View view) {
                                                    if (PatchProxy.isSupport(new Object[]{view}, this, f32965a, false, 21262, new Class[]{View.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{view}, this, f32965a, false, 21262, new Class[]{View.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    ClickInstrumentation.onClick(view);
                                                    VerificationCodeFragment.this.y();
                                                    VerificationCodeFragment verificationCodeFragment = VerificationCodeFragment.this;
                                                    if (PatchProxy.isSupport(new Object[0], verificationCodeFragment, BaseAccountFragment.f32845d, false, 21055, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], verificationCodeFragment, BaseAccountFragment.f32845d, false, 21055, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    if (verificationCodeFragment.mLoadingUI != null) {
                                                        verificationCodeFragment.mLoadingUI.setVisibility(0);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                }
                                if (cVar != null && !TextUtils.isEmpty(cVar.f32746b)) {
                                    com.bytedance.ies.dmt.ui.d.a.b(context, cVar.f32746b).a();
                                }
                            }
                        }
                    };
                    if (PatchProxy.isSupport(new Object[]{str3, r1}, null, AccountApiInModule.f31674a, true, 19594, new Class[]{String.class, k.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str3, r1}, null, AccountApiInModule.f31674a, true, 19594, new Class[]{String.class, k.class}, Void.TYPE);
                    } else {
                        try {
                            l.a(AccountApiInModule.f31675b.canCheckPhoneNumberUnusable(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, com.ss.android.ugc.aweme.account.util.g.a(str3)), r1, com.ss.android.ugc.aweme.account.base.a.f31688b);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } else if (this.g == 9) {
            this.z = n.b();
            if (this.z) {
                this.mPasswordEt.setVisibility(8);
            } else {
                this.mPasswordEt.setVisibility(0);
                this.mPasswordEt.setBackgroundResource(0);
                this.mPasswordDownView.setVisibility(0);
                this.mPasswordTip.setGravity(8388611);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), 0, (int) UIUtils.dip2Px(getContext(), 32.0f), 0);
                layoutParams.addRule(3, C0906R.id.bg2);
                layoutParams.height = (int) UIUtils.dip2Px(getContext(), 50.0f);
                this.mPasswordEt.setLayoutParams(layoutParams);
                this.mPasswordEt.setPadding(0, 0, 0, 0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 10.0f), (int) UIUtils.dip2Px(getContext(), 32.0f), 0);
                layoutParams2.addRule(3, C0906R.id.bwj);
                this.mPasswordTip.setLayoutParams(layoutParams2);
            }
            this.backBtn.setImageResource(2130839367);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 10.0f), (int) UIUtils.dip2Px(getContext(), 32.0f), 0);
            layoutParams3.addRule(3, C0906R.id.dnb);
            this.mLLContainer.setLayoutParams(layoutParams3);
            this.mEditText.setPadding(0, 0, 0, 0);
            this.mEditText.setBackgroundResource(0);
            this.mTxtTimer.setBackgroundResource(0);
            this.mEditText.setHint(C0906R.string.bda);
            this.mTxtTimer.setGravity(8388629);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(9, -1);
            layoutParams4.addRule(3, this.mRlTitle.getId());
            layoutParams4.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 40.0f), (int) UIUtils.dip2Px(getContext(), 32.0f), 0);
            this.mTitleHint.setLayoutParams(layoutParams4);
            this.mTitleHint.setGravity(8388611);
            this.mTitleHint.setText(C0906R.string.mb);
            this.mTitleHint.setTextSize(20.0f);
            this.mCodeDownView.setVisibility(0);
            if (!TextUtils.isEmpty(this.h)) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams5.setMargins((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 8.0f), (int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 28.0f));
                layoutParams5.addRule(9, -1);
                layoutParams5.addRule(3, this.mTitleHint.getId());
                String str4 = this.h;
                if (this.z) {
                    str2 = String.format(getString(C0906R.string.cjj), new Object[]{str4});
                } else {
                    str2 = String.format(getString(C0906R.string.cjk), new Object[]{str4});
                }
                this.mTxtHint.setLayoutParams(layoutParams5);
                this.mTxtHint.setText(str2);
                this.mTxtHint.setGravity(8388611);
                this.mBtnPreAccount.setVisibility(0);
                this.mTxtHint.setTextColor(getResources().getColor(C0906R.color.i4));
                this.mBtnLogin.setVisibility(8);
                this.mBtnPreAccount.setText(C0906R.string.n0);
                this.mDmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
            }
            str = "new_phone_in";
        } else if (this.g == 4) {
            this.mTitleHint.setText(C0906R.string.mh);
            this.mBtnLogin.setBackgroundResource(2130838185);
            str = "new_phone_in";
            E();
        } else if (this.g == 1) {
            this.mTitleHint.setText(C0906R.string.do_);
            this.mBtnLogin.setBackgroundResource(2130838185);
            str = "modify_psd";
            D();
            this.y = g.m;
            this.D.a(this.h, (String) null, g.m, (com.bytedance.sdk.account.f.b.a.i) new s(this) {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32974c;

                /* renamed from: a */
                public final void g(c<com.bytedance.sdk.account.f.a.k> cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32974c, false, 21268, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32974c, false, 21268, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    super.g(cVar);
                    f.a(0, g.m, 0, "");
                }

                public final void b(c<com.bytedance.sdk.account.f.a.k> cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32974c, false, 21269, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32974c, false, 21269, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    f.a(1, g.m, cVar.error, cVar.errorMsg);
                    if (VerificationCodeFragment.this.isViewValid() && !TextUtils.isEmpty(cVar.errorMsg)) {
                        com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), cVar.errorMsg).a();
                    }
                }
            });
        } else if (this.g == 5) {
            this.z = n.b();
            this.mTitleHint.setText(C0906R.string.mb);
            str = "new_phone_in";
            E();
        } else if (this.g == 6) {
            this.mTitleHint.setText(C0906R.string.dqo);
            str = "";
            D();
            this.mTxtTimer.setText(C0906R.string.aj4);
            this.f32950f = -1;
        } else if (this.g == 7) {
            this.mTitleHint.setText(C0906R.string.dqo);
            str = "";
            D();
            this.mTxtTimer.setText(C0906R.string.aj4);
            this.f32950f = -1;
        } else if (this.g == 8) {
            this.mTitleHint.setText(C0906R.string.dqo);
            str = "";
            D();
        } else {
            str = "";
        }
        r.a((Context) getActivity(), "verification_in", "verification_code", w.e(), 0, com.ss.android.ugc.aweme.account.a.a.a.a().a("enter_from", str).b());
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21214, new Class[0], Void.TYPE);
            return;
        }
        getActivity();
    }

    public final void d(final String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f32946b, false, 21221, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32946b, false, 21221, new Class[]{String.class}, Void.TYPE);
            return;
        }
        d dVar = this.D;
        String G2 = G();
        String H2 = H();
        if (PatchProxy.isSupport(new Object[0], this, f32946b, false, 21228, new Class[0], String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[0], this, f32946b, false, 21228, new Class[0], String.class);
        } else {
            str2 = this.mPasswordEt.getText().toString();
        }
        dVar.a(G2, H2, str2, "", (com.bytedance.sdk.account.f.b.a.b) new com.ss.android.ugc.aweme.account.login.a.f(this) {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f32980c;

            /* renamed from: a */
            public final void g(c<com.bytedance.sdk.account.f.a.b> cVar) {
                String str;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32980c, false, 21235, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32980c, false, 21235, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.account.terminal.b.a(0, "bindPhone", 0, "");
                VerificationCodeFragment.this.B = true;
                User k = w.k();
                if (k != null) {
                    com.ss.android.account.b.a aVar = ((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22365f.b().get("mobile");
                    if (aVar != null) {
                        str = aVar.f2419e;
                    } else {
                        str = "";
                    }
                    k.setPhoneBinded(true);
                    k.setBindPhone(str);
                    if (VerificationCodeFragment.this.g == 9) {
                        VerificationCodeFragment.this.B();
                    } else {
                        w.a(7, 1, (Object) new com.ss.android.ugc.aweme.j(str, ((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22365f.f22520e.toString()));
                    }
                }
                if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.g != 9) {
                    KeyboardUtils.c(VerificationCodeFragment.this.backBtn);
                    VerificationCodeFragment.this.backBtn.setEnabled(true);
                    VerificationCodeFragment.this.A();
                    VerificationCodeFragment.this.h();
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        ((AccountOpeModel) ViewModelProviders.of(VerificationCodeFragment.this.getActivity()).get(AccountOpeModel.class)).f32739b.postValue(new com.ss.android.ugc.aweme.account.model.b(((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22360a, ((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22365f.f22520e.toString()));
                        VerificationCodeFragment.this.getActivity().setResult(-1);
                        VerificationCodeFragment.this.getActivity().finish();
                    }
                }
            }

            public final void b(c<com.bytedance.sdk.account.f.a.b> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32980c, false, 21236, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32980c, false, 21236, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                r.a("phone_bundling_success", (Map) new b().a("enter_from", "log_in").a("status", 0).a("error_code", cVar.error).a("platform", com.ss.android.ugc.aweme.account.k.a.a(str)).f31599b);
                if ((cVar.error == 2004 || cVar.error == 2003) && !TextUtils.isEmpty(cVar.errorMsg)) {
                    VerificationCodeFragment.this.e(cVar.errorMsg);
                    return;
                }
                if (VerificationCodeFragment.this.isViewValid()) {
                    VerificationCodeFragment.this.h();
                    VerificationCodeFragment.this.backBtn.setEnabled(true);
                }
                User k = w.k();
                if (k != null) {
                    k.setBindPhone("");
                }
                if (!(VerificationCodeFragment.this.g == 9 || VerificationCodeFragment.this.getActivity() == null)) {
                    ((AccountOpeModel) ViewModelProviders.of(VerificationCodeFragment.this.getActivity()).get(AccountOpeModel.class)).f32739b.postValue(new com.ss.android.ugc.aweme.account.model.b(((com.bytedance.sdk.account.f.a.b) cVar.f22251a).f22360a, cVar.errorMsg));
                }
                if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(cVar.errorMsg)) {
                    com.bytedance.ies.dmt.ui.d.a.b(VerificationCodeFragment.this.getContext(), cVar.errorMsg).a();
                }
                r.a((Context) w.b(), "toast_show", "psd_error", w.e(), 0);
            }
        });
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f32946b, false, 21223, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32946b, false, 21223, new Class[]{String.class}, Void.TYPE);
            return;
        }
        AlertDialog.Builder a2 = p.a(getActivity());
        a2.setMessage((CharSequence) str);
        a2.setPositiveButton((int) C0906R.string.do4, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32955a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32955a, false, 21254, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32955a, false, 21254, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.common.lib.a.a(VerificationCodeFragment.this.getActivity(), "login", "login_pop_confirm");
                ((v) w.a(v.class)).a((Context) w.b(), "https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", true);
            }
        });
        a2.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32957a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32957a, false, 21255, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32957a, false, 21255, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.common.lib.a.a(VerificationCodeFragment.this.getActivity(), "login", "login_pop_cancel");
            }
        });
        a2.show();
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32946b, false, 21206, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32946b, false, 21206, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.f32949e = true;
        if (!(this.g == 6 || this.g == 7)) {
            F();
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f32946b, false, 21229, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f32946b, false, 21229, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if ((message.obj instanceof UserResponse) && message.what == 122) {
            Object obj = message.obj;
            w.l();
            w.a(7, 1, (Object) null);
            r.a("switch_to_pro_account_success", (Map) b.a().a("category", this.A).f31599b);
        }
        if ((message.obj instanceof Exception) && message.what == 122) {
            if (getActivity() != null) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgg).a();
            }
            if (isViewValid()) {
                KeyboardUtils.c(this.backBtn);
                this.backBtn.setEnabled(true);
                A();
                h();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32946b, false, 21205, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32946b, false, 21205, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.D = com.bytedance.sdk.account.d.d.a(getContext());
        this.J = new WeakHandler(this);
    }

    public static VerificationCodeFragment a(String str, int i2, String str2, Bundle bundle) {
        Bundle bundle2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), str4, bundle}, null, f32946b, true, 21204, new Class[]{String.class, Integer.TYPE, String.class, Bundle.class}, VerificationCodeFragment.class)) {
            return (VerificationCodeFragment) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i2), str4, bundle}, null, f32946b, true, 21204, new Class[]{String.class, Integer.TYPE, String.class, Bundle.class}, VerificationCodeFragment.class);
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        bundle2.putInt("type", i2);
        bundle2.putString("mobile", str4);
        bundle2.putString("enter_from", str3);
        VerificationCodeFragment verificationCodeFragment = new VerificationCodeFragment();
        verificationCodeFragment.setArguments(bundle2);
        return verificationCodeFragment;
    }

    public static VerificationCodeFragment b(int i2, String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str5, str6, str7, str8}, null, f32946b, true, 21201, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}, VerificationCodeFragment.class)) {
            Object[] objArr = {Integer.valueOf(i2), str5, str6, str7, str8};
            return (VerificationCodeFragment) PatchProxy.accessDispatch(objArr, null, f32946b, true, 21201, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}, VerificationCodeFragment.class);
        }
        return a(str8, i2, str5, ad.a().a("password", str6).a("ticket", str7).f75487b);
    }
}
