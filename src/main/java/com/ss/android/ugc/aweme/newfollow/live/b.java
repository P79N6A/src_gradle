package com.ss.android.ugc.aweme.newfollow.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.follow.presenter.CreateRoomResponse;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.live.a;
import com.ss.android.ugc.aweme.newfollow.vh.x;

public final class b implements g.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57166a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f57167b;

    /* renamed from: c  reason: collision with root package name */
    private x f57168c;

    /* renamed from: d  reason: collision with root package name */
    private String f57169d;

    /* renamed from: e  reason: collision with root package name */
    private RoomStruct f57170e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f57171f;
    private TextureRenderView g;
    private g h = a.d().e();
    private Runnable i;
    private boolean j;
    private int k;
    private int l;

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61187, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.h.a(null, null, 0, null, null, null);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    private Context f() {
        if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61197, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61197, new Class[0], Context.class);
        } else if (this.f57171f == null) {
            return null;
        } else {
            return this.f57171f.getContext();
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61200, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.d(f());
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61190, new Class[0], Void.TYPE);
        } else if (this.h != null && TextUtils.equals(this.f57169d, this.h.h())) {
            g();
            e();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61193, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            g();
            this.h.e(f());
        }
        e();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61194, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61194, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            this.g.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.g.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.g);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61191, new Class[0], Void.TYPE);
        } else if (this.h != null && TextUtils.equals(this.f57169d, this.h.h())) {
            if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61192, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61192, new Class[0], Void.TYPE);
            } else {
                d();
            }
            g();
            e();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57166a, false, 61199, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57166a, false, 61199, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.h == null || f() == null)) {
            try {
                this.h.a(z, f());
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("LivePlayHelper", Log.getStackTraceString(e2));
            }
        }
    }

    public b(Runnable runnable, x xVar) {
        this.i = runnable;
        this.f57168c = xVar;
    }

    public final void a(g.b bVar, Object obj) {
        if (PatchProxy.isSupport(new Object[]{bVar, obj}, this, f57166a, false, 61196, new Class[]{g.b.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, obj}, this, f57166a, false, 61196, new Class[]{g.b.class, Object.class}, Void.TYPE);
            return;
        }
        switch (bVar) {
            case INTERACT_SEI:
                this.j = true;
                break;
            case VIDEO_SIZE_CHANGED:
                if (this.f57168c != null) {
                    int parseInt = Integer.parseInt((String) obj);
                    int i2 = 65535 & parseInt;
                    this.k = i2;
                    int i3 = parseInt >> 16;
                    this.l = i3;
                    ALog.d("LivePlayHelper", "width = " + i2 + "; height = " + i3);
                    this.f57168c.a(this.g, this.k, this.l);
                    if (this.g != null) {
                        this.g.setScaleType(2);
                        this.g.a(this.k, this.l);
                        break;
                    }
                }
                break;
            case DISPLAYED_PLAY:
                if (this.i != null) {
                    this.i.run();
                    break;
                }
                break;
        }
        if (this.f57168c != null) {
            this.f57168c.a(bVar);
        }
    }

    public final void a(boolean z, RoomStruct roomStruct, FrameLayout frameLayout) {
        RoomStruct roomStruct2 = roomStruct;
        FrameLayout frameLayout2 = frameLayout;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), roomStruct2, frameLayout2}, this, f57166a, false, 61188, new Class[]{Boolean.TYPE, RoomStruct.class, FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), roomStruct2, frameLayout2}, this, f57166a, false, 61188, new Class[]{Boolean.TYPE, RoomStruct.class, FrameLayout.class}, Void.TYPE);
        } else if (frameLayout2 == null) {
            com.ss.android.ugc.aweme.framework.a.a.a("LivePlayHelper", "liveStreamContainer is null");
        } else {
            this.f57167b = z;
            if (!TextUtils.equals(this.f57169d, roomStruct2.stream_url.rtmp_pull_url)) {
                d();
            }
            this.f57169d = roomStruct2.stream_url.rtmp_pull_url;
            this.f57170e = roomStruct2;
            this.f57171f = frameLayout2;
            if (PatchProxy.isSupport(new Object[0], this, f57166a, false, 61198, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57166a, false, 61198, new Class[0], Void.TYPE);
                return;
            }
            this.j = false;
            CreateRoomResponse.StreamUrlStruct streamUrlStruct = this.f57170e.stream_url;
            try {
                Context context = this.f57171f.getContext();
                if (PatchProxy.isSupport(new Object[]{context}, this, f57166a, false, 61195, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context}, this, f57166a, false, 61195, new Class[]{Context.class}, Void.TYPE);
                } else {
                    if (this.g == null) {
                        this.g = new TextureRenderView(context);
                    }
                    if (!(this.g.getLayoutParams() != null && this.g.getLayoutParams().width == -1 && this.g.getLayoutParams().height == -1)) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        this.g.setLayoutParams(layoutParams);
                    }
                    this.g.setVisibility(0);
                    this.g.setScaleType(2);
                }
                FrameLayout frameLayout3 = this.f57171f;
                if (PatchProxy.isSupport(new Object[]{frameLayout3}, this, f57166a, false, 61189, new Class[]{FrameLayout.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{frameLayout3}, this, f57166a, false, 61189, new Class[]{FrameLayout.class}, Void.TYPE);
                } else if (frameLayout3.indexOfChild(this.g) < 0) {
                    e();
                    this.g.setVisibility(0);
                    frameLayout3.addView(this.g);
                }
                this.h.c(true);
                this.h.a(streamUrlStruct.rtmp_pull_url, this.g, this.f57170e.getStreamType().ordinal(), null, this, null);
                this.h.a(this.f57167b, f());
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("LivePlayHelper", Log.getStackTraceString(e2));
            }
        }
    }
}
