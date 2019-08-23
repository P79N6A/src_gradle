package com.ss.android.ugc.aweme.feed.guide;

import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.c.b.k;
import com.facebook.c.c;
import com.facebook.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.anim.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.c.b;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45415a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f45416b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f45417c;

    /* renamed from: d  reason: collision with root package name */
    public View f45418d;

    /* renamed from: e  reason: collision with root package name */
    public k f45419e;

    /* renamed from: f  reason: collision with root package name */
    public c f45420f;
    public AnimationImageView g;
    public a h;
    public Runnable i = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45425a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45425a, false, 41254, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45425a, false, 41254, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45427a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f45427a, false, 41255, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45427a, false, 41255, new Class[0], Void.TYPE);
                        return;
                    }
                    g.this.b();
                }
            }, 5000);
            g.this.g = (AnimationImageView) g.this.f45418d.findViewById(C0906R.id.b1t);
            TextView textView = (TextView) g.this.f45418d.findViewById(C0906R.id.dj9);
            if (!g.this.f45417c) {
                g.this.f45420f = new e().a(g.this.f45419e).a();
                g.this.f45420f.a();
                if (g.this.h != null) {
                    g.this.h.a();
                }
                g.this.g.setLayerType(1, null);
                g.this.g.setImageDrawable(g.this.f45420f);
                g.this.g.setImageAlpha(0);
                return;
            }
            textView.setText(C0906R.string.c0c);
            g.this.g.setAnimation("right_profile_warning.json");
            g.this.g.playAnimation();
            g.this.g.setProgress(0.0f);
            g.this.g.loop(true);
        }
    };
    private ViewStub j;

    public interface a {
        void a();

        void b();
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45415a, false, 41250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45415a, false, 41250, new Class[0], Void.TYPE);
            return;
        }
        if (this.f45420f != null) {
            this.f45420f.b();
            this.g.setImageDrawable(null);
            this.f45420f = null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45415a, false, 41251, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45415a, false, 41251, new Class[0], Void.TYPE);
        } else if (this.f45418d != null && this.f45418d.getVisibility() == 0) {
            c();
            if (this.f45417c && this.g != null) {
                this.g.clearAnimation();
            }
            this.f45418d.animate().alpha(0.0f).setDuration(100).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45429a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f45429a, false, 41256, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45429a, false, 41256, new Class[0], Void.TYPE);
                        return;
                    }
                    SharePrefCache.inst().getScrollToProfileGuideState().a(2);
                    if (g.this.h != null) {
                        g.this.h.b();
                    }
                    g.this.f45418d.setVisibility(8);
                    bg.a(new b(false));
                }
            }).start();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45415a, false, 41249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45415a, false, 41249, new Class[0], Void.TYPE);
        } else if (this.j != null && (this.f45418d == null || this.f45418d.getVisibility() != 0)) {
            this.f45418d = this.j.inflate();
            this.f45418d.setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45421a;

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f45421a, false, 41252, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f45421a, false, 41252, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    } else if (motionEvent.getAction() == 0) {
                        return true;
                    } else {
                        if (motionEvent.getAction() == 1) {
                            g.this.b();
                            return true;
                        }
                        return false;
                    }
                }
            });
            if (this.f45417c) {
                this.f45418d.setAlpha(0.0f);
                this.f45418d.animate().alpha(1.0f).setDuration(100).withEndAction(this.i).start();
            } else {
                com.ss.android.ugc.aweme.anim.b.a().a(com.ss.android.ugc.aweme.app.k.a(), "left_profile_warning.json", new d() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45423a;

                    public final void a(@Nullable k kVar, String str) {
                        if (PatchProxy.isSupport(new Object[]{kVar, str}, this, f45423a, false, 41253, new Class[]{k.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{kVar, str}, this, f45423a, false, 41253, new Class[]{k.class, String.class}, Void.TYPE);
                            return;
                        }
                        g.this.f45419e = kVar;
                        if (g.this.f45419e != null) {
                            g.this.f45418d.setAlpha(0.0f);
                            g.this.f45418d.animate().alpha(1.0f).setDuration(100).withEndAction(g.this.i).start();
                        }
                    }
                });
            }
            if (com.ss.android.g.a.a()) {
                r.a("transition_to_profile_guide_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
            }
        }
    }

    public g(ViewStub viewStub) {
        this.j = viewStub;
        this.f45417c = ey.a(viewStub.getContext());
    }
}
