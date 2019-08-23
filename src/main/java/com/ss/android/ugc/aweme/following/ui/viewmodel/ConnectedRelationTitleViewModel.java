package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationTitleViewModel;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseViewModel;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/TitleState;", "()V", "defaultState", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ConnectedRelationTitleViewModel extends JediBaseViewModel<TitleState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48189d;

    public final /* synthetic */ x c() {
        TitleState titleState;
        if (PatchProxy.isSupport(new Object[0], this, f48189d, false, 45217, new Class[0], TitleState.class)) {
            titleState = (TitleState) PatchProxy.accessDispatch(new Object[0], this, f48189d, false, 45217, new Class[0], TitleState.class);
        } else {
            titleState = new TitleState(null, 1, null);
        }
        return titleState;
    }
}
