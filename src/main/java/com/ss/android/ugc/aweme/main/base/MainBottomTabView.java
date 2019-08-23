package com.ss.android.ugc.aweme.main.base;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.main.base.tab.l;
import com.ss.android.ugc.aweme.main.base.tab.m;
import com.ss.android.ugc.aweme.main.bz;
import com.ss.android.ugc.aweme.main.page.TabClickCallBack;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import org.greenrobot.eventbus.Subscribe;

public class MainBottomTabView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3526a;

    /* renamed from: b  reason: collision with root package name */
    public a f3527b;

    /* renamed from: c  reason: collision with root package name */
    public b f3528c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3529d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, b> f3530e;

    /* renamed from: f  reason: collision with root package name */
    private b f3531f;
    private b g;
    private b h;
    private b i;
    private String j;
    private int k;
    private int l;
    private int m;
    private ValueAnimator n;
    private g o;
    private LinearLayout p;

    public interface a {
        void a(@TabType String str);

        boolean b(@TabType String str);
    }

    public g getMode() {
        return this.o;
    }

    public final void a(boolean z, @TabType String str, SimpleUser simpleUser) {
        String str2 = str;
        SimpleUser simpleUser2 = simpleUser;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2, simpleUser2}, this, f3526a, false, 57759, new Class[]{Boolean.TYPE, String.class, SimpleUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2, simpleUser2}, this, f3526a, false, 57759, new Class[]{Boolean.TYPE, String.class, SimpleUser.class}, Void.TYPE);
            return;
        }
        b bVar = this.f3530e.get(str2);
        if (bVar instanceof com.ss.android.ugc.aweme.main.base.tab.a) {
            if (z) {
                ((com.ss.android.ugc.aweme.main.base.tab.a) bVar).a(simpleUser2);
                return;
            }
            ((com.ss.android.ugc.aweme.main.base.tab.a) bVar).m();
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3526a, false, 57749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3526a, false, 57749, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
    }

    private int getBottomColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3526a, false, 57763, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3526a, false, 57763, new Class[0], Integer.TYPE)).intValue();
        } else if (!com.ss.android.ugc.aweme.profile.a.a().l) {
            return C0906R.color.ano;
        } else {
            if (com.ss.android.ugc.aweme.profile.a.d()) {
                return C0906R.color.h7;
            }
            return C0906R.color.a2t;
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3526a, false, 57748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3526a, false, 57748, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if ("mode_text".equals(this.j) || "mode_theme".equals(this.j)) {
            bg.c(this);
            return;
        }
        throw new IllegalStateException("Main Tab not support this mode");
    }

    private void setOnTabClickListener(a aVar) {
        this.f3527b = aVar;
    }

    public void setAppWidth(int i2) {
        this.k = i2;
    }

    public MainBottomTabView(@NonNull Context context) throws Exception {
        this(context, null, 0);
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        boolean z;
        if (awesomeSplashEvent.f39420b != 4) {
            z = true;
        } else {
            z = false;
        }
        this.f3529d = z;
    }

    public void setMode(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3526a, false, 57752, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3526a, false, 57752, new Class[]{g.class}, Void.TYPE);
            return;
        }
        a(gVar2, false);
    }

    private void a(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3526a, false, 57764, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3526a, false, 57764, new Class[]{g.class}, Void.TYPE);
            return;
        }
        this.f3531f.setLayoutParams(new LinearLayout.LayoutParams(b(gVar, false), -1));
        this.g.setLayoutParams(new LinearLayout.LayoutParams(b(gVar, false), -1));
        this.f3528c.setLayoutParams(new LinearLayout.LayoutParams(b(gVar, false), -1));
        this.h.setLayoutParams(new LinearLayout.LayoutParams(b(gVar, false), -1));
        this.i.setLayoutParams(new LinearLayout.LayoutParams(b(gVar, false), -1));
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3526a, false, 57754, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3526a, false, 57754, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f3530e.containsKey(str)) {
            this.f3530e.get(str).g();
        }
    }

    public final b c(@TabType String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f3526a, false, 57761, new Class[]{String.class}, b.class)) {
            return this.f3530e.get(str2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{str2}, this, f3526a, false, 57761, new Class[]{String.class}, b.class);
    }

    public void setAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3526a, false, 57768, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3526a, false, 57768, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (!TabAlphaController.a().f3536c) {
            super.setAlpha(f2);
        }
    }

    public void setViewMode(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3526a, false, 57747, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3526a, false, 57747, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.j = str;
        if (this.j != null) {
            String str2 = this.j;
            char c2 = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -2021698999) {
                if (hashCode == 1751911469 && str2.equals("mode_theme")) {
                    c2 = 1;
                }
            } else if (str2.equals("mode_text")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    setMode(g.MODE_TEXT);
                    return;
                case 1:
                    setMode(g.MODE_THEME);
                    break;
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3526a, false, 57751, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3526a, false, 57751, new Class[]{String.class}, Void.TYPE);
            return;
        }
        for (String next : this.f3530e.keySet()) {
            b bVar = this.f3530e.get(next);
            if (!(next == null || bVar == null)) {
                if (next.equals(str)) {
                    bVar.d();
                } else {
                    bVar.a();
                }
            }
        }
        if (TextUtils.equals(str, "HOME")) {
            this.g.setActivated(false);
            this.h.setActivated(false);
            this.i.setActivated(false);
        } else {
            this.g.setActivated(true);
            this.h.setActivated(true);
            this.i.setActivated(true);
        }
        d(str);
    }

    public final void d(String str) {
        int i2;
        int i3;
        long j2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f3526a, false, 57762, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3526a, false, 57762, new Class[]{String.class}, Void.TYPE);
            return;
        }
        boolean z = !TextUtils.equals(str, "HOME");
        Context context = getContext();
        if (z) {
            i2 = C0906R.color.ano;
        } else {
            i2 = this.l;
        }
        int color = ContextCompat.getColor(context, i2);
        Context context2 = getContext();
        if (z) {
            i3 = this.l;
        } else {
            i3 = getBottomColor();
        }
        int color2 = ContextCompat.getColor(context2, i3);
        if (color != color2) {
            if (this.n != null) {
                this.n.cancel();
            }
            this.n = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color), Integer.valueOf(color2)});
            this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54402a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54402a, false, 57774, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54402a, false, 57774, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    MainBottomTabView.this.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            ValueAnimator valueAnimator = this.n;
            if (z) {
                j2 = 0;
            } else {
                j2 = 100;
            }
            valueAnimator.setDuration(j2);
            this.n.start();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3526a, false, 57756, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3526a, false, 57756, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f3528c.setEnabled(z);
    }

    public MainBottomTabView(@NonNull Context context, @Nullable AttributeSet attributeSet) throws Exception {
        this(context, attributeSet, 0);
    }

    private int b(g gVar, boolean z) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{gVar, (byte) 0}, this, f3526a, false, 57765, new Class[]{g.class, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{gVar, (byte) 0}, this, f3526a, false, 57765, new Class[]{g.class, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        if (gVar == g.MODE_TEXT) {
            i2 = this.m;
        } else {
            i2 = this.m + 2;
        }
        if (this.k > 0) {
            i3 = u.a((double) this.k);
        } else {
            i3 = p.c(getContext());
        }
        float f2 = (float) i2;
        return (int) ((((((float) i3) - (UIUtils.dip2Px(getContext(), f2) * 5.0f)) / 10.0f) * 2.0f) + UIUtils.dip2Px(getContext(), f2));
    }

    public final void a(g gVar, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{gVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3526a, false, 57753, new Class[]{g.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar, Byte.valueOf(z)}, this, f3526a, false, 57753, new Class[]{g.class, Boolean.TYPE}, Void.TYPE);
        } else if (z || gVar != this.o) {
            this.o = gVar;
            switch (gVar) {
                case MODE_THEME:
                    this.f3531f = new m(getContext(), "HOME");
                    this.g = new m(getContext(), bz.f54668a);
                    this.f3528c = new m(getContext(), "PUBLISH");
                    this.h = new m(getContext(), "NOTIFICATION");
                    this.i = new m(getContext(), "USER");
                    break;
                case MODE_TEXT:
                    Context context = getContext();
                    if (AbTestManager.a().F() == 0) {
                        z2 = true;
                    }
                    this.f3531f = new l(context, "HOME", z2);
                    this.g = new com.ss.android.ugc.aweme.main.base.tab.a(getContext(), bz.f54668a);
                    this.f3528c = new l(getContext(), "PUBLISH");
                    this.h = new l(getContext(), "NOTIFICATION");
                    this.i = new l(getContext(), "USER");
                    break;
            }
            if (this.p.getChildCount() > 0) {
                this.p.removeAllViews();
            }
            this.f3531f.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54411a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54411a, false, 57777, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f54411a, false, 57777, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (MainBottomTabView.this.f3527b != null) {
                        MainBottomTabView.this.f3527b.a("HOME");
                    }
                }
            });
            this.f3531f.setOnLongClickListener(new View.OnLongClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54384a;

                public final boolean onLongClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54384a, false, 57778, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f54384a, false, 57778, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    } else if (MainBottomTabView.this.f3527b != null) {
                        return MainBottomTabView.this.f3527b.b("HOME");
                    } else {
                        return false;
                    }
                }
            });
            this.g.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54386a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54386a, false, 57779, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f54386a, false, 57779, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (MainBottomTabView.this.f3527b != null) {
                        MainBottomTabView.this.f3527b.a(bz.f54668a);
                    }
                }
            });
            this.g.setOnLongClickListener(new View.OnLongClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54388a;

                public final boolean onLongClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54388a, false, 57780, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f54388a, false, 57780, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    } else if (MainBottomTabView.this.f3527b != null) {
                        return MainBottomTabView.this.f3527b.b(bz.f54668a);
                    } else {
                        return false;
                    }
                }
            });
            this.f3528c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54390a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54390a, false, 57781, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f54390a, false, 57781, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    MainBottomTabView.this.f3528c.l();
                    if (MainBottomTabView.this.f3527b != null) {
                        MainBottomTabView.this.f3528c.l();
                        MainBottomTabView.this.f3527b.a("PUBLISH");
                    }
                }
            });
            this.f3528c.setOnLongClickListener(new View.OnLongClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54392a;

                public final boolean onLongClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54392a, false, 57782, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f54392a, false, 57782, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    } else if (MainBottomTabView.this.f3527b != null) {
                        return MainBottomTabView.this.f3527b.b("PUBLISH");
                    } else {
                        return false;
                    }
                }
            });
            this.h.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54394a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54394a, false, 57783, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f54394a, false, 57783, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (MainBottomTabView.this.f3527b != null) {
                        MainBottomTabView.this.f3527b.a("NOTIFICATION");
                    }
                }
            });
            this.h.setOnLongClickListener(new View.OnLongClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54396a;

                public final boolean onLongClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54396a, false, 57771, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f54396a, false, 57771, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    } else if (MainBottomTabView.this.f3527b != null) {
                        return MainBottomTabView.this.f3527b.b("NOTIFICATION");
                    } else {
                        return false;
                    }
                }
            });
            this.i.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54398a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54398a, false, 57772, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f54398a, false, 57772, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (MainBottomTabView.this.f3527b != null) {
                        MainBottomTabView.this.f3527b.a("USER");
                    }
                }
            });
            this.i.setOnLongClickListener(new View.OnLongClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54400a;

                public final boolean onLongClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54400a, false, 57773, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f54400a, false, 57773, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    } else if (MainBottomTabView.this.f3527b != null) {
                        return MainBottomTabView.this.f3527b.b("USER");
                    } else {
                        return false;
                    }
                }
            });
            this.p.addView(this.f3531f);
            this.p.addView(this.g);
            this.p.addView(this.f3528c);
            this.p.addView(this.h);
            this.p.addView(this.i);
            a(gVar);
            this.f3530e.put("HOME", this.f3531f);
            this.f3530e.put(bz.f54668a, this.g);
            this.f3530e.put("NOTIFICATION", this.h);
            this.f3530e.put("USER", this.i);
            this.f3530e.put("PUBLISH", this.f3528c);
        }
    }

    public final void b(boolean z, @TabType String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f3526a, false, 57760, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, this, f3526a, false, 57760, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        b bVar = this.f3530e.get(str2);
        if (bVar instanceof com.ss.android.ugc.aweme.main.base.tab.a) {
            if (z) {
                ((com.ss.android.ugc.aweme.main.base.tab.a) bVar).n();
                return;
            }
            ((com.ss.android.ugc.aweme.main.base.tab.a) bVar).o();
        }
    }

    public final void a(@TabType String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f3526a, false, 57758, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f3526a, false, 57758, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3530e.get(str2).a(i2);
    }

    public final void a(boolean z, @TabType String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f3526a, false, 57757, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, this, f3526a, false, 57757, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        b bVar = this.f3530e.get(str2);
        if (z) {
            bVar.j();
        } else {
            bVar.k();
        }
    }

    public MainBottomTabView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) throws Exception {
        super(context, attributeSet, i2);
        int i3;
        this.k = -1;
        this.l = C0906R.color.a2t;
        if (com.ss.android.ugc.aweme.profile.a.d()) {
            i3 = 58;
        } else {
            i3 = 47;
        }
        this.m = i3;
        this.f3530e = new HashMap<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MainBottomTabView);
        this.p = (LinearLayout) LayoutInflater.from(context).inflate(C0906R.layout.a5w, this).findViewById(C0906R.id.ci4);
        setClipChildren(false);
        this.p.setClipChildren(false);
        setViewMode(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        setOnTabClickListener(new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54382a;

            public final void a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f54382a, false, 57769, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f54382a, false, 57769, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                Context context = MainBottomTabView.this.getContext();
                if (PatchProxy.isSupport(new Object[]{context, str2}, null, TabClickCallBack.f54878a, true, 58157, new Class[]{Context.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, str2}, null, TabClickCallBack.f54878a, true, 58157, new Class[]{Context.class, String.class}, Void.TYPE);
                    return;
                }
                ag.i().h();
                TabClickCallBack.a(context).setValue(str2);
            }

            public final boolean b(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f54382a, false, 57770, new Class[]{String.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f54382a, false, 57770, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else if (!com.ss.android.ugc.aweme.g.a.a()) {
                    return false;
                } else {
                    Context context = MainBottomTabView.this.getContext();
                    if (PatchProxy.isSupport(new Object[]{context, str2}, null, TabClickCallBack.f54878a, true, 58158, new Class[]{Context.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context, str2}, null, TabClickCallBack.f54878a, true, 58158, new Class[]{Context.class, String.class}, Void.TYPE);
                    } else {
                        TabClickCallBack.b(context).setValue(str2);
                    }
                    return true;
                }
            }
        });
    }
}
