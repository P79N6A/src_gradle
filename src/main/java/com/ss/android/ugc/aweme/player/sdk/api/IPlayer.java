package com.ss.android.ugc.aweme.player.sdk.api;

import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.util.Map;

public interface IPlayer {

    public @interface CodecName {
    }

    public @interface ImageLayout {
    }

    public @interface PlayInfo {
    }

    public @interface TTEngineType {
    }

    public static class a implements c {
        public final void a() {
        }

        public final void a(int i, int i2, Object obj) {
        }

        public final void a(boolean z) {
        }

        public final void b() {
        }

        public final void c() {
        }
    }

    public interface b {
        boolean a(Surface surface);
    }

    public interface c {
        void a();

        void a(int i, int i2, Object obj);

        void a(boolean z);

        void b();

        void c();
    }

    public static class d {
        @CodecName

        /* renamed from: a  reason: collision with root package name */
        public volatile int f59113a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f59114b;

        /* renamed from: c  reason: collision with root package name */
        public volatile int f59115c;

        /* renamed from: d  reason: collision with root package name */
        public volatile int f59116d;
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f59117a;

        /* renamed from: b  reason: collision with root package name */
        public Bundle f59118b;
    }

    float a(@PlayInfo int i);

    void a();

    void a(float f2);

    void a(float f2, float f3);

    void a(long j);

    void a(Surface surface);

    void a(b bVar);

    void a(c cVar);

    void a(d dVar);

    void a(com.ss.android.ugc.playerkit.a.a aVar);

    void a(String str, a aVar);

    void a(String str, Map<String, Object> map) throws IOException;

    void a(boolean z);

    void b();

    void b(Surface surface);

    boolean b(boolean z);

    void c();

    void d();

    void e();

    boolean f();

    boolean g();

    boolean h();

    void i();

    boolean j();

    boolean k();

    long l();

    long m();

    String n();

    String o();

    e p();

    d q();
}
