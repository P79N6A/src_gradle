package com.ss.android.ugc.aweme.share.score;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.ss.android.ugc.aweme.main.by;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.ug.b;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public class DouyinPraiseDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65246a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f65247b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f65248c;

    /* renamed from: d  reason: collision with root package name */
    private Button f65249d;

    /* renamed from: e  reason: collision with root package name */
    private Button f65250e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f65251f;
    private TextView g;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f65246a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = 0
            r4 = 1
            r5 = 73661(0x11fbd, float:1.03221E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f65246a
            r5 = 1
            r6 = 73661(0x11fbd, float:1.03221E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            r1 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ a -> 0x0089, all -> 0x0082 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage r2 = r2.aN()     // Catch:{ a -> 0x0089, all -> 0x0082 }
            java.lang.Integer r3 = r2.getSection()     // Catch:{ a -> 0x0089, all -> 0x0082 }
            java.lang.Integer r2 = r2.getThreshold()     // Catch:{ a -> 0x0089, all -> 0x0082 }
            com.ss.android.ugc.aweme.share.score.a r4 = com.ss.android.ugc.aweme.share.score.a.a()     // Catch:{ a -> 0x0089, all -> 0x0082 }
            android.database.sqlite.SQLiteDatabase r5 = r4.f65265c     // Catch:{ a -> 0x0089, all -> 0x0082 }
            r6 = 1
            java.lang.String r7 = "app_open"
            r8 = 0
            java.lang.String r9 = "open_time > ?"
            r4 = 1
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ a -> 0x0089, all -> 0x0082 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ a -> 0x0089, all -> 0x0082 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x0089, all -> 0x0082 }
            long r13 = (long) r3     // Catch:{ a -> 0x0089, all -> 0x0082 }
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r13 * r15
            long r11 = r11 - r13
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ a -> 0x0089, all -> 0x0082 }
            r10[r0] = r3     // Catch:{ a -> 0x0089, all -> 0x0082 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ a -> 0x0089, all -> 0x0082 }
            if (r3 == 0) goto L_0x007c
            int r1 = r3.getCount()     // Catch:{ a -> 0x007a, all -> 0x0077 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x007a, all -> 0x0077 }
            if (r1 < r2) goto L_0x007c
            r0 = 1
            goto L_0x007c
        L_0x0077:
            r0 = move-exception
            r1 = r3
            goto L_0x0083
        L_0x007a:
            r1 = r3
            goto L_0x0089
        L_0x007c:
            if (r3 == 0) goto L_0x0081
            r3.close()
        L_0x0081:
            return r0
        L_0x0082:
            r0 = move-exception
        L_0x0083:
            if (r1 == 0) goto L_0x0088
            r1.close()
        L_0x0088:
            throw r0
        L_0x0089:
            if (r1 == 0) goto L_0x008e
            r1.close()
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog.a():boolean");
    }

    public DouyinPraiseDialog(Context context) {
        super(context);
    }

    private static boolean c(Context context) {
        PackageInfo packageInfo;
        if (PatchProxy.isSupport(new Object[]{context}, null, f65246a, true, 73662, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f65246a, true, 73662, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null) {
            return false;
        } else {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Exception unused) {
                packageInfo = null;
            }
            long j = 0;
            if (packageInfo != null) {
                j = packageInfo.firstInstallTime;
            }
            if (System.currentTimeMillis() - j >= 604800000) {
                return true;
            }
            return false;
        }
    }

    public static void b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f65246a, true, 73659, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f65246a, true, 73659, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, (byte) 1}, null, c.f65267a, true, 73670, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, (byte) 1}, null, c.f65267a, true, 73670, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(context2, "douyin_praise_sp", 0).edit();
        edit.putBoolean("douyin_has_clicked_porf", true);
        edit.apply();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65246a, false, 73649, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65246a, false, 73649, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f65246a, false, 73650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65246a, false, 73650, new Class[0], Void.TYPE);
        } else {
            setContentView((int) C0906R.layout.j8);
            setCanceledOnTouchOutside(false);
            this.f65248c = (TextView) findViewById(C0906R.id.ad9);
            this.f65249d = (Button) findViewById(C0906R.id.ddi);
            this.f65250e = (Button) findViewById(C0906R.id.dbt);
            this.f65251f = (TextView) findViewById(C0906R.id.d0q);
            this.g = (TextView) findViewById(C0906R.id.a4i);
            try {
                AppStoreMessage aN = g.b().aN();
                String title = aN.getTitle();
                if (!TextUtils.isEmpty(title)) {
                    this.f65251f.setText(title);
                }
                String text = aN.getText();
                if (!TextUtils.isEmpty(text)) {
                    this.g.setText(text);
                }
            } catch (a unused) {
            }
            this.f65248c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65252a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f65252a, false, 73664, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f65252a, false, 73664, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    r.a("rating_feedback", (Map) new d().f34114b);
                    DouyinPraiseDialog.b(DouyinPraiseDialog.this.getContext());
                    bg.b(new b());
                    DouyinPraiseDialog douyinPraiseDialog = DouyinPraiseDialog.this;
                    if (PatchProxy.isSupport(new Object[0], douyinPraiseDialog, DouyinPraiseDialog.f65246a, false, 73651, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], douyinPraiseDialog, DouyinPraiseDialog.f65246a, false, 73651, new Class[0], Void.TYPE);
                    } else if (douyinPraiseDialog.getContext() != null) {
                        Intent intent = new Intent(douyinPraiseDialog.getContext(), CrossPlatformActivity.class);
                        intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/douyin_falcon/faq/?enter_from=rating_popup"));
                        intent.putExtra("hide_nav_bar", true);
                        douyinPraiseDialog.getContext().startActivity(intent);
                    }
                    DouyinPraiseDialog.this.dismiss();
                }
            });
            this.f65249d.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65254a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f65254a, false, 73665, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f65254a, false, 73665, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    r.a("rating_cancel", (Map) new d().f34114b);
                    DouyinPraiseDialog.this.dismiss();
                }
            });
            this.f65250e.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65256a;

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.content.Intent} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r26) {
                    /*
                        r25 = this;
                        r7 = r25
                        r9 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r10 = 0
                        r0[r10] = r26
                        com.meituan.robust.ChangeQuickRedirect r2 = f65256a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 73666(0x11fc2, float:1.03228E-40)
                        r1 = r25
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0036
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r26
                        com.meituan.robust.ChangeQuickRedirect r2 = f65256a
                        r3 = 0
                        r4 = 73666(0x11fc2, float:1.03228E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r25
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0036:
                        com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r26)
                        java.lang.String r0 = "rating_submit"
                        com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
                        r1.<init>()
                        java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                        com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                        com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog r0 = com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog.this
                        android.content.Context r0 = r0.getContext()
                        com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog.b(r0)
                        com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog r0 = com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog.this
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog.f65246a
                        r14 = 0
                        r15 = 73652(0x11fb4, float:1.03208E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r1 == 0) goto L_0x0079
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog.f65246a
                        r14 = 0
                        r15 = 73652(0x11fb4, float:1.03208E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        goto L_0x021b
                    L_0x0079:
                        android.content.Context r0 = r0.getContext()
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r0
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.d.f65268a
                        r14 = 1
                        r15 = 73675(0x11fcb, float:1.0324E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<android.content.Context> r2 = android.content.Context.class
                        r1[r10] = r2
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r16 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r1 == 0) goto L_0x00b2
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r0
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.d.f65268a
                        r14 = 1
                        r15 = 73675(0x11fcb, float:1.0324E-40)
                        java.lang.Class[] r0 = new java.lang.Class[r9]
                        java.lang.Class<android.content.Context> r1 = android.content.Context.class
                        r0[r10] = r1
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r16 = r0
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        goto L_0x021b
                    L_0x00b2:
                        java.lang.Object[] r1 = new java.lang.Object[r9]
                        r1[r10] = r0
                        r19 = 0
                        com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.share.score.d.f65268a
                        r21 = 1
                        r22 = 73676(0x11fcc, float:1.03242E-40)
                        java.lang.Class[] r2 = new java.lang.Class[r9]
                        java.lang.Class<android.content.Context> r3 = android.content.Context.class
                        r2[r10] = r3
                        java.lang.Class<android.content.Intent> r24 = android.content.Intent.class
                        r18 = r1
                        r23 = r2
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
                        r2 = 0
                        if (r1 == 0) goto L_0x00f0
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r0
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.d.f65268a
                        r14 = 1
                        r15 = 73676(0x11fcc, float:1.03242E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<android.content.Context> r2 = android.content.Context.class
                        r1[r10] = r2
                        java.lang.Class<android.content.Intent> r17 = android.content.Intent.class
                        r16 = r1
                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        r2 = r1
                        android.content.Intent r2 = (android.content.Intent) r2
                        goto L_0x018b
                    L_0x00f0:
                        java.lang.String r1 = r0.getPackageName()
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r1
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.d.f65268a
                        r14 = 1
                        r15 = 73677(0x11fcd, float:1.03243E-40)
                        java.lang.Class[] r3 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.String> r4 = java.lang.String.class
                        r3[r10] = r4
                        java.lang.Class<android.content.Intent> r17 = android.content.Intent.class
                        r16 = r3
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r3 == 0) goto L_0x012b
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r1
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.d.f65268a
                        r14 = 1
                        r15 = 73677(0x11fcd, float:1.03243E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.String> r3 = java.lang.String.class
                        r1[r10] = r3
                        java.lang.Class<android.content.Intent> r17 = android.content.Intent.class
                        r16 = r1
                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        android.content.Intent r1 = (android.content.Intent) r1
                        goto L_0x0145
                    L_0x012b:
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        java.lang.String r4 = "market://details?id="
                        r3.<init>(r4)
                        r3.append(r1)
                        java.lang.String r1 = r3.toString()
                        android.net.Uri r1 = android.net.Uri.parse(r1)
                        android.content.Intent r3 = new android.content.Intent
                        java.lang.String r4 = "android.intent.action.VIEW"
                        r3.<init>(r4, r1)
                        r1 = r3
                    L_0x0145:
                        android.content.pm.PackageManager r3 = r0.getPackageManager()
                        r4 = 32
                        java.util.List r3 = r3.queryIntentActivities(r1, r4)
                        if (r3 == 0) goto L_0x018b
                        int r4 = r3.size()
                        if (r4 == 0) goto L_0x018b
                        java.lang.String[] r4 = com.ss.android.ugc.aweme.share.score.d.f65269b
                        if (r4 == 0) goto L_0x018b
                        r4 = 0
                    L_0x015c:
                        java.lang.String[] r5 = com.ss.android.ugc.aweme.share.score.d.f65269b
                        int r5 = r5.length
                        if (r4 >= r5) goto L_0x018b
                        java.util.Iterator r5 = r3.iterator()
                    L_0x0165:
                        boolean r6 = r5.hasNext()
                        if (r6 == 0) goto L_0x0188
                        java.lang.Object r6 = r5.next()
                        android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
                        android.content.pm.ActivityInfo r8 = r6.activityInfo
                        java.lang.String r8 = r8.packageName
                        java.lang.String[] r11 = com.ss.android.ugc.aweme.share.score.d.f65269b
                        r11 = r11[r4]
                        boolean r8 = android.text.TextUtils.equals(r8, r11)
                        if (r8 == 0) goto L_0x0165
                        android.content.pm.ActivityInfo r2 = r6.activityInfo
                        java.lang.String r2 = r2.packageName
                        r1.setPackage(r2)
                        r2 = r1
                        goto L_0x018b
                    L_0x0188:
                        int r4 = r4 + 1
                        goto L_0x015c
                    L_0x018b:
                        if (r2 == 0) goto L_0x01b6
                        boolean r1 = com.ss.android.ugc.aweme.share.score.d.a()
                        if (r1 == 0) goto L_0x01c6
                        boolean r1 = com.ss.android.ugc.aweme.share.score.d.a(r0)
                        if (r1 == 0) goto L_0x01c6
                        java.lang.String r1 = r2.getPackage()
                        java.lang.String r3 = "com.yingyonghui.market"
                        boolean r1 = android.text.TextUtils.equals(r1, r3)
                        if (r1 != 0) goto L_0x01b1
                        java.lang.String r1 = r2.getPackage()
                        java.lang.String r3 = "cn.goapk.market"
                        boolean r1 = android.text.TextUtils.equals(r1, r3)
                        if (r1 == 0) goto L_0x01c6
                    L_0x01b1:
                        android.content.Intent r2 = com.ss.android.ugc.aweme.share.score.d.b(r0)
                        goto L_0x01c6
                    L_0x01b6:
                        boolean r1 = com.ss.android.ugc.aweme.share.score.d.a()
                        if (r1 == 0) goto L_0x01c6
                        boolean r1 = com.ss.android.ugc.aweme.share.score.d.a(r0)
                        if (r1 == 0) goto L_0x01c6
                        android.content.Intent r2 = com.ss.android.ugc.aweme.share.score.d.b(r0)
                    L_0x01c6:
                        if (r2 == 0) goto L_0x01d1
                        r1 = 268435456(0x10000000, float:2.5243549E-29)
                        r2.setFlags(r1)     // Catch:{ ActivityNotFoundException -> 0x01d1 }
                        r0.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x01d1 }
                        goto L_0x021b
                    L_0x01d1:
                        r1 = 2131559275(0x7f0d036b, float:1.874389E38)
                        android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r9)
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r0
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.e.f65270a
                        r14 = 1
                        r15 = 73683(0x11fd3, float:1.03252E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<android.widget.Toast> r2 = android.widget.Toast.class
                        r1[r10] = r2
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r16 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r1 == 0) goto L_0x020c
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r0
                        r12 = 0
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.score.e.f65270a
                        r14 = 1
                        r15 = 73683(0x11fd3, float:1.03252E-40)
                        java.lang.Class[] r0 = new java.lang.Class[r9]
                        java.lang.Class<android.widget.Toast> r1 = android.widget.Toast.class
                        r0[r10] = r1
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r16 = r0
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        goto L_0x021b
                    L_0x020c:
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r2 = 25
                        if (r1 != r2) goto L_0x0218
                        r1 = r0
                        android.widget.Toast r1 = (android.widget.Toast) r1
                        com.ss.android.ugc.aweme.utils.eq.a(r1)
                    L_0x0218:
                        r0.show()
                    L_0x021b:
                        com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog r0 = com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog.this
                        r0.dismiss()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog.AnonymousClass3.onClick(android.view.View):void");
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f65246a, false, 73663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65246a, false, 73663, new Class[0], Void.TYPE);
        } else {
            int versionCode = AwemeAppData.p().c().getVersionCode();
            Context context = getContext();
            if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(versionCode)}, null, c.f65267a, true, 73674, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(versionCode)}, null, c.f65267a, true, 73674, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            } else {
                SharedPreferences.Editor edit = c.a(context, "douyin_praise_sp", 0).edit();
                edit.putInt("douyin_praise_dialog_last_show_version", versionCode);
                edit.apply();
            }
            Context context2 = getContext();
            long currentTimeMillis = System.currentTimeMillis();
            if (PatchProxy.isSupport(new Object[]{context2, new Long(currentTimeMillis)}, null, c.f65267a, true, 73672, new Class[]{Context.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, new Long(currentTimeMillis)}, null, c.f65267a, true, 73672, new Class[]{Context.class, Long.TYPE}, Void.TYPE);
            } else {
                SharedPreferences.Editor edit2 = c.a(context2, "douyin_praise_sp", 0).edit();
                edit2.putLong("douyin_praise_dialog_last_showtime", currentTimeMillis);
                edit2.apply();
            }
        }
        r.a("rating_show", (Map) new d().f34114b);
    }

    public static boolean a(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f65246a, true, 73655, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f65246a, true, 73655, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            try {
                if ((context2 instanceof Activity) && ((Activity) context2).isFinishing()) {
                    return false;
                }
                try {
                    if (g.b().aN().getSwitcher().intValue() == 0) {
                        return false;
                    }
                    if (PatchProxy.isSupport(new Object[0], null, f65246a, true, 73656, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f65246a, true, 73656, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z = com.ss.android.ugc.aweme.account.d.a().isLogin();
                    }
                    if (!z) {
                        return false;
                    }
                    if (PatchProxy.isSupport(new Object[0], null, f65246a, true, 73654, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f65246a, true, 73654, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (by.a() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return false;
                    }
                    if (PatchProxy.isSupport(new Object[]{context2}, null, f65246a, true, 73658, new Class[]{Context.class}, Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f65246a, true, 73658, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        z3 = c.a(context);
                    }
                    if (!z3) {
                        if (PatchProxy.isSupport(new Object[]{context2}, null, f65246a, true, 73657, new Class[]{Context.class}, Boolean.TYPE)) {
                            z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f65246a, true, 73657, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            int versionCode = AwemeAppData.p().c().getVersionCode();
                            if (PatchProxy.isSupport(new Object[]{context2}, null, c.f65267a, true, 73673, new Class[]{Context.class}, Integer.TYPE)) {
                                i = ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, c.f65267a, true, 73673, new Class[]{Context.class}, Integer.TYPE)).intValue();
                            } else {
                                i = c.a(context2, "douyin_praise_sp", 0).getInt("douyin_praise_dialog_last_show_version", 0);
                            }
                            if (i <= 0 || versionCode != i) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                        }
                        if (!z4) {
                            if (PatchProxy.isSupport(new Object[]{context2}, null, f65246a, true, 73660, new Class[]{Context.class}, Boolean.TYPE)) {
                                z5 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f65246a, true, 73660, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                if (PatchProxy.isSupport(new Object[]{context2}, null, c.f65267a, true, 73671, new Class[]{Context.class}, Long.TYPE)) {
                                    j = ((Long) PatchProxy.accessDispatch(new Object[]{context2}, null, c.f65267a, true, 73671, new Class[]{Context.class}, Long.TYPE)).longValue();
                                } else {
                                    j = c.a(context2, "douyin_praise_sp", 0).getLong("douyin_praise_dialog_last_showtime", 0);
                                }
                                if (j > 0) {
                                    if (((int) ((System.currentTimeMillis() - j) / 86400000)) <= 14) {
                                        z5 = false;
                                    }
                                }
                                z5 = true;
                            }
                            if (!z5 || !a() || !c(context)) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return false;
                } catch (a unused) {
                    return false;
                }
            } catch (Exception unused2) {
                return false;
            }
        }
    }
}
