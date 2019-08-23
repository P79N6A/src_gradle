package com.ss.android.ugc.aweme.mediaplayer;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55337a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaPlayerModule f55338b;

    d(MediaPlayerModule mediaPlayerModule) {
        this.f55338b = mediaPlayerModule;
    }

    public final Object call() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f55337a, false, 58692, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f55337a, false, 58692, new Class[0], Object.class);
        }
        MediaPlayerModule mediaPlayerModule = this.f55338b;
        String str = mediaPlayerModule.f3565b;
        if (PatchProxy.isSupport(new Object[]{str}, mediaPlayerModule, MediaPlayerModule.f3564a, false, 58681, new Class[]{String.class}, Integer.TYPE)) {
            MediaPlayerModule mediaPlayerModule2 = mediaPlayerModule;
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{str}, mediaPlayerModule2, MediaPlayerModule.f3564a, false, 58681, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (!mediaPlayerModule.f3569f) {
            if (!TextUtils.isEmpty(str)) {
                int a2 = mediaPlayerModule.f3566c.a(str);
                if (a2 >= 0) {
                    if (PatchProxy.isSupport(new Object[0], mediaPlayerModule, MediaPlayerModule.f3564a, false, 58682, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], mediaPlayerModule, MediaPlayerModule.f3564a, false, 58682, new Class[0], Void.TYPE);
                    } else {
                        if (mediaPlayerModule.g.f55349d >= 0 && mediaPlayerModule.g.f55350e - mediaPlayerModule.g.f55349d > 0) {
                            mediaPlayerModule.f3566c.a(mediaPlayerModule.g.f55349d, mediaPlayerModule.g.f55350e);
                        }
                        mediaPlayerModule.f3566c.a(mediaPlayerModule.g.f55348c);
                        mediaPlayerModule.f3566c.b((double) mediaPlayerModule.g.f55346a);
                        mediaPlayerModule.f3566c.a((double) mediaPlayerModule.g.f55347b);
                    }
                }
                i = a2;
            } else {
                i = -1;
            }
        }
        return Integer.valueOf(i);
    }
}
