package com.ss.android.account.token;

import android.content.Context;
import android.os.Looper;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.client.Header;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f22674a = false;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f22675b = true;

    public static void a() {
        if (f22674a) {
            c.a().b();
        }
    }

    public static void b() {
        if (f22674a) {
            c.a().h = true;
        }
    }

    public static Map<String, String> a(String str) {
        if (!f22674a) {
            return null;
        }
        LinkedList<Header> linkedList = new LinkedList<>();
        c.a(str, (List<Header>) linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(linkedList.size());
        for (Header header : linkedList) {
            hashMap.put(header.getName(), header.getValue());
        }
        return hashMap;
    }

    public static void a(boolean z) {
        if (f22674a && z != f22675b) {
            c.a().a(z);
            if (z) {
                c.a().b();
            } else {
                c.a().f22687f.removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            }
            f22675b = z;
        }
    }

    public static void a(Context context, b bVar) {
        if (!f22674a) {
            c.f22682a = new c(context, bVar);
            c.a().a(f22675b);
            f22674a = true;
        }
    }

    public static void a(String str, List list, boolean z, c<String> cVar) {
        boolean z2;
        if (f22674a) {
            c a2 = c.a();
            d.a(str, list);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                a2.a(cVar);
                return;
            }
            a2.f22687f.post(new Runnable(str, list, cVar) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f22690a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ List f22691b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ com.bytedance.retrofit2.c f22692c;

                public final void run() {
                    c.this.a(this.f22692c);
                }

                {
                    this.f22690a = r2;
                    this.f22691b = r3;
                    this.f22692c = r4;
                }
            });
        }
    }
}
