package com.bytedance.android.livesdk.widget;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class LiveVerticalViewPager$SavedState$1 implements ParcelableCompatCreatorCallbacks<LiveVerticalViewPager.g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18288a;

    LiveVerticalViewPager$SavedState$1() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LiveVerticalViewPager.g[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Parcel parcel2 = parcel;
        ClassLoader classLoader2 = classLoader;
        if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f18288a, false, 14601, new Class[]{Parcel.class, ClassLoader.class}, LiveVerticalViewPager.g.class)) {
            return new LiveVerticalViewPager.g(parcel2, classLoader2);
        }
        return (LiveVerticalViewPager.g) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f18288a, false, 14601, new Class[]{Parcel.class, ClassLoader.class}, LiveVerticalViewPager.g.class);
    }
}
