package com.ss.android.ugc.aweme.common.widget.datepicker;

import android.media.AudioManager;
import android.media.SoundPool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40552a;

    /* renamed from: b  reason: collision with root package name */
    private SoundPool f40553b;

    /* renamed from: c  reason: collision with root package name */
    private AudioManager f40554c;

    /* renamed from: d  reason: collision with root package name */
    private float f40555d;

    /* renamed from: e  reason: collision with root package name */
    private int f40556e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40552a, false, 33930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40552a, false, 33930, new Class[0], Void.TYPE);
            return;
        }
        this.f40555d = (float) this.f40554c.getStreamVolume(1);
        if (this.f40556e > 0) {
            this.f40553b.play(this.f40556e, this.f40555d, this.f40555d, 0, 0, 1.0f);
        } else {
            this.f40554c.playSoundEffect(0, this.f40555d);
        }
    }
}
