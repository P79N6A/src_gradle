package com.ss.android.ugc.aweme.im.sdk.videofileplay;

import android.content.Context;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.SeekCompletionListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b implements SeekCompletionListener, VideoEngineListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52693a;

    /* renamed from: b  reason: collision with root package name */
    public int f52694b;

    /* renamed from: c  reason: collision with root package name */
    public int f52695c;

    /* renamed from: d  reason: collision with root package name */
    private TTVideoEngine f52696d;

    /* renamed from: e  reason: collision with root package name */
    private List<a> f52697e;

    /* renamed from: f  reason: collision with root package name */
    private Context f52698f;
    private boolean g;

    public interface a {
        void a(b bVar);

        void a(b bVar, int i);

        void a(String str);

        void b(b bVar);

        void b(b bVar, int i);

        void c(b bVar);

        void d(b bVar);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52693a, false, 53868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52693a, false, 53868, new Class[0], Void.TYPE);
            return;
        }
        this.f52696d.play();
        this.g = true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52693a, false, 53869, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52693a, false, 53869, new Class[0], Void.TYPE);
            return;
        }
        this.f52696d.pause();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f52693a, false, 53872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52693a, false, 53872, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            this.f52696d.release();
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f52693a, false, 53883, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52693a, false, 53883, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f52696d.getPlaybackState() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f52693a, false, 53867, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f52693a, false, 53867, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f52696d.setSurface(surface2);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52693a, false, 53864, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52693a, false, 53864, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f52696d.setDirectURL(str2);
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52693a, false, 53865, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52693a, false, 53865, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f52696d.setLocalURL(str2);
    }

    public void onCompletion(TTVideoEngine tTVideoEngine) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f52693a, false, 53893, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f52693a, false, 53893, new Class[]{TTVideoEngine.class}, Void.TYPE);
            return;
        }
        for (a next : this.f52697e) {
            if (next != null) {
                next.d(this);
            }
        }
    }

    public void onError(Error error) {
        Error error2 = error;
        if (PatchProxy.isSupport(new Object[]{error2}, this, f52693a, false, 53894, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error2}, this, f52693a, false, 53894, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        for (a next : this.f52697e) {
            if (next != null) {
                next.a(error2.description);
            }
        }
    }

    public void onPrepare(TTVideoEngine tTVideoEngine) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f52693a, false, 53890, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f52693a, false, 53890, new Class[]{TTVideoEngine.class}, Void.TYPE);
            return;
        }
        for (a next : this.f52697e) {
            if (next != null) {
                next.a(this);
            }
        }
    }

    public void onPrepared(TTVideoEngine tTVideoEngine) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f52693a, false, 53891, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f52693a, false, 53891, new Class[]{TTVideoEngine.class}, Void.TYPE);
            return;
        }
        for (a next : this.f52697e) {
            if (next != null) {
                next.b(this);
            }
        }
    }

    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f52693a, false, 53892, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f52693a, false, 53892, new Class[]{TTVideoEngine.class}, Void.TYPE);
            return;
        }
        for (a next : this.f52697e) {
            if (next != null) {
                next.c(this);
            }
        }
    }

    public void onVideoStatusException(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52693a, false, 53895, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52693a, false, 53895, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Iterator<a> it2 = this.f52697e.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public b(Context context) {
        Resolution resolution;
        if (context != null) {
            this.f52698f = context;
            if (PatchProxy.isSupport(new Object[0], this, f52693a, false, 53859, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52693a, false, 53859, new Class[0], Void.TYPE);
            } else {
                this.f52696d = new TTVideoEngine(this.f52698f.getApplicationContext(), 0);
                this.f52696d.setIntOption(4, 1);
                if (PatchProxy.isSupport(new Object[]{2}, this, f52693a, false, 53873, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{2}, this, f52693a, false, 53873, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    TTVideoEngine tTVideoEngine = this.f52696d;
                    switch (2) {
                        case 0:
                            resolution = Resolution.Standard;
                            break;
                        case 1:
                            resolution = Resolution.High;
                            break;
                        case 2:
                            resolution = Resolution.SuperHigh;
                            break;
                        default:
                            resolution = Resolution.Standard;
                            break;
                    }
                    tTVideoEngine.configResolution(resolution);
                }
                this.f52696d.setListener(this);
            }
            this.f52697e = new ArrayList();
            return;
        }
        throw new RuntimeException("context can not be null!");
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f52693a, false, 53860, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f52693a, false, 53860, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f52697e.add(aVar2);
    }

    public void onCompletion(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f52693a, false, 53885, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f52693a, false, 53885, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Iterator<a> it2 = this.f52697e.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52693a, false, 53863, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52693a, false, 53863, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f52696d.setDecryptionKey(str2);
    }

    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine, Integer.valueOf(i)}, this, f52693a, false, 53889, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine, Integer.valueOf(i)}, this, f52693a, false, 53889, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Iterator<a> it2 = this.f52697e.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine, Integer.valueOf(i)}, this, f52693a, false, 53887, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine, Integer.valueOf(i)}, this, f52693a, false, 53887, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                this.f52695c = 0;
                break;
            case 1:
                this.f52695c = 1;
                break;
            case 2:
                this.f52695c = 2;
                break;
            case 3:
                this.f52695c = 3;
                break;
        }
        for (a next : this.f52697e) {
            if (next != null) {
                next.b(this, this.f52695c);
            }
        }
    }

    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine, Integer.valueOf(i)}, this, f52693a, false, 53886, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine, Integer.valueOf(i)}, this, f52693a, false, 53886, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                this.f52694b = 0;
                break;
            case 1:
                this.f52694b = 1;
                break;
            case 2:
                this.f52694b = 2;
                break;
            case 3:
                this.f52694b = 3;
                break;
        }
        for (a next : this.f52697e) {
            if (next != null) {
                next.a(this, this.f52694b);
            }
        }
    }

    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52693a, false, 53888, new Class[]{TTVideoEngine.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52693a, false, 53888, new Class[]{TTVideoEngine.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Iterator<a> it2 = this.f52697e.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }
}
