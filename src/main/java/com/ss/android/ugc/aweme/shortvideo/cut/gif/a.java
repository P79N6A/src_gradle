package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerState;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66425a;

    /* renamed from: b  reason: collision with root package name */
    private final Video2GifCutFragment f66426b;

    a(Video2GifCutFragment video2GifCutFragment) {
        this.f66426b = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66425a, false, 75820, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66425a, false, 75820, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Video2GifCutFragment video2GifCutFragment = this.f66426b;
        MediaPlayerState mediaPlayerState = (MediaPlayerState) obj;
        if (mediaPlayerState != null) {
            switch (mediaPlayerState.f55331c) {
                case 1:
                    if (!mediaPlayerState.f55330b) {
                        video2GifCutFragment.b();
                        return;
                    } else if (video2GifCutFragment.f66412f != null) {
                        video2GifCutFragment.f66412f.f64706e = (int) video2GifCutFragment.f66409c.f3566c.e();
                        return;
                    }
                    break;
                case 2:
                case 4:
                    video2GifCutFragment.ivPlay.setVisibility(8);
                    if (mediaPlayerState.f55330b) {
                        if (PatchProxy.isSupport(new Object[0], video2GifCutFragment, Video2GifCutFragment.f66407a, false, 75812, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], video2GifCutFragment, Video2GifCutFragment.f66407a, false, 75812, new Class[0], Void.TYPE);
                            break;
                        } else {
                            video2GifCutFragment.g.post(video2GifCutFragment.h);
                            return;
                        }
                    }
                    break;
                case 3:
                case 5:
                    if (mediaPlayerState.f55330b && !video2GifCutFragment.f66408b) {
                        if (PatchProxy.isSupport(new Object[0], video2GifCutFragment, Video2GifCutFragment.f66407a, false, 75813, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], video2GifCutFragment, Video2GifCutFragment.f66407a, false, 75813, new Class[0], Void.TYPE);
                        } else {
                            video2GifCutFragment.g.removeCallbacks(video2GifCutFragment.h);
                        }
                        video2GifCutFragment.ivPlay.setVisibility(0);
                        return;
                    }
                case 6:
                    if (mediaPlayerState.f55330b) {
                        video2GifCutFragment.ivPlay.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
    }
}
