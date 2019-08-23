package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.view.a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.live.d.c;
import com.ss.android.ugc.aweme.live.model.e;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.bg;

public class LivePlayActivity extends BaseLiveSdkActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f53174b;

    /* renamed from: c  reason: collision with root package name */
    public c.a f53175c = new c.a();

    /* renamed from: d  reason: collision with root package name */
    private Rect f53176d;

    /* renamed from: e  reason: collision with root package name */
    private Fragment f53177e;

    /* renamed from: f  reason: collision with root package name */
    private h f53178f;
    private boolean g = false;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53174b, false, 55423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55423, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53174b, false, 55424, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53174b, false, 55424, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    private boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f53174b, false, 55421, new Class[0], Boolean.TYPE)) {
            return AbTestManager.a().cm();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55421, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f53174b, false, 55412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55412, new Class[0], Void.TYPE);
            return;
        }
        if ((this.f53177e instanceof a) && !((a) this.f53177e).c()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53174b, false, 55409, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55409, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        a.d().f().b(hashCode());
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f53174b, false, 55420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55420, new Class[0], Void.TYPE);
            return;
        }
        if (getIntent() != null) {
            long longExtra = getIntent().getLongExtra("current_room_id", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("has_page_slide", false);
            if (longExtra > 0 && booleanExtra) {
                bg.a(new e(longExtra));
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53174b, false, 55415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55415, new Class[0], Void.TYPE);
        } else if (this.g || !d()) {
            com.ss.android.ugc.aweme.live.d.a.a(findViewById(C0906R.id.chy), this.f53176d, new g(this), new View[0]);
        } else {
            c();
            super.finish();
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f53174b, false, 55413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55413, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f53174b, false, 55419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55419, new Class[0], Void.TYPE);
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                com.bytedance.android.live.base.a.a aVar = (com.bytedance.android.live.base.a.a) intent.getParcelableExtra("host_room_status_event");
                if (aVar != null) {
                    bg.a(aVar);
                }
            }
        }
        if (this.f53176d == null || !d()) {
            super.finish();
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f53174b, false, 55414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53174b, false, 55414, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53175c == null) {
            this.f53175c = new c.a();
        }
        c.a(this, this.f53175c);
        if (this.f53175c.f53367a) {
            a();
            return;
        }
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53179a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53179a, false, 55426, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53179a, false, 55426, new Class[0], Void.TYPE);
                } else if (LivePlayActivity.this.f53175c.f53367a) {
                    LivePlayActivity.this.a();
                } else {
                    handler.postDelayed(this, 50);
                }
            }
        }, 50);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f53174b, false, 55422, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f53174b, false, 55422, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        if (!com.ss.android.g.a.a() && this.f53176d != null && configuration.orientation == 2) {
            try {
                com.bytedance.android.livesdkapi.k.a.a((Object) this, "convertFromTranslucent", new Object[0]);
            } catch (Throwable th) {
                com.ss.b.a.a.b("LivePlayActivity", Log.getStackTraceString(th));
            }
        }
    }

    public void setTheme(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53174b, false, 55417, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53174b, false, 55417, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("live_play_params");
        if (bundleExtra == null || bundleExtra.getParcelable("live.intent.extra.SOURCE_POSITION") == null) {
            super.setTheme(C0906R.style.m);
        } else {
            super.setTheme(i);
        }
    }

    public void onNewIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f53174b, false, 55410, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f53174b, false, 55410, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        if (intent != null) {
            if (!(this.f53178f == null || this.f53178f.e() == null)) {
                Bundle arguments = this.f53178f.e().g().getArguments();
                if (arguments != null && arguments.getLong("live.intent.extra.ROOM_ID", -1) == intent.getLongExtra("room_id", -2)) {
                    return;
                }
            }
            Bundle bundleExtra = intent.getBundleExtra("live_play_params");
            long longExtra = intent.getLongExtra("room_id", 0);
            this.f53178f = a.d().a(longExtra, bundleExtra);
            this.f53177e = this.f53178f.d();
            if (this.f53177e.getArguments() != null) {
                this.f53177e.getArguments().putLong("live.intent.extra.ROOM_ID", longExtra);
            }
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(C0906R.id.aic, this.f53177e);
            beginTransaction.commit();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r8 = r21
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r22
            com.meituan.robust.ChangeQuickRedirect r3 = f53174b
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 55408(0xd870, float:7.7643E-41)
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r22
            com.meituan.robust.ChangeQuickRedirect r3 = f53174b
            r4 = 0
            r5 = 55408(0xd870, float:7.7643E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            java.lang.String r1 = "com.ss.android.ugc.aweme.live.LivePlayActivity"
            java.lang.String r2 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r1, r2, r9)
            android.content.Intent r1 = r21.getIntent()
            java.lang.String r2 = "room_id"
            r3 = 0
            long r11 = r1.getLongExtra(r2, r3)
            java.lang.String r2 = "live_play_params"
            android.os.Bundle r13 = r1.getBundleExtra(r2)
            super.onCreate(r22)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f53174b
            r4 = 0
            r5 = 55416(0xd878, float:7.7654E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0084
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f53174b
            r4 = 0
            r5 = 55416(0xd878, float:7.7654E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00a8
        L_0x0084:
            if (r13 == 0) goto L_0x00a8
            java.lang.String r0 = "live.intent.extra.SOURCE_POSITION"
            android.os.Parcelable r0 = r13.getParcelable(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r8.f53176d = r0
            android.graphics.Rect r0 = r8.f53176d
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.g
            if (r0 == 0) goto L_0x009c
            r8.overridePendingTransition(r10, r10)
            goto L_0x00a8
        L_0x009c:
            java.lang.String r0 = "convertFromTranslucent"
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x00a4 }
            com.bytedance.android.livesdkapi.k.a.a((java.lang.Object) r8, (java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Throwable -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r0 = move-exception
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Throwable) r0)
        L_0x00a8:
            r0 = 2131689513(0x7f0f0029, float:1.9008043E38)
            r8.setContentView((int) r0)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f53174b
            r4 = 0
            r5 = 55418(0xd87a, float:7.7657E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x00d4
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f53174b
            r4 = 0
            r5 = 55418(0xd87a, float:7.7657E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0143
        L_0x00d4:
            boolean r0 = r8.g
            if (r0 == 0) goto L_0x0143
            android.graphics.Rect r0 = r8.f53176d
            if (r0 == 0) goto L_0x0143
            r0 = 2131169615(0x7f07114f, float:1.7953565E38)
            android.view.View r0 = r8.findViewById(r0)
            android.graphics.Rect r1 = r8.f53176d
            android.view.View[] r2 = new android.view.View[r10]
            r3 = 3
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r10] = r0
            r14[r9] = r1
            r4 = 2
            r14[r4] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.live.d.a.f53358a
            r17 = 1
            r18 = 55977(0xdaa9, float:7.844E-41)
            java.lang.Class[] r5 = new java.lang.Class[r3]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r5[r10] = r6
            java.lang.Class<android.graphics.Rect> r6 = android.graphics.Rect.class
            r5[r9] = r6
            java.lang.Class<android.view.View[]> r6 = android.view.View[].class
            r5[r4] = r6
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r5 == 0) goto L_0x0137
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r10] = r0
            r14[r9] = r1
            r14[r4] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.live.d.a.f53358a
            r17 = 1
            r18 = 55977(0xdaa9, float:7.844E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r10] = r1
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r0[r9] = r1
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r0[r4] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0143
        L_0x0137:
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()
            com.ss.android.ugc.aweme.live.d.a$1 r4 = new com.ss.android.ugc.aweme.live.d.a$1
            r4.<init>(r0, r1, r2)
            r3.addOnGlobalLayoutListener(r4)
        L_0x0143:
            android.view.Window r0 = r21.getWindow()
            r1 = 48
            r0.setSoftInputMode(r1)
            android.view.Window r0 = r21.getWindow()
            r1 = 128(0x80, float:1.794E-43)
            r0.addFlags(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 == r1) goto L_0x015e
            com.ss.android.ugc.aweme.utils.eb.a((android.app.Activity) r21)
        L_0x015e:
            android.support.v4.app.FragmentManager r0 = r21.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            com.bytedance.android.livesdkapi.service.c r1 = com.ss.android.ugc.aweme.live.a.d()
            com.bytedance.android.livesdkapi.depend.d.a.b r1 = r1.f()
            int r2 = r21.hashCode()
            r1.a(r2, r8)
            com.bytedance.android.livesdkapi.service.c r1 = com.ss.android.ugc.aweme.live.a.d()
            com.bytedance.android.livesdkapi.depend.d.h r1 = r1.a((long) r11, (android.os.Bundle) r13)
            r8.f53178f = r1
            com.bytedance.android.livesdkapi.depend.d.h r1 = r8.f53178f
            android.support.v4.app.Fragment r1 = r1.d()
            r8.f53177e = r1
            android.support.v4.app.Fragment r1 = r8.f53177e
            android.os.Bundle r1 = r1.getArguments()
            if (r1 == 0) goto L_0x019a
            android.support.v4.app.Fragment r1 = r8.f53177e
            android.os.Bundle r1 = r1.getArguments()
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            r1.putLong(r2, r11)
        L_0x019a:
            r1 = 2131166894(0x7f0706ae, float:1.7948046E38)
            android.support.v4.app.Fragment r2 = r8.f53177e
            r0.add((int) r1, (android.support.v4.app.Fragment) r2)
            r0.commit()
            java.lang.String r0 = "com.ss.android.ugc.aweme.live.LivePlayActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LivePlayActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = i;
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent2}, this, f53174b, false, 55411, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent2}, this, f53174b, false, 55411, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        boolean a2 = com.bytedance.android.livesdkapi.h.e().h().a(0, i2, keyEvent2);
        if (!a2 || (i2 != 25 && i2 != 24)) {
            return super.onKeyDown(i, keyEvent);
        }
        return a2;
    }

    public static void a(Context context, long j, Bundle bundle) {
        Context context2 = context;
        long j2 = j;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2), bundle2}, null, f53174b, true, 55407, new Class[]{Context.class, Long.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, new Long(j2), bundle2}, null, f53174b, true, 55407, new Class[]{Context.class, Long.TYPE, Bundle.class}, Void.TYPE);
            return;
        }
        if (!TimeLockRuler.isEnableShowTeenageTip(C0906R.string.chw)) {
            Intent intent = new Intent(context2, LivePlayActivity.class);
            intent.putExtra("room_id", j2);
            intent.putExtra("live_play_params", bundle2);
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context2.startActivity(intent);
        }
    }
}
