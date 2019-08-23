package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.c;
import com.ss.android.ugc.aweme.app.d.e;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.utils.ak;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public class AdsAppActivity extends AdsAppBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33642a;
    private boolean h;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f33642a, false, 22124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33642a, false, 22124, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AdsAppActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AdsAppActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33642a, false, 22125, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33642a, false, 22125, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AdsAppActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f33642a, false, 22115, new Class[0], Boolean.TYPE)) {
            return p.a().c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33642a, false, 22115, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f6 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f8 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0118 A[Catch:{ Exception -> 0x0282 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r18 = this;
            r8 = r18
            r9 = 0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f33642a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 22116(0x5664, float:3.0991E-41)
            r2 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f33642a
            r4 = 0
            r5 = 22116(0x5664, float:3.0991E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0027:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Intent r0 = r18.getIntent()     // Catch:{ Exception -> 0x0282 }
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x003a
            java.lang.String r2 = "rule_id"
            java.lang.String r2 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x0282 }
        L_0x003a:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0282 }
            r3.<init>()     // Catch:{ Exception -> 0x0282 }
            r4 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String r5 = "push_user_id"
            java.lang.String r5 = r0.getStringExtra(r5)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r6 = "pre_o_urls"
            java.util.ArrayList r0 = r0.getStringArrayListExtra(r6)     // Catch:{ Exception -> 0x0282 }
            r1 = r0
            goto L_0x0051
        L_0x0050:
            r5 = r4
        L_0x0051:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0282 }
            if (r0 != 0) goto L_0x006e
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()     // Catch:{ Exception -> 0x0282 }
            boolean r0 = r0.isLogin()     // Catch:{ Exception -> 0x0282 }
            if (r0 != 0) goto L_0x006e
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0282 }
            java.lang.Class<com.ss.android.ugc.aweme.app.PushLoginActivity> r6 = com.ss.android.ugc.aweme.app.PushLoginActivity.class
            r0.<init>(r8, r6)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r6 = "push_user_id"
            r0.putExtra(r6, r5)     // Catch:{ Exception -> 0x0282 }
            goto L_0x006f
        L_0x006e:
            r0 = r4
        L_0x006f:
            boolean r6 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0282 }
            r7 = 1
            if (r6 != 0) goto L_0x00dd
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.ss.android.ugc.aweme.account.d.a()     // Catch:{ Exception -> 0x0282 }
            boolean r6 = r6.isLogin()     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x00ac
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0282 }
            if (r6 != 0) goto L_0x00ac
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.ss.android.ugc.aweme.account.d.a()     // Catch:{ Exception -> 0x0282 }
            java.lang.String r6 = r6.getCurUserId()     // Catch:{ Exception -> 0x0282 }
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r5 != 0) goto L_0x00ac
            boolean r5 = r18.b()     // Catch:{ Exception -> 0x0282 }
            if (r5 == 0) goto L_0x00a4
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0282 }
            java.lang.String r2 = "abs isAppHot == true"
            com.ss.android.ugc.aweme.util.k.a(r0, r9, r2)     // Catch:{ Exception -> 0x0282 }
            return
        L_0x00a4:
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0282 }
            java.lang.Class<com.ss.android.ugc.aweme.main.MainActivity> r6 = com.ss.android.ugc.aweme.main.MainActivity.class
            r5.<init>(r8, r6)     // Catch:{ Exception -> 0x0282 }
            goto L_0x00de
        L_0x00ac:
            boolean r5 = r18.b()     // Catch:{ Exception -> 0x0282 }
            if (r5 != 0) goto L_0x00dd
            java.util.Iterator r5 = r1.iterator()     // Catch:{ Exception -> 0x0282 }
        L_0x00b6:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x00dd
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0282 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0282 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x0282 }
            if (r0 == 0) goto L_0x00ca
            r10 = 1
            goto L_0x00cb
        L_0x00ca:
            r10 = 0
        L_0x00cb:
            android.content.Intent r6 = r8.a((android.net.Uri) r6, (boolean) r10)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r10 = "is_have_intents"
            r6.putExtra(r10, r7)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r10 = "rule_id"
            r6.putExtra(r10, r2)     // Catch:{ Exception -> 0x0282 }
            r3.add(r6)     // Catch:{ Exception -> 0x0282 }
            goto L_0x00b6
        L_0x00dd:
            r5 = r4
        L_0x00de:
            if (r5 != 0) goto L_0x00eb
            android.net.Uri r5 = r8.f33646d     // Catch:{ Exception -> 0x0282 }
            if (r0 == 0) goto L_0x00e6
            r6 = 1
            goto L_0x00e7
        L_0x00e6:
            r6 = 0
        L_0x00e7:
            android.content.Intent r5 = r8.a((android.net.Uri) r5, (boolean) r6)     // Catch:{ Exception -> 0x0282 }
        L_0x00eb:
            java.lang.String r6 = "I18nAdsCommands"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0282 }
            java.lang.String r11 = "intent ==null "
            r10.<init>(r11)     // Catch:{ Exception -> 0x0282 }
            if (r5 != 0) goto L_0x00f8
            r11 = 1
            goto L_0x00f9
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            r10.append(r11)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0282 }
            com.bytedance.common.utility.Logger.d(r6, r10)     // Catch:{ Exception -> 0x0282 }
            if (r5 != 0) goto L_0x0118
            android.net.Uri r0 = r8.f33646d     // Catch:{ Exception -> 0x0282 }
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = ""
            goto L_0x0112
        L_0x010c:
            android.net.Uri r0 = r8.f33646d     // Catch:{ Exception -> 0x0282 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0282 }
        L_0x0112:
            java.lang.String r2 = "abs intent == null"
            com.ss.android.ugc.aweme.util.k.a(r0, r9, r2)     // Catch:{ Exception -> 0x0282 }
            return
        L_0x0118:
            java.lang.String r6 = "from_notification"
            boolean r10 = r8.f33648f     // Catch:{ Exception -> 0x0282 }
            r5.putExtra(r6, r10)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r6 = "rule_id"
            r5.putExtra(r6, r2)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = r8.f33647e     // Catch:{ Exception -> 0x0282 }
            if (r6 != 0) goto L_0x012d
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5.addFlags(r6)     // Catch:{ Exception -> 0x0282 }
        L_0x012d:
            int r6 = r3.size()     // Catch:{ Exception -> 0x0282 }
            if (r6 <= 0) goto L_0x013b
            java.lang.String r6 = "is_have_intents"
            r5.putExtra(r6, r7)     // Catch:{ Exception -> 0x0282 }
            r3.add(r5)     // Catch:{ Exception -> 0x0282 }
        L_0x013b:
            android.content.ComponentName r6 = r5.getComponent()     // Catch:{ Exception -> 0x0282 }
            java.lang.String r6 = r6.getClassName()     // Catch:{ Exception -> 0x0282 }
            java.lang.Class<com.ss.android.ugc.aweme.detail.ui.DetailActivity> r10 = com.ss.android.ugc.aweme.detail.ui.DetailActivity.class
            java.lang.String r10 = r10.getName()     // Catch:{ Exception -> 0x0282 }
            boolean r6 = android.text.TextUtils.equals(r6, r10)     // Catch:{ Exception -> 0x0282 }
            r8.h = r6     // Catch:{ Exception -> 0x0282 }
            r8.l = r7     // Catch:{ Exception -> 0x0282 }
            boolean r6 = r8.h     // Catch:{ Exception -> 0x0282 }
            r10 = 2
            if (r6 == 0) goto L_0x017b
            com.ss.android.ugc.aweme.setting.AbTestManager r6 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x0282 }
            int r6 = r6.aZ()     // Catch:{ Exception -> 0x0282 }
            r11 = 2130968728(0x7f040098, float:1.7546118E38)
            if (r6 != r7) goto L_0x016a
            r11 = 2130968727(0x7f040097, float:1.7546116E38)
            r6 = 2130968716(0x7f04008c, float:1.7546093E38)
            goto L_0x0176
        L_0x016a:
            if (r6 != r10) goto L_0x0173
            r11 = 2130968729(0x7f040099, float:1.754612E38)
            r6 = 2130968718(0x7f04008e, float:1.7546098E38)
            goto L_0x0176
        L_0x0173:
            r6 = 2130968728(0x7f040098, float:1.7546118E38)
        L_0x0176:
            android.support.v4.app.ActivityOptionsCompat r6 = android.support.v4.app.ActivityOptionsCompat.makeCustomAnimation(r8, r11, r6)     // Catch:{ Exception -> 0x0282 }
            goto L_0x017c
        L_0x017b:
            r6 = r4
        L_0x017c:
            if (r6 == 0) goto L_0x0182
            android.os.Bundle r4 = r6.toBundle()     // Catch:{ Exception -> 0x0282 }
        L_0x0182:
            if (r0 == 0) goto L_0x01bc
            int r6 = r3.size()     // Catch:{ Exception -> 0x0282 }
            if (r6 <= r7) goto L_0x0190
            java.lang.String r5 = "next_steps"
            r0.putExtra(r5, r3)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0195
        L_0x0190:
            java.lang.String r3 = "next_step"
            r0.putExtra(r3, r5)     // Catch:{ Exception -> 0x0282 }
        L_0x0195:
            java.lang.String r3 = "rule_id"
            r0.putExtra(r3, r2)     // Catch:{ Exception -> 0x0282 }
            boolean r3 = r18.b()     // Catch:{ Exception -> 0x0282 }
            if (r3 == 0) goto L_0x01a4
            r8.startActivity(r0, r4)     // Catch:{ Exception -> 0x0282 }
            goto L_0x01d5
        L_0x01a4:
            android.content.Intent[] r3 = new android.content.Intent[r10]     // Catch:{ Exception -> 0x0282 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0282 }
            java.lang.Class<com.ss.android.ugc.aweme.main.MainActivity> r6 = com.ss.android.ugc.aweme.main.MainActivity.class
            r5.<init>(r8, r6)     // Catch:{ Exception -> 0x0282 }
            r3[r9] = r5     // Catch:{ Exception -> 0x0282 }
            r5 = r3[r9]     // Catch:{ Exception -> 0x0282 }
            java.lang.String r6 = "rule_id"
            r5.putExtra(r6, r2)     // Catch:{ Exception -> 0x0282 }
            r3[r7] = r0     // Catch:{ Exception -> 0x0282 }
            android.support.v4.app.ActivityCompat.startActivities(r8, r3, r4)     // Catch:{ Exception -> 0x0282 }
            goto L_0x01d5
        L_0x01bc:
            int r0 = r3.size()     // Catch:{ Exception -> 0x0282 }
            if (r0 <= r7) goto L_0x01d2
            int r0 = r3.size()     // Catch:{ Exception -> 0x0282 }
            android.content.Intent[] r0 = new android.content.Intent[r0]     // Catch:{ Exception -> 0x0282 }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ Exception -> 0x0282 }
            android.content.Intent[] r0 = (android.content.Intent[]) r0     // Catch:{ Exception -> 0x0282 }
            android.support.v4.app.ActivityCompat.startActivities(r8, r0, r4)     // Catch:{ Exception -> 0x0282 }
            goto L_0x01d5
        L_0x01d2:
            android.support.v4.app.ActivityCompat.startActivity(r8, r5, r4)     // Catch:{ Exception -> 0x0282 }
        L_0x01d5:
            com.ss.android.ugc.aweme.app.j r0 = com.ss.android.ugc.aweme.app.j.a()     // Catch:{ Exception -> 0x0282 }
            r0.f34191b = r9     // Catch:{ Exception -> 0x0282 }
            android.net.Uri r0 = r8.f33646d     // Catch:{ Exception -> 0x0282 }
            java.lang.String r0 = r8.a((android.net.Uri) r0, (java.util.ArrayList<java.lang.String>) r1)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.util.k.a(r0, r7, r2)     // Catch:{ Exception -> 0x0282 }
            com.ss.android.ugc.aweme.app.g r0 = new com.ss.android.ugc.aweme.app.g     // Catch:{ Exception -> 0x0282 }
            r0.<init>()     // Catch:{ Exception -> 0x0282 }
            android.net.Uri r2 = r8.f33646d     // Catch:{ Exception -> 0x0282 }
            boolean r3 = r8.f33648f     // Catch:{ Exception -> 0x0282 }
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0282 }
            r11[r9] = r2     // Catch:{ Exception -> 0x0282 }
            java.lang.Byte r4 = java.lang.Byte.valueOf(r3)     // Catch:{ Exception -> 0x0282 }
            r11[r7] = r4     // Catch:{ Exception -> 0x0282 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.g.f34185a     // Catch:{ Exception -> 0x0282 }
            r14 = 0
            r15 = 22243(0x56e3, float:3.1169E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0282 }
            java.lang.Class<android.net.Uri> r5 = android.net.Uri.class
            r4[r9] = r5     // Catch:{ Exception -> 0x0282 }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0282 }
            r4[r7] = r5     // Catch:{ Exception -> 0x0282 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0282 }
            r12 = r0
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0282 }
            if (r4 == 0) goto L_0x0235
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0282 }
            r11[r9] = r2     // Catch:{ Exception -> 0x0282 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)     // Catch:{ Exception -> 0x0282 }
            r11[r7] = r2     // Catch:{ Exception -> 0x0282 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.g.f34185a     // Catch:{ Exception -> 0x0282 }
            r14 = 0
            r15 = 22243(0x56e3, float:3.1169E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0282 }
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            r2[r9] = r3     // Catch:{ Exception -> 0x0282 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0282 }
            r2[r7] = r3     // Catch:{ Exception -> 0x0282 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0282 }
            r12 = r0
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0290
        L_0x0235:
            boolean r4 = r0.b(r2)     // Catch:{ Exception -> 0x0282 }
            if (r4 == 0) goto L_0x0281
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0282 }
            r11[r9] = r2     // Catch:{ Exception -> 0x0282 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.g.f34185a     // Catch:{ Exception -> 0x0282 }
            r14 = 0
            r15 = 22245(0x56e5, float:3.1172E-41)
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0282 }
            java.lang.Class<android.net.Uri> r5 = android.net.Uri.class
            r4[r9] = r5     // Catch:{ Exception -> 0x0282 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0282 }
            r12 = r0
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0282 }
            if (r4 == 0) goto L_0x026d
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0282 }
            r11[r9] = r2     // Catch:{ Exception -> 0x0282 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.g.f34185a     // Catch:{ Exception -> 0x0282 }
            r14 = 0
            r15 = 22245(0x56e5, float:3.1172E-41)
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0282 }
            java.lang.Class<android.net.Uri> r5 = android.net.Uri.class
            r4[r9] = r5     // Catch:{ Exception -> 0x0282 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0282 }
            r12 = r0
            r16 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0282 }
            goto L_0x027e
        L_0x026d:
            com.ss.android.ugc.aweme.ae.d r4 = com.ss.android.ugc.aweme.ae.d.a()     // Catch:{ Exception -> 0x0282 }
            java.util.List r5 = r0.a(r2)     // Catch:{ Exception -> 0x0282 }
            r4.a((java.util.List<java.lang.String>) r5)     // Catch:{ Exception -> 0x0282 }
            com.ss.android.ugc.aweme.ae.d r4 = com.ss.android.ugc.aweme.ae.d.a()     // Catch:{ Exception -> 0x0282 }
            r4.f33218b = r7     // Catch:{ Exception -> 0x0282 }
        L_0x027e:
            r0.a(r2, r3)     // Catch:{ Exception -> 0x0282 }
        L_0x0281:
            return
        L_0x0282:
            r0 = move-exception
            android.net.Uri r2 = r8.f33646d
            java.lang.String r1 = r8.a((android.net.Uri) r2, (java.util.ArrayList<java.lang.String>) r1)
            java.lang.String r0 = r0.getMessage()
            com.ss.android.ugc.aweme.util.k.a(r1, r9, r0)
        L_0x0290:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.AdsAppActivity.a():void");
    }

    public void setTheme(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f33642a, false, 22118, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f33642a, false, 22118, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0185 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0191 A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0199 A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019c A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a7 A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01aa A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01bc A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020a A[Catch:{ Exception -> 0x0227 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020d A[Catch:{ Exception -> 0x0227 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0215 A[Catch:{ Exception -> 0x0227 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f33642a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 22111(0x565f, float:3.0984E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f33642a
            r3 = 0
            r4 = 22111(0x565f, float:3.0984E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.AdsAppActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r12)
            com.ss.android.ugc.aweme.feed.ag r0 = com.ss.android.ugc.aweme.feed.ag.i()
            r0.h()
            android.content.Intent r0 = r11.getIntent()
            android.net.Uri r7 = r0.getData()
            if (r7 != 0) goto L_0x0053
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.AdsAppActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        L_0x0053:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x005f
            com.ss.android.ugc.aweme.share.a.f.a((android.content.Context) r11)
            com.ss.android.ugc.aweme.share.a.f.a((boolean) r9)
        L_0x005f:
            boolean r0 = com.ss.android.g.a.c()
            if (r0 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.share.a.f.a((boolean) r9)
        L_0x0068:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f33642a
            r3 = 0
            r4 = 22113(0x5661, float:3.0987E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0097
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f33642a
            r3 = 0
            r4 = 22113(0x5661, float:3.0987E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0117
        L_0x0097:
            java.lang.String r0 = "appParam"
            java.lang.String r0 = r7.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0117
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a6 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00a6 }
            r1 = r2
        L_0x00a6:
            if (r1 == 0) goto L_0x0117
            java.lang.String r0 = "__type__"
            java.lang.String r0 = r1.optString(r0)
            java.lang.String r2 = "position"
            java.lang.String r2 = r1.optString(r2)
            java.lang.String r3 = "iid"
            java.lang.String r3 = r1.optString(r3)
            java.lang.String r4 = "wxshare_count"
            java.lang.String r4 = r1.optString(r4)
            java.lang.String r5 = "parent_group_id"
            java.lang.String r5 = r1.optString(r5)
            java.lang.String r6 = "webid"
            java.lang.String r1 = r1.optString(r6)
            com.ss.android.ugc.aweme.common.t r6 = new com.ss.android.ugc.aweme.common.t
            r6.<init>()
            java.lang.String r10 = "__type__"
            r6.a(r10, r0)
            java.lang.String r0 = "position"
            r6.a(r0, r2)
            java.lang.String r0 = "iid"
            r6.a(r0, r3)
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = "wxshare_count"
            r6.a(r0, r4)
        L_0x00eb:
            java.lang.String r0 = "parent_group_id"
            r6.a(r0, r5)
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fb
            java.lang.String r0 = "webid"
            r6.a(r0, r1)
        L_0x00fb:
            com.ss.android.ugc.aweme.common.MobClick r0 = new com.ss.android.ugc.aweme.common.MobClick
            r0.<init>()
            java.lang.String r1 = "open_url"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "scheme"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            org.json.JSONObject r1 = r6.a()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x0117:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f33642a
            r3 = 0
            r4 = 22114(0x5662, float:3.0988E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0146
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f33642a
            r3 = 0
            r4 = 22114(0x5662, float:3.0988E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0228
        L_0x0146:
            java.lang.String r0 = "label"
            java.lang.String r0 = r7.getQueryParameter(r0)
            java.lang.String r1 = "push_id"
            java.lang.String r1 = r7.getQueryParameter(r1)
            java.lang.String r2 = "gd_label"
            java.lang.String r2 = r7.getQueryParameter(r2)
            if (r0 != 0) goto L_0x015e
            boolean r3 = r11.f33648f
            if (r3 == 0) goto L_0x0228
        L_0x015e:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = r7.getLastPathSegment()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0170
            java.lang.String r4 = "0"
            goto L_0x0174
        L_0x0170:
            java.lang.String r4 = r7.getLastPathSegment()
        L_0x0174:
            java.lang.String r5 = "network_type"
            com.ss.android.common.util.NetworkUtils$h r6 = com.ss.android.common.util.NetworkUtils.getNetworkType(r11)     // Catch:{ JSONException -> 0x0185 }
            java.lang.String r6 = com.ss.android.common.util.NetworkUtils.getNetworkAccessType((com.ss.android.common.util.NetworkUtils.h) r6)     // Catch:{ JSONException -> 0x0185 }
            java.lang.String r6 = r6.toUpperCase()     // Catch:{ JSONException -> 0x0185 }
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x0185 }
        L_0x0185:
            com.ss.android.ugc.aweme.common.MobClick r5 = com.ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r6 = "push"
            com.ss.android.ugc.aweme.common.MobClick r5 = r5.setEventName(r6)     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x0193
            java.lang.String r0 = ""
        L_0x0193:
            com.ss.android.ugc.aweme.common.MobClick r0 = r5.setLabelName(r0)     // Catch:{ Exception -> 0x01e9 }
            if (r1 != 0) goto L_0x019c
            java.lang.String r5 = ""
            goto L_0x019d
        L_0x019c:
            r5 = r1
        L_0x019d:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r5)     // Catch:{ Exception -> 0x01e9 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01e9 }
            if (r5 == 0) goto L_0x01aa
            java.lang.String r5 = "0"
            goto L_0x01ab
        L_0x01aa:
            r5 = r4
        L_0x01ab:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setExtValueString(r5)     // Catch:{ Exception -> 0x01e9 }
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r3)     // Catch:{ Exception -> 0x01e9 }
            com.ss.android.ugc.aweme.common.r.onEvent(r0)     // Catch:{ Exception -> 0x01e9 }
            boolean r0 = com.ss.android.g.a.a()     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x01e9
            com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r5 = "launch_app"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r5)     // Catch:{ Exception -> 0x01e9 }
            if (r2 != 0) goto L_0x01ca
            java.lang.String r2 = ""
        L_0x01ca:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r2)     // Catch:{ Exception -> 0x01e9 }
            if (r1 != 0) goto L_0x01d3
            java.lang.String r2 = ""
            goto L_0x01d4
        L_0x01d3:
            r2 = r1
        L_0x01d4:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r2)     // Catch:{ Exception -> 0x01e9 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01e9 }
            if (r2 == 0) goto L_0x01e1
            java.lang.String r2 = "0"
            goto L_0x01e2
        L_0x01e1:
            r2 = r4
        L_0x01e2:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setExtValueString(r2)     // Catch:{ Exception -> 0x01e9 }
            com.ss.android.ugc.aweme.common.r.onEvent(r0)     // Catch:{ Exception -> 0x01e9 }
        L_0x01e9:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x0228
            boolean r0 = r11.f33648f
            if (r0 == 0) goto L_0x0228
            android.content.Intent r0 = r11.getIntent()     // Catch:{ Exception -> 0x0227 }
            java.lang.String r2 = "msg_from"
            r5 = -1
            int r0 = com.ss.android.newmedia.message.a.a((android.content.Intent) r0, (java.lang.String) r2, (int) r5)     // Catch:{ Exception -> 0x0227 }
            com.ss.android.ugc.aweme.common.MobClick r2 = com.ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x0227 }
            java.lang.String r5 = "detail"
            com.ss.android.ugc.aweme.common.MobClick r2 = r2.setEventName(r5)     // Catch:{ Exception -> 0x0227 }
            if (r0 != r8) goto L_0x020d
            java.lang.String r0 = "click_news_notify"
            goto L_0x020f
        L_0x020d:
            java.lang.String r0 = "click_news_alert"
        L_0x020f:
            com.ss.android.ugc.aweme.common.MobClick r0 = r2.setLabelName(r0)     // Catch:{ Exception -> 0x0227 }
            if (r1 != 0) goto L_0x0217
            java.lang.String r1 = ""
        L_0x0217:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)     // Catch:{ Exception -> 0x0227 }
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setExtValueString(r4)     // Catch:{ Exception -> 0x0227 }
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r3)     // Catch:{ Exception -> 0x0227 }
            com.ss.android.ugc.aweme.common.r.onEvent(r0)     // Catch:{ Exception -> 0x0227 }
            goto L_0x0228
        L_0x0227:
        L_0x0228:
            long r0 = com.ss.android.ugc.aweme.app.k.f()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0243
            java.lang.String r0 = "aweme_app_performance"
            java.lang.String r1 = "main_page_time"
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = com.ss.android.ugc.aweme.app.k.f()
            long r2 = r2 - r4
            float r2 = (float) r2
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r0, (java.lang.String) r1, (float) r2)
        L_0x0243:
            com.ss.android.ugc.aweme.app.d.b r0 = com.ss.android.ugc.aweme.app.d.b.a()
            r0.f34110b = r8
            android.net.Uri r0 = r11.f33646d
            if (r0 == 0) goto L_0x025a
            com.ss.android.e.b r0 = com.ss.android.e.b.a((android.content.Context) r11)
            android.net.Uri r1 = r11.f33646d
            android.net.Uri r1 = r11.a((android.net.Uri) r1)
            r0.a((android.net.Uri) r1)
        L_0x025a:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f33642a
            r3 = 0
            r4 = 22112(0x5660, float:3.0986E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0288
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f33642a
            r3 = 0
            r4 = 22112(0x5660, float:3.0986E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x029c
        L_0x0288:
            java.lang.String r0 = r7.toString()
            java.lang.String r1 = "snssdk1128://adx"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x029c
            com.ss.android.ugc.aweme.app.b r0 = new com.ss.android.ugc.aweme.app.b
            r0.<init>(r11, r7)
            a.i.a((java.util.concurrent.Callable<TResult>) r0)
        L_0x029c:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            android.net.Uri r1 = r11.f33646d
            r0.initMiniAppInDeeplink(r11, r1)
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.AdsAppActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.AdsAppActivity.onCreate(android.os.Bundle):void");
    }

    private String a(Uri uri, ArrayList<String> arrayList) {
        if (PatchProxy.isSupport(new Object[]{uri, arrayList}, this, f33642a, false, 22117, new Class[]{Uri.class, ArrayList.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{uri, arrayList}, this, f33642a, false, 22117, new Class[]{Uri.class, ArrayList.class}, String.class);
        } else if (uri != null) {
            return uri.toString();
        } else {
            if (!CollectionUtils.isEmpty(arrayList)) {
                return arrayList.toString();
            }
            return "";
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f33642a, false, 22123, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f33642a, false, 22123, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!this.h) {
            super.a(i, i2);
        }
    }

    private Intent a(@NonNull Uri uri, boolean z) {
        String str;
        boolean z2;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f33642a, false, 22121, new Class[]{Uri.class, Boolean.TYPE}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{uri2, Byte.valueOf(z)}, this, f33642a, false, 22121, new Class[]{Uri.class, Boolean.TYPE}, Intent.class);
        }
        String scheme = uri.getScheme();
        Intent intent = null;
        if (scheme == null) {
            return null;
        }
        String host = uri.getHost();
        if (host == null) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String str2 = path;
        String stringExtra = getIntent().getStringExtra("from_token");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "";
        }
        String str3 = stringExtra;
        Iterator<c.d> it2 = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDeeplinkCommands().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            c.d next = it2.next();
            if (next.a(scheme, host, str2)) {
                e eVar = this.f33645c;
                String a2 = next.a(uri2);
                if (PatchProxy.isSupport(new Object[]{a2}, eVar, e.f34119a, false, 23491, new Class[]{String.class}, Void.TYPE)) {
                    e eVar2 = eVar;
                    PatchProxy.accessDispatch(new Object[]{a2}, eVar2, e.f34119a, false, 23491, new Class[]{String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(a2, "value");
                    if (eVar.f34122d.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        eVar.f34122d = a2;
                    }
                }
                intent = next.a(this, uri, host, str2, str3, this.f33648f, z);
                if (intent == null) {
                    next.a((Activity) this, uri2, this.f33648f);
                }
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && j.a().f34191b) {
            String queryParameter = uri2.getQueryParameter("tab_index");
            if (!TextUtils.isEmpty(queryParameter)) {
                Integer valueOf = Integer.valueOf(queryParameter);
                if (!PatchProxy.isSupport(new Object[]{valueOf}, this, f33642a, false, 22122, new Class[]{Integer.class}, String.class)) {
                    str = "";
                    switch (valueOf.intValue()) {
                        case 0:
                            str = "HOME";
                            break;
                        case 1:
                            str = "FOLLOW";
                            break;
                        case 2:
                            str = "PUBLISH";
                            break;
                        case 3:
                            str = "NOTIFICATION";
                            break;
                        case 4:
                            str = "USER";
                            break;
                        case 5:
                            str = "FOLLOW";
                            break;
                    }
                } else {
                    str = (String) PatchProxy.accessDispatch(new Object[]{valueOf}, this, f33642a, false, 22122, new Class[]{Integer.class}, String.class);
                }
                if (!"aweme".equals(host) || !"click_push_newvideo".equals(uri2.getQueryParameter("gd_label"))) {
                    intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", str);
                } else {
                    AbTestModel d2 = AbTestManager.a().d();
                    if (d2 != null && d2.newFollowFeedStyle == 1 && str.equals("FOLLOW")) {
                        intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", str);
                    }
                }
            }
            intent2.putExtra("is_from_push", true);
        }
        j.a().f34191b = false;
        if (PatchProxy.isSupport(new Object[]{uri2, intent2}, null, ak.f39701a, true, 32578, new Class[]{Uri.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2, intent2}, null, ak.f39701a, true, 32578, new Class[]{Uri.class, Intent.class}, Void.TYPE);
        } else if (!(uri2 == null || intent2 == null)) {
            String queryParameter2 = uri2.getQueryParameter("trigger_by");
            if (queryParameter2 != null) {
                intent2.putExtra("trigger_by", queryParameter2);
            }
        }
        try {
            if (h.e() != null) {
                h.e().a((Context) this, uri2);
            }
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th);
        }
        if (!(intent2 == null || uri2.getQueryParameter("gd_label") == null || !uri2.getQueryParameter("gd_label").startsWith("click_wap"))) {
            intent2.putExtra("ads_app_activity_by_wap_click", true);
        }
        return intent2;
    }
}
