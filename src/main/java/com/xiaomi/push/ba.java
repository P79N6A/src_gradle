package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.clientreport.data.a;
import com.xiaomi.clientreport.processor.d;

public class ba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f81854a;

    /* renamed from: a  reason: collision with other field name */
    private a f169a;

    /* renamed from: a  reason: collision with other field name */
    private d f170a;

    public ba(Context context, a aVar, d dVar) {
        this.f81854a = context;
        this.f169a = aVar;
        this.f170a = dVar;
    }

    public void run() {
        if (this.f170a != null) {
            this.f170a.a(this.f169a);
        }
    }
}
