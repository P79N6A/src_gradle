package com.ss.android.ugc.aweme.net;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56909a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f56910b;

    /* renamed from: c  reason: collision with root package name */
    public LruCache<String, List<Header>> f56911c = new LruCache<>(50);

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static ah f56912a = new ah();
    }

    public static ah a() {
        return a.f56912a;
    }

    private String b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56909a, false, 60827, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f56909a, false, 60827, new Class[]{String.class}, String.class);
        }
        Uri parse = Uri.parse(str);
        String encodedQuery = parse.getEncodedQuery();
        if (TextUtils.isEmpty(encodedQuery)) {
            return parse.getPath();
        }
        return parse.getPath() + "?" + encodedQuery;
    }

    public final List<Header> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56909a, false, 60826, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str}, this, f56909a, false, 60826, new Class[]{String.class}, List.class);
        }
        String str2 = "";
        String b2 = b(str);
        for (String next : this.f56911c.snapshot().keySet()) {
            String b3 = b(next);
            if (b3.contains(b2) || b2.contains(b3)) {
                str2 = next;
            }
        }
        return this.f56911c.get(str2);
    }
}
