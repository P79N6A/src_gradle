package com.ss.android.ugc.aweme.live.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class LiveVerifyChecklist implements Parcelable {
    public static final Parcelable.Creator<LiveVerifyChecklist> CREATOR = new Parcelable.Creator<LiveVerifyChecklist>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53496a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LiveVerifyChecklist[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f53496a, false, 55874, new Class[]{Parcel.class}, LiveVerifyChecklist.class)) {
                return new LiveVerifyChecklist(parcel2);
            }
            return (LiveVerifyChecklist) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f53496a, false, 55874, new Class[]{Parcel.class}, LiveVerifyChecklist.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean is_phone_binded;
    public boolean live_agreement;
    public boolean live_answer = true;
    public int realname_verify;

    public int describeContents() {
        return 0;
    }

    public LiveVerifyChecklist() {
    }

    public LiveVerifyChecklist(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.realname_verify = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.is_phone_binded = z;
        this.live_agreement = parcel.readByte() == 0 ? false : z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55873, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55873, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.realname_verify);
        parcel.writeByte(this.is_phone_binded ? (byte) 1 : 0);
        parcel.writeByte(this.live_agreement ? (byte) 1 : 0);
    }
}
