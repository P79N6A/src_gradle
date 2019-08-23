package com.ss.android.ugc.aweme.main.f;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.PublishDialogFragment;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54735a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f54735a, true, 58164, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f54735a, true, 58164, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() || ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            return false;
        }
        return true;
    }

    public static void a(FragmentActivity fragmentActivity) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f54735a, true, 58165, new Class[]{FragmentActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f54735a, true, 58165, new Class[]{FragmentActivity.class}, Void.TYPE);
            return;
        }
        if (a() && fragmentActivity != null) {
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag("publish");
            if (findFragmentByTag instanceof PublishDialogFragment) {
                ((PublishDialogFragment) findFragmentByTag).a();
            }
        }
    }

    public static void b(FragmentActivity fragmentActivity) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f54735a, true, 58166, new Class[]{FragmentActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f54735a, true, 58166, new Class[]{FragmentActivity.class}, Void.TYPE);
            return;
        }
        if (fragmentActivity != null) {
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag("publish");
            if (findFragmentByTag instanceof PublishDialogFragment) {
                ((PublishDialogFragment) findFragmentByTag).b();
            }
        }
    }
}
