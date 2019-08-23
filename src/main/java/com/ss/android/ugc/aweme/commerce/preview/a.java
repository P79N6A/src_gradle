package com.ss.android.ugc.aweme.commerce.preview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u001f\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/CommercePreviewOperator;", "Lcom/ss/android/ugc/aweme/detail/operators/AbsDetailOperator;", "Lcom/ss/android/ugc/aweme/commerce/preview/PreviewFeedModel;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;", "model", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "mParams", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "(Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;Lcom/ss/android/ugc/aweme/feed/param/FeedParam;)V", "request", "", "queryType", "", "feedParam", "poiType", "isHashTag", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.ss.android.ugc.aweme.detail.operators.a<i, b<i>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37284a;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.param.b f37285e;

    public a(@Nullable com.ss.android.ugc.aweme.common.f.a<?, ?> aVar, @NotNull com.ss.android.ugc.aweme.feed.param.b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mParams");
        this.f37285e = bVar;
        this.f41200c = ((i) (!(aVar instanceof i) ? null : aVar)) == null ? new i() : (i) (!(aVar instanceof i) ? null : aVar);
        this.f41201d = new b();
    }

    public final void a(int i, @NotNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        com.ss.android.ugc.aweme.feed.param.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f37284a, false, 28527, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f37284a, false, 28527, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "feedParam");
        this.f41201d.a(Integer.valueOf(i), this.f37285e.getAid(), this.f37285e.getPromotionId(), this.f37285e.getProductId());
    }
}
