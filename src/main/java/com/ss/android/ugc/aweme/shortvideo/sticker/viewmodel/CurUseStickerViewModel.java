package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class CurUseStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70248a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Effect> f70249b = new MutableLiveData<>();

    public final void a(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f70248a, false, 79892, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, f70248a, false, 79892, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        this.f70249b.setValue(effect2);
    }
}
