package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class EffectCategoryResponse implements Parcelable {
    public static final Parcelable.Creator<EffectCategoryResponse> CREATOR = new Parcelable.Creator<EffectCategoryResponse>() {
        public final EffectCategoryResponse[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }

        public final EffectCategoryResponse createFromParcel(Parcel parcel) {
            return new EffectCategoryResponse(parcel);
        }
    };
    public List<Effect> addedEffects;
    public List<Effect> collectionEffect;
    public List<Effect> deletedEffects;
    public Effect frontEffect;
    public String icon_normal_url;
    public String icon_selected_url;
    public String id;
    public String key;
    public String name;
    public Effect rearEffect;
    public List<String> tags;
    public String tagsUpdateTime;
    public List<Effect> totalEffects;

    public int describeContents() {
        return 0;
    }

    public EffectCategoryResponse() {
    }

    public String toString() {
        return "EffectCategoryResponse{id='" + this.id + '\'' + ", name='" + this.name + '\'' + ", key='" + this.key + '\'' + ", collection='" + this.collectionEffect + '\'' + '}';
    }

    protected EffectCategoryResponse(Parcel parcel) {
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.key = parcel.readString();
        this.icon_normal_url = parcel.readString();
        this.icon_selected_url = parcel.readString();
        this.frontEffect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.rearEffect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.totalEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.addedEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.deletedEffects = parcel.createTypedArrayList(Effect.CREATOR);
        this.tags = parcel.createStringArrayList();
        this.tagsUpdateTime = parcel.readString();
        this.collectionEffect = parcel.createTypedArrayList(Effect.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.icon_normal_url);
        parcel.writeString(this.icon_selected_url);
        parcel.writeParcelable(this.frontEffect, i);
        parcel.writeParcelable(this.rearEffect, i);
        parcel.writeTypedList(this.totalEffects);
        parcel.writeTypedList(this.addedEffects);
        parcel.writeTypedList(this.deletedEffects);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tagsUpdateTime);
        parcel.writeTypedList(this.collectionEffect);
    }

    public EffectCategoryResponse(String str, String str2, String str3, List<Effect> list, List<String> list2, String str4) {
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.totalEffects = list;
    }

    public EffectCategoryResponse(String str, String str2, String str3, List<Effect> list, List<String> list2, String str4, List<Effect> list3) {
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.totalEffects = list;
        this.collectionEffect = list3;
    }
}
