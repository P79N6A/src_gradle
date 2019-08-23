package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import a.i;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

public abstract class e {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f67265b;

    @NotNull
    public abstract String a(String str, int i);

    public final i<d> a(View view, View view2, String str, int i, int i2, int i3, int i4) {
        View view3 = view;
        View view4 = view2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view3, view4, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f67265b, false, 76969, new Class[]{View.class, View.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{view3, view4, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f67265b, false, 76969, new Class[]{View.class, View.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class);
        } else if (view3 != null && view4 != null && !TextUtils.isEmpty(str)) {
            return b(view, view2, str, i, i2, i3, i4);
        } else {
            return i.a((Exception) new NullPointerException("stickerView = " + view3 + ", stickerLayout = " + view4 + "draftDir = " + str2));
        }
    }

    private i<d> b(View view, View view2, String str, int i, int i2, int i3, int i4) {
        View view3 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view3, view2, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f67265b, false, 76970, new Class[]{View.class, View.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{view3, view2, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f67265b, false, 76970, new Class[]{View.class, View.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class);
        }
        String a2 = a(str2, ((ViewGroup) view2).indexOfChild(view3));
        File file = new File(a2);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    bm.c(a2);
                } else {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
        b.a(a2, true);
        if (PatchProxy.isSupport(new Object[]{view3, view2, a2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f67265b, false, 76971, new Class[]{View.class, View.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{view3, view2, a2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f67265b, false, 76971, new Class[]{View.class, View.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class);
        }
        f fVar = new f(this, i, i2, view2, view, i3, i4);
        return i.a((Callable<TResult>) fVar, i.f1052b).c(new g(this, a2), i.f1051a);
    }
}
