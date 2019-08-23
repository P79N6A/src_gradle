package com.ss.android.ugc.aweme.follow.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/ui/TeenagerNearbyFragment;", "Lcom/ss/android/ugc/aweme/follow/ui/TeenagerBaseFragment;", "()V", "getEnterFrom", "", "getNoticeTextResId", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TeenagerNearbyFragment extends TeenagerBaseFragment {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f47844b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f47845c;

    public final int a() {
        return C0906R.string.cih;
    }

    @NotNull
    public final String b() {
        return "teen_mode_fresh_tab";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f47844b, false, 44752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47844b, false, 44752, new Class[0], Void.TYPE);
            return;
        }
        if (this.f47845c != null) {
            this.f47845c.clear();
        }
    }
}
