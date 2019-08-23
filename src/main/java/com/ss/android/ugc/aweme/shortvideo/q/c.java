package com.ss.android.ugc.aweme.shortvideo.q;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.g;
import dmt.av.video.ah;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68999a;

    public static int[] a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f68999a, true, 81107, new Class[]{String.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{str}, null, f68999a, true, 81107, new Class[]{String.class}, int[].class);
        }
        int[] iArr = new int[2];
        int[] a2 = ah.a(str);
        if (a2 == null) {
            a.a("parse video failed");
            return null;
        }
        iArr[0] = a2[0];
        iArr[1] = a2[1];
        return iArr;
    }

    public static int b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f68999a, true, 81108, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f68999a, true, 81108, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        FFMpegManager a2 = FFMpegManager.a();
        String a3 = g.a(str2, co.AUDIO);
        if (!PatchProxy.isSupport(new Object[]{a3}, a2, FFMpegManager.f29312a, false, 16216, new Class[]{String.class}, Integer.TYPE)) {
            return a2.f29314b.checkAudioFile(a3);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{a3}, a2, FFMpegManager.f29312a, false, 16216, new Class[]{String.class}, Integer.TYPE)).intValue();
    }
}
