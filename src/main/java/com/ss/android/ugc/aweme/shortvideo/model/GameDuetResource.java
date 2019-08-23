package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

public class GameDuetResource implements Parcelable {
    public static final Parcelable.Creator<GameDuetResource> CREATOR = new Parcelable.Creator<GameDuetResource>() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final GameDuetResource[] newArray(int i) {
            return new GameDuetResource[i];
        }

        public final GameDuetResource createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 77636, new Class[]{Parcel.class}, GameDuetResource.class)) {
                return new GameDuetResource(parcel2);
            }
            return (GameDuetResource) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 77636, new Class[]{Parcel.class}, GameDuetResource.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public int gameScore;
    public FaceStickerBean gameSticker;

    public int describeContents() {
        return 0;
    }

    public GameDuetResource(Parcel parcel) {
        this.gameScore = parcel.readInt();
        this.gameSticker = (FaceStickerBean) parcel.readParcelable(FaceStickerBean.class.getClassLoader());
    }

    public GameDuetResource(int i, FaceStickerBean faceStickerBean) {
        this.gameScore = i;
        this.gameSticker = faceStickerBean;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77635, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77635, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.gameScore);
        parcel.writeParcelable(this.gameSticker, i);
    }
}
