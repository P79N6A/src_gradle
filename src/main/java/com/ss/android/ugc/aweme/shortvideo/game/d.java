package com.ss.android.ugc.aweme.shortvideo.game;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.game.a.b;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67867a;

    /* renamed from: b  reason: collision with root package name */
    b f67868b;

    /* renamed from: c  reason: collision with root package name */
    private View f67869c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f67870d;

    /* renamed from: e  reason: collision with root package name */
    private LottieAnimationView f67871e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f67872f;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67867a, false, 77363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67867a, false, 77363, new Class[0], Void.TYPE);
            return;
        }
        if (this.f67871e == null) {
            e();
        }
        this.f67870d.removeAllViews();
        this.f67870d.addView(this.f67869c);
        this.f67869c.setVisibility(0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67867a, false, 77366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67867a, false, 77366, new Class[0], Void.TYPE);
            return;
        }
        this.f67871e.cancelAnimation();
        this.f67871e.setVisibility(8);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f67867a, false, 77367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67867a, false, 77367, new Class[0], Void.TYPE);
            return;
        }
        this.f67871e.cancelAnimation();
        this.f67869c.setVisibility(8);
        this.f67870d.removeView(this.f67869c);
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f67867a, false, 77365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67867a, false, 77365, new Class[0], Void.TYPE);
            return;
        }
        this.f67869c = LayoutInflater.from(this.f67870d.getContext()).inflate(C0906R.layout.a1h, this.f67870d, false);
        this.f67871e = (LottieAnimationView) this.f67869c.findViewById(C0906R.id.h2);
        this.f67872f = (ImageView) this.f67869c.findViewById(C0906R.id.atf);
        this.f67872f.setOnClickListener(new e(this));
        this.f67871e.setOnClickListener(new f(this));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67867a, false, 77364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67867a, false, 77364, new Class[0], Void.TYPE);
            return;
        }
        if (this.f67871e == null) {
            e();
        }
        this.f67871e.setVisibility(0);
        this.f67871e.setImageAssetsFolder("start_anim/");
        this.f67871e.setAnimation("game_btn.json");
        this.f67871e.playAnimation();
    }

    public d(@NonNull FrameLayout frameLayout, @NonNull b bVar) {
        this.f67870d = frameLayout;
        this.f67868b = bVar;
    }
}
