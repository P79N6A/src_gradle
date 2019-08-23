package com.ss.android.ugc.aweme.face2face.viewmodel;

import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.net.f;
import java.util.List;

public class Face2FaceUserListViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44118a;

    /* renamed from: b  reason: collision with root package name */
    public MediatorLiveData<List<f>> f44119b = new MediatorLiveData<>();

    public final void a(@Nullable List<f> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f44118a, false, 39285, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f44118a, false, 39285, new Class[]{List.class}, Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f44119b.setValue(list);
        } else {
            this.f44119b.postValue(list);
        }
    }
}
