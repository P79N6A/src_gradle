package com.ss.android.ugc.aweme.detail.operators;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/detail/operators/DetailHotSpotJediOperator$bindView$1$mDiffer$2", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "getChangePayload", "", "oldItem", "newItem", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DetailHotSpotJediOperator$bindView$1$mDiffer$2 extends DiffUtil.ItemCallback<Aweme> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41195a;

    DetailHotSpotJediOperator$bindView$1$mDiffer$2() {
    }

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        Aweme aweme = (Aweme) obj;
        Aweme aweme2 = (Aweme) obj2;
        if (PatchProxy.isSupport(new Object[]{aweme, aweme2}, this, f41195a, false, 34794, new Class[]{Aweme.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, aweme2}, this, f41195a, false, 34794, new Class[]{Aweme.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aweme, "p0");
        Intrinsics.checkParameterIsNotNull(aweme2, "p1");
        return false;
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        Aweme aweme = (Aweme) obj;
        Aweme aweme2 = (Aweme) obj2;
        if (PatchProxy.isSupport(new Object[]{aweme, aweme2}, this, f41195a, false, 34792, new Class[]{Aweme.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, aweme2}, this, f41195a, false, 34792, new Class[]{Aweme.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aweme, "p0");
        Intrinsics.checkParameterIsNotNull(aweme2, "p1");
        return false;
    }

    public final /* synthetic */ Object getChangePayload(Object obj, Object obj2) {
        Aweme aweme = (Aweme) obj;
        Aweme aweme2 = (Aweme) obj2;
        if (PatchProxy.isSupport(new Object[]{aweme, aweme2}, this, f41195a, false, 34793, new Class[]{Aweme.class, Aweme.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aweme, aweme2}, this, f41195a, false, 34793, new Class[]{Aweme.class, Aweme.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(aweme, "oldItem");
        Intrinsics.checkParameterIsNotNull(aweme2, "newItem");
        return null;
    }
}
