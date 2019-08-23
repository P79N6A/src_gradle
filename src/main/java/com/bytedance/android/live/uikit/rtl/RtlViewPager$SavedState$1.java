package com.bytedance.android.live.uikit.rtl;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class RtlViewPager$SavedState$1 implements ParcelableCompatCreatorCallbacks<RtlViewPager.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8663a;

    RtlViewPager$SavedState$1() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RtlViewPager.a[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Parcel parcel2 = parcel;
        ClassLoader classLoader2 = classLoader;
        if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f8663a, false, 2271, new Class[]{Parcel.class, ClassLoader.class}, RtlViewPager.a.class)) {
            return new RtlViewPager.a(parcel2, classLoader2, (byte) 0);
        }
        return (RtlViewPager.a) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f8663a, false, 2271, new Class[]{Parcel.class, ClassLoader.class}, RtlViewPager.a.class);
    }
}
