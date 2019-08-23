package com.bytedance.scene.ui;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.bytedance.scene.c;
import com.bytedance.scene.g;
import com.bytedance.scene.navigation.e;
import java.util.HashSet;
import java.util.WeakHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<Fragment, HashSet<String>> f22216a = new WeakHashMap<>();

    static abstract class a implements c, g {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private e f22221a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        private c f22222b;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@NonNull e eVar) {
            this.f22221a = eVar;
            if (this.f22222b != null) {
                this.f22222b.a(eVar);
            }
        }
    }
}
