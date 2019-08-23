package com.ss.android.ugc.aweme.base.arch;

import android.view.View;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/JediHeaderViewHolder;", "Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "item", "position", "", "(Lkotlin/Unit;I)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class JediHeaderViewHolder extends MultiTypeViewHolder<Unit> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34642a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediHeaderViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    public final /* synthetic */ void a(Object obj, int i) {
        Unit unit = (Unit) obj;
        if (PatchProxy.isSupport(new Object[]{unit, Integer.valueOf(i)}, this, f34642a, false, 24517, new Class[]{Unit.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{unit, Integer.valueOf(i)}, this, f34642a, false, 24517, new Class[]{Unit.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(unit, "item");
    }
}
