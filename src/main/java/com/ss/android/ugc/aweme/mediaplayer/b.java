package com.ss.android.ugc.aweme.mediaplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.player.IESMediaPlayer;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55332a;

    /* renamed from: b  reason: collision with root package name */
    private IESMediaPlayer f55333b;

    /* renamed from: c  reason: collision with root package name */
    private Context f55334c;

    public final boolean a(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, f55332a, false, 58658, new Class[]{Surface.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{surface}, this, f55332a, false, 58658, new Class[]{Surface.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f55333b == null) {
            return false;
        } else {
            this.f55333b.start(surface);
            return true;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55332a, false, 58659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55332a, false, 58659, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55333b != null) {
            this.f55333b.pause();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f55332a, false, 58660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55332a, false, 58660, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55333b != null) {
            this.f55333b.resume();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f55332a, false, 58661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55332a, false, 58661, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55333b != null) {
            this.f55333b.stop();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f55332a, false, 58662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55332a, false, 58662, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55333b != null) {
            this.f55333b.release();
            this.f55333b = null;
        }
    }

    public final long e() {
        if (PatchProxy.isSupport(new Object[0], this, f55332a, false, 58671, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f55332a, false, 58671, new Class[0], Long.TYPE)).longValue();
        } else if (this.f55333b != null) {
            return this.f55333b.getDuration();
        } else {
            return 0;
        }
    }

    public final long f() {
        if (PatchProxy.isSupport(new Object[0], this, f55332a, false, 58672, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f55332a, false, 58672, new Class[0], Long.TYPE)).longValue();
        } else if (this.f55333b != null) {
            return this.f55333b.getCurrentPosition();
        } else {
            return 0;
        }
    }

    public b(@NonNull Context context) {
        this.f55334c = context;
        this.f55333b = new IESMediaPlayer(context);
    }

    public final int a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f55332a, false, 58665, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f55332a, false, 58665, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f55333b != null) {
            return this.f55333b.seek(j);
        } else {
            return -1;
        }
    }

    public final int b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f55332a, false, 58666, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f55332a, false, 58666, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f55333b != null) {
            return this.f55333b.seekLeft(j);
        } else {
            return -1;
        }
    }

    public final int c(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f55332a, false, 58667, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f55332a, false, 58667, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f55333b != null) {
            return this.f55333b.seekRight(j);
        } else {
            return -1;
        }
    }

    public final int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f55332a, false, 58657, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f55332a, false, 58657, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (this.f55333b == null) {
            this.f55333b = new IESMediaPlayer(this.f55334c);
        }
        return this.f55333b.prepare(str);
    }

    public final void b(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f55332a, false, 58668, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f55332a, false, 58668, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55333b != null) {
            this.f55333b.setSpeed(d2);
        }
    }

    public final void a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f55332a, false, 58656, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f55332a, false, 58656, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55333b != null) {
            this.f55333b.setVolume(d2);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f55332a, false, 58664, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f55332a, false, 58664, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55333b != null) {
            this.f55333b.setLoop(z);
        }
    }

    public final void a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f55332a, false, 58670, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f55332a, false, 58670, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55333b != null) {
            this.f55333b.setBoundary(j3, j4);
        }
    }
}
