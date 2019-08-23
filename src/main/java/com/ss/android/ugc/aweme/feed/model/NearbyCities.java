package com.ss.android.ugc.aweme.feed.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

@Keep
public class NearbyCities implements Parcelable {
    public static final Parcelable.Creator<NearbyCities> CREATOR = new Parcelable.Creator<NearbyCities>() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final NearbyCities[] newArray(int i) {
            return new NearbyCities[i];
        }

        public final NearbyCities createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 41464, new Class[]{Parcel.class}, NearbyCities.class)) {
                return new NearbyCities(parcel2);
            }
            return (NearbyCities) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 41464, new Class[]{Parcel.class}, NearbyCities.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<CityBean> all;
    public CityBean current;
    public List<CityBean> hot;
    public List<CityBean> old;

    @Keep
    public static class CityBean implements Parcelable, Comparable<CityBean> {
        public static final Parcelable.Creator<CityBean> CREATOR = new Parcelable.Creator<CityBean>() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final CityBean[] newArray(int i) {
                return new CityBean[i];
            }

            public final CityBean createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 41467, new Class[]{Parcel.class}, CityBean.class)) {
                    return new CityBean(parcel2);
                }
                return (CityBean) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 41467, new Class[]{Parcel.class}, CityBean.class);
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("ad_code")
        public String adCode;
        public String code;
        @SerializedName("code_local")
        public String codeLocal;
        @SerializedName("country")
        public String country;
        @SerializedName("country_code")
        public String countryCode;
        public String en;
        public String name;
        @SerializedName("name_en")
        public String nameEn;
        @SerializedName("show_name")
        public String showName;
        @SerializedName("show_type")
        public int showType;

        public int describeContents() {
            return 0;
        }

        public CityBean() {
        }

        public CityBean(Parcel parcel) {
            this.name = parcel.readString();
            this.code = parcel.readString();
            this.en = parcel.readString();
        }

        public int compareTo(@NonNull CityBean cityBean) {
            if (PatchProxy.isSupport(new Object[]{cityBean}, this, changeQuickRedirect, false, 41465, new Class[]{CityBean.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{cityBean}, this, changeQuickRedirect, false, 41465, new Class[]{CityBean.class}, Integer.TYPE)).intValue();
            } else if (TextUtils.isEmpty(this.en)) {
                return -1;
            } else {
                if (TextUtils.isEmpty(cityBean.en)) {
                    return 1;
                }
                return this.en.compareTo(cityBean.en);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 41466, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 41466, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            parcel.writeString(this.name);
            parcel.writeString(this.code);
            parcel.writeString(this.en);
        }
    }

    public int describeContents() {
        return 0;
    }

    public NearbyCities() {
    }

    public NearbyCities(Parcel parcel) {
        this.current = (CityBean) parcel.readParcelable(CityBean.class.getClassLoader());
        this.all = parcel.createTypedArrayList(CityBean.CREATOR);
        this.hot = parcel.createTypedArrayList(CityBean.CREATOR);
        this.old = parcel.createTypedArrayList(CityBean.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 41463, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 41463, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeParcelable(this.current, i);
        parcel.writeTypedList(this.all);
        parcel.writeTypedList(this.hot);
        parcel.writeTypedList(this.old);
    }
}
