package com.ss.android.ugc.aweme.web.jsbridge;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76779a;

    /* renamed from: b  reason: collision with root package name */
    private final e f76780b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76781c;

    /* renamed from: d  reason: collision with root package name */
    private final int f76782d;

    /* renamed from: e  reason: collision with root package name */
    private final int f76783e;

    /* renamed from: f  reason: collision with root package name */
    private final int f76784f;

    f(e eVar, int i, int i2, int i3, int i4) {
        this.f76780b = eVar;
        this.f76781c = i;
        this.f76782d = i2;
        this.f76783e = i3;
        this.f76784f = i4;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f76779a, false, 89938, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f76779a, false, 89938, new Class[0], Object.class);
        }
        e eVar = this.f76780b;
        int i = this.f76781c;
        int i2 = this.f76782d;
        int i3 = this.f76783e;
        int i4 = this.f76784f;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((float) (-i3), (float) (-i4));
        eVar.f76774b.f20612d.draw(canvas);
        return createBitmap;
    }
}
