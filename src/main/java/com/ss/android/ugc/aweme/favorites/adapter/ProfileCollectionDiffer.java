package com.ss.android.ugc.aweme.favorites.adapter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.favorites.a.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionDiffer extends DiffUtil.ItemCallback<f> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44250a;

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        f fVar = (f) obj;
        f fVar2 = (f) obj2;
        if (PatchProxy.isSupport(new Object[]{fVar, fVar2}, this, f44250a, false, 39409, new Class[]{f.class, f.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fVar, fVar2}, this, f44250a, false, 39409, new Class[]{f.class, f.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(fVar, "p0");
        Intrinsics.checkParameterIsNotNull(fVar2, "p1");
        return false;
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        f fVar = (f) obj;
        f fVar2 = (f) obj2;
        if (PatchProxy.isSupport(new Object[]{fVar, fVar2}, this, f44250a, false, 39408, new Class[]{f.class, f.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fVar, fVar2}, this, f44250a, false, 39408, new Class[]{f.class, f.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(fVar, "p0");
        Intrinsics.checkParameterIsNotNull(fVar2, "p1");
        return Intrinsics.areEqual((Object) fVar.f44213f, (Object) fVar2.f44213f);
    }
}
