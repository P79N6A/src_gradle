package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.presenter.bn;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
public final /* synthetic */ class du {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f13187a;

    static {
        int[] iArr = new int[bn.b.values().length];
        f13187a = iArr;
        iArr[bn.b.IDLE.ordinal()] = 1;
        f13187a[bn.b.IN_PROGRESS.ordinal()] = 2;
        f13187a[bn.b.FINISHED.ordinal()] = 3;
    }
}
