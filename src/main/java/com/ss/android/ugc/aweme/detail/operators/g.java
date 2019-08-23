package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.discover.model.DiscoverListModel;

public final class g extends a<DiscoverListModel, b<DiscoverListModel>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41231a;

    public final int a(int i) {
        return 9001;
    }

    public final DiscoverListModel d() {
        return (DiscoverListModel) this.f41200c;
    }

    public g(@Nullable a aVar) {
        DiscoverListModel discoverListModel;
        if (aVar instanceof DiscoverListModel) {
            discoverListModel = (DiscoverListModel) aVar;
        } else {
            discoverListModel = new DiscoverListModel();
        }
        this.f41200c = discoverListModel;
        this.f41201d = new b();
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41231a, false, 34771, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41231a, false, 34771, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41201d.a(Integer.valueOf(i), Integer.valueOf(bVar.getType()), Boolean.valueOf(bVar.isRecommend()), bVar.getCellId());
    }
}
