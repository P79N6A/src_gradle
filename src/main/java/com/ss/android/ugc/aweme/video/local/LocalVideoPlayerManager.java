package com.ss.android.ugc.aweme.video.local;

import a.g;
import a.i;
import android.arch.lifecycle.LifecycleObserver;
import android.content.SharedPreferences;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.common.d.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.playerkit.b.b;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public class LocalVideoPlayerManager implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76123a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f76124b = "LocalVideoPlayerManager";

    /* renamed from: d  reason: collision with root package name */
    private static LocalVideoPlayerManager f76125d;

    /* renamed from: c  reason: collision with root package name */
    public c f76126c = new c();

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f76127e = new AtomicBoolean(false);

    public interface a {
        void a();

        void a(String str);
    }

    @MainThread
    public final boolean a(String str, String str2, @NonNull a aVar) {
        String str3 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str, str3, aVar2}, this, f76123a, false, 89145, new Class[]{String.class, String.class, a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str3, aVar2}, this, f76123a, false, 89145, new Class[]{String.class, String.class, a.class}, Boolean.TYPE)).booleanValue();
        }
        String a2 = a(str);
        boolean z = !TextUtils.isEmpty(a2);
        if (z) {
            i.a((Callable<TResult>) new e<TResult>(a2, str3)).a((g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(aVar2, str3), i.f1052b);
        }
        b.a(f76124b, "download use local video:" + z);
        return z;
    }

    private LocalVideoPlayerManager() {
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f76123a, true, 89158, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76123a, true, 89158, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return AbTestManager.a().d().isLocalVideoPlayEnable;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f76123a, false, 89153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76123a, false, 89153, new Class[0], Void.TYPE);
            return;
        }
        e();
    }

    public static LocalVideoPlayerManager a() {
        if (PatchProxy.isSupport(new Object[0], null, f76123a, true, 89141, new Class[0], LocalVideoPlayerManager.class)) {
            return (LocalVideoPlayerManager) PatchProxy.accessDispatch(new Object[0], null, f76123a, true, 89141, new Class[0], LocalVideoPlayerManager.class);
        }
        if (f76125d == null) {
            synchronized (LocalVideoPlayerManager.class) {
                if (f76125d == null) {
                    f76125d = new LocalVideoPlayerManager();
                }
            }
        }
        return f76125d;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f76123a, false, 89155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76123a, false, 89155, new Class[0], Void.TYPE);
            return;
        }
        c();
        SharedPreferences a2 = c.a(k.a(), "aweme_local_video", 0);
        String json = com.bytedance.android.live.a.a().toJson((Object) this.f76126c.f76150b);
        String str = f76124b;
        b.a(str, "data save:" + json);
        a2.edit().putString("extra_data", json).apply();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Map<java.lang.String, com.ss.android.ugc.aweme.video.local.g>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.ss.android.ugc.aweme.video.local.g> f() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f76123a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            r4 = 0
            r5 = 89156(0x15c44, float:1.24934E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f76123a
            r5 = 0
            r6 = 89156(0x15c44, float:1.24934E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.app.k r1 = com.ss.android.ugc.aweme.app.k.a()
            java.lang.String r2 = "aweme_local_video"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r1, r2, r0)
            java.lang.String r1 = "extra_data"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r1 = f76124b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "data restore:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.ss.android.ugc.playerkit.b.b.a(r1, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0066
            com.google.gson.Gson r1 = com.bytedance.android.live.a.a()
            com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager$1 r2 = new com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager$1
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, (java.lang.reflect.Type) r2)
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.f():java.util.Map");
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76123a, false, 89157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76123a, false, 89157, new Class[0], Void.TYPE);
        } else if (d() && !this.f76127e.get()) {
            Map<String, g> f2 = f();
            synchronized (this) {
                if (this.f76127e.compareAndSet(false, true) && f2 != null && !f2.isEmpty()) {
                    this.f76126c.a(f2.values());
                }
            }
        }
    }

    private g a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f76123a, false, 89151, new Class[]{Aweme.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{aweme}, this, f76123a, false, 89151, new Class[]{Aweme.class}, g.class);
        }
        return a(aweme.getAid(), aweme.getAuthorUid(), aweme.isVr(), aweme.getVideo());
    }

    private boolean b(String str) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f76123a, false, 89147, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f76123a, false, 89147, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || !d()) {
            return false;
        } else {
            if (PatchProxy.isSupport(new Object[]{str}, this, f76123a, false, 89148, new Class[]{String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f76123a, false, 89148, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else {
                g a2 = this.f76126c.a(str);
                if (a2 == null) {
                    z = false;
                } else {
                    z = TextUtils.equals(a2.authorId, d.a().getCurUserId());
                }
            }
            if (!z) {
                return false;
            }
            if (PatchProxy.isSupport(new Object[]{str}, this, f76123a, false, 89149, new Class[]{String.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f76123a, false, 89149, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else {
                z2 = this.f76126c.b(this.f76126c.a(str));
                if (z2) {
                    this.f76126c.b(str);
                }
                String str2 = f76124b;
                b.a(str2, "isLocalVideoExpired:" + z2);
            }
            if (!z2) {
                return true;
            }
            return false;
        }
    }

    public String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76123a, false, 89154, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f76123a, false, 89154, new Class[]{String.class}, String.class);
        }
        c();
        if (!b(str)) {
            return null;
        }
        g a2 = this.f76126c.a(str2);
        if (a2 == null) {
            return "";
        }
        return a2.localPath;
    }

    @MainThread
    public final boolean a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f76123a, false, 89146, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f76123a, false, 89146, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        c();
        return this.f76126c.a(j2);
    }

    static final /* synthetic */ Object a(String str, String str2) throws Exception {
        try {
            f.a(new File(str), new File(str2));
        } catch (IOException e2) {
            i.a((Exception) e2);
        }
        return null;
    }

    @MainThread
    public final void a(String str, @Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{str, aweme}, this, f76123a, false, 89142, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aweme}, this, f76123a, false, 89142, new Class[]{String.class, Aweme.class}, Void.TYPE);
        } else if (d() && aweme != null) {
            c();
            g a2 = a(aweme);
            a2.localPath = str;
            this.f76126c.a(a2);
            b();
        }
    }

    public g a(String str, String str2, boolean z, Video video) {
        String str3 = str;
        String str4 = str2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0), video}, this, f76123a, false, 89152, new Class[]{String.class, String.class, Boolean.TYPE, Video.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z), video}, this, f76123a, false, 89152, new Class[]{String.class, String.class, Boolean.TYPE, Video.class}, g.class);
        }
        g gVar = new g(str3);
        gVar.authorId = str4;
        gVar.setVr(z);
        if (video != null) {
            gVar.setDuration((double) video.getDuration());
            gVar.setWidth(video.getWidth());
            gVar.setHeight(video.getHeight());
            if (video.getProperPlayAddr() != null) {
                gVar.setUri(video.getProperPlayAddr().getUri());
                if (video.getPlayAddrH265() != null) {
                    z2 = true;
                }
                gVar.setH265(z2);
            }
        }
        return gVar;
    }
}
