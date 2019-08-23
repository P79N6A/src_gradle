package com.ss.android.ugc.aweme.story.base.view.viewpager;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager;

class StoryVerticalViewPager$SavedState$1 implements ParcelableCompatCreatorCallbacks<StoryVerticalViewPager.e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72099a;

    StoryVerticalViewPager$SavedState$1() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StoryVerticalViewPager.e[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Parcel parcel2 = parcel;
        ClassLoader classLoader2 = classLoader;
        if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f72099a, false, 82684, new Class[]{Parcel.class, ClassLoader.class}, StoryVerticalViewPager.e.class)) {
            return new StoryVerticalViewPager.e(parcel2, classLoader2);
        }
        return (StoryVerticalViewPager.e) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f72099a, false, 82684, new Class[]{Parcel.class, ClassLoader.class}, StoryVerticalViewPager.e.class);
    }
}
