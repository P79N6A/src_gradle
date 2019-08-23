package com.ss.android.ugc.aweme.mediaplayer;

import a.g;
import a.i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.SurfaceTexture;
import android.support.annotation.NonNull;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public class MediaPlayerModule implements LifecycleObserver, TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3564a;

    /* renamed from: b  reason: collision with root package name */
    public String f3565b;

    /* renamed from: c  reason: collision with root package name */
    public a f3566c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3567d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3568e;

    /* renamed from: f  reason: collision with root package name */
    boolean f3569f;
    h g;
    public TextureView.SurfaceTextureListener h;
    public MutableLiveData<MediaPlayerState> i = new MutableLiveData<>();

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3564a, false, 58683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3564a, false, 58683, new Class[0], Void.TYPE);
        } else if (!this.f3567d && !this.f3568e) {
            this.f3566c.b();
            this.i.postValue(MediaPlayerState.b(true));
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3564a, false, 58684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3564a, false, 58684, new Class[0], Void.TYPE);
            return;
        }
        this.f3566c.a();
        this.i.postValue(MediaPlayerState.a(true));
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3564a, false, 58688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3564a, false, 58688, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3564a, false, 58689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3564a, false, 58689, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        MediaPlayerState mediaPlayerState;
        if (PatchProxy.isSupport(new Object[0], this, f3564a, false, 58690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3564a, false, 58690, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3564a, false, 58686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3564a, false, 58686, new Class[0], Void.TYPE);
            return;
        }
        this.f3566c.a();
        this.f3566c.c();
        this.f3566c.d();
        MutableLiveData<MediaPlayerState> mutableLiveData = this.i;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, MediaPlayerState.f55329a, true, 58701, new Class[]{Boolean.TYPE}, MediaPlayerState.class)) {
            mediaPlayerState = (MediaPlayerState) PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, MediaPlayerState.f55329a, true, 58701, new Class[]{Boolean.TYPE}, MediaPlayerState.class);
        } else {
            mediaPlayerState = new MediaPlayerState(6, true);
        }
        mutableLiveData.postValue(mediaPlayerState);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f3564a, false, 58680, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f3564a, false, 58680, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MediaPlayerState mediaPlayerState;
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2}, this, f3564a, false, 58679, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture2}, this, f3564a, false, 58679, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
        }
        surfaceTexture.release();
        if (PatchProxy.isSupport(new Object[0], this, f3564a, false, 58685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3564a, false, 58685, new Class[0], Void.TYPE);
        } else {
            this.f3566c.c();
            MutableLiveData<MediaPlayerState> mutableLiveData = this.i;
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, MediaPlayerState.f55329a, true, 58700, new Class[]{Boolean.TYPE}, MediaPlayerState.class)) {
                mediaPlayerState = (MediaPlayerState) PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, MediaPlayerState.f55329a, true, 58700, new Class[]{Boolean.TYPE}, MediaPlayerState.class);
            } else {
                mediaPlayerState = new MediaPlayerState(5, true);
            }
            mutableLiveData.postValue(mediaPlayerState);
        }
        if (this.h != null) {
            return this.h.onSurfaceTextureDestroyed(surfaceTexture2);
        }
        return false;
    }

    public MediaPlayerModule(@NonNull a aVar, h hVar) {
        this.f3566c = aVar;
        this.g = hVar;
        this.i.observeForever(new c(this));
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3564a, false, 58678, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3564a, false, 58678, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            int i4 = i2;
            this.h.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3564a, false, 58677, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3564a, false, 58677, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            int i4 = i2;
            this.h.onSurfaceTextureAvailable(surfaceTexture, i2, i3);
        }
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2}, this, f3564a, false, 58687, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2}, this, f3564a, false, 58687, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new d<TResult>(this)).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(this), i.f1052b).a((g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(this, surfaceTexture)).a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(this), i.f1052b);
    }
}
