package com.bytedance.android.livesdk.roommanage;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17100a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17101b;

    b(a aVar) {
        this.f17101b = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17100a, false, 13126, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17100a, false, 13126, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a aVar = this.f17101b;
        if (1 == aVar.f17085b) {
            aVar.a();
        } else {
            aVar.b();
        }
    }
}
