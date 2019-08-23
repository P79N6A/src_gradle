package com.ss.android.ugc.aweme.photomovie;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.edit.cover.a;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class PhotoMovieContextOld extends BaseShortVideoContext implements Parcelable {
    public static final Parcelable.Creator<PhotoMovieContext> CREATOR = new Parcelable.Creator<PhotoMovieContext>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58811a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PhotoMovieContext[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f58811a, false, 63923, new Class[]{Parcel.class}, PhotoMovieContext.class)) {
                return new PhotoMovieContext(parcel2);
            }
            return (PhotoMovieContext) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f58811a, false, 63923, new Class[]{Parcel.class}, PhotoMovieContext.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58805a;

    /* renamed from: b  reason: collision with root package name */
    public String f58806b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f58807c;

    /* renamed from: d  reason: collision with root package name */
    public String f58808d;

    /* renamed from: e  reason: collision with root package name */
    public List<e> f58809e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public int f58810f;
    public int g;
    public int h;
    public String i;
    public String j;
    public float k;
    public e l;
    public String m;
    public int n;
    public String o;

    @Retention(RetentionPolicy.SOURCE)
    public @interface From {
    }

    public interface a {
    }

    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f58805a, false, 63920, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f58805a, false, 63920, new Class[0], String.class);
        } else if (CollectionUtils.isEmpty(this.f58807c) || this.mVideoLength == 0) {
            return null;
        } else {
            return this.f58807c.get(new a.C0659a().a(this.f58807c.size(), this.k / ((((float) this.mVideoLength) * 1.0f) / 1000.0f)));
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f58805a, false, 63922, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f58805a, false, 63922, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f58806b);
        parcel.writeStringList(this.f58807c);
        parcel.writeString(this.o);
        parcel.writeString(this.f58808d);
        parcel.writeInt(this.f58810f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeFloat(this.k);
        parcel.writeSerializable(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
    }
}
