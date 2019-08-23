package com.ss.android.ugc.sdk.communication.msg.base;

import android.os.Bundle;

public abstract class b extends a implements d {
    public b(Bundle bundle) {
        super(bundle);
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("KEY_INTENT_TYPE", 0);
    }

    public b(String str, int i, String str2) {
        super(str, 0, str2);
    }
}
