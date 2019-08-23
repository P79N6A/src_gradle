package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/utils/UserUtil;", "", "()V", "enterPersonDetail", "", "uid", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ay {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52523a;

    /* renamed from: b  reason: collision with root package name */
    public static final ay f52524b = new ay();

    private ay() {
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52523a, false, 53729, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52523a, false, 53729, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (!z) {
            h a2 = h.a();
            a2.a(j.a("aweme://user/profile/" + str2).a("sec_user_id", com.ss.android.ugc.aweme.im.sdk.d.j.f51270d.a(str2)).a("previous_page_position", "other_places").a("previous_page", "message").a("enter_from", "chat").a());
        }
    }
}
