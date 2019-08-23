package com.ss.android.ugc.aweme.choosemusic.d;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.util.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35851a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f35852b;

    p(WeakReference weakReference) {
        this.f35852b = weakReference;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f35851a, false, 26753, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f35851a, false, 26753, new Class[0], Object.class);
        }
        WeakReference weakReference = this.f35852b;
        ArrayList arrayList = new ArrayList();
        if (!(weakReference == null || weakReference.get() == null)) {
            d.a((Context) weakReference.get(), (List<MusicModel>) arrayList);
        }
        return arrayList;
    }
}
