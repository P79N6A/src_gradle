package com.ss.android.ugc.aweme.detail.operators;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.discover.model.DiscoveryV3DetailListModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/operators/DetailDiscoverV3Operator;", "Lcom/ss/android/ugc/aweme/detail/operators/AbsDetailOperator;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoveryV3DetailListModel;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;", "model", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "(Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;)V", "count", "", "getPageType", "videoType", "request", "", "queryType", "feedParam", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "poiType", "isHashTag", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends a<DiscoveryV3DetailListModel, b<DiscoveryV3DetailListModel>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41232a;

    /* renamed from: e  reason: collision with root package name */
    private final int f41233e = 8;

    public final int a(int i) {
        return 9001;
    }

    public h(@Nullable a<?, ?> aVar) {
        this.f41200c = ((DiscoveryV3DetailListModel) (!(aVar instanceof DiscoveryV3DetailListModel) ? null : aVar)) == null ? new DiscoveryV3DetailListModel() : (DiscoveryV3DetailListModel) (!(aVar instanceof DiscoveryV3DetailListModel) ? null : aVar);
        this.f41201d = new com.ss.android.ugc.aweme.discover.presenter.a();
    }

    public final void a(int i, @NotNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        com.ss.android.ugc.aweme.feed.param.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41232a, false, 34772, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41232a, false, 34772, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "feedParam");
        this.f41201d.a(Integer.valueOf(i), bVar.getCellId(), Integer.valueOf(this.f41233e), bVar.getAid());
    }
}
