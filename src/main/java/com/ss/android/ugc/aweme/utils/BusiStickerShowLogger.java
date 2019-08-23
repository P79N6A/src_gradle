package com.ss.android.ugc.aweme.utils;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusiStickerShowLogger extends RecyclerView.OnScrollListener implements Observer<EffectCategoryModel>, RecyclerView.OnChildAttachStateChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75442a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f75443b;

    /* renamed from: c  reason: collision with root package name */
    private String f75444c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f75445d;

    /* renamed from: e  reason: collision with root package name */
    private GridLayoutManager f75446e;

    /* renamed from: f  reason: collision with root package name */
    private CategoryStickerAdapter f75447f;
    private String g;
    private Map<String, Boolean> h = new HashMap();
    private List<String> i = new ArrayList();

    public void onChildViewDetachedFromWindow(@NonNull View view) {
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75442a, false, 88054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75442a, false, 88054, new Class[0], Void.TYPE);
            return;
        }
        for (String put : this.h.keySet()) {
            this.h.put(put, Boolean.FALSE);
        }
    }

    private void a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f75442a, false, 88049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75442a, false, 88049, new Class[0], Void.TYPE);
            return;
        }
        int findFirstVisibleItemPosition = this.f75446e.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f75446e.findLastVisibleItemPosition();
        this.i.clear();
        while (true) {
            findFirstVisibleItemPosition++;
            if (findFirstVisibleItemPosition >= findLastVisibleItemPosition + 1) {
                break;
            }
            ah ahVar = (ah) this.f75447f.b(findFirstVisibleItemPosition);
            if (a(ahVar)) {
                String str = ahVar.f69295b.effect_id;
                Boolean bool = this.h.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                if (!z) {
                    de.a(ahVar.f69295b);
                }
                this.h.put(str, Boolean.TRUE);
                this.i.add(str);
            }
        }
        for (String next : this.h.keySet()) {
            if (!this.i.contains(next)) {
                this.h.put(next, Boolean.FALSE);
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f75442a, false, 88052, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f75442a, false, 88052, new Class[]{View.class}, Void.TYPE);
            return;
        }
        b();
    }

    private boolean a(ah ahVar) {
        ah ahVar2 = ahVar;
        if (PatchProxy.isSupport(new Object[]{ahVar2}, this, f75442a, false, 88055, new Class[]{ah.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{ahVar2}, this, f75442a, false, 88055, new Class[]{ah.class}, Boolean.TYPE)).booleanValue();
        } else if (ahVar2 == null || ahVar2.f69295b == null || TextUtils.isEmpty(ahVar2.f69295b.ad_raw_data)) {
            return false;
        } else {
            return true;
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
        if (PatchProxy.isSupport(new Object[]{effectCategoryModel}, this, f75442a, false, 88053, new Class[]{EffectCategoryModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCategoryModel}, this, f75442a, false, 88053, new Class[]{EffectCategoryModel.class}, Void.TYPE);
            return;
        }
        String str = effectCategoryModel.key;
        if (!TextUtils.equals(this.g, str)) {
            if (TextUtils.equals(str, this.f75444c)) {
                a();
            } else {
                b();
            }
            this.g = str;
        }
    }

    public void onChildViewAttachedToWindow(@NonNull View view) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view}, this, f75442a, false, 88051, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f75442a, false, 88051, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.f75445d.getUserVisibleHint()) {
            ah ahVar = (ah) this.f75447f.b(this.f75443b.getChildAdapterPosition(view) + 1);
            if (a(ahVar)) {
                String str = ahVar.f69295b.effect_id;
                Boolean bool = this.h.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (!z) {
                    de.a(ahVar.f69295b);
                }
                this.h.put(str, Boolean.TRUE);
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f75442a, false, 88050, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f75442a, false, 88050, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.f75445d.getUserVisibleHint()) {
            a();
        }
    }

    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i2)}, this, f75442a, false, 88048, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i2)}, this, f75442a, false, 88048, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f75443b.removeOnChildAttachStateChangeListener(this);
        super.onScrollStateChanged(recyclerView, i2);
        if (i2 == 0) {
            a();
        }
    }

    public BusiStickerShowLogger(String str, Fragment fragment, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, CategoryStickerAdapter categoryStickerAdapter) {
        this.f75444c = str;
        this.f75445d = fragment;
        this.f75443b = recyclerView;
        this.f75446e = gridLayoutManager;
        this.f75447f = categoryStickerAdapter;
        ((TabSelectViewModel) ViewModelProviders.of(fragment.getActivity()).get(TabSelectViewModel.class)).f70306b.observe(fragment, this);
    }
}
