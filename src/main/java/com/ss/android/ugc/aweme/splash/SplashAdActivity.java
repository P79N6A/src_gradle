package com.ss.android.ugc.aweme.splash;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.c;
import com.ss.android.ad.splash.h;
import com.ss.android.ad.splash.m;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.e.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.aj;
import com.ss.android.ugc.aweme.commercialize.utils.ak;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.legoImp.service.DouDouService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.utils.ee;
import org.json.JSONObject;

public class SplashAdActivity extends AbsActivity implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71562a;
    @SuppressLint({"CI_StaticFieldLeak", "StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    public static final b f71563b = new b();

    /* renamed from: d  reason: collision with root package name */
    public static volatile Object f71564d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static boolean f71565e = false;

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f71566f = false;

    /* renamed from: c  reason: collision with root package name */
    public m f71567c;
    private View g;
    private DouDouService.a h;

    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71570a;

        /* renamed from: b  reason: collision with root package name */
        SplashAdActivity f71571b;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@NonNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f71570a, false, 81879, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f71570a, false, 81879, new Class[]{View.class}, Void.TYPE);
                return;
            }
            SplashAdActivity.f71565e = false;
            SplashAdActivity splashAdActivity = this.f71571b;
            if (splashAdActivity != null) {
                if (SplashAdActivity.f71566f) {
                    SplashAdActivity.f71566f = false;
                    synchronized (SplashAdActivity.f71564d) {
                        SplashAdActivity.f71564d.notifyAll();
                    }
                }
                splashAdActivity.finish();
            }
        }

        public final void a(long j, String str) {
            long j2 = j;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f71570a, false, 81880, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f71570a, false, 81880, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                return;
            }
            g.a((Context) this.f71571b, j2, str2);
        }

        public final void a(@NonNull View view, @NonNull h hVar) {
            h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{view, hVar2}, this, f71570a, false, 81878, new Class[]{View.class, h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, hVar2}, this, f71570a, false, 81878, new Class[]{View.class, h.class}, Void.TYPE);
                return;
            }
            SplashAdActivity splashAdActivity = this.f71571b;
            if (splashAdActivity != null) {
                String str = hVar2.f22810d;
                String str2 = hVar2.h;
                if (!TextUtils.isEmpty(str)) {
                    com.ss.android.ugc.aweme.util.c.a("openSplashScheme: from = SplashAdActivity");
                    o.a(splashAdActivity, str, str2, hVar2.f22807a, hVar2.f22809c, new m() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f71572a;

                        public final void a(@NonNull Context context, @NonNull String str) {
                            if (PatchProxy.isSupport(new Object[]{context, str}, this, f71572a, false, 81881, new Class[]{Context.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{context, str}, this, f71572a, false, 81881, new Class[]{Context.class, String.class}, Void.TYPE);
                                return;
                            }
                            ak.a(context, str);
                        }
                    });
                    splashAdActivity.finish();
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71574a;

        /* renamed from: b  reason: collision with root package name */
        public m f71575b;

        /* renamed from: c  reason: collision with root package name */
        public View f71576c;

        /* renamed from: d  reason: collision with root package name */
        public a f71577d;

        b() {
        }

        public final void a() {
            this.f71575b = null;
            this.f71576c = null;
            this.f71577d = null;
        }
    }

    public boolean isSplashShowing() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71562a, false, 81876, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71562a, false, 81876, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f71562a, false, 81874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71562a, false, 81874, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (!com.ss.android.g.a.a()) {
            ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).onDestroy();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f71562a, false, 81873, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71562a, false, 81873, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!com.ss.android.g.a.a()) {
            ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).onPause();
        }
    }

    public Resources getResources() {
        if (PatchProxy.isSupport(new Object[0], this, f71562a, false, 81875, new Class[0], Resources.class)) {
            return (Resources) PatchProxy.accessDispatch(new Object[0], this, f71562a, false, 81875, new Class[0], Resources.class);
        } else if (d.a(this)) {
            return new d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        } else {
            return super.getResources();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f71562a, false, 81872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71562a, false, 81872, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onResume", true);
        super.onResume();
        if (!com.ss.android.g.a.a()) {
            ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).onResume();
        }
        ee.a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f71562a, false, 81870, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f71562a, false, 81870, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", true);
        super.onCreate(bundle);
        ag.i().h();
        try {
            setContentView((int) C0906R.layout.e0);
            this.f71567c = f71563b.f71575b;
            this.g = f71563b.f71576c;
            a aVar = f71563b.f71577d;
            if (aVar != null) {
                aVar.f71571b = this;
            }
            f71563b.a();
            if (this.g != null) {
                this.g.setBackgroundResource(2130840558);
                ((ViewGroup) findViewById(C0906R.id.ct8)).addView(this.g);
            } else {
                if (getIntent() == null) {
                    str = null;
                } else {
                    str = getIntent().getStringExtra("from");
                }
                if (!TextUtils.equals(str, MainActivity.class.getName())) {
                    com.ss.android.ugc.aweme.commercialize.splash.a.a().b();
                }
                finish();
                overridePendingTransition(0, 0);
            }
            f71565e = true;
            if (!com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[0], this, f71562a, false, 81871, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71562a, false, 81871, new Class[0], Void.TYPE);
                } else {
                    if (this.h == null) {
                        this.h = new DouDouService.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71568a;

                            public final boolean a() {
                                if (PatchProxy.isSupport(new Object[0], this, f71568a, false, 81877, new Class[0], Boolean.TYPE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71568a, false, 81877, new Class[0], Boolean.TYPE)).booleanValue();
                                }
                                aj.a(SplashAdActivity.this.f71567c);
                                return true;
                            }
                        };
                    }
                    ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).setDouDouListener(this.h);
                }
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", false);
            return;
        } catch (RuntimeException e2) {
            RuntimeException runtimeException = e2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", runtimeException.toString());
            n.a("splash_set_content_view", jSONObject);
        } catch (Throwable unused) {
        }
        f71563b.a();
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", false);
    }
}
