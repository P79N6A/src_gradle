package com.bytedance.android.livesdk.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

public final class g extends v implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18103a;
    private String C;
    private Disposable D;
    private View.OnClickListener E = new h(this);

    /* renamed from: b  reason: collision with root package name */
    e f18104b;

    /* renamed from: c  reason: collision with root package name */
    ProgressBar f18105c;

    /* renamed from: d  reason: collision with root package name */
    View f18106d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f18107e;

    /* renamed from: f  reason: collision with root package name */
    TextView f18108f;
    TextView g;
    ImageView h;
    Activity i;
    public a j;
    public Map<String, String> k;
    ad l;
    public final b m;

    public interface a {
        void a(Dialog dialog, ad adVar);
    }

    public final void a(int i2) {
    }

    public final void a(b bVar) {
    }

    public final void a(Exception exc, int i2) {
    }

    public final void b() {
    }

    public final void c() {
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f18103a, false, 13932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18103a, false, 13932, new Class[0], Void.TYPE);
            return;
        }
        this.f18106d.setVisibility(8);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        ai.a((int) C0906R.string.cqc);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18103a, false, 13928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18103a, false, 13928, new Class[0], Void.TYPE);
            return;
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        b(true);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f18103a, false, 13927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18103a, false, 13927, new Class[0], Void.TYPE);
            return;
        }
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.f18106d.setVisibility(8);
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f18103a, false, 13935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18103a, false, 13935, new Class[0], Void.TYPE);
            return;
        }
        super.dismiss();
        if (this.D != null && !this.D.isDisposed()) {
            this.D.dispose();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f18103a, false, 13923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18103a, false, 13923, new Class[0], Void.TYPE);
            return;
        }
        this.m.a(this.v);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f18103a, false, 13931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18103a, false, 13931, new Class[0], Void.TYPE);
            return;
        }
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        b(false);
        this.h.setImageResource(2130841311);
        this.g.setText(C0906R.string.cw2);
        this.f18108f.setText(C0906R.string.dgc);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f18103a, false, 13921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18103a, false, 13921, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.r.setText(ac.a((int) C0906R.string.dgo, Float.valueOf(((float) this.x.f18680c) / 100.0f)));
            if (this.y == null || this.y == r.DIAMOND) {
                this.s.setText(String.valueOf(this.x.f18682e));
                if (this.f18107e != null) {
                    this.f18107e.setVisibility(0);
                }
            } else {
                TextView textView = this.s;
                StringBuilder sb = new StringBuilder();
                sb.append(ac.a((int) C0906R.string.dj1));
                sb.append(i.a("%.2f", Float.valueOf(((float) this.x.f18679b) / 100.0f)));
                textView.setText(sb);
                if (this.f18107e != null) {
                    this.f18107e.setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        String str;
        String str2;
        if (this.y != null) {
            com.bytedance.android.livesdk.w.b.an.a(this.y.name());
            switch (this.y) {
                case WEIXIN:
                    str2 = "weixin";
                    str = "wxpay";
                    break;
                case ALIPAY:
                    str2 = "Alipay";
                    str = "alipay";
                    break;
                case FIRE:
                    str2 = "balance";
                    str = "balance";
                    break;
                default:
                    str2 = "TEST";
                    str = "TEST";
                    break;
            }
            new HashMap().put("lable", str2);
            HashMap hashMap = new HashMap();
            hashMap.put("lable", String.valueOf(this.x.f18682e));
            com.bytedance.android.livesdk.j.a.a().a("recharge_list", hashMap, j.class, Room.class);
            if (!TextUtils.equals("balance", str)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("request_page", this.C);
                hashMap2.put("charge_reason", this.p);
                hashMap2.put("money", String.valueOf(this.x.f18682e + this.x.f18683f));
                hashMap2.put("pay_method", str);
                com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_pay", hashMap2, j.class, Room.class);
            }
            if (this.x != null && this.y != null) {
                if (this.y == r.DIAMOND) {
                    a(true);
                    return;
                }
                this.f18104b.a(this.x, this.y);
            }
        }
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18103a, false, 13936, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18103a, false, 13936, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f18106d.setVisibility(0);
        if (z) {
            this.f18105c.setVisibility(0);
            this.f18108f.setVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            return;
        }
        this.f18105c.setVisibility(8);
        this.g.setVisibility(0);
        this.h.setVisibility(0);
        this.f18108f.setVisibility(0);
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18103a, false, 13922, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18103a, false, 13922, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            a();
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f18103a, false, 13929, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18103a, false, 13929, new Class[0], Void.TYPE);
            } else {
                b(false);
            }
        }
        if (this.l != null) {
            this.l.a().compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new Consumer<d<com.bytedance.android.livesdk.wallet.a.g>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18112a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    d dVar = (d) obj;
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f18112a, false, 13941, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f18112a, false, 13941, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    if (((com.bytedance.android.livesdk.wallet.a.g) dVar.f7871b).f17883a == 0) {
                        g gVar = g.this;
                        if (PatchProxy.isSupport(new Object[0], gVar, g.f18103a, false, 13930, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], gVar, g.f18103a, false, 13930, new Class[0], Void.TYPE);
                        } else {
                            if (gVar.j != null) {
                                gVar.j.a(gVar, gVar.l);
                            }
                            gVar.dismiss();
                        }
                    } else {
                        g.this.g();
                    }
                }
            }, new Consumer<Throwable>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18114a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.isSupport(new Object[]{th}, this, f18114a, false, 13942, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f18114a, false, 13942, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    g.this.g();
                }
            });
        }
    }

    public final void a(ad adVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{adVar}, this, f18103a, false, 13934, new Class[]{ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar}, this, f18103a, false, 13934, new Class[]{ad.class}, Void.TYPE);
            return;
        }
        this.l = adVar;
        if (this.l.b() == 10001) {
            str = "card_ticket";
        } else {
            str = "guard";
        }
        this.p = str;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18103a, false, 13920, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f18103a, false, 13920, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f18105c = (ProgressBar) findViewById(C0906R.id.dto);
        this.f18106d = findViewById(C0906R.id.y6);
        this.f18108f = (TextView) findViewById(C0906R.id.d_x);
        this.f18107e = (ImageView) findViewById(C0906R.id.b0l);
        this.g = (TextView) findViewById(C0906R.id.d_y);
        this.h = (ImageView) findViewById(C0906R.id.b05);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
        marginLayoutParams.topMargin = ac.a(34.0f);
        this.s.setLayoutParams(marginLayoutParams);
        this.D = com.bytedance.android.livesdk.v.j.q().n().a().subscribe((Consumer<? super T>) new Consumer<Integer>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18109a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Integer num = (Integer) obj;
                if (PatchProxy.isSupport(new Object[]{num}, this, f18109a, false, 13940, new Class[]{Integer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{num}, this, f18109a, false, 13940, new Class[]{Integer.class}, Void.TYPE);
                    return;
                }
                if (g.this.m != null) {
                    b bVar = g.this.m;
                    if (PatchProxy.isSupport(new Object[0], bVar, b.f17968a, false, 13881, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar, b.f17968a, false, 13881, new Class[0], Void.TYPE);
                        return;
                    }
                    bVar.a(bVar.a());
                    bVar.b();
                }
            }
        });
        com.bytedance.android.livesdk.v.j.q().n().e();
        e eVar = new e(this.i, new k() {
            public final Observable<b> a() {
                return null;
            }
        }, this.p, this.C, 0);
        this.f18104b = eVar;
        this.f18104b.a(this);
        this.r.setVisibility(8);
        this.w.setOnClickListener(this.E);
        this.A.put(Long.valueOf(this.m.j), this.m);
        this.m.s = this.o;
        HashMap hashMap = new HashMap();
        if (this.x != null) {
            hashMap.put("money", String.valueOf(this.x.f18682e + this.x.f18683f));
        }
        hashMap.put("request_page", this.C);
        if (this.l != null) {
            hashMap.put("charge_reason", this.p);
        }
        com.bytedance.android.livesdk.j.a.a().a("livesdk_check_out_show", hashMap, j.class, Room.class);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f18103a, false, 13924, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f18103a, false, 13924, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        k();
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f18103a, false, 13933, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f18103a, false, 13933, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            a((com.bytedance.android.livesdkapi.depend.model.a) com.bytedance.android.livesdk.v.j.q().c().fromJson(str, com.bytedance.android.livesdkapi.depend.model.a.class));
            if (this.x != null) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("ConsumeDialog", (Throwable) e2);
            return false;
        }
    }

    public g(Activity activity, String str) {
        super(activity, false, "", str);
        AnonymousClass1 r2 = new b(-1, 2130841283, 2130841284, ac.a((int) C0906R.string.dgj), r.DIAMOND) {
            public static ChangeQuickRedirect t;

            public final boolean a() {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, t, false, 13938, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 13938, new Class[0], Boolean.TYPE)).booleanValue();
                }
                if (g.this.x.f18682e <= com.bytedance.android.livesdk.v.j.q().n().b()) {
                    z = true;
                }
                return z;
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, t, false, 13939, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, t, false, 13939, new Class[0], Void.TYPE);
                    return;
                }
                if (a()) {
                    this.n = ac.a((int) C0906R.string.cv_, Integer.valueOf(com.bytedance.android.livesdk.v.j.q().n().b()));
                } else {
                    this.n = ac.a((int) C0906R.string.cv9);
                }
                this.f17972e.setText(this.n);
                this.f17972e.setVisibility(0);
            }
        };
        this.m = r2;
        this.C = str;
        this.i = activity;
    }

    public final void a(int i2, com.bytedance.android.livesdk.wallet.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aVar}, this, f18103a, false, 13925, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aVar}, this, f18103a, false, 13925, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().k().e().subscribe();
        b(false);
        this.h.setImageResource(2130841312);
        this.g.setText(C0906R.string.cqj);
        this.f18108f.setText(C0906R.string.dhu);
        a(false);
    }

    public final void b(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, 0}, this, f18103a, false, 13926, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, 0}, this, f18103a, false, 13926, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        k();
    }
}
