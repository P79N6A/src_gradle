package com.ss.android.ugc.aweme.setting.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.iesapi.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.setting.d.i;
import com.ss.android.ugc.aweme.setting.d.j;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.setting.serverpush.b.b;
import com.ss.android.ugc.aweme.setting.serverpush.b.e;
import com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.eb;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class PrivacyActivity extends AmeBaseActivity implements View.OnClickListener, r, j, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64171a;

    /* renamed from: b  reason: collision with root package name */
    protected ad f64172b;

    /* renamed from: c  reason: collision with root package name */
    private i f64173c;
    @BindView(2131496444)
    CommonItemView contactItem;

    /* renamed from: d  reason: collision with root package name */
    private e f64174d;

    /* renamed from: e  reason: collision with root package name */
    private int f64175e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f64176f;
    private int g = -1;
    @BindView(2131493213)
    ImageView mBack;
    @BindView(2131496443)
    CommonItemView mBlockListItem;
    @BindView(2131493641)
    CommonItemView mCommentManagerItem;
    @BindView(2131496446)
    protected CommonItemView mDuetItem;
    @BindView(2131496449)
    CommonItemView mPrivacyManagerItem;
    @BindView(2131496447)
    CommonItemView mPrivateAccount;
    @BindView(2131496448)
    CommonItemView mReactItem;
    @BindView(2131497590)
    TextView mTitle;
    @BindView(2131498628)
    CommonItemView mWhoCanSeeMyLikeListItem;
    private boolean u;
    private boolean v;

    public final int a() {
        return C0906R.layout.da;
    }

    public final void a(String str, boolean z) {
    }

    public final void a(boolean z) {
    }

    public final void d_(Exception exc) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72568, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64171a, false, 72569, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64171a, false, 72569, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @OnClick({2131493213})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72545, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72558, new Class[0], Void.TYPE);
            return;
        }
        if (this.f64173c != null) {
            this.f64173c.k();
        }
        super.onDestroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72542, new Class[0], Void.TYPE);
            return;
        }
        eb.a(this, getResources().getColor(C0906R.color.yx));
    }

    public final void af_() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72556, new Class[0], Void.TYPE);
            return;
        }
        this.contactItem.setChecked(!this.contactItem.c());
        d.a().updateCurHideSearch(!this.contactItem.c());
        FusionFuelSdk.setHostRecommendMeSwitchStatus(!this.contactItem.c());
        if (this.contactItem.c()) {
            str = "shield_on";
        } else {
            str = "shield_off";
        }
        a.a(this, "shield", str);
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64171a, false, 72560, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64171a, false, 72560, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f64176f = i;
        x.a().g().a(Integer.valueOf(i));
        bg.a(new af());
        if (i == 0) {
            this.mWhoCanSeeMyLikeListItem.setRightText(getString(C0906R.string.eb));
            return;
        }
        if (i == 1) {
            this.mWhoCanSeeMyLikeListItem.setRightText(getString(C0906R.string.bk_));
        }
    }

    private void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64171a, false, 72561, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64171a, false, 72561, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f64175e = i;
        String[] stringArray = getResources().getStringArray(C0906R.array.h);
        if (i == com.ss.android.ugc.aweme.setting.d.f63933b) {
            this.mCommentManagerItem.setRightText(stringArray[0]);
        } else if (i == com.ss.android.ugc.aweme.setting.d.f63934c) {
            this.mCommentManagerItem.setRightText(stringArray[1]);
        } else {
            if (i == com.ss.android.ugc.aweme.setting.d.f63936e) {
                this.mCommentManagerItem.setRightText(stringArray[3]);
            }
        }
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64171a, false, 72549, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64171a, false, 72549, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mPrivateAccount.setChecked(z);
    }

    private void c(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64171a, false, 72563, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64171a, false, 72563, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i;
        if (-1 == this.g) {
            if (com.ss.android.g.a.b()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            this.g = i2;
        }
        if (i == 1) {
            this.mPrivacyManagerItem.setRightText(getResources().getString(C0906R.string.eb));
        } else if (i == 2) {
            this.mPrivacyManagerItem.setRightText(getResources().getString(C0906R.string.bk9));
        } else {
            if (i == 3) {
                this.mPrivacyManagerItem.setRightText(getResources().getString(C0906R.string.bjd));
            }
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f64171a, false, 72557, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f64171a, false, 72557, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bki).a();
    }

    public void onShieldSwitcherClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f64171a, false, 72555, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64171a, false, 72555, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.contactItem.c()) {
            this.f64173c.a(1);
        } else {
            this.f64173c.a(0);
        }
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().getString("source", "").equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE))) {
            HashMap hashMap = new HashMap();
            if (this.contactItem.c()) {
                str = "off";
            } else {
                str = "on";
            }
            hashMap.put("final_status", str);
            com.ss.android.ugc.aweme.common.r.a("allow_recommend_status", (Map) hashMap);
        }
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f64171a, false, 72544, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f64171a, false, 72544, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != null) {
            this.u = cVar.t;
            b(cVar.k);
            c(cVar.s);
            a(cVar.v);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64171a, false, 72548, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64171a, false, 72548, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.v = z;
        c(z);
        this.f64172b.a(z);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64171a, false, 72546, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64171a, false, 72546, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.c64) {
            onShieldSwitcherClick(view);
            return;
        }
        if (id == C0906R.id.c69) {
            if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72554, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72554, new Class[0], Void.TYPE);
            } else {
                if (!isFinishing()) {
                    int i = this.g;
                    boolean z = this.u;
                    if (PatchProxy.isSupport(new Object[]{this, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), 1}, null, ChatControlSettingActivity.f64127e, true, 72427, new Class[]{Activity.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{this, Integer.valueOf(i), Byte.valueOf(z), 1}, null, ChatControlSettingActivity.f64127e, true, 72427, new Class[]{Activity.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        Intent intent = new Intent(this, ChatControlSettingActivity.class);
                        intent.putExtra("chat_set", i);
                        intent.putExtra("chat_setting_open_everyone", z);
                        startActivityForResult(intent, 1);
                    }
                }
            }
        } else if (id == C0906R.id.c63) {
            if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72553, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72553, new Class[0], Void.TYPE);
            } else {
                startActivity(new Intent(this, BlackListActivity.class));
                com.ss.android.ugc.aweme.common.r.onEvent(new MobClick().setEventName("black_list").setLabelName("message"));
            }
        } else if (id == C0906R.id.vf) {
            if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72551, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72551, new Class[0], Void.TYPE);
            } else {
                int i2 = this.f64175e;
                if (PatchProxy.isSupport(new Object[]{this, Integer.valueOf(i2), 3}, null, CommentControlSettingActivity.f64133e, true, 72443, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this, Integer.valueOf(i2), 3}, null, CommentControlSettingActivity.f64133e, true, 72443, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    Intent intent2 = new Intent(this, CommentControlSettingActivity.class);
                    intent2.putExtra("currentSettingsValue", i2);
                    startActivityForResult(intent2, 3);
                }
            }
        } else if (id == C0906R.id.dxl) {
            if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72550, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72550, new Class[0], Void.TYPE);
            } else {
                int i3 = this.f64176f;
                if (PatchProxy.isSupport(new Object[]{this, Integer.valueOf(i3), 7}, null, WhoCanSeeMyLikeListActivity.f64389e, true, 72873, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this, Integer.valueOf(i3), 7}, null, WhoCanSeeMyLikeListActivity.f64389e, true, 72873, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    WhoCanSeeMyLikeListActivity.a aVar = WhoCanSeeMyLikeListActivity.h;
                    Object[] objArr = {this, Integer.valueOf(i3), 7};
                    if (PatchProxy.isSupport(objArr, aVar, WhoCanSeeMyLikeListActivity.a.f64391a, false, 72877, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr2 = {this, Integer.valueOf(i3), 7};
                        Object[] objArr3 = objArr2;
                        WhoCanSeeMyLikeListActivity.a aVar2 = aVar;
                        PatchProxy.accessDispatch(objArr3, aVar2, WhoCanSeeMyLikeListActivity.a.f64391a, false, 72877, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(this, "context");
                        Intent intent3 = new Intent(this, WhoCanSeeMyLikeListActivity.class);
                        intent3.putExtra("currentSettingsValue", i3);
                        startActivityForResult(intent3, 7);
                    }
                }
            }
        } else if (id == C0906R.id.c67) {
            if (this.v) {
                com.ss.android.ugc.aweme.common.r.a("click_private_account_button", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("final_status", "off").f34114b);
                if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72547, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72547, new Class[0], Void.TYPE);
                } else {
                    new a.C0185a(this).b((int) C0906R.string.s0).a((int) C0906R.string.rz).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f64177a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64177a, false, 72570, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64177a, false, 72570, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            PrivacyActivity.this.b(false);
                            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.followrequest.c.f48258a, true, 45304, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.followrequest.c.f48258a, true, 45304, new Class[0], Void.TYPE);
                            } else {
                                z.a("change_approve").a("type", "account").e();
                            }
                        }
                    }).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a().b();
                }
            } else {
                com.ss.android.ugc.aweme.common.r.a("click_private_account_button", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("final_status", "on").f34114b);
                b(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f64171a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 72539(0x11b5b, float:1.01649E-40)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f64171a
            r3 = 0
            r4 = 72539(0x11b5b, float:1.01649E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.setting.ui.PrivacyActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r19)
            android.widget.TextView r0 = r7.mTitle
            r1 = 2131562358(0x7f0d0f76, float:1.8750143E38)
            r0.setText(r1)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64171a
            r3 = 0
            r4 = 72540(0x11b5c, float:1.0165E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r8 = 8
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64171a
            r3 = 0
            r4 = 72540(0x11b5c, float:1.0165E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x014d
        L_0x0071:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x0091
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            com.ss.android.ugc.aweme.app.an r0 = r0.y()
            java.lang.Object r0 = r0.c()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0091
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mPrivateAccount
            r0.setVisibility(r8)
            goto L_0x009b
        L_0x0091:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mPrivateAccount
            r0.setVisibility(r10)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mPrivateAccount
            r0.setOnClickListener(r7)
        L_0x009b:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.contactItem
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            boolean r1 = r1.isHideSearch()
            r1 = r1 ^ r9
            r0.setChecked(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mPrivacyManagerItem
            boolean r1 = com.ss.android.ugc.aweme.im.b.b()
            if (r1 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.antiaddic.lock.b r1 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33435a
            r14 = 0
            r15 = 21734(0x54e6, float:3.0456E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00e4
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.antiaddic.lock.b.f33435a
            r14 = 0
            r15 = 21734(0x54e6, float:3.0456E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r9 = r1.booleanValue()
            goto L_0x00f7
        L_0x00e4:
            com.ss.android.ugc.aweme.setting.serverpush.a.c r1 = com.ss.android.ugc.aweme.antiaddic.lock.b.a()
            if (r1 != 0) goto L_0x00eb
            goto L_0x00f7
        L_0x00eb:
            com.ss.android.ugc.aweme.setting.serverpush.a.c r1 = com.ss.android.ugc.aweme.antiaddic.lock.b.a()
            if (r1 == 0) goto L_0x00f6
            int r1 = r1.F
            if (r1 != r9) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r9 = 0
        L_0x00f7:
            if (r9 == 0) goto L_0x00fb
            r1 = 0
            goto L_0x00fd
        L_0x00fb:
            r1 = 8
        L_0x00fd:
            r0.setVisibility(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mDuetItem
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x010a
            r1 = 0
            goto L_0x010c
        L_0x010a:
            r1 = 8
        L_0x010c:
            r0.setVisibility(r1)
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x011b
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.contactItem
            r1 = 0
            r0.setDesc(r1)
        L_0x011b:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mReactItem
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r1 = r1.avSettingsService()
            boolean r1 = r1.enableReact()
            if (r1 == 0) goto L_0x013b
            r1 = 0
            goto L_0x013d
        L_0x013b:
            r1 = 8
        L_0x013d:
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            com.ss.android.ugc.aweme.app.an r0 = r0.c()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.a(r1)
        L_0x014d:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64171a
            r3 = 0
            r4 = 72541(0x11b5d, float:1.01652E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0173
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64171a
            r3 = 0
            r4 = 72541(0x11b5d, float:1.01652E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01c5
        L_0x0173:
            com.ss.android.ugc.aweme.setting.d.i r0 = new com.ss.android.ugc.aweme.setting.d.i
            r0.<init>()
            r7.f64173c = r0
            com.ss.android.ugc.aweme.setting.d.i r0 = r7.f64173c
            r0.a(r7)
            com.ss.android.ugc.aweme.setting.serverpush.b.e r0 = new com.ss.android.ugc.aweme.setting.serverpush.b.e
            r0.<init>()
            r7.f64174d = r0
            com.ss.android.ugc.aweme.setting.serverpush.b.e r0 = r7.f64174d
            r0.a(r7)
            com.ss.android.ugc.aweme.setting.serverpush.b.e r0 = r7.f64174d
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r0.a((java.lang.Object[]) r1)
            boolean r0 = com.ss.android.ugc.aweme.setting.d.a()
            if (r0 == 0) goto L_0x019e
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mCommentManagerItem
            r0.setVisibility(r10)
            goto L_0x01a3
        L_0x019e:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mCommentManagerItem
            r0.setVisibility(r8)
        L_0x01a3:
            com.ss.android.ugc.aweme.profile.presenter.ad r0 = new com.ss.android.ugc.aweme.profile.presenter.ad
            r0.<init>()
            r7.f64172b = r0
            com.ss.android.ugc.aweme.profile.presenter.ad r0 = r7.f64172b
            r0.h = r7
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r0.isSecret()
            r7.v = r0
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mPrivateAccount
            boolean r1 = r7.v
            r0.setChecked(r1)
        L_0x01c5:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64171a
            r3 = 0
            r4 = 72543(0x11b5f, float:1.01654E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01eb
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64171a
            r3 = 0
            r4 = 72543(0x11b5f, float:1.01654E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0204
        L_0x01eb:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.contactItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mPrivacyManagerItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mBlockListItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mCommentManagerItem
            r0.setOnClickListener(r7)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mWhoCanSeeMyLikeListItem
            r0.setOnClickListener(r7)
        L_0x0204:
            java.lang.String r0 = "com.ss.android.ugc.aweme.setting.ui.PrivacyActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.PrivacyActivity.onCreate(android.os.Bundle):void");
    }

    public final void a(User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f64171a, false, 72564, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f64171a, false, 72564, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v = user.isSecret();
        if (this.v) {
            if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72566, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72566, new Class[0], Void.TYPE);
            } else {
                new com.ss.android.ugc.aweme.iesapi.a.c(this).b(new a.C0592a() {
                    public final void a() {
                    }

                    public final void a(String str) {
                    }
                });
            }
            if (PatchProxy.isSupport(new Object[0], this, f64171a, false, 72565, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64171a, false, 72565, new Class[0], Void.TYPE);
                return;
            }
            new com.ss.android.ugc.aweme.iesapi.a.b(this).b(new a.C0592a() {
                public final void a() {
                }

                public final void a(String str) {
                }
            });
        }
    }

    public final void a(Exception exc, int i) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, f64171a, false, 72567, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, f64171a, false, 72567, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 122) {
            this.v = !this.v;
            c(this.v);
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bki).a();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f64171a, false, 72559, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f64171a, false, 72559, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (1 == i3 && i4 == -1) {
            int intExtra = intent2.getIntExtra("currentSettingsValue", -1);
            if (!(-1 == intExtra || intExtra == this.g)) {
                c(intExtra);
            }
        } else if (3 == i3 && i4 == -1) {
            int intExtra2 = intent2.getIntExtra("currentSettingsValue", -1);
            if (!(-1 == intExtra2 || intExtra2 == this.f64175e)) {
                b(intExtra2);
            }
        } else {
            if (7 == i3 && i4 == -1) {
                int intExtra3 = intent2.getIntExtra("currentSettingsValue", -1);
                if (!(-1 == intExtra3 || intExtra3 == this.f64176f)) {
                    a(intExtra3);
                }
            }
        }
    }
}
