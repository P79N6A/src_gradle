package com.bytedance.android.livesdkapi.depend.h;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportReason;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18666a;
    public List<ReportReason> A;
    public Room B;

    /* renamed from: b  reason: collision with root package name */
    public String f18667b;

    /* renamed from: c  reason: collision with root package name */
    public long f18668c;

    /* renamed from: d  reason: collision with root package name */
    public long f18669d;

    /* renamed from: e  reason: collision with root package name */
    public long f18670e;

    /* renamed from: f  reason: collision with root package name */
    public String f18671f;
    public String g;
    public long h;
    public String i;
    public ImageModel j;
    public ImageModel k;
    public ImageModel l;
    public ImageModel m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public boolean t;
    public String u;
    public String v;
    public com.bytedance.android.live.base.model.c.a w;
    public Map<String, String> x;
    public long y;
    public long z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18672a;
        public Room A;
        public Map<String, String> B;

        /* renamed from: b  reason: collision with root package name */
        public String f18673b;

        /* renamed from: c  reason: collision with root package name */
        public long f18674c;

        /* renamed from: d  reason: collision with root package name */
        public long f18675d;

        /* renamed from: e  reason: collision with root package name */
        public String f18676e;

        /* renamed from: f  reason: collision with root package name */
        public long f18677f;
        public long g;
        public String h;
        public String i;
        public ImageModel j;
        public ImageModel k;
        public ImageModel l;
        public ImageModel m;
        public String n;
        public String o;
        public String p;
        public String q;
        public String r;
        public String s;
        public boolean t;
        public String u;
        public String v;
        public long w;
        public long x;
        public com.bytedance.android.live.base.model.c.a y;
        public List<ReportReason> z;

        private a() {
            this.o = "";
            this.p = "";
            this.q = "";
            this.r = "";
            this.s = "";
        }

        public final b a() {
            if (!PatchProxy.isSupport(new Object[0], this, f18672a, false, 15053, new Class[0], b.class)) {
                return new b(this, (byte) 0);
            }
            return (b) PatchProxy.accessDispatch(new Object[0], this, f18672a, false, 15053, new Class[0], b.class);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(long j2) {
            this.f18677f = j2;
            return this;
        }

        public final a b(String str) {
            this.r = str;
            return this;
        }

        public final a c(String str) {
            this.o = str;
            return this;
        }

        public final a d(String str) {
            this.s = str;
            return this;
        }

        public final a e(String str) {
            this.v = str;
            return this;
        }

        public final a f(String str) {
            this.f18673b = str;
            return this;
        }

        public final a a(com.bytedance.android.live.base.model.c.a aVar) {
            this.y = aVar;
            return this;
        }

        public final a a(String str) {
            this.q = str;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.B = map;
            return this;
        }

        public final a a(boolean z2) {
            this.t = z2;
            return this;
        }

        private a(Room room) {
            this.o = "";
            this.p = "";
            this.q = "";
            this.r = "";
            this.s = "";
            this.f18674c = room.getId();
            this.f18675d = room.getOwner().getId();
            this.i = room.getOwner().getIdStr();
            this.f18676e = room.getOwner().getEncryptedId();
            this.g = room.getOwner().getShortId();
            this.j = room.getOwner().getAvatarThumb();
            this.k = room.getOwner().getAvatarMedium();
            this.l = room.getOwner().getAvatarLarge();
            this.m = room.getCover();
            this.n = room.getOwner().getNickName();
            this.u = room.getRequestId();
            this.o = room.getShareUrl();
            this.p = room.getTitle();
            this.A = room;
            this.h = room.getOwner().displayId;
        }

        /* synthetic */ a(Room room, byte b2) {
            this(room);
        }

        private a(long j2, long j3) {
            this.o = "";
            this.p = "";
            this.q = "";
            this.r = "";
            this.s = "";
            this.w = j2;
            this.x = j3;
        }

        public /* synthetic */ a(long j2, long j3, byte b2) {
            this(j2, j3);
        }
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f18666a, true, 15047, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f18666a, true, 15047, new Class[0], a.class);
        }
        return new a((byte) 0);
    }

    private b(a aVar) {
        this.f18667b = aVar.f18673b;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.o = aVar.o;
        this.s = aVar.s;
        this.f18669d = aVar.f18674c;
        this.f18670e = aVar.f18675d;
        this.f18668c = aVar.f18677f;
        this.f18671f = aVar.i;
        this.h = aVar.g;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
        this.A = aVar.z;
        this.B = aVar.A;
        this.x = aVar.B;
        this.i = aVar.h;
        this.y = aVar.w;
        this.z = aVar.x;
        this.g = aVar.f18676e;
        this.w = aVar.y;
    }

    public static a a(Room room) {
        Room room2 = room;
        if (!PatchProxy.isSupport(new Object[]{room2}, null, f18666a, true, 15048, new Class[]{Room.class}, a.class)) {
            return new a(room2, (byte) 0);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{room2}, null, f18666a, true, 15048, new Class[]{Room.class}, a.class);
    }

    /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }
}
