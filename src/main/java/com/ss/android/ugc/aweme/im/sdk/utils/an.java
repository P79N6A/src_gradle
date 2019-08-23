package com.ss.android.ugc.aweme.im.sdk.utils;

import com.bytedance.im.core.d.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"PRIORITY_STICK_TOP", "", "priorityPlus", "Lcom/bytedance/im/core/model/Conversation;", "getPriorityPlus", "(Lcom/bytedance/im/core/model/Conversation;)I", "im.base_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52483a;

    public static final int a(@NotNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f52483a, true, 53685, new Class[]{b.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bVar2}, null, f52483a, true, 53685, new Class[]{b.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "$this$priorityPlus");
        if (bVar.isStickTop()) {
            return 50;
        }
        return 0;
    }
}
