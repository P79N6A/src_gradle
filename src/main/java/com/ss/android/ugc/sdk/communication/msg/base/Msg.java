package com.ss.android.ugc.sdk.communication.msg.base;

import android.content.ComponentName;
import android.os.Bundle;

public interface Msg {

    public @interface Type {
    }

    ComponentName a();

    void a(Bundle bundle);

    String b();

    String c();
}
