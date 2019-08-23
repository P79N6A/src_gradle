package com.ss.android.ugc.aweme.commerce.service.stagger;

import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SmartRecyclerAdapter extends RecyclerViewAdapterWrapper {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f38252c;

    /* renamed from: d  reason: collision with root package name */
    public a f38253d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView.LayoutManager f38254e;

    /* renamed from: f  reason: collision with root package name */
    private View f38255f;
    private View g;

    public interface a {
        void b();
    }

    public final boolean a() {
        if (this.f38255f != null) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f38252c, false, 29945, new Class[0], Integer.TYPE)) {
            return super.getItemCount() + (a() ? 1 : 0) + (b() ? 1 : 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38252c, false, 29945, new Class[0], Integer.TYPE)).intValue();
    }

    public SmartRecyclerAdapter(@NonNull RecyclerView.Adapter adapter) {
        super(adapter);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38252c, false, 29939, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38252c, false, 29939, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f38255f = view;
        this.f38249b.notifyDataSetChanged();
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38252c, false, 29941, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38252c, false, 29941, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.g = view;
        this.f38249b.notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38252c, false, 29946, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38252c, false, 29946, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (a() && i2 == 0) {
            return -1;
        } else {
            if (b() && i2 == getItemCount() - 1) {
                return -2;
            }
            if (a()) {
                i2--;
            }
            return super.getItemViewType(i2);
        }
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f38252c, false, 29944, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f38252c, false, 29944, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f38254e = recyclerView.getLayoutManager();
        RecyclerView.LayoutManager layoutManager = this.f38254e;
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f38252c, false, 29943, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f38252c, false, 29943, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE);
            return;
        }
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f38256a;

                public int getSpanSize(int i) {
                    boolean z;
                    boolean z2 = false;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38256a, false, 29949, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38256a, false, 29949, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    }
                    if (i != 0 || !SmartRecyclerAdapter.this.a()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (i == SmartRecyclerAdapter.this.getItemCount() - 1 && SmartRecyclerAdapter.this.b()) {
                        z2 = true;
                    }
                    if (z2 || z) {
                        return gridLayoutManager.getSpanCount();
                    }
                    return 1;
                }
            });
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f38252c, false, 29948, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f38252c, false, 29948, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i) != -1) {
            if (getItemViewType(i) == -2) {
                if (this.f38253d != null) {
                    this.f38253d.b();
                }
                return;
            }
            if (a()) {
                i2 = i - 1;
            } else {
                i2 = i;
            }
            super.onBindViewHolder(viewHolder, i2);
        }
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f38252c, false, 29947, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f38252c, false, 29947, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View view = null;
        if (i == -1) {
            view = this.f38255f;
        } else if (i == -2) {
            view = this.g;
        }
        if (view == null) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        if (this.f38254e instanceof StaggeredGridLayoutManager) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new StaggeredGridLayoutManager.LayoutParams(layoutParams2.width, layoutParams2.height);
            } else {
                layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
            }
            layoutParams.setFullSpan(true);
            view.setLayoutParams(layoutParams);
        }
        return new RecyclerView.ViewHolder(view) {
        };
    }
}
