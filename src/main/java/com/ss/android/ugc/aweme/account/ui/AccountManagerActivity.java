package com.ss.android.ugc.aweme.account.ui;

import a.i;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.widget.setting.Divider;
import com.bytedance.ies.uikit.util.IESUIUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChat;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f.a.c;
import com.ss.android.ugc.aweme.account.f.b;
import com.ss.android.ugc.aweme.account.g.a;
import com.ss.android.ugc.aweme.account.loginsetting.ThirdBindSettingsResponse;
import com.ss.android.ugc.aweme.account.model.g;
import com.ss.android.ugc.aweme.account.model.h;
import com.ss.android.ugc.aweme.account.util.d;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.account.util.x;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.ej;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.android.ugc.aweme.w;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AccountManagerActivity extends AmeActivity implements View.OnClickListener, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32807a;

    /* renamed from: b  reason: collision with root package name */
    b f32808b;
    @BindView(2131493131)
    CommonItemView bindFlipchatItem;
    @BindView(2131493132)
    CommonItemView bindHotsoonItem;
    @BindView(2131493133)
    CommonItemView bindJinritoutiaoItem;
    @BindView(2131493135)
    CommonItemView bindQQItem;
    @BindView(2131493137)
    CommonItemView bindSinaItem;
    @BindView(2131493134)
    CommonItemView bindToutiaoXiGuaItem;
    @BindView(2131493140)
    CommonItemView bindWeixinItem;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.a f32809c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32810d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.shortvideo.a.a f32811e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32812f;
    private String g;
    private CommonItemView h;
    private volatile boolean i;
    @BindView(2131493415)
    TextView mTitle;
    @BindView(2131493002)
    Divider syncDivider;

    public boolean isRegisterEventBus() {
        return false;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32807a, false, 21016, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32807a, false, 21016, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.AccountManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(String str, CommonItemView commonItemView) {
        String str2 = str;
        CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{str2, commonItemView2}, this, f32807a, false, 21003, new Class[]{String.class, CommonItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, commonItemView2}, this, f32807a, false, 21003, new Class[]{String.class, CommonItemView.class}, Void.TYPE);
            return;
        }
        a(str2, commonItemView2, -1, null);
    }

    private boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f32807a, false, 20995, new Class[0], Boolean.TYPE)) {
            return w.k().isSecret();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 20995, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 21010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 21010, new Class[0], Void.TYPE);
            return;
        }
        final boolean c2 = this.bindToutiaoXiGuaItem.c();
        c cVar = new c(this);
        AnonymousClass10 r2 = new b.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32815a;

            public final void a(String str) {
            }

            public final void a() {
                int i;
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f32815a, false, 21033, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32815a, false, 21033, new Class[0], Void.TYPE);
                    return;
                }
                AccountManagerActivity.this.bindToutiaoXiGuaItem.setChecked(!c2);
                if (PatchProxy.isSupport(new Object[0], null, n.f33102a, true, 21342, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, n.f33102a, true, 21342, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i = n.e().getInt("sync_to_toutiao", 1);
                }
                if (i == 1) {
                    AccountManagerActivity.this.bindToutiaoXiGuaItem.setRightText((String) AccountManagerActivity.this.bindJinritoutiaoItem.getTag());
                } else {
                    AccountManagerActivity.this.bindToutiaoXiGuaItem.setRightText("");
                }
                MobClick labelName = MobClick.obtain().setEventName("account_click").setLabelName("tongbu_toutiao");
                com.ss.android.ugc.aweme.account.a.a.a aVar = new com.ss.android.ugc.aweme.account.a.a.a();
                if (AccountManagerActivity.this.bindToutiaoXiGuaItem.c()) {
                    str = "on";
                } else {
                    str = "off";
                }
                r.onEvent(labelName.setJsonObject(aVar.a("to_status", str).b()));
            }
        };
        if (c2) {
            cVar.b(r2);
        } else {
            cVar.a((b.a) r2);
        }
    }

    @OnClick({2131492914})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 20993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 20993, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public void dismissProgressDialog() {
        if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 21014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 21014, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.f32811e != null && this.f32811e.isShowing()) {
                this.f32811e.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 21015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 21015, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        dismissProgressDialog();
        ImmersionBar.with((Activity) this).destroy();
        if (this.f32809c != null) {
            this.f32809c.f31594d = null;
            this.f32809c = null;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 20992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 20992, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.AccountManagerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.AccountManagerActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 20988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 20988, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).init();
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 21009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 21009, new Class[0], Void.TYPE);
            return;
        }
        Dialog a2 = new a.C0185a(this).a((int) C0906R.string.dnj).b((int) C0906R.string.dnk).b((int) C0906R.string.pm, a.f33031b).a((int) C0906R.string.m5, (DialogInterface.OnClickListener) new b(this)).a().a();
        a2.setCanceledOnTouchOutside(false);
        a2.setCancelable(false);
    }

    private boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f32807a, false, 21001, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f32807a, false, 21001, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        int b2 = b(str);
        List<ThirdBindSettingsResponse.BindSetting> i2 = n.i();
        if (CollectionUtils.isEmpty(i2)) {
            return true;
        }
        for (ThirdBindSettingsResponse.BindSetting next : i2) {
            if (next.bind_platform == b2 && next.bind_switch == 1) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, next.bind_toast).a();
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        if (r0.equals("weixin") != false) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f32807a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r5 = 0
            r6 = 21002(0x520a, float:2.943E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f32807a
            r13 = 0
            r14 = 21002(0x520a, float:2.943E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x003b:
            r2 = r17
            com.ss.android.ugc.aweme.account.a r3 = r2.f32809c
            java.lang.String r0 = r3.b(r0)
            r3 = -1
            int r4 = r0.hashCode()
            r5 = -1530308138(0xffffffffa4c959d6, float:-8.732204E-17)
            if (r4 == r5) goto L_0x006b
            r5 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            if (r4 == r5) goto L_0x0062
            r1 = -471473230(0xffffffffe3e5e3b2, float:-8.481423E21)
            if (r4 == r1) goto L_0x0058
            goto L_0x0075
        L_0x0058:
            java.lang.String r1 = "sina_weibo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            r1 = 2
            goto L_0x0076
        L_0x0062:
            java.lang.String r4 = "weixin"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0075
            goto L_0x0076
        L_0x006b:
            java.lang.String r1 = "qzone_sns"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            r1 = 0
            goto L_0x0076
        L_0x0075:
            r1 = -1
        L_0x0076:
            switch(r1) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007c;
                case 2: goto L_0x007a;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x007f
        L_0x007a:
            r9 = 6
            goto L_0x007f
        L_0x007c:
            r9 = 5
            goto L_0x007f
        L_0x007e:
            r9 = 4
        L_0x007f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.AccountManagerActivity.b(java.lang.String):int");
    }

    public void onClick(View view) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f32807a, false, 20994, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32807a, false, 20994, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        this.i = false;
        if (id == C0906R.id.ay6) {
            r.a((Context) this, "account_click", "binging_wechat", w.e(), 0);
            b(getString(C0906R.string.dti), this.bindWeixinItem);
        } else if (id == C0906R.id.axo) {
            r.a((Context) this, "account_click", "binging_QQ", w.e(), 0);
            b(getString(C0906R.string.bu7), this.bindQQItem);
        } else if (id == C0906R.id.axw) {
            if (ej.a(this, "com.sina.weibo")) {
                r.a((Context) this, "account_click", "binging_weibo", w.e(), 0);
                b(getString(C0906R.string.c8l), this.bindSinaItem);
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.cj3).a();
        } else if (id == C0906R.id.awb) {
            this.i = true;
            r.a((Context) this, "account_click", "binging_toutiao", w.e(), 0);
            b(getString(C0906R.string.b3v), this.bindJinritoutiaoItem);
        } else {
            if (id == C0906R.id.awc) {
                if (b()) {
                    com.bytedance.ies.dmt.ui.d.a.c((Context) this, getString(C0906R.string.pk)).a();
                    return;
                }
                this.i = true;
                if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 20996, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 20996, new Class[0], Void.TYPE);
                } else if (this.bindToutiaoXiGuaItem.c() || !TextUtils.isEmpty((String) this.bindJinritoutiaoItem.getTag())) {
                    a();
                } else {
                    this.f32812f = true;
                    b(getString(C0906R.string.b3v), this.bindJinritoutiaoItem);
                }
            } else if (id == C0906R.id.aw6) {
                if (b()) {
                    com.bytedance.ies.dmt.ui.d.a.c((Context) this, getString(C0906R.string.pk)).a();
                    return;
                }
                if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 20997, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 20997, new Class[0], Void.TYPE);
                } else if (!this.bindHotsoonItem.c()) {
                    this.f32808b = new com.ss.android.ugc.aweme.account.f.a.b(this);
                    this.f32808b.a(new b.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f32820a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f32820a, false, 21024, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f32820a, false, 21024, new Class[0], Void.TYPE);
                                return;
                            }
                            AccountManagerActivity.this.bindHotsoonItem.setChecked(true);
                            n.c(true);
                            User k = w.k();
                            if (k != null) {
                                PlatformInfo platformInfo = k.getPlatformInfo("hotsoon");
                                if (platformInfo != null) {
                                    AccountManagerActivity.this.bindHotsoonItem.setRightText(platformInfo.getNickName());
                                }
                            }
                        }

                        public final void a(String str) {
                            if (PatchProxy.isSupport(new Object[]{str}, this, f32820a, false, 21025, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str}, this, f32820a, false, 21025, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            n.c(false);
                        }
                    });
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 20998, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 20998, new Class[0], Void.TYPE);
                    } else {
                        new a.C0185a(this).a(getString(C0906R.string.dnf)).b(getString(C0906R.string.dne)).a(getString(C0906R.string.dnc), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f32823a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32823a, false, 21026, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32823a, false, 21026, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                AccountManagerActivity accountManagerActivity = AccountManagerActivity.this;
                                if (PatchProxy.isSupport(new Object[0], accountManagerActivity, AccountManagerActivity.f32807a, false, 20999, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], accountManagerActivity, AccountManagerActivity.f32807a, false, 20999, new Class[0], Void.TYPE);
                                    return;
                                }
                                accountManagerActivity.f32808b = new com.ss.android.ugc.aweme.account.f.a.b(accountManagerActivity);
                                accountManagerActivity.f32808b.b(new b.a() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f32825a;

                                    public final void a() {
                                        if (PatchProxy.isSupport(new Object[0], this, f32825a, false, 21027, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f32825a, false, 21027, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        AccountManagerActivity.this.bindHotsoonItem.setChecked(false);
                                        AccountManagerActivity.this.bindHotsoonItem.setRightText("");
                                        n.c(false);
                                    }

                                    public final void a(String str) {
                                        if (PatchProxy.isSupport(new Object[]{str}, this, f32825a, false, 21028, new Class[]{String.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{str}, this, f32825a, false, 21028, new Class[]{String.class}, Void.TYPE);
                                            return;
                                        }
                                        Toast makeText = Toast.makeText(AccountManagerActivity.this, C0906R.string.hk, 0);
                                        if (PatchProxy.isSupport(new Object[]{makeText}, null, f.f33040a, true, 21029, new Class[]{Toast.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{makeText}, null, f.f33040a, true, 21029, new Class[]{Toast.class}, Void.TYPE);
                                            return;
                                        }
                                        if (Build.VERSION.SDK_INT == 25) {
                                            eq.a(makeText);
                                        }
                                        makeText.show();
                                    }
                                });
                            }
                        }).b(getString(C0906R.string.dnb), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).a().a();
                    }
                }
                MobClick labelName = MobClick.obtain().setEventName("account_click").setLabelName("tongbu_hotsoon");
                com.ss.android.ugc.aweme.account.a.a.a aVar = new com.ss.android.ugc.aweme.account.a.a.a();
                if (this.bindHotsoonItem.c()) {
                    str2 = "off";
                } else {
                    str2 = "on";
                }
                r.onEvent(labelName.setJsonObject(aVar.a("to_status", str2).b()));
            } else if (id == C0906R.id.aw3) {
                b(getString(C0906R.string.afm), this.bindFlipchatItem);
                com.ss.android.ugc.aweme.account.a.a.b a2 = com.ss.android.ugc.aweme.account.a.a.b.a();
                if (FlipChat.INSTANCE.isAppInstall(this)) {
                    str = "yes";
                } else {
                    str = "no";
                }
                r.a("flipchat_authorize_click", (Map) a2.a("is_installed", str).a("user_enter_type", "settings").f31599b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f32807a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 20987(0x51fb, float:2.9409E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f32807a
            r3 = 0
            r4 = 20987(0x51fb, float:2.9409E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            java.lang.String r0 = "com.ss.android.ugc.aweme.account.ui.AccountManagerActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r19)
            r0 = 2131689500(0x7f0f001c, float:1.9008017E38)
            r7.setContentView((int) r0)
            android.widget.TextView r0 = r7.mTitle
            r1 = 2131558945(0x7f0d0221, float:1.874322E38)
            r0.setText(r1)
            com.ss.android.ugc.aweme.account.a r0 = new com.ss.android.ugc.aweme.account.a
            r0.<init>(r7)
            r7.f32809c = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f32807a
            r3 = 0
            r4 = 20989(0x51fd, float:2.9412E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0078
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f32807a
            r3 = 0
            r4 = 20989(0x51fd, float:2.9412E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x012d
        L_0x0078:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindJinritoutiaoItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindQQItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindWeixinItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindJinritoutiaoItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindToutiaoXiGuaItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindSinaItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindFlipchatItem
            r0.setOnClickListener(r7)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.util.n.f33102a
            r14 = 1
            r15 = 21356(0x536c, float:2.9926E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x00c8
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.util.n.f33102a
            r14 = 1
            r15 = 21356(0x536c, float:2.9926E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00d2
        L_0x00c8:
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.account.util.n.e()
            java.lang.String r1 = "is_target_binding_user"
            boolean r0 = r0.getBoolean(r1, r10)
        L_0x00d2:
            r1 = 8
            if (r0 == 0) goto L_0x00dc
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindToutiaoXiGuaItem
            r0.setVisibility(r1)
            goto L_0x00e1
        L_0x00dc:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindToutiaoXiGuaItem
            r0.setVisibility(r10)
        L_0x00e1:
            com.ss.android.ugc.aweme.account.model.f r0 = com.ss.android.ugc.aweme.w.i()
            int r0 = r0.getShowSyncHotsoon()
            if (r0 != 0) goto L_0x00f1
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindHotsoonItem
            r0.setVisibility(r1)
            goto L_0x00fb
        L_0x00f1:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindHotsoonItem
            r0.setVisibility(r10)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindHotsoonItem
            r0.setOnClickListener(r7)
        L_0x00fb:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindHotsoonItem
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x010e
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindToutiaoXiGuaItem
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r0 = 0
            goto L_0x010f
        L_0x010e:
            r0 = 1
        L_0x010f:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r7.bindHotsoonItem
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0125
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r7.bindToutiaoXiGuaItem
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0125
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r7.bindToutiaoXiGuaItem
            r3 = 0
            r2.setDesc(r3)
        L_0x0125:
            com.bytedance.ies.dmt.ui.widget.setting.Divider r2 = r7.syncDivider
            if (r0 == 0) goto L_0x012a
            r1 = 0
        L_0x012a:
            r2.setVisibility(r1)
        L_0x012d:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f32807a
            r3 = 0
            r4 = 20990(0x51fe, float:2.9413E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0152
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f32807a
            r3 = 0
            r4 = 20990(0x51fe, float:2.9413E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01cf
        L_0x0152:
            com.ss.android.ugc.aweme.account.a r0 = r7.f32809c
            r0.f31592b = r7
            com.ss.android.ugc.aweme.account.a r0 = r7.f32809c
            r0.a()
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.profile.model.User r1 = com.ss.android.ugc.aweme.w.k()
            if (r1 == 0) goto L_0x01a3
            com.ss.android.ugc.aweme.profile.model.PlatformInfo[] r1 = r1.getPlatformInfos()
            if (r1 == 0) goto L_0x01a3
            int r2 = r1.length
            r5 = r0
            r0 = 0
            r3 = 0
            r4 = 0
        L_0x016e:
            if (r0 >= r2) goto L_0x01a1
            r6 = r1[r0]
            java.lang.String r8 = r6.getPatformName()
            java.lang.String r11 = "toutiao_v2"
            boolean r8 = android.text.TextUtils.equals(r8, r11)
            if (r8 != 0) goto L_0x019d
            java.lang.String r8 = r6.getPatformName()
            java.lang.String r11 = "toutiao"
            boolean r8 = android.text.TextUtils.equals(r8, r11)
            if (r8 == 0) goto L_0x018b
            goto L_0x019d
        L_0x018b:
            java.lang.String r8 = "hotsoon"
            java.lang.String r11 = r6.getPatformName()
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x019e
            java.lang.String r5 = r6.getNickName()
            r4 = 1
            goto L_0x019e
        L_0x019d:
            r3 = 1
        L_0x019e:
            int r0 = r0 + 1
            goto L_0x016e
        L_0x01a1:
            r0 = r5
            goto L_0x01a5
        L_0x01a3:
            r3 = 0
            r4 = 0
        L_0x01a5:
            com.ss.android.ugc.aweme.account.util.n.a((int) r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r7.bindToutiaoXiGuaItem
            r1.setChecked(r3)
            com.ss.android.ugc.aweme.account.util.n.c(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r7.bindHotsoonItem
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x01c2
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r7.bindHotsoonItem
            r1.setChecked(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r7.bindHotsoonItem
            r1.setRightText(r0)
        L_0x01c2:
            com.ss.android.ugc.aweme.account.util.m r0 = com.ss.android.ugc.aweme.account.util.m.f33101b
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x01cf
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.bindFlipchatItem
            r0.setVisibility(r10)
        L_0x01cf:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f32807a
            r3 = 0
            r4 = 20991(0x51ff, float:2.9415E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f32807a
            r3 = 0
            r4 = 20991(0x51ff, float:2.9415E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x024b
        L_0x01f3:
            com.ss.android.ugc.aweme.account.ui.AccountManagerActivity$1 r0 = new com.ss.android.ugc.aweme.account.ui.AccountManagerActivity$1
            r0.<init>()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi.f32698a
            r14 = 1
            r15 = 20872(0x5188, float:2.9248E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.google.common.util.concurrent.k> r2 = com.google.common.util.concurrent.k.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x022a
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi.f32698a
            r14 = 1
            r15 = 20872(0x5188, float:2.9248E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.google.common.util.concurrent.k> r1 = com.google.common.util.concurrent.k.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x024b
        L_0x022a:
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IRetrofitService> r1 = com.ss.android.ugc.aweme.framework.services.IRetrofitService.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.w.a((java.lang.Class<T>) r1)
            com.ss.android.ugc.aweme.framework.services.IRetrofitService r1 = (com.ss.android.ugc.aweme.framework.services.IRetrofitService) r1
            java.lang.String r2 = "https://aweme.snssdk.com"
            com.ss.android.ugc.aweme.framework.services.IRetrofit r1 = r1.createNewRetrofit(r2)
            java.lang.Class<com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi$Api> r2 = com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi.Api.class
            java.lang.Object r1 = r1.create(r2)
            com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi$Api r1 = (com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi.Api) r1
            com.google.common.util.concurrent.q r1 = r1.getBindSetting()
            java.util.concurrent.ExecutorService r2 = com.ss.android.ugc.aweme.e.a.b()
            com.google.common.util.concurrent.l.a(r1, r0, r2)
        L_0x024b:
            java.lang.String r0 = "com.ss.android.ugc.aweme.account.ui.AccountManagerActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.AccountManagerActivity.onCreate(android.os.Bundle):void");
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f32807a, false, 21005, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f32807a, false, 21005, new Class[]{h.class}, Void.TYPE);
            return;
        }
        if (hVar != null) {
            a(hVar.f32759a, "weixin", this.bindWeixinItem);
            a(hVar.f32759a, "qzone_sns", this.bindQQItem);
            a(hVar.f32759a, "sina_weibo", this.bindSinaItem);
            a(hVar.f32759a, "flipchat", this.bindFlipchatItem);
            ArrayList<g> arrayList = hVar.f32759a;
            if (PatchProxy.isSupport(new Object[]{arrayList}, this, f32807a, false, 21006, new Class[]{ArrayList.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{arrayList}, this, f32807a, false, 21006, new Class[]{ArrayList.class}, Void.TYPE);
                return;
            }
            if (!CollectionUtils.isEmpty(arrayList)) {
                g gVar = null;
                Iterator<g> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    g next = it2.next();
                    if (next != null) {
                        if (TextUtils.equals(next.f32758b, "toutiao")) {
                            this.f32810d = true;
                            gVar = next;
                        } else if (TextUtils.equals(next.f32758b, "toutiao_v2")) {
                            this.f32810d = false;
                            gVar = next;
                            break;
                        }
                    }
                }
                if (gVar != null) {
                    this.bindJinritoutiaoItem.setRightText(gVar.f32757a);
                    this.bindJinritoutiaoItem.setTag(gVar.f32757a);
                    if (this.bindToutiaoXiGuaItem.c()) {
                        this.bindToutiaoXiGuaItem.setRightText(gVar.f32757a);
                    }
                    if (this.i && (TextUtils.equals(this.f32809c.f31593c, "toutiao_v2") || TextUtils.equals(this.f32809c.f31593c, "toutiao"))) {
                        this.i = false;
                        if (this.f32812f) {
                            this.f32812f = false;
                            a();
                        } else {
                            if (PatchProxy.isSupport(new Object[0], this, f32807a, false, 21011, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f32807a, false, 21011, new Class[0], Void.TYPE);
                            } else if (!b()) {
                                p.a(this).setTitle((int) C0906R.string.n4).setMessage((int) C0906R.string.ch_).setPositiveButton((int) C0906R.string.ajt, (DialogInterface.OnClickListener) new c(this)).setNegativeButton((int) C0906R.string.pm, d.f33037b).setCancelable(false).show();
                            }
                        }
                    }
                    return;
                }
            }
            this.bindJinritoutiaoItem.setRightText(getString(C0906R.string.bh6));
            this.bindJinritoutiaoItem.setTag("");
        }
    }

    private void b(String str, CommonItemView commonItemView) {
        if (PatchProxy.isSupport(new Object[]{str, commonItemView}, this, f32807a, false, 21000, new Class[]{String.class, CommonItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, commonItemView}, this, f32807a, false, 21000, new Class[]{String.class, CommonItemView.class}, Void.TYPE);
            return;
        }
        this.g = str;
        this.h = commonItemView;
        String str2 = (String) commonItemView.getTag();
        if (!TextUtils.isEmpty(str2)) {
            User k = w.k();
            if (k == null || !k.isPhoneBinded()) {
                c();
                return;
            }
            a(str, str2, commonItemView);
        } else if (a(str)) {
            this.f32809c.a(str);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f32807a, false, 21012, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f32807a, false, 21012, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i4 == 10005) {
            if (intent2 != null && intent2.getIntExtra("error_code", -18) == 1030) {
                dismissProgressDialog();
                p.a(this).setTitle((int) C0906R.string.bi).setMessage((CharSequence) intent2.getStringExtra("dialog_tips")).setNegativeButton((int) C0906R.string.anv, e.f33039b).setCancelable(false).show();
                return;
            }
        } else if (i4 == 1024) {
            if (i5 == -1) {
                a(this.g, this.h);
            }
            return;
        } else if (i4 == 2048) {
            if (i5 == -1) {
                a(this.g, this.h);
            }
            return;
        } else if (i4 == 3072) {
            if (i5 == -1) {
                a(this.g, this.h, 2002, intent2.getStringExtra("ticket"));
            }
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32818a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f32818a, false, 21023, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32818a, false, 21023, new Class[0], Void.TYPE);
                    return;
                }
                if (AccountManagerActivity.this.f32809c != null) {
                    AccountManagerActivity.this.f32809c.a();
                    AccountManagerActivity.this.dismissProgressDialog();
                }
            }
        }, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    private void a(String str, String str2, CommonItemView commonItemView) {
        String str3;
        final String str4 = str;
        String str5 = str2;
        final CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{str4, str5, commonItemView2}, this, f32807a, false, 21008, new Class[]{String.class, String.class, CommonItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, commonItemView2}, this, f32807a, false, 21008, new Class[]{String.class, String.class, CommonItemView.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(str4, getString(C0906R.string.b3v)) || !this.bindToutiaoXiGuaItem.c()) {
            String string = getString(C0906R.string.dni);
            str3 = String.format(string, new Object[]{" " + str5 + " " + str4});
        } else {
            str3 = getString(C0906R.string.dnl);
        }
        AlertDialog a2 = bc.a(this, String.format(getString(C0906R.string.dnh), new Object[]{str4}), str3, C0906R.string.pm, new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32831a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32831a, false, 21031, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32831a, false, 21031, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dialogInterface.dismiss();
            }
        }, C0906R.string.bt, new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32833a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32833a, false, 21032, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32833a, false, 21032, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                AccountManagerActivity.this.a(str4, commonItemView2);
                dialogInterface.dismiss();
            }
        });
        a2.setCanceledOnTouchOutside(false);
        a2.setCancelable(false);
    }

    private void a(ArrayList<g> arrayList, String str, CommonItemView commonItemView) {
        String str2 = str;
        CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{arrayList, str2, commonItemView2}, this, f32807a, false, 21007, new Class[]{ArrayList.class, String.class, CommonItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList, str2, commonItemView2}, this, f32807a, false, 21007, new Class[]{ArrayList.class, String.class, CommonItemView.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            Iterator<g> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                g next = it2.next();
                if (next != null && TextUtils.equals(next.f32758b, str2)) {
                    commonItemView2.setRightText(next.f32757a);
                    commonItemView2.setTag(next.f32757a);
                    if ("toutiao".equals(str2) && this.bindToutiaoXiGuaItem.c()) {
                        this.bindToutiaoXiGuaItem.setRightText(next.f32757a);
                    }
                    return;
                }
            }
        }
        commonItemView2.setRightText(getString(C0906R.string.bh6));
        commonItemView2.setTag("");
    }

    private void a(String str, CommonItemView commonItemView, int i2, String str2) {
        final String str3 = str;
        final CommonItemView commonItemView2 = commonItemView;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, commonItemView2, Integer.valueOf(i2), str4}, this, f32807a, false, 21004, new Class[]{String.class, CommonItemView.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, commonItemView2, Integer.valueOf(i2), str4}, this, f32807a, false, 21004, new Class[]{String.class, CommonItemView.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (!TextUtils.equals(str3, getString(C0906R.string.dti)) || WXAPIFactory.createWXAPI(this, "wx76fdd06dde311af3", true).isWXAppInstalled()) {
            final String a2 = this.f32809c.a(str3, this.f32810d);
            this.f32809c.a(a2, i2, str4, new com.bytedance.sdk.account.api.call.a<BaseApiResponse>() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32827c;

                public final void a(BaseApiResponse baseApiResponse) {
                    String str;
                    BaseApiResponse baseApiResponse2 = baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{baseApiResponse2}, this, f32827c, false, 21030, new Class[]{BaseApiResponse.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{baseApiResponse2}, this, f32827c, false, 21030, new Class[]{BaseApiResponse.class}, Void.TYPE);
                    } else if (AccountManagerActivity.this.isViewValid()) {
                        if (baseApiResponse2.success) {
                            commonItemView2.setRightText(AccountManagerActivity.this.getString(C0906R.string.bh6));
                            commonItemView2.setTag("");
                            com.bytedance.ies.dmt.ui.d.a.a(AccountManagerActivity.this.getBaseContext(), (int) C0906R.string.dng).a();
                            com.ss.android.ugc.aweme.account.a.a.b a2 = com.ss.android.ugc.aweme.account.a.a.b.a();
                            if (FlipChat.INSTANCE.isAppInstall(AccountManagerActivity.this)) {
                                str = "yes";
                            } else {
                                str = "no";
                            }
                            r.a("flipchat_authorize_result", (Map) a2.a("is_installed", str).a("user_enter_type", "settings").a("is_successful", "no").f31599b);
                            if (TextUtils.equals(str3, AccountManagerActivity.this.getString(C0906R.string.b3v)) && AccountManagerActivity.this.bindToutiaoXiGuaItem.c()) {
                                AccountManagerActivity.this.a();
                            }
                            com.ss.android.sdk.b.c[] cVarArr = com.ss.android.sdk.b.b.a().f30690a;
                            if (cVarArr != null) {
                                String a3 = AccountManagerActivity.this.f32809c.a(str3, AccountManagerActivity.this.f32810d);
                                int length = cVarArr.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    com.ss.android.sdk.b.c cVar = cVarArr[i];
                                    if (TextUtils.equals(cVar.l, a3)) {
                                        cVar.o = false;
                                        AccountManagerActivity.this.f32810d = false;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.account.util.r.f33113a, true, 21435, new Class[0], i.class)) {
                                i iVar = (i) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.account.util.r.f33113a, true, 21435, new Class[0], i.class);
                            } else {
                                com.ss.android.ugc.aweme.account.util.r.b().b(x.f33125b, i.f1052b);
                            }
                            w.f().b(a2);
                            return;
                        }
                        if (!d.a(baseApiResponse2.result, AccountManagerActivity.this, 0)) {
                            com.bytedance.ies.dmt.ui.d.a.b(AccountManagerActivity.this.getBaseContext(), (int) C0906R.string.dnd).a();
                        }
                    }
                }
            });
        } else {
            IESUIUtils.displayToast(getBaseContext(), (int) C0906R.string.cnb);
        }
    }
}
