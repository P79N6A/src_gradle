package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.anim.b;
import com.ss.android.ugc.aweme.shortvideo.countdown.h;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66054a;

    /* renamed from: b  reason: collision with root package name */
    h.a f66055b;

    /* renamed from: c  reason: collision with root package name */
    c f66056c;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f66057d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f66058e;

    /* renamed from: f  reason: collision with root package name */
    c.C0251c f66059f = new b(this);

    public final boolean b() {
        if (this.f66056c != null) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66054a, false, 75316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66054a, false, 75316, new Class[0], Void.TYPE);
            return;
        }
        this.f66055b.a();
        this.f66058e = (ImageView) LayoutInflater.from(this.f66057d.getContext()).inflate(C0906R.layout.aek, this.f66057d, false);
        this.f66057d.addView(this.f66058e);
        b.a().a(com.ss.android.ugc.aweme.port.in.a.f61119b, "anim_video_countdown", new c(this));
    }

    a(@NonNull FrameLayout frameLayout, @NonNull h.a aVar) {
        this.f66057d = frameLayout;
        this.f66055b = aVar;
    }
}
