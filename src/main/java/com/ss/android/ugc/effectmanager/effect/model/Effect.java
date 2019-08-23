package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

public class Effect implements Parcelable {
    public static final Parcelable.Creator<Effect> CREATOR = new Parcelable.Creator<Effect>() {
        public final Effect[] newArray(int i) {
            return new Effect[i];
        }

        public final Effect createFromParcel(Parcel parcel) {
            return new Effect(parcel);
        }
    };
    public String ad_raw_data;
    public String app_version;
    @Nullable
    public List<Effect> childEffects;
    public List<String> children;
    public String designer_encrypted_id;
    public String designer_id;
    public String device_platform;
    public boolean downloaded;
    public String effect_id;
    public int effect_type;
    public String extra;
    public UrlModel file_url;
    public String hint;
    public UrlModel hint_icon;
    public UrlModel icon_url;
    public String id;
    public boolean is_busi;
    public boolean is_poi;
    public List<String> music;
    public String name;
    public String parent;
    public String poi_id;
    public List<String> requirements;
    public String schema;
    public String sdk_extra;
    public String sdk_version;
    public int source;
    public List<String> tags;
    public String tags_updated_at;
    public String type;
    public List<String> types;
    public String unzipPath;
    public String zipPath;

    public int describeContents() {
        return 0;
    }

    public Effect() {
    }

    public List<String> getTags() {
        if (this.tags == null) {
            return new ArrayList();
        }
        return this.tags;
    }

    public String toString() {
        return "Effect{name='" + this.name + '\'' + ", effect_id='" + this.effect_id + '\'' + ", type='" + this.type + '\'' + ", unzipPath='" + this.unzipPath + '\'' + ", children=" + this.children + ", effectType=" + this.effect_type + ", parentId=" + this.parent + '}';
    }

    public Effect setRequirements(List<String> list) {
        this.requirements = list;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Effect) {
            return TextUtils.equals(this.effect_id, ((Effect) obj).effect_id);
        }
        return super.equals(obj);
    }

    protected Effect(Parcel parcel) {
        boolean z;
        boolean z2;
        this.name = parcel.readString();
        this.hint = parcel.readString();
        this.sdk_version = parcel.readString();
        this.app_version = parcel.readString();
        this.file_url = (UrlModel) parcel.readParcelable(UrlModel.class.getClassLoader());
        this.icon_url = (UrlModel) parcel.readParcelable(UrlModel.class.getClassLoader());
        this.id = parcel.readString();
        this.effect_id = parcel.readString();
        this.type = parcel.readString();
        this.types = parcel.createStringArrayList();
        this.device_platform = parcel.readString();
        this.zipPath = parcel.readString();
        this.unzipPath = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.downloaded = z;
        this.tags = parcel.createStringArrayList();
        this.tags_updated_at = parcel.readString();
        this.hint_icon = (UrlModel) parcel.readParcelable(UrlModel.class.getClassLoader());
        this.children = parcel.createStringArrayList();
        this.childEffects = parcel.createTypedArrayList(CREATOR);
        this.effect_type = parcel.readInt();
        this.parent = parcel.readString();
        this.source = parcel.readInt();
        this.designer_id = parcel.readString();
        this.schema = parcel.readString();
        this.requirements = parcel.createStringArrayList();
        this.music = parcel.createStringArrayList();
        this.extra = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.is_busi = z2;
        this.poi_id = parcel.readString();
        this.is_poi = parcel.readByte() != 0 ? true : z3;
        this.designer_encrypted_id = parcel.readString();
        this.sdk_extra = parcel.readString();
        this.ad_raw_data = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.hint);
        parcel.writeString(this.sdk_version);
        parcel.writeString(this.app_version);
        parcel.writeParcelable(this.file_url, i);
        parcel.writeParcelable(this.icon_url, i);
        parcel.writeString(this.id);
        parcel.writeString(this.effect_id);
        parcel.writeString(this.type);
        parcel.writeStringList(this.types);
        parcel.writeString(this.device_platform);
        parcel.writeString(this.zipPath);
        parcel.writeString(this.unzipPath);
        parcel.writeByte(this.downloaded ? (byte) 1 : 0);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_updated_at);
        parcel.writeParcelable(this.hint_icon, i);
        parcel.writeStringList(this.children);
        parcel.writeTypedList(this.childEffects);
        parcel.writeInt(this.effect_type);
        parcel.writeString(this.parent);
        parcel.writeInt(this.source);
        parcel.writeString(this.designer_id);
        parcel.writeString(this.schema);
        parcel.writeStringList(this.requirements);
        parcel.writeStringList(this.music);
        parcel.writeString(this.extra);
        parcel.writeByte(this.is_busi ? (byte) 1 : 0);
        parcel.writeString(this.poi_id);
        parcel.writeByte(this.is_poi ? (byte) 1 : 0);
        parcel.writeString(this.designer_encrypted_id);
        parcel.writeString(this.sdk_extra);
        parcel.writeString(this.ad_raw_data);
    }
}
