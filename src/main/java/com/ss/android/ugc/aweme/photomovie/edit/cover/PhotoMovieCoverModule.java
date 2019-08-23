package com.ss.android.ugc.aweme.photomovie.edit.cover;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.photomovie.edit.b;
import com.ss.android.ugc.aweme.photomovie.edit.cover.a;
import com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;
import com.ss.android.ugc.aweme.photomovie.transition.d;
import com.ss.android.ugc.aweme.photomovie.transition.e;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;

public class PhotoMovieCoverModule implements LifecycleObserver, View.OnClickListener, e, ChooseVideoCoverView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3729a;

    /* renamed from: b  reason: collision with root package name */
    public PhotoMoviePlayerModule f3730b;

    /* renamed from: c  reason: collision with root package name */
    public ChooseVideoCoverView f3731c;

    /* renamed from: d  reason: collision with root package name */
    public ChooseVideoCoverView.Adapter f3732d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3733e;

    /* renamed from: f  reason: collision with root package name */
    private Context f3734f;
    private d g;
    private b h;
    private a i;
    private float j;

    public interface a {
        void a();

        void b();
    }

    @NonNull
    public final d a() {
        return this.g;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3729a, false, 64080, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3729a, false, 64080, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3732d != null) {
            this.f3732d.a();
        }
    }

    public final void a(float f2) {
        this.f3733e = true;
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3729a, false, 64076, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3729a, false, 64076, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f3730b.a((long) (((float) this.f3730b.c()) * f2));
        this.f3730b.b(1);
    }

    public final void c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3729a, false, 64077, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3729a, false, 64077, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("choose_cover").setLabelName("cover_page").setJsonObject(bi.a().a("media_type", "pic_movie").b()));
        d(f2);
    }

    public final void d(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3729a, false, 64078, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3729a, false, 64078, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        long c2 = (long) (((float) this.f3730b.c()) * f2);
        this.j = ((float) (c2 / 100)) / 10.0f;
        this.f3730b.a(c2);
        this.f3730b.b(2);
        this.f3730b.a(100, 7);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3729a, false, 64075, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3729a, false, 64075, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.asy) {
            if (this.h != null) {
                this.h.b(this);
            }
            this.f3733e = false;
            r.onEvent(MobClick.obtain().setEventName("cancel_choose_cover").setLabelName("cover_page").setJsonObject(bi.a().a("media_type", "pic_movie").b()));
            this.i.b();
            return;
        }
        if (id == C0906R.id.at3) {
            this.f3730b.a().mCoverStartTm = this.j;
            if (this.h != null) {
                this.h.b(this);
            }
            this.f3733e = false;
            r.onEvent(MobClick.obtain().setEventName("confirm_choose_cover").setLabelName("cover_page").setJsonObject(bi.a().a("media_type", "pic_movie").b()));
            this.i.a();
        }
    }

    public PhotoMovieCoverModule(@NonNull LifecycleOwner lifecycleOwner, @NonNull Context context, @NonNull FrameLayout frameLayout, @NonNull PhotoMoviePlayerModule photoMoviePlayerModule, @NonNull b bVar, @NonNull a aVar) {
        this.f3734f = context;
        this.i = aVar;
        this.f3730b = photoMoviePlayerModule;
        this.h = bVar;
        lifecycleOwner.getLifecycle().addObserver(this);
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.aei, frameLayout, false);
        this.g = new com.ss.android.ugc.aweme.photomovie.transition.b(frameLayout, inflate);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f3729a, false, 64074, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f3729a, false, 64074, new Class[]{View.class}, Void.TYPE);
        } else {
            inflate.findViewById(C0906R.id.asy).setOnClickListener(this);
            inflate.findViewById(C0906R.id.at3).setOnClickListener(this);
            this.f3731c = (ChooseVideoCoverView) inflate.findViewById(C0906R.id.sq);
            this.f3731c.setLayoutManager(new LinearLayoutManager(this.f3734f, 0, false));
            this.f3731c.setOnScrollListener(this);
            ((TextView) inflate.findViewById(C0906R.id.dg_)).setText(C0906R.string.cnp);
        }
        this.g.a((f) new f.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58908a;

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f58908a, false, 64082, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58908a, false, 64082, new Class[0], Void.TYPE);
                    return;
                }
                PhotoMovieCoverModule.this.f3730b.b(2);
            }

            public final void c() {
                if (PatchProxy.isSupport(new Object[0], this, f58908a, false, 64083, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58908a, false, 64083, new Class[0], Void.TYPE);
                    return;
                }
                PhotoMovieCoverModule.this.f3730b.b(0);
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f58908a, false, 64081, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58908a, false, 64081, new Class[0], Void.TYPE);
                    return;
                }
                if (PhotoMovieCoverModule.this.f3732d == null) {
                    PhotoMovieCoverModule.this.f3732d = new ChooseVideoCoverView.Adapter((b) new c(PhotoMovieCoverModule.this.f3730b.a().mImageList, new a.C0659a()), (int) PhotoMovieCoverModule.this.f3731c.getOneThumbWidth(), PhotoMovieCoverModule.this.f3731c.getMeasuredHeight());
                    PhotoMovieCoverModule.this.f3731c.setAdapter(PhotoMovieCoverModule.this.f3732d);
                }
                ChooseVideoCoverView chooseVideoCoverView = PhotoMovieCoverModule.this.f3731c;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f)}, chooseVideoCoverView, ChooseVideoCoverView.f71316a, false, 81279, new Class[]{Float.TYPE}, Void.TYPE)) {
                    ChooseVideoCoverView chooseVideoCoverView2 = chooseVideoCoverView;
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f)}, chooseVideoCoverView2, ChooseVideoCoverView.f71316a, false, 81279, new Class[]{Float.TYPE}, Void.TYPE);
                } else {
                    float width = ((float) (chooseVideoCoverView.f71318c.getWidth() * (chooseVideoCoverView.f71317b - 1))) * 0.0f;
                    chooseVideoCoverView.f71318c.animate().x(width).y(chooseVideoCoverView.f71318c.getY()).setDuration(0).start();
                    chooseVideoCoverView.a(width);
                }
                PhotoMovieCoverModule.this.d(0.0f);
                ChooseVideoCoverView chooseVideoCoverView3 = PhotoMovieCoverModule.this.f3731c;
                if (PatchProxy.isSupport(new Object[0], chooseVideoCoverView3, ChooseVideoCoverView.f71316a, false, 81299, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], chooseVideoCoverView3, ChooseVideoCoverView.f71316a, false, 81299, new Class[0], Void.TYPE);
                    return;
                }
                if (chooseVideoCoverView3.f71318c != null) {
                    chooseVideoCoverView3.f71318c.setImageDrawable(new ColorDrawable(0));
                }
            }
        });
    }
}
