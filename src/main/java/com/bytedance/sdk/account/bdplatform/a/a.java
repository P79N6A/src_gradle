package com.bytedance.sdk.account.bdplatform.a;

import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.bdplatform.b.e;

public interface a {

    /* renamed from: com.bytedance.sdk.account.bdplatform.a.a$a  reason: collision with other inner class name */
    public interface C0232a {
        com.bytedance.sdk.account.bdplatform.b.a a(c.a aVar, String str);

        com.bytedance.sdk.account.bdplatform.b.b a(c.a aVar);

        e a();
    }

    public interface b {
        boolean a();

        boolean a(c.a aVar);

        void b();

        boolean b(c.a aVar);
    }

    public interface c {
        void onAuthLogin(com.bytedance.sdk.account.bdplatform.b.b bVar);

        void onCancel(c.b bVar);

        void onError(c.b bVar);

        boolean onNeedLogin();

        void onSuccess(c.b bVar);

        void onUpdateLoginStatus(boolean z);
    }
}
