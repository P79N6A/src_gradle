package com.facebook.drawee.b;

import android.content.Context;
import android.view.ViewConfiguration;
import com.facebook.common.internal.VisibleForTesting;

public final class a {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    public C0260a f23627a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final float f23628b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    public boolean f23629c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    public boolean f23630d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    public long f23631e;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    public float f23632f;
    @VisibleForTesting
    public float g;

    /* renamed from: com.facebook.drawee.b.a$a  reason: collision with other inner class name */
    public interface C0260a {
        boolean onClick();
    }

    public final void a() {
        this.f23627a = null;
        b();
    }

    public final void b() {
        this.f23629c = false;
        this.f23630d = false;
    }

    public a(Context context) {
        this.f23628b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }
}
