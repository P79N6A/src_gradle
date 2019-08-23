package com.bytedance.scene;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.bytedance.scene.navigation.e;

public final class b implements c, g {

    /* renamed from: a  reason: collision with root package name */
    private Activity f22066a;

    /* renamed from: b  reason: collision with root package name */
    private a f22067b;

    /* renamed from: c  reason: collision with root package name */
    private e f22068c;

    /* renamed from: d  reason: collision with root package name */
    private c f22069d;

    public final boolean a() {
        e eVar = this.f22067b.f21972a;
        if (eVar == null || !eVar.b()) {
            return false;
        }
        return true;
    }

    public final void a(@NonNull e eVar) {
        this.f22068c = eVar;
        if (this.f22069d != null) {
            this.f22069d.a(eVar);
        }
    }

    b(@NonNull Activity activity, @NonNull a aVar) {
        this.f22066a = activity;
        this.f22067b = aVar;
    }
}
