package com.ss.android.ugc.aweme.ug.recycle;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

public class GlobalRVPool extends RecyclerView.RecycledViewPool {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75175a;

    /* renamed from: b  reason: collision with root package name */
    public int f75176b;

    /* renamed from: c  reason: collision with root package name */
    public int f75177c;

    /* renamed from: d  reason: collision with root package name */
    private Set<Integer> f75178d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final GlobalRVPool f75179a = new GlobalRVPool((byte) 0);
    }

    public static GlobalRVPool a() {
        return a.f75179a;
    }

    private GlobalRVPool() {
        this.f75178d = new HashSet();
        this.f75176b = 15;
        this.f75177c = 0;
        setMaxRecycledViews(0, a(0));
        setMaxRecycledViews(Integer.MIN_VALUE, a(Integer.MIN_VALUE));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75175a, false, 87348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75175a, false, 87348, new Class[0], Void.TYPE);
            return;
        }
        for (Integer intValue : this.f75178d) {
            int intValue2 = intValue.intValue();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue2)}, this, f75175a, false, 87347, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue2)}, this, f75175a, false, 87347, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (this.f75178d.contains(Integer.valueOf(intValue2))) {
                int recycledViewCount = getRecycledViewCount(intValue2);
                for (int i = 0; i < recycledViewCount; i++) {
                    getRecycledView(intValue2);
                }
            }
        }
    }

    /* synthetic */ GlobalRVPool(byte b2) {
        this();
    }

    private int a(int i) {
        if (i == Integer.MIN_VALUE) {
            return this.f75177c;
        }
        if (i != 0) {
            return 5;
        }
        return this.f75176b;
    }

    @Nullable
    public RecyclerView.ViewHolder getRecycledView(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f75175a, false, 87350, new Class[]{Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return super.getRecycledView(i);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f75175a, false, 87350, new Class[]{Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f75175a, false, 87349, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f75175a, false, 87349, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.putRecycledView(viewHolder);
        this.f75178d.add(Integer.valueOf(viewHolder.getItemViewType()));
    }
}
