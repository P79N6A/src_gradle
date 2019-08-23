package com.bytedance.scene.navigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.scene.e;

public class g {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final String f22185a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f22186b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22187c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22188d;

    /* renamed from: e  reason: collision with root package name */
    public int f22189e;

    @NonNull
    public final Bundle a() {
        if (!TextUtils.isEmpty(this.f22185a)) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_rootScene", this.f22185a);
            bundle.putBundle("extra_rootScene_arguments", this.f22186b);
            bundle.putBoolean("extra_drawWindowBackground", this.f22187c);
            bundle.putBoolean("extra_fixSceneBackground_enabled", this.f22188d);
            bundle.putInt("extra_sceneBackground", this.f22189e);
            return bundle;
        }
        throw new IllegalArgumentException("call setRootScene first");
    }

    @NonNull
    public final g a(boolean z) {
        this.f22187c = false;
        return this;
    }

    @NonNull
    public final g b(boolean z) {
        this.f22188d = false;
        return this;
    }

    public g(@NonNull Class<? extends e> cls) {
        this(cls, (Bundle) null);
    }

    g(@NonNull String str, @Nullable Bundle bundle) {
        this.f22187c = true;
        this.f22188d = true;
        this.f22185a = str;
        this.f22186b = bundle;
    }

    public g(@NonNull Class<? extends e> cls, @Nullable Bundle bundle) {
        this.f22187c = true;
        this.f22188d = true;
        if (!cls.isAssignableFrom(e.class)) {
            this.f22185a = cls.getName();
            this.f22186b = bundle;
            return;
        }
        throw new IllegalArgumentException("cant use NavigationScene as root scene");
    }
}
