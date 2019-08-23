package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.d;
import com.facebook.cache.common.e;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.j;
import java.io.File;
import javax.annotation.Nullable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f23449a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23450b;

    /* renamed from: c  reason: collision with root package name */
    public final Supplier<File> f23451c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23452d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23453e;

    /* renamed from: f  reason: collision with root package name */
    public final long f23454f;
    public final g g;
    public final com.facebook.cache.common.a h;
    public final CacheEventListener i;
    public final com.facebook.common.a.a j;
    public final Context k;
    public final boolean l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23455a;

        /* renamed from: b  reason: collision with root package name */
        public String f23456b;

        /* renamed from: c  reason: collision with root package name */
        public Supplier<File> f23457c;

        /* renamed from: d  reason: collision with root package name */
        public long f23458d;

        /* renamed from: e  reason: collision with root package name */
        public long f23459e;

        /* renamed from: f  reason: collision with root package name */
        public long f23460f;
        public g g;
        public com.facebook.cache.common.a h;
        public CacheEventListener i;
        public com.facebook.common.a.a j;
        public boolean k;
        @Nullable
        public final Context l;

        public final b a() {
            boolean z;
            if (this.f23457c == null && this.l == null) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkState(z, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f23457c == null && this.l != null) {
                this.f23457c = new Supplier<File>() {
                    public final /* synthetic */ Object get() {
                        return a.this.l.getApplicationContext().getCacheDir();
                    }
                };
            }
            return new b(this, (byte) 0);
        }

        public final a a(com.facebook.common.a.a aVar) {
            this.j = aVar;
            return this;
        }

        public final a a(File file) {
            this.f23457c = j.a(file);
            return this;
        }

        public final a a(String str) {
            this.f23456b = str;
            return this;
        }

        private a(@Nullable Context context) {
            this.f23455a = 1;
            this.f23456b = "image_cache";
            this.f23458d = 41943040;
            this.f23459e = 10485760;
            this.f23460f = 2097152;
            this.g = new a();
            this.l = context;
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }

    public static a a(@Nullable Context context) {
        return new a(context, (byte) 0);
    }

    private b(a aVar) {
        com.facebook.cache.common.a aVar2;
        CacheEventListener cacheEventListener;
        com.facebook.common.a.a aVar3;
        this.f23449a = aVar.f23455a;
        this.f23450b = (String) Preconditions.checkNotNull(aVar.f23456b);
        this.f23451c = (Supplier) Preconditions.checkNotNull(aVar.f23457c);
        this.f23452d = aVar.f23458d;
        this.f23453e = aVar.f23459e;
        this.f23454f = aVar.f23460f;
        this.g = (g) Preconditions.checkNotNull(aVar.g);
        if (aVar.h == null) {
            aVar2 = d.a();
        } else {
            aVar2 = aVar.h;
        }
        this.h = aVar2;
        if (aVar.i == null) {
            cacheEventListener = e.a();
        } else {
            cacheEventListener = aVar.i;
        }
        this.i = cacheEventListener;
        if (aVar.j == null) {
            aVar3 = com.facebook.common.a.b.a();
        } else {
            aVar3 = aVar.j;
        }
        this.j = aVar3;
        this.k = aVar.l;
        this.l = aVar.k;
    }

    /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }
}
