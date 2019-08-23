package com.ss.android.ugc.aweme.filter;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class az implements Parcelable, Serializable {
    public static final Parcelable.Creator<az> CREATOR = new Parcelable.Creator<az>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47529a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new az[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f47529a, false, 44433, new Class[]{Parcel.class}, az.class)) {
                return new az(parcel2, (byte) 0);
            }
            return (az) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f47529a, false, 44433, new Class[]{Parcel.class}, az.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<String> mItems;
    private List<Integer> numbers;

    public int describeContents() {
        return 0;
    }

    public az() {
        this.mItems = new ArrayList();
        this.numbers = new ArrayList();
        this.numbers.add(-1);
    }

    public void addIndex() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44429, new Class[0], Void.TYPE);
            return;
        }
        int size = this.mItems.size();
        if (size > 0) {
            this.numbers.add(Integer.valueOf(size - 1));
        }
    }

    public void removeLast() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44428, new Class[0], Void.TYPE);
            return;
        }
        if (!this.mItems.isEmpty()) {
            this.mItems.remove(this.mItems.size() - 1);
        }
    }

    public void removeLastArray() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44430, new Class[0], Void.TYPE);
            return;
        }
        int size = this.mItems.size();
        int size2 = this.numbers.size();
        if (size > 0 && size2 > 1) {
            int intValue = this.numbers.get(size2 - 2).intValue();
            for (int i = size - 1; i > intValue; i--) {
                this.mItems.remove(i);
            }
            this.numbers.remove(size2 - 1);
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44431, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44431, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.mItems.get(i));
            if (i != size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private az(Parcel parcel) {
        this.numbers = new ArrayList();
        this.mItems = parcel.createStringArrayList();
        parcel.readList(this.numbers, Integer.class.getClassLoader());
    }

    public static az from(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 44426, new Class[]{String.class}, az.class)) {
            return (az) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 44426, new Class[]{String.class}, az.class);
        }
        az azVar = new az();
        if (!TextUtils.isEmpty(str)) {
            for (String add : str2.split(",")) {
                azVar.add(add);
            }
        }
        return azVar;
    }

    public void add(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 44427, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 44427, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.mItems.add(str2);
        }
    }

    /* synthetic */ az(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 44432, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 44432, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeStringList(this.mItems);
        parcel.writeList(this.numbers);
    }
}
