package com.ss.android.ugc.aweme.app.accountsdk;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.util.h;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.base.a.d;
import com.ss.android.ugc.aweme.base.a.e;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.freeflowcard.data.b.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.c.a;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.web.jsbridge.t;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements IAccountUserService.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33718a;

    public final void a(int i, @Nullable User user, @Nullable User user2, @Nullable Bundle bundle) {
        int i2;
        String str;
        User user3 = user2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user, user3, bundle2}, this, f33718a, false, 22990, new Class[]{Integer.TYPE, User.class, User.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user, user3, bundle2}, this, f33718a, false, 22990, new Class[]{Integer.TYPE, User.class, User.class, Bundle.class}, Void.TYPE);
            return;
        }
        switch (i) {
            case 4:
                a aVar = new a();
                if (n.c() == 1 && user2.getUserMode() == 0) {
                    String uid = user2.getUid();
                    if (PatchProxy.isSupport(new Object[]{uid}, aVar, a.f75323a, false, 87737, new Class[]{String.class}, Integer.TYPE)) {
                        a aVar2 = aVar;
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{uid}, aVar2, a.f75323a, false, 87737, new Class[]{String.class}, Integer.TYPE)).intValue();
                    } else {
                        SharedPreferences sharedPreferences = aVar.f75324b;
                        i2 = sharedPreferences.getInt("ftc_user_mode_prefix_" + uid, 0);
                    }
                    if (i2 == 2 || i2 == 1) {
                        user3.setUserMode(i2);
                    }
                }
                boolean isFlowcardMember = user2.isFlowcardMember();
                if (isFlowcardMember != user.isFlowcardMember()) {
                    b c2 = com.ss.android.ugc.aweme.freeflowcard.data.a.a().c();
                    c2.isOpen = isFlowcardMember;
                    c2.changeType = 0;
                    com.ss.android.ugc.aweme.freeflowcard.data.a.a().a(c2);
                }
                if (PatchProxy.isSupport(new Object[0], null, h.f33090a, true, 21312, new Class[0], Boolean.TYPE)) {
                    ((Boolean) PatchProxy.accessDispatch(new Object[0], null, h.f33090a, true, 21312, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    h.a(null);
                }
                com.ss.android.ugc.aweme.im.b.a().updateIMUser(com.ss.android.ugc.aweme.im.b.a(user2));
                return;
            case 5:
                bg.a(new com.ss.android.ugc.aweme.base.a.b(user3));
                return;
            case 6:
                com.ss.android.ugc.aweme.im.b.a().updateIMUser(com.ss.android.ugc.aweme.im.b.a(user2));
                return;
            case 8:
                bg.a(new d());
                return;
            case 9:
                if (bundle2 != null) {
                    str = bundle2.getString("message", "");
                } else {
                    str = "";
                }
                bg.a(new e(str));
                com.ss.android.ugc.aweme.account.c.b().logout("user_logic_delete");
                return;
            case 10:
                bg.b(new com.ss.android.ugc.aweme.base.a.a(user3));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("user_id", user2.getUid());
                } catch (JSONException unused) {
                }
                bg.b(new t("userLogin", jSONObject));
                return;
            case 11:
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getUserSettings();
                break;
        }
    }
}
