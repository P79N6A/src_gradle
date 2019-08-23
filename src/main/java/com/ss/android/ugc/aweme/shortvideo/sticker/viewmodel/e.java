package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.b.a;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70319a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableLiveData f70320b;

    e(MutableLiveData mutableLiveData) {
        this.f70320b = mutableLiveData;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70319a, false, 79914, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70319a, false, 79914, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f70320b.setValue(a.a(a.C0799a.ERROR, (Throwable) obj));
    }
}
