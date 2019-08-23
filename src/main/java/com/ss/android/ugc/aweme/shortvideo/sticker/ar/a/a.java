package com.ss.android.ugc.aweme.shortvideo.sticker.ar.a;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.support.v7.widget.ViewStubCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.model.Face;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui.FaceMattingAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui.FaceMattingLoadAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui.FaceMattingNormalAdapter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69333a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f69334b;

    /* renamed from: c  reason: collision with root package name */
    private FaceMattingAdapter f69335c;

    /* renamed from: d  reason: collision with root package name */
    private FaceMattingLoadAdapter f69336d = new FaceMattingLoadAdapter();

    /* renamed from: e  reason: collision with root package name */
    private FaceMattingNormalAdapter f69337e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69333a, false, 78859, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69333a, false, 78859, new Class[0], Void.TYPE);
            return;
        }
        this.f69334b.setVisibility(0);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69333a, false, 78860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69333a, false, 78860, new Class[0], Void.TYPE);
            return;
        }
        this.f69334b.setVisibility(8);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f69333a, false, 78865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69333a, false, 78865, new Class[0], Void.TYPE);
            return;
        }
        this.f69337e.f69448b = null;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69333a, false, 78863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69333a, false, 78863, new Class[0], Void.TYPE);
        } else if (this.f69337e.getItemCount() == 0) {
            b();
            com.bytedance.ies.dmt.ui.d.a.c(this.f69334b.getContext(), (int) C0906R.string.bio).a();
        } else {
            this.f69336d.f69443b = false;
            this.f69335c.notifyItemRemoved(this.f69335c.getItemCount());
            this.f69334b.scrollToPosition(0);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69333a, false, 78864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69333a, false, 78864, new Class[0], Void.TYPE);
            return;
        }
        FaceMattingNormalAdapter faceMattingNormalAdapter = this.f69337e;
        if (PatchProxy.isSupport(new Object[0], faceMattingNormalAdapter, FaceMattingNormalAdapter.f69447a, false, 79023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], faceMattingNormalAdapter, FaceMattingNormalAdapter.f69447a, false, 79023, new Class[0], Void.TYPE);
        } else {
            int indexOf = faceMattingNormalAdapter.f69449c.indexOf(faceMattingNormalAdapter.f69451e);
            faceMattingNormalAdapter.f69451e = null;
            faceMattingNormalAdapter.notifyItemChanged(indexOf);
        }
        this.f69334b.scrollToPosition(0);
    }

    public final void a(List<Face> list) {
        List<Face> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f69333a, false, 78862, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f69333a, false, 78862, new Class[]{List.class}, Void.TYPE);
            return;
        }
        FaceMattingNormalAdapter faceMattingNormalAdapter = this.f69337e;
        if (PatchProxy.isSupport(new Object[]{list2}, faceMattingNormalAdapter, FaceMattingNormalAdapter.f69447a, false, 79022, new Class[]{List.class}, Void.TYPE)) {
            FaceMattingNormalAdapter faceMattingNormalAdapter2 = faceMattingNormalAdapter;
            PatchProxy.accessDispatch(new Object[]{list2}, faceMattingNormalAdapter2, FaceMattingNormalAdapter.f69447a, false, 79022, new Class[]{List.class}, Void.TYPE);
        } else {
            faceMattingNormalAdapter.f69450d.clear();
            faceMattingNormalAdapter.f69450d.addAll(faceMattingNormalAdapter.f69449c);
            faceMattingNormalAdapter.f69449c.clear();
            Collections.sort(list2, new Comparator<Face>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    Face face = (Face) obj;
                    Face face2 = (Face) obj2;
                    if (face.data_added > face2.data_added) {
                        return -1;
                    }
                    if (face.data_added < face2.data_added) {
                        return 1;
                    }
                    return 0;
                }
            });
            faceMattingNormalAdapter.f69449c.addAll(list2);
            DiffUtil.calculateDiff(faceMattingNormalAdapter.f69452f).dispatchUpdatesTo((RecyclerView.Adapter) faceMattingNormalAdapter);
            faceMattingNormalAdapter.notifyItemChanged(faceMattingNormalAdapter.f69449c.indexOf(faceMattingNormalAdapter.f69451e));
        }
        this.f69334b.scrollToPosition(0);
    }

    @SuppressLint({"RestrictedApi"})
    public a(@NonNull ViewStubCompat viewStubCompat, c cVar) {
        this.f69334b = (RecyclerView) viewStubCompat.inflate();
        this.f69334b.setLayoutManager(new LinearLayoutManager(this.f69334b.getContext(), 0, false));
        this.f69337e = new FaceMattingNormalAdapter(cVar);
        this.f69335c = new FaceMattingAdapter(this.f69336d, this.f69337e);
        this.f69334b.setAdapter(this.f69335c);
        ((SimpleItemAnimator) this.f69334b.getItemAnimator()).setSupportsChangeAnimations(false);
    }
}
