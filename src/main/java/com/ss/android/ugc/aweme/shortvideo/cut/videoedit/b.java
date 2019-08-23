package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.graphics.Bitmap;
import android.support.v4.util.Pair;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.FramesAdapter;

public final /* synthetic */ class b implements com.ss.android.ugc.aweme.shortvideo.cut.model.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66570a;

    /* renamed from: b  reason: collision with root package name */
    private final FramesAdapter.FrameViewHolder f66571b;

    /* renamed from: c  reason: collision with root package name */
    private final FramesAdapter.FrameViewHolder f66572c;

    /* renamed from: d  reason: collision with root package name */
    private final String f66573d;

    /* renamed from: e  reason: collision with root package name */
    private final int f66574e;

    /* renamed from: f  reason: collision with root package name */
    private final Pair f66575f;
    private final String g;

    b(FramesAdapter.FrameViewHolder frameViewHolder, FramesAdapter.FrameViewHolder frameViewHolder2, String str, int i, Pair pair, String str2) {
        this.f66571b = frameViewHolder;
        this.f66572c = frameViewHolder2;
        this.f66573d = str;
        this.f66574e = i;
        this.f66575f = pair;
        this.g = str2;
    }

    public final void a(CloseableReference closeableReference) {
        CloseableReference closeableReference2 = closeableReference;
        if (PatchProxy.isSupport(new Object[]{closeableReference2}, this, f66570a, false, 75884, new Class[]{CloseableReference.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeableReference2}, this, f66570a, false, 75884, new Class[]{CloseableReference.class}, Void.TYPE);
            return;
        }
        FramesAdapter.FrameViewHolder frameViewHolder = this.f66571b;
        FramesAdapter.FrameViewHolder frameViewHolder2 = this.f66572c;
        String str = this.f66573d;
        int i = this.f66574e;
        Pair pair = this.f66575f;
        String str2 = this.g;
        if (frameViewHolder2.f66529b != null && frameViewHolder2.f66529b.getTag().equals(str)) {
            if (PatchProxy.isSupport(new Object[]{closeableReference2}, frameViewHolder, FramesAdapter.FrameViewHolder.f66528a, false, 75880, new Class[]{CloseableReference.class}, Void.TYPE)) {
                Object[] objArr = {closeableReference2};
                FramesAdapter.FrameViewHolder frameViewHolder3 = frameViewHolder;
                ChangeQuickRedirect changeQuickRedirect = FramesAdapter.FrameViewHolder.f66528a;
                PatchProxy.accessDispatch(objArr, frameViewHolder3, changeQuickRedirect, false, 75880, new Class[]{CloseableReference.class}, Void.TYPE);
            } else {
                Bitmap underlyingBitmap = ((a) closeableReference.get()).getUnderlyingBitmap();
                if (!(underlyingBitmap == null || underlyingBitmap.isRecycled() || frameViewHolder.f66529b == null)) {
                    frameViewHolder.a();
                    frameViewHolder.f66530c = closeableReference2;
                    frameViewHolder.f66529b.setImageBitmap(underlyingBitmap);
                }
            }
        }
        if (i == ((Integer) pair.second).intValue()) {
            FramesAdapter.this.f66527f.a(str2);
        }
    }
}
