package com.ss.android.ugc.aweme.sticker.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

@Keep
public class InteractStickerStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String attr;
    public int index;
    @SerializedName("poi_info")
    public PoiStruct poiStruct;
    @SerializedName("track_info")
    public String trackList;
    public int type;
    @SerializedName("vote_info")
    public VoteStruct voteStruct;

    public String getAttr() {
        return this.attr;
    }

    public int getIndex() {
        return this.index;
    }

    public PoiStruct getPoiStruct() {
        return this.poiStruct;
    }

    public String getTrackList() {
        return this.trackList;
    }

    public int getType() {
        return this.type;
    }

    public VoteStruct getVoteStruct() {
        return this.voteStruct;
    }

    public int hashCode() {
        return this.index * 31;
    }

    public boolean isPoiSticker() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public void setAttr(String str) {
        this.attr = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setPoiStruct(PoiStruct poiStruct2) {
        this.poiStruct = poiStruct2;
    }

    public void setTrackList(String str) {
        this.trackList = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVoteStruct(VoteStruct voteStruct2) {
        this.voteStruct = voteStruct2;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 81964, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 81964, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
            if (this.type != interactStickerStruct.type || this.index != interactStickerStruct.index) {
                return false;
            }
            if (this.poiStruct == null ? interactStickerStruct.poiStruct != null : !this.poiStruct.equals(interactStickerStruct.poiStruct)) {
                return false;
            }
            if (this.trackList == null ? interactStickerStruct.trackList != null : !this.trackList.equals(interactStickerStruct.trackList)) {
                return false;
            }
            if (this.voteStruct == null ? interactStickerStruct.voteStruct != null : !this.voteStruct.equals(interactStickerStruct.voteStruct)) {
                return false;
            }
            if (this.attr != null) {
                return this.attr.equals(interactStickerStruct.attr);
            }
            if (interactStickerStruct.attr == null) {
                return true;
            }
            return false;
        }
    }
}
