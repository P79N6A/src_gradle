package com.ss.android.ugc.aweme.feed.d;

import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45236a = null;
    public static final String i = "b";

    /* renamed from: b  reason: collision with root package name */
    public int f45237b;

    /* renamed from: c  reason: collision with root package name */
    public int f45238c;

    /* renamed from: d  reason: collision with root package name */
    public int f45239d;

    /* renamed from: e  reason: collision with root package name */
    public int f45240e;

    /* renamed from: f  reason: collision with root package name */
    public int f45241f;
    public int g;
    public a<String, c> h;
    private List<Pair<String, Object>> j;
    private long k;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45242a;

        /* renamed from: b  reason: collision with root package name */
        public int f45243b;

        /* renamed from: c  reason: collision with root package name */
        public int f45244c;

        /* renamed from: d  reason: collision with root package name */
        public int f45245d;

        /* renamed from: e  reason: collision with root package name */
        public int f45246e;

        /* renamed from: f  reason: collision with root package name */
        public int f45247f;

        private a() {
        }

        public static a a(Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{aweme}, null, f45242a, true, 41103, new Class[]{Aweme.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45242a, true, 41103, new Class[]{Aweme.class}, a.class);
            }
            a aVar = new a();
            if (aweme == null || aweme.getStatistics() == null) {
                return aVar;
            }
            AwemeStatistics statistics = aweme.getStatistics();
            aVar.f45243b = statistics.getPlayCount();
            aVar.f45244c = statistics.getCommentCount();
            aVar.f45245d = statistics.getDiggCount();
            aVar.f45246e = statistics.getShareCount();
            if (aweme.getAuthor() != null) {
                aVar.f45247f = aweme.getAuthor().getFollowStatus();
            }
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.d.b$b  reason: collision with other inner class name */
    static final class C0561b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f45248a = new b((byte) 0);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public int f45249a;

        /* renamed from: b  reason: collision with root package name */
        public int f45250b;

        /* renamed from: c  reason: collision with root package name */
        public int f45251c;

        /* renamed from: d  reason: collision with root package name */
        public int f45252d;

        /* renamed from: e  reason: collision with root package name */
        public int f45253e;

        /* renamed from: f  reason: collision with root package name */
        public int f45254f;

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static b a() {
        return C0561b.f45248a;
    }

    private b() {
        this.h = new a<>(31);
        this.k = -1;
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f45236a, true, 41098, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45236a, true, 41098, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (d()) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f45236a, true, 41099, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f45236a, true, 41099, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().d().preloadGatherMode == 1) {
            return true;
        }
        return false;
    }

    private static long e() {
        if (PatchProxy.isSupport(new Object[0], null, f45236a, true, 41100, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f45236a, true, 41100, new Class[0], Long.TYPE)).longValue();
        }
        return (long) (AbTestManager.a().d().preloadGatherExpire * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    public final int[] b() {
        Collection<V> collection;
        if (PatchProxy.isSupport(new Object[0], this, f45236a, false, 41096, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f45236a, false, 41096, new Class[0], int[].class);
        }
        int[] iArr = new int[6];
        a<String, c> aVar = this.h;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f45230a, false, 41085, new Class[0], Collection.class)) {
            collection = (Collection) PatchProxy.accessDispatch(new Object[0], aVar, a.f45230a, false, 41085, new Class[0], Collection.class);
        } else {
            collection = aVar.f45231b.values();
        }
        c[] cVarArr = (c[]) collection.toArray(new c[0]);
        for (int i2 = 0; i2 < cVarArr.length; i2++) {
            c cVar = cVarArr[(cVarArr.length - i2) - 1];
            iArr[0] = iArr[0] ^ (cVar.f45250b << i2);
            iArr[1] = iArr[1] ^ (cVar.f45251c << i2);
            iArr[2] = iArr[2] ^ (cVar.f45252d << i2);
            iArr[3] = iArr[3] ^ (cVar.f45253e << i2);
            iArr[4] = iArr[4] ^ (cVar.f45254f << i2);
            iArr[5] = (cVar.f45249a << i2) ^ iArr[5];
        }
        return iArr;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45236a, false, 41087, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f45236a, false, 41087, new Class[]{Aweme.class}, Void.TYPE);
        } else if (c()) {
            b(aweme);
            if (this.k > 0 && System.currentTimeMillis() - this.k > e()) {
                this.f45237b = 0;
                this.f45238c = 0;
                this.f45239d = 0;
                this.f45240e = 0;
                this.f45241f = 0;
                this.g = 0;
            }
            this.k = System.currentTimeMillis();
        }
    }

    private void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45236a, false, 41097, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f45236a, false, 41097, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.j = new ArrayList();
        if (aweme != null) {
            a a2 = a.a(aweme);
            this.j.add(new Pair("vs_v", Integer.valueOf(a2.f45243b)));
            this.j.add(new Pair("vs_c", Integer.valueOf(a2.f45244c)));
            this.j.add(new Pair("vs_l", Integer.valueOf(a2.f45245d)));
            this.j.add(new Pair("vs_s", Integer.valueOf(a2.f45246e)));
            this.j.add(new Pair("rel", Integer.valueOf(a2.f45247f)));
        }
        this.j.add(new Pair("uas_v", Integer.valueOf(this.f45237b)));
        this.j.add(new Pair("uas_c", Integer.valueOf(this.f45238c)));
        this.j.add(new Pair("uas_pc", Integer.valueOf(this.f45239d)));
        this.j.add(new Pair("uas_p", Integer.valueOf(this.f45240e)));
        this.j.add(new Pair("uas_s", Integer.valueOf(this.f45241f)));
        this.j.add(new Pair("uas_m", Integer.valueOf(this.g)));
        int[] b2 = b();
        this.j.add(new Pair("ula_c", Integer.valueOf(b2[0])));
        this.j.add(new Pair("ula_pc", Integer.valueOf(b2[1])));
        this.j.add(new Pair("ula_l", Integer.valueOf(b2[2])));
        this.j.add(new Pair("ula_s", Integer.valueOf(b2[3])));
        this.j.add(new Pair("ula_m", Integer.valueOf(b2[4])));
        this.j.add(new Pair("ula_p", Integer.valueOf(b2[5])));
    }

    public final JSONObject a(JSONObject jSONObject, Aweme aweme, int i2) {
        JSONObject jSONObject2 = jSONObject;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aweme, Integer.valueOf(i2)}, this, f45236a, false, 41101, new Class[]{JSONObject.class, Aweme.class, Integer.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject2, aweme, Integer.valueOf(i2)}, this, f45236a, false, 41101, new Class[]{JSONObject.class, Aweme.class, Integer.TYPE}, JSONObject.class);
        }
        try {
            if (this.j != null) {
                for (Pair next : this.j) {
                    jSONObject.put((String) next.first, next.second);
                }
            }
            if (i3 > 0 && aweme != null) {
                String aid = aweme.getAid();
                if (PatchProxy.isSupport(new Object[]{aid}, this, f45236a, false, 41088, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aid}, this, f45236a, false, 41088, new Class[]{String.class}, Void.TYPE);
                } else if (c()) {
                    this.f45237b++;
                    if (((c) this.h.a(aid)) == null) {
                        this.h.a(aid, new c((byte) 0));
                    }
                }
            }
            if (aweme != null) {
                c cVar = (c) this.h.a(aweme.getAid());
                if (cVar == null) {
                    cVar = new c((byte) 0);
                }
                jSONObject.put("va_c", cVar.f45250b);
                jSONObject.put("va_p", cVar.f45249a);
                jSONObject.put("va_m", cVar.f45254f);
                jSONObject.put("va_pt", i3);
            }
        } catch (Exception unused) {
        }
        return jSONObject2;
    }
}
