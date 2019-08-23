package com.ss.android.ugc.aweme.util;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.HashMap;
import java.util.Map;

public class FollowPageFirstFrameViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75411a;

    /* renamed from: b  reason: collision with root package name */
    public String f75412b = "click";

    /* renamed from: c  reason: collision with root package name */
    public long f75413c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Boolean> f75414d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private int f75415e = 0;

    private boolean g() {
        if (this.f75415e == 1) {
            return true;
        }
        return false;
    }

    private void f() {
        if (this.f75415e < 2) {
            this.f75415e++;
        }
    }

    private boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f75411a, false, 87807, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75411a, false, 87807, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a() && g()) {
            z = true;
        }
        return z;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75411a, false, 87806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75411a, false, 87806, new Class[0], Void.TYPE);
            return;
        }
        f();
        if (e()) {
            this.f75413c = System.currentTimeMillis();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75411a, false, 87808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75411a, false, 87808, new Class[0], Void.TYPE);
        } else if (e()) {
            a("click_to_request");
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f75411a, false, 87809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75411a, false, 87809, new Class[0], Void.TYPE);
        } else if (e()) {
            a("request_to_response");
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f75411a, false, 87810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75411a, false, 87810, new Class[0], Void.TYPE);
        } else if (e()) {
            a("response_to_play");
            this.f75413c = 0;
        }
    }

    @NonNull
    public static FollowPageFirstFrameViewModel a(@NonNull FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f75411a, true, 87805, new Class[]{FragmentActivity.class}, FollowPageFirstFrameViewModel.class)) {
            return (FollowPageFirstFrameViewModel) ViewModelProviders.of(fragmentActivity).get(FollowPageFirstFrameViewModel.class);
        }
        return (FollowPageFirstFrameViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f75411a, true, 87805, new Class[]{FragmentActivity.class}, FollowPageFirstFrameViewModel.class);
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f75411a, false, 87811, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f75411a, false, 87811, new Class[]{String.class}, Void.TYPE);
        } else if (!this.f75414d.containsKey(str)) {
            this.f75414d.put(str, Boolean.TRUE);
            if (this.f75413c != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f75413c = currentTimeMillis;
                r.a("video_load_duration", (Map) d.a().a("enter_method", this.f75412b).a("duration", currentTimeMillis - this.f75413c).a("duration_type", str).f34114b);
            }
        }
    }
}
