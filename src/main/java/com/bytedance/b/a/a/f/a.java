package com.bytedance.b.a.a.f;

import android.content.Context;
import com.bytedance.b.a.a.d.a;

public final class a {
    public int A = 3;

    /* renamed from: a  reason: collision with root package name */
    public Context f19193a;

    /* renamed from: b  reason: collision with root package name */
    public e f19194b = e.AGORA;

    /* renamed from: c  reason: collision with root package name */
    public f f19195c = f.f19200b;

    /* renamed from: d  reason: collision with root package name */
    public long f19196d;

    /* renamed from: e  reason: collision with root package name */
    public int f19197e;

    /* renamed from: f  reason: collision with root package name */
    public String f19198f;
    public String g;
    public String h;
    public long i;
    public byte[] j;
    public String k;
    public String l;
    public String m;
    public c n = c.TEXTURE_2D;
    public C0147a o = C0147a.AUDIO_PROFILE_LC;
    public b p = b.GUEST;
    public boolean q;
    public String r = "#000000";
    public int s;
    public int t;
    public boolean u;
    public int v = 900;
    public String w;
    public int x;
    public d y = d.VIDEO;
    public int z = 2;

    /* renamed from: com.bytedance.b.a.a.f.a$a  reason: collision with other inner class name */
    public enum C0147a {
        AUDIO_PROFILE_LC(0, 1, a.b.C0146a.LC),
        AUDIO_PROFILE_HE(1, 0, a.b.C0146a.HEV1);
        
        private int mAgoraAudioProfile;
        private a.b.C0146a mByteAudiProfile;
        private int mZegoAudioProfile;

        public final int getAgoraAudioProfile() {
            return this.mAgoraAudioProfile;
        }

        public final a.b.C0146a getByteAudioProfile() {
            return this.mByteAudiProfile;
        }

        public final int getZegoAudioProfile() {
            return this.mZegoAudioProfile;
        }

        private C0147a(int i, int i2) {
            this.mByteAudiProfile = a.b.C0146a.LC;
            this.mAgoraAudioProfile = i;
            this.mZegoAudioProfile = i2;
        }

        private C0147a(int i, int i2, a.b.C0146a aVar) {
            this.mByteAudiProfile = a.b.C0146a.LC;
            this.mAgoraAudioProfile = i;
            this.mZegoAudioProfile = i2;
            this.mByteAudiProfile = aVar;
        }
    }

    public enum b {
        ANCHOR,
        GUEST
    }

    public enum c {
        TEXTURE_2D(a.C0145a.FORMAT_TEXTURE_2D, a.c.PIXEL_BUFFER_TYPE_GL_TEXTURE_2D),
        TEXTURE_OES(a.C0145a.FORMAT_TEXTURE_OES, a.c.PIXEL_BUFFER_TYPE_SURFACE_TEXTURE);
        
        private a.C0145a mAgoraFormat;
        private a.c mZegoFromat;

        public final a.C0145a getAgoraFormat() {
            return this.mAgoraFormat;
        }

        public final a.c getZegoFromat() {
            return this.mZegoFromat;
        }

        private c(a.C0145a aVar, a.c cVar) {
            this.mAgoraFormat = aVar;
            this.mZegoFromat = cVar;
        }
    }

    public enum d {
        AUDIO,
        VIDEO
    }

    public enum e {
        AGORA,
        ZEGO,
        BYTE
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f19199a = new f(16, 16, 15, 50);

        /* renamed from: b  reason: collision with root package name */
        public static final f f19200b = new f(180, 240, 15, 240);

        /* renamed from: c  reason: collision with root package name */
        public static final f f19201c = new f(240, 320, 15, 360);

        /* renamed from: d  reason: collision with root package name */
        public static final f f19202d = new f(360, 640, 15, 800);

        /* renamed from: e  reason: collision with root package name */
        public static final f f19203e = new f(480, 848, 15, 1200);

        /* renamed from: f  reason: collision with root package name */
        public int f19204f;
        public int g;
        public int h = 15;
        public int i;

        private f(int i2, int i3, int i4, int i5) {
            this.f19204f = i2;
            this.g = i3;
            this.i = i5;
        }
    }

    public final a a(byte[] bArr) {
        this.j = bArr;
        return this;
    }

    public final a a(int i2) {
        this.f19197e = i2;
        return this;
    }

    public final a b(int i2) {
        this.s = i2;
        return this;
    }

    public final a c(int i2) {
        this.x = i2;
        return this;
    }

    public final a d(String str) {
        this.k = str;
        return this;
    }

    public final a e(String str) {
        this.l = str;
        return this;
    }

    public final a f(String str) {
        this.m = str;
        return this;
    }

    public final a g(String str) {
        this.r = str;
        return this;
    }

    public final a a(long j2) {
        this.f19196d = j2;
        return this;
    }

    public final a b(long j2) {
        this.i = j2;
        return this;
    }

    public final a c(String str) {
        this.h = str;
        return this;
    }

    public final a a(Context context) {
        this.f19193a = context;
        return this;
    }

    public final a b(String str) {
        this.g = str;
        return this;
    }

    public final a a(C0147a aVar) {
        this.o = aVar;
        return this;
    }

    public final a a(b bVar) {
        this.p = bVar;
        return this;
    }

    public final a a(c cVar) {
        this.n = cVar;
        return this;
    }

    public final a a(d dVar) {
        this.y = dVar;
        return this;
    }

    public final a a(e eVar) {
        this.f19194b = eVar;
        return this;
    }

    public final a a(f fVar) {
        this.f19195c = fVar;
        return this;
    }

    public final a a(String str) {
        this.f19198f = str;
        return this;
    }
}
