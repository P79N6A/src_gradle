package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.fb;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class by implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67154a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity.AnonymousClass8 f67155b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f67156c;

    by(VEVideoPublishEditActivity.AnonymousClass8 r1, Fragment fragment) {
        this.f67155b = r1;
        this.f67156c = fragment;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67154a, false, 76535, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f67154a, false, 76535, new Class[]{Object.class}, Object.class);
        }
        VEVideoPublishEditActivity.AnonymousClass8 r0 = this.f67155b;
        fb.a(this.f67156c.getView(), (Context) VEVideoPublishEditActivity.this.I(), VEVideoPublishEditActivity.this.K.d(), VEVideoPublishEditActivity.this.K.e());
        VEVideoPublishEditActivity.this.w();
        return null;
    }
}
