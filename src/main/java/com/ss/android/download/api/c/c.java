package com.ss.android.download.api.c;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public Context f28467a;

    /* renamed from: b  reason: collision with root package name */
    public String f28468b;

    /* renamed from: c  reason: collision with root package name */
    public String f28469c;

    /* renamed from: d  reason: collision with root package name */
    public String f28470d;

    /* renamed from: e  reason: collision with root package name */
    public String f28471e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f28472f;
    public Drawable g;
    public b h;
    public View i;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f28473a;

        /* renamed from: b  reason: collision with root package name */
        public String f28474b;

        /* renamed from: c  reason: collision with root package name */
        public String f28475c;

        /* renamed from: d  reason: collision with root package name */
        public String f28476d;

        /* renamed from: e  reason: collision with root package name */
        public String f28477e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f28478f;
        public Drawable g;
        public b h;
        public View i;

        public final c a() {
            return new c(this, (byte) 0);
        }

        public final a a(Drawable drawable) {
            this.g = drawable;
            return this;
        }

        public final a b(String str) {
            this.f28475c = str;
            return this;
        }

        public final a c(String str) {
            this.f28476d = str;
            return this;
        }

        public final a d(String str) {
            this.f28477e = str;
            return this;
        }

        public a(Context context) {
            this.f28473a = context;
        }

        public final a a(b bVar) {
            this.h = bVar;
            return this;
        }

        public final a a(String str) {
            this.f28474b = str;
            return this;
        }

        public final a a(boolean z) {
            this.f28478f = z;
            return this;
        }
    }

    public interface b {
        void a(DialogInterface dialogInterface);

        void b(DialogInterface dialogInterface);

        void c(DialogInterface dialogInterface);
    }

    private c(a aVar) {
        this.f28472f = true;
        this.f28467a = aVar.f28473a;
        this.f28468b = aVar.f28474b;
        this.f28469c = aVar.f28475c;
        this.f28470d = aVar.f28476d;
        this.f28471e = aVar.f28477e;
        this.f28472f = aVar.f28478f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
