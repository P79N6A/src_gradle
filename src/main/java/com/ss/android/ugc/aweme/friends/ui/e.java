package com.ss.android.ugc.aweme.friends.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.friends.model.FriendList;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49453a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49454b;

    e(String str) {
        this.f49454b = str;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49453a, false, 47088, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49453a, false, 47088, new Class[]{i.class}, Object.class);
        }
        String str = this.f49454b;
        if (!iVar.c() && !iVar.d()) {
            r.onEvent(MobClick.obtain().setEventName("contact_request_response").setLabelName("phone_number").setJsonObject(new t().a("is_success", str).a("follow_already", String.valueOf(((FriendList) iVar.e()).total)).a()));
        }
        return null;
    }
}
