package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70317a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableLiveData f70318b;

    d(MutableLiveData mutableLiveData) {
        this.f70318b = mutableLiveData;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70317a, false, 79913, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70317a, false, 79913, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f70318b.setValue(a.a(a.C0799a.SUCCESS, (CategoryEffectModel) obj));
    }
}
