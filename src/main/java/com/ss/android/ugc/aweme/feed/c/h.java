package com.ss.android.ugc.aweme.feed.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45100a;

    /* renamed from: b  reason: collision with root package name */
    private final c f45101b;

    /* renamed from: c  reason: collision with root package name */
    private final long f45102c;

    public h(c cVar, long j) {
        this.f45101b = cVar;
        this.f45102c = j;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45100a, false, 40967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45100a, false, 40967, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f45101b;
        long j = this.f45102c;
        VideoFloatingCard videoFloatingCard = cVar.f45087c;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, videoFloatingCard, VideoFloatingCard.f46330a, false, 43239, new Class[]{Long.TYPE}, Void.TYPE)) {
            VideoFloatingCard videoFloatingCard2 = videoFloatingCard;
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, videoFloatingCard2, VideoFloatingCard.f46330a, false, 43239, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{new Long(j), null, null}, videoFloatingCard, VideoFloatingCard.f46330a, false, 43240, new Class[]{Long.TYPE, Runnable.class, Runnable.class}, Void.TYPE)) {
            VideoFloatingCard videoFloatingCard3 = videoFloatingCard;
            PatchProxy.accessDispatch(new Object[]{new Long(j), null, null}, videoFloatingCard3, VideoFloatingCard.f46330a, false, 43240, new Class[]{Long.TYPE, Runnable.class, Runnable.class}, Void.TYPE);
            return;
        }
        videoFloatingCard.animate().translationX(0.0f).alpha(1.0f).withStartAction(new VideoFloatingCard.c(null)).setDuration(j).withEndAction(new VideoFloatingCard.d(null)).start();
    }
}
