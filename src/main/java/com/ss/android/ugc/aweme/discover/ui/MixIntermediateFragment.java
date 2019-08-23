package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/MixIntermediateFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateFragment;", "", "()V", "getLabelName", "", "getPageIndex", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MixIntermediateFragment extends SearchIntermediateFragment<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42930a;
    private HashMap h;

    @Nullable
    public final String b() {
        return "general_search";
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f42930a, false, 37689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42930a, false, 37689, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final int c() {
        return aw.f43134b;
    }
}
