package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.ss.android.ugc.aweme.C0906R;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        @Nullable
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final String f82633a = "-1";

    /* renamed from: b  reason: collision with root package name */
    public final String f82634b;

    /* renamed from: c  reason: collision with root package name */
    public final String f82635c;

    /* renamed from: d  reason: collision with root package name */
    public long f82636d;

    /* renamed from: e  reason: collision with root package name */
    private final String f82637e;

    public final int describeContents() {
        return 0;
    }

    public final void a() {
        this.f82636d++;
    }

    public final boolean b() {
        return f82633a.equals(this.f82634b);
    }

    public final boolean c() {
        if (this.f82636d == 0) {
            return true;
        }
        return false;
    }

    a(Parcel parcel) {
        this.f82634b = parcel.readString();
        this.f82635c = parcel.readString();
        this.f82637e = parcel.readString();
        this.f82636d = parcel.readLong();
    }

    public final String a(Context context) {
        if (b()) {
            return context.getString(C0906R.string.ba6);
        }
        return this.f82637e;
    }

    public static a a(Cursor cursor) {
        a aVar = new a(cursor.getString(cursor.getColumnIndex("bucket_id")), cursor.getString(cursor.getColumnIndex("_data")), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex("count")));
        return aVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f82634b);
        parcel.writeString(this.f82635c);
        parcel.writeString(this.f82637e);
        parcel.writeLong(this.f82636d);
    }

    private a(String str, String str2, String str3, long j) {
        this.f82634b = str;
        this.f82635c = str2;
        this.f82637e = str3;
        this.f82636d = j;
    }
}
