package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/DiscoverV3DetailPageFragment;", "Lcom/ss/android/ugc/aweme/detail/ui/DetailPageFragment;", "()V", "createFragmentPanel", "Lcom/ss/android/ugc/aweme/detail/panel/DetailFragmentPanel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverV3DetailPageFragment extends DetailPageFragment {
    public static ChangeQuickRedirect g;
    private HashMap h;

    @NotNull
    public final DetailFragmentPanel h() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 37574, new Class[0], DetailFragmentPanel.class)) {
            return new u();
        }
        return (DetailFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, g, false, 37574, new Class[0], DetailFragmentPanel.class);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, g, false, 37576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 37576, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }
}
