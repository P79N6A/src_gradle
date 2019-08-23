package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66073a;

    /* renamed from: b  reason: collision with root package name */
    MediaPlayer f66074b;

    /* renamed from: c  reason: collision with root package name */
    final Context f66075c;

    /* renamed from: d  reason: collision with root package name */
    final Uri f66076d;

    /* renamed from: e  reason: collision with root package name */
    Handler f66077e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    public a f66078f;
    boolean g;

    public interface a {
        void a(int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66073a, false, 75342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66073a, false, 75342, new Class[0], Void.TYPE);
            return;
        }
        if (!this.g) {
            this.g = true;
            if (this.f66074b != null) {
                this.f66074b.release();
            }
        }
    }

    public g(@NonNull Context context, @NonNull Uri uri) {
        this.f66075c = context;
        this.f66076d = uri;
        this.f66074b = MediaPlayer.create(context, uri);
    }
}
