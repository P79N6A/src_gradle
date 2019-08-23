package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaseConnection$1 extends LinkedHashMap<Integer, Message> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f78986a;

    BaseConnection$1(b bVar) {
        this.f78986a = bVar;
    }

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Map.Entry<Integer, Message> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
