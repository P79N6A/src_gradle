package com.ss.android.ugc.aweme.mediaplayer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MediaPlayerState {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55329a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55330b;

    /* renamed from: c  reason: collision with root package name */
    public int f55331c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerState {
    }

    private MediaPlayerState() {
    }

    public static MediaPlayerState a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, null, f55329a, true, 58698, new Class[]{Boolean.TYPE}, MediaPlayerState.class)) {
            return new MediaPlayerState(3, true);
        }
        return (MediaPlayerState) PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, f55329a, true, 58698, new Class[]{Boolean.TYPE}, MediaPlayerState.class);
    }

    public static MediaPlayerState b(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, null, f55329a, true, 58699, new Class[]{Boolean.TYPE}, MediaPlayerState.class)) {
            return new MediaPlayerState(4, true);
        }
        return (MediaPlayerState) PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, f55329a, true, 58699, new Class[]{Boolean.TYPE}, MediaPlayerState.class);
    }

    MediaPlayerState(int i, boolean z) {
        this.f55330b = z;
        this.f55331c = i;
    }
}
