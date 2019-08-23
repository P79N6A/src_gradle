package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CurChildStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70244a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Pair<Integer, Integer>> f70245b = new MutableLiveData<>();

    public final void a(@Nullable Pair<Integer, Integer> pair) {
        Pair<Integer, Integer> pair2 = pair;
        if (PatchProxy.isSupport(new Object[]{pair2}, this, f70244a, false, 79890, new Class[]{Pair.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pair2}, this, f70244a, false, 79890, new Class[]{Pair.class}, Void.TYPE);
            return;
        }
        this.f70245b.setValue(pair2);
    }
}
