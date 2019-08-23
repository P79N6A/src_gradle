package com.ss.android.ugc.aweme.commerce.collection;

import com.bytedance.jedi.model.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodRepository;", "Lcom/bytedance/jedi/model/repository/Repository;", "()V", "mQueryCollectionGoodListFetcher", "Lcom/ss/android/ugc/aweme/commerce/collection/QueryCollectionGoodListFetcher;", "queryCollectionGoodList", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodResponse;", "cursor", "", "count", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36883a;

    /* renamed from: b  reason: collision with root package name */
    private final e f36884b = new e();

    @NotNull
    public final Single<c> a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), 20}, this, f36883a, false, 28069, new Class[]{Integer.TYPE, Integer.TYPE}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), 20}, this, f36883a, false, 28069, new Class[]{Integer.TYPE, Integer.TYPE}, Single.class);
        }
        Single<c> fromObservable = Single.fromObservable(this.f36884b.a(new a(i, 20)));
        Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(mQ…eryParam(cursor, count)))");
        return fromObservable;
    }
}
