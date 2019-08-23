package com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FaceMattingLoadAdapter extends RecyclerView.Adapter<FaceMattingLoadingViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69442a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69443b = true;

    public int getItemCount() {
        if (this.f69443b) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final FaceMattingLoadingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69442a, false, 79015, new Class[]{ViewGroup.class, Integer.TYPE}, FaceMattingLoadingViewHolder.class)) {
            return new FaceMattingLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.s_, viewGroup2, false));
        }
        return (FaceMattingLoadingViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69442a, false, 79015, new Class[]{ViewGroup.class, Integer.TYPE}, FaceMattingLoadingViewHolder.class);
    }

    /* renamed from: a */
    public final void onBindViewHolder(FaceMattingLoadingViewHolder faceMattingLoadingViewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{faceMattingLoadingViewHolder, Integer.valueOf(i)}, this, f69442a, false, 79016, new Class[]{FaceMattingLoadingViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceMattingLoadingViewHolder, Integer.valueOf(i)}, this, f69442a, false, 79016, new Class[]{FaceMattingLoadingViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        faceMattingLoadingViewHolder.a();
    }
}
