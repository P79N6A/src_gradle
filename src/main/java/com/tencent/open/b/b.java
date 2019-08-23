package com.tencent.open.b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

public final class b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f79681a = new HashMap<>();

    public b(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f79681a.put(str, bundle.getString(str));
            }
        }
    }
}
