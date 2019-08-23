package com.ss.android.ugc.aweme.shortvideo.cut.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.am;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class a implements Parcelable, Serializable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66475a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f66475a, false, 75841, new Class[]{Parcel.class}, a.class)) {
                return new a(parcel2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f66475a, false, 75841, new Class[]{Parcel.class}, a.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public float totalSpeed;
    private List<h> videoSegmentList;

    public int describeContents() {
        return 0;
    }

    public a() {
    }

    public List<h> getVideoSegmentList() {
        return this.videoSegmentList;
    }

    public void resetVideoSegmentList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75840, new Class[0], Void.TYPE);
        } else if (!Lists.isEmpty(this.videoSegmentList)) {
            for (int i = 0; i < this.videoSegmentList.size(); i++) {
                h hVar = this.videoSegmentList.get(i);
                if (PatchProxy.isSupport(new Object[0], hVar, h.f66494a, false, 75853, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hVar, h.f66494a, false, 75853, new Class[0], Void.TYPE);
                } else {
                    hVar.f66497d = 0;
                    hVar.f66498e = hVar.f66496c;
                    hVar.f66499f = am.NORMAL.value();
                    hVar.k = 0;
                    hVar.j = false;
                }
            }
        }
    }

    public void setSpeed(float f2) {
        this.totalSpeed = f2;
    }

    public void setVideoSegmentList(List<h> list) {
        this.videoSegmentList = list;
    }

    public a(Parcel parcel) {
        this.totalSpeed = parcel.readFloat();
        this.videoSegmentList = new ArrayList();
        parcel.readList(this.videoSegmentList, h.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 75839, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 75839, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeDouble((double) this.totalSpeed);
        parcel.writeList(this.videoSegmentList);
    }
}
