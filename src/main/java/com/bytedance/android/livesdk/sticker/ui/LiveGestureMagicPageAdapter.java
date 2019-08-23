package com.bytedance.android.livesdk.sticker.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveGestureMagicPageAdapter extends RecyclerView.Adapter<GestureMagicPageViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17326a;

    /* renamed from: b  reason: collision with root package name */
    public a f17327b;

    /* renamed from: c  reason: collision with root package name */
    List<EffectCategoryResponse> f17328c;

    /* renamed from: d  reason: collision with root package name */
    boolean f17329d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.android.livesdk.sticker.c.a f17330e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, com.bytedance.android.livesdk.sticker.b.a> f17331f = new HashMap();
    private SparseArray<LiveGestureMagicAdapter> g = new SparseArray<>();
    private boolean h;

    class GestureMagicPageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ImageView f17332a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f17333b;

        GestureMagicPageViewHolder(View view) {
            super(view);
            this.f17332a = (ImageView) view.findViewById(C0906R.id.ar6);
            this.f17333b = (RecyclerView) view.findViewById(C0906R.id.ccc);
            this.f17333b.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            this.f17333b.addItemDecoration(new LiveGestureListItemDecoration());
        }
    }

    public interface a {
        void a(Boolean bool, com.bytedance.android.livesdk.sticker.b.a aVar);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f17326a, false, 13457, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17326a, false, 13457, new Class[0], Integer.TYPE)).intValue();
        } else if (Lists.isEmpty(this.f17328c)) {
            return 0;
        } else {
            return this.f17328c.size();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17326a, false, 13458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17326a, false, 13458, new Class[0], Void.TYPE);
            return;
        }
        this.f17329d = true;
        if (!this.h) {
            this.h = true;
            for (int i = 0; i < this.f17328c.size(); i++) {
                if (this.g.get(i) == null) {
                    EffectCategoryResponse effectCategoryResponse = this.f17328c.get(i);
                    LiveGestureMagicAdapter liveGestureMagicAdapter = new LiveGestureMagicAdapter(this.f17330e);
                    this.g.put(i, liveGestureMagicAdapter);
                    liveGestureMagicAdapter.a(effectCategoryResponse);
                    liveGestureMagicAdapter.f17316c = new g(this, effectCategoryResponse, i);
                }
                this.g.get(i).a();
            }
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f17326a, false, 13460, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17326a, false, 13460, new Class[0], Void.TYPE);
            return;
        }
        this.f17329d = false;
        if (this.h) {
            this.h = false;
            this.f17331f.clear();
            for (int i = 0; i < this.g.size(); i++) {
                LiveGestureMagicAdapter liveGestureMagicAdapter = this.g.get(i);
                if (liveGestureMagicAdapter != null) {
                    if (PatchProxy.isSupport(new Object[0], liveGestureMagicAdapter, LiveGestureMagicAdapter.f17314a, false, 13436, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], liveGestureMagicAdapter, LiveGestureMagicAdapter.f17314a, false, 13436, new Class[0], Void.TYPE);
                    } else {
                        liveGestureMagicAdapter.i = false;
                        if (liveGestureMagicAdapter.g) {
                            liveGestureMagicAdapter.g = false;
                            if (liveGestureMagicAdapter.f17316c != null) {
                                liveGestureMagicAdapter.f17316c.a(Boolean.FALSE, liveGestureMagicAdapter.f17317d);
                            }
                            liveGestureMagicAdapter.h = liveGestureMagicAdapter.f17317d;
                            liveGestureMagicAdapter.f17317d = null;
                            liveGestureMagicAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    public LiveGestureMagicPageAdapter(com.bytedance.android.livesdk.sticker.c.a aVar) {
        this.f17330e = aVar;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f17326a, false, 13455, new Class[]{ViewGroup.class, Integer.TYPE}, GestureMagicPageViewHolder.class)) {
            return (GestureMagicPageViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f17326a, false, 13455, new Class[]{ViewGroup.class, Integer.TYPE}, GestureMagicPageViewHolder.class);
        }
        return new GestureMagicPageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ajn, viewGroup2, false));
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        GestureMagicPageViewHolder gestureMagicPageViewHolder = (GestureMagicPageViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{gestureMagicPageViewHolder, Integer.valueOf(i)}, this, f17326a, false, 13456, new Class[]{GestureMagicPageViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gestureMagicPageViewHolder, Integer.valueOf(i)}, this, f17326a, false, 13456, new Class[]{GestureMagicPageViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        EffectCategoryResponse effectCategoryResponse = this.f17328c.get(i);
        ImageModel imageModel = new ImageModel();
        ArrayList arrayList = new ArrayList();
        if (this.f17331f.containsKey(effectCategoryResponse.id)) {
            if (!StringUtils.isEmpty(effectCategoryResponse.icon_selected_url)) {
                arrayList.add(effectCategoryResponse.icon_selected_url);
            }
        } else if (!StringUtils.isEmpty(effectCategoryResponse.icon_normal_url)) {
            arrayList.add(effectCategoryResponse.icon_normal_url);
        }
        if (Lists.isEmpty(arrayList)) {
            gestureMagicPageViewHolder.f17332a.setImageResource(2130841176);
        } else {
            imageModel.setUrls(arrayList);
            b.a(gestureMagicPageViewHolder.f17332a, imageModel);
        }
        if (this.g.get(i) == null) {
            LiveGestureMagicAdapter liveGestureMagicAdapter = new LiveGestureMagicAdapter(this.f17330e);
            this.g.put(i, liveGestureMagicAdapter);
            liveGestureMagicAdapter.a(effectCategoryResponse);
            liveGestureMagicAdapter.f17316c = new f(this, effectCategoryResponse, i);
        }
        gestureMagicPageViewHolder.f17333b.setAdapter(this.g.get(i));
    }

    /* access modifiers changed from: package-private */
    public void a(com.bytedance.android.livesdk.sticker.b.a aVar, boolean z, EffectCategoryResponse effectCategoryResponse, int i) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z ? (byte) 1 : 0), effectCategoryResponse2, Integer.valueOf(i)}, this, f17326a, false, 13459, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Boolean.TYPE, EffectCategoryResponse.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z), effectCategoryResponse2, Integer.valueOf(i)}, this, f17326a, false, 13459, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Boolean.TYPE, EffectCategoryResponse.class, Integer.TYPE}, Void.TYPE);
        } else if (aVar2 != null) {
            if (z) {
                this.f17331f.put(effectCategoryResponse2.id, aVar2);
            } else {
                this.f17331f.remove(effectCategoryResponse2.id);
            }
            if (this.f17327b != null) {
                this.f17327b.a(Boolean.valueOf(z), aVar2);
            }
            notifyItemChanged(i);
        }
    }
}
