package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.p;
import com.ss.android.ugc.aweme.commercialize.utils.s;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageFragment;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.f.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.web.jsbridge.a;
import javax.annotation.Nonnull;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40034a = null;
    private static final String n = "a";

    /* renamed from: b  reason: collision with root package name */
    public Context f40035b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f40036c;

    /* renamed from: d  reason: collision with root package name */
    public AdHalfWebPageContainer f40037d;

    /* renamed from: e  reason: collision with root package name */
    public BlackMaskLayer f40038e;

    /* renamed from: f  reason: collision with root package name */
    public FragmentManager f40039f;
    public f g;
    public String h;
    public int i;
    public AbsHalfWebPageAction j;
    public BlackMaskLayer k;
    public String l;
    int m;
    private int o;
    private Bundle p;
    private AbsHalfWebPageAction q;
    private AdHalfWebPageContainer r;
    private FragmentManager s;
    private final int t;
    private ViewTreeObserver.OnGlobalLayoutListener u;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.a$a  reason: collision with other inner class name */
    public static class C0519a {

        /* renamed from: a  reason: collision with root package name */
        public a f40045a = new a((byte) 0);

        public final C0519a a(@Nonnull Context context) {
            this.f40045a.f40035b = context;
            return this;
        }

        public final C0519a a(@Nonnull FragmentManager fragmentManager) {
            this.f40045a.f40039f = fragmentManager;
            return this;
        }

        public final C0519a a(@Nonnull f fVar) {
            this.f40045a.g = fVar;
            return this;
        }

        public final C0519a a(@Nonnull AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f40045a.f40037d = adHalfWebPageContainer;
            return this;
        }

        public final C0519a a(@Nonnull BlackMaskLayer blackMaskLayer) {
            this.f40045a.f40038e = blackMaskLayer;
            return this;
        }

        public final C0519a a(@Nonnull Aweme aweme) {
            this.f40045a.f40036c = aweme;
            return this;
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33017, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33017, new Class[0], Boolean.TYPE)).booleanValue();
        }
        f();
        l();
        g();
        return i();
    }

    public final void a(Runnable runnable, IFeedViewHolder iFeedViewHolder, boolean z) {
        if (PatchProxy.isSupport(new Object[]{runnable, iFeedViewHolder, Byte.valueOf(z ? (byte) 1 : 0)}, this, f40034a, false, 33038, new Class[]{Runnable.class, IFeedViewHolder.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable, iFeedViewHolder, Byte.valueOf(z)}, this, f40034a, false, 33038, new Class[]{Runnable.class, IFeedViewHolder.class, Boolean.TYPE}, Void.TYPE);
        } else if (c.o(this.f40036c)) {
            a(runnable, iFeedViewHolder, Boolean.valueOf(z), this.r, this.k);
            a(false, true);
        } else {
            a(runnable, iFeedViewHolder, Boolean.valueOf(z), this.f40037d, this.f40038e);
            a(false, false);
        }
    }

    private a() {
        this.l = "";
        this.t = 20;
    }

    private j h() {
        if (!PatchProxy.isSupport(new Object[0], this, f40034a, false, 33022, new Class[0], j.class)) {
            return a(false);
        }
        return (j) PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33022, new Class[0], j.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33029, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33029, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40037d != null && this.f40037d.b()) {
            this.q.b();
        }
        j();
        k();
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f40034a, false, 33031, new Class[0], Boolean.TYPE)) {
            return b(false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33031, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33025, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33025, new Class[0], Void.TYPE);
        } else if (this.f40039f != null && h() != null) {
            FragmentTransaction beginTransaction = this.f40039f.beginTransaction();
            j h2 = h();
            if (h2 != null) {
                beginTransaction.remove(h2.f());
                beginTransaction.commitAllowingStateLoss();
            }
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33026, new Class[0], Void.TYPE);
        } else if (this.f40035b instanceof FragmentActivity) {
            j a2 = a(true);
            if (a2 != null) {
                this.s.beginTransaction().remove(a2.f()).commitAllowingStateLoss();
            }
        }
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33027, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40036c == null || !this.f40036c.isShowCommerceCard()) {
            this.p = c.I(this.f40036c);
        } else {
            this.p = s.a(this.f40036c);
        }
        if (c.p(this.f40036c)) {
            a.C0800a.a(c.m(this.f40036c));
            a.C0800a.b(c.n(this.f40036c));
            a.C0800a.a(this.f40036c);
        }
    }

    public final boolean c() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33030, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33030, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (!(this.q instanceof AbsAdCardAction) || !((AbsAdCardAction) this.q).f2953b) {
                z = false;
            } else {
                z = true;
            }
            if (!(this.j instanceof AbsAdCardAction) || !((AbsAdCardAction) this.j).f2953b) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
            return false;
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33018, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f40037d.getLayoutParams();
        CardStruct m2 = c.m(this.f40036c);
        int dip2Px = (int) UIUtils.dip2Px(this.f40035b, 138.0f);
        if (m2 != null) {
            switch (m2.getCardStyle()) {
                case 0:
                    if (m2.getCardType() == 2) {
                        dip2Px = (int) UIUtils.dip2Px(this.f40035b, 147.0f);
                        break;
                    }
                    break;
                case 1:
                    dip2Px = (int) UIUtils.dip2Px(this.f40035b, 130.0f);
                    break;
            }
        }
        layoutParams.height = dip2Px;
        this.f40037d.setLayoutParams(layoutParams);
        this.f40038e.setVisibility(8);
        this.f40037d.setInCleanMode(false);
        this.f40037d.a();
        this.f40037d.setVisibility(4);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33019, new Class[0], Void.TYPE);
        } else if (this.f40035b != null && (this.f40035b instanceof FragmentActivity)) {
            if (this.r == null) {
                this.r = (AdHalfWebPageContainer) ((FragmentActivity) this.f40035b).findViewById(C0906R.id.d8);
            }
            if (this.k == null) {
                this.k = (BlackMaskLayer) ((FragmentActivity) this.f40035b).findViewById(C0906R.id.d9);
            }
            if (this.s == null) {
                this.s = ((FragmentActivity) this.f40035b).getSupportFragmentManager();
            }
            if (this.r != null && this.s != null) {
                CardStruct n2 = c.n(this.f40036c);
                if (n2 == null) {
                    this.r.setVisibility(8);
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                if (n2.getCardType() == 9) {
                    layoutParams.height = (int) UIUtils.dip2Px(this.f40035b, 342.0f);
                } else if (n2.getCardType() == 8) {
                    layoutParams.height = (int) UIUtils.dip2Px(this.f40035b, 295.0f);
                } else {
                    return;
                }
                layoutParams.bottomMargin = (layoutParams.height + 5) * -1;
                this.r.c();
                this.r.setLayoutParams(layoutParams);
                a(this.s);
            }
        }
    }

    private boolean i() {
        j jVar;
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33024, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33024, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (p.a()) {
            jVar = AdHalfWebPageFragmentV2.a(this.p);
        } else {
            jVar = AdHalfWebPageFragment.b(this.p);
        }
        if (jVar == null) {
            return false;
        }
        a(jVar.f());
        jVar.a(this.g);
        jVar.a((k) this.q);
        View childAt = this.f40037d.getChildAt(0);
        if (childAt == null) {
            if (Build.VERSION.SDK_INT >= 17) {
                this.o = View.generateViewId();
            } else {
                this.o = C0906R.id.c3;
            }
            FrameLayout frameLayout = new FrameLayout(this.f40035b);
            frameLayout.setId(this.o);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f40037d.addView(frameLayout);
        } else {
            this.o = childAt.getId();
        }
        FragmentTransaction beginTransaction = this.f40039f.beginTransaction();
        beginTransaction.replace(this.o, jVar.f(), "card_default");
        beginTransaction.commitAllowingStateLoss();
        return true;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33033, new Class[0], Void.TYPE);
        } else if (!d()) {
            g.L(this.f40035b, this.f40036c);
        } else if (!this.f40037d.f39876b) {
            j h2 = h();
            if (h2 != null) {
                h2.a(true);
                c(false);
                View decorView = ((Activity) this.f40035b).getWindow().getDecorView();
                if (!this.f40037d.b()) {
                    this.f40037d.setVisibility(0);
                    this.f40037d.setAlpha(1.0f);
                    this.f40037d.setX((float) ((decorView.getWidth() - this.f40037d.getWidth()) / 2));
                }
                int dip2Px = (int) UIUtils.dip2Px(this.f40035b, 278.0f);
                this.f40037d.a(100, dip2Px, (decorView.getWidth() - this.f40037d.getWidth()) / 2, (decorView.getHeight() - dip2Px) / 2);
                a(true, false);
                d(false);
                bg.a(new m(false));
            }
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public com.ss.android.ugc.playerkit.videoview.g a(IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, this, f40034a, false, 33041, new Class[]{IFeedViewHolder.class}, com.ss.android.ugc.playerkit.videoview.g.class)) {
            return (com.ss.android.ugc.playerkit.videoview.g) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, this, f40034a, false, 33041, new Class[]{IFeedViewHolder.class}, com.ss.android.ugc.playerkit.videoview.g.class);
        } else if (iFeedViewHolder == null) {
            return null;
        } else {
            return iFeedViewHolder.m();
        }
    }

    private j a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40034a, false, 33023, new Class[]{Boolean.TYPE}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40034a, false, 33023, new Class[]{Boolean.TYPE}, j.class);
        }
        if (z) {
            if (this.s == null) {
                return null;
            }
            Fragment findFragmentByTag = this.s.findFragmentByTag("card_tag_top_page");
            if (findFragmentByTag instanceof j) {
                return (j) findFragmentByTag;
            }
        } else if (this.f40039f == null) {
            return null;
        } else {
            Fragment findFragmentByTag2 = this.f40039f.findFragmentByTag("card_default");
            if (findFragmentByTag2 instanceof j) {
                return (j) findFragmentByTag2;
            }
        }
        return null;
    }

    private boolean b(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40034a, false, 33032, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40034a, false, 33032, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        j a2 = a(z);
        if (a2 != null) {
            z3 = a2.g();
            z2 = a2.h();
        } else {
            z2 = false;
        }
        if (z2) {
            this.l = "";
        } else if (!z3) {
            this.l = "data_load_fail";
        } else {
            this.l = "load_timeout";
        }
        return z2;
    }

    private void d(boolean z) {
        BlackMaskLayer blackMaskLayer;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40034a, false, 33036, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40034a, false, 33036, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            blackMaskLayer = this.k;
        } else {
            blackMaskLayer = this.f40038e;
        }
        if (blackMaskLayer != null) {
            if (this.i == 0) {
                if (!o.v()) {
                    o.b().h();
                } else {
                    com.ss.android.ugc.playerkit.videoview.a.a().T();
                }
            }
            blackMaskLayer.setVisibility(0);
            blackMaskLayer.animate().alpha(0.8f).setDuration(100).start();
        }
    }

    private void a(@NonNull FragmentManager fragmentManager) {
        j jVar;
        if (PatchProxy.isSupport(new Object[]{fragmentManager}, this, f40034a, false, 33020, new Class[]{FragmentManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager}, this, f40034a, false, 33020, new Class[]{FragmentManager.class}, Void.TYPE);
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (p.a()) {
            jVar = AdHalfWebPageFragmentV2.a(c.J(this.f40036c));
        } else {
            jVar = AdHalfWebPageFragment.b(c.J(this.f40036c));
        }
        jVar.a(this.g);
        this.j = new TopPageAction(this.f40035b, this.f40036c, jVar.f(), this.g);
        jVar.a((k) this.j);
        beginTransaction.add(C0906R.id.d8, jVar.f(), "card_tag_top_page");
        beginTransaction.hide(jVar.f()).commitAllowingStateLoss();
    }

    private void c(boolean z) {
        AdHalfWebPageContainer adHalfWebPageContainer;
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40034a, false, 33034, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40034a, false, 33034, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            adHalfWebPageContainer = this.r;
        } else {
            adHalfWebPageContainer = this.f40037d;
        }
        AdHalfWebPageContainer adHalfWebPageContainer2 = adHalfWebPageContainer;
        j a2 = a(z);
        if (adHalfWebPageContainer2 != null && a2 != null) {
            WebView b2 = a2.b();
            f.a(b2, "javascript:window.dialogPopUp()");
            b2.requestFocus();
            try {
                ((InputMethodManager) this.f40035b.getSystemService("input_method")).showSoftInput(b2, 2);
            } catch (Exception unused) {
            }
            View decorView = ((Activity) this.f40035b).getWindow().getDecorView();
            Context context = this.f40035b;
            if (z) {
                f2 = 342.0f;
            } else {
                f2 = 278.0f;
            }
            b bVar = new b(this, decorView, a2, adHalfWebPageContainer2, (int) UIUtils.dip2Px(context, f2));
            this.u = bVar;
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.u);
        }
    }

    private void a(Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragment}, this, f40034a, false, 33028, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment}, this, f40034a, false, 33028, new Class[]{Fragment.class}, Void.TYPE);
        } else if (this.f40036c == null || !this.f40036c.isShowCommerceCard()) {
            CardStruct m2 = c.m(this.f40036c);
            if (m2 != null) {
                switch (m2.getCardType()) {
                    case 1:
                        this.q = new FormAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    case 2:
                        this.q = new DownloadAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    case 3:
                        this.q = new ShopAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    case 4:
                        this.q = new ImageAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    case 5:
                        this.q = new InteractAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    case 6:
                        this.q = new PollAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    case e.l:
                        this.q = new SurveyAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    case 8:
                    case 9:
                        this.q = new CouponAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    case 10:
                        this.q = new PoiAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                    default:
                        this.q = new LandingPageAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
                        return;
                }
            } else {
                this.q = new LandingPageAdCardAction(this.f40035b, this.f40036c, fragment, this.g);
            }
        } else {
            CommerceCardAction commerceCardAction = new CommerceCardAction(this.f40035b, this.f40036c, fragment, this.g, this.h);
            this.q = commerceCardAction;
        }
    }

    public final void a(int i2) {
        byte b2;
        boolean z;
        float f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40034a, false, 33040, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40034a, false, 33040, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a(h().f(), "", "click_get_coupon", ad.a().a("login_title", this.f40035b.getString(C0906R.string.a2q)).f75487b);
        } else {
            j jVar = (j) this.s.findFragmentByTag("card_tag_top_page");
            if (jVar != null && this.r != null && this.s != null) {
                if (this.f40037d.b() && i2 == 17) {
                    this.f40037d.a(AdHalfWebPageContainer.a(this.f40036c));
                }
                if (!b(true)) {
                    g.a(this.f40035b, this.f40036c, "load_fail", "coupon");
                    return;
                }
                jVar.a("javascript:window.creative_showModal()");
                this.k.setVisibility(0);
                if (PatchProxy.isSupport(new Object[0], this, f40034a, false, 33037, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40034a, false, 33037, new Class[0], Void.TYPE);
                } else {
                    this.k.setOnTouchListener(new View.OnTouchListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f40040a;

                        /* renamed from: c  reason: collision with root package name */
                        private long f40042c;

                        /* renamed from: d  reason: collision with root package name */
                        private float f40043d;

                        /* renamed from: e  reason: collision with root package name */
                        private float f40044e;

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            boolean z;
                            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f40040a, false, 33047, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f40040a, false, 33047, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                            }
                            switch (motionEvent.getAction()) {
                                case 0:
                                    this.f40042c = System.currentTimeMillis();
                                    this.f40043d = motionEvent.getX();
                                    this.f40044e = motionEvent.getY();
                                    break;
                                case 1:
                                    float x = motionEvent.getX();
                                    float y = motionEvent.getY();
                                    if (System.currentTimeMillis() - this.f40042c <= 100) {
                                        float f2 = this.f40043d;
                                        float f3 = this.f40044e;
                                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(x), Float.valueOf(f3), Float.valueOf(y)}, this, f40040a, false, 33048, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(x), Float.valueOf(f3), Float.valueOf(y)}, this, f40040a, false, 33048, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                                        } else {
                                            float abs = Math.abs(f2 - x);
                                            float abs2 = Math.abs(f3 - y);
                                            if (abs > 50.0f || abs2 > 50.0f) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                        }
                                        if (z && a.this.j != null) {
                                            a.this.j.b();
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return false;
                        }
                    });
                }
                this.s.beginTransaction().show(jVar.f()).commitAllowingStateLoss();
                CardStruct n2 = c.n(this.f40036c);
                if (n2 == null || n2.getCardType() != 9) {
                    b2 = 0;
                } else {
                    b2 = 1;
                }
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2)}, this, f40034a, false, 33035, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2)}, this, f40034a, false, 33035, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    j a2 = a(true);
                    if (!(a2 == null || this.r == null)) {
                        a2.a(true);
                        Aweme aweme = this.f40036c;
                        if (PatchProxy.isSupport(new Object[]{aweme}, null, c.f39774a, true, 32245, new Class[]{Aweme.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, c.f39774a, true, 32245, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            CardStruct n3 = c.n(aweme);
                            if (n3 == null || n3.getCardType() != 9) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        if (z) {
                            c(true);
                        }
                        View decorView = ((FragmentActivity) this.f40035b).getWindow().getDecorView();
                        Context context = this.f40035b;
                        if (b2 != 0) {
                            f2 = 342.0f;
                        } else {
                            f2 = 295.0f;
                        }
                        int dip2Px = (int) UIUtils.dip2Px(context, f2);
                        this.r.setVisibility(0);
                        this.r.a(0, 0, (decorView.getWidth() - this.r.getWidth()) / 2, decorView.getHeight() + dip2Px);
                        this.r.a(100, dip2Px, (decorView.getWidth() - this.r.getWidth()) / 2, (decorView.getHeight() - dip2Px) / 2);
                        a(true, true);
                        d(true);
                    }
                }
                g.a(this.f40035b, this.f40036c, "othershow", "coupon");
            }
        }
    }

    private void a(boolean z, boolean z2) {
        if (!z2) {
            AbsHalfWebPageAction absHalfWebPageAction = this.q;
            if (absHalfWebPageAction instanceof AbsAdCardAction) {
                ((AbsAdCardAction) absHalfWebPageAction).f2953b = z;
            }
            return;
        }
        if (this.j instanceof AbsAdCardAction) {
            ((AbsAdCardAction) this.j).f2953b = z;
        }
    }

    private void a(Runnable runnable, IFeedViewHolder iFeedViewHolder, Boolean bool, AdHalfWebPageContainer adHalfWebPageContainer, BlackMaskLayer blackMaskLayer) {
        Runnable runnable2 = runnable;
        IFeedViewHolder iFeedViewHolder2 = iFeedViewHolder;
        AdHalfWebPageContainer adHalfWebPageContainer2 = adHalfWebPageContainer;
        BlackMaskLayer blackMaskLayer2 = blackMaskLayer;
        if (PatchProxy.isSupport(new Object[]{runnable2, iFeedViewHolder2, bool, adHalfWebPageContainer2, blackMaskLayer2}, this, f40034a, false, 33039, new Class[]{Runnable.class, IFeedViewHolder.class, Boolean.class, AdHalfWebPageContainer.class, BlackMaskLayer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2, iFeedViewHolder2, bool, adHalfWebPageContainer2, blackMaskLayer2}, this, f40034a, false, 33039, new Class[]{Runnable.class, IFeedViewHolder.class, Boolean.class, AdHalfWebPageContainer.class, BlackMaskLayer.class}, Void.TYPE);
        } else if (adHalfWebPageContainer2 != null && blackMaskLayer2 != null) {
            View decorView = ((Activity) this.f40035b).getWindow().getDecorView();
            View findFocus = decorView.findFocus();
            try {
                ((InputMethodManager) this.f40035b.getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
            } catch (Exception unused) {
            }
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            adHalfWebPageContainer.a(400, adHalfWebPageContainer.getHeight(), (int) adHalfWebPageContainer.getX(), decorView.getHeight());
            adHalfWebPageContainer2.postDelayed(runnable2, 400);
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this.u);
            if (this.i == 0 && bool.booleanValue()) {
                if (!o.v()) {
                    o.b().f();
                } else {
                    com.ss.android.ugc.playerkit.videoview.g a2 = a(iFeedViewHolder2);
                    if (a2 != null) {
                        a2.S();
                    } else {
                        com.ss.android.ugc.playerkit.videoview.a.a().S();
                    }
                }
            }
            blackMaskLayer.animate().alpha(0.0f).setDuration(100).withEndAction(new c(blackMaskLayer2)).start();
            adHalfWebPageContainer2.postDelayed(d.f40055b, 400);
        }
    }
}
