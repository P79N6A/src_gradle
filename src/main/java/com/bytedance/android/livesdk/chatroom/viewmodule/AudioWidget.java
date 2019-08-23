package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.view.Surface;
import com.bytedance.android.livesdk.chatroom.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.a.i;

public class AudioWidget extends CaptureWidget implements a.C0077a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f12350c;

    /* renamed from: d  reason: collision with root package name */
    Surface f12351d;
    private a h;
    private ValueAnimator i;

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12350c, false, 6554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12350c, false, 6554, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.i.removeAllUpdateListeners();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12350c, false, 6551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12350c, false, 6551, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.h = new a(this.g);
        this.h.a(3553);
        this.h.f9694c = this;
        this.h.a(this.f12381f);
        this.i = ValueAnimator.ofInt(new int[]{0, 4}).setDuration(1000);
        this.i.setRepeatMode(2);
        this.i.setRepeatCount(-1);
        this.i.addUpdateListener(new a(this));
        this.i.start();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f12350c, false, 6553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12350c, false, 6553, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        a aVar = this.h;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f9692a, false, 3889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f9692a, false, 3889, new Class[0], Void.TYPE);
        } else {
            aVar.f9693b.onPause();
        }
        this.i.end();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f12350c, false, 6552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12350c, false, 6552, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        a aVar = this.h;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f9692a, false, 3888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f9692a, false, 3888, new Class[0], Void.TYPE);
        } else {
            aVar.f9693b.onResume();
        }
        this.i.start();
    }

    public AudioWidget(i iVar) {
        super(iVar);
    }

    public final void a(Surface surface) {
        this.f12351d = surface;
    }
}
