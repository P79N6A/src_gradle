package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.arch.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.b;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f73934a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f73935b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f73936c;

    static {
        int[] iArr = new int[b.values().length];
        f73934a = iArr;
        iArr[b.STATE_OPEN.ordinal()] = 1;
        f73934a[b.STATE_OPEN_FAILED.ordinal()] = 2;
        int[] iArr2 = new int[f.values().length];
        f73935b = iArr2;
        iArr2[f.START_RECORD.ordinal()] = 1;
        f73935b[f.STOP_RECORD.ordinal()] = 2;
        f73935b[f.CONCAT_FINISH.ordinal()] = 3;
        int[] iArr3 = new int[Lifecycle.Event.values().length];
        f73936c = iArr3;
        iArr3[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        f73936c[Lifecycle.Event.ON_START.ordinal()] = 2;
    }
}
