package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.annotation.SuppressLint;
import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/EqualsItemCallback;", "T", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "()V", "areContentsTheSame", "", "p0", "p1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EqualsItemCallback<T> extends DiffUtil.ItemCallback<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72616a;

    @SuppressLint({"DiffUtilEquals"})
    public final boolean areContentsTheSame(T t, T t2) {
        if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f72616a, false, 83448, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return Intrinsics.areEqual((Object) t, (Object) t2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f72616a, false, 83448, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean areItemsTheSame(T t, T t2) {
        if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f72616a, false, 83447, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return Intrinsics.areEqual((Object) t, (Object) t2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f72616a, false, 83447, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
    }
}
