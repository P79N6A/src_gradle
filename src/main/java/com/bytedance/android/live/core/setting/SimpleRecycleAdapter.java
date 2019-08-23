package com.bytedance.android.live.core.setting;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.widget.simple.SimpleViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public abstract class SimpleRecycleAdapter<T> extends RecyclerView.Adapter {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f8143c;

    /* renamed from: a  reason: collision with root package name */
    private List<T> f8144a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f8145b;

    /* renamed from: d  reason: collision with root package name */
    protected Context f8146d;

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f8147e = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8152a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8152a, false, 941, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8152a, false, 941, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (view.getTag() != null && (view.getTag() instanceof SimpleViewHolder)) {
                SimpleViewHolder simpleViewHolder = (SimpleViewHolder) view.getTag();
                SimpleRecycleAdapter.this.a(simpleViewHolder, SimpleRecycleAdapter.this.a(simpleViewHolder.getPosition()), simpleViewHolder.getPosition());
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private View.OnLongClickListener f8148f = new View.OnLongClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8154a;

        public final boolean onLongClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8154a, false, 942, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f8154a, false, 942, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            if (view.getTag() != null && (view.getTag() instanceof SimpleViewHolder)) {
                SimpleViewHolder simpleViewHolder = (SimpleViewHolder) view.getTag();
                SimpleRecycleAdapter.this.a(simpleViewHolder.getPosition());
                simpleViewHolder.getPosition();
            }
            return false;
        }
    };

    public void a(SimpleViewHolder simpleViewHolder, T t, int i) {
    }

    public abstract void b(SimpleViewHolder simpleViewHolder, T t, int i);

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f8143c, false, 938, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8143c, false, 938, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f8144a == null) {
            return 0;
        } else {
            return this.f8144a.size();
        }
    }

    public final T a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8143c, false, 936, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8143c, false, 936, new Class[]{Integer.TYPE}, Object.class);
        } else if (i < 0 || i >= this.f8144a.size()) {
            return null;
        } else {
            return this.f8144a.get(i);
        }
    }

    public SimpleRecycleAdapter(Context context, List<T> list) {
        this.f8144a = list;
        this.f8145b = LayoutInflater.from(context);
        this.f8146d = context;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8143c, false, 935, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8143c, false, 935, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View inflate = this.f8145b.inflate(C0906R.layout.aiv, viewGroup, false);
        inflate.setOnClickListener(this.f8147e);
        inflate.setOnLongClickListener(this.f8148f);
        final SimpleViewHolder simpleViewHolder = new SimpleViewHolder(inflate);
        inflate.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8149a;

            public final void onViewDetachedFromWindow(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f8149a, false, 940, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f8149a, false, 940, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                simpleViewHolder.d();
                simpleViewHolder.a();
            }

            public final void onViewAttachedToWindow(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f8149a, false, 939, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f8149a, false, 939, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                int adapterPosition = simpleViewHolder.getAdapterPosition();
                if (adapterPosition >= 0) {
                    Object a2 = SimpleRecycleAdapter.this.a(adapterPosition);
                    simpleViewHolder.b(a2);
                    simpleViewHolder.c();
                    SimpleRecycleAdapter.this.b(simpleViewHolder, a2, adapterPosition);
                }
            }
        });
        return simpleViewHolder;
    }
}
