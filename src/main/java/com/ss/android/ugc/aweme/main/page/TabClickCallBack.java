package com.ss.android.ugc.aweme.main.page;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.main.base.MainBottomTabView;

public class TabClickCallBack extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54878a;

    /* renamed from: b  reason: collision with root package name */
    b<String> f54879b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    b<String> f54880c = new b<>();

    public static MutableLiveData<String> a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f54878a, true, 58159, new Class[]{Context.class}, MutableLiveData.class)) {
            return ((TabClickCallBack) ViewModelProviders.of((FragmentActivity) v.a(context)).get(TabClickCallBack.class)).f54879b;
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[]{context}, null, f54878a, true, 58159, new Class[]{Context.class}, MutableLiveData.class);
    }

    public static MutableLiveData<String> b(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f54878a, true, 58160, new Class[]{Context.class}, MutableLiveData.class)) {
            return ((TabClickCallBack) ViewModelProviders.of((FragmentActivity) v.a(context)).get(TabClickCallBack.class)).f54880c;
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[]{context}, null, f54878a, true, 58160, new Class[]{Context.class}, MutableLiveData.class);
    }

    public static void a(Context context, LifecycleOwner lifecycleOwner, MainBottomTabView.a aVar) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        final MainBottomTabView.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, lifecycleOwner2, aVar2}, null, f54878a, true, 58161, new Class[]{Context.class, LifecycleOwner.class, MainBottomTabView.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, lifecycleOwner2, aVar2}, null, f54878a, true, 58161, new Class[]{Context.class, LifecycleOwner.class, MainBottomTabView.a.class}, Void.TYPE);
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) v.a(context);
        a(fragmentActivity).observe(lifecycleOwner2, new Observer<String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54881a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                String str = (String) obj;
                if (PatchProxy.isSupport(new Object[]{str}, this, f54881a, false, 58162, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f54881a, false, 58162, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                aVar2.a(str);
            }
        });
        b(fragmentActivity).observe(lifecycleOwner2, new Observer<String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54883a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                String str = (String) obj;
                if (PatchProxy.isSupport(new Object[]{str}, this, f54883a, false, 58163, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f54883a, false, 58163, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                aVar2.b(str);
            }
        });
    }
}
