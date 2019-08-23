package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.SurfaceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.a.i;

public class CaptureWidget2 extends AbsCaptureWidget {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f12382c;

    /* renamed from: d  reason: collision with root package name */
    i f12383d;

    /* renamed from: e  reason: collision with root package name */
    SurfaceView f12384e;

    public int getLayoutId() {
        return C0906R.layout.ann;
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12382c, false, 6598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12382c, false, 6598, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f12384e = (SurfaceView) this.contentView;
    }

    CaptureWidget2(i iVar) {
        this.f12383d = iVar;
    }
}
