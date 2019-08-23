package com.bytedance.android.livesdk.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.retrofit2.Retrofit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e implements ViewModelProvider.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17752a;

    /* renamed from: b  reason: collision with root package name */
    private final Retrofit f17753b;

    public e(@NonNull Retrofit retrofit) {
        this.f17753b = retrofit;
    }

    @NonNull
    public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f17752a, false, 13862, new Class[]{Class.class}, ViewModel.class)) {
            return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f17752a, false, 13862, new Class[]{Class.class}, ViewModel.class);
        } else if (cls2.isAssignableFrom(RoomStatsViewModel.class)) {
            return new RoomStatsViewModel(this.f17753b);
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}
