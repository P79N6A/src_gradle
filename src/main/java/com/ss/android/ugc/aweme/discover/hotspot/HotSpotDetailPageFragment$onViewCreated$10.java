package com.ss.android.ugc.aweme.discover.hotspot;

import android.content.Context;
import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailPageFragment$onViewCreated$10", "Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", "position", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotDetailPageFragment$onViewCreated$10 extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42408a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HotSpotDetailPageFragment f42409b;

    HotSpotDetailPageFragment$onViewCreated$10(HotSpotDetailPageFragment hotSpotDetailPageFragment) {
        this.f42409b = hotSpotDetailPageFragment;
    }

    public final void onPageSelected(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42408a, false, 36484, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42408a, false, 36484, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onPageSelected(i);
        HotSpotMainViewModel q = this.f42409b.q();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, q, HotSpotMainViewModel.f42486d, false, 36639, new Class[]{Integer.TYPE}, Void.TYPE)) {
            HotSpotMainViewModel hotSpotMainViewModel = q;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, hotSpotMainViewModel, HotSpotMainViewModel.f42486d, false, 36639, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            q.b(new HotSpotMainViewModel.g(i2));
        }
        SpotChangeCallBack.a aVar = SpotChangeCallBack.f42414d;
        Context context = this.f42409b.getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        aVar.a(context).f42416c = i2;
    }
}
