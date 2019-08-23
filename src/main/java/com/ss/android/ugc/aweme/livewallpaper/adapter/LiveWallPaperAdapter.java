package com.ss.android.ugc.aweme.livewallpaper.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import java.util.ArrayList;
import java.util.List;

public class LiveWallPaperAdapter extends RecyclerView.Adapter<ViewHolder> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53601a;

    /* renamed from: d  reason: collision with root package name */
    private static final int f53602d = (p.a()[0] / 3);

    /* renamed from: e  reason: collision with root package name */
    private static final int f53603e = ((int) (((float) p.a()[0]) * 0.44f));

    /* renamed from: b  reason: collision with root package name */
    public List<LiveWallPaperBean> f53604b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public a f53605c;

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public RemoteImageView f53606a;

        public ViewHolder(View view) {
            super(view);
            this.f53606a = (RemoteImageView) view.findViewById(C0906R.id.d2o);
        }
    }

    public interface a {
        void a(LiveWallPaperBean liveWallPaperBean);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f53601a, false, 56020, new Class[0], Integer.TYPE)) {
            return this.f53604b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53601a, false, 56020, new Class[0], Integer.TYPE)).intValue();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f53601a, false, 56021, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f53601a, false, 56021, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.f53605c != null) {
            this.f53605c.a((LiveWallPaperBean) view.getTag());
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f53601a, false, 56017, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
            return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f53601a, false, 56017, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.w9, viewGroup, false);
        inflate.setOnClickListener(this);
        return new ViewHolder(inflate);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LiveWallPaperBean liveWallPaperBean;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f53601a, false, 56018, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f53601a, false, 56018, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53601a, false, 56019, new Class[]{Integer.TYPE}, LiveWallPaperBean.class)) {
            liveWallPaperBean = (LiveWallPaperBean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53601a, false, 56019, new Class[]{Integer.TYPE}, LiveWallPaperBean.class);
        } else if (i >= this.f53604b.size() || i < 0) {
            liveWallPaperBean = null;
        } else {
            liveWallPaperBean = this.f53604b.get(i);
        }
        if (liveWallPaperBean != null) {
            RemoteImageView remoteImageView = viewHolder2.f53606a;
            c.a(remoteImageView, "file://" + liveWallPaperBean.getThumbnailPath(), f53602d, f53603e);
            viewHolder2.itemView.setTag(liveWallPaperBean);
        }
    }
}
