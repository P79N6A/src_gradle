package com.bytedance.android.live.core.network;

import com.bytedance.android.live.base.model.e;
import java.util.List;
import java.util.Map;

public interface c {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f7858a;

        /* renamed from: b  reason: collision with root package name */
        public List<e> f7859b;

        public a(String str, List<e> list) {
            this.f7858a = str;
            this.f7859b = list;
        }
    }

    a a(a aVar);

    void a(Map<String, String> map);
}
