package com.ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.ui.z;
import com.ss.android.ugc.aweme.sticker.Sticker;
import java.util.ArrayList;
import java.util.List;

@Keep
public class FaceStickerBean implements Parcelable {
    public static final Parcelable.Creator<FaceStickerBean> CREATOR = new Parcelable.Creator<FaceStickerBean>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71639a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FaceStickerBean[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f71639a, false, 81977, new Class[]{Parcel.class}, FaceStickerBean.class)) {
                return new FaceStickerBean(parcel2);
            }
            return (FaceStickerBean) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f71639a, false, 81977, new Class[]{Parcel.class}, FaceStickerBean.class);
        }
    };
    public static final FaceStickerBean NONE = new FaceStickerBean();
    public static ChangeQuickRedirect changeQuickRedirect;
    public static String sCurPropSource;
    @SerializedName("ad_raw_data")
    private String adRawData;
    @SerializedName("children")
    List<String> children;
    @SerializedName("designer_id")
    private String designerId;
    @SerializedName("effect_type")
    int effectType;
    @SerializedName("extra")
    private String extra;
    @Nullable
    c faceStickerCommerceBean;
    @SerializedName("file_url")
    UrlModel fileUrl;
    @SerializedName("hint")
    String hint;
    @SerializedName("hint_icon")
    UrlModel hintIcon;
    @SerializedName("icon_url")
    UrlModel iconUrl;
    @SerializedName("id")
    int id;
    @SerializedName("is_busi")
    private boolean isBusi;
    public boolean isSelected;
    public String mLocalPath;
    List<String> musicIds;
    @SerializedName("name")
    String name;
    @SerializedName("parent")
    String parentId;
    String propSource;
    @SerializedName("schema")
    private String schema;
    @SerializedName("sdk_extra")
    private String sdkExtra;
    @SerializedName("source")
    private int source;
    @SerializedName("sticker_id")
    long stickerId;
    private z stickerPoi;
    List<String> tags;
    @SerializedName("type")
    @Sticker.StickerType
    @Deprecated
    long type;
    List<String> types;
    @SerializedName("usage_scenario")
    int usageScenario;

    public int describeContents() {
        return 0;
    }

    public long getId() {
        return (long) this.id;
    }

    public FaceStickerBean() {
    }

    public String getAdRawData() {
        return this.adRawData;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public String getDesignerId() {
        return this.designerId;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public String getExtra() {
        return this.extra;
    }

    @Nullable
    public c getFaceStickerCommerceBean() {
        return this.faceStickerCommerceBean;
    }

    public UrlModel getFileUrl() {
        return this.fileUrl;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHintIcon() {
        return this.hintIcon;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLocalPath() {
        return this.mLocalPath;
    }

    public List<String> getMusicIds() {
        return this.musicIds;
    }

    public String getName() {
        return this.name;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdkExtra() {
        return this.sdkExtra;
    }

    public int getSource() {
        return this.source;
    }

    public z getStickerPoi() {
        return this.stickerPoi;
    }

    @Sticker.StickerType
    @Deprecated
    public long getType() {
        return this.type;
    }

    public boolean isBusi() {
        return this.isBusi;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public String getPropSource() {
        if (this.propSource == null) {
            return "";
        }
        return this.propSource;
    }

    public long getStickerId() {
        if (this.stickerId == 0) {
            return (long) this.id;
        }
        return this.stickerId;
    }

    public int hashCode() {
        return (int) (this.stickerId ^ (this.stickerId >>> 32));
    }

    public boolean suportLive() {
        if (this.usageScenario == 0 || this.usageScenario == 2) {
            return true;
        }
        return false;
    }

    public boolean supportVideo() {
        if (this.usageScenario == 0 || this.usageScenario == 1) {
            return true;
        }
        return false;
    }

    public List<String> getTags() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81975, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81975, new Class[0], List.class);
        } else if (CollectionUtils.isEmpty(this.tags)) {
            return new ArrayList();
        } else {
            return this.tags;
        }
    }

    @NonNull
    public List<String> getTypes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81974, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81974, new Class[0], List.class);
        } else if (CollectionUtils.isEmpty(this.types)) {
            return new ArrayList();
        } else {
            return this.types;
        }
    }

    public boolean shouldShowCommerceStickerTag() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81973, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81973, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isBusi() || getFaceStickerCommerceBean() == null || getFaceStickerCommerceBean().f71644e != 1 || TextUtils.isEmpty(getFaceStickerCommerceBean().f71643d)) {
            return false;
        } else {
            return true;
        }
    }

    public void setAdRawData(String str) {
        this.adRawData = str;
    }

    public void setBusi(boolean z) {
        this.isBusi = z;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setDesignerId(String str) {
        this.designerId = str;
    }

    public void setEffectType(int i) {
        this.effectType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFaceStickerCommerceBean(@Nullable c cVar) {
        this.faceStickerCommerceBean = cVar;
    }

    public void setFileUrl(UrlModel urlModel) {
        this.fileUrl = urlModel;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setHintIcon(UrlModel urlModel) {
        this.hintIcon = urlModel;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setLocalPath(String str) {
        this.mLocalPath = str;
    }

    public void setMusicIds(List<String> list) {
        this.musicIds = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setPropSource(String str) {
        this.propSource = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSdkExtra(String str) {
        this.sdkExtra = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStickerId(long j) {
        this.stickerId = j;
    }

    public void setStickerPoi(z zVar) {
        this.stickerPoi = zVar;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    @Deprecated
    public void setType(@Sticker.StickerType long j) {
        this.type = j;
    }

    public void setTypes(List<String> list) {
        this.types = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FaceStickerBean) && this.stickerId == ((FaceStickerBean) obj).stickerId) {
            return true;
        }
        return false;
    }

    public FaceStickerBean(Parcel parcel) {
        boolean z;
        this.id = parcel.readInt();
        this.stickerId = parcel.readLong();
        this.name = parcel.readString();
        this.iconUrl = (UrlModel) parcel.readSerializable();
        this.fileUrl = (UrlModel) parcel.readSerializable();
        this.hint = parcel.readString();
        this.hintIcon = (UrlModel) parcel.readSerializable();
        this.type = parcel.readLong();
        this.usageScenario = parcel.readInt();
        this.types = parcel.createStringArrayList();
        this.mLocalPath = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSelected = z;
        this.tags = parcel.createStringArrayList();
        this.effectType = parcel.readInt();
        this.schema = parcel.readString();
        this.source = parcel.readInt();
        this.designerId = parcel.readString();
        this.extra = parcel.readString();
        this.sdkExtra = parcel.readString();
        this.musicIds = parcel.createStringArrayList();
        this.stickerPoi = (z) parcel.readSerializable();
        this.adRawData = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 81976, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 81976, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.id);
        parcel.writeLong(this.stickerId);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.iconUrl);
        parcel.writeSerializable(this.fileUrl);
        parcel.writeString(this.hint);
        parcel.writeSerializable(this.hintIcon);
        parcel.writeLong(this.type);
        parcel.writeInt(this.usageScenario);
        parcel.writeStringList(this.types);
        parcel.writeString(this.mLocalPath);
        parcel.writeByte(this.isSelected ? (byte) 1 : 0);
        parcel.writeStringList(this.tags);
        parcel.writeInt(this.effectType);
        parcel.writeString(this.schema);
        parcel.writeInt(this.source);
        parcel.writeString(this.designerId);
        parcel.writeString(this.extra);
        parcel.writeString(this.sdkExtra);
        parcel.writeStringList(this.musicIds);
        parcel.writeSerializable(this.stickerPoi);
        parcel.writeString(this.adRawData);
    }
}
