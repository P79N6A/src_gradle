package com.ss.android.ugc.sdk.communication;

import android.content.Intent;
import com.ss.android.ugc.sdk.communication.msg.base.Msg;
import com.ss.android.ugc.sdk.communication.msg.base.e;

public interface a {

    /* renamed from: com.ss.android.ugc.sdk.communication.a$a  reason: collision with other inner class name */
    public interface C0825a {
        void a(e eVar);
    }

    public interface b<T extends e> {
        void a(T t);
    }

    boolean a(Intent intent, C0825a aVar);

    boolean a(Msg msg, b bVar);

    boolean a(String str);

    boolean b(String str);
}
