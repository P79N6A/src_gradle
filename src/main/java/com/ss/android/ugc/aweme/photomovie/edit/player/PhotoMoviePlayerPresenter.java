package com.ss.android.ugc.aweme.photomovie.edit.player;

import a.i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Surface;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.photomovie.PhotoMoviePlayer;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity;
import com.ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.g;
import java.util.concurrent.Callable;

public class PhotoMoviePlayerPresenter implements LifecycleObserver, TextureView.SurfaceTextureListener, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3735a;

    /* renamed from: b  reason: collision with root package name */
    public PhotoMoviePlayer f3736b;

    /* renamed from: c  reason: collision with root package name */
    public PhotoMovieContext f3737c;

    /* renamed from: d  reason: collision with root package name */
    public a f3738d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3739e;

    /* renamed from: f  reason: collision with root package name */
    private final LifecycleOwner f3740f;
    private SurfaceTexture g;
    private TextureView h;
    private int i;
    private int j;

    public interface a {
        void a();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @NonNull
    public final PhotoMovieContext a() {
        return this.f3737c;
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f3735a, false, 64156, new Class[0], Long.TYPE)) {
            return this.f3736b.d();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f3735a, false, 64156, new Class[0], Long.TYPE)).longValue();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3735a, false, 64148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3735a, false, 64148, new Class[0], Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new Callable<Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58985a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f58985a, false, 64161, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f58985a, false, 64161, new Class[0], Object.class);
                }
                PhotoMoviePlayerPresenter.this.f3736b.c();
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3735a, false, 64146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3735a, false, 64146, new Class[0], Void.TYPE);
            return;
        }
        this.f3736b.a();
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3735a, false, 64145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3735a, false, 64145, new Class[0], Void.TYPE);
            return;
        }
        this.f3736b = new PhotoMoviePlayer(com.ss.android.ugc.aweme.port.in.a.f61119b);
        this.f3736b.a(g.a(this.f3737c.mImageList, co.IMAGE), g.a(this.f3737c.mMusicPath, co.AUDIO));
        this.f3736b.a(true);
        this.f3736b.a(this.f3737c.mPlayType);
        this.f3736b.a(this.f3737c.mFilterPath);
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3735a, false, 64147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3735a, false, 64147, new Class[0], Void.TYPE);
            return;
        }
        PhotoMoviePlayer photoMoviePlayer = this.f3736b;
        if (PatchProxy.isSupport(new Object[0], photoMoviePlayer, PhotoMoviePlayer.f29715a, false, 17506, new Class[0], Integer.TYPE)) {
            ((Integer) PatchProxy.accessDispatch(new Object[0], photoMoviePlayer, PhotoMoviePlayer.f29715a, false, 17506, new Class[0], Integer.TYPE)).intValue();
        } else {
            photoMoviePlayer.nativeResume(photoMoviePlayer.f29716b);
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3735a, false, 64158, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3735a, false, 64158, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f3736b.a(str);
        this.f3737c.mFilterPath = str;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3735a, false, 64152, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3735a, false, 64152, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3737c.mPlayType = i2;
        this.f3736b.a(this.f3737c.mPlayType);
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3735a, false, 64153, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3735a, false, 64153, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3736b.b(i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f3735a, false, 64151, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f3735a, false, 64151, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        if (this.f3740f instanceof PhotoMovieEditActivity) {
            PhotoMovieEditActivity photoMovieEditActivity = (PhotoMovieEditActivity) this.f3740f;
            if (photoMovieEditActivity.f58816e != null && photoMovieEditActivity.f58816e.f3733e) {
                Bitmap bitmap = this.h.getBitmap();
                if (PatchProxy.isSupport(new Object[]{bitmap}, photoMovieEditActivity, PhotoMovieEditActivity.f58812a, false, 63937, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PhotoMovieEditActivity photoMovieEditActivity2 = photoMovieEditActivity;
                    PatchProxy.accessDispatch(new Object[]{bitmap}, photoMovieEditActivity2, PhotoMovieEditActivity.f58812a, false, 63937, new Class[]{Bitmap.class}, Void.TYPE);
                } else if (photoMovieEditActivity.f58816e != null) {
                    PhotoMovieCoverModule photoMovieCoverModule = photoMovieEditActivity.f58816e;
                    if (PatchProxy.isSupport(new Object[]{bitmap}, photoMovieCoverModule, PhotoMovieCoverModule.f3729a, false, 64079, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PhotoMovieCoverModule photoMovieCoverModule2 = photoMovieCoverModule;
                        PatchProxy.accessDispatch(new Object[]{bitmap}, photoMovieCoverModule2, PhotoMovieCoverModule.f3729a, false, 64079, new Class[]{Bitmap.class}, Void.TYPE);
                    } else if (photoMovieCoverModule.f3731c != null) {
                        photoMovieCoverModule.f3731c.setVideoCoverFrameView(bitmap);
                    }
                }
            }
        }
    }

    public final void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f3735a, false, 64154, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f3735a, false, 64154, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f3736b.a(j3);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3735a, false, 64155, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3735a, false, 64155, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3736b.a(i2, i3);
    }

    public final void a(@NonNull e eVar, @NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{eVar, str}, this, f3735a, false, 64157, new Class[]{e.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, str}, this, f3735a, false, 64157, new Class[]{e.class, String.class}, Void.TYPE);
            return;
        }
        this.f3737c.mMusicPath = str;
        this.f3737c.mMusic = eVar;
        this.f3736b.b();
        this.f3736b.c();
        c();
        this.f3736b.a(new Surface(this.g), this.i, this.j);
    }

    public PhotoMoviePlayerPresenter(@NonNull LifecycleOwner lifecycleOwner, @NonNull TextureView textureView, @NonNull PhotoMovieContext photoMovieContext) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.f3740f = lifecycleOwner;
        this.f3737c = photoMovieContext;
        this.h = textureView;
        c();
        textureView.setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3735a, false, 64149, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3735a, false, 64149, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g == null) {
            this.g = surfaceTexture2;
            this.i = i2;
            this.j = i3;
            this.f3736b.a(new Surface(this.g), this.i, this.j);
            if (this.f3738d != null) {
                this.f3738d.a();
            }
            if (this.f3739e) {
                this.f3736b.a();
            }
        } else {
            this.h.setSurfaceTexture(this.g);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3735a, false, 64150, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3735a, false, 64150, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = surfaceTexture2;
        this.i = i4;
        this.j = i5;
        PhotoMoviePlayer photoMoviePlayer = this.f3736b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, photoMoviePlayer, PhotoMoviePlayer.f29715a, false, 17505, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PhotoMoviePlayer photoMoviePlayer2 = photoMoviePlayer;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, photoMoviePlayer2, PhotoMoviePlayer.f29715a, false, 17505, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        photoMoviePlayer.nativeOnSizeChanged(photoMoviePlayer.f29716b, i4, i5);
    }
}
