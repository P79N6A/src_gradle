package com.ss.android.ugc.aweme.share.c;

import a.g;
import a.i;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64881a;

    /* renamed from: b  reason: collision with root package name */
    private final View f64882b;

    d(View view) {
        this.f64882b = view;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64881a, false, 73746, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64881a, false, 73746, new Class[]{i.class}, Object.class);
        }
        View view = this.f64882b;
        if (iVar.e() == null) {
            return null;
        }
        view.draw(new Canvas((Bitmap) iVar.e()));
        return (Bitmap) iVar.e();
    }
}
