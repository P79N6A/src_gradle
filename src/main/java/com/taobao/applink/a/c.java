package com.taobao.applink.a;

import com.taobao.applink.auth.TBAppLinkAuthListener;
import com.taobao.applink.auth.userinfo.TBAppLinkUserInfo;
import com.taobao.applink.f.a.b;

public class c implements TBAppLinkAuthListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f79145a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f79146b;

    c(b bVar, b bVar2) {
        this.f79146b = bVar;
        this.f79145a = bVar2;
    }

    public void onFailure() {
        if (this.f79145a != null) {
            try {
                this.f79145a.a("{\"result\":false}");
            } catch (Exception unused) {
            }
        }
    }

    public void onSuccess(TBAppLinkUserInfo tBAppLinkUserInfo) {
        if (this.f79145a != null) {
            try {
                this.f79145a.a(String.format("{\"result\":true,\"mixedNick\":\"%s\",\"icon\":\"%s\"}", new Object[]{tBAppLinkUserInfo.mixedNick, tBAppLinkUserInfo.icon}));
            } catch (Exception unused) {
            }
        }
    }
}
