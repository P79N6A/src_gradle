package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67407a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67408b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67409c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67410d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f67411e;

    p(InfoStickerHelper infoStickerHelper, int i, int i2, int[] iArr) {
        this.f67408b = infoStickerHelper;
        this.f67409c = i;
        this.f67410d = i2;
        this.f67411e = iArr;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67407a, false, 76843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67407a, false, 76843, new Class[0], Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67408b;
        int i = this.f67409c;
        int i2 = this.f67410d;
        int[] iArr = this.f67411e;
        if (i != 0 && i2 != 0 && iArr != null) {
            infoStickerHelper.t = new Rect(0, iArr[1], i, i2 + iArr[1]);
        }
    }
}
