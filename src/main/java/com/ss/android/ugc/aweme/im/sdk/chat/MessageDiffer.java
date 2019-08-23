package com.ss.android.ugc.aweme.im.sdk.chat;

import android.support.v7.util.DiffUtil;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/MessageDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/bytedance/im/core/model/Message;", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MessageDiffer extends DiffUtil.ItemCallback<n> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50266a;

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2}, this, f50266a, false, 50394, new Class[]{n.class, n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar, nVar2}, this, f50266a, false, 50394, new Class[]{n.class, n.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(nVar, "p0");
        Intrinsics.checkParameterIsNotNull(nVar2, "p1");
        return Intrinsics.areEqual((Object) nVar, (Object) nVar2);
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2}, this, f50266a, false, 50395, new Class[]{n.class, n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar, nVar2}, this, f50266a, false, 50395, new Class[]{n.class, n.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(nVar, "p0");
        Intrinsics.checkParameterIsNotNull(nVar2, "p1");
        return Intrinsics.areEqual((Object) nVar, (Object) nVar2);
    }
}
