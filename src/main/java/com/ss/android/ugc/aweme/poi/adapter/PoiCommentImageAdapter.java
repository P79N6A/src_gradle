package com.ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommentImageViewHolder;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.preview.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PoiCommentImageAdapter extends RecyclerView.Adapter<PoiCommentImageViewHolder> implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59421a;

    /* renamed from: b  reason: collision with root package name */
    List<UrlModel> f59422b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    int f59423c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f59424d = 0;

    /* renamed from: e  reason: collision with root package name */
    c f59425e;

    /* renamed from: f  reason: collision with root package name */
    private Context f59426f;
    private RecyclerView g;
    private int h;

    public int getItemCount() {
        return this.f59424d;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59421a, false, 64768, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59421a, false, 64768, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a.a("comment", this.f59425e);
        a a2 = a.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UrlModel next : this.f59422b) {
            arrayList.add(next.getUrlList().get(0));
            arrayList2.add(next.getUrlList().get(0));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_type", this.f59425e.getPoiType());
        hashMap.put("group_id", this.f59425e.getAwemeId());
        hashMap.put("previous_page", this.f59425e.getPreviousPage());
        h.a(hashMap, this.f59425e);
        a2.a(this.f59426f, arrayList, arrayList2, null, this.g, C0906R.id.bzq, this.f59425e.getPoiId(), "comment", hashMap);
        a2.a("tag_poi_comment", i, getItemCount());
    }

    public PoiCommentImageAdapter(Context context, RecyclerView recyclerView) {
        this.f59426f = context;
        this.g = recyclerView;
        this.h = UIUtils.getScreenWidth(this.f59426f);
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f59421a, false, 64766, new Class[]{ViewGroup.class, Integer.TYPE}, PoiCommentImageViewHolder.class)) {
            return new PoiCommentImageViewHolder(this.f59426f, LayoutInflater.from(this.f59426f).inflate(C0906R.layout.sw, null), this);
        }
        return (PoiCommentImageViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f59421a, false, 64766, new Class[]{ViewGroup.class, Integer.TYPE}, PoiCommentImageViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        PoiCommentImageViewHolder poiCommentImageViewHolder = (PoiCommentImageViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{poiCommentImageViewHolder, Integer.valueOf(i)}, this, f59421a, false, 64767, new Class[]{PoiCommentImageViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiCommentImageViewHolder, Integer.valueOf(i)}, this, f59421a, false, 64767, new Class[]{PoiCommentImageViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        UrlModel urlModel = this.f59422b.get(i2);
        int itemCount = getItemCount();
        int i3 = this.f59423c;
        int i4 = this.h / 3;
        int i5 = i4;
        if (PatchProxy.isSupport(new Object[]{urlModel, Integer.valueOf(i), Integer.valueOf(itemCount), Integer.valueOf(i3), Integer.valueOf(i4)}, poiCommentImageViewHolder, PoiCommentImageViewHolder.f59509a, false, 64800, new Class[]{UrlModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PoiCommentImageViewHolder poiCommentImageViewHolder2 = poiCommentImageViewHolder;
            PatchProxy.accessDispatch(new Object[]{urlModel, Integer.valueOf(i), Integer.valueOf(itemCount), Integer.valueOf(i3), Integer.valueOf(i5)}, poiCommentImageViewHolder2, PoiCommentImageViewHolder.f59509a, false, 64800, new Class[]{UrlModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 < itemCount - 1 || i2 >= i3 - 1) {
            poiCommentImageViewHolder.f59513e.setVisibility(8);
        } else {
            poiCommentImageViewHolder.f59513e.setVisibility(0);
            poiCommentImageViewHolder.f59513e.setText(String.valueOf(i3));
        }
        int i6 = i5;
        com.ss.android.ugc.aweme.base.c.a(poiCommentImageViewHolder.f59512d, urlModel, i6, i6);
        poiCommentImageViewHolder.f59512d.setOnClickListener(new View.OnClickListener(i2) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59514a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f59515b;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f59514a, false, 64801, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f59514a, false, 64801, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (PoiCommentImageViewHolder.this.f59510b != null) {
                    PoiCommentImageViewHolder.this.f59510b.a(this.f59515b);
                }
            }

            {
                this.f59515b = r2;
            }
        });
    }
}
