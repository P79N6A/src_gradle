package com.ss.android.ugc.aweme.detail.operators;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.detail.e.e;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.poi.b;
import com.ss.android.ugc.aweme.poi.model.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/operators/DetailPoiFeedOperator;", "Lcom/ss/android/ugc/aweme/detail/operators/AbsDetailOperator;", "Lcom/ss/android/ugc/aweme/poi/model/PoiAwemeFeedModel;", "Lcom/ss/android/ugc/aweme/detail/presenter/DetailFeedPoiPresenter;", "Lcom/ss/android/ugc/aweme/detail/operators/DetailOperateFactory$OnPreLoad;", "model", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "(Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;)V", "bindPreLoadView", "", "preLoadView", "Lcom/ss/android/ugc/aweme/feed/presenter/IPreLoadView;", "getPageType", "", "videoType", "request", "queryType", "feedParam", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "poiType", "isHashTag", "", "setPreLoad", "isPreLoad", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class u extends a<h, e> implements s.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41280a;

    public final int a(int i) {
        return 10;
    }

    public final void a(@Nullable x xVar) {
        ((e) this.f41201d).f41186b = xVar;
    }

    public u(@Nullable a<?, ?> aVar) {
        h hVar;
        if (aVar instanceof h) {
            hVar = (h) aVar;
        } else {
            hVar = new h();
        }
        this.f41200c = hVar;
        this.f41201d = new e();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f41280a, false, 34829, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f41280a, false, 34829, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.f41201d;
        Intrinsics.checkExpressionValueIsNotNull(bVar, "mPresenter");
        ((e) bVar).g = true;
    }

    public final void a(int i, @NotNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        com.ss.android.ugc.aweme.feed.param.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41280a, false, 34828, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41280a, false, 34828, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "feedParam");
        com.ss.android.ugc.aweme.poi.b a2 = new b.a().a(bVar.getPoiId()).d(bVar.getRelatedId()).b(3).a();
        if (i == 1) {
            ((e) this.f41201d).a(Integer.valueOf(i), a2);
            return;
        }
        ((e) this.f41201d).a(Integer.valueOf(i), a2);
    }
}
