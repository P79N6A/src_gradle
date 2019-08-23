package com.ss.android.ugc.aweme.qrcode.v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.d.l;
import com.ss.android.ugc.aweme.qrcode.e.c;
import com.ss.android.ugc.aweme.qrcode.f.a;
import com.ss.android.ugc.aweme.qrcode.f.b;
import com.ss.android.ugc.aweme.u.ad;
import com.ss.android.ugc.aweme.u.ae;
import java.util.List;
import java.util.Map;

public class QRCodeActivityV2 extends AmeSlideSSActivity implements View.OnClickListener, l.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f63490b;

    /* renamed from: c  reason: collision with root package name */
    d f63491c;

    /* renamed from: d  reason: collision with root package name */
    public b f63492d;

    /* renamed from: e  reason: collision with root package name */
    public a f63493e;

    /* renamed from: f  reason: collision with root package name */
    public c f63494f;
    public boolean g;
    List<Aweme> h;
    private TextView i;
    private TextView j;
    private FrameLayout k;
    private View l;
    private TextTitleBar m;
    private l n;
    private TextView o;
    private ImageView p;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70533, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70533, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63490b, false, 70534, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63490b, false, 70534, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70530, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70530, new Class[0], View.class);
        } else if (com.ss.android.g.a.a()) {
            return this.f63492d;
        } else {
            return this.f63494f;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70528, new Class[0], Void.TYPE);
            return;
        }
        if (this.f63493e != null && this.f63493e.isShowing()) {
            this.f63493e.dismiss();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70519, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.feed.k.a.b(this.h);
        l lVar = this.n;
        lVar.f63443b = null;
        lVar.f63444c = null;
        c();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void ac_() {
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70531, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70527, new Class[0], Void.TYPE);
        } else if (this.f63493e != null && !this.f63493e.isShowing()) {
            this.f63493e.show();
            this.f63493e.a();
        }
        new ae().a(this.f63491c.enterFrom).b("normal").c("shaped").e();
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f63490b, false, 70532, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f63490b, false, 70532, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!isFinishing()) {
            c();
            com.bytedance.ies.dmt.ui.d.a.a((Context) this, (int) C0906R.string.c1f).a();
            c.a(this, str);
        }
    }

    public void onClick(View view) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f63490b, false, 70525, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63490b, false, 70525, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.ayw) {
            finish();
            return;
        }
        if (id == C0906R.id.dhx) {
            if (this.f63494f != null) {
                z2 = this.f63494f.i;
            } else {
                z2 = this.f63492d.i;
            }
            if (z2) {
                if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70526, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70526, new Class[0], Void.TYPE);
                } else {
                    l lVar = this.n;
                    if (PatchProxy.isSupport(new Object[0], lVar, l.f63442a, false, 70480, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], lVar, l.f63442a, false, 70480, new Class[0], Void.TYPE);
                    } else if (ContextCompat.checkSelfPermission(lVar.f63444c, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        lVar.a();
                    } else {
                        lVar.b();
                    }
                }
            } else {
                com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), getString(C0906R.string.a7b)).a();
            }
        } else if (id == C0906R.id.dhy) {
            r.a("qr_code_scan_enter", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "qr_code_detail").a("previous_page", this.f63491c.enterFrom).f34114b);
            if (this.f63491c.type == 4) {
                z = true;
            } else {
                z = false;
            }
            if (PatchProxy.isSupport(new Object[]{this, (byte) 0, Byte.valueOf(z ? (byte) 1 : 0)}, null, QRCodePermissionActivity.f63311a, true, 70364, new Class[]{Context.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, (byte) 0, Byte.valueOf(z)}, null, QRCodePermissionActivity.f63311a, true, 70364, new Class[]{Context.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - QRCodePermissionActivity.f63313c >= 1000) {
                QRCodePermissionActivity.f63313c = currentTimeMillis;
                Intent intent = new Intent(this, QRCodePermissionActivity.class);
                intent.putExtra("finishAfterScan", false);
                intent.putExtra("enter_from", z);
                startActivity(intent);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        b bVar;
        c cVar;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63490b, false, 70515, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63490b, false, 70515, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.dg);
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70520, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70520, new Class[0], Void.TYPE);
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                this.f63491c = (d) intent.getSerializableExtra("extra_params");
            }
            this.h = com.ss.android.ugc.aweme.feed.k.a.a();
        }
        this.l = findViewById(C0906R.id.yb);
        this.m = (TextTitleBar) findViewById(C0906R.id.d3m);
        this.o = (TextView) findViewById(C0906R.id.cjn);
        this.i = (TextView) findViewById(C0906R.id.dhx);
        this.j = (TextView) findViewById(C0906R.id.dhy);
        this.k = (FrameLayout) findViewById(C0906R.id.c9p);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.m.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63495a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63495a, false, 70536, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63495a, false, 70536, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                QRCodeActivityV2.this.finish();
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70516, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a() && !TimeLockRuler.isTeenModeON() && this.f63491c != null && this.f63491c.objectId != null && this.f63491c.objectId.equals(com.ss.android.ugc.aweme.account.d.a().getCurUserId()) && "navigation_panel".equals(this.f63491c.enterFrom)) {
            this.p = new ImageView(this);
            this.p.setImageResource(2130839380);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) UIUtils.dip2Px(this, 44.0f), 1073741824);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(makeMeasureSpec, makeMeasureSpec);
            layoutParams.gravity = 21;
            layoutParams.rightMargin = (int) UIUtils.dip2Px(this, 6.0f);
            int dip2Px = (int) UIUtils.dip2Px(this, 10.0f);
            this.p.setPadding(dip2Px, dip2Px, dip2Px, dip2Px);
            this.m.addView(this.p, layoutParams);
            this.p.setOnClickListener(new a(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70521, new Class[0], Void.TYPE);
        } else {
            TextTitleBar textTitleBar = this.m;
            if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70524, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70524, new Class[0], String.class);
            } else if (this.f63491c == null) {
                if (PatchProxy.isSupport(new Object[]{0, ""}, null, com.ss.android.ugc.aweme.qrcode.c.f63357a, true, 70354, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{0, ""}, null, com.ss.android.ugc.aweme.qrcode.c.f63357a, true, 70354, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
                } else {
                    i2 = com.ss.android.ugc.aweme.qrcode.c.a(0, "", null);
                }
                str = getString(i2);
            } else {
                str = getString(com.ss.android.ugc.aweme.qrcode.c.a(this.f63491c.type, this.f63491c.objectId, this.f63491c.enterFrom));
            }
            textTitleBar.setTitle((CharSequence) str);
            int px2dip = UIUtils.px2dip(this, (float) UIUtils.getScreenHeight(this));
            if (px2dip < 660) {
                float f2 = ((float) px2dip) / 667.0f;
                this.k.setScaleX(f2);
                this.k.setScaleY(f2);
                float f3 = ((1.0f - f2) * 400.0f) / 2.0f;
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
                layoutParams2.topMargin = (int) UIUtils.dip2Px(this, (32.0f * f2) - f3);
                this.k.setLayoutParams(layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
                layoutParams3.topMargin = (int) UIUtils.dip2Px(this, 16.0f - f3);
                this.o.setLayoutParams(layoutParams3);
            }
            if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70523, new Class[0], b.class)) {
                bVar = (b) PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70523, new Class[0], b.class);
            } else if (this.f63491c == null || this.f63491c.type != 4) {
                bVar = new b(this);
            } else {
                bVar = new h(this);
            }
            this.f63492d = bVar;
            if (!com.ss.android.g.a.a()) {
                if (this.f63491c.type == 4) {
                    cVar = new k(this);
                } else {
                    cVar = new c(this);
                }
                this.f63494f = cVar;
                this.k.addView(this.f63494f);
                this.f63494f.setTranslationY((float) UIUtils.getScreenHeight(this));
            }
            this.k.addView(this.f63492d);
            if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70522, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70522, new Class[0], Void.TYPE);
            } else if (this.f63493e == null) {
                this.f63493e = a.a(this, getResources().getString(C0906R.string.bug));
                this.f63493e.setIndeterminate(false);
                this.f63493e.getWindow().addFlags(32);
            }
            this.f63492d.setOnBindQrCodeListener(new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63497a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f63497a, false, 70537, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f63497a, false, 70537, new Class[0], Void.TYPE);
                        return;
                    }
                    ad adVar = new ad();
                    adVar.f75015b = QRCodeActivityV2.this.f63491c.enterFrom;
                    adVar.f75016c = "shaped";
                    adVar.e();
                    if (QRCodeActivityV2.this.f63494f != null) {
                        QRCodeActivityV2.this.f63494f.setParams(QRCodeActivityV2.this.f63491c);
                        QRCodeActivityV2.this.f63494f.setOnBindQrCodeListener(new b.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f63499a;

                            public final void b() {
                            }

                            public final void c() {
                            }

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f63499a, false, 70540, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f63499a, false, 70540, new Class[0], Void.TYPE);
                                    return;
                                }
                                QRCodeActivityV2.this.c();
                            }
                        });
                        if (QRCodeActivityV2.this.f63492d instanceof b) {
                            QRCodeActivityV2.this.f63494f.a(((b) QRCodeActivityV2.this.f63492d).getQrCodeInfo());
                        }
                    } else {
                        QRCodeActivityV2.this.c();
                    }
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f63497a, false, 70538, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f63497a, false, 70538, new Class[0], Void.TYPE);
                        return;
                    }
                    if (!QRCodeActivityV2.this.g && QRCodeActivityV2.this.f63493e != null && QRCodeActivityV2.this.f63493e.isShowing()) {
                        QRCodeActivityV2.this.f63493e.dismiss();
                    }
                }

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f63497a, false, 70539, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f63497a, false, 70539, new Class[0], Void.TYPE);
                        return;
                    }
                    QRCodeActivityV2.this.g = true;
                    if (QRCodeActivityV2.this.f63494f != null) {
                        QRCodeActivityV2.this.f63494f.setParams(QRCodeActivityV2.this.f63491c);
                    }
                    QRCodeActivityV2.this.c();
                }
            });
            this.f63492d.setData(this.f63491c);
        }
        if (PatchProxy.isSupport(new Object[0], this, f63490b, false, 70518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63490b, false, 70518, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.b()) {
            this.l.setBackgroundColor(getResources().getColor(C0906R.color.z6));
            this.m.setBackgroundColor(getResources().getColor(C0906R.color.a25));
            this.i.setTextColor(getResources().getColor(C0906R.color.a0y));
            this.j.setTextColor(getResources().getColor(C0906R.color.a0y));
            this.f63492d.setQRCodeCardTitleColor(getResources().getColor(C0906R.color.i0));
            this.f63492d.setQRCodeCardSubtitleColor(getResources().getColor(C0906R.color.i3));
            if (this.f63494f != null) {
                this.f63494f.setQRCodeCardTitleColor(getResources().getColor(C0906R.color.i0));
                this.f63494f.setQRCodeCardSubtitleColor(getResources().getColor(C0906R.color.i3));
            }
        }
        if (com.ss.android.g.a.b()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) C0906R.color.w1).init();
        } else {
            StatusBarUtils.setTransparent(this);
        }
        this.n = new l(this, this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onCreate", false);
    }

    public static void a(Context context, d dVar) {
        Context context2 = context;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{context2, dVar2}, null, f63490b, true, 70514, new Class[]{Context.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, dVar2}, null, f63490b, true, 70514, new Class[]{Context.class, d.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, QRCodeActivityV2.class);
        intent.putExtra("extra_params", dVar2);
        context2.startActivity(intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r21, @android.support.annotation.NonNull java.lang.String[] r22, @android.support.annotation.NonNull int[] r23) {
        /*
            r20 = this;
            r0 = r22
            r1 = r23
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r0
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f63490b
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 70529(0x11381, float:9.8832E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = f63490b
            r16 = 0
            r17 = 70529(0x11381, float:9.8832E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005d:
            super.onRequestPermissionsResult(r21, r22, r23)
            r2 = r20
            com.ss.android.ugc.aweme.qrcode.d.l r3 = r2.n
            r4 = r21
            r3.a(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
