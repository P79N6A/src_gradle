package com.ss.android.ugc.aweme.qrcode.v2;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.c.i;
import com.ss.android.ugc.aweme.qrcode.d;

public final class k extends c {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f63551b;

    public final b a() {
        if (!PatchProxy.isSupport(new Object[0], this, f63551b, false, 70612, new Class[0], b.class)) {
            return new i();
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, f63551b, false, 70612, new Class[0], b.class);
    }

    public k(Context context) {
        super(context);
    }

    public final void setParams(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f63551b, false, 70611, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f63551b, false, 70611, new Class[]{d.class}, Void.TYPE);
            return;
        }
        super.setParams(dVar);
        if (this.f63471d.c()) {
            this.f63472e.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.fromFile(this.f63471d.d())).setOldController(this.f63472e.getController())).setControllerListener(this.j)).build());
        }
    }
}
