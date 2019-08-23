package com.ss.android.ugc.aweme.port.internal;

import a.g;
import a.i;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.shortvideo.PublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.s;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

public class PublishFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61144a;

    /* renamed from: b  reason: collision with root package name */
    final ServiceConnectionImpl f61145b;

    /* renamed from: c  reason: collision with root package name */
    private final FragmentActivity f61146c;

    /* renamed from: d  reason: collision with root package name */
    private final IPublishService.OnPublishCallback f61147d;

    public void onFragmentDetached(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f61144a, false, 67186, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f61144a, false, 67186, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        super.onFragmentDetached(fragmentManager, fragment);
        if (fragment instanceof PublishDialogFragment) {
            this.f61146c.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this);
            if (this.f61145b.f3769b != null) {
                this.f61145b.f3769b.b((s) fragment);
            }
            if (this.f61147d != null) {
                this.f61147d.onStopPublish();
            }
            try {
                this.f61146c.unbindService(this.f61145b);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public PublishFragmentLifecycleCallbacks(@NonNull FragmentActivity fragmentActivity, ServiceConnectionImpl serviceConnectionImpl, @Nullable IPublishService.OnPublishCallback onPublishCallback) {
        this.f61146c = fragmentActivity;
        this.f61145b = serviceConnectionImpl;
        this.f61147d = onPublishCallback;
    }

    public void onFragmentAttached(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @NotNull Context context) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2, context}, this, f61144a, false, 67184, new Class[]{FragmentManager.class, Fragment.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2, context}, this, f61144a, false, 67184, new Class[]{FragmentManager.class, Fragment.class, Context.class}, Void.TYPE);
            return;
        }
        super.onFragmentAttached(fragmentManager, fragment, context);
        if ((fragment2 instanceof PublishDialogFragment) && this.f61145b.f3769b != null) {
            this.f61145b.f3769b.a((s) fragment2);
        }
    }

    public void onFragmentViewCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @NotNull View view, Bundle bundle) {
        Fragment fragment2 = fragment;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2, view2, bundle}, this, f61144a, false, 67185, new Class[]{FragmentManager.class, Fragment.class, View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2, view2, bundle}, this, f61144a, false, 67185, new Class[]{FragmentManager.class, Fragment.class, View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        if (!a.a() && (fragment2 instanceof PublishDialogFragment) && this.f61145b.f3769b != null) {
            i.a((Callable<TResult>) new h<TResult>(this)).a((g<TResult, TContinuationResult>) new i<TResult,TContinuationResult>(fragment2, view2), i.f1052b);
        }
    }
}
