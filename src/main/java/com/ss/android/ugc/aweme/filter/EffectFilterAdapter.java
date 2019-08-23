package com.ss.android.ugc.aweme.filter;

import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.effect.base.EffectDownloadState;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;

public class EffectFilterAdapter extends BaseAdapter<h> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47311a;

    /* renamed from: b  reason: collision with root package name */
    public int f47312b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47313c;

    /* renamed from: d  reason: collision with root package name */
    public av f47314d;

    /* renamed from: e  reason: collision with root package name */
    RecyclerView f47315e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f47316f;
    @Nullable
    public as g;
    private final int h = -3;
    private final int i = -4;
    private final int j = 2;
    private boolean k;
    private FilterListLoadingViewHolder l;

    class FilterEmptyViewHolder extends RecyclerView.ViewHolder {
        FilterEmptyViewHolder(View view) {
            super(view);
        }
    }

    class FilterLineViewHolder extends RecyclerView.ViewHolder {
        FilterLineViewHolder(View view) {
            super(view);
        }
    }

    public class FilterViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47320a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f47321b;

        /* renamed from: c  reason: collision with root package name */
        public AVDmtImageTextView f47322c;
        @EffectDownloadState.State

        /* renamed from: d  reason: collision with root package name */
        int f47323d = -1;

        /* renamed from: e  reason: collision with root package name */
        ObjectAnimator f47324e;

        /* access modifiers changed from: package-private */
        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f47320a, false, 44047, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f47320a, false, 44047, new Class[0], Void.TYPE);
                return;
            }
            if (this.f47324e != null && this.f47324e.isRunning()) {
                this.f47324e.cancel();
            }
            this.f47321b.setRotation(0.0f);
            this.f47321b.setImageResource(2130837671);
        }

        FilterViewHolder(View view) {
            super(view);
            this.f47322c = (AVDmtImageTextView) view.findViewById(C0906R.id.awa);
            this.f47321b = (ImageView) view.findViewById(C0906R.id.b0w);
            view.setOnClickListener(new View.OnClickListener(EffectFilterAdapter.this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47326a;

                public final void onClick(View view) {
                    boolean z;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f47326a, false, 44049, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f47326a, false, 44049, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = FilterViewHolder.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        h hVar = (h) EffectFilterAdapter.this.getData().get(adapterPosition);
                        if (hVar instanceof o) {
                            ((o) hVar).o = "click";
                        }
                        if (w.a(hVar) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            aa a2 = aa.a();
                            if (PatchProxy.isSupport(new Object[]{hVar}, a2, aa.f47466a, false, 44298, new Class[]{h.class}, Void.TYPE)) {
                                aa aaVar = a2;
                                PatchProxy.accessDispatch(new Object[]{hVar}, aaVar, aa.f47466a, false, 44298, new Class[]{h.class}, Void.TYPE);
                            } else {
                                a2.a(hVar, true, null);
                            }
                        }
                        if (EffectFilterAdapter.this.f47314d != null) {
                            EffectFilterAdapter.this.f47314d.a((h) EffectFilterAdapter.this.getData().get(adapterPosition), z);
                        }
                        FilterViewHolder.this.f47322c.c(false);
                    }
                }
            });
        }
    }

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f47311a, false, 44030, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47311a, false, 44030, new Class[0], Integer.TYPE)).intValue();
        } else if (this.k || this.f47313c) {
            return 1;
        } else {
            return super.getBasicItemCount();
        }
    }

    public final void a() {
        h hVar;
        if (PatchProxy.isSupport(new Object[0], this, f47311a, false, 44033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47311a, false, 44033, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f47311a, false, 44034, new Class[0], h.class)) {
            hVar = (h) PatchProxy.accessDispatch(new Object[0], this, f47311a, false, 44034, new Class[0], h.class);
        } else {
            if (!Lists.isEmpty(getData())) {
                Iterator it2 = getData().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    h hVar2 = (h) it2.next();
                    if (w.b(hVar2)) {
                        hVar = hVar2;
                        break;
                    }
                }
            }
            hVar = null;
        }
        if (hVar != null) {
            b(hVar);
        }
    }

    public void setData(List<h> list) {
        this.mItems = list;
    }

    public EffectFilterAdapter(@Nullable as asVar) {
        this.g = asVar;
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f47311a, false, 44025, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f47311a, false, 44025, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f47315e = recyclerView2;
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47311a, false, 44037, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47311a, false, 44037, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f47315e != null) {
            if (this.f47315e.getWidth() == 0) {
                this.f47315e.post(new e(this, i2));
            } else {
                this.f47315e.scrollToPosition(i2);
            }
        }
    }

    public final void c(h hVar) {
        h hVar2 = hVar;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47311a, false, 44036, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47311a, false, 44036, new Class[]{h.class}, Void.TYPE);
        } else if (hVar2 != null) {
            while (i2 < getItemCount()) {
                if (hVar2.f47598b == ((h) getData().get(i2)).f47598b) {
                    b(i2);
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    public int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47311a, false, 44031, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47311a, false, 44031, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.k && i2 == 0) {
            return -3;
        } else {
            if (this.f47313c && i2 == 0) {
                return -4;
            }
            if (((h) getData().get(i2)).f47599c.equals("LINE")) {
                return 2;
            }
            return 1;
        }
    }

    public void onShowFooterChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47311a, false, 44026, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47311a, false, 44026, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.mPreviousCount = getItemCount();
    }

    public final int a(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47311a, false, 44032, new Class[]{h.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47311a, false, 44032, new Class[]{h.class}, Integer.TYPE)).intValue();
        }
        List data = getData();
        if (CollectionUtils.isEmpty(data)) {
            return -1;
        }
        for (int i2 = 0; i2 < data.size(); i2++) {
            if (hVar2.f47598b == ((h) data.get(i2)).f47598b) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean b(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f47311a, false, 44035, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar}, this, f47311a, false, 44035, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        }
        int itemCount = getItemCount();
        int i2 = hVar.f47598b;
        if (this.f47312b == i2) {
            return true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= itemCount) {
                break;
            } else if (((h) getData().get(i3)).f47598b == this.f47312b) {
                notifyItemChanged(i3, getData().get(i3));
                break;
            } else {
                i3++;
            }
        }
        for (int i4 = 0; i4 < itemCount; i4++) {
            if (((h) getData().get(i4)).f47598b == i2) {
                notifyItemChanged(i4, getData().get(i4));
                a((h) getData().get(i4), i4);
                b(i4);
                this.f47312b = i2;
                return true;
            }
        }
        return false;
    }

    public final h a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47311a, false, 44042, new Class[]{Integer.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47311a, false, 44042, new Class[]{Integer.TYPE}, h.class);
        }
        int i3 = i2;
        for (int i4 = 0; i4 <= i3; i4++) {
            if (TextUtils.equals(((h) getData().get(i4)).f47599c, "LINE")) {
                i3++;
            }
        }
        return (h) getData().get(i3);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47311a, false, 44038, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47311a, false, 44038, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f47316f = z;
        int itemCount = getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (((h) getData().get(i2)).f47598b == this.f47312b) {
                notifyItemChanged(i2, getData().get(i2));
                notifyItemRangeChanged(i2, 1);
                return;
            }
        }
    }

    private void a(h hVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{hVar, Integer.valueOf(i2)}, this, f47311a, false, 44039, new Class[]{h.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, Integer.valueOf(i2)}, this, f47311a, false, 44039, new Class[]{h.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Effect a2 = a.d().a(hVar);
        if (!(this.g == null || a2 == null)) {
            this.g.a(a2.id, a2.tags_updated_at, new p() {
                public final void a() {
                }
            });
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f47311a, false, 44027, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f47311a, false, 44027, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i2 == 2) {
            return new FilterLineViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.fd, viewGroup, false));
        } else {
            switch (i2) {
                case -4:
                    return new FilterEmptyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.fc, viewGroup, false));
                case -3:
                    this.l = new FilterListLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.fe, viewGroup, false));
                    return this.l;
                default:
                    return new FilterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.fb, viewGroup, false));
            }
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f47311a, false, 44028, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f47311a, false, 44028, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getBasicItemViewType(i3)) {
            case -4:
                return;
            case -3:
                FilterListLoadingViewHolder filterListLoadingViewHolder = (FilterListLoadingViewHolder) viewHolder;
                if (PatchProxy.isSupport(new Object[0], filterListLoadingViewHolder, FilterListLoadingViewHolder.f47418a, false, 44291, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], filterListLoadingViewHolder, FilterListLoadingViewHolder.f47418a, false, 44291, new Class[0], Void.TYPE);
                    break;
                } else {
                    if (PatchProxy.isSupport(new Object[0], filterListLoadingViewHolder, FilterListLoadingViewHolder.f47418a, false, 44293, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], filterListLoadingViewHolder, FilterListLoadingViewHolder.f47418a, false, 44293, new Class[0], Void.TYPE);
                        break;
                    } else {
                        filterListLoadingViewHolder.f47420c = ObjectAnimator.ofFloat(filterListLoadingViewHolder.f47419b, "rotation", new float[]{0.0f, 360.0f});
                        filterListLoadingViewHolder.f47420c.setDuration(800);
                        filterListLoadingViewHolder.f47420c.setRepeatMode(1);
                        filterListLoadingViewHolder.f47420c.setRepeatCount(-1);
                        filterListLoadingViewHolder.f47420c.start();
                        return;
                    }
                }
            case 1:
                FilterViewHolder filterViewHolder = (FilterViewHolder) viewHolder;
                h hVar = (h) getData().get(i3);
                if (PatchProxy.isSupport(new Object[]{hVar}, filterViewHolder, FilterViewHolder.f47320a, false, 44044, new Class[]{h.class}, Void.TYPE)) {
                    FilterViewHolder filterViewHolder2 = filterViewHolder;
                    PatchProxy.accessDispatch(new Object[]{hVar}, filterViewHolder2, FilterViewHolder.f47320a, false, 44044, new Class[]{h.class}, Void.TYPE);
                    return;
                }
                filterViewHolder.f47322c.a(hVar.g.toString());
                filterViewHolder.f47322c.setText(hVar.f47599c);
                AVDmtImageTextView aVDmtImageTextView = filterViewHolder.f47322c;
                if (EffectFilterAdapter.this.f47316f || EffectFilterAdapter.this.f47312b != hVar.f47598b) {
                    z = false;
                } else {
                    z = true;
                }
                aVDmtImageTextView.a(z);
                int a2 = w.a(hVar);
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, filterViewHolder, FilterViewHolder.f47320a, false, 44045, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    if (filterViewHolder.f47323d != a2) {
                        filterViewHolder.f47323d = a2;
                        switch (a2) {
                            case 0:
                                filterViewHolder.a();
                                filterViewHolder.f47321b.setVisibility(0);
                                break;
                            case 1:
                                filterViewHolder.a();
                                filterViewHolder.f47321b.setVisibility(8);
                                break;
                            case 2:
                                if (!PatchProxy.isSupport(new Object[0], filterViewHolder, FilterViewHolder.f47320a, false, 44046, new Class[0], Void.TYPE)) {
                                    filterViewHolder.f47321b.setVisibility(0);
                                    filterViewHolder.f47321b.setImageResource(2130837672);
                                    filterViewHolder.f47324e = ObjectAnimator.ofFloat(filterViewHolder.f47321b, "rotation", new float[]{0.0f, 360.0f});
                                    filterViewHolder.f47324e.setDuration(800);
                                    filterViewHolder.f47324e.setRepeatMode(1);
                                    filterViewHolder.f47324e.setRepeatCount(-1);
                                    filterViewHolder.f47324e.start();
                                    break;
                                } else {
                                    PatchProxy.accessDispatch(new Object[0], filterViewHolder, FilterViewHolder.f47320a, false, 44046, new Class[0], Void.TYPE);
                                    break;
                                }
                        }
                    }
                } else {
                    FilterViewHolder filterViewHolder3 = filterViewHolder;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, filterViewHolder3, FilterViewHolder.f47320a, false, 44045, new Class[]{Integer.TYPE}, Void.TYPE);
                }
                if (PatchProxy.isSupport(new Object[]{hVar}, filterViewHolder, FilterViewHolder.f47320a, false, 44048, new Class[]{h.class}, Void.TYPE)) {
                    FilterViewHolder filterViewHolder4 = filterViewHolder;
                    PatchProxy.accessDispatch(new Object[]{hVar}, filterViewHolder4, FilterViewHolder.f47320a, false, 44048, new Class[]{h.class}, Void.TYPE);
                    return;
                }
                Effect a3 = a.d().a(hVar);
                filterViewHolder.f47322c.c(false);
                if (w.b(hVar)) {
                    if (a3 == null || EffectFilterAdapter.this.g == null) {
                        filterViewHolder.f47322c.c(false);
                        break;
                    } else {
                        List a4 = ao.a(a3.getTags());
                        if (a4.size() == 0) {
                            filterViewHolder.f47322c.c(false);
                            break;
                        } else {
                            EffectFilterAdapter.this.g.a(a3.id, a4, a3.tags_updated_at, new m() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f47329a;

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f47329a, false, 44050, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f47329a, false, 44050, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    FilterViewHolder.this.f47322c.c(true);
                                }

                                public final void b() {
                                    if (PatchProxy.isSupport(new Object[0], this, f47329a, false, 44051, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f47329a, false, 44051, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    FilterViewHolder.this.f47322c.c(false);
                                }
                            });
                            return;
                        }
                    }
                }
                break;
            case 2:
                return;
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2, @NonNull List list) {
        boolean z;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2), list}, this, f47311a, false, 44029, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2), list}, this, f47311a, false, 44029, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
        } else if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i2);
        } else {
            if (getItemViewType(i2) == 1) {
                FilterViewHolder filterViewHolder = (FilterViewHolder) viewHolder;
                h hVar = (h) getData().get(i2);
                AVDmtImageTextView aVDmtImageTextView = filterViewHolder.f47322c;
                if (this.f47316f || this.f47312b != hVar.f47598b) {
                    z = false;
                } else {
                    z = true;
                }
                aVDmtImageTextView.a(z);
                if (this.f47312b == hVar.f47598b) {
                    filterViewHolder.f47322c.a(true);
                }
                filterViewHolder.f47322c.c(false);
            }
        }
    }
}
