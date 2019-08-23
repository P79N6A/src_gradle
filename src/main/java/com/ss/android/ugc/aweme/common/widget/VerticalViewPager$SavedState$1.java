package com.ss.android.ugc.aweme.common.widget;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;

class VerticalViewPager$SavedState$1 implements ParcelableCompatCreatorCallbacks<VerticalViewPager.g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40494a;

    VerticalViewPager$SavedState$1() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VerticalViewPager.g[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Parcel parcel2 = parcel;
        ClassLoader classLoader2 = classLoader;
        if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f40494a, false, 33873, new Class[]{Parcel.class, ClassLoader.class}, VerticalViewPager.g.class)) {
            return new VerticalViewPager.g(parcel2, classLoader2);
        }
        return (VerticalViewPager.g) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f40494a, false, 33873, new Class[]{Parcel.class, ClassLoader.class}, VerticalViewPager.g.class);
    }
}
