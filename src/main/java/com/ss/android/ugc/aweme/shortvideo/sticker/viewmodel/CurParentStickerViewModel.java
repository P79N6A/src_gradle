package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class CurParentStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70246a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Pair<Effect, Effect>> f70247b = new MutableLiveData<>();

    public final void a(@Nullable Pair<Effect, Effect> pair) {
        Pair<Effect, Effect> pair2 = pair;
        if (PatchProxy.isSupport(new Object[]{pair2}, this, f70246a, false, 79891, new Class[]{Pair.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pair2}, this, f70246a, false, 79891, new Class[]{Pair.class}, Void.TYPE);
            return;
        }
        this.f70247b.setValue(pair2);
    }
}
