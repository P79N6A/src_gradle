package com.ss.android.ugc.aweme.discover.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.discover.model.DiscoveryV3CellDetailResponse;
import com.ss.android.ugc.aweme.discover.model.DiscoveryV3DetailListModel;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0016J%\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0\u000e\"\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/DiscoveryV3DetailListPresenter;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoveryV3DetailListModel;", "()V", "items", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lkotlin/collections/ArrayList;", "addAll", "", "onSuccess", "sendRequest", "", "params", "", "", "([Ljava/lang/Object;)Z", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends b<DiscoveryV3DetailListModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42700a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Aweme> f42701b = new ArrayList<>();

    private final void c() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42700a, false, 37179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42700a, false, 37179, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.a aVar = this.f2978e;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mModel");
        if (((DiscoveryV3DetailListModel) aVar).getItems() != null) {
            com.ss.android.ugc.aweme.common.a aVar2 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModel");
            List<Aweme> items = ((DiscoveryV3DetailListModel) aVar2).getItems();
            if (items == null) {
                Intrinsics.throwNpe();
            }
            for (Aweme aweme : items) {
                com.ss.android.ugc.aweme.common.a aVar3 = this.f2978e;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "mModel");
                aweme.setRequestId(((DiscoveryV3CellDetailResponse) ((DiscoveryV3DetailListModel) aVar3).getData()).logPb.getImprId());
                com.ss.android.ugc.aweme.feed.a.a().a(aweme);
                com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
                a2.a(aweme.getAid() + 9001, aweme.getRequestId(), i);
                this.f42701b.add(aweme);
                i++;
            }
            ai a3 = ai.a();
            com.ss.android.ugc.aweme.common.a aVar4 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar4, "mModel");
            String imprId = ((DiscoveryV3CellDetailResponse) ((DiscoveryV3DetailListModel) aVar4).getData()).logPb.getImprId();
            com.ss.android.ugc.aweme.common.a aVar5 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar5, "mModel");
            a3.a(imprId, ((DiscoveryV3CellDetailResponse) ((DiscoveryV3DetailListModel) aVar5).getData()).logPb);
        }
    }

    public final void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f42700a, false, 37178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42700a, false, 37178, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null) {
            com.ss.android.ugc.aweme.common.a aVar = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mModel");
            int i = ((DiscoveryV3DetailListModel) aVar).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    c();
                    c cVar = (c) this.f2979f;
                    List list = this.f42701b;
                    com.ss.android.ugc.aweme.common.a aVar2 = this.f2978e;
                    Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModel");
                    if (((DiscoveryV3DetailListModel) aVar2).isHasMore()) {
                        com.ss.android.ugc.aweme.common.a aVar3 = this.f2978e;
                        Intrinsics.checkExpressionValueIsNotNull(aVar3, "mModel");
                        if (!((DiscoveryV3DetailListModel) aVar3).isNewDataEmpty()) {
                            z = true;
                        }
                    }
                    cVar.b(list, z);
                }
                return;
            }
            if (!this.f42701b.isEmpty()) {
                this.f42701b.clear();
            }
            com.ss.android.ugc.aweme.common.a aVar4 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar4, "mModel");
            if (((DiscoveryV3DetailListModel) aVar4).isDataEmpty()) {
                ((c) this.f2979f).y_();
                return;
            }
            c();
            com.ss.android.ugc.aweme.common.a aVar5 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar5, "mModel");
            ((c) this.f2979f).a(this.f42701b, ((DiscoveryV3DetailListModel) aVar5).isHasMore());
        }
    }

    public final boolean a(@NotNull Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f42700a, false, 37177, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f42700a, false, 37177, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(objArr, "params");
        Integer num = objArr[0];
        if (!(num instanceof Integer)) {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null && num2.intValue() == 1) {
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            String str = objArr[3];
            if (!(str instanceof String)) {
                str = null;
            }
            Aweme b2 = a2.b(str);
            if (b2 != null) {
                ((DiscoveryV3DetailListModel) this.f2978e).insertItem(b2);
                b();
                return true;
            }
        }
        return super.a(Arrays.copyOf(objArr, objArr.length));
    }
}
