package com.ss.android.ugc.aweme.feed.c;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {
    public static ChangeQuickRedirect o;
    public Activity p;
    protected Fragment q;
    public String r;
    public int s;
    protected String t;
    public String u = "click";
    public boolean v;

    public void b() {
        this.p = null;
    }

    public Activity c() {
        return this.p;
    }

    public Context d() {
        return this.p;
    }

    public Fragment e() {
        return this.q;
    }

    public String f() {
        return this.t;
    }

    public String l() {
        return this.r;
    }

    public final boolean j() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, o, false, 40945, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, o, false, 40945, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbsFragment absFragment = (AbsFragment) e();
        if (absFragment != null) {
            return absFragment.isViewValid();
        }
        if (this.p != null && !this.p.isFinishing()) {
            z = true;
        }
        return z;
    }

    public final FragmentManager k() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 40946, new Class[0], FragmentManager.class)) {
            return (FragmentManager) PatchProxy.accessDispatch(new Object[0], this, o, false, 40946, new Class[0], FragmentManager.class);
        }
        AbsFragment absFragment = (AbsFragment) e();
        if (absFragment == null && (this.p instanceof FragmentActivity)) {
            return ((FragmentActivity) this.p).getSupportFragmentManager();
        }
        if (absFragment == null) {
            return null;
        }
        return absFragment.getChildFragmentManager();
    }

    public void b_(String str) {
        this.r = str;
    }

    public void c_(String str) {
        this.t = str;
    }

    public a(String str, int i) {
        this.r = str;
        this.s = i;
    }

    public void a(Activity activity, Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{activity, fragment}, this, o, false, 40947, new Class[]{Activity.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, fragment}, this, o, false, 40947, new Class[]{Activity.class, Fragment.class}, Void.TYPE);
            return;
        }
        if (activity == null) {
            com.ss.android.ugc.aweme.comment.a.a.b("ATTACH ACTIVITY == NULL");
        }
        this.p = activity;
        this.q = fragment;
    }
}
