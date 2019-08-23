package com.ss.android.ugc.aweme.mediaplayer;

import a.g;
import a.i;
import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55339a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaPlayerModule f55340b;

    e(MediaPlayerModule mediaPlayerModule) {
        this.f55340b = mediaPlayerModule;
    }

    public final Object then(i iVar) {
        MediaPlayerState mediaPlayerState;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f55339a, false, 58693, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f55339a, false, 58693, new Class[]{i.class}, Object.class);
        }
        MediaPlayerModule mediaPlayerModule = this.f55340b;
        int intValue = ((Integer) iVar.e()).intValue();
        MutableLiveData<MediaPlayerState> mutableLiveData = mediaPlayerModule.i;
        boolean z = intValue >= 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, MediaPlayerState.f55329a, true, 58696, new Class[]{Boolean.TYPE}, MediaPlayerState.class)) {
            mediaPlayerState = (MediaPlayerState) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, MediaPlayerState.f55329a, true, 58696, new Class[]{Boolean.TYPE}, MediaPlayerState.class);
        } else {
            mediaPlayerState = new MediaPlayerState(1, z);
        }
        mutableLiveData.setValue(mediaPlayerState);
        return Integer.valueOf(intValue);
    }
}
