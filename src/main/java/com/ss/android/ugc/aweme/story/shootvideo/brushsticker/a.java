package com.ss.android.ugc.aweme.story.shootvideo.brushsticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view.StoryBrushLayout;
import com.ss.android.ugc.aweme.story.shootvideo.e;
import com.ss.android.vesdk.p;

public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f73402b;

    /* renamed from: c  reason: collision with root package name */
    public StoryBrushLayout f73403c;

    /* renamed from: d  reason: collision with root package name */
    public b f73404d;

    /* renamed from: e  reason: collision with root package name */
    public p f73405e;

    /* renamed from: f  reason: collision with root package name */
    public int f73406f;
    public int g;
    public int h = -1;
    public float i = 16.0f;
    public String j;
    public String k;
    public boolean l;
    public boolean m;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a$a  reason: collision with other inner class name */
    public interface C0762a {
        void a();

        void a(float f2);

        void a(float f2, float f3);

        void a(float f2, float f3, float f4, float f5);

        void a(int i);

        void b(float f2, float f3);
    }

    public interface b {
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f73402b, false, 85167, new Class[0], Boolean.TYPE)) {
            return this.f73403c.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73402b, false, 85167, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f73402b, false, 85169, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73402b, false, 85169, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f73405e == null) {
            return true;
        } else {
            return this.f73405e.v();
        }
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f73402b, false, 85173, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73402b, false, 85173, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f73405e == null) {
            return false;
        } else {
            if (this.f73405e.w() > 0) {
                z = true;
            }
            return z;
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f73402b, false, 85166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73402b, false, 85166, new Class[0], Void.TYPE);
            return;
        }
        this.f73403c.a();
        if (!(this.f73404d == null || this.f73405e == null)) {
            this.f73405e.w();
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f73402b, false, 85171, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f73402b, false, 85171, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f73405e != null) {
            this.f73405e.n.set2DBrushCanvasAlpha(f2);
        }
    }

    public final void a(com.ss.android.ugc.aweme.story.shootvideo.a.b bVar) {
        com.ss.android.ugc.aweme.story.shootvideo.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f73402b, false, 85164, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f73402b, false, 85164, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.a.b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        this.f73403c.setStoryEditViewShowListener(bVar2);
    }
}
