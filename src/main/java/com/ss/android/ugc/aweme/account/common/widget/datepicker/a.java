package com.ss.android.ugc.aweme.account.common.widget.datepicker;

import android.media.AudioManager;
import android.media.SoundPool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31828a;

    /* renamed from: b  reason: collision with root package name */
    private SoundPool f31829b;

    /* renamed from: c  reason: collision with root package name */
    private AudioManager f31830c;

    /* renamed from: d  reason: collision with root package name */
    private float f31831d;

    /* renamed from: e  reason: collision with root package name */
    private int f31832e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f31828a, false, 19889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31828a, false, 19889, new Class[0], Void.TYPE);
            return;
        }
        this.f31831d = (float) this.f31830c.getStreamVolume(1);
        if (this.f31832e > 0) {
            this.f31829b.play(this.f31832e, this.f31831d, this.f31831d, 0, 0, 1.0f);
        } else {
            this.f31830c.playSoundEffect(0, this.f31831d);
        }
    }
}
