package com.bytedance.android.live.core.a;

import android.util.Pair;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class j<K, V> implements b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7806a;

    /* renamed from: b  reason: collision with root package name */
    private final Function<K, Integer> f7807b;

    /* renamed from: c  reason: collision with root package name */
    private final BiFunction<K, List<V>, List<V>> f7808c;

    /* renamed from: d  reason: collision with root package name */
    private final Function4<K, List<V>, Integer, List<V>, List<V>> f7809d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, List<V>> f7810e;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentMap<Integer, PublishSubject<b.a>> f7811f;
    private final PublishSubject<Pair<K, b.a>> g;

    public j() {
        this(k.f7813b);
    }

    private j(Function<K, Integer> function) {
        this(function, l.f7815b, m.f7817b);
    }

    public final List<V> a(K k) {
        if (PatchProxy.isSupport(new Object[]{k}, this, f7806a, false, 173, new Class[]{Object.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{k}, this, f7806a, false, 173, new Class[]{Object.class}, List.class);
        }
        int intValue = ((Integer) i.a(this.f7807b, k)).intValue();
        if (!this.f7810e.containsKey(Integer.valueOf(intValue))) {
            this.f7810e.put(Integer.valueOf(intValue), new ArrayList());
        }
        return this.f7810e.get(Integer.valueOf(intValue));
    }

    public final void b(K k) {
        if (PatchProxy.isSupport(new Object[]{k}, this, f7806a, false, 177, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{k}, this, f7806a, false, 177, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        int intValue = ((Integer) i.a(this.f7807b, k)).intValue();
        if (!this.f7810e.containsKey(Integer.valueOf(intValue))) {
            this.f7810e.put(Integer.valueOf(intValue), new ArrayList());
        }
        this.f7810e.get(Integer.valueOf(intValue)).clear();
    }

    public final int b(K k, V v) {
        if (PatchProxy.isSupport(new Object[]{k, v}, this, f7806a, false, 175, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{k, v}, this, f7806a, false, 175, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
        }
        int intValue = ((Integer) i.a(this.f7807b, k)).intValue();
        if (!this.f7810e.containsKey(Integer.valueOf(intValue))) {
            this.f7810e.put(Integer.valueOf(intValue), new ArrayList());
        }
        return this.f7810e.get(Integer.valueOf(intValue)).indexOf(v);
    }

    public final V a(K k, n<V> nVar) {
        if (PatchProxy.isSupport(new Object[]{k, nVar}, this, f7806a, false, 172, new Class[]{Object.class, n.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{k, nVar}, this, f7806a, false, 172, new Class[]{Object.class, n.class}, Object.class);
        }
        int intValue = ((Integer) i.a(this.f7807b, k)).intValue();
        if (!this.f7810e.containsKey(Integer.valueOf(intValue))) {
            this.f7810e.put(Integer.valueOf(intValue), new ArrayList());
        }
        for (V next : this.f7810e.get(Integer.valueOf(intValue))) {
            try {
                if (nVar.a(next)) {
                    return next;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final List<V> a(K k, List<V> list) {
        if (PatchProxy.isSupport(new Object[]{k, list}, this, f7806a, false, 165, new Class[]{Object.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{k, list}, this, f7806a, false, 165, new Class[]{Object.class, List.class}, List.class);
        }
        int intValue = ((Integer) i.a(this.f7807b, k)).intValue();
        if (!this.f7810e.containsKey(Integer.valueOf(intValue))) {
            this.f7810e.put(Integer.valueOf(intValue), new ArrayList());
        }
        return a(k, this.f7810e.get(Integer.valueOf(intValue)).size(), list);
    }

    public final void a(K k, V v) {
        if (PatchProxy.isSupport(new Object[]{k, v}, this, f7806a, false, 169, new Class[]{Object.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{k, v}, this, f7806a, false, 169, new Class[]{Object.class, Object.class}, Void.TYPE);
            return;
        }
        int intValue = ((Integer) i.a(this.f7807b, k)).intValue();
        if (!this.f7810e.containsKey(Integer.valueOf(intValue))) {
            this.f7810e.put(Integer.valueOf(intValue), new ArrayList());
        }
        List list = this.f7810e.get(Integer.valueOf(intValue));
        int indexOf = list.indexOf(v);
        if (list.remove(v)) {
            b.a aVar = new b.a(2, indexOf, Collections.singletonList(v));
            if (this.f7811f.containsKey(Integer.valueOf(intValue))) {
                ((PublishSubject) this.f7811f.get(Integer.valueOf(intValue))).onNext(aVar);
            }
            this.g.onNext(Pair.create(k, aVar));
        }
    }

    public j(Function<K, Integer> function, Function4<K, List<V>, Integer, List<V>, List<V>> function4, BiFunction<K, List<V>, List<V>> biFunction) {
        this.f7810e = new ConcurrentHashMap();
        this.f7811f = new ConcurrentHashMap(20, 0.75f, 4);
        this.g = PublishSubject.create();
        this.f7807b = function;
        this.f7809d = function4;
        this.f7808c = biFunction;
    }

    private synchronized List<V> a(K k, int i, List<V> list) {
        K k2 = k;
        List<V> list2 = list;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{k2, Integer.valueOf(i), list2}, this, f7806a, false, 167, new Class[]{Object.class, Integer.TYPE, List.class}, List.class)) {
                List<V> list3 = (List) PatchProxy.accessDispatch(new Object[]{k2, Integer.valueOf(i), list2}, this, f7806a, false, 167, new Class[]{Object.class, Integer.TYPE, List.class}, List.class);
                return list3;
            }
            int intValue = ((Integer) i.a(this.f7807b, k)).intValue();
            if (!this.f7810e.containsKey(Integer.valueOf(intValue))) {
                this.f7810e.put(Integer.valueOf(intValue), new ArrayList());
            }
            List list4 = this.f7810e.get(Integer.valueOf(intValue));
            List<V> list5 = (List) i.a(this.f7809d, k, list4, Integer.valueOf(i), (List) i.a(this.f7808c, k, list2));
            if (Lists.isEmpty(list5)) {
                return list5;
            }
            int min = Math.min(i, list4.size());
            list4.addAll(min, list5);
            this.f7810e.put(Integer.valueOf(intValue), list4);
            b.a aVar = new b.a(1, min, list5);
            if (this.f7811f.containsKey(Integer.valueOf(intValue))) {
                ((PublishSubject) this.f7811f.get(Integer.valueOf(intValue))).onNext(aVar);
            }
            this.g.onNext(Pair.create(k, aVar));
            return list5;
        }
    }
}
