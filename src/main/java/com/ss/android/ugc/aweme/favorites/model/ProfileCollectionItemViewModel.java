package com.ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionItemViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionItemState;", "()V", "defaultState", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionItemViewModel extends JediViewModel<ProfileCollectionItemState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f44283d;

    public final /* synthetic */ x c() {
        ProfileCollectionItemState profileCollectionItemState;
        if (PatchProxy.isSupport(new Object[0], this, f44283d, false, 39485, new Class[0], ProfileCollectionItemState.class)) {
            profileCollectionItemState = (ProfileCollectionItemState) PatchProxy.accessDispatch(new Object[0], this, f44283d, false, 39485, new Class[0], ProfileCollectionItemState.class);
        } else {
            profileCollectionItemState = new ProfileCollectionItemState(null, 1, null);
        }
        return profileCollectionItemState;
    }
}
