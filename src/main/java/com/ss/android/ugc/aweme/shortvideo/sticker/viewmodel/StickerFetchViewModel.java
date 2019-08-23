package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;

public class StickerFetchViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70302a;

    /* renamed from: b  reason: collision with root package name */
    private g f70303b;

    /* renamed from: c  reason: collision with root package name */
    private MutableLiveData<k> f70304c;

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f70302a, false, 79938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70302a, false, 79938, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        if (this.f70303b != null) {
            this.f70303b.destroy();
        }
    }

    public final LiveData<k> a(@NonNull g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f70302a, false, 79937, new Class[]{g.class}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{gVar}, this, f70302a, false, 79937, new Class[]{g.class}, LiveData.class);
        }
        if (this.f70304c == null) {
            this.f70304c = new MutableLiveData<>();
            this.f70303b = gVar;
            this.f70304c.setValue(new k.b(gVar));
        }
        return this.f70304c;
    }
}
