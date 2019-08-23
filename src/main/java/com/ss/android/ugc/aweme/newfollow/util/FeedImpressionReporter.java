package com.ss.android.ugc.aweme.newfollow.util;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FeedImpressionReporter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57390a;

    /* renamed from: b  reason: collision with root package name */
    public volatile HashSet<String> f57391b;

    /* renamed from: c  reason: collision with root package name */
    public volatile HashSet<String> f57392c;

    /* renamed from: d  reason: collision with root package name */
    private HashSet<String> f57393d;

    /* renamed from: e  reason: collision with root package name */
    private volatile List<String> f57394e;

    public @interface Keys {
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57395a;

        /* renamed from: b  reason: collision with root package name */
        private static final Map<String, FeedImpressionReporter> f57396b = new ConcurrentHashMap(1);

        public static FeedImpressionReporter a(@Keys String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, null, f57395a, true, 61886, new Class[]{String.class}, FeedImpressionReporter.class)) {
                return (FeedImpressionReporter) PatchProxy.accessDispatch(new Object[]{str2}, null, f57395a, true, 61886, new Class[]{String.class}, FeedImpressionReporter.class);
            }
            FeedImpressionReporter feedImpressionReporter = f57396b.get(str2);
            if (feedImpressionReporter == null) {
                feedImpressionReporter = new FeedImpressionReporter((byte) 0);
                f57396b.put(str2, feedImpressionReporter);
            }
            return feedImpressionReporter;
        }
    }

    private FeedImpressionReporter() {
        f();
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f57390a, false, 61884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57390a, false, 61884, new Class[0], Void.TYPE);
            return;
        }
        e.f().b("to_report_feed_ids", "");
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f57390a, false, 61879, new Class[0], Boolean.TYPE)) {
            return CollectionUtils.isEmpty(this.f57391b);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57390a, false, 61879, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57390a, false, 61883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57390a, false, 61883, new Class[0], Void.TYPE);
            return;
        }
        e.f().b("to_report_feed_ids", c());
    }

    private void f() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f57390a, false, 61878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57390a, false, 61878, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f57390a, false, 61885, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f57390a, false, 61885, new Class[0], String.class);
        } else {
            str = e.f().a("to_report_feed_ids", "");
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        for (String b2 : str.split(",")) {
            b(b2);
        }
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f57390a, false, 61877, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57390a, false, 61877, new Class[0], String.class);
        } else if (CollectionUtils.isEmpty(this.f57394e)) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String append : this.f57394e) {
                sb.append(append);
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f57390a, false, 61880, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57390a, false, 61880, new Class[0], String.class);
        } else if (CollectionUtils.isEmpty(this.f57391b)) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = this.f57391b.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57390a, false, 61882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57390a, false, 61882, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57391b != null) {
            if (!CollectionUtils.isEmpty(this.f57392c)) {
                this.f57391b.removeAll(this.f57392c);
            } else {
                this.f57391b.clear();
            }
        }
        if (this.f57392c != null) {
            this.f57392c.clear();
        }
        g();
    }

    /* synthetic */ FeedImpressionReporter(byte b2) {
        this();
    }

    public static FeedImpressionReporter a(@Keys String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, f57390a, true, 61875, new Class[]{String.class}, FeedImpressionReporter.class)) {
            return a.a(str);
        }
        return (FeedImpressionReporter) PatchProxy.accessDispatch(new Object[]{str}, null, f57390a, true, 61875, new Class[]{String.class}, FeedImpressionReporter.class);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57390a, false, 61881, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57390a, false, 61881, new Class[]{String.class}, Void.TYPE);
        } else if (str != null && !str.isEmpty()) {
            if (this.f57393d == null) {
                this.f57393d = new HashSet<>();
            }
            if (this.f57391b == null) {
                this.f57391b = new HashSet<>();
            }
            if (!this.f57393d.contains(str)) {
                this.f57391b.add(str);
                this.f57393d.add(str);
            }
        }
    }

    public final void a(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57390a, false, 61876, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57390a, false, 61876, new Class[]{List.class}, Void.TYPE);
        } else if (CollectionUtils.isEmpty(list)) {
            if (this.f57394e != null) {
                this.f57394e.clear();
            }
        } else {
            this.f57394e = list;
        }
    }
}
