package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70198a;

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences f70199b;

    /* renamed from: d  reason: collision with root package name */
    private static volatile d f70200d;

    /* renamed from: c  reason: collision with root package name */
    public Gson f70201c = a.f61120c;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f70202e;

    private d() {
    }

    public final List<String> b() {
        if (PatchProxy.isSupport(new Object[0], this, f70198a, false, 79843, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f70198a, false, 79843, new Class[0], List.class);
        }
        if (this.f70202e == null) {
            this.f70202e = c();
        }
        return this.f70202e;
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f70198a, true, 79842, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f70198a, true, 79842, new Class[0], d.class);
        }
        if (f70200d == null) {
            synchronized (d.class) {
                f70199b = c.a(a.f61119b, "commerce_sticker_unlock", 0);
                f70200d = new d();
            }
        }
        return f70200d;
    }

    private List<String> c() {
        if (PatchProxy.isSupport(new Object[0], this, f70198a, false, 79844, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f70198a, false, 79844, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        try {
            String string = f70199b.getString("sticker_id_info", null);
            if (TextUtils.isEmpty(string)) {
                return arrayList;
            }
            List list = (List) this.f70201c.fromJson(string, new TypeToken<List<String>>() {
            }.getType());
            if (list != null) {
                arrayList.addAll(list);
            }
            return arrayList;
        } catch (Exception unused) {
        }
    }
}
