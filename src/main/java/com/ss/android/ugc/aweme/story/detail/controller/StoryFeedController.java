package com.ss.android.ugc.aweme.story.detail.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.feed.model.a;

public class StoryFeedController extends LifecycleController {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72415a;

    /* renamed from: b  reason: collision with root package name */
    public f f72416b;

    /* renamed from: c  reason: collision with root package name */
    public a f72417c;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f72415a, false, 83176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72415a, false, 83176, new Class[0], Void.TYPE);
            return;
        }
        if (this.f4117d != null) {
            this.f4117d.c().postValue(this.f72417c);
        }
    }

    public StoryFeedController(FragmentActivity fragmentActivity, Fragment fragment) {
        super(fragmentActivity, fragment);
    }
}
