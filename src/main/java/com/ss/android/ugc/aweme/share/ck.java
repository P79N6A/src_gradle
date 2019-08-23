package com.ss.android.ugc.aweme.share;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.List;

public final class ck {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64972a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f64973b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f64974c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f64975d;

    /* renamed from: e  reason: collision with root package name */
    public String[] f64976e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f64977f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public User m;
    public String n;
    public boolean o = true;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s = true;
    public boolean t = true;
    public boolean u;
    public a v;
    public b w;
    public List<String> x = Collections.emptyList();
    public String y;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f64978a;

        /* renamed from: b  reason: collision with root package name */
        public String f64979b;

        /* renamed from: c  reason: collision with root package name */
        public String f64980c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f64981d;

        /* renamed from: e  reason: collision with root package name */
        public String f64982e;

        /* renamed from: f  reason: collision with root package name */
        public String f64983f;
        public long g;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f64984a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f64985b;
    }

    public final void a(List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f64972a, false, 73370, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f64972a, false, 73370, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list)) {
            this.x = list2;
        }
    }
}
