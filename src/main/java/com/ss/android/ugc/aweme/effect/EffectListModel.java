package com.ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public class EffectListModel implements Parcelable {
    public static final Parcelable.Creator<EffectListModel> CREATOR = new Parcelable.Creator<EffectListModel>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43520a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new EffectListModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f43520a, false, 38570, new Class[]{Parcel.class}, EffectListModel.class)) {
                return new EffectListModel(parcel2);
            }
            return (EffectListModel) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f43520a, false, 38570, new Class[]{Parcel.class}, EffectListModel.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<EffectPointModel> mEffectPointModels;

    public int describeContents() {
        return 0;
    }

    public EffectListModel() {
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38568, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38568, new Class[0], ArrayList.class);
        } else if (this.mEffectPointModels == null) {
            return new ArrayList<>();
        } else {
            return this.mEffectPointModels;
        }
    }

    public void setEffectPointModels(ArrayList<EffectPointModel> arrayList) {
        this.mEffectPointModels = arrayList;
    }

    public EffectListModel(Parcel parcel) {
        this.mEffectPointModels = new ArrayList<>();
        parcel.readList(this.mEffectPointModels, EffectPointModel.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 38569, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 38569, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel2.writeList(this.mEffectPointModels);
    }
}
