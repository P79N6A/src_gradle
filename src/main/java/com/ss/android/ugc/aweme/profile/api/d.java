package com.ss.android.ugc.aweme.profile.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.profile.presenter.ac;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61332a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f61333b = true;

    public static ac a(String str) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f61332a, true, 67452, new Class[]{String.class}, ac.class)) {
            return (ac) a.a(str2, ac.class, "", true, (String) null);
        }
        return (ac) PatchProxy.accessDispatch(new Object[]{str2}, null, f61332a, true, 67452, new Class[]{String.class}, ac.class);
    }

    public static UserResponse b(String str, boolean z, String str2) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, (byte) 1, str4}, null, f61332a, true, 67451, new Class[]{String.class, Boolean.TYPE, String.class}, UserResponse.class)) {
            return (UserResponse) a.a(str3, UserResponse.class, "", true, str4);
        }
        return (UserResponse) PatchProxy.accessDispatch(new Object[]{str3, (byte) 1, str4}, null, f61332a, true, 67451, new Class[]{String.class, Boolean.TYPE, String.class}, UserResponse.class);
    }

    public static User a(String str, boolean z, String str2) throws Exception {
        String str3;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{str4, Byte.valueOf(z ? (byte) 1 : 0), null}, null, f61332a, true, 67450, new Class[]{String.class, Boolean.TYPE, String.class}, User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[]{str4, Byte.valueOf(z), null}, null, f61332a, true, 67450, new Class[]{String.class, Boolean.TYPE, String.class}, User.class);
        }
        i iVar = new i(str4);
        if (f61333b) {
            str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        iVar.a("is_cold_start", str3);
        f61333b = false;
        return (User) a.a(iVar.toString(), User.class, AllStoryActivity.f73306b, z, (String) null);
    }
}
