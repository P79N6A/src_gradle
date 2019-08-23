package com.bytedance.android.livesdk.sticker.ui;

import android.view.View;
import com.bytedance.android.livesdk.sticker.b.a;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.sticker.ui.LiveStickerComposerListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.b.p;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17409a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveStickerComposerListAdapter f17410b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17411c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveStickerComposerListAdapter.StickerViewHolder f17412d;

    /* renamed from: e  reason: collision with root package name */
    private final a f17413e;

    m(LiveStickerComposerListAdapter liveStickerComposerListAdapter, int i, LiveStickerComposerListAdapter.StickerViewHolder stickerViewHolder, a aVar) {
        this.f17410b = liveStickerComposerListAdapter;
        this.f17411c = i;
        this.f17412d = stickerViewHolder;
        this.f17413e = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17409a, false, 13491, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17409a, false, 13491, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveStickerComposerListAdapter liveStickerComposerListAdapter = this.f17410b;
        int i = this.f17411c;
        LiveStickerComposerListAdapter.StickerViewHolder stickerViewHolder = this.f17412d;
        a aVar = this.f17413e;
        a aVar2 = liveStickerComposerListAdapter.f17353d.get(i);
        liveStickerComposerListAdapter.f17351b.a(aVar2.a(), aVar2.l, (p) new n(liveStickerComposerListAdapter, aVar2, stickerViewHolder));
        if (!liveStickerComposerListAdapter.f17351b.a(aVar2)) {
            liveStickerComposerListAdapter.f17355f = aVar2;
            liveStickerComposerListAdapter.f17351b.a(com.bytedance.android.livesdk.sticker.c.a.f17262c, aVar2, (a.C0122a) liveStickerComposerListAdapter);
        } else {
            com.bytedance.android.livesdk.sticker.b.a aVar3 = liveStickerComposerListAdapter.f17352c;
            liveStickerComposerListAdapter.f17352c = aVar2;
            if (aVar3 != null && liveStickerComposerListAdapter.f17353d.contains(aVar3)) {
                int indexOf = liveStickerComposerListAdapter.f17353d.indexOf(aVar3);
                if (indexOf >= 0) {
                    liveStickerComposerListAdapter.notifyItemChanged(indexOf);
                }
            }
            if (liveStickerComposerListAdapter.f17354e != null) {
                liveStickerComposerListAdapter.f17354e.a(liveStickerComposerListAdapter.f17352c);
            }
        }
        int b2 = liveStickerComposerListAdapter.b(aVar);
        if (b2 >= 0) {
            liveStickerComposerListAdapter.notifyItemChanged(b2);
        }
    }
}
