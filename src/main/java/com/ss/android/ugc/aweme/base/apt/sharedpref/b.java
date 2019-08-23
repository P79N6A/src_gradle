package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.a.a;
import com.ss.android.ugc.aweme.bizactivity.m;
import com.ss.android.ugc.aweme.discover.hitrank.e;
import com.ss.android.ugc.aweme.livewallpaper.c.d;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.main.bp;
import com.ss.android.ugc.aweme.poi.e.n;
import com.ss.android.ugc.aweme.setting.b.a;
import com.ss.android.ugc.aweme.setting.j;
import com.ss.android.ugc.aweme.setting.model.IVerifyActionCache;
import com.ss.android.ugc.aweme.u.y;
import com.ss.android.ugc.aweme.video.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34567a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class, Object> f34568b = new ConcurrentHashMap();

    public static <T> T a(Context context, Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{context, cls2}, null, f34567a, true, 24147, new Class[]{Context.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{context, cls2}, null, f34567a, true, 24147, new Class[]{Context.class, Class.class}, Object.class);
        } else if (context == null) {
            return null;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null || cls2 == null || !cls.isInterface()) {
                return null;
            }
            if (com.ss.android.ugc.aweme.antiaddic.lock.entity.b.class.equals(cls2)) {
                T t = f34568b.get(cls2);
                if (t == null || !(t instanceof h)) {
                    t = new h(applicationContext);
                    f34568b.put(cls2, t);
                }
                return t;
            } else if (bm.class.equals(cls2)) {
                T t2 = f34568b.get(cls2);
                if (t2 == null || !(t2 instanceof w)) {
                    t2 = new w(applicationContext);
                    f34568b.put(cls2, t2);
                }
                return t2;
            } else if (bp.class.equals(cls2)) {
                T t3 = f34568b.get(cls2);
                if (t3 == null || !(t3 instanceof x)) {
                    t3 = new x(applicationContext);
                    f34568b.put(cls2, t3);
                }
                return t3;
            } else if (a.class.equals(cls2)) {
                T t4 = f34568b.get(cls2);
                if (t4 == null || !(t4 instanceof f)) {
                    t4 = new f(applicationContext);
                    f34568b.put(cls2, t4);
                }
                return t4;
            } else if (c.a.class.equals(cls2)) {
                T t5 = f34568b.get(cls2);
                if (t5 == null || !(t5 instanceof am)) {
                    t5 = new am(applicationContext);
                    f34568b.put(cls2, t5);
                }
                return t5;
            } else if (com.ss.android.ugc.aweme.r.a.class.equals(cls2)) {
                T t6 = f34568b.get(cls2);
                if (t6 == null || !(t6 instanceof t)) {
                    t6 = new t(applicationContext);
                    f34568b.put(cls2, t6);
                }
                return t6;
            } else if (d.class.equals(cls2)) {
                T t7 = f34568b.get(cls2);
                if (t7 == null || !(t7 instanceof u)) {
                    t7 = new u(applicationContext);
                    f34568b.put(cls2, t7);
                }
                return t7;
            } else if (a.C0691a.class.equals(cls2)) {
                T t8 = f34568b.get(cls2);
                if (t8 == null || !(t8 instanceof ag)) {
                    t8 = new ag(applicationContext);
                    f34568b.put(cls2, t8);
                }
                return t8;
            } else if (n.class.equals(cls2)) {
                T t9 = f34568b.get(cls2);
                if (t9 == null || !(t9 instanceof ac)) {
                    t9 = new ac(applicationContext);
                    f34568b.put(cls2, t9);
                }
                return t9;
            } else if (com.ss.android.ugc.aweme.profile.n.class.equals(cls2)) {
                T t10 = f34568b.get(cls2);
                if (t10 == null || !(t10 instanceof ae)) {
                    t10 = new ae(applicationContext);
                    f34568b.put(cls2, t10);
                }
                return t10;
            } else if (com.ss.android.ugc.aweme.main.b.class.equals(cls2)) {
                T t11 = f34568b.get(cls2);
                if (t11 == null || !(t11 instanceof v)) {
                    t11 = new v(applicationContext);
                    f34568b.put(cls2, t11);
                }
                return t11;
            } else if (com.ss.android.ugc.aweme.base.sharedpref.a.class.equals(cls2)) {
                T t12 = f34568b.get(cls2);
                if (t12 == null || !(t12 instanceof i)) {
                    t12 = new i(applicationContext);
                    f34568b.put(cls2, t12);
                }
                return t12;
            } else if (com.ss.android.ugc.aweme.story.shootvideo.b.class.equals(cls2)) {
                T t13 = f34568b.get(cls2);
                if (t13 == null || !(t13 instanceof al)) {
                    t13 = new al(applicationContext);
                    f34568b.put(cls2, t13);
                }
                return t13;
            } else if (j.class.equals(cls2)) {
                T t14 = f34568b.get(cls2);
                if (t14 == null || !(t14 instanceof af)) {
                    t14 = new af(applicationContext);
                    f34568b.put(cls2, t14);
                }
                return t14;
            } else if (IVerifyActionCache.class.equals(cls2)) {
                T t15 = f34568b.get(cls2);
                if (t15 == null || !(t15 instanceof ah)) {
                    t15 = new ah(applicationContext);
                    f34568b.put(cls2, t15);
                }
                return t15;
            } else if (com.ss.android.ugc.aweme.festival.christmas.b.class.equals(cls2)) {
                T t16 = f34568b.get(cls2);
                if (t16 == null || !(t16 instanceof s)) {
                    t16 = new s(applicationContext);
                    f34568b.put(cls2, t16);
                }
                return t16;
            } else if (com.ss.android.ugc.aweme.u.c.a.class.equals(cls2)) {
                T t17 = f34568b.get(cls2);
                if (t17 == null || !(t17 instanceof aa)) {
                    t17 = new aa(applicationContext);
                    f34568b.put(cls2, t17);
                }
                return t17;
            } else if (y.class.equals(cls2)) {
                T t18 = f34568b.get(cls2);
                if (t18 == null || !(t18 instanceof z)) {
                    t18 = new z(applicationContext);
                    f34568b.put(cls2, t18);
                }
                return t18;
            } else if (com.ss.android.ugc.aweme.feed.i.a.class.equals(cls2)) {
                T t19 = f34568b.get(cls2);
                if (t19 == null || !(t19 instanceof r)) {
                    t19 = new r(applicationContext);
                    f34568b.put(cls2, t19);
                }
                return t19;
            } else if (com.ss.android.ugc.aweme.notification.c.d.class.equals(cls2)) {
                T t20 = f34568b.get(cls2);
                if (t20 == null || !(t20 instanceof ab)) {
                    t20 = new ab(applicationContext);
                    f34568b.put(cls2, t20);
                }
                return t20;
            } else if (com.ss.android.ugc.aweme.discover.presenter.b.class.equals(cls2)) {
                T t21 = f34568b.get(cls2);
                if (t21 == null || !(t21 instanceof o)) {
                    t21 = new o(applicationContext);
                    f34568b.put(cls2, t21);
                }
                return t21;
            } else if (e.class.equals(cls2)) {
                T t22 = f34568b.get(cls2);
                if (t22 == null || !(t22 instanceof n)) {
                    t22 = new n(applicationContext);
                    f34568b.put(cls2, t22);
                }
                return t22;
            } else if (com.ss.android.ugc.aweme.commercialize.loft.e.class.equals(cls2)) {
                T t23 = f34568b.get(cls2);
                if (t23 == null || !(t23 instanceof l)) {
                    t23 = new l(applicationContext);
                    f34568b.put(cls2, t23);
                }
                return t23;
            } else if (com.ss.android.ugc.aweme.main.guide.c.class.equals(cls2)) {
                T t24 = f34568b.get(cls2);
                if (t24 == null || !(t24 instanceof y)) {
                    t24 = new y(applicationContext);
                    f34568b.put(cls2, t24);
                }
                return t24;
            } else if (m.class.equals(cls2)) {
                T t25 = f34568b.get(cls2);
                if (t25 == null || !(t25 instanceof j)) {
                    t25 = new j(applicationContext);
                    f34568b.put(cls2, t25);
                }
                return t25;
            } else if (com.ss.android.ugc.aweme.discover.b.a.class.equals(cls2)) {
                T t26 = f34568b.get(cls2);
                if (t26 == null || !(t26 instanceof m)) {
                    t26 = new m(applicationContext);
                    f34568b.put(cls2, t26);
                }
                return t26;
            } else if (!com.ss.android.ugc.aweme.face2face.b.a.class.equals(cls2)) {
                return null;
            } else {
                T t27 = f34568b.get(cls2);
                if (t27 == null || !(t27 instanceof q)) {
                    t27 = new q(applicationContext);
                    f34568b.put(cls2, t27);
                }
                return t27;
            }
        }
    }
}
