package com.ss.android.ugc.awemepushlib.manager;

import a.g;
import a.i;
import android.content.Context;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.awemepushlib.a.c;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77082a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f77083b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap[] f77084c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap[] f77085d;

    /* renamed from: e  reason: collision with root package name */
    private final int f77086e;

    /* renamed from: f  reason: collision with root package name */
    private final c f77087f;

    e(Context context, Bitmap[] bitmapArr, Bitmap[] bitmapArr2, int i, c cVar) {
        this.f77083b = context;
        this.f77084c = bitmapArr;
        this.f77085d = bitmapArr2;
        this.f77086e = i;
        this.f77087f = cVar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f77082a, false, 90334, new Class[]{i.class}, Object.class)) {
            return MessageShowHandler.showWithNotification(this.f77083b, this.f77084c[0], this.f77085d[0], this.f77086e, null, this.f77087f);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f77082a, false, 90334, new Class[]{i.class}, Object.class);
    }
}
