package com.ss.android.ugc.aweme.favorites.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.d.a;
import com.ss.android.ugc.aweme.favorites.viewholder.StickerCollectViewHolder;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.utils.ax;
import java.util.ArrayList;
import java.util.Map;

public class CollectStickerAdapter extends BaseAdapter<d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44246a;

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44246a, false, 39402, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new StickerCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.su, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44246a, false, 39402, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44246a, false, 39401, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44246a, false, 39401, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d dVar = (d) getData().get(i);
        StickerCollectViewHolder stickerCollectViewHolder = (StickerCollectViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{dVar}, stickerCollectViewHolder, StickerCollectViewHolder.f44393a, false, 39705, new Class[]{d.class}, Void.TYPE)) {
            StickerCollectViewHolder stickerCollectViewHolder2 = stickerCollectViewHolder;
            PatchProxy.accessDispatch(new Object[]{dVar}, stickerCollectViewHolder2, StickerCollectViewHolder.f44393a, false, 39705, new Class[]{d.class}, Void.TYPE);
            return;
        }
        stickerCollectViewHolder.f44396d = dVar;
        stickerCollectViewHolder.tvStickerName.setText(dVar.name);
        stickerCollectViewHolder.tvDesigner.setText(dVar.ownerName);
        stickerCollectViewHolder.tvUserCount.setText(stickerCollectViewHolder.tvUserCount.getContext().getString(C0906R.string.bfa, new Object[]{b.a(dVar.userCount)}));
        if (dVar.iconUrl == null || dVar.iconUrl.getUrlList() == null || dVar.iconUrl.getUrlList().isEmpty()) {
            c.a(stickerCollectViewHolder.ivCover, 2130840204);
        } else {
            c.a(stickerCollectViewHolder.ivCover, dVar.iconUrl.getUrlList().get(0));
        }
        if (PatchProxy.isSupport(new Object[]{dVar}, stickerCollectViewHolder, StickerCollectViewHolder.f44393a, false, 39706, new Class[]{d.class}, Void.TYPE)) {
            StickerCollectViewHolder stickerCollectViewHolder3 = stickerCollectViewHolder;
            PatchProxy.accessDispatch(new Object[]{dVar}, stickerCollectViewHolder3, StickerCollectViewHolder.f44393a, false, 39706, new Class[]{d.class}, Void.TYPE);
        } else {
            stickerCollectViewHolder.f44394b.setOnClickListener(new ax(dVar) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44397a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f44398b;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f44397a, false, 39708, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f44397a, false, 39708, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    r.a("enter_prop_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "prop_collection").a("prop_id", this.f44398b.id).f34114b);
                    StickerPropDetailActicity.a(StickerCollectViewHolder.this.f44394b.getContext(), az.a((E[]) new String[]{this.f44398b.id}));
                    a.d(2, this.f44398b.id);
                }

                {
                    this.f44398b = r2;
                }
            });
            stickerCollectViewHolder.ivRecord.setOnClickListener(new ax(dVar) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44400a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f44401b;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f44400a, false, 39709, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f44400a, false, 39709, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    FaceStickerBean.sCurPropSource = "favorite_prop";
                    if (StickerCollectViewHolder.this.f44395c == null) {
                        StickerCollectViewHolder.this.f44395c = new bv(StickerCollectViewHolder.this.ivRecord.getContext(), "prop_page");
                        bv bvVar = StickerCollectViewHolder.this.f44395c;
                        bvVar.i = "prop_collection";
                        bvVar.k = a.f44406b;
                    }
                    if (this.f44401b.children == null || this.f44401b.children.isEmpty()) {
                        StickerCollectViewHolder.this.f44395c.a(az.a((E[]) new String[]{this.f44401b.id}));
                    } else {
                        StickerCollectViewHolder.this.f44395c.a((ArrayList) this.f44401b.children);
                    }
                    a.d(2, this.f44401b.id);
                }

                {
                    this.f44401b = r2;
                }
            });
        }
        stickerCollectViewHolder.a();
    }
}
