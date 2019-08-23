package com.ss.android.ugc.aweme.filter;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;

public interface at {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47522a;

        /* renamed from: b  reason: collision with root package name */
        public ad f47523b;

        public final at a() {
            if (!PatchProxy.isSupport(new Object[0], this, f47522a, false, 44417, new Class[0], at.class)) {
                return new FilterViewImpl(this.f47523b);
            }
            return (at) PatchProxy.accessDispatch(new Object[0], this, f47522a, false, 44417, new Class[0], at.class);
        }

        public final a a(@NonNull e eVar) {
            this.f47523b.f47479e = eVar;
            return this;
        }

        public final a a(@Nullable as asVar) {
            this.f47523b.k = asVar;
            return this;
        }

        public final a a(@NonNull d dVar) {
            this.f47523b.f47478d = dVar;
            return this;
        }

        public final a a(@Nullable AVETParameter aVETParameter) {
            this.f47523b.p = aVETParameter;
            return this;
        }

        public final a a(boolean z) {
            this.f47523b.g = z;
            return this;
        }

        public a(@NonNull AppCompatActivity appCompatActivity, @NonNull FrameLayout frameLayout) {
            this.f47523b = new ad(appCompatActivity);
            this.f47523b.f47476b = frameLayout;
        }

        public a(@NonNull AppCompatActivity appCompatActivity, @NonNull FrameLayout frameLayout, FrameLayout frameLayout2) {
            this.f47523b = new ad(appCompatActivity);
            this.f47523b.f47476b = frameLayout;
            this.f47523b.f47477c = frameLayout2;
        }
    }

    public interface b {
        void a(@IntRange(from = 0, to = 100) int i);

        void b(@IntRange(from = 0, to = 100) int i);

        void c(@IntRange(from = 0, to = 100) int i);

        void d(@IntRange(from = 0, to = 100) int i);

        void e(@IntRange(from = 0, to = 100) int i);

        void f(@IntRange(from = 0, to = 100) int i);
    }

    public interface c {
        void a(int i);
    }

    public interface d {
        void a(@Nullable h hVar);

        void b(@Nullable h hVar);

        void c(@NonNull h hVar);
    }

    void a();

    void a(h hVar);
}
