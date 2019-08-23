package com.bytedance.android.livesdk.common;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

public abstract class a {
    public static ChangeQuickRedirect k;

    /* renamed from: a  reason: collision with root package name */
    private Set<Dialog> f13638a = new HashSet();
    public boolean l;
    protected Context m;
    public Fragment n;
    protected View o;

    public void a() {
    }

    public void e() {
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 8071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 8071, new Class[0], Void.TYPE);
            return;
        }
        this.l = false;
        this.m = null;
        this.o = null;
        for (Dialog next : this.f13638a) {
            if (next != null && next.isShowing()) {
                if (PatchProxy.isSupport(new Object[]{next}, null, b.f13639a, true, 8077, new Class[]{Dialog.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{next}, null, b.f13639a, true, 8077, new Class[]{Dialog.class}, Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    next.dismiss();
                } else {
                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                }
            }
        }
        this.f13638a.clear();
    }

    public void a(Context context, View view, Bundle bundle) {
        this.m = context;
        this.o = view;
        this.l = true;
    }
}
