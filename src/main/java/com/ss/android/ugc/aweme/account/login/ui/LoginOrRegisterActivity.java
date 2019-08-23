package com.ss.android.ugc.aweme.account.login.ui;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChat;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatRequestController;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.login.c.b;
import com.ss.android.ugc.aweme.account.terminal.a;
import com.ss.android.ugc.aweme.account.util.m;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.w;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public class LoginOrRegisterActivity extends BaseLoginOrRegisterActivity {
    public static ChangeQuickRedirect B;
    private static final boolean C = a.a();
    private o<OneLoginPhoneBean> D;
    private FlipChatRequestController E;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, B, false, 20590, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, B, false, 20590, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, B, false, 20591, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, B, false, 20591, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, B, false, 20586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, B, false, 20586, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        b a2 = b.a();
        if (this.D == a2.f32186b) {
            a2.f32186b = null;
        }
        if (this.E != null) {
            this.E.completeRequest();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, B, false, 20584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, B, false, 20584, new Class[0], Void.TYPE);
            return;
        }
        if (w.i().isEnableOneClickLogin()) {
            if (PatchProxy.isSupport(new Object[0], this, B, false, 20583, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, B, false, 20583, new Class[0], Void.TYPE);
            } else {
                bc.a(this.A);
                this.D = new k(this, System.currentTimeMillis());
                b.a().a(this.D);
                b.a().a(this, PushConstants.WORK_RECEIVER_EVENTCORE_ERROR, this.z);
            }
        } else {
            d();
        }
    }

    public void onBackPressed() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, B, false, 20587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, B, false, 20587, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, B, false, 20589, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, B, false, 20589, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            if (!CollectionUtils.isEmpty(fragments)) {
                getSupportFragmentManager().getFragments().get(fragments.size() - 1);
            }
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, B, false, 20588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, B, false, 20588, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        boolean h = w.h();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(h ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.account.terminal.a.f32775a, true, 20931, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(h)}, null, com.ss.android.ugc.aweme.account.terminal.a.f32775a, true, 20931, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a.C0415a aVar = com.ss.android.ugc.aweme.account.terminal.a.f32778d;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(h)}, aVar, a.C0415a.f32779a, false, 20938, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            a.C0415a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(h)}, aVar2, a.C0415a.f32779a, false, 20938, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.g.a.a()) {
            Locale locale = Locale.US;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
            Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "monitorLoginFailed(%b, %s )", Arrays.copyOf(new Object[]{Boolean.valueOf(h), a.C0415a.a()}, 2)), "java.lang.String.format(locale, format, *args)");
        }
        n.a("monitor_account_business", h ^ true ? 1 : 0, aVar.a("login_fail", a.C0415a.a()));
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, B, false, 20582, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, B, false, 20582, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, B, false, 20585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, B, false, 20585, new Class[0], Void.TYPE);
        } else if (m.f33101b.a()) {
            this.E = FlipChat.INSTANCE.tryPreloadH5AuthorizePage(this, false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, C0906R.color.d5));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onCreate", false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ss.android.ugc.aweme.account.util.i$a} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(long r13, com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r15) {
        /*
            r12 = this;
            boolean r0 = C
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "gotoOneLoginFragment, oneLoginListener, phoneInfo: "
            r0.<init>(r2)
            if (r15 == 0) goto L_0x0030
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r15.getMobile()
            r2.append(r3)
            java.lang.String r3 = " (code: "
            r2.append(r3)
            java.lang.String r3 = r15.getAccessCode()
            r2.append(r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0031
        L_0x0030:
            r2 = r1
        L_0x0031:
            r0.append(r2)
        L_0x0034:
            com.ss.android.ugc.aweme.account.login.c.b r0 = com.ss.android.ugc.aweme.account.login.c.b.a()
            r0.a((com.ss.android.ugc.aweme.account.login.ui.o<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean>) r1)
            java.lang.String r0 = "login_main_pad_show"
            com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
            r1.<init>()
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = r12.z
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "duration"
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r13
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (long) r3)
            java.lang.String r2 = "with_one_click"
            r3 = 1
            r4 = 0
            if (r15 != 0) goto L_0x005d
            r5 = 0
            goto L_0x005e
        L_0x005d:
            r5 = 1
        L_0x005e:
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (int) r5)
            java.lang.String r2 = "carrier"
            if (r15 != 0) goto L_0x0069
            java.lang.String r5 = ""
            goto L_0x006d
        L_0x0069:
            java.lang.String r5 = r15.getFromMobLabel()
        L_0x006d:
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r5)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            boolean r0 = r12.isViewValid()
            if (r0 != 0) goto L_0x007d
            return
        L_0x007d:
            if (r15 != 0) goto L_0x0083
            r12.d()
            return
        L_0x0083:
            java.lang.Class<com.ss.android.ugc.aweme.account.login.ui.OneLoginStartFragment> r0 = com.ss.android.ugc.aweme.account.login.ui.OneLoginStartFragment.class
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.account.util.l.f33098a
            r8 = 1
            r9 = 21337(0x5359, float:2.99E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class r11 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            r2 = 2
            if (r1 == 0) goto L_0x00af
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.account.util.l.f33098a
            r8 = 1
            r9 = 21337(0x5359, float:2.99E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class r11 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00bd
        L_0x00af:
            com.ss.android.ugc.aweme.account.util.l r1 = com.ss.android.ugc.aweme.account.util.l.f33099b
            int r1 = r1.a()
            if (r1 == r3) goto L_0x00bc
            if (r1 != r2) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r1 = 0
            goto L_0x00bd
        L_0x00bc:
            r1 = 1
        L_0x00bd:
            if (r1 == 0) goto L_0x00c1
            java.lang.Class<com.ss.android.ugc.aweme.account.login.ui.OneLoginStartFragmentV2> r0 = com.ss.android.ugc.aweme.account.login.ui.OneLoginStartFragmentV2.class
        L_0x00c1:
            android.content.Intent r1 = r12.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            com.ss.android.ugc.aweme.account.util.i$a r0 = com.ss.android.ugc.aweme.account.util.i.a(r0, r1)
            java.lang.String r1 = "one_login_phone"
            com.ss.android.ugc.aweme.account.util.i$a r15 = r0.a((java.lang.String) r1, (java.io.Serializable) r15)
            java.lang.String r0 = "one_login_start_time"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r0
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r13)
            r5[r3] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.account.util.i.a.f33092a
            r8 = 0
            r9 = 21318(0x5346, float:2.9873E-41)
            java.lang.Class[] r10 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r10[r4] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r10[r3] = r1
            java.lang.Class<com.ss.android.ugc.aweme.account.util.i$a> r11 = com.ss.android.ugc.aweme.account.util.i.a.class
            r6 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r1 == 0) goto L_0x011d
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r13)
            r5[r3] = r0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.account.util.i.a.f33092a
            r8 = 0
            r9 = 21318(0x5346, float:2.9873E-41)
            java.lang.Class[] r10 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r10[r4] = r13
            java.lang.Class r13 = java.lang.Long.TYPE
            r10[r3] = r13
            java.lang.Class<com.ss.android.ugc.aweme.account.util.i$a> r11 = com.ss.android.ugc.aweme.account.util.i.a.class
            r6 = r15
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            r15 = r13
            com.ss.android.ugc.aweme.account.util.i$a r15 = (com.ss.android.ugc.aweme.account.util.i.a) r15
            goto L_0x0122
        L_0x011d:
            android.os.Bundle r1 = r15.f33093b
            r1.putLong(r0, r13)
        L_0x0122:
            android.support.v4.app.Fragment r13 = r15.a()
            com.ss.android.ugc.aweme.account.login.ui.BaseFragment r13 = (com.ss.android.ugc.aweme.account.login.ui.BaseFragment) r13
            r12.u = r13
            android.view.ViewGroup r13 = r12.mFragmentContainer
            r13.setVisibility(r4)
            com.ss.android.ugc.aweme.account.login.ui.BaseFragment r13 = r12.u
            r12.a(r13, r4)
            com.ss.android.ugc.aweme.account.d.a r13 = r12.A
            com.ss.android.ugc.aweme.utils.bc.b(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity.a(long, com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean):void");
    }
}
