package com.taobao.accs.data;

import java.util.LinkedHashMap;
import java.util.Map;

public class MessageHandler$1 extends LinkedHashMap<String, String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f78934a;

    MessageHandler$1(d dVar) {
        this.f78934a = dVar;
    }

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Map.Entry<String, String> entry) {
        if (size() > 50) {
            return true;
        }
        return false;
    }
}
