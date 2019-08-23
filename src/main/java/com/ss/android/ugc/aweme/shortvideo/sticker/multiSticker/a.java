package com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker;

import android.annotation.SuppressLint;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ViewStubCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurChildStickerViewModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70150a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f70151b;

    /* renamed from: c  reason: collision with root package name */
    MultiStickerAdapter f70152c;

    /* renamed from: d  reason: collision with root package name */
    private AppCompatActivity f70153d;

    /* renamed from: e  reason: collision with root package name */
    private c f70154e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayoutManager f70155f = new LinearLayoutManager(this.f70151b.getContext(), 0, false);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70150a, false, 79802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70150a, false, 79802, new Class[0], Void.TYPE);
            return;
        }
        this.f70151b.setVisibility(8);
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70150a, false, 79805, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70150a, false, 79805, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int findFirstVisibleItemPosition = this.f70155f.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f70155f.findLastVisibleItemPosition();
        if (i <= findFirstVisibleItemPosition || i > findLastVisibleItemPosition) {
            this.f70151b.scrollToPosition(i);
            return;
        }
        this.f70151b.scrollBy(0, this.f70151b.getChildAt(i - findFirstVisibleItemPosition).getTop());
    }

    /* access modifiers changed from: package-private */
    public final void a(@Nullable FaceStickerBean faceStickerBean, int i) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean, Integer.valueOf(i)}, this, f70150a, false, 79804, new Class[]{FaceStickerBean.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean, Integer.valueOf(i)}, this, f70150a, false, 79804, new Class[]{FaceStickerBean.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f70154e != null) {
            this.f70154e.a(faceStickerBean);
        }
        this.f70152c.f70158c = i;
        a(i);
    }

    @SuppressLint({"RestrictedApi"})
    public a(AppCompatActivity appCompatActivity, View view, c cVar, EffectStickerManager effectStickerManager) {
        this.f70153d = appCompatActivity;
        this.f70151b = (RecyclerView) ((ViewStubCompat) view.findViewById(C0906R.id.cww)).inflate();
        this.f70154e = cVar;
        this.f70152c = new MultiStickerAdapter(cVar, effectStickerManager);
        ((CurChildStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f70153d).get(CurChildStickerViewModel.class)).f70245b.observe(this.f70153d, new b(this));
        this.f70151b.setLayoutManager(this.f70155f);
        this.f70151b.setAdapter(this.f70152c);
    }
}
