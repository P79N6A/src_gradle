package com.ss.android.ugc.aweme.story.shootvideo.edit;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.c;
import com.ss.android.ugc.aweme.tools.e;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73493a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73494b;

    k(a aVar) {
        this.f73494b = aVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f73493a, false, 85250, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f73493a, false, 85250, new Class[0], Object.class);
        }
        a aVar = this.f73494b;
        Bitmap e2 = aVar.v.e();
        if (!Lists.notEmpty(aVar.l.a()) && !aVar.A.g()) {
            return e2;
        }
        Bitmap a2 = c.a((View) aVar.l.f74199d, e2.getWidth(), e2.getHeight());
        if (a2 != null) {
            Canvas canvas = new Canvas(e2);
            canvas.drawBitmap(a2, 0.0f, 0.0f, null);
            canvas.save();
            e.a(a2);
        }
        return e2;
    }
}
