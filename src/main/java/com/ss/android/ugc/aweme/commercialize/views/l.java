package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.b.d;
import com.ss.android.downloadlib.c.k;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.AutoPlayUtils;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public abstract class l extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40115a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f40116b = "l";

    /* renamed from: c  reason: collision with root package name */
    View f40117c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f40118d;

    /* renamed from: e  reason: collision with root package name */
    protected TextView f40119e;

    /* renamed from: f  reason: collision with root package name */
    protected ImageView f40120f;
    public int g;
    public Context h;
    e i;
    protected Aweme j;
    public AutoPlayUtils.a k;
    private boolean l;
    private View m;
    private View n;
    private ObjectAnimator o;
    private ObjectAnimator p;
    private String q;
    private Runnable r;
    private Runnable s;
    private d t;
    private View u;
    private boolean v;
    @ColorInt
    private int w;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40121a;

        public final void a(@NonNull c cVar, @Nullable com.ss.android.download.api.b.a aVar) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f40121a, false, 32819, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40121a, false, 32819, new Class[0], Void.TYPE);
                return;
            }
            l.this.a(com.ss.android.ugc.aweme.commercialize.utils.c.D(l.this.j));
        }

        private a() {
        }

        public final void b(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f40121a, false, 32823, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f40121a, false, 32823, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            l.this.g = 3;
            l.this.h();
        }

        public final void a(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f40121a, false, 32822, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f40121a, false, 32822, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            l.this.g = 4;
            l.this.b("0%", l.this.h.getString(C0906R.string.bvd));
        }

        public final void c(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f40121a, false, 32824, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f40121a, false, 32824, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            l.this.g = 2;
            l.this.i();
            if (l.this.k != null) {
                l.this.k.p();
            }
        }

        /* synthetic */ a(l lVar, byte b2) {
            this();
        }

        public final void b(com.ss.android.download.api.c.e eVar, int i) {
            if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f40121a, false, 32821, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f40121a, false, 32821, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            l.this.g = 4;
            l.this.b(l.this.h.getString(C0906R.string.a1u));
        }

        public final void a(com.ss.android.download.api.c.e eVar, int i) {
            long j;
            if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f40121a, false, 32820, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f40121a, false, 32820, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            l.this.g = 4;
            StringBuilder sb = new StringBuilder();
            long j2 = 0;
            if ((eVar.f28494d >> 20) >= 0) {
                j = eVar.f28494d >> 20;
            } else {
                j = 0;
            }
            sb.append(String.valueOf(j));
            sb.append("M/");
            if ((eVar.f28493c >> 20) >= 0) {
                j2 = eVar.f28493c >> 20;
            }
            sb.append(String.valueOf(j2));
            sb.append("M");
            String sb2 = sb.toString();
            l.this.a(l.this.h.getString(C0906R.string.a7w) + i + "%", "(" + sb2 + ")");
            l.this.g();
            if (l.this.k != null) {
                l.this.k.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void a(@ColorInt int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public abstract boolean c();

    /* access modifiers changed from: package-private */
    @LayoutRes
    public abstract int getLayoutId();

    /* access modifiers changed from: package-private */
    public abstract void setLabelVisibility(int i2);

    public int getDefaultColor() {
        return this.w;
    }

    public AutoPlayUtils.a getExitAutoPlay() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q() {
        g.q(this.h, this.j);
    }

    public final boolean j() {
        if (this.g == 4) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.g == 3) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.g == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        if (c() && !u()) {
            a(Color.parseColor(com.ss.android.ugc.aweme.commercialize.utils.c.C(this.j)), (int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
            this.l = true;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32791, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32791, new Class[0], Void.TYPE);
            return;
        }
        if (!this.v) {
            r();
            this.v = true;
        }
    }

    public int getBackGroundColor() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32813, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32813, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.w;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            i2 = ((ColorDrawable) background).getColor();
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public int getShowSeconds() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32811, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32811, new Class[0], Integer.TYPE)).intValue();
        } else if (u()) {
            return 0;
        } else {
            return this.j.getAwemeRawAd().getShowButtonSeconds() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
    }

    public d getStatusChangeListener() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32806, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32806, new Class[0], d.class);
        }
        if (this.t == null) {
            this.t = new a(this, (byte) 0);
        }
        return this.t;
    }

    public void o() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32815, new Class[0], Void.TYPE);
            return;
        }
        this.l = false;
        if (this.r != null) {
            removeCallbacks(this.r);
        }
        if (this.s != null) {
            removeCallbacks(this.s);
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32795, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32795, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32796, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32796, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (!TextUtils.isEmpty(this.q)) {
            com.ss.android.ugc.aweme.app.c.a.c.a().a(this.q);
            this.q = null;
        }
        s();
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32792, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32792, new Class[0], Void.TYPE);
            return;
        }
        this.f40117c = View.inflate(getContext(), getLayoutId(), this);
        this.m = this.f40117c.findViewById(C0906R.id.a77);
        this.n = this.f40117c.findViewById(C0906R.id.a78);
        this.f40118d = (TextView) this.f40117c.findViewById(C0906R.id.bjg);
        this.f40119e = (TextView) this.f40117c.findViewById(C0906R.id.bje);
        this.f40120f = (ImageView) this.f40117c.findViewById(C0906R.id.a76);
        this.u = this.f40117c.findViewById(C0906R.id.a7e);
        com.ss.android.ugc.aweme.utils.c.a(this);
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32805, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32805, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.cancel();
            this.m.clearAnimation();
        }
        if (this.p != null) {
            this.p.cancel();
            this.n.clearAnimation();
        }
        if (this.m != null) {
            this.m.setBackgroundDrawable(null);
        }
        if (this.n != null) {
            this.n.setBackgroundDrawable(null);
        }
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32810, new Class[0], Void.TYPE);
            return;
        }
        int colorChangeSeconds = getColorChangeSeconds();
        if (this.s != null) {
            removeCallbacks(this.s);
        }
        if (this.s == null) {
            this.s = new n(this);
        }
        postDelayed(this.s, (long) colorChangeSeconds);
    }

    private boolean u() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32814, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32814, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (l() || j() || k()) {
            return true;
        } else {
            return false;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32793, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32793, new Class[0], Void.TYPE);
        } else if (a() && !com.ss.android.g.a.a()) {
            setDownloadUrl(com.ss.android.ugc.aweme.commercialize.utils.c.a(this.j));
            com.ss.android.ugc.aweme.app.c.a.c.a().a(k.c(this.h), hashCode(), getStatusChangeListener(), (c) com.ss.android.ugc.aweme.app.c.d.d.a(this.h, this.j));
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32794, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32794, new Class[0], Void.TYPE);
        } else if (a() && !j() && !k()) {
            d();
            s();
            this.m.setVisibility(0);
            this.m.setBackgroundResource(2130837606);
            int screenWidth = UIUtils.getScreenWidth(this.h);
            this.o = ObjectAnimator.ofFloat(this.m, "translationX", new float[]{(float) (-screenWidth), (float) screenWidth});
            this.o.setDuration(1500);
            this.o.setRepeatCount(0);
            this.o.start();
        }
    }

    /* access modifiers changed from: package-private */
    public int getColorChangeSeconds() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32812, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32812, new Class[0], Integer.TYPE)).intValue();
        } else if (this.j == null || !this.j.isAd() || this.j.getAwemeRawAd().getAnimationType() != 3) {
            return getShowSeconds();
        } else {
            return Math.max(getShowSeconds(), this.j.getAwemeRawAd().getShowButtonColorSeconds() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32799, new Class[0], Void.TYPE);
            return;
        }
        d();
        s();
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.f40119e.setVisibility(0);
        this.f40119e.setText(C0906R.string.bkb);
        this.f40119e.setTextColor(ContextCompat.getColor(this.h, C0906R.color.ao4));
        this.f40118d.setVisibility(8);
        this.f40120f.setVisibility(8);
        a(Color.parseColor(com.ss.android.ugc.aweme.commercialize.utils.c.C(this.j)), 0);
    }

    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32800, new Class[0], Void.TYPE);
            return;
        }
        d();
        s();
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.f40119e.setVisibility(0);
        this.f40119e.setText(C0906R.string.tr);
        this.f40119e.setTextColor(ContextCompat.getColor(this.h, C0906R.color.ao4));
        this.f40118d.setVisibility(8);
        this.f40120f.setVisibility(8);
        a(Color.parseColor(com.ss.android.ugc.aweme.commercialize.utils.c.C(this.j)), 0);
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32808, new Class[0], Void.TYPE);
        } else if (a()) {
            d();
            if (!b()) {
                n();
            }
            if (c() && !u() && !this.l) {
                t();
            }
        }
    }

    public void n() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32809, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            removeCallbacks(this.r);
        }
        int showSeconds = getShowSeconds();
        if (this.r == null) {
            this.r = new m(this);
        }
        postDelayed(this.r, (long) showSeconds);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32797, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32797, new Class[0], Void.TYPE);
        } else if (a()) {
            a(this.w, 0);
            d();
            if (this.o == null || !this.o.isRunning()) {
                this.m.setBackgroundResource(2130840307);
                this.n.setBackgroundResource(2130840307);
                int screenWidth = UIUtils.getScreenWidth(this.h);
                float f2 = (float) (-screenWidth);
                float f3 = (float) screenWidth;
                this.o = ObjectAnimator.ofFloat(this.m, "translationX", new float[]{f2, f3});
                this.o.setDuration(4000);
                this.o.setRepeatCount(-1);
                this.o.start();
                this.p = ObjectAnimator.ofFloat(this.n, "translationX", new float[]{f2, f3});
                this.p.setDuration(4000);
                this.p.setStartDelay(1000);
                this.p.setRepeatCount(-1);
                this.p.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setDefaultColor(@ColorInt int i2) {
        this.w = i2;
    }

    public void setDownloadUrl(String str) {
        this.q = str;
    }

    public void setExitAutoPlay(AutoPlayUtils.a aVar) {
        this.k = aVar;
    }

    public l(Context context) {
        this(context, null);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f40115a, false, 32798, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f40115a, false, 32798, new Class[]{String.class}, Void.TYPE);
            return;
        }
        d();
        s();
        this.g = 0;
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.f40119e.setTextColor(ContextCompat.getColor(this.h, C0906R.color.ao4));
        this.f40119e.setText(str);
        this.f40118d.setVisibility(8);
        this.f40120f.setVisibility(0);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f40115a, false, 32802, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f40115a, false, 32802, new Class[]{String.class}, Void.TYPE);
            return;
        }
        d();
        a(this.w, 0);
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.f40119e.setVisibility(0);
        this.f40119e.setText(str);
        this.f40119e.setTextColor(ContextCompat.getColor(this.h, C0906R.color.a0b));
        this.f40118d.setVisibility(8);
        this.f40120f.setVisibility(8);
    }

    public l(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f40115a, false, 32801, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f40115a, false, 32801, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        d();
        this.m.setVisibility(0);
        this.n.setVisibility(0);
        this.f40119e.setVisibility(0);
        this.f40119e.setText(str);
        this.f40119e.setTextColor(ContextCompat.getColor(this.h, C0906R.color.a0b));
        this.f40118d.setVisibility(0);
        this.f40118d.setText(str2);
        this.f40118d.setTextColor(ContextCompat.getColor(this.h, C0906R.color.a0b));
        this.f40120f.setVisibility(8);
    }

    public final void b(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f40115a, false, 32804, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f40115a, false, 32804, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        d();
        clearAnimation();
        a(this.w, 0);
        this.m.setVisibility(0);
        this.n.setVisibility(0);
        this.f40119e.setVisibility(0);
        this.f40119e.setText(str);
        this.f40118d.setVisibility(0);
        this.f40118d.setText(str2);
        this.f40120f.setVisibility(8);
    }

    public final void a(Aweme aweme, e eVar) {
        boolean z;
        Aweme aweme2 = aweme;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{aweme2, eVar2}, this, f40115a, false, 32790, new Class[]{Aweme.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, eVar2}, this, f40115a, false, 32790, new Class[]{Aweme.class, e.class}, Void.TYPE);
            return;
        }
        this.i = eVar2;
        this.j = aweme2;
        if (!a()) {
            setLabelVisibility(8);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f40115a, false, 32807, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40115a, false, 32807, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.j == null || !this.j.isAd()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            d();
            setLabelVisibility(0);
            String a2 = n.a(getContext(), aweme, false);
            if (aweme.isAppAd()) {
                a(a2);
            } else {
                boolean c2 = c();
                if (c2) {
                    a2 = this.h.getString(C0906R.string.o_, new Object[]{a2});
                }
                String str = a2;
                if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(c2 ? (byte) 1 : 0)}, this, f40115a, false, 32803, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(c2)}, this, f40115a, false, 32803, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    d();
                    this.g = 1;
                    this.m.setVisibility(8);
                    this.n.setVisibility(8);
                    this.f40119e.setVisibility(0);
                    this.f40119e.setText(str);
                    this.f40119e.setTextColor(ContextCompat.getColor(this.h, C0906R.color.ao4));
                    this.f40118d.setVisibility(8);
                }
            }
        } else {
            setLabelVisibility(8);
        }
    }

    public l(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = context;
    }
}
