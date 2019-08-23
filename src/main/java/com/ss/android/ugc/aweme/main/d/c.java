package com.ss.android.ugc.aweme.main.d;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.base.TabChangeManager;
import com.ss.android.ugc.aweme.profile.ui.header.as;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/main/experiment/StoryPublishJumper;", "", "()V", "jump", "", "tabChangeManager", "Lcom/ss/android/ugc/aweme/main/base/TabChangeManager;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54718a;

    public final void a(@Nullable TabChangeManager tabChangeManager) {
        TabChangeManager tabChangeManager2 = tabChangeManager;
        if (PatchProxy.isSupport(new Object[]{tabChangeManager2}, this, f54718a, false, 58000, new Class[]{TabChangeManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tabChangeManager2}, this, f54718a, false, 58000, new Class[]{TabChangeManager.class}, Void.TYPE);
        } else if (tabChangeManager2 != null) {
            if (MainPageExperimentHelper.m()) {
                tabChangeManager2.a("USER");
            } else {
                tabChangeManager2.a("FOLLOW");
            }
            Fragment a2 = tabChangeManager.a();
            if (a2 instanceof as) {
                ((as) a2).i();
            }
        }
    }
}
