package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.opengl.GLSurfaceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.a.i;

public class CaptureWidget extends AbsCaptureWidget {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f12380e;

    /* renamed from: f  reason: collision with root package name */
    i f12381f;
    GLSurfaceView g;

    public int getLayoutId() {
        return C0906R.layout.anm;
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12380e, false, 6597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12380e, false, 6597, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g = (GLSurfaceView) this.contentView;
    }

    CaptureWidget(i iVar) {
        this.f12381f = iVar;
    }
}
