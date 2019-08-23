package com.ss.android.ugc.aweme.commerce.collection;

import android.support.v7.util.DiffUtil;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CollectionGoodDiffer extends DiffUtil.ItemCallback<CollectionGood> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36846a;

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        CollectionGood collectionGood = (CollectionGood) obj;
        CollectionGood collectionGood2 = (CollectionGood) obj2;
        if (PatchProxy.isSupport(new Object[]{collectionGood, collectionGood2}, this, f36846a, false, 28063, new Class[]{CollectionGood.class, CollectionGood.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{collectionGood, collectionGood2}, this, f36846a, false, 28063, new Class[]{CollectionGood.class, CollectionGood.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(collectionGood, "p0");
        Intrinsics.checkParameterIsNotNull(collectionGood2, "p1");
        if (!TextUtils.equals(collectionGood.getPromotionId(), collectionGood2.getPromotionId()) || !TextUtils.equals(collectionGood.getProductId(), collectionGood2.getProductId())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        CollectionGood collectionGood = (CollectionGood) obj;
        CollectionGood collectionGood2 = (CollectionGood) obj2;
        if (PatchProxy.isSupport(new Object[]{collectionGood, collectionGood2}, this, f36846a, false, 28062, new Class[]{CollectionGood.class, CollectionGood.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{collectionGood, collectionGood2}, this, f36846a, false, 28062, new Class[]{CollectionGood.class, CollectionGood.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(collectionGood, "p0");
        Intrinsics.checkParameterIsNotNull(collectionGood2, "p1");
        if (!TextUtils.equals(collectionGood.getPromotionId(), collectionGood2.getPromotionId()) || !TextUtils.equals(collectionGood.getProductId(), collectionGood2.getProductId())) {
            return false;
        }
        return true;
    }
}
