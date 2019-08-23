package com.ss.android.ugc.aweme.filter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.filter.model.a;

public class FilterAdapter extends ListAdapter<h, MyViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47338a;

    /* renamed from: b  reason: collision with root package name */
    final Context f47339b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f47340c;

    /* renamed from: d  reason: collision with root package name */
    int f47341d;

    /* renamed from: e  reason: collision with root package name */
    public aw f47342e;

    /* renamed from: f  reason: collision with root package name */
    public z f47343f;

    class MyViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f47345a;

        /* renamed from: b  reason: collision with root package name */
        CircleImageView f47346b;

        /* renamed from: c  reason: collision with root package name */
        View f47347c;

        MyViewHolder(View view) {
            super(view);
            this.f47345a = (TextView) view.findViewById(C0906R.id.ddx);
            this.f47346b = (CircleImageView) view.findViewById(C0906R.id.b19);
            this.f47347c = view.findViewById(C0906R.id.bly);
            view.setOnClickListener(new View.OnClickListener(FilterAdapter.this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47349a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f47349a, false, 44078, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f47349a, false, 44078, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (FilterAdapter.this.f47343f == null || !FilterAdapter.this.f47343f.a()) {
                        int adapterPosition = MyViewHolder.this.getAdapterPosition();
                        if (!(adapterPosition == -1 || FilterAdapter.this.f47342e == null)) {
                            FilterAdapter.this.f47342e.a(FilterAdapter.this.getItem(adapterPosition));
                        }
                    }
                }
            });
        }
    }

    public FilterAdapter(Context context) {
        super((DiffUtil.ItemCallback<T>) new DiffUtil.ItemCallback<h>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47344a;

            public /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
                if (((h) obj).f47598b == ((h) obj2).f47598b) {
                    return true;
                }
                return false;
            }

            public /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
                h hVar = (h) obj;
                h hVar2 = (h) obj2;
                if (!PatchProxy.isSupport(new Object[]{hVar, hVar2}, this, f47344a, false, 44077, new Class[]{h.class, h.class}, Boolean.TYPE)) {
                    return hVar.equals(hVar2);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar, hVar2}, this, f47344a, false, 44077, new Class[]{h.class, h.class}, Boolean.TYPE)).booleanValue();
            }
        });
        this.f47339b = context;
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f47338a, false, 44070, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f47338a, false, 44070, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f47340c = recyclerView2;
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f47338a, false, 44071, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f47338a, false, 44071, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f47340c = null;
    }

    /* renamed from: a */
    public final h getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47338a, false, 44074, new Class[]{Integer.TYPE}, h.class)) {
            return (h) super.getItem(i);
        }
        return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47338a, false, 44074, new Class[]{Integer.TYPE}, h.class);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47338a, false, 44076, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47338a, false, 44076, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(getItem(i));
    }

    public final void a(h hVar) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f47338a, false, 44075, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f47338a, false, 44075, new Class[]{h.class}, Void.TYPE);
            return;
        }
        int itemCount = getItemCount();
        int i2 = hVar.f47598b;
        if (this.f47341d != i2) {
            int i3 = 0;
            while (true) {
                if (i3 >= itemCount) {
                    break;
                } else if (getItem(i3).f47598b == this.f47341d) {
                    notifyItemChanged(i3);
                    break;
                } else {
                    i3++;
                }
            }
            while (true) {
                if (i >= itemCount) {
                    break;
                } else if (getItem(i).f47598b == i2) {
                    notifyItemChanged(i);
                    if (this.f47340c != null) {
                        if (i > 4) {
                            this.f47340c.scrollToPosition(i - 2);
                        }
                        this.f47340c.smoothScrollToPosition(i);
                    }
                } else {
                    i++;
                }
            }
            this.f47341d = i2;
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f47338a, false, 44072, new Class[]{ViewGroup.class, Integer.TYPE}, MyViewHolder.class)) {
            return new MyViewHolder(LayoutInflater.from(this.f47339b).inflate(C0906R.layout.m_, viewGroup, false));
        }
        return (MyViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f47338a, false, 44072, new Class[]{ViewGroup.class, Integer.TYPE}, MyViewHolder.class);
    }

    /* renamed from: a */
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{myViewHolder, Integer.valueOf(i)}, this, f47338a, false, 44073, new Class[]{MyViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{myViewHolder, Integer.valueOf(i)}, this, f47338a, false, 44073, new Class[]{MyViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        h a2 = getItem(i);
        a aVar = new a(a2.g, a2.f47599c);
        c.a((RemoteImageView) myViewHolder.f47346b, aVar.f47638a.toString());
        myViewHolder.f47345a.setText(aVar.f47639b);
        View view = myViewHolder.f47347c;
        if (this.f47341d != getItem(i).f47598b) {
            i2 = 8;
        }
        view.setVisibility(i2);
        if (this.f47341d == i) {
            ObjectAnimator.ofFloat(myViewHolder.f47347c, "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
        }
    }
}
