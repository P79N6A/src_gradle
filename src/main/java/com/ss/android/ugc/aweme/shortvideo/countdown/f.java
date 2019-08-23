package com.ss.android.ugc.aweme.shortvideo.countdown;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66069a;

    /* renamed from: b  reason: collision with root package name */
    private final CountdownFragment f66070b;

    /* renamed from: c  reason: collision with root package name */
    private final int f66071c;

    /* renamed from: d  reason: collision with root package name */
    private final int f66072d;

    f(CountdownFragment countdownFragment, int i, int i2) {
        this.f66070b = countdownFragment;
        this.f66071c = i;
        this.f66072d = i2;
    }

    public final void run() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f66069a, false, 75333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66069a, false, 75333, new Class[0], Void.TYPE);
            return;
        }
        CountdownFragment countdownFragment = this.f66070b;
        int i = this.f66071c;
        int i2 = this.f66072d;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, countdownFragment, CountdownFragment.f66037a, false, 75327, new Class[]{Integer.TYPE, Integer.TYPE}, Float.TYPE)) {
            CountdownFragment countdownFragment2 = countdownFragment;
            f2 = ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, countdownFragment2, CountdownFragment.f66037a, false, 75327, new Class[]{Integer.TYPE, Integer.TYPE}, Float.TYPE)).floatValue();
        } else {
            f2 = Math.max(0.0f, ((((float) (i - i2)) * 1.0f) * ((float) countdownFragment.f66038b.getMeasuredWidth())) / ((float) countdownFragment.h));
        }
        countdownFragment.f66042f.setText(String.format("%ss", new Object[]{countdownFragment.b(((float) (i - i2)) / 1000.0f)}));
        countdownFragment.f66042f.setTranslationX((f2 / ((float) countdownFragment.f66038b.getMeasuredWidth())) * ((float) (countdownFragment.f66038b.getMeasuredWidth() - countdownFragment.f66042f.getMeasuredWidth())));
        countdownFragment.f66041e.setAlpha(countdownFragment.a(f2));
        countdownFragment.f66040d.setAlpha(countdownFragment.a(((float) countdownFragment.f66038b.getMeasuredWidth()) - f2));
    }
}
