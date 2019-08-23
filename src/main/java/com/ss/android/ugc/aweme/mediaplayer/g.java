package com.ss.android.ugc.aweme.mediaplayer;

import a.i;
import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55344a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaPlayerModule f55345b;

    g(MediaPlayerModule mediaPlayerModule) {
        this.f55345b = mediaPlayerModule;
    }

    public final Object then(i iVar) {
        MediaPlayerState mediaPlayerState;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f55344a, false, 58695, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f55344a, false, 58695, new Class[]{i.class}, Object.class);
        }
        MutableLiveData<MediaPlayerState> mutableLiveData = this.f55345b.i;
        boolean booleanValue = ((Boolean) iVar.e()).booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, null, MediaPlayerState.f55329a, true, 58697, new Class[]{Boolean.TYPE}, MediaPlayerState.class)) {
            mediaPlayerState = (MediaPlayerState) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, null, MediaPlayerState.f55329a, true, 58697, new Class[]{Boolean.TYPE}, MediaPlayerState.class);
        } else {
            mediaPlayerState = new MediaPlayerState(2, booleanValue);
        }
        mutableLiveData.setValue(mediaPlayerState);
        return null;
    }
}
