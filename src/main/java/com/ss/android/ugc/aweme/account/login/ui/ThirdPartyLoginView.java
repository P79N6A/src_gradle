package com.ss.android.ugc.aweme.account.login.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.uikit.base.IComponent;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.login.viewmodel.ThirdLoginViewModel;
import com.ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse;
import com.ss.android.ugc.aweme.account.loginsetting.a;
import com.ss.android.ugc.aweme.account.util.c;
import com.ss.android.ugc.aweme.account.util.m;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.h.b;
import com.ss.android.ugc.aweme.main.h.d;
import com.ss.android.ugc.aweme.utils.ej;
import com.ss.android.ugc.aweme.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ThirdPartyLoginView extends LinearLayout implements View.OnClickListener, a.C0414a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32590a;

    /* renamed from: b  reason: collision with root package name */
    String f32591b;

    /* renamed from: c  reason: collision with root package name */
    protected String f32592c;

    /* renamed from: d  reason: collision with root package name */
    protected String f32593d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f32594e;

    /* renamed from: f  reason: collision with root package name */
    TextView f32595f;
    ViewGroup g;
    ImageView h;
    LinearLayout i;
    a j;
    protected boolean k;
    List<LoginSettingResponse.SettingInfo> l;
    private Activity m;
    private Bundle n;
    private JSONObject o;
    private View.OnClickListener p;

    interface a {
        boolean a(String str);
    }

    public int getLayout() {
        return C0906R.layout.as6;
    }

    public Activity getActivity() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f32590a, false, 20770, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f32590a, false, 20770, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Context context = getContext();
        if (context == null) {
            context = w.b();
        }
        if ("weixin".equals(str2)) {
            if (!ej.a(getContext(), "com.tencent.mm")) {
                com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.cj5).a();
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("uninstall", "", false, "weixin", w.h());
                return false;
            }
        } else if ("qzone_sns".equals(str2)) {
            if (!ej.a(getContext(), "com.tencent.mobileqq")) {
                com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.cj2).a();
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("uninstall", "", false, "qzone_sns", w.h());
                return false;
            }
        } else if ("sina_weibo".equals(str2) && !ej.a(getContext(), "com.sina.weibo")) {
            com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.cj3).a();
            com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("uninstall", "", false, "qzone_sns", w.h());
            return false;
        }
        return true;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32590a, false, 20768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32590a, false, 20768, new Class[0], Void.TYPE);
            return;
        }
        this.f32595f.setClickable(false);
        this.h.setClickable(false);
        this.f32595f.setOnTouchListener(null);
        this.h.setOnTouchListener(null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32590a, false, 20778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32590a, false, 20778, new Class[0], Void.TYPE);
        } else if (!StringUtils.equal(this.f32591b, "weixin") || c.a(getContext())) {
            a(this.f32591b, this.n);
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.cnb).a();
            com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("weixin not install", "", false, this.f32591b, w.h());
        }
    }

    public void setBundle(Bundle bundle) {
        this.n = bundle;
    }

    public void setEventType(String str) {
        this.f32592c = str;
    }

    public void setMobObject(JSONObject jSONObject) {
        this.o = jSONObject;
    }

    public void setPosition(String str) {
        this.f32593d = str;
    }

    public void setThirdPartyLoginListener(a aVar) {
        this.j = aVar;
    }

    public ThirdPartyLoginView(Context context) {
        this(context, null);
    }

    private boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f32590a, false, 20772, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f32590a, false, 20772, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        IAccountService.c c2 = w.c();
        if (c2 == null || c2.f31563d == null) {
            return false;
        }
        ArrayList<String> stringArrayList = c2.f31563d.getStringArrayList("authorize_hide_platforms");
        if (CollectionUtils.isEmpty(stringArrayList)) {
            return false;
        }
        return stringArrayList.contains(str2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r0.equals("sina_weibo") != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f32590a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 20777(0x5129, float:2.9115E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f32590a
            r13 = 0
            r14 = 20777(0x5129, float:2.9115E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 == 0) goto L_0x0040
            java.lang.String r0 = ""
            return r0
        L_0x0040:
            java.lang.String r2 = ""
            r3 = -1
            int r4 = r18.hashCode()
            switch(r4) {
                case -1530308138: goto L_0x0072;
                case -1134307907: goto L_0x0068;
                case -791575966: goto L_0x005e;
                case -471473230: goto L_0x0055;
                case 1851692357: goto L_0x004b;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x007c
        L_0x004b:
            java.lang.String r1 = "flipchat"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 4
            goto L_0x007d
        L_0x0055:
            java.lang.String r4 = "sina_weibo"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x007c
            goto L_0x007d
        L_0x005e:
            java.lang.String r1 = "weixin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 2
            goto L_0x007d
        L_0x0068:
            java.lang.String r1 = "toutiao"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 3
            goto L_0x007d
        L_0x0072:
            java.lang.String r1 = "qzone_sns"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 0
            goto L_0x007d
        L_0x007c:
            r1 = -1
        L_0x007d:
            switch(r1) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008a;
                case 2: goto L_0x0087;
                case 3: goto L_0x0084;
                case 4: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x008f
        L_0x0081:
            java.lang.String r2 = "rocket"
            goto L_0x008f
        L_0x0084:
            java.lang.String r2 = "toutiao"
            goto L_0x008f
        L_0x0087:
            java.lang.String r2 = "weixin"
            goto L_0x008f
        L_0x008a:
            java.lang.String r2 = "weibo"
            goto L_0x008f
        L_0x008d:
            java.lang.String r2 = "qq"
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.ThirdPartyLoginView.c(java.lang.String):java.lang.String");
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32590a, false, 20766, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32590a, false, 20766, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.bv0 || view.getId() == C0906R.id.dn9) {
            if (PatchProxy.isSupport(new Object[0], this, f32590a, false, 20767, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32590a, false, 20767, new Class[0], Void.TYPE);
            } else if (this.i != null) {
                this.i.setAlpha(0.0f);
                this.i.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.i, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.h, "alpha", new float[]{1.0f, 0.0f});
                animatorSet.play(ofFloat).with(ofFloat2).with(ObjectAnimator.ofFloat(this.i, "translationY", new float[]{this.i.getTranslationY(), 0.0f}));
                animatorSet.setDuration(200);
                animatorSet.start();
                ThirdLoginViewModel thirdLoginViewModel = (ThirdLoginViewModel) ViewModelProviders.of((FragmentActivity) this.m).get(ThirdLoginViewModel.class);
                if (thirdLoginViewModel != null) {
                    thirdLoginViewModel.f32661a = true;
                }
            }
            b();
        }
    }

    public ThirdPartyLoginView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(View view, String str) {
        if (PatchProxy.isSupport(new Object[]{view, str}, this, f32590a, false, 20771, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, str}, this, f32590a, false, 20771, new Class[]{View.class, String.class}, Void.TYPE);
        } else if (view != null) {
            if (b(str)) {
                view.setVisibility(8);
                return;
            }
            view.setTag(str);
            view.setOnClickListener(this.p);
            view.setOnTouchListener(new b(1.2f, 100, null));
            if (this.k) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = u.a(36.0d);
                layoutParams.height = u.a(36.0d);
            }
        }
    }

    private void a(String str, Bundle bundle) {
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{str, bundle}, this, f32590a, false, 20774, new Class[]{String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, bundle}, this, f32590a, false, 20774, new Class[]{String.class, Bundle.class}, Void.TYPE);
        } else if (!(this.m instanceof LoginOrRegisterActivity) || !TextUtils.equals(((LoginOrRegisterActivity) this.m).w, "toutiao") || !TextUtils.equals(str, "toutiao")) {
            Intent intent = new Intent(this.m, AuthorizeActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("platform", str);
            intent.putExtra("is_login", true);
            if (TextUtils.isEmpty(this.f32592c)) {
                str2 = "";
            } else {
                str2 = this.f32592c;
            }
            intent.putExtra("enter_from", str2);
            if (TextUtils.isEmpty(this.f32593d)) {
                str3 = "";
            } else {
                str3 = this.f32593d;
            }
            intent.putExtra("enter_method", str3);
            this.m.startActivityForResult(intent, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.co7).a();
            com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("toutiao login", "", false, str, w.h());
        }
    }

    public final void a(String str, String str2) {
        String str3;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f32590a, false, 20775, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f32590a, false, 20775, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f32591b = str2;
        String c2 = c(str2);
        if (!TextUtils.isEmpty(c2)) {
            r.onEvent(MobClick.obtain().setEventName(str).setLabelName(c2).setJsonObject(this.o));
            r.a("login_submit", (Map) com.ss.android.ugc.aweme.account.a.a.b.a().a("enter_from", i.f32242b).a("enter_method", i.f32241a).a("platform", c2).f31599b);
            if (TextUtils.equals(str2, "flipchat")) {
                r.a("flipchat_register_from_flipchat", (Map) null);
                com.ss.android.ugc.aweme.account.a.a.b a2 = com.ss.android.ugc.aweme.account.a.a.b.a();
                if (FlipChat.INSTANCE.isAppInstall(getContext())) {
                    str3 = "yes";
                } else {
                    str3 = "no";
                }
                r.a("flipchat_authorize_click", (Map) a2.a("is_installed", str3).a("user_enter_type", "third_party_login").f31599b);
            }
        }
    }

    public ThirdPartyLoginView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = new LinkedList();
        this.p = new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32596a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32596a, false, 20780, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32596a, false, 20780, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!NetworkUtils.isNetworkAvailable(ThirdPartyLoginView.this.getContext())) {
                    com.bytedance.ies.dmt.ui.d.a.b(ThirdPartyLoginView.this.getContext(), (int) C0906R.string.bgf).a();
                } else if (ThirdPartyLoginView.this.j == null || !ThirdPartyLoginView.this.j.a((String) view.getTag())) {
                    ThirdPartyLoginView thirdPartyLoginView = ThirdPartyLoginView.this;
                    String str = (String) view.getTag();
                    if (PatchProxy.isSupport(new Object[]{str}, thirdPartyLoginView, ThirdPartyLoginView.f32590a, false, 20773, new Class[]{String.class}, Void.TYPE)) {
                        ThirdPartyLoginView thirdPartyLoginView2 = thirdPartyLoginView;
                        PatchProxy.accessDispatch(new Object[]{str}, thirdPartyLoginView2, ThirdPartyLoginView.f32590a, false, 20773, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", false, str, "", "click third login");
                    if (!thirdPartyLoginView.a(str)) {
                        com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("checkThirdAppInstall failed", "", false, str, w.h());
                        return;
                    }
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f32598a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f32598a, false, 20781, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f32598a, false, 20781, new Class[0], Void.TYPE);
                                return;
                            }
                            ((d) w.a(d.class)).a("login");
                        }
                    });
                    thirdPartyLoginView.f32591b = str;
                    thirdPartyLoginView.a("sign_in", str);
                    if (!w.a(2, (Object) str)) {
                        if (CollectionUtils.isEmpty(thirdPartyLoginView.l)) {
                            thirdPartyLoginView.l = n.g();
                        }
                        w.a(thirdPartyLoginView.getActivity());
                        if (!com.ss.android.ugc.aweme.account.loginsetting.a.a(thirdPartyLoginView.l, str, 0, true, thirdPartyLoginView.getActivity(), thirdPartyLoginView)) {
                            thirdPartyLoginView.a();
                        }
                    }
                }
            }
        };
        LayoutInflater.from(context).inflate(getLayout(), this);
        setOrientation(1);
        this.m = v.a(getContext());
        if (PatchProxy.isSupport(new Object[0], this, f32590a, false, 20769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32590a, false, 20769, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.at7);
            if (findViewById == null || !m.f33101b.a()) {
                this.k = false;
            } else {
                findViewById.setVisibility(0);
                this.k = true;
            }
        }
        a(findViewById(C0906R.id.at7), "flipchat");
        a(findViewById(C0906R.id.at8), "qzone_sns");
        a(findViewById(C0906R.id.at_), "sina_weibo");
        a(findViewById(C0906R.id.ata), "weixin");
        a(findViewById(C0906R.id.at9), "toutiao");
        this.f32595f = (TextView) findViewById(C0906R.id.dn9);
        this.f32594e = (ImageView) findViewById(C0906R.id.at9);
        this.h = (ImageView) findViewById(C0906R.id.bv0);
        this.g = (ViewGroup) findViewById(C0906R.id.bkj);
        this.i = (LinearLayout) findViewById(C0906R.id.byi);
        if (PatchProxy.isSupport(new Object[0], this, f32590a, false, 20764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32590a, false, 20764, new Class[0], Void.TYPE);
            return;
        }
        ThirdLoginViewModel thirdLoginViewModel = (ThirdLoginViewModel) ViewModelProviders.of((FragmentActivity) this.m).get(ThirdLoginViewModel.class);
        if (thirdLoginViewModel == null || !thirdLoginViewModel.f32661a) {
            if (PatchProxy.isSupport(new Object[0], this, f32590a, false, 20765, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32590a, false, 20765, new Class[0], Void.TYPE);
                return;
            }
            if (this.i != null) {
                this.i.setVisibility(4);
                this.i.post(new z(this));
                this.f32595f.setOnClickListener(this);
                this.h.setOnClickListener(this);
                com.bytedance.ies.dmt.ui.e.b.a(this.f32595f);
                com.bytedance.ies.dmt.ui.e.b.a(this.h);
            }
            return;
        }
        b();
        this.h.setVisibility(8);
    }

    public final void a(int i2, int i3, Intent intent) {
        JSONObject jSONObject;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f32590a, false, 20776, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f32590a, false, 20776, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i2 == 1001) {
            if (!((IComponent) getActivity()).isViewValid()) {
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("activity next", "", false, "login", "", "third login fail");
            } else if (intent2 != null && intent2.getBooleanExtra("repeat_bind_error", false)) {
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a(getActivity().getString(C0906R.string.cbd), "", false, "login", "", "third login fail");
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.cbd).a();
            } else if (w.h()) {
                if (this.o != null) {
                    jSONObject = this.o;
                } else {
                    jSONObject = new JSONObject();
                }
                try {
                    jSONObject.put("position", this.f32593d);
                    jSONObject.put("enter_from", this.f32592c);
                } catch (JSONException unused) {
                }
                String c2 = c(this.f32591b);
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", true, "login", "", "third login success");
                if (!TextUtils.isEmpty(c2)) {
                    r.onEvent(new MobClick().setEventName("sign_in_success").setLabelName(c2).setJsonObject(jSONObject));
                    r.a("login_success", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", i.f32241a).a("enter_from", i.f32242b).a("platform", c2).a("status", 1).a("_perf_monitor", 1).f31599b);
                }
            }
        }
    }
}
