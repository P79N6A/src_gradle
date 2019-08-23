package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerItemViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerItemState;", "()V", "defaultState", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowerItemViewModel extends JediViewModel<FollowerItemState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48191d;

    public final /* synthetic */ x c() {
        FollowerItemState followerItemState;
        if (PatchProxy.isSupport(new Object[0], this, f48191d, false, 45231, new Class[0], FollowerItemState.class)) {
            followerItemState = (FollowerItemState) PatchProxy.accessDispatch(new Object[0], this, f48191d, false, 45231, new Class[0], FollowerItemState.class);
        } else {
            followerItemState = new FollowerItemState(null, 1, null);
        }
        return followerItemState;
    }
}
