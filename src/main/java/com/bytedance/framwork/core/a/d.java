package com.bytedance.framwork.core.a;

import android.content.Context;
import com.bytedance.framwork.core.a.d.a;
import com.bytedance.framwork.core.a.e.b;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class d implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f20113a = true;

    /* renamed from: b  reason: collision with root package name */
    private c f20114b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<com.bytedance.framwork.core.a.b.a> f20115c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private final int f20116d = 5;

    /* renamed from: e  reason: collision with root package name */
    private long f20117e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final int f20118f = 120000;
    private String g;

    public final void a(long j) {
        if (this.f20113a) {
            a(j, false);
        }
    }

    public d(Context context, String str) {
        this.f20114b = c.a(context);
        this.g = str;
    }

    private boolean a(long j, boolean z) {
        LinkedList linkedList;
        int size = this.f20115c.size();
        if (size <= 0 || (size < 5 && j - this.f20117e <= 120000)) {
            return false;
        }
        this.f20117e = j;
        synchronized (this.f20115c) {
            linkedList = new LinkedList(this.f20115c);
            this.f20115c.clear();
        }
        if (!b.a(linkedList)) {
            try {
                this.f20114b.a(this.g, (List) linkedList);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public final void a(String str, String str2, JSONObject jSONObject) {
        if (this.f20113a && jSONObject != null) {
            com.bytedance.framwork.core.a.b.a aVar = new com.bytedance.framwork.core.a.b.a(this.g, str, str2, jSONObject.toString(), System.currentTimeMillis());
            if (this.f20115c.size() >= 2000) {
                this.f20115c.poll();
            }
            this.f20115c.add(aVar);
        }
    }
}
