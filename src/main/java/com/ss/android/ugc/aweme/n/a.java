package com.ss.android.ugc.aweme.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.Lists;
import com.google.common.collect.ap;
import com.google.common.collect.cg;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class a implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56809a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f56809a, false, 54484, new Class[]{Parcel.class}, a.class)) {
                return new a(parcel2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f56809a, false, 54484, new Class[]{Parcel.class}, a.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("sticker_dir")
    public String infoStickerDraftDir;
    @SerializedName("stickers")
    public List<b> stickers;

    public int describeContents() {
        return 0;
    }

    public a clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54483, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54483, new Class[0], a.class);
        }
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String getInfoStickerIds() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54479, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54479, new Class[0], String.class);
        } else if (Lists.isEmpty(this.stickers)) {
            return "";
        } else {
            cg it2 = ap.copyOf((Iterable<? extends E>) this.stickers).iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(((b) it2.next()).stickerId);
                if (!it2.hasNext()) {
                    return sb.toString();
                }
                sb.append(',');
            }
        }
    }

    public String getOtherEffect() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54480, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54480, new Class[0], String.class);
        } else if (Lists.isEmpty(this.stickers)) {
            return "[]";
        } else {
            cg it2 = ap.copyOf((Iterable<? extends E>) this.stickers).iterator();
            JSONArray jSONArray = new JSONArray();
            while (it2.hasNext()) {
                try {
                    b bVar = (b) it2.next();
                    if (bVar.type == 10) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", bVar.stickerId);
                        jSONObject.put("type", "giphy");
                        jSONArray.put(jSONObject);
                    }
                } catch (Exception unused) {
                }
            }
            return jSONArray.toString();
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54477, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54477, new Class[0], String.class);
        }
        return "InfoStickerModel{infoStickerDraftDir='" + this.infoStickerDraftDir + '\'' + ", stickers=" + this.stickers + '}';
    }

    public a(Parcel parcel) {
        this.infoStickerDraftDir = parcel.readString();
        this.stickers = parcel.createTypedArrayList(b.CREATOR);
    }

    public a(String str) {
        this.infoStickerDraftDir = str + File.separator + "stickers";
        this.stickers = new ArrayList();
    }

    public void addSticker(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, changeQuickRedirect, false, 54481, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, changeQuickRedirect, false, 54481, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.stickers.add(bVar2);
    }

    public void removeSticker(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, changeQuickRedirect, false, 54482, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, changeQuickRedirect, false, 54482, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.stickers.remove(bVar2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 54478, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 54478, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.infoStickerDraftDir);
        parcel.writeTypedList(this.stickers);
    }
}
