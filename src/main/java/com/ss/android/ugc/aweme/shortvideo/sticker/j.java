package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.i;
import com.ss.android.ugc.aweme.w.b.a;
import java.util.List;

public final /* synthetic */ class j implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70129a;

    /* renamed from: b  reason: collision with root package name */
    private final i.a f70130b;

    j(i.a aVar) {
        this.f70130b = aVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70129a, false, 78647, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70129a, false, 78647, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        i.a aVar = this.f70130b;
        a aVar2 = (a) obj;
        if (aVar2 != null) {
            aVar.f69535f = (List) aVar2.f76549b;
        }
    }
}
