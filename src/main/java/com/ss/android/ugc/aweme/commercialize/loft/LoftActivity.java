package com.ss.android.ugc.aweme.commercialize.loft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.activity.c;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.loft.c.a;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class LoftActivity extends AmeSSActivity implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39068a;

    /* renamed from: d  reason: collision with root package name */
    private static final Long f39069d = 1500L;

    /* renamed from: b  reason: collision with root package name */
    boolean f39070b;

    /* renamed from: c  reason: collision with root package name */
    boolean f39071c;

    /* renamed from: e  reason: collision with root package name */
    private DmtLoadingLayout f39072e;

    /* renamed from: f  reason: collision with root package name */
    private View f39073f;
    private ViewGroup g;
    private View h;
    private Handler i = new Handler(Looper.getMainLooper());
    private boolean j;
    private long k;
    private a l;
    private String m = "";
    private String n = "#ccaaff";
    private String o = "#2c016d";
    private String p = "";

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39068a, false, 31003, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39068a, false, 31003, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f39068a, false, 30995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39068a, false, 30995, new Class[0], Void.TYPE);
            return;
        }
        ((e) e.m.a(this)).a();
        this.i.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f39068a, false, 30993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39068a, false, 30993, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.f39070b = false;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f39068a, false, 30997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39068a, false, 30997, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (this.h != null) {
            this.h.setBackgroundColor(getResources().getColor(C0906R.color.a7l));
        }
        this.i.removeCallbacksAndMessages(null);
        c.b(this, 0);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f39068a, false, 30996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39068a, false, 30996, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        if (this.j) {
            r.a("enter_second_floor", (Map) d.a().a("enter_method", "push").a("is_success", "come_back").f34114b);
        }
        this.i.removeCallbacksAndMessages(null);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f39068a, false, 30994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39068a, false, 30994, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onResume", true);
        super.onResume();
        this.f39070b = true;
        this.h.setBackgroundColor(getResources().getColor(C0906R.color.d5));
        if (this.f39071c) {
            b(((e) e.m.a(this)).a(this.m));
            this.f39071c = false;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onResume", false);
    }

    private boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f39068a, false, 31002, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39068a, false, 31002, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT >= 17) {
            return isDestroyed();
        } else {
            return isFinishing();
        }
    }

    private int a(String str) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f39068a, false, 30992, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f39068a, false, 30992, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            i2 = Color.parseColor(str);
        } catch (Exception unused) {
            i2 = -1;
        }
        return i2;
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39068a, false, 31001, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39068a, false, 31001, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.a((Context) this, i2).a();
        this.i.postDelayed(new d(this), f39069d.longValue());
    }

    /* access modifiers changed from: package-private */
    public void b(com.ss.android.ugc.aweme.commercialize.loft.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39068a, false, 30999, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f39068a, false, 30999, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE);
        } else if (aVar != null) {
            Intent intent = getIntent();
            getSupportFragmentManager().beginTransaction().add((int) C0906R.id.z1, (Fragment) LoftPlayFragment.a(intent.getStringExtra("loft_event_type"), intent.getIntExtra("loft_page_type", -1), this.m)).commitAllowingStateLoss();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f39068a, false, 30991, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f39068a, false, 30991, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ca);
        Intent intent = getIntent();
        this.m = intent.getStringExtra("activity_id");
        if (TextUtils.isEmpty(this.m)) {
            finish();
        }
        this.n = intent.getStringExtra("start_color");
        if (TextUtils.isEmpty(this.n)) {
            this.n = "#ccaaff";
        }
        this.n = "#" + this.n;
        if (a(this.n) == -1) {
            this.n = "#ccaaff";
        }
        this.o = intent.getStringExtra("end_color");
        if (TextUtils.isEmpty(this.o)) {
            this.o = "#2c016d";
        }
        this.o = "#" + this.o;
        if (a(this.o) == -1) {
            this.o = "#2c016d";
        }
        this.p = intent.getStringExtra(f.f34168b);
        this.h = findViewById(C0906R.id.ci4);
        this.g = (ViewGroup) findViewById(C0906R.id.z1);
        this.f39072e = (DmtLoadingLayout) findViewById(C0906R.id.bke);
        this.f39073f = findViewById(C0906R.id.azy);
        this.f39073f.setOnClickListener(new a(this));
        this.l = new a(this, this.g, false);
        this.l.a(this.n, this.o);
        this.l.v();
        this.g.addView(this.l.w());
        this.f39072e.setUseScreenHeight(getResources().getDimensionPixelSize(C0906R.dimen.lj));
        ((e) e.m.a(this)).a((e.b) this, this.m);
        this.k = SystemClock.elapsedRealtime();
        this.j = true;
        this.f39072e.setVisibility(0);
        this.f39071c = false;
        v.b((Activity) this);
        c.a(this, 0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onCreate", false);
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.commercialize.loft.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39068a, false, 30998, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f39068a, false, 30998, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE);
            return;
        }
        this.j = false;
        if (!a()) {
            this.f39073f.setVisibility(8);
            this.f39072e.setVisibility(8);
            r.a("enter_second_floor", (Map) d.a().a("enter_method", "push").a("is_success", "success").a("enter_status", String.valueOf(aVar.getStatus())).f34114b);
            r.a("loft_load", (Map) d.a().a("duration", SystemClock.elapsedRealtime() - this.k).a(f.f34168b, this.p).a("activity_id", this.m).a("status", 0).f34114b);
            if (aVar.getStatus() == 4) {
                a((int) C0906R.string.b7p);
            } else if (aVar.getStatus() == 2) {
                a((int) C0906R.string.b7q);
            } else if (aVar.getStatus() == 3) {
                this.l.a(aVar, a.c.DIRECT_OPEN, (View.OnClickListener) new b(this));
                this.l.f39161d = new c(this, aVar);
            } else {
                a((int) C0906R.string.b7o);
            }
        }
    }

    public final void a(int i2, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), th}, this, f39068a, false, 31000, new Class[]{Integer.TYPE, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), th}, this, f39068a, false, 31000, new Class[]{Integer.TYPE, Throwable.class}, Void.TYPE);
            return;
        }
        this.j = false;
        if (!a()) {
            this.f39072e.setVisibility(8);
            r.a("enter_second_floor", (Map) d.a().a("enter_method", "push").a("is_success", "false").f34114b);
            if (th == null) {
                r.a("loft_load", (Map) d.a().a(f.f34168b, this.p).a("activity_id", this.m).a("status", i2).f34114b);
            } else if (th instanceof BaseException) {
                BaseException baseException = (BaseException) th;
                r.a("loft_load", (Map) d.a().a(f.f34168b, this.p).a("activity_id", this.m).a("status", i2).a("error_code", baseException.getErrorCode()).a("error_msg", baseException.getErrorMessage()).f34114b);
            } else {
                r.a("loft_load", (Map) d.a().a(f.f34168b, this.p).a("activity_id", this.m).a("status", i2).a("error_msg", th.getMessage()).f34114b);
            }
            a((int) C0906R.string.b7o);
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{context2, str5, str6, str7, str8}, null, f39068a, true, 30990, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str5, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39068a, true, 30990, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, LoftActivity.class);
        intent.putExtra("activity_id", str5);
        intent.putExtra("start_color", str6);
        intent.putExtra("end_color", str7);
        intent.putExtra(f.f34168b, str8);
        context2.startActivity(intent);
    }
}
