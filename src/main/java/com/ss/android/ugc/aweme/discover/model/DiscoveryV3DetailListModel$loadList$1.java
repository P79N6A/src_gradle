package com.ss.android.ugc.aweme.discover.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoveryV3CellDetailResponse;", "it", "Lbolts/Task;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
final class DiscoveryV3DetailListModel$loadList$1<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {
    public static final DiscoveryV3DetailListModel$loadList$1 INSTANCE = new DiscoveryV3DetailListModel$loadList$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    DiscoveryV3DetailListModel$loadList$1() {
    }

    @Nullable
    public final DiscoveryV3CellDetailResponse then(i<DiscoveryV3CellDetailResponse> iVar) {
        i<DiscoveryV3CellDetailResponse> iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 37051, new Class[]{i.class}, DiscoveryV3CellDetailResponse.class)) {
            return (DiscoveryV3CellDetailResponse) PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 37051, new Class[]{i.class}, DiscoveryV3CellDetailResponse.class);
        }
        Intrinsics.checkExpressionValueIsNotNull(iVar2, AdvanceSetting.NETWORK_TYPE);
        if (iVar.c()) {
            return null;
        }
        if (!iVar.d()) {
            return (DiscoveryV3CellDetailResponse) iVar.e();
        }
        Exception f2 = iVar.f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "it.error");
        throw f2;
    }
}
