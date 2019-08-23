package com.zhihu.matisse.internal.entity;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import com.zhihu.matisse.b;

public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new c[i];
        }

        @Nullable
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new c(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final long f82641a;

    /* renamed from: b  reason: collision with root package name */
    public final String f82642b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f82643c;

    /* renamed from: d  reason: collision with root package name */
    public final long f82644d;

    /* renamed from: e  reason: collision with root package name */
    public final long f82645e;

    public int describeContents() {
        return 0;
    }

    public final boolean b() {
        if (this.f82642b == null) {
            return false;
        }
        return this.f82642b.equals(b.GIF.toString());
    }

    public int hashCode() {
        int hashCode = Long.valueOf(this.f82641a).hashCode() + 31;
        if (this.f82642b != null) {
            hashCode = (hashCode * 31) + this.f82642b.hashCode();
        }
        return (((((hashCode * 31) + this.f82643c.hashCode()) * 31) + Long.valueOf(this.f82644d).hashCode()) * 31) + Long.valueOf(this.f82645e).hashCode();
    }

    public final boolean a() {
        if (this.f82642b == null) {
            return false;
        }
        if (this.f82642b.equals(b.JPEG.toString()) || this.f82642b.equals(b.PNG.toString()) || this.f82642b.equals(b.GIF.toString()) || this.f82642b.equals(b.BMP.toString()) || this.f82642b.equals(b.WEBP.toString())) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f82642b == null) {
            return false;
        }
        if (this.f82642b.equals(b.MPEG.toString()) || this.f82642b.equals(b.MP4.toString()) || this.f82642b.equals(b.QUICKTIME.toString()) || this.f82642b.equals(b.THREEGPP.toString()) || this.f82642b.equals(b.THREEGPP2.toString()) || this.f82642b.equals(b.MKV.toString()) || this.f82642b.equals(b.WEBM.toString()) || this.f82642b.equals(b.TS.toString()) || this.f82642b.equals(b.AVI.toString())) {
            return true;
        }
        return false;
    }

    public static c a(Cursor cursor) {
        c cVar = new c(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("mime_type")), cursor.getLong(cursor.getColumnIndex("_size")), cursor.getLong(cursor.getColumnIndex("duration")));
        return cVar;
    }

    private c(Parcel parcel) {
        this.f82641a = parcel.readLong();
        this.f82642b = parcel.readString();
        this.f82643c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f82644d = parcel.readLong();
        this.f82645e = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f82641a != cVar.f82641a || (((this.f82642b == null || !this.f82642b.equals(cVar.f82642b)) && (this.f82642b != null || cVar.f82642b != null)) || (((this.f82643c == null || !this.f82643c.equals(cVar.f82643c)) && (this.f82643c != null || cVar.f82643c != null)) || this.f82644d != cVar.f82644d || this.f82645e != cVar.f82645e))) {
            return false;
        }
        return true;
    }

    /* synthetic */ c(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f82641a);
        parcel.writeString(this.f82642b);
        parcel.writeParcelable(this.f82643c, 0);
        parcel.writeLong(this.f82644d);
        parcel.writeLong(this.f82645e);
    }

    private c(long j, String str, long j2, long j3) {
        Uri uri;
        this.f82641a = j;
        this.f82642b = str;
        if (a()) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (c()) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Files.getContentUri("external");
        }
        this.f82643c = ContentUris.withAppendedId(uri, j);
        this.f82644d = j2;
        this.f82645e = j3;
    }
}
