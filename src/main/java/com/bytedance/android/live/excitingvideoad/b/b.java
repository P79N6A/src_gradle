package com.bytedance.android.live.excitingvideoad.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8377a;

    /* renamed from: b  reason: collision with root package name */
    private static b f8378b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final OkHttpClient f8379c = new OkHttpClient();

    public static b a() {
        return f8378b;
    }

    private b() {
    }

    public final void a(List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f8377a, false, 1571, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f8377a, false, 1571, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a(list2, true);
    }

    private void a(String str, a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, null}, this, f8377a, false, 1570, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, null}, this, f8377a, false, 1570, new Class[]{String.class, a.class}, Void.TYPE);
            return;
        }
        this.f8379c.newCall(new Request.Builder().url(str).build()).enqueue(new Callback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8380a;

            public final void onFailure(Call call, IOException iOException) {
            }

            public final void onResponse(Call call, Response response) throws IOException {
                if (PatchProxy.isSupport(new Object[]{call, response}, this, f8380a, false, 1573, new Class[]{Call.class, Response.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{call, response}, this, f8380a, false, 1573, new Class[]{Call.class, Response.class}, Void.TYPE);
                    return;
                }
                if (response != null) {
                    response.body().close();
                }
            }
        });
    }

    public final void a(List<String> list, boolean z) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f8377a, false, 1572, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f8377a, false, 1572, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list2 != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                a(list2.get(i), (a) null);
            }
            if (z) {
                list.clear();
            }
        }
    }
}
