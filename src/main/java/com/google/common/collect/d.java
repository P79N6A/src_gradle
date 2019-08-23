package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.aw;
import com.google.common.collect.bc;
import com.google.common.collect.bf;
import com.google.common.collect.g;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class d<K, V> extends g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> map;
    public transient int totalSize;

    class a extends bc.e<K, Collection<V>> {

        /* renamed from: a  reason: collision with root package name */
        final transient Map<K, Collection<V>> f24726a;

        /* renamed from: com.google.common.collect.d$a$a  reason: collision with other inner class name */
        class C0282a extends bc.b<K, Collection<V>> {
            /* access modifiers changed from: package-private */
            public final Map<K, Collection<V>> a() {
                return a.this;
            }

            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            C0282a() {
            }

            public final boolean contains(Object obj) {
                return m.a((Collection<?>) a.this.f24726a.entrySet(), obj);
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.this.removeValuesForKey(((Map.Entry) obj).getKey());
                return true;
            }
        }

        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f24729a = a.this.f24726a.entrySet().iterator();
            @NullableDecl

            /* renamed from: b  reason: collision with root package name */
            Collection<V> f24730b;

            public final boolean hasNext() {
                return this.f24729a.hasNext();
            }

            public final /* synthetic */ Object next() {
                Map.Entry next = this.f24729a.next();
                this.f24730b = (Collection) next.getValue();
                return a.this.a(next);
            }

            public final void remove() {
                boolean z;
                if (this.f24730b != null) {
                    z = true;
                } else {
                    z = false;
                }
                l.a(z);
                this.f24729a.remove();
                d.this.totalSize -= this.f24730b.size();
                this.f24730b.clear();
                this.f24730b = null;
            }

            b() {
            }
        }

        /* access modifiers changed from: protected */
        public final Set<Map.Entry<K, Collection<V>>> a() {
            return new C0282a();
        }

        public int hashCode() {
            return this.f24726a.hashCode();
        }

        public Set<K> keySet() {
            return d.this.keySet();
        }

        public int size() {
            return this.f24726a.size();
        }

        public String toString() {
            return this.f24726a.toString();
        }

        public void clear() {
            if (this.f24726a == d.this.map) {
                d.this.clear();
            } else {
                aw.b(new b());
            }
        }

        public boolean containsKey(Object obj) {
            return bc.b(this.f24726a, obj);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (this == obj || this.f24726a.equals(obj)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return bc.a(key, d.this.a(key, entry.getValue()));
        }

        public /* synthetic */ Object get(Object obj) {
            Collection collection = (Collection) bc.a(this.f24726a, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a(obj, collection);
        }

        public /* synthetic */ Object remove(Object obj) {
            Collection remove = this.f24726a.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection b2 = d.this.b();
            b2.addAll(remove);
            d.this.totalSize -= remove.size();
            remove.clear();
            return b2;
        }

        a(Map<K, Collection<V>> map) {
            this.f24726a = map;
        }
    }

    abstract class b<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f24732b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        K f24733c = null;
        @MonotonicNonNullDecl

        /* renamed from: d  reason: collision with root package name */
        Collection<V> f24734d = null;

        /* renamed from: e  reason: collision with root package name */
        Iterator<V> f24735e = aw.b.INSTANCE;

        /* access modifiers changed from: package-private */
        public abstract T a(K k, V v);

        public boolean hasNext() {
            if (this.f24732b.hasNext() || this.f24735e.hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            this.f24735e.remove();
            if (this.f24734d.isEmpty()) {
                this.f24732b.remove();
            }
            d dVar = d.this;
            dVar.totalSize--;
        }

        public T next() {
            if (!this.f24735e.hasNext()) {
                Map.Entry next = this.f24732b.next();
                this.f24733c = next.getKey();
                this.f24734d = (Collection) next.getValue();
                this.f24735e = this.f24734d.iterator();
            }
            return a(this.f24733c, this.f24735e.next());
        }

        b() {
            this.f24732b = d.this.map.entrySet().iterator();
        }
    }

    class c extends bc.c<K, Collection<V>> {
        public void clear() {
            aw.b(iterator());
        }

        public int hashCode() {
            return b().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            final Iterator it2 = b().entrySet().iterator();
            return new Iterator<K>() {
                @NullableDecl

                /* renamed from: a  reason: collision with root package name */
                Map.Entry<K, Collection<V>> f24738a;

                public final boolean hasNext() {
                    return it2.hasNext();
                }

                public final K next() {
                    this.f24738a = (Map.Entry) it2.next();
                    return this.f24738a.getKey();
                }

                public final void remove() {
                    boolean z;
                    if (this.f24738a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l.a(z);
                    Collection value = this.f24738a.getValue();
                    it2.remove();
                    d.this.totalSize -= value.size();
                    value.clear();
                    this.f24738a = null;
                }
            };
        }

        public boolean containsAll(Collection<?> collection) {
            return b().keySet().containsAll(collection);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (this == obj || b().keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) b().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                d.this.totalSize -= i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }

        c(Map<K, Collection<V>> map) {
            super(map);
        }
    }

    /* renamed from: com.google.common.collect.d$d  reason: collision with other inner class name */
    class C0283d extends g implements NavigableMap<K, Collection<V>> {
        /* access modifiers changed from: private */
        /* renamed from: f */
        public NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) super.d();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public final NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public NavigableSet<K> e() {
            return new e(d());
        }

        public final NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C0283d(d().descendingMap());
        }

        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return a(entrySet().iterator());
        }

        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public final K ceilingKey(K k) {
            return d().ceilingKey(k);
        }

        public final K floorKey(K k) {
            return d().floorKey(k);
        }

        public final K higherKey(K k) {
            return d().higherKey(k);
        }

        public final K lowerKey(K k) {
            return d().lowerKey(k);
        }

        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = d().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = d().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = d().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = d().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        private Map.Entry<K, Collection<V>> a(Iterator<Map.Entry<K, Collection<V>>> it2) {
            if (!it2.hasNext()) {
                return null;
            }
            Map.Entry next = it2.next();
            Collection b2 = d.this.b();
            b2.addAll((Collection) next.getValue());
            it2.remove();
            return bc.a(next.getKey(), d.this.a(b2));
        }

        C0283d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C0283d(d().headMap(k, z));
        }

        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C0283d(d().tailMap(k, z));
        }

        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C0283d(d().subMap(k, z, k2, z2));
        }
    }

    class e extends h implements NavigableSet<K> {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public NavigableMap<K, Collection<V>> a() {
            return (NavigableMap) super.a();
        }

        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<K> descendingSet() {
            return new e(a().descendingMap());
        }

        public final K pollFirst() {
            return aw.a(iterator());
        }

        public final K pollLast() {
            return aw.a(descendingIterator());
        }

        public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public final K ceiling(K k) {
            return a().ceilingKey(k);
        }

        public final K floor(K k) {
            return a().floorKey(k);
        }

        public final K higher(K k) {
            return a().higherKey(k);
        }

        public final K lower(K k) {
            return a().lowerKey(k);
        }

        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return new e(a().headMap(k, z));
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new e(a().tailMap(k, z));
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new e(a().subMap(k, z, k2, z2));
        }
    }

    class f extends j implements RandomAccess {
        f(K k, @NullableDecl List<V> list, i iVar) {
            super(k, list, iVar);
        }
    }

    class g extends a implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl

        /* renamed from: d  reason: collision with root package name */
        SortedSet<K> f24744d;

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f24726a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public SortedSet<K> e() {
            return new h(d());
        }

        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f24744d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b2 = e();
            this.f24744d = b2;
            return b2;
        }

        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        public K firstKey() {
            return d().firstKey();
        }

        public K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new g(d().headMap(k));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new g(d().tailMap(k));
        }

        g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new g(d().subMap(k, k2));
        }
    }

    class h extends c implements SortedSet<K> {
        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> a() {
            return (SortedMap) super.b();
        }

        public Comparator<? super K> comparator() {
            return a().comparator();
        }

        public K first() {
            return a().firstKey();
        }

        public K last() {
            return a().lastKey();
        }

        public SortedSet<K> headSet(K k) {
            return new h(a().headMap(k));
        }

        public SortedSet<K> tailSet(K k) {
            return new h(a().tailMap(k));
        }

        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new h(a().subMap(k, k2));
        }
    }

    class i extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        public final K f24747b;

        /* renamed from: c  reason: collision with root package name */
        public Collection<V> f24748c;
        @NullableDecl

        /* renamed from: d  reason: collision with root package name */
        public final i f24749d;
        @NullableDecl

        /* renamed from: e  reason: collision with root package name */
        final Collection<V> f24750e;

        class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<V> f24752a;

            /* renamed from: b  reason: collision with root package name */
            final Collection<V> f24753b = i.this.f24748c;

            public boolean hasNext() {
                a();
                return this.f24752a.hasNext();
            }

            public V next() {
                a();
                return this.f24752a.next();
            }

            /* access modifiers changed from: package-private */
            public final void a() {
                i.this.a();
                if (i.this.f24748c != this.f24753b) {
                    throw new ConcurrentModificationException();
                }
            }

            public void remove() {
                this.f24752a.remove();
                d dVar = d.this;
                dVar.totalSize--;
                i.this.b();
            }

            a() {
                this.f24752a = d.iteratorOrListIterator(i.this.f24748c);
            }

            a(Iterator<V> it2) {
                this.f24752a = it2;
            }
        }

        public int hashCode() {
            a();
            return this.f24748c.hashCode();
        }

        public Iterator<V> iterator() {
            a();
            return new a();
        }

        public int size() {
            a();
            return this.f24748c.size();
        }

        public String toString() {
            a();
            return this.f24748c.toString();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (this.f24749d != null) {
                this.f24749d.b();
                return;
            }
            if (this.f24748c.isEmpty()) {
                d.this.map.remove(this.f24747b);
            }
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (this.f24749d != null) {
                this.f24749d.c();
            } else {
                d.this.map.put(this.f24747b, this.f24748c);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f24748c.clear();
                d.this.totalSize -= size;
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.f24749d != null) {
                this.f24749d.a();
                if (this.f24749d.f24748c != this.f24750e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f24748c.isEmpty()) {
                Collection<V> collection = d.this.map.get(this.f24747b);
                if (collection != null) {
                    this.f24748c = collection;
                }
            }
        }

        public boolean contains(Object obj) {
            a();
            return this.f24748c.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            a();
            return this.f24748c.containsAll(collection);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            a();
            return this.f24748c.equals(obj);
        }

        public boolean add(V v) {
            a();
            boolean isEmpty = this.f24748c.isEmpty();
            boolean add = this.f24748c.add(v);
            if (add) {
                d.this.totalSize++;
                if (isEmpty) {
                    c();
                }
            }
            return add;
        }

        public boolean remove(Object obj) {
            a();
            boolean remove = this.f24748c.remove(obj);
            if (remove) {
                d dVar = d.this;
                dVar.totalSize--;
                b();
            }
            return remove;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f24748c.addAll(collection);
            if (addAll) {
                d.this.totalSize += this.f24748c.size() - size;
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f24748c.removeAll(collection);
            if (removeAll) {
                d.this.totalSize += this.f24748c.size() - size;
                b();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            m.a(collection);
            int size = size();
            boolean retainAll = this.f24748c.retainAll(collection);
            if (retainAll) {
                d.this.totalSize += this.f24748c.size() - size;
                b();
            }
            return retainAll;
        }

        i(K k, @NullableDecl Collection<V> collection, i iVar) {
            Collection<V> collection2;
            this.f24747b = k;
            this.f24748c = collection;
            this.f24749d = iVar;
            if (iVar == null) {
                collection2 = null;
            } else {
                collection2 = iVar.f24748c;
            }
            this.f24750e = collection2;
        }
    }

    class j extends i implements List<V> {

        class a extends com.google.common.collect.d$i.a implements ListIterator<V> {
            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.d$j$a, com.google.common.collect.d$i$a] */
            private ListIterator<V> b() {
                a();
                return (ListIterator) this.f24752a;
            }

            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            public final int nextIndex() {
                return b().nextIndex();
            }

            public final V previous() {
                return b().previous();
            }

            public final int previousIndex() {
                return b().previousIndex();
            }

            a() {
                super();
            }

            public final void set(V v) {
                b().set(v);
            }

            public final void add(V v) {
                boolean isEmpty = j.this.isEmpty();
                b().add(v);
                d.this.totalSize++;
                if (isEmpty) {
                    j.this.c();
                }
            }

            public a(int i) {
                super(j.this.d().listIterator(i));
            }
        }

        /* access modifiers changed from: package-private */
        public final List<V> d() {
            return (List) this.f24748c;
        }

        public ListIterator<V> listIterator() {
            a();
            return new a();
        }

        public V get(int i) {
            a();
            return d().get(i);
        }

        public int indexOf(Object obj) {
            a();
            return d().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            a();
            return d().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator(int i) {
            a();
            return new a(i);
        }

        public V remove(int i) {
            a();
            V remove = d().remove(i);
            d dVar = d.this;
            dVar.totalSize--;
            b();
            return remove;
        }

        public V set(int i, V v) {
            a();
            return d().set(i, v);
        }

        public void add(int i, V v) {
            a();
            boolean isEmpty = this.f24748c.isEmpty();
            d().add(i, v);
            d.this.totalSize++;
            if (isEmpty) {
                c();
            }
        }

        public List<V> subList(int i, int i2) {
            i iVar;
            a();
            d dVar = d.this;
            K k = this.f24747b;
            List subList = d().subList(i, i2);
            if (this.f24749d == null) {
                iVar = this;
            } else {
                iVar = this.f24749d;
            }
            return dVar.a(k, subList, iVar);
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = d().addAll(i, collection);
            if (addAll) {
                d.this.totalSize += this.f24748c.size() - size;
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        j(K k, @NullableDecl List<V> list, i iVar) {
            super(k, list, iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> b();

    public int size() {
        return this.totalSize;
    }

    private Collection<V> a() {
        return b();
    }

    /* access modifiers changed from: package-private */
    public Set<K> d() {
        return new c(this.map);
    }

    /* access modifiers changed from: package-private */
    public final Collection<V> e() {
        return new g.c();
    }

    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<V> f() {
        return new b<V>() {
            /* access modifiers changed from: package-private */
            public final V a(K k, V v) {
                return v;
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final bg<K> g() {
        return new bf.c(this);
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<K, V>> i() {
        return new b<Map.Entry<K, V>>() {
            /* access modifiers changed from: package-private */
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return bc.a(obj, obj2);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> j() {
        return new a(this.map);
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    public Collection<V> c() {
        return a(b());
    }

    /* access modifiers changed from: package-private */
    public final Collection<Map.Entry<K, V>> h() {
        if (this instanceof bx) {
            return new g.b();
        }
        return new g.a();
    }

    public void clear() {
        for (Collection<V> clear : this.map.values()) {
            clear.clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return this.map.containsKey(obj);
    }

    protected d(Map<K, Collection<V>> map2) {
        m.a(map2.isEmpty());
        this.map = map2;
    }

    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: package-private */
    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Collection<V> get(@NullableDecl K k) {
        Collection collection = this.map.get(k);
        if (collection == null) {
            collection = a();
        }
        return a(k, collection);
    }

    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) bc.c(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Collection<V> removeAll(@NullableDecl Object obj) {
        Collection remove = this.map.remove(obj);
        if (remove == null) {
            return c();
        }
        Collection b2 = b();
        b2.addAll(remove);
        this.totalSize -= remove.size();
        remove.clear();
        return a(b2);
    }

    /* access modifiers changed from: package-private */
    public Collection<V> a(@NullableDecl K k, Collection<V> collection) {
        return new i(k, collection, null);
    }

    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.map.get(k);
        if (collection == null) {
            Collection a2 = a();
            if (a2.add(v)) {
                this.totalSize++;
                this.map.put(k, a2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.totalSize++;
            return true;
        }
    }

    public Collection<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return removeAll(k);
        }
        Collection collection = this.map.get(k);
        if (collection == null) {
            collection = a();
            this.map.put(k, collection);
        }
        Collection b2 = b();
        b2.addAll(collection);
        this.totalSize -= collection.size();
        collection.clear();
        while (it2.hasNext()) {
            if (collection.add(it2.next())) {
                this.totalSize++;
            }
        }
        return a(b2);
    }

    /* access modifiers changed from: package-private */
    public final List<V> a(@NullableDecl K k, List<V> list, @NullableDecl i iVar) {
        if (list instanceof RandomAccess) {
            return new f(k, list, iVar);
        }
        return new j(k, list, iVar);
    }
}
