package com.amap.api.mapcore2d;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class bn<T> implements List<T> {

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<T> f5765a = new LinkedList<>();

    bn() {
    }

    public synchronized void clear() {
        this.f5765a.clear();
    }

    public synchronized boolean isEmpty() {
        return this.f5765a.isEmpty();
    }

    public synchronized Iterator<T> iterator() {
        return this.f5765a.listIterator();
    }

    public synchronized ListIterator<T> listIterator() {
        return this.f5765a.listIterator();
    }

    public synchronized int size() {
        return this.f5765a.size();
    }

    public synchronized Object[] toArray() {
        return this.f5765a.toArray();
    }

    public synchronized void a(T t) {
        add(t);
    }

    public synchronized boolean contains(Object obj) {
        return this.f5765a.contains(obj);
    }

    public synchronized boolean containsAll(Collection<?> collection) {
        return this.f5765a.containsAll(collection);
    }

    public synchronized int indexOf(Object obj) {
        return this.f5765a.indexOf(obj);
    }

    public synchronized int lastIndexOf(Object obj) {
        return this.f5765a.lastIndexOf(obj);
    }

    public synchronized T remove(int i) {
        return this.f5765a.remove(i);
    }

    public synchronized boolean removeAll(Collection<?> collection) {
        return this.f5765a.removeAll(collection);
    }

    public synchronized boolean retainAll(Collection<?> collection) {
        return this.f5765a.retainAll(collection);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean add(T r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedList<T> r0 = r1.f5765a     // Catch:{ Throwable -> 0x000c, all -> 0x0009 }
            boolean r2 = r0.add(r2)     // Catch:{ Throwable -> 0x000c, all -> 0x0009 }
            monitor-exit(r1)
            return r2
        L_0x0009:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000c:
            r2 = 1
            monitor-exit(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.bn.add(java.lang.Object):boolean");
    }

    public synchronized boolean addAll(Collection<? extends T> collection) {
        return this.f5765a.addAll(collection);
    }

    public synchronized T get(int i) {
        T t;
        try {
            t = this.f5765a.get(i);
        } catch (Exception e2) {
            cm.a(e2, "SyncList", "get");
            t = null;
        }
        return t;
    }

    public synchronized ListIterator<T> listIterator(int i) {
        return this.f5765a.listIterator(i);
    }

    public synchronized boolean remove(Object obj) {
        return this.f5765a.remove(obj);
    }

    public synchronized <V> V[] toArray(V[] vArr) {
        return this.f5765a.toArray(vArr);
    }

    public synchronized void add(int i, T t) {
        this.f5765a.add(i, t);
    }

    public synchronized boolean addAll(int i, Collection<? extends T> collection) {
        return this.f5765a.addAll(i, collection);
    }

    public synchronized T set(int i, T t) {
        return this.f5765a.set(i, t);
    }

    public synchronized List<T> subList(int i, int i2) {
        return this.f5765a.subList(i, i2);
    }
}