package com.ss.android.ugc.aweme.setting.ui;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.login.k;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.poi.api.PoiMerchantApi;
import com.ss.android.ugc.aweme.profile.d.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.setting.api.d;
import com.ss.android.ugc.aweme.u.ah;
import com.ss.android.ugc.aweme.u.f;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.z;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

@SuppressLint({"LogNotTimber"})
public class SettingAccountAndSafetyActivity extends AmeBaseActivity implements View.OnClickListener, d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3858a;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f3859e = a.a();

    /* renamed from: b  reason: collision with root package name */
    boolean f3860b;

    /* renamed from: c  reason: collision with root package name */
    String f3861c;

    /* renamed from: d  reason: collision with root package name */
    public IAccountService f3862d;

    /* renamed from: f  reason: collision with root package name */
    private d f3863f;
    private boolean g;
    @BindView(2131493201)
    CommonItemView mAwemeIdText;
    @BindView(2131493204)
    CommonItemView mAwmePwdItem;
    @BindView(2131493291)
    CommonItemView mBindPhoneItem;
    @BindView(2131493292)
    CommonItemView mBindThirdAccountItem;
    @BindView(2131493514)
    CommonItemView mCertificationItem;
    @BindView(2131493933)
    CommonItemView mDeviceManagerItem;
    @BindView(2131496133)
    CommonItemView mPersonalAuthItem;
    @BindView(2131496277)
    View mPoiDivider;
    @BindView(2131496193)
    CommonItemView mPoiMerchantEntranceItem;
    @BindView(2131495847)
    CommonItemView mQrCodeItem;
    @BindView(2131493205)
    CommonItemView mSafetyCenterItem;
    @BindView(2131496895)
    CommonItemView mSaveLoginInfoItem;
    @BindView(2131497590)
    TextView mTitle;
    private User u;

    public final int a() {
        return C0906R.layout.dv;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3858a, false, 72623, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3858a, false, 72623, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAccountAndSafetyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72615, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72615, new Class[0], Void.TYPE);
            return;
        }
        eb.a(this, getResources().getColor(C0906R.color.yx));
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72600, new Class[0], Void.TYPE);
            return;
        }
        this.mTitle.setText(C0906R.string.c4y);
        this.f3863f = new d();
        this.f3863f.f63849b = this;
        this.f3863f.a();
        this.u = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        d();
        h();
    }

    private void d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72601, new Class[0], Void.TYPE);
            return;
        }
        if (this.u != null) {
            if (TextUtils.isEmpty(this.u.getUniqueId())) {
                str = this.u.getShortId();
            } else {
                str = this.u.getUniqueId();
            }
            this.mAwemeIdText.setRightText(str);
        }
    }

    private void h() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72604, new Class[0], Void.TYPE);
            return;
        }
        switch (com.ss.android.ugc.aweme.account.d.a().getCurUser().getVerifyStatus()) {
            case 0:
            case 3:
                str = getString(C0906R.string.bw3);
                break;
            case 1:
                str = getString(C0906R.string.bw0);
                break;
            case 2:
                str = getString(C0906R.string.bvz);
                break;
            default:
                str = getString(C0906R.string.bw3);
                break;
        }
        this.mCertificationItem.setRightText(str);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72605, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAccountAndSafetyActivity", "onResume", true);
        super.onResume();
        d();
        if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72602, new Class[0], Void.TYPE);
        } else {
            String bindPhone = com.ss.android.ugc.aweme.account.d.a().getCurUser().getBindPhone();
            this.mAwmePwdItem.setVisibility(0);
            if (!TextUtils.isEmpty(bindPhone)) {
                this.f3860b = true;
                this.f3861c = bindPhone;
                this.mBindPhoneItem.setRightText(this.f3861c);
                Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839275);
                a2.setBounds(0, 0, a2.getMinimumWidth() + 2, a2.getMinimumHeight());
                ((TextView) this.mBindPhoneItem.findViewById(C0906R.id.dlv)).setCompoundDrawables(a2, null, null, null);
            } else {
                this.mBindPhoneItem.setRightText(getString(C0906R.string.bh6));
            }
        }
        h();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAccountAndSafetyActivity", "onResume", false);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3858a, false, 72622, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3858a, false, 72622, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) this, str).a();
    }

    @OnClick({2131493213})
    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3858a, false, 72620, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3858a, false, 72620, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3858a, false, 72621, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3858a, false, 72621, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = z;
        if (z) {
            this.mAwmePwdItem.setRightText(getString(C0906R.string.c57));
        } else {
            this.mAwmePwdItem.setRightText(getString(C0906R.string.c5c));
        }
    }

    @Subscribe
    public void onBindMobileFinishEvent(com.ss.android.ugc.aweme.account.e.a aVar) {
        com.ss.android.ugc.aweme.account.e.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3858a, false, 72606, new Class[]{com.ss.android.ugc.aweme.account.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3858a, false, 72606, new Class[]{com.ss.android.ugc.aweme.account.e.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new q(this, aVar2), 500);
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f3858a, false, 72597, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, f3858a, false, 72597, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        if (intent2.getBooleanExtra("KEY_EXTRA_REFRESH_USER_INFO", false)) {
            c();
        }
    }

    public void onCreate(Bundle bundle) {
        Integer num;
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3858a, false, 72596, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3858a, false, 72596, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAccountAndSafetyActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f3862d = c.a();
        if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72598, new Class[0], Void.TYPE);
        } else {
            if (((k) z.a(this, k.class)).b(true)) {
                this.mSaveLoginInfoItem.setChecked(true);
            }
            int i = 8;
            if (PoiMerchantApi.b()) {
                this.mPoiMerchantEntranceItem.setVisibility(0);
                this.mPoiDivider.setVisibility(0);
                this.mPoiMerchantEntranceItem.setDesc(getString(C0906R.string.c5g));
            } else {
                String str2 = null;
                try {
                    str2 = g.b().aq().getMerchantSettleUrl();
                } catch (com.bytedance.ies.a unused) {
                }
                if (TextUtils.isEmpty(str2)) {
                    this.mPoiMerchantEntranceItem.setVisibility(8);
                    this.mPoiDivider.setVisibility(8);
                } else {
                    this.mPoiMerchantEntranceItem.setDesc(getString(C0906R.string.c5h));
                    this.mPoiMerchantEntranceItem.setVisibility(0);
                    this.mPoiDivider.setVisibility(0);
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72599, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72599, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
                if (PatchProxy.isSupport(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48766, new Class[0], Integer.class)) {
                    num = (Integer) PatchProxy.accessDispatch(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48766, new Class[0], Integer.class);
                } else if (b2.f49569c == null) {
                    num = b2.f49568b.getShowDeviceManagerEntry();
                } else {
                    num = (Integer) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(b2.f49569c, "show_device_manager_entry", Integer.class, b2.f49568b.getShowDeviceManagerEntry());
                }
                int intValue = num.intValue();
                if (f3859e) {
                    StringBuilder sb = new StringBuilder("Device manager feature ");
                    if (intValue == 1) {
                        str = "enabled";
                    } else {
                        str = "disabled";
                    }
                    sb.append(str);
                }
                CommonItemView commonItemView = this.mDeviceManagerItem;
                if (intValue == 1) {
                    i = 0;
                }
                commonItemView.setVisibility(i);
            }
        }
        c();
        if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72603, new Class[0], Void.TYPE);
        } else {
            this.mAwemeIdText.setOnClickListener(this);
            this.mBindPhoneItem.setOnClickListener(this);
            this.mBindThirdAccountItem.setOnClickListener(this);
            this.mSaveLoginInfoItem.setOnClickListener(this);
            this.mAwmePwdItem.setOnClickListener(this);
            this.mCertificationItem.setOnClickListener(this);
            this.mDeviceManagerItem.setOnClickListener(this);
            this.mPersonalAuthItem.setOnClickListener(this);
            this.mSafetyCenterItem.setOnClickListener(this);
            this.mQrCodeItem.setOnClickListener(this);
            this.mPoiMerchantEntranceItem.setOnClickListener(this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAccountAndSafetyActivity", "onCreate", false);
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3858a, false, 72607, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3858a, false, 72607, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.ik) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72608, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72608, new Class[0], Void.TYPE);
                } else {
                    if (this.u != null) {
                        if (TextUtils.isEmpty(this.u.getUniqueId())) {
                            str3 = this.u.getShortId();
                        } else {
                            str3 = this.u.getUniqueId();
                        }
                        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str3, str3));
                        UIUtils.displayToast((Context) this, (int) C0906R.string.ao3);
                    }
                }
            }
        } else if (id == C0906R.id.l9) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72610, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72610, new Class[0], Void.TYPE);
                } else if (this.f3860b) {
                    if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72611, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72611, new Class[0], Void.TYPE);
                    } else if (!TextUtils.isEmpty(this.f3861c) && this.f3861c.length() >= 11) {
                        AlertDialog a2 = bc.a(this, getString(C0906R.string.rt), this.f3861c, C0906R.string.pm, new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f64191a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64191a, false, 72625, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64191a, false, 72625, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                dialogInterface.dismiss();
                            }
                        }, C0906R.string.bg, new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f64193a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64193a, false, 72626, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64193a, false, 72626, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                SettingAccountAndSafetyActivity.this.f3862d.bindService().modifyMobile(SettingAccountAndSafetyActivity.this, "", null, new com.ss.android.ugc.aweme.app.accountsdk.k("setting"));
                                dialogInterface.dismiss();
                            }
                        });
                        a2.setCanceledOnTouchOutside(false);
                        a2.setCancelable(false);
                    }
                    r.a((Context) this, "account_click", "modify_phone", com.ss.android.ugc.aweme.account.d.a().getCurUserId(), 0);
                } else {
                    r.a("enter_phone_binding", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("previous_page", "account_security_settings").a("enter_method", "click_button").f34114b);
                    this.f3862d.bindService().bindMobile(this, "setting", null, new com.ss.android.ugc.aweme.app.accountsdk.k("setting"));
                }
            }
        } else if (id == C0906R.id.l_) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72612, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72612, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.u.z.a("enter_third_party_binding").a("previous_page", "account_security_settings").a("enter_method", "click_button").h().e();
                    this.f3862d.bindService().showThirdPartyAccountManagerActivity(this);
                }
            }
        } else if (id == C0906R.id.cjc) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72613, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72613, new Class[0], Void.TYPE);
                } else {
                    k kVar = (k) z.a(this, k.class);
                    kVar.a(!kVar.b(true));
                    r.a("switch_login_save", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("state", kVar.b(true) ? 1 : 0).f34114b);
                    this.mSaveLoginInfoItem.setChecked(kVar.b(true));
                }
            }
        } else if (id == C0906R.id.in) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72614, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72614, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.u.z.a("enter_password_settings").a("previous_page", "account_security_settings").a("enter_method", "click_button").h().e();
                    r.a((Context) this, "account_click", "modify_psd", com.ss.android.ugc.aweme.account.d.a().getCurUserId(), 0);
                    if (this.g) {
                        new f().e();
                    } else {
                        new ah().e();
                    }
                    if (TextUtils.isEmpty(com.ss.android.ugc.aweme.account.d.a().getCurUser().getBindPhone())) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) this, getString(C0906R.string.bn7)).a();
                    } else if (this.g) {
                        new f().e();
                        this.f3862d.passwordService().changePassword(this, null);
                    } else {
                        new ah().e();
                        this.f3862d.passwordService().setPassword(this, null);
                    }
                }
            }
        } else if (id == C0906R.id.rd) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72616, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72616, new Class[0], Void.TYPE);
                } else if (com.ss.android.ugc.aweme.account.d.a().getCurUser().getVerifyStatus() == 1) {
                    com.bytedance.ies.dmt.ui.d.a.c((Context) this, getString(C0906R.string.bw2)).a();
                } else {
                    com.ss.android.ugc.aweme.u.z.a("enter_self_verification").a("previous_page", "account_security_settings").a("enter_method", "click_button").h().e();
                    if (com.ss.android.ugc.aweme.zhima.a.a()) {
                        c.c().bindMobile(this, "account_security_settings", null, new com.ss.android.ugc.aweme.app.accountsdk.k("setting"));
                        finish();
                    } else {
                        Intent intent = new Intent(this, CrossPlatformActivity.class);
                        Bundle bundle = new Bundle();
                        intent.putExtra("hide_nav_bar", true);
                        intent.putExtras(bundle);
                        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.zhima.a.f76951a, true, 90159, new Class[]{Context.class}, String.class)) {
                            str2 = (String) PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.zhima.a.f76951a, true, 90159, new Class[]{Context.class}, String.class);
                        } else if (com.ss.android.ugc.aweme.zhima.a.a(this, "other")) {
                            str2 = "https://aweme.snssdk.com/falcon/douyin_falcon/certification";
                        } else {
                            str2 = "https://aweme.snssdk.com/falcon/douyin_falcon/arti_certification";
                        }
                        if (com.ss.android.ugc.aweme.account.d.a().getCurUser().getVerifyStatus() == 2) {
                            str2 = "https://aweme.snssdk.com/falcon/douyin_falcon/certed/";
                        }
                        intent.setData(Uri.parse(str2));
                        startActivity(intent);
                    }
                }
            }
        } else if (id == C0906R.id.a4b) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72617, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72617, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.u.z.a("enter_device_management").a("previous_page", "account_security_settings").a("enter_method", "click_button").h().e();
                    if (!NetworkUtils.isNetworkAvailable(this)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
                    } else {
                        i iVar = new i("https://aweme-hl.snssdk.com/passport/safe/login_device/index/");
                        iVar.a("aid", 1128);
                        iVar.a("locale", "zh-Hans-CN");
                        String a3 = iVar.a();
                        Intent intent2 = new Intent(this, CrossPlatformActivity.class);
                        intent2.setData(Uri.parse(a3));
                        intent2.putExtra("hide_nav_bar", true);
                        startActivity(intent2);
                    }
                }
            }
        } else if (id == C0906R.id.bxi) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72618, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72618, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.u.z.a("enter_office_certification").a("previous_page", "account_security_settings").a("enter_method", "click_button").h().e();
                    n.a(this, false, "settings");
                }
            }
        } else if (id == C0906R.id.f4425io) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72619, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72619, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.u.z.a("enter_security_center").a("previous_page", "account_security_settings").a("enter_method", "click_button").h().e();
                    Intent intent3 = new Intent(this, CrossPlatformActivity.class);
                    String str4 = "https://aweme.snssdk.com/falcon/douyin_falcon/security/";
                    if (((Integer) SharePrefCache.inst().getUseNewDouyinSaftyCenter().c()).intValue() == 1) {
                        str4 = String.format("https://security.snssdk.com/passport/safe/aweme/center.html?did=%s", new Object[]{AppLog.getServerDeviceId()});
                    }
                    intent3.setData(Uri.parse(str4));
                    intent3.putExtra("hide_nav_bar", true);
                    startActivity(intent3);
                }
            }
        } else if (id == C0906R.id.bpc) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3858a, false, 72609, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3858a, false, 72609, new Class[0], Void.TYPE);
                } else {
                    User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                    QRCodeActivityV2.a(this, new d.a().a(4, ex.h(curUser), "personal_homepage").a(ex.i(curUser), ex.j(curUser), ex.e(curUser)).f63387b);
                }
            }
        } else if (id == C0906R.id.bz_) {
            if (PoiMerchantApi.b()) {
                try {
                    str = g.b().aq().getMerchantManagementUrl();
                } catch (com.bytedance.ies.a unused) {
                    str = null;
                }
            } else {
                str = g.b().aq().getMerchantSettleUrl();
            }
            if (!TextUtils.isEmpty(str)) {
                r.a("click_im_seller", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "account_security_settings").a("previous_page", "account_security_settings").f34114b);
                h.a().a(com.ss.android.ugc.aweme.music.util.f.a(str).a("enter_from", "account_security_settings").a().toString());
            }
        }
    }
}
