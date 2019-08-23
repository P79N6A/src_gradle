package com.ss.android.ugc.aweme.main.page;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;

public class FeedEventTypeCallBack extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54868a;

    /* renamed from: b  reason: collision with root package name */
    b<String> f54869b = new b<>();

    public interface a {
        void onEventTypeChange(String str);
    }

    public static b<String> a(FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f54868a, true, 58148, new Class[]{FragmentActivity.class}, b.class)) {
            return ((FeedEventTypeCallBack) ViewModelProviders.of(fragmentActivity).get(FeedEventTypeCallBack.class)).f54869b;
        }
        return (b) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f54868a, true, 58148, new Class[]{FragmentActivity.class}, b.class);
    }

    public static void a(FragmentActivity fragmentActivity, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, str2}, null, f54868a, true, 58147, new Class[]{FragmentActivity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, str2}, null, f54868a, true, 58147, new Class[]{FragmentActivity.class, String.class}, Void.TYPE);
            return;
        }
        a(fragmentActivity).setValue(str2);
    }
}
