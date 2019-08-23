package com.ss.android.ugc.aweme.music.util;

import android.media.MediaPlayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56793a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile MediaPlayer f56794b;

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f56793a, true, 60593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f56793a, true, 60593, new Class[0], Void.TYPE);
            return;
        }
        if (f56794b != null) {
            f56794b.release();
            f56794b = null;
        }
    }

    public static MediaPlayer a() {
        if (PatchProxy.isSupport(new Object[0], null, f56793a, true, 60592, new Class[0], MediaPlayer.class)) {
            return (MediaPlayer) PatchProxy.accessDispatch(new Object[0], null, f56793a, true, 60592, new Class[0], MediaPlayer.class);
        }
        if (f56794b == null) {
            synchronized (b.class) {
                if (f56794b == null) {
                    f56794b = new MediaPlayer();
                }
            }
        }
        return f56794b;
    }
}
