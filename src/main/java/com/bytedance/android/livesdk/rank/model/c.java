package com.bytedance.android.livesdk.rank.model;

import com.bytedance.android.livesdk.adapter.d;

public class c implements d<c> {

    /* renamed from: a  reason: collision with root package name */
    public String f17030a;

    /* renamed from: b  reason: collision with root package name */
    public int f17031b;

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        if (this == ((c) obj)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        c cVar = (c) obj;
        if (this.f17030a == cVar.f17030a && this.f17031b == cVar.f17031b) {
            return true;
        }
        return false;
    }

    public c(String str, int i) {
        this.f17030a = str;
        this.f17031b = i;
    }
}
