package com.bytedance.android.livesdk.gift.effect.normal.b;

import android.content.Context;
import com.bytedance.android.livesdk.gift.effect.normal.d.b;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.message.model.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14899a = null;
    private static final String k = "com.bytedance.android.livesdk.gift.effect.normal.b.a";

    /* renamed from: b  reason: collision with root package name */
    public b f14900b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14901c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14902d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14903e;

    /* renamed from: f  reason: collision with root package name */
    public NormalGiftAnimationView f14904f;
    public com.bytedance.android.livesdk.gift.effect.normal.view.b g;
    public com.bytedance.android.livesdk.gift.effect.normal.c.b h;
    public com.bytedance.android.livesdk.gift.effect.entry.d.a i;
    public int j;
    private int l;
    private int m;
    private int n;
    private Context o;
    private Map<String, Object> p = new HashMap();
    private com.bytedance.android.livesdk.gift.effect.normal.c.a q = new com.bytedance.android.livesdk.gift.effect.normal.c.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14905a;

        public final void b() {
            a.this.f14902d = false;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f14905a, false, 9536, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14905a, false, 9536, new Class[0], Void.TYPE);
            } else if (a.this.f14900b.f14911e > 0) {
                a.this.f14900b.b();
                a.this.g.a();
                a.this.b();
            } else {
                a.this.f14902d = true;
            }
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f14905a, false, 9537, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14905a, false, 9537, new Class[0], Void.TYPE);
                return;
            }
            a.this.f14904f.removeView(a.this.g);
            a.this.g.b();
            a.this.g = null;
            if (a.this.f14900b.f14911e > 0) {
                a.this.f14900b.b();
                a.this.a();
                return;
            }
            if (a.this.f14900b.g) {
                a aVar = a.this;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f14899a, false, 9530, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f14899a, false, 9530, new Class[0], Void.TYPE);
                } else if (!(aVar.i == null || aVar.f14900b == null)) {
                    aVar.i.a(aVar.f14900b.l, aVar.f14900b.h, aVar.f14900b.j, aVar.f14900b.r);
                }
            }
            a.this.f14902d = false;
            a.this.f14901c = true;
            if (a.this.h != null) {
                a.this.h.a();
            }
        }
    };

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f14899a, false, 9535, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14899a, false, 9535, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.o.getResources() == null || this.o.getResources().getConfiguration() == null || this.o.getResources().getConfiguration().orientation != 1) {
            return false;
        } else {
            return true;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14899a, false, 9532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14899a, false, 9532, new Class[0], Void.TYPE);
            return;
        }
        this.f14901c = false;
        this.f14902d = false;
        this.g = new com.bytedance.android.livesdk.gift.effect.normal.view.b(this.o);
        this.g.setOrientation(this.j);
        this.g.a(this.f14900b, this.f14903e);
        if (!com.bytedance.android.live.uikit.a.a.f() || this.j == 0 || !c()) {
            this.g.a(-this.f14904f.getWidth(), (this.f14904f.getHeight() - this.n) - (this.l * this.m));
        } else {
            this.g.a(-this.f14904f.getWidth(), (this.l - 1) * this.m);
        }
        this.g.setClickListener(this.i);
        this.f14904f.addView(this.g);
        this.g.a(this.q, this.f14903e);
    }

    public final void b() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f14899a, false, 9534, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14899a, false, 9534, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14900b.q != null && this.f14900b.q.containsKey(String.valueOf(this.f14900b.f14910d * this.f14900b.f14908b))) {
            try {
                i2 = this.f14900b.q.get(String.valueOf(this.f14900b.f14910d * this.f14900b.f14908b)).intValue();
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(k, e2.getMessage());
                i2 = -1;
            }
            if (i2 != -1) {
                String str = k;
                com.bytedance.android.live.core.c.a.b(str, "触发连发特效， 原giftId=" + this.f14900b.j + ", 触发giftId=" + i2);
                ab abVar = new ab();
                abVar.baseMessage = this.f14900b.r.baseMessage;
                abVar.f16430b = this.f14900b.r.f16430b;
                abVar.f16431c = this.f14900b.r.f16431c;
                abVar.f16432d = (long) i2;
                if (this.i != null) {
                    this.i.b(abVar);
                }
            }
        }
    }

    public final void b(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f14899a, false, 9531, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f14899a, false, 9531, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f14900b = bVar;
        a();
        b();
        this.p.put("gift_msg_id", String.valueOf(this.f14900b.i));
        this.p.put("gift_id", String.valueOf(this.f14900b.j));
        c.b().a("ttlive_gift", this.p);
    }

    public final boolean a(b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f14899a, false, 9529, new Class[]{b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f14899a, false, 9529, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f14899a, false, 9527, new Class[]{b.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f14899a, false, 9527, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (!this.f14901c && this.f14900b.a().equals(bVar.a()) && !this.f14900b.g) {
                b bVar3 = this.f14900b;
                if ((bVar2.f14909c == 0 || bVar2.f14909c != bVar3.f14909c) && bVar2.f14910d != bVar3.f14910d + bVar3.f14911e + 1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3 && !bVar2.g) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            this.f14900b.a(bVar2);
        } else {
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f14899a, false, 9528, new Class[]{b.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f14899a, false, 9528, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
            } else if (this.f14901c || !this.f14900b.a().equals(bVar.a()) || this.f14900b.g || !bVar2.g || this.f14900b.f14910d + this.f14900b.f14911e != bVar2.f14910d) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
            this.f14900b.g = true;
            this.f14900b.h = bVar2.h;
            this.f14900b.r = bVar2.r;
        }
        if (com.bytedance.android.live.uikit.a.a.f() && bVar2.r != null && bVar2.r.o && this.f14900b.f14911e > 0) {
            com.bytedance.android.livesdk.gift.effect.normal.view.b bVar4 = this.g;
            if (PatchProxy.isSupport(new Object[0], bVar4, com.bytedance.android.livesdk.gift.effect.normal.view.b.f14955a, false, 9588, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar4, com.bytedance.android.livesdk.gift.effect.normal.view.b.f14955a, false, 9588, new Class[0], Void.TYPE);
            } else if (bVar4.f14960f && bVar4.f14957c != null && bVar4.f14957c.isRunning()) {
                bVar4.f14957c.cancel();
            }
        }
        if (this.f14902d && this.f14900b.f14911e > 0) {
            this.f14900b.b();
            this.g.a();
            b();
            this.f14902d = false;
        }
        return true;
    }

    public a(Context context, NormalGiftAnimationView normalGiftAnimationView, int i2) {
        this.o = context;
        this.f14904f = normalGiftAnimationView;
        this.l = i2;
        this.p.put("desc", "播放小礼物动画");
        this.m = (int) (context.getResources().getDimension(C0906R.dimen.no) + context.getResources().getDimension(C0906R.dimen.nu));
        this.n = (int) context.getResources().getDimension(C0906R.dimen.nv);
    }
}
