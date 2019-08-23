package com.ss.android.ugc.aweme.commerce.collection;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodState;", "()V", "defaultState", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CollectionGoodViewModel extends JediViewModel<CollectionGoodState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f36850d;

    public final /* synthetic */ x c() {
        CollectionGoodState collectionGoodState;
        if (PatchProxy.isSupport(new Object[0], this, f36850d, false, 28076, new Class[0], CollectionGoodState.class)) {
            collectionGoodState = (CollectionGoodState) PatchProxy.accessDispatch(new Object[0], this, f36850d, false, 28076, new Class[0], CollectionGoodState.class);
        } else {
            collectionGoodState = new CollectionGoodState(null, 1, null);
        }
        return collectionGoodState;
    }
}
