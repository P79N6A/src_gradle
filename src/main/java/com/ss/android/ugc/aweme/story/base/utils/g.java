package com.ss.android.ugc.aweme.story.base.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.d;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/utils/StoryServiceUtils;", "", "()V", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71952a;

    /* renamed from: b  reason: collision with root package name */
    public static IUserService f71953b = ((IUserService) ServiceManager.get().getService(IUserService.class));

    /* renamed from: c  reason: collision with root package name */
    public static final a f71954c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static d f71955d = ((d) ServiceManager.get().getService(d.class));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/utils/StoryServiceUtils$Companion;", "", "()V", "profileService", "Lcom/ss/android/ugc/aweme/story/api/IProfileService;", "userService", "Lcom/ss/android/ugc/aweme/framework/services/IUserService;", "getCurUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71956a;

        private a() {
        }

        @JvmStatic
        @Nullable
        public final User a() {
            if (PatchProxy.isSupport(new Object[0], this, f71956a, false, 82308, new Class[0], User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[0], this, f71956a, false, 82308, new Class[0], User.class);
            }
            IUserService iUserService = g.f71953b;
            if (iUserService != null) {
                return iUserService.getCurrentUser();
            }
            return null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @JvmStatic
    @Nullable
    public static final User a() {
        return PatchProxy.isSupport(new Object[0], null, f71952a, true, 82307, new Class[0], User.class) ? (User) PatchProxy.accessDispatch(new Object[0], null, f71952a, true, 82307, new Class[0], User.class) : f71954c.a();
    }
}
