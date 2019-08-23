package com.bytedance.android.livesdk.sticker.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;

public class LiveStickerComposerPageAdapter extends AbsPagerAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f17368e = null;
    private static final String g = "LiveStickerComposerPageAdapter";

    /* renamed from: f  reason: collision with root package name */
    public b f17369f;
    private final com.bytedance.android.livesdk.sticker.c.a h;
    private List<EffectCategoryResponse> i;
    private SparseArray<LiveStickerComposerListAdapter> j = new SparseArray<>();
    private com.bytedance.android.livesdk.sticker.b.a k;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        RecyclerView f17370a;

        /* renamed from: b  reason: collision with root package name */
        LiveStickerComposerListAdapter f17371b;

        a() {
        }
    }

    public interface b {
        void a(Boolean bool, com.bytedance.android.livesdk.sticker.b.a aVar);
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f17368e, false, 13497, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17368e, false, 13497, new Class[0], Integer.TYPE)).intValue();
        } else if (Lists.isEmpty(this.i)) {
            return 0;
        } else {
            return this.i.size();
        }
    }

    public final void a(List<EffectCategoryResponse> list) {
        List<EffectCategoryResponse> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f17368e, false, 13500, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f17368e, false, 13500, new Class[]{List.class}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            this.i = list2;
            notifyDataSetChanged();
        }
    }

    @Nullable
    public CharSequence getPageTitle(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f17368e, false, 13499, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return this.i.get(i2).name;
        }
        return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f17368e, false, 13499, new Class[]{Integer.TYPE}, CharSequence.class);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aVar}, this, f17368e, false, 13501, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aVar}, this, f17368e, false, 13501, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.w.b.ah.a(Integer.valueOf(i2));
        if (!(this.k == null || this.f17369f == null)) {
            this.f17369f.a(Boolean.FALSE, this.k);
        }
        this.k = aVar;
        if (!(aVar == null || this.f17369f == null)) {
            this.f17369f.a(Boolean.TRUE, this.k);
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            LiveStickerComposerListAdapter liveStickerComposerListAdapter = this.j.get(i3);
            if (liveStickerComposerListAdapter != null) {
                liveStickerComposerListAdapter.a(this.k);
            }
        }
    }

    LiveStickerComposerPageAdapter(Context context, com.bytedance.android.livesdk.sticker.b.a aVar, com.bytedance.android.livesdk.sticker.c.a aVar2) {
        super(context, LayoutInflater.from(context));
        this.h = aVar2;
        this.k = aVar;
    }

    public final View a(int i2, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        int i3 = i2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), view, viewGroup2}, this, f17368e, false, 13498, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), view, viewGroup2}, this, f17368e, false, 13498, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        }
        if (view == null) {
            aVar = new a();
            view2 = this.f8714c.inflate(C0906R.layout.alm, viewGroup2, false);
            aVar.f17370a = (RecyclerView) view2;
            aVar.f17370a.setLayoutManager(new SSGridLayoutManager(this.f8715d, 5, 1, false));
            view2.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        if (this.j.indexOfKey(i2) < 0) {
            LiveStickerComposerListAdapter liveStickerComposerListAdapter = new LiveStickerComposerListAdapter(this.h);
            liveStickerComposerListAdapter.a(this.k);
            liveStickerComposerListAdapter.f17354e = new o(this, i2);
            this.j.put(i2, liveStickerComposerListAdapter);
        }
        aVar.f17371b = this.j.get(i2);
        aVar.f17370a.setAdapter(aVar.f17371b);
        aVar.f17371b.a(this.i.get(i2).totalEffects);
        return view2;
    }
}
