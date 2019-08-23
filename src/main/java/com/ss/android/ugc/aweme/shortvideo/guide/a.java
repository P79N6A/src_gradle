package com.ss.android.ugc.aweme.shortvideo.guide;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
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
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.i;
import java.io.File;
import java.util.Collection;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67968a;

    /* renamed from: b  reason: collision with root package name */
    public View f67969b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f67970c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteImageView f67971d;

    /* renamed from: e  reason: collision with root package name */
    private View f67972e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f67973f;
    private FaceStickerBean g;
    private Runnable h = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67974a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67974a, false, 77423, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67974a, false, 77423, new Class[0], Void.TYPE);
                return;
            }
            Animation a2 = i.a(1.0f, 0.0f, 300);
            a2.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67976a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f67976a, false, 77424, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f67976a, false, 77424, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    a.this.a(true);
                }
            });
            a.this.f67969b.startAnimation(a2);
        }
    };

    public a(FaceStickerBean faceStickerBean) {
        this.g = faceStickerBean;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67968a, false, 77422, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67968a, false, 77422, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.g != null && !TextUtils.isEmpty(this.g.getHint())) {
            this.f67970c.removeCallbacks(this.h);
            this.f67973f.removeView(this.f67972e);
        }
    }

    public final void a(FrameLayout frameLayout) {
        boolean z;
        boolean z2 = true;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{frameLayout}, this, f67968a, false, 77421, new Class[]{FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout}, this, f67968a, false, 77421, new Class[]{FrameLayout.class}, Void.TYPE);
            return;
        }
        this.f67973f = frameLayout;
        if (this.g != null && !TextUtils.isEmpty(this.g.getHint())) {
            this.f67972e = LayoutInflater.from(frameLayout.getContext()).inflate(C0906R.layout.a8s, frameLayout, false);
            this.f67973f.addView(this.f67972e);
            this.f67969b = this.f67972e.findViewById(C0906R.id.af4);
            this.f67970c = (TextView) this.f67972e.findViewById(C0906R.id.cvo);
            String hint = this.g.getHint();
            fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) frameLayout.getContext()).get(ShortVideoContextViewModel.class)).f65401b;
            if (!fhVar.b() && !fhVar.c()) {
                File e2 = fhVar.l.e();
                if (e2 == null || e2.getPath().startsWith(ff.u)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    com.bytedance.ies.dmt.ui.d.a.b(frameLayout.getContext(), frameLayout.getContext().getString(C0906R.string.ir)).a();
                    return;
                }
                String a2 = com.ss.android.ugc.aweme.port.in.a.i.a(fhVar.f67723f);
                e b2 = ej.a().b();
                if (b2 != null && b2.strongBeatUrl != null && !TextUtils.isEmpty(a2) && !new File(a2).exists()) {
                    com.bytedance.ies.dmt.ui.d.a.b(frameLayout.getContext(), (int) C0906R.string.iq).a();
                } else if (e2 == null) {
                    this.f67970c.setText(hint);
                    this.f67971d = (RemoteImageView) this.f67972e.findViewById(C0906R.id.cvp);
                    if (this.g.getHintIcon() == null || j.a((Collection<T>) this.g.getHintIcon().getUrlList())) {
                        z2 = false;
                    }
                    RemoteImageView remoteImageView = this.f67971d;
                    if (!z2) {
                        i = 8;
                    }
                    v.a((View) remoteImageView, i);
                    if (z2) {
                        c.b(this.f67971d, this.g.getHintIcon());
                    }
                    this.f67969b.startAnimation(i.a(0.0f, 1.0f, 300));
                    this.f67969b.postDelayed(this.h, 5000);
                }
            }
        }
    }
}
