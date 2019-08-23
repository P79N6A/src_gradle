package com.ss.android.ugc.aweme.app.e;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34164a;

    /* renamed from: b  reason: collision with root package name */
    private List<b> f34165b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34166a = new d((byte) 0);
    }

    public static d a() {
        return a.f34166a;
    }

    private d() {
        this.f34165b = new ArrayList();
        a(new c());
        a(new a());
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    private void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f34164a, false, 23526, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f34164a, false, 23526, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (this.f34165b == null) {
            this.f34165b = new ArrayList();
        }
        if (!this.f34165b.contains(bVar)) {
            this.f34165b.add(bVar);
        }
    }

    public final Intent a(Activity activity, Uri uri, boolean z) {
        Activity activity2 = activity;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{activity2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34164a, false, 23527, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{activity2, uri2, Byte.valueOf(z)}, this, f34164a, false, 23527, new Class[]{Activity.class, Uri.class, Boolean.TYPE}, Intent.class);
        }
        String host = uri.getHost();
        for (b next : this.f34165b) {
            if (TextUtils.equals(host, next.a())) {
                if (PatchProxy.isSupport(new Object[]{uri2, Byte.valueOf(z)}, next, b.f34158b, false, 23523, new Class[]{Uri.class, Boolean.TYPE}, Void.TYPE)) {
                    b bVar = next;
                    PatchProxy.accessDispatch(new Object[]{uri2, Byte.valueOf(z)}, bVar, b.f34158b, false, 23523, new Class[]{Uri.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    next.f34159c = uri2;
                    next.f34160d = uri.getHost();
                    next.f34161e = uri.getPath();
                    next.f34162f = z;
                }
                return next.a(activity2);
            }
            boolean z2 = z;
        }
        return null;
    }
}
