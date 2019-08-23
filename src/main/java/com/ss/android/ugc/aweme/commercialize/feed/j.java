package com.ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.HashMap;
import java.util.Map;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38834a;

    /* renamed from: b  reason: collision with root package name */
    public static j f38835b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Aweme> f38836c = new HashMap();

    public static j a() {
        if (PatchProxy.isSupport(new Object[0], null, f38834a, true, 30590, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], null, f38834a, true, 30590, new Class[0], j.class);
        }
        if (f38835b == null) {
            f38835b = new j();
        }
        return f38835b;
    }

    public final Aweme a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f38834a, false, 30591, new Class[]{Aweme.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{aweme}, this, f38834a, false, 30591, new Class[]{Aweme.class}, Aweme.class);
        } else if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        } else {
            if (this.f38836c.containsKey(aweme.getAid())) {
                Aweme aweme2 = this.f38836c.get(aweme.getAid());
                aweme2.update(aweme);
                return aweme2;
            }
            this.f38836c.put(aweme.getAid(), aweme);
            return aweme;
        }
    }

    public final Aweme b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f38834a, false, 30593, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str2}, this, f38834a, false, 30593, new Class[]{String.class}, Aweme.class);
        }
        for (Aweme next : this.f38836c.values()) {
            if (TextUtils.equals(next.getAwemeRawAdIdStr(), str2)) {
                return next;
            }
        }
        return null;
    }

    public final AwemeStatistics c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38834a, false, 30594, new Class[]{String.class}, AwemeStatistics.class)) {
            return (AwemeStatistics) PatchProxy.accessDispatch(new Object[]{str}, this, f38834a, false, 30594, new Class[]{String.class}, AwemeStatistics.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            Aweme a2 = a(str);
            if (a2 == null) {
                return null;
            }
            AwemeStatistics statistics = a2.getStatistics();
            if (statistics == null) {
                statistics = new AwemeStatistics();
                a2.setStatistics(statistics);
            }
            return statistics;
        }
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38834a, false, 30595, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38834a, false, 30595, new Class[]{String.class}, Void.TYPE);
            return;
        }
        AwemeStatistics c2 = c(str);
        if (c2 != null) {
            c2.setCommentCount(c2.getCommentCount() + 1);
        }
    }

    public final Aweme a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38834a, false, 30592, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str}, this, f38834a, false, 30592, new Class[]{String.class}, Aweme.class);
        }
        Aweme aweme = null;
        if (this.f38836c.containsKey(str)) {
            aweme = this.f38836c.get(str);
        }
        return aweme;
    }

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f38834a, false, 30596, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f38834a, false, 30596, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AwemeStatistics c2 = c(str);
        if (c2 != null) {
            c2.setCommentCount(i);
        }
    }
}
