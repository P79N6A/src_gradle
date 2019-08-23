package com.ss.android.ugc.playerkit.videoview.b;

import com.ss.android.ugc.aweme.player.sdk.api.c;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.playerkit.c.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static d f77755a = new d();

    /* renamed from: b  reason: collision with root package name */
    private c f77756b;

    /* renamed from: c  reason: collision with root package name */
    private c.a f77757c;

    public final synchronized com.ss.android.ugc.aweme.player.sdk.api.c a(c.a aVar) {
        if (this.f77756b == null) {
            this.f77757c = aVar;
            this.f77756b = new com.ss.android.ugc.aweme.player.sdk.b.d(new e(aVar));
        } else if (this.f77757c != null && !this.f77757c.equals(aVar)) {
            this.f77756b.e();
            this.f77757c = aVar;
            this.f77756b = new com.ss.android.ugc.aweme.player.sdk.b.d(new e(aVar));
        }
        return this.f77756b;
    }
}
