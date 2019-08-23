package com.ss.android.ugc.aweme.shortvideo.i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class i implements Parcelable, Serializable {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68209a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new i[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f68209a, false, 78304, new Class[]{Parcel.class}, i.class)) {
                return new i(parcel2);
            }
            return (i) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f68209a, false, 78304, new Class[]{Parcel.class}, i.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("non_reacted_video")
    public boolean nonReacted;
    @SerializedName("reaction_from_author")
    public User reactionFromAuthor;
    @SerializedName("reaction_from_id")
    public String reactionFromId;
    @SerializedName("reaction_origin_id")
    public String reactionOriginId;
    @SerializedName("reaction_view_id")
    public String reactionViewId;
    @SerializedName("react_shape")
    public m shape;
    @SerializedName("video_height")
    public int videoHeight;
    @SerializedName("video_path")
    public String videoPath;
    @SerializedName("video_width")
    public int videoWidth;
    @SerializedName("wav_path")
    public String wavPath;
    @SerializedName("react_shape_list")
    public List<k> windowInfoList = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public i() {
    }

    public boolean removeReactionWindowInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 78302, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 78302, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.windowInfoList.size() <= 0) {
            return false;
        } else {
            this.windowInfoList.remove(this.windowInfoList.size() - 1);
            return true;
        }
    }

    public void addReactionWindowInfo(k kVar) {
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, changeQuickRedirect, false, 78301, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, this, changeQuickRedirect, false, 78301, new Class[]{k.class}, Void.TYPE);
            return;
        }
        this.windowInfoList.add(kVar2);
    }

    public i(Parcel parcel) {
        boolean z;
        this.videoPath = parcel.readString();
        this.wavPath = parcel.readString();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.reactionViewId = parcel.readString();
        this.reactionOriginId = parcel.readString();
        this.reactionFromId = parcel.readString();
        this.reactionFromAuthor = (User) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.nonReacted = z;
        this.shape = (m) parcel.readSerializable();
        this.windowInfoList = parcel.createTypedArrayList(k.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 78303, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 78303, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.videoPath);
        parcel.writeString(this.wavPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.reactionViewId);
        parcel.writeString(this.reactionOriginId);
        parcel.writeString(this.reactionFromId);
        parcel.writeSerializable(this.reactionFromAuthor);
        parcel.writeByte(this.nonReacted ? (byte) 1 : 0);
        parcel.writeSerializable(this.shape);
        parcel.writeTypedList(this.windowInfoList);
    }
}
