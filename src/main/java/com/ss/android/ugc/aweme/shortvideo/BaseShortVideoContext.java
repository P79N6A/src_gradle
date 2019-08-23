package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.f;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;

@Keep
public abstract class BaseShortVideoContext implements Parcelable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<String> arTextList;
    private AVETParameter avetParameter;
    public List<c> challenges;
    public String city;
    public int commentSetting;
    public String commerceData;
    public f draftEditTransferModel;
    public String globalData;
    public int isPrivate;
    public String latitude;
    public String longitude;
    public boolean mIsFromDraft;
    public String mPropSource;
    public String mShootWay;
    public String mSyncPlatforms;
    public int mVideoLength;
    public String mainBusinessData;
    public ArrayList<String> messageBubbleTexts;
    public String poiData;
    public String poiId;
    public String poiName;
    public int reactDuetSetting;
    public String socialData;
    public List<AVTextExtraStruct> structList;
    public String techData;
    public String title;
    public String ugData;

    public int describeContents() {
        return 0;
    }

    public BaseShortVideoContext() {
    }

    public AVETParameter getAvetParameter() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73907, new Class[0], AVETParameter.class)) {
            return (AVETParameter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73907, new Class[0], AVETParameter.class);
        }
        if (this.avetParameter == null) {
            this.avetParameter = new AVETParameter();
        }
        return this.avetParameter;
    }

    public long getDraftCreateTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73909, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73909, new Class[0], Long.TYPE)).longValue();
        } else if (this.draftEditTransferModel != null) {
            return this.draftEditTransferModel.getCreateTime();
        } else {
            return 0;
        }
    }

    public String getDraftPrimaryKey() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73908, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73908, new Class[0], String.class);
        } else if (this.draftEditTransferModel != null) {
            return this.draftEditTransferModel.getPrimaryKey();
        } else {
            return null;
        }
    }

    public void setAvetParameter(AVETParameter aVETParameter) {
        this.avetParameter = aVETParameter;
    }

    public BaseShortVideoContext(Parcel parcel) {
        boolean z;
        this.challenges = new ArrayList();
        parcel.readList(this.challenges, c.class.getClassLoader());
        this.title = parcel.readString();
        this.structList = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.city = parcel.readString();
        this.longitude = parcel.readString();
        this.latitude = parcel.readString();
        this.isPrivate = parcel.readInt();
        this.poiId = parcel.readString();
        this.poiName = parcel.readString();
        this.mVideoLength = parcel.readInt();
        this.mSyncPlatforms = parcel.readString();
        this.mShootWay = parcel.readString();
        this.mPropSource = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsFromDraft = z;
        this.commentSetting = parcel.readInt();
        this.reactDuetSetting = parcel.readInt();
        this.mainBusinessData = parcel.readString();
        this.socialData = parcel.readString();
        this.poiData = parcel.readString();
        this.commerceData = parcel.readString();
        this.ugData = parcel.readString();
        this.techData = parcel.readString();
        this.globalData = parcel.readString();
        this.avetParameter = (AVETParameter) parcel.readSerializable();
        this.arTextList = parcel.createStringArrayList();
        this.messageBubbleTexts = parcel.createStringArrayList();
        this.draftEditTransferModel = (f) parcel.readParcelable(f.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 73906, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 73906, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeList(this.challenges);
        parcel.writeString(this.title);
        parcel.writeTypedList(this.structList);
        parcel.writeString(this.city);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        parcel.writeInt(this.isPrivate);
        parcel.writeString(this.poiId);
        parcel.writeString(this.poiName);
        parcel.writeInt(this.mVideoLength);
        parcel.writeString(this.mSyncPlatforms);
        parcel.writeString(this.mShootWay);
        parcel.writeString(this.mPropSource);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : 0);
        parcel.writeInt(this.commentSetting);
        parcel.writeInt(this.reactDuetSetting);
        parcel.writeString(this.mainBusinessData);
        parcel.writeString(this.socialData);
        parcel.writeString(this.poiData);
        parcel.writeString(this.commerceData);
        parcel.writeString(this.ugData);
        parcel.writeString(this.techData);
        parcel.writeString(this.globalData);
        parcel.writeSerializable(this.avetParameter);
        parcel.writeStringList(this.arTextList);
        parcel.writeStringList(this.messageBubbleTexts);
        parcel.writeParcelable(this.draftEditTransferModel, i);
    }
}
