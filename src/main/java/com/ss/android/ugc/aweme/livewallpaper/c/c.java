package com.ss.android.ugc.aweme.livewallpaper.c;

import a.i;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.video.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53673a;
    private static c g = new c();

    /* renamed from: b  reason: collision with root package name */
    public LiveWallPaperBean f53674b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, a> f53675c;

    /* renamed from: d  reason: collision with root package name */
    private List<LiveWallPaperBean> f53676d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    private Gson f53677e = new Gson();

    /* renamed from: f  reason: collision with root package name */
    private d f53678f;
    private ContentResolver h;

    public interface a {
        void a(boolean z, String str);
    }

    public static c a() {
        return g;
    }

    private void d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f53673a, false, 56263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53673a, false, 56263, new Class[0], Void.TYPE);
            return;
        }
        Iterator<LiveWallPaperBean> it2 = this.f53676d.iterator();
        while (it2.hasNext()) {
            LiveWallPaperBean next = it2.next();
            if (!next.isValid()) {
                z = true;
                a(next);
                it2.remove();
            }
        }
        if (z && this.f53678f != null) {
            this.f53678f.b(this.f53677e.toJson((Object) this.f53676d));
        }
    }

    private c() {
        try {
            this.f53678f = (d) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), d.class);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.util.c.a("LiveWallPaperManager getSP failed " + th.getMessage());
        }
        if (this.f53678f != null) {
            this.f53674b = LiveWallPaperBean.newBuilder().c(this.f53678f.c("")).a(this.f53678f.a(0)).b(this.f53678f.c(0)).d(this.f53678f.e("")).a();
        } else {
            this.f53674b = LiveWallPaperBean.newBuilder().a();
        }
        this.f53676d = c();
        this.f53675c = new HashMap();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f53673a, false, 56258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53673a, false, 56258, new Class[0], Void.TYPE);
        } else if (this.f53674b.isValid() && !c(this.f53674b.getId())) {
            this.f53676d.add(0, LiveWallPaperBean.newBuilder().a(this.f53674b.getId()).b(this.f53674b.getThumbnailPath()).c(this.f53674b.getVideoPath()).a(this.f53674b.getWidth()).b(this.f53674b.getHeight()).d(this.f53674b.getSource()).a());
            if (this.f53678f != null) {
                this.f53678f.b(this.f53677e.toJson((Object) this.f53676d));
            }
        }
    }

    public final List<LiveWallPaperBean> c() {
        List list;
        if (PatchProxy.isSupport(new Object[0], this, f53673a, false, 56262, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f53673a, false, 56262, new Class[0], List.class);
        } else if (!CollectionUtils.isEmpty(this.f53676d)) {
            d();
            return this.f53676d;
        } else {
            String str = "";
            if (this.f53678f != null) {
                str = this.f53678f.a("");
            }
            if (TextUtils.isEmpty(str)) {
                return new LinkedList();
            }
            try {
                list = (List) this.f53677e.fromJson(str, new TypeToken<List<LiveWallPaperBean>>() {
                }.getType());
            } catch (Exception unused) {
                list = null;
            }
            if (CollectionUtils.isEmpty(list)) {
                return new LinkedList();
            }
            this.f53676d.addAll(list);
            d();
            return this.f53676d;
        }
    }

    private void a(LiveWallPaperBean liveWallPaperBean) {
        final LiveWallPaperBean liveWallPaperBean2 = liveWallPaperBean;
        if (PatchProxy.isSupport(new Object[]{liveWallPaperBean2}, this, f53673a, false, 56260, new Class[]{LiveWallPaperBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{liveWallPaperBean2}, this, f53673a, false, 56260, new Class[]{LiveWallPaperBean.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new Callable<Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53679a;

            public final /* synthetic */ Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f53679a, false, 56268, new Class[0], Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[0], this, f53679a, false, 56268, new Class[0], Void.class);
                }
                b.c(liveWallPaperBean2.getThumbnailPath());
                b.c(liveWallPaperBean2.getVideoPath());
                return null;
            }
        });
    }

    private ComponentName b(Activity activity) {
        ComponentName componentName;
        if (PatchProxy.isSupport(new Object[]{activity}, this, f53673a, false, 56265, new Class[]{Activity.class}, ComponentName.class)) {
            return (ComponentName) PatchProxy.accessDispatch(new Object[]{activity}, this, f53673a, false, 56265, new Class[]{Activity.class}, ComponentName.class);
        }
        if (e.d()) {
            componentName = new ComponentName("com.ss.android.ugc.aweme.livewallpaper", "com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper");
        } else {
            componentName = new ComponentName(activity.getPackageName(), AmeLiveWallpaper.class.getName());
        }
        return componentName;
    }

    private boolean c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f53673a, false, 56261, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f53673a, false, 56261, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (CollectionUtils.isEmpty(this.f53676d) || TextUtils.isEmpty(str)) {
            return false;
        } else {
            for (LiveWallPaperBean id : this.f53676d) {
                if (str.equals(id.getId())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f53673a, false, 56266, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f53673a, false, 56266, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (e.d()) {
            if (this.h == null) {
                this.h = context.getContentResolver();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("video_width", this.f53674b.getWidth());
            bundle.putInt("video_height", this.f53674b.getHeight());
            bundle.putString("source", this.f53674b.getSource());
            try {
                this.h.call(b.f53672a, "call_plugin", "", bundle);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.util.c.a("notifyWallpaperService " + e2.getMessage());
                e.a(1, "notifyWallpaperService Unknow content uri");
            }
        } else {
            Intent intent = new Intent();
            intent.setClass(context, AmeLiveWallpaper.class);
            intent.putExtra("video_path", this.f53674b.getVideoPath());
            intent.putExtra("video_width", this.f53674b.getWidth());
            intent.putExtra("video_height", this.f53674b.getHeight());
            intent.putExtra("source", this.f53674b.getSource());
            if (context.startService(intent) == null) {
                e.a(1, "start livewallpaper service fail");
            }
        }
    }

    public final void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f53673a, false, 56264, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f53673a, false, 56264, new Class[]{Activity.class}, Void.TYPE);
        } else if (activity == null || activity.isFinishing()) {
            e.a(1, "context is finish");
        } else if (!b.b(this.f53674b.getVideoPath())) {
            e.a(1, "video path is not exist");
        } else {
            if (this.f53678f != null) {
                this.f53678f.d(this.f53674b.getVideoPath());
                this.f53678f.b(this.f53674b.getWidth());
                this.f53678f.d(this.f53674b.getHeight());
                this.f53678f.f(this.f53674b.getSource());
            }
            i.a((Callable<TResult>) new Callable<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53683a;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f53683a, false, 56269, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, f53683a, false, 56269, new Class[0], Void.class);
                    }
                    b.c(e.b());
                    b.c(c.this.f53674b.getVideoPath(), e.b());
                    return null;
                }
            });
            if (e.a((Context) activity, activity.getPackageName())) {
                a((Context) activity);
                return;
            }
            Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
            intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", b(activity));
            try {
                activity.startActivityForResult(intent, 100);
            } catch (Exception unused) {
                com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.c4i).a();
                e.a(1, "start livewallpaper activity fail");
            }
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f53673a, false, 56259, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f53673a, false, 56259, new Class[]{String.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f53676d) && !TextUtils.isEmpty(str)) {
            Iterator<LiveWallPaperBean> it2 = this.f53676d.iterator();
            while (it2.hasNext()) {
                LiveWallPaperBean next = it2.next();
                if (str.equals(next.getId())) {
                    a(next);
                    it2.remove();
                    if (this.f53678f != null) {
                        this.f53678f.b(this.f53677e.toJson((Object) this.f53676d));
                    }
                    return;
                }
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f53673a, false, 56256, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f53673a, false, 56256, new Class[]{String.class}, Void.TYPE);
        } else if (this.f53675c.size() != 0) {
            this.f53675c.remove(str);
        }
    }

    public final void a(String str, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, this, f53673a, false, 56255, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2}, this, f53673a, false, 56255, new Class[]{String.class, a.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            this.f53675c.put(str2, aVar2);
        }
    }
}
