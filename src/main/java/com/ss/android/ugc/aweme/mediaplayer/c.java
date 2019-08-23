package com.ss.android.ugc.aweme.mediaplayer;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55335a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaPlayerModule f55336b;

    c(MediaPlayerModule mediaPlayerModule) {
        this.f55336b = mediaPlayerModule;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f55335a, false, 58691, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f55335a, false, 58691, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        MediaPlayerModule mediaPlayerModule = this.f55336b;
        MediaPlayerState mediaPlayerState = (MediaPlayerState) obj;
        if (mediaPlayerState != null) {
            switch (mediaPlayerState.f55331c) {
                case 1:
                    if (mediaPlayerState.f55330b) {
                        mediaPlayerModule.f3569f = true;
                        return;
                    }
                    break;
                case 2:
                case 4:
                    mediaPlayerModule.f3568e = true;
                    return;
                case 3:
                case 5:
                    mediaPlayerModule.f3568e = false;
                    return;
                case 6:
                    mediaPlayerModule.f3569f = false;
                    mediaPlayerModule.f3568e = false;
                    break;
            }
        }
    }
}
