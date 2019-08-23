package com.bytedance.android.livesdk.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class t extends HandlerThread implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17633a;

    /* renamed from: b  reason: collision with root package name */
    private Surface f17634b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f17635c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f17636d;

    public void onLooperPrepared() {
        if (PatchProxy.isSupport(new Object[0], this, f17633a, false, 13684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17633a, false, 13684, new Class[0], Void.TYPE);
            return;
        }
        super.onLooperPrepared();
        this.f17636d = new Handler(getLooper(), this);
        this.f17636d.sendEmptyMessage(233);
    }

    public boolean quitSafely() {
        if (PatchProxy.isSupport(new Object[0], this, f17633a, false, 13687, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17633a, false, 13687, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean quitSafely = super.quitSafely();
        this.f17636d.sendEmptyMessage(235);
        return quitSafely;
    }

    public boolean handleMessage(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f17633a, false, 13685, new Class[]{Message.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f17633a, false, 13685, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
        }
        int i = message.what;
        if (i == 233) {
            if (PatchProxy.isSupport(new Object[0], this, f17633a, false, 13686, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17633a, false, 13686, new Class[0], Void.TYPE);
            } else {
                Canvas lockCanvas = this.f17634b.lockCanvas(this.f17635c);
                lockCanvas.drawColor(-7829368);
                this.f17634b.unlockCanvasAndPost(lockCanvas);
                this.f17636d.sendEmptyMessageDelayed(233, 66);
            }
        } else if (i == 235) {
            this.f17634b = null;
        }
        return true;
    }

    public t(Surface surface, int i, int i2) {
        super(t.class.getSimpleName());
        this.f17634b = surface;
        this.f17635c = new Rect(0, 0, i, i2);
    }
}
