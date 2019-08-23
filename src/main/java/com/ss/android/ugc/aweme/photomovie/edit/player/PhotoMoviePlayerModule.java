package com.ss.android.ugc.aweme.photomovie.edit.player;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.photomovie.transition.c;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.e;

public class PhotoMoviePlayerModule implements LifecycleObserver, a, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58980a;

    /* renamed from: b  reason: collision with root package name */
    public PhotoMoviePlayerPresenter f58981b;

    /* renamed from: c  reason: collision with root package name */
    public ITransition f58982c;

    /* renamed from: d  reason: collision with root package name */
    private TextureView f58983d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteImageView f58984e;

    @NonNull
    public final ITransition b() {
        return this.f58982c;
    }

    private boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f58980a, false, 64144, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58980a, false, 64144, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.M.b(a.C0682a.NewEditPage) > 0) {
            z = true;
        }
        return z;
    }

    @NonNull
    public final PhotoMovieContext a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58980a, false, 64138, new Class[0], PhotoMovieContext.class)) {
            return this.f58981b.a();
        }
        return (PhotoMovieContext) PatchProxy.accessDispatch(new Object[0], this, f58980a, false, 64138, new Class[0], PhotoMovieContext.class);
    }

    public final long c() {
        if (!PatchProxy.isSupport(new Object[0], this, f58980a, false, 64137, new Class[0], Long.TYPE)) {
            return this.f58981b.b();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f58980a, false, 64137, new Class[0], Long.TYPE)).longValue();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58980a, false, 64133, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58980a, false, 64133, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58981b.a(i);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58980a, false, 64134, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58980a, false, 64134, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58981b.b(i);
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f58980a, false, 64135, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f58980a, false, 64135, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f58981b.a(j2);
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f58980a, false, 64140, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f58980a, false, 64140, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f58981b.a(str2);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{100, 7}, this, f58980a, false, 64136, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{100, 7}, this, f58980a, false, 64136, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58981b.a(100, 7);
    }

    public final void a(@NonNull e eVar, @NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{eVar, str}, this, f58980a, false, 64139, new Class[]{e.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, str}, this, f58980a, false, 64139, new Class[]{e.class, String.class}, Void.TYPE);
            return;
        }
        if (!d()) {
            com.ss.android.ugc.aweme.base.c.b(this.f58984e, eVar.getCoverThumb());
        }
        this.f58981b.a(eVar, str);
    }

    public PhotoMoviePlayerModule(@NonNull LifecycleOwner lifecycleOwner, @NonNull FrameLayout frameLayout, @NonNull PhotoMovieContext photoMovieContext) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.f58983d = (TextureView) frameLayout.findViewById(C0906R.id.bxw);
        this.f58982c = new b(frameLayout, this.f58983d);
        this.f58981b = new PhotoMoviePlayerPresenter(lifecycleOwner, this.f58983d, photoMovieContext);
        if (PatchProxy.isSupport(new Object[]{frameLayout}, this, f58980a, false, 64132, new Class[]{FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout}, this, f58980a, false, 64132, new Class[]{FrameLayout.class}, Void.TYPE);
            return;
        }
        if (!d()) {
            this.f58984e = (RemoteImageView) frameLayout.findViewById(C0906R.id.asv);
            com.ss.android.ugc.aweme.base.c.b(this.f58984e, a().mMusic.getCoverThumb());
        }
    }
}
