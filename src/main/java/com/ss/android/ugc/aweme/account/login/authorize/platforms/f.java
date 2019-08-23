package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32162a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new f[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f32162a, false, 20182, new Class[]{Parcel.class}, f.class)) {
                return new f(parcel2);
            }
            return (f) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f32162a, false, 20182, new Class[]{Parcel.class}, f.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32156a;

    /* renamed from: b  reason: collision with root package name */
    public String f32157b;

    /* renamed from: c  reason: collision with root package name */
    public long f32158c;

    /* renamed from: d  reason: collision with root package name */
    public String f32159d;

    /* renamed from: e  reason: collision with root package name */
    public String f32160e;

    /* renamed from: f  reason: collision with root package name */
    public String f32161f;
    public int g;
    public String h;
    public String i;
    public String j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32163a;

        /* renamed from: b  reason: collision with root package name */
        private String f32164b = "";

        /* renamed from: c  reason: collision with root package name */
        private long f32165c;

        /* renamed from: d  reason: collision with root package name */
        private String f32166d = "";

        /* renamed from: e  reason: collision with root package name */
        private String f32167e = "";

        /* renamed from: f  reason: collision with root package name */
        private String f32168f = "";
        private String g = "";

        public final f a() {
            if (PatchProxy.isSupport(new Object[0], this, f32163a, false, 20183, new Class[0], f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[0], this, f32163a, false, 20183, new Class[0], f.class);
            } else if (!TextUtils.isEmpty(this.g)) {
                f fVar = new f(this.f32164b, this.f32165c, this.f32166d, this.f32167e, this.f32168f, (byte) 0);
                fVar.i = this.g;
                return fVar;
            } else {
                throw new IllegalStateException("platform cannot be null");
            }
        }

        public final a a(long j) {
            this.f32165c = j;
            return this;
        }

        public final a b(String str) {
            this.f32166d = str;
            return this;
        }

        public final a c(String str) {
            this.f32167e = str;
            return this;
        }

        public final a d(String str) {
            this.g = str;
            return this;
        }

        public final a a(String str) {
            this.f32164b = str;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f32156a, false, 20181, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f32156a, false, 20181, new Class[0], String.class);
        }
        return "ThirdPartyAuthInfo{token='" + this.f32157b + '\'' + ", expires=" + this.f32158c + ", uid='" + this.f32159d + '\'' + ", code='" + this.f32160e + '\'' + ", secret='" + this.f32161f + '\'' + ", verifyType=" + this.g + ", verifyTicket='" + this.h + '\'' + ", platform='" + this.i + '\'' + ", profileKey='" + this.j + '\'' + '}';
    }

    public f(Parcel parcel) {
        this.g = -1;
        this.h = "";
        this.i = "";
        this.j = "";
        this.f32157b = parcel.readString();
        this.f32158c = parcel.readLong();
        this.f32159d = parcel.readString();
        this.f32160e = parcel.readString();
        this.f32161f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f32156a, false, 20180, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f32156a, false, 20180, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.f32157b);
        parcel.writeLong(this.f32158c);
        parcel.writeString(this.f32159d);
        parcel.writeString(this.f32160e);
        parcel.writeString(this.f32161f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    private f(String str, long j2, String str2, String str3, String str4) {
        this.g = -1;
        this.h = "";
        this.i = "";
        this.j = "";
        this.f32157b = str;
        this.f32158c = j2;
        this.f32159d = str2;
        this.f32160e = str3;
        this.f32161f = str4;
    }

    /* synthetic */ f(String str, long j2, String str2, String str3, String str4, byte b2) {
        this(str, j2, str2, str3, str4);
    }
}
