package com.ss.android.ugc.aweme.shortvideo.guide;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class ExtraParams implements Parcelable {
    public static final Parcelable.Creator<ExtraParams> CREATOR = new Parcelable.Creator<ExtraParams>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67967a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ExtraParams[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f67967a, false, 77433, new Class[]{Parcel.class}, ExtraParams.class)) {
                return new ExtraParams(parcel2);
            }
            return (ExtraParams) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f67967a, false, 77433, new Class[]{Parcel.class}, ExtraParams.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("gif_type")
    int gifType;
    @SerializedName("interaction_icon")
    String interactionIcon;
    @SerializedName("interaction_text")
    String interactionText;
    @SerializedName("interaction_type")
    int interactionType;
    @SerializedName("interaction_url")
    String interactionUrl;

    public int describeContents() {
        return 0;
    }

    public ExtraParams() {
    }

    public String getInteractionIcon() {
        return this.interactionIcon;
    }

    public String getInteractionText() {
        return this.interactionText;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public boolean isGifValid() {
        if (1 == this.gifType || 2 == this.gifType) {
            return true;
        }
        return false;
    }

    public boolean isUrlInteractionStickerValid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77431, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77431, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.interactionType != 1 || StringUtils.isEmpty(this.interactionText) || StringUtils.isEmpty(this.interactionUrl)) {
            return false;
        } else {
            return true;
        }
    }

    public void setInteractionIcon(String str) {
        this.interactionIcon = str;
    }

    public void setInteractionText(String str) {
        this.interactionText = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public ExtraParams(Parcel parcel) {
        this.gifType = parcel.readInt();
        this.interactionType = parcel.readInt();
        this.interactionText = parcel.readString();
        this.interactionIcon = parcel.readString();
        this.interactionUrl = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77432, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77432, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.gifType);
        parcel.writeInt(this.interactionType);
        parcel.writeString(this.interactionText);
        parcel.writeString(this.interactionIcon);
        parcel.writeString(this.interactionUrl);
    }
}
