package com.mapbox.mapboxsdk;

import com.mapbox.mapboxsdk.log.Logger;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final a f26379a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f26380b;

    public abstract void a(String str);

    static {
        AnonymousClass1 r0 = new a() {
            public final void a(String str) {
                System.loadLibrary(str);
            }
        };
        f26379a = r0;
        f26380b = r0;
    }

    public static void a() {
        try {
            f26380b.a("mapbox-gl");
        } catch (UnsatisfiedLinkError e2) {
            Logger.e("Mbgl-LibraryLoader", "Failed to load native shared library.", e2);
            if (b.f26462a) {
                throw new c(String.format("%s - %s", new Object[]{"Failed to load native shared library.", e2}));
            }
        }
    }
}
