package com.ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.LinkedHashSet;
import java.util.Set;

public final class e implements VideoSurfaceHolder {

    /* renamed from: a  reason: collision with root package name */
    public boolean f77773a;

    /* renamed from: b  reason: collision with root package name */
    public Set<i> f77774b;

    /* renamed from: c  reason: collision with root package name */
    public int f77775c;

    /* renamed from: d  reason: collision with root package name */
    public int f77776d;

    /* renamed from: e  reason: collision with root package name */
    private final SurfaceView f77777e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f77778f;

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final int g() {
        return 1;
    }

    public final View a() {
        return this.f77777e;
    }

    public final boolean c() {
        return this.f77773a;
    }

    public final boolean h() {
        return this.f77778f;
    }

    public final Surface b() {
        return this.f77777e.getHolder().getSurface();
    }

    public final void a(i iVar) {
        this.f77774b.add(iVar);
    }

    public final void b(i iVar) {
        this.f77774b.remove(iVar);
    }

    public final void a(boolean z) {
        this.f77778f = z;
    }

    public e(ViewGroup viewGroup) {
        this.f77777e = new SurfaceView(viewGroup.getContext());
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(this.f77777e, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(this.f77777e, 0, layoutParams);
        } else {
            viewGroup.addView(this.f77777e, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f77774b = new LinkedHashSet();
        this.f77777e.getHolder().addCallback(new SurfaceHolder.Callback() {
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                e.this.f77773a = false;
                for (i a2 : e.this.f77774b) {
                    a2.a();
                }
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                e.this.f77773a = true;
                for (i a2 : e.this.f77774b) {
                    a2.a(e.this.f77775c, e.this.f77776d);
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                e.this.f77775c = i2;
                e.this.f77776d = i3;
                for (i b2 : e.this.f77774b) {
                    b2.b(i2, i3);
                }
            }
        });
    }
}
