package com.ss.android.ugc.aweme.livewallpaper.b;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.locks.ReentrantLock;

public class n implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53642a;

    /* renamed from: b  reason: collision with root package name */
    protected b f53643b;

    /* renamed from: c  reason: collision with root package name */
    private int f53644c;

    /* renamed from: d  reason: collision with root package name */
    private int f53645d;

    /* renamed from: e  reason: collision with root package name */
    private int f53646e;

    /* renamed from: f  reason: collision with root package name */
    private int f53647f;
    private g g = new m(0);
    private ReentrantLock h = new ReentrantLock();

    class a implements b {
        private a() {
        }

        public final void a(h hVar) {
            n.this.f53643b = null;
        }

        /* synthetic */ a(n nVar, byte b2) {
            this();
        }
    }

    public interface b {
        void a(h hVar);
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f53642a, false, 56176, new Class[0], Integer.TYPE)) {
            return this.g.a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53642a, false, 56176, new Class[0], Integer.TYPE)).intValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f53642a, false, 56181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53642a, false, 56181, new Class[0], Void.TYPE);
            return;
        }
        this.h.unlock();
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f53642a, false, 56177, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53642a, false, 56177, new Class[0], Integer.TYPE)).intValue();
        }
        int b2 = this.g.b();
        if (b2 == 1) {
            this.f53643b.a(this);
        } else if (b2 <= 0) {
            throw new RuntimeException(new Exception("reference idx " + (b2 - 1) + " app abort!!"));
        }
        return 0;
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f53642a, false, 56179, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53642a, false, 56179, new Class[0], Integer.TYPE)).intValue();
        } else if (!this.h.isHeldByCurrentThread()) {
            this.h.lock();
            return this.f53644c;
        } else {
            throw new AndroidRuntimeException("Dead lock!!");
        }
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f53642a, false, 56174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53642a, false, 56174, new Class[0], Void.TYPE);
            return;
        }
        c();
        if (this.f53644c > 0) {
            int i = this.f53644c;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, i.f53625a, true, 56127, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, i.f53625a, true, 56127, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
            }
        }
        if (this.f53645d > 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.f53645d}, 0);
        }
        this.f53645d = 0;
        this.f53644c = 0;
        this.f53643b = new a(this, (byte) 0);
        d();
    }

    public n(int i, int i2, int i3, b bVar) {
        this.f53644c = i;
        this.f53646e = i2;
        this.f53647f = i3;
        this.f53643b = bVar == null ? new a(this, (byte) 0) : bVar;
    }
}
