package com.bytedance.frameworks.plugin.component.broadcast;

import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new c[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f2185a = "";

    /* renamed from: b  reason: collision with root package name */
    public List<IntentFilter> f2186b = new ArrayList();

    public final int describeContents() {
        return 0;
    }

    public c(Parcel parcel) {
        this.f2185a = parcel.readString();
        parcel.readList(this.f2186b, IntentFilter.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2185a);
        parcel.writeList(this.f2186b);
    }

    public c(String str, List<IntentFilter> list) {
        if (!TextUtils.isEmpty(str)) {
            this.f2185a = str;
        }
        if (list.size() > 0) {
            this.f2186b = list;
        }
    }
}
