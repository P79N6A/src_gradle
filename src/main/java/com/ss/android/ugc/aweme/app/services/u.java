package com.ss.android.ugc.aweme.app.services;

import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.b.g;
import com.ss.android.ugc.aweme.main.h.a.a;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.o;

public final class u implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34286a;

    /* renamed from: b  reason: collision with root package name */
    private o f34287b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.video.a.a f34288c;

    public final void a(e eVar, Video video, String str, int i, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{eVar, video, str, Integer.valueOf(i), str2, str3}, this, f34286a, false, 23638, new Class[]{e.class, Video.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {eVar, video, str, Integer.valueOf(i), str2, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f34286a, false, 23638, new Class[]{e.class, Video.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {eVar, video, str, Integer.valueOf(i), str2, str3};
        if (PatchProxy.isSupport(objArr3, null, g.f53899a, true, 56771, new Class[]{e.class, Video.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr4 = {eVar, video, str, Integer.valueOf(i), str2, str3};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, g.f53899a, true, 56771, new Class[]{e.class, Video.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        g.f53900b.a(eVar, video, str, i, str2, str3);
    }

    private o g() {
        if (PatchProxy.isSupport(new Object[0], this, f34286a, false, 23643, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, f34286a, false, 23643, new Class[0], o.class);
        }
        if (this.f34287b == null) {
            this.f34287b = o.b();
        }
        return this.f34287b;
    }

    public final long a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34286a, false, 23630, new Class[0], Long.TYPE)) {
            return g().d();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f34286a, false, 23630, new Class[0], Long.TYPE)).longValue();
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f34286a, false, 23631, new Class[0], Long.TYPE)) {
            return g().c();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f34286a, false, 23631, new Class[0], Long.TYPE)).longValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34286a, false, 23632, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34286a, false, 23632, new Class[0], Void.TYPE);
            return;
        }
        g().h();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f34286a, false, 23633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34286a, false, 23633, new Class[0], Void.TYPE);
            return;
        }
        g().g();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f34286a, false, 23636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34286a, false, 23636, new Class[0], Void.TYPE);
            return;
        }
        g().t();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f34286a, false, 23637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34286a, false, 23637, new Class[0], Void.TYPE);
            return;
        }
        g().u();
    }

    public final void a(com.ss.android.ugc.aweme.video.a.a aVar) {
        this.f34288c = aVar;
    }

    public final void a(Video video) {
        if (PatchProxy.isSupport(new Object[]{video}, this, f34286a, false, 23642, new Class[]{Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video}, this, f34286a, false, 23642, new Class[]{Video.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.video.preload.g.f().c(video.getProperPlayAddr());
    }

    public final void a(Surface surface, Video video) {
        Surface surface2 = surface;
        Video video2 = video;
        if (PatchProxy.isSupport(new Object[]{surface2, video2}, this, f34286a, false, 23634, new Class[]{Surface.class, Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2, video2}, this, f34286a, false, 23634, new Class[]{Surface.class, Video.class}, Void.TYPE);
            return;
        }
        g().a(this.f34288c);
        g().a(surface2);
        g().a(video2, true);
    }

    public final void b(Surface surface, Video video) {
        if (PatchProxy.isSupport(new Object[]{surface, video}, this, f34286a, false, 23635, new Class[]{Surface.class, Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface, video}, this, f34286a, false, 23635, new Class[]{Surface.class, Video.class}, Void.TYPE);
            return;
        }
        g().a(this.f34288c);
        g().a(surface);
        g().a(video, this.f34288c);
    }

    public final void a(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f34286a, false, 23640, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f34286a, false, 23640, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, null, g.f53899a, true, 56775, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, null, g.f53899a, true, 56775, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        g.f53900b.a(j2, str2);
    }

    public final void a(Video video, String str) {
        Video video2 = video;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{video2, str2}, this, f34286a, false, 23641, new Class[]{Video.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, str2}, this, f34286a, false, 23641, new Class[]{Video.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{video2, str2}, null, g.f53899a, true, 56772, new Class[]{Video.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, str2}, null, g.f53899a, true, 56772, new Class[]{Video.class, String.class}, Void.TYPE);
            return;
        }
        g.f53900b.a(video2, str2);
    }

    public final void a(Video video, String str, Long l, String str2, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{video, str, l, str2, str3, str4}, this, f34286a, false, 23639, new Class[]{Video.class, String.class, Long.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {video, str, l, str2, str3, str4};
            PatchProxy.accessDispatch(objArr, this, f34286a, false, 23639, new Class[]{Video.class, String.class, Long.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        long longValue = l.longValue();
        Object[] objArr2 = {video, str, new Long(longValue), str2, str3, str4, null};
        if (PatchProxy.isSupport(objArr2, null, g.f53899a, true, 56773, new Class[]{Video.class, String.class, Long.TYPE, String.class, String.class, String.class, o.class}, Void.TYPE)) {
            Object[] objArr3 = {video, str, new Long(longValue), str2, str3, str4, null};
            Object[] objArr4 = objArr3;
            PatchProxy.accessDispatch(objArr4, null, g.f53899a, true, 56773, new Class[]{Video.class, String.class, Long.TYPE, String.class, String.class, String.class, o.class}, Void.TYPE);
            return;
        }
        g.f53900b.a(video, str, longValue, str2, str3, str4, null);
    }
}
