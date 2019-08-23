package com.ss.android.ugc.aweme.following.ui.adapter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.following.ui.viewmodel.e;
import com.ss.android.ugc.aweme.following.ui.viewmodel.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/adapter/RelationUserDiff;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RelationUserDiff extends DiffUtil.ItemCallback<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48124a;

    public final boolean areContentsTheSame(@NotNull Object obj, @NotNull Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, obj4}, this, f48124a, false, 45141, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, this, f48124a, false, 45141, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj3, "p0");
        Intrinsics.checkParameterIsNotNull(obj4, "p1");
        if (!(obj3 instanceof e) || !(obj4 instanceof e)) {
            if (!(obj3 instanceof f) || !(obj4 instanceof f)) {
                return false;
            }
            f fVar = (f) obj3;
            f fVar2 = (f) obj4;
            if (fVar.f48216b != fVar2.f48216b || !Intrinsics.areEqual((Object) fVar.f48217c, (Object) fVar2.f48217c)) {
                return false;
            }
            return true;
        } else if (((e) obj3).f48213b == ((e) obj4).f48213b) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean areItemsTheSame(@NotNull Object obj, @NotNull Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, obj4}, this, f48124a, false, 45140, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, this, f48124a, false, 45140, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj3, "p0");
        Intrinsics.checkParameterIsNotNull(obj4, "p1");
        if (!(obj3 instanceof e) || !(obj4 instanceof e)) {
            if (!(obj3 instanceof f) || !(obj4 instanceof f)) {
                return false;
            }
            f fVar = (f) obj3;
            f fVar2 = (f) obj4;
            if (fVar.f48216b != fVar2.f48216b || !Intrinsics.areEqual((Object) fVar.f48217c.getUid(), (Object) fVar2.f48217c.getUid())) {
                return false;
            }
            return true;
        } else if (((e) obj3).f48213b == ((e) obj4).f48213b) {
            return true;
        } else {
            return false;
        }
    }
}
