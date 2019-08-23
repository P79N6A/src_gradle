package com.ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class v implements NetworkUtils.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2691a;

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f2692b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public LinkedHashSet<Long> f2693c;

    /* renamed from: d  reason: collision with root package name */
    volatile List<Object> f2694d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Object> f2695e;

    /* renamed from: f  reason: collision with root package name */
    private HandlerThread f2696f;
    private Handler g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final v f2697a = new v((byte) 0);
    }

    public class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34304a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34304a, false, 22361, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34304a, false, 22361, new Class[0], Void.TYPE);
                return;
            }
            long lastActiveTime = AppLog.getLastActiveTime();
            while (System.currentTimeMillis() - lastActiveTime < 60000 && a()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException unused) {
                }
            }
            v.f2692b.set(false);
        }

        private boolean a() {
            boolean z;
            Boolean bool;
            if (PatchProxy.isSupport(new Object[0], this, f34304a, false, 22362, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34304a, false, 22362, new Class[0], Boolean.TYPE)).booleanValue();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (v.this.f2693c) {
                linkedHashSet.addAll(v.this.f2693c);
            }
            if (linkedHashSet.isEmpty()) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                long longValue = ((Long) it2.next()).longValue();
                if (longValue > 0) {
                    sb.append(longValue);
                    sb.append(",");
                }
            }
            if (sb.length() == 0) {
                return false;
            }
            String substring = sb.substring(0, sb.length() - 1);
            try {
                if (PatchProxy.isSupport(new Object[]{substring}, this, f34304a, false, 22363, new Class[]{String.class}, Boolean.class)) {
                    bool = (Boolean) PatchProxy.accessDispatch(new Object[]{substring}, this, f34304a, false, 22363, new Class[]{String.class}, Boolean.class);
                } else if (StringUtils.isEmpty(substring)) {
                    bool = Boolean.FALSE;
                } else {
                    String str = com.ss.android.newmedia.a.C;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new e("command_ids", substring));
                    String executePost = NetworkUtils.executePost(10240, str, (List) arrayList);
                    if (executePost != null) {
                        if (executePost.length() != 0) {
                            bool = Boolean.valueOf("success".equals(new JSONObject(executePost).getString("message")));
                        }
                    }
                    bool = Boolean.FALSE;
                }
                z = bool.booleanValue();
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                return false;
            }
            synchronized (v.this.f2693c) {
                v.this.f2693c.removeAll(linkedHashSet);
            }
            return true;
        }

        public b() {
        }
    }

    public final String a() {
        return "X-SS-Command";
    }

    private v() {
        this.f2693c = new LinkedHashSet<>();
        this.f2695e = new ArrayList<>();
    }

    private synchronized Handler b() {
        if (PatchProxy.isSupport(new Object[0], this, f2691a, false, 22352, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], this, f2691a, false, 22352, new Class[0], Handler.class);
        }
        if (this.f2696f == null) {
            this.f2696f = new HandlerThread("AppData-AsyncOp");
            this.f2696f.start();
            this.g = new WeakHandler(this.f2696f.getLooper(), new w(this));
            com.ss.android.ugc.aweme.framework.a.a.a("command_dispatcher_handler", (Map<String, String>) null);
        }
        return this.g;
    }

    /* synthetic */ v(byte b2) {
        this();
    }

    private void a(LinkedHashSet<Long> linkedHashSet) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{linkedHashSet}, this, f2691a, false, 22359, new Class[]{LinkedHashSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkedHashSet}, this, f2691a, false, 22359, new Class[]{LinkedHashSet.class}, Void.TYPE);
        } else if (!linkedHashSet.isEmpty()) {
            synchronized (this.f2693c) {
                linkedHashSet.addAll(this.f2693c);
            }
            int size = linkedHashSet.size() - 100;
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                Long l = (Long) it2.next();
                if (i > size) {
                    break;
                }
                linkedHashSet.remove(l);
                i++;
            }
            synchronized (this.f2693c) {
                this.f2693c.addAll(linkedHashSet);
            }
        }
    }

    public final void a(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f2691a, false, 22357, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f2691a, false, 22357, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (String next : list) {
            if (PatchProxy.isSupport(new Object[]{next}, this, f2691a, false, 22358, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{next}, this, f2691a, false, 22358, new Class[]{String.class}, Void.TYPE);
            } else if (next != null && !StringUtils.isEmpty(next)) {
                try {
                    JSONArray jSONArray = new JSONArray(next);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        long optLong = jSONObject.optLong("i");
                        if (optLong > 0) {
                            linkedHashSet.add(Long.valueOf(optLong));
                            b().sendMessage(b().obtainMessage(104, jSONObject));
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        a(linkedHashSet);
                        if (f2692b.compareAndSet(false, true)) {
                            new b().start();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}
