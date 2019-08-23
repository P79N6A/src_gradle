package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class t implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70187a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule f70188b;

    t(StickerModule stickerModule) {
        this.f70188b = stickerModule;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f70187a, false, 78745, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f70187a, false, 78745, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        StickerModule stickerModule = this.f70188b;
        if (motionEvent.getAction() == 0 && stickerModule.h.b()) {
            stickerModule.h.a();
        }
        return false;
    }
}
