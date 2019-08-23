package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

public class SearchInfoStickerHolder extends RecyclerView.ViewHolder implements Observer<a<ProviderEffect>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69799a;

    /* renamed from: b  reason: collision with root package name */
    StickerImageView f69800b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69801c;

    /* renamed from: d  reason: collision with root package name */
    FragmentActivity f69802d;

    /* renamed from: e  reason: collision with root package name */
    public p f69803e;

    SearchInfoStickerHolder(View view) {
        super(view);
        this.f69800b = (StickerImageView) view.findViewById(C0906R.id.cvk);
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f69799a, false, 79430, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f69799a, false, 79430, new Class[]{a.class}, Void.TYPE);
            return;
        }
        switch (aVar.f76550c) {
            case ERROR:
                this.f69803e.f70101c = 3;
                this.f69800b.c();
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f69802d, (int) C0906R.string.abg).a();
                return;
            case SUCCESS:
                this.f69803e.f70101c = 1;
                this.f69800b.a();
                InfoStickerModule.a(this.f69802d).c().setValue(new a().apply((ProviderEffect) aVar.f76549b));
                return;
            case PROGRESS:
                this.f69803e.f70101c = 5;
                int i = aVar.f76551d;
                this.f69803e.f70102d = i;
                if (((ProviderEffect) aVar.f76549b).id.equals(this.f69803e.f70100b.id) && i > 0) {
                    this.f69800b.a(i);
                    break;
                }
        }
    }
}
