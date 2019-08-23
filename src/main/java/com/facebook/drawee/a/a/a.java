package com.facebook.drawee.a.a;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.BaseControllerListener;
import javax.annotation.Nullable;

public final class a extends BaseControllerListener {

    /* renamed from: a  reason: collision with root package name */
    private long f23624a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f23625b = -1;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private b f23626c;

    public a(@Nullable b bVar) {
        this.f23626c = bVar;
    }

    public final void onSubmit(String str, Object obj) {
        this.f23624a = System.currentTimeMillis();
    }

    public final void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        this.f23625b = System.currentTimeMillis();
        if (this.f23626c != null) {
            this.f23626c.a(this.f23625b - this.f23624a);
        }
    }
}
