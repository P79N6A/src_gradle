package com.ss.android.newmedia;

import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30209a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30210b = 20;

    /* renamed from: c  reason: collision with root package name */
    private final TreeMap<a, a> f30211c = new TreeMap<>(new Comparator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30212a;

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f30212a, false, 18390, new Class[]{a.class, a.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f30212a, false, 18390, new Class[]{a.class, a.class}, Integer.TYPE)).intValue();
            } else if (aVar == null) {
                return 1;
            } else {
                if (aVar2 != null) {
                    if (aVar.equals(aVar2)) {
                        return 0;
                    }
                    if (aVar.f30216c > aVar2.f30216c) {
                        return 1;
                    }
                }
                return -1;
            }
        }
    });

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30214a;

        /* renamed from: b  reason: collision with root package name */
        public Long f30215b;

        /* renamed from: c  reason: collision with root package name */
        public long f30216c;

        public int hashCode() {
            if (!PatchProxy.isSupport(new Object[0], this, f30214a, false, 18392, new Class[0], Integer.TYPE)) {
                return this.f30215b.hashCode();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30214a, false, 18392, new Class[0], Integer.TYPE)).intValue();
        }

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f30214a, false, 18393, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f30214a, false, 18393, new Class[0], String.class);
            }
            return String.valueOf(this.f30215b) + "|" + String.valueOf(this.f30216c);
        }

        public boolean equals(Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f30214a, false, 18391, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f30214a, false, 18391, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if ((obj2 instanceof a) && obj2 != null) {
                return this.f30215b.equals(((a) obj2).f30215b);
            } else {
                return super.equals(obj);
            }
        }
    }

    private synchronized String a() {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f30209a, false, 18388, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f30209a, false, 18388, new Class[0], String.class);
        }
        try {
            StringBuilder sb = new StringBuilder();
            Set<Map.Entry<a, a>> entrySet = this.f30211c.entrySet();
            for (Map.Entry<a, a> value : entrySet) {
                a aVar = (a) value.getValue();
                if (aVar != null) {
                    if (i != entrySet.size() - 1) {
                        sb.append(aVar.toString());
                        sb.append("@");
                    } else {
                        sb.append(aVar.toString());
                    }
                    i++;
                }
            }
            str = sb.toString();
            try {
                Logger.debug();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return str;
    }

    public j(int i) {
    }

    private synchronized boolean b(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f30209a, false, 18385, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f30209a, false, 18385, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar == null) {
            return false;
        } else {
            boolean containsKey = this.f30211c.containsKey(aVar);
            Logger.debug();
            return containsKey;
        }
    }

    public final synchronized void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f30209a, false, 18387, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f30209a, false, 18387, new Class[]{a.class}, Void.TYPE);
        } else if (aVar != null) {
            try {
                Logger.debug();
                if (Logger.debug()) {
                    a();
                }
                if (this.f30211c.size() >= this.f30210b && !b(aVar)) {
                    Logger.debug();
                    this.f30211c.remove(this.f30211c.firstKey());
                }
                if (b(aVar)) {
                    Logger.debug();
                    this.f30211c.remove(aVar);
                }
                this.f30211c.put(aVar, aVar);
                if (Logger.debug()) {
                    a();
                }
                Logger.debug();
            } catch (Exception unused) {
            }
        }
    }
}
