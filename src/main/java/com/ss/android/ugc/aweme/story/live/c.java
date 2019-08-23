package com.ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.Story;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73121a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f73122b = false;

    /* renamed from: c  reason: collision with root package name */
    private static c f73123c = new c();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73124a;

        /* renamed from: b  reason: collision with root package name */
        Context f73125b;

        /* renamed from: c  reason: collision with root package name */
        User f73126c;

        /* renamed from: d  reason: collision with root package name */
        Rect f73127d;

        /* renamed from: e  reason: collision with root package name */
        HashMap<String, String> f73128e = new HashMap<>();

        /* renamed from: f  reason: collision with root package name */
        String f73129f;
        String g;
        String h;
        String i;
        public Bundle j;
        List<Story> k;
        int l = -1;
        int m;
        public long[] n;

        public final a a(int i2) {
            this.m = i2;
            return this;
        }

        public final a b(String str) {
            this.g = str;
            return this;
        }

        public final a c(String str) {
            this.h = str;
            return this;
        }

        public final a d(String str) {
            this.i = str;
            return this;
        }

        public final a a(Rect rect) {
            this.f73127d = rect;
            return this;
        }

        public final a a(String str) {
            this.f73129f = str;
            return this;
        }

        public final a a(List<Story> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f73124a, false, 84719, new Class[]{List.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{list}, this, f73124a, false, 84719, new Class[]{List.class}, a.class);
            }
            Iterator<Story> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Story next = it2.next();
                if (next.getUserInfo().getUid().equals(this.f73126c.getUid())) {
                    this.l = list.indexOf(next);
                    break;
                }
            }
            this.k = list;
            return this;
        }

        public a(Context context, User user) {
            this.f73125b = context;
            this.f73126c = user;
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f73124a, false, 84720, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f73124a, false, 84720, new Class[]{String.class, String.class}, a.class);
            }
            this.f73128e.put(str, str2);
            return this;
        }
    }

    public static c a() {
        return f73123c;
    }

    public c() {
        if (RxJavaPlugins.getErrorHandler() == null) {
            RxJavaPlugins.setErrorHandler(d.f73131b);
        }
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.addLoginOrLogoutListener(e.f73133b);
        }
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f73121a, false, 84710, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.live.a.e();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73121a, false, 84710, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f73121a, false, 84712, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73121a, false, 84712, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && iUserService.isLogin() && f73122b) {
            z = true;
        }
        return z;
    }

    public static void a(boolean z) {
        f73122b = z;
    }

    private static long c(a aVar) {
        if (aVar.f73126c != null) {
            return aVar.f73126c.roomId;
        }
        return -1;
    }

    private static long d(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f73121a, true, 84715, new Class[]{a.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f73121a, true, 84715, new Class[]{a.class}, Long.TYPE)).longValue();
        }
        String str = null;
        if (aVar2.f73126c != null) {
            str = aVar2.f73126c.getUid();
        }
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    private static List<Long> b(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f73121a, true, 84714, new Class[]{a.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f73121a, true, 84714, new Class[]{a.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (aVar2.k != null) {
            for (Story next : aVar2.k) {
                if (next.getUserInfo() != null) {
                    arrayList.add(Long.valueOf(next.getUserInfo().roomId));
                }
            }
            return arrayList;
        } else if (aVar2.n == null || aVar2.n.length <= 0) {
            return null;
        } else {
            for (long valueOf : aVar2.n) {
                arrayList.add(Long.valueOf(valueOf));
            }
            return arrayList;
        }
    }

    public final void a(a aVar) {
        Bundle bundle;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f73121a, false, 84711, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f73121a, false, 84711, new Class[]{a.class}, Void.TYPE);
            return;
        }
        int i = -1;
        try {
            if (!StringUtils.isEmpty(aVar2.f73129f)) {
                i = Integer.parseInt(aVar2.f73129f);
            }
        } catch (Throwable unused) {
        }
        if (aVar2.j == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar2.j;
        }
        Bundle bundle2 = bundle;
        bundle2.putInt("live.intent.extra.ENTER_LIVE_ORDER", aVar2.l);
        bundle2.putInt("live.intent.extra.BACK_TAB_INDEX", i);
        bundle2.putString("live.intent.extra.REQUEST_ID", aVar2.i);
        bundle2.putLong("anchor_id", d(aVar));
        for (String next : aVar2.f73128e.keySet()) {
            bundle2.putString(next, aVar2.f73128e.get(next));
        }
        if (!TextUtils.isEmpty(aVar2.h)) {
            bundle2.putString("enter_method", aVar2.h);
        }
        bundle2.putParcelable("live.intent.extra.SOURCE_POSITION", aVar2.f73127d);
        com.ss.android.ugc.aweme.live.a.a(aVar2.f73125b, c(aVar), bundle2, aVar2.g, b(aVar));
    }

    public final void a(Context context, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{context, bundle}, this, f73121a, false, 84716, new Class[]{Context.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, bundle}, this, f73121a, false, 84716, new Class[]{Context.class, Bundle.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.live.a.a(context, bundle);
    }

    @Deprecated
    public final void a(Context context, User user, Rect rect, String str) {
        a(context, user, null, null, str);
    }

    @Deprecated
    public static void a(Context context, User user, String str, Bundle bundle) {
        try {
            bundle.putLong("anchor_id", Long.valueOf(user.getUid()).longValue());
        } catch (Exception unused) {
        }
        if (FeedPagerAdapter.b(user.roomId)) {
            context.startActivity(new Intent(context, LiveDetailActivity.class));
        } else {
            com.ss.android.ugc.aweme.live.a.a(context, user.roomId, bundle, str);
        }
    }

    @Deprecated
    private static void a(Context context, User user, Rect rect, String str, String str2) {
        int i;
        try {
            if (!StringUtils.isEmpty(null)) {
                i = Integer.parseInt(null);
                Bundle bundle = new Bundle();
                bundle.putInt("live.intent.extra.ENTER_LIVE_ORDER", -1);
                bundle.putInt("live.intent.extra.BACK_TAB_INDEX", i);
                bundle.putParcelable("live.intent.extra.SOURCE_POSITION", rect);
                bundle.putLong("anchor_id", Long.valueOf(user.getUid()).longValue());
                com.ss.android.ugc.aweme.live.a.a(context, user.roomId, bundle, str2);
            }
        } catch (Throwable unused) {
        }
        i = -1;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("live.intent.extra.ENTER_LIVE_ORDER", -1);
        bundle2.putInt("live.intent.extra.BACK_TAB_INDEX", i);
        bundle2.putParcelable("live.intent.extra.SOURCE_POSITION", rect);
        try {
            bundle2.putLong("anchor_id", Long.valueOf(user.getUid()).longValue());
        } catch (Exception unused2) {
        }
        com.ss.android.ugc.aweme.live.a.a(context, user.roomId, bundle2, str2);
    }
}
