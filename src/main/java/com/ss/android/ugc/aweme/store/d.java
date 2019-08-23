package com.ss.android.ugc.aweme.store;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.List;
import java.util.Vector;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71748a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f71749c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f71750d = a.values().length;

    /* renamed from: b  reason: collision with root package name */
    public User f71751b;

    /* renamed from: e  reason: collision with root package name */
    private LruCache<Integer, Object> f71752e = new LruCache<>(f71750d);

    /* renamed from: f  reason: collision with root package name */
    private LruCache<Integer, Boolean> f71753f = new LruCache<>(f71750d);
    private b g;
    private LruCache<Integer, String> h;
    private List<String> i;

    public enum a {
        POST(new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71754a;

            public final Object a(Object[] objArr) throws Exception {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f71754a, false, 82123, new Class[]{Object[].class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{objArr}, this, f71754a, false, 82123, new Class[]{Object[].class}, Object.class);
                }
                Aweme aweme = objArr[0];
                if (PatchProxy.isSupport(new Object[]{aweme}, null, a.f71742a, true, 82103, new Class[]{Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme}, null, a.f71742a, true, 82103, new Class[]{Aweme.class}, Void.TYPE);
                } else {
                    new StringBuilder("preloadPostList ").append(aweme.getAuthorUid());
                    AwemeApi.a(true, aweme.getAuthorUid(), aweme.getAuthor().getSecUid(), 0, 0, 20, a.a(aweme.getAid(), a.POST));
                }
                return null;
            }
        }),
        PROFILE(new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71755a;

            public final Object a(Object[] objArr) throws Exception {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f71755a, false, 82124, new Class[]{Object[].class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{objArr}, this, f71755a, false, 82124, new Class[]{Object[].class}, Object.class);
                }
                Aweme aweme = objArr[0];
                if (PatchProxy.isSupport(new Object[]{aweme}, null, a.f71742a, true, 82104, new Class[]{Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme}, null, a.f71742a, true, 82104, new Class[]{Aweme.class}, Void.TYPE);
                } else {
                    new StringBuilder("preloadProfile ").append(aweme.getAuthorUid());
                    com.ss.android.ugc.aweme.profile.api.d.b(com.ss.android.ugc.aweme.app.api.a.a(aweme.getAuthorUid()), true, a.a(aweme.getAid(), a.PROFILE));
                }
                return null;
            }
        }),
        COMMENT(new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71756a;

            public final Object a(Object[] objArr) throws Exception {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f71756a, false, 82125, new Class[]{Object[].class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{objArr}, this, f71756a, false, 82125, new Class[]{Object[].class}, Object.class);
                }
                Aweme aweme = objArr[0];
                if (PatchProxy.isSupport(new Object[]{aweme}, null, a.f71742a, true, 82105, new Class[]{Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme}, null, a.f71742a, true, 82105, new Class[]{Aweme.class}, Void.TYPE);
                } else {
                    new StringBuilder("preloadComment ").append(aweme.getAuthorUid());
                    CommentApi.a(aweme.getAid(), 0, 20, 2, "", "", e.a(), e.b(), true, a.a(aweme.getAid(), a.COMMENT));
                }
                return null;
            }
        });
        
        public static ChangeQuickRedirect changeQuickRedirect;
        @SuppressLint({"SerializableImplementsRule"})
        private c preloader;

        public final c getPreloader() {
            return this.preloader;
        }

        private a(c cVar) {
            this.preloader = cVar;
        }
    }

    private d() {
        int i2 = f71750d;
        this.g = new b(i2 * i2);
        int i3 = f71750d;
        this.h = new LruCache<>(i3 * i3);
        this.i = new Vector();
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f71748a, true, 82109, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f71748a, true, 82109, new Class[0], d.class);
        }
        if (f71749c == null) {
            synchronized (d.class) {
                if (f71749c == null) {
                    f71749c = new d();
                }
            }
        }
        return f71749c;
    }

    public static int a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, f71748a, true, 82110, new Class[]{String.class}, Integer.TYPE)) {
            return str.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, null, f71748a, true, 82110, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82113, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82113, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.a(i2);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82114, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82114, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.b(i2);
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82118, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82118, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71753f.put(Integer.valueOf(i2), Boolean.TRUE);
    }

    public final Boolean e(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82119, new Class[]{Integer.TYPE}, Boolean.class)) {
            return this.f71753f.get(Integer.valueOf(i2));
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82119, new Class[]{Integer.TYPE}, Boolean.class);
    }

    public final Object a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82112, new Class[]{Integer.TYPE}, Object.class)) {
            return this.f71752e.get(Integer.valueOf(i2));
        }
        return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71748a, false, 82112, new Class[]{Integer.TYPE}, Object.class);
    }

    public final boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f71748a, false, 82117, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f71748a, false, 82117, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.i.contains(str)) {
            this.i.remove(str);
            return true;
        } else {
            StringBuilder sb = new StringBuilder("cache = ");
            sb.append(this.f71752e.size());
            sb.append("\ncacheLock = ");
            sb.append(this.g.a());
            sb.append("\nhitMap = ");
            sb.append(this.h.size());
            sb.append("\nhitList=");
            sb.append(this.i.size());
            return false;
        }
    }

    public final void a(int i2, Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), obj2}, this, f71748a, false, 82111, new Class[]{Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), obj2}, this, f71748a, false, 82111, new Class[]{Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f71752e.put(Integer.valueOf(i2), obj2);
    }

    public final void a(int i2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f71748a, false, 82116, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f71748a, false, 82116, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder("markHit hit = ");
        sb.append(i2);
        sb.append(" ");
        sb.append(str2);
        if (!TextUtils.isEmpty(str)) {
            this.h.put(Integer.valueOf(i2), str2);
        }
    }

    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f71748a, false, 82115, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f71748a, false, 82115, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String str2 = this.h.get(Integer.valueOf(i2));
            StringBuilder sb = new StringBuilder("store hit = ");
            sb.append(i2);
            sb.append(" ");
            sb.append(str2);
            if (str2 != null) {
                this.i.add(str2);
            }
        }
    }
}
