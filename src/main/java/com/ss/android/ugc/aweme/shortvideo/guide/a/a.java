package com.ss.android.ugc.aweme.shortvideo.guide.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.shortvideo.guide.e;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.Collection;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67978a;

    /* renamed from: b  reason: collision with root package name */
    public View f67979b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f67980c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteImageView f67981d;

    /* renamed from: e  reason: collision with root package name */
    private View f67982e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f67983f;
    private FaceStickerBean g;
    private Runnable h = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67984a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67984a, false, 77446, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67984a, false, 77446, new Class[0], Void.TYPE);
                return;
            }
            Animation a2 = a.a(1.0f, 0.0f, 300);
            a2.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67986a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f67986a, false, 77447, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f67986a, false, 77447, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    a.this.a(true);
                }
            });
            a.this.f67979b.startAnimation(a2);
        }
    };

    public a(FaceStickerBean faceStickerBean) {
        this.g = faceStickerBean;
    }

    public final void a(FrameLayout frameLayout) {
        boolean z = true;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{frameLayout}, this, f67978a, false, 77443, new Class[]{FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout}, this, f67978a, false, 77443, new Class[]{FrameLayout.class}, Void.TYPE);
            return;
        }
        this.f67983f = frameLayout;
        if (this.g != null) {
            this.f67982e = LayoutInflater.from(frameLayout.getContext()).inflate(C0906R.layout.a8s, frameLayout, false);
            this.f67983f.addView(this.f67982e);
            this.f67979b = this.f67982e.findViewById(C0906R.id.af4);
            this.f67980c = (TextView) this.f67982e.findViewById(C0906R.id.cvo);
            if (this.g.getHint() != null) {
                this.f67980c.setText(this.g.getHint());
            }
            this.f67981d = (RemoteImageView) this.f67982e.findViewById(C0906R.id.cvp);
            if (this.g.getHintIcon() == null || j.a((Collection<T>) this.g.getHintIcon().getUrlList())) {
                z = false;
            }
            RemoteImageView remoteImageView = this.f67981d;
            if (!z) {
                i = 8;
            }
            v.a((View) remoteImageView, i);
            if (z) {
                c.b(this.f67981d, this.g.getHintIcon());
            }
            this.f67979b.startAnimation(a(0.0f, 1.0f, 300));
            this.f67979b.postDelayed(this.h, 5000);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67978a, false, 77444, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67978a, false, 77444, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.g != null) {
            this.f67979b.removeCallbacks(this.h);
            this.f67983f.removeView(this.f67982e);
        }
    }

    public static Animation a(float f2, float f3, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), new Long(j2)}, null, f67978a, true, 77445, new Class[]{Float.TYPE, Float.TYPE, Long.TYPE}, Animation.class)) {
            return (Animation) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), new Long(j2)}, null, f67978a, true, 77445, new Class[]{Float.TYPE, Float.TYPE, Long.TYPE}, Animation.class);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setDuration(j2);
        return alphaAnimation;
    }
}
