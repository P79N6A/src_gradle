package com.ss.android.ugc.aweme.story.feed.jedi;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.utils.i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/ViewPager2ViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "currentItem", "Landroid/arch/lifecycle/MutableLiveData;", "", "getCurrentItem", "()Landroid/arch/lifecycle/MutableLiveData;", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ViewPager2ViewModel extends ViewModel {

    /* renamed from: b  reason: collision with root package name */
    public static final a f72608b = new a((byte) 0);
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final MutableLiveData<Integer> f72609a = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/ViewPager2ViewModel$Companion;", "", "()V", "getCurrentItemLiveData", "Landroid/arch/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "setCurrentItem", "", "item", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72610a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull Context context, int i) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f72610a, false, 83440, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f72610a, false, 83440, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Activity a2 = i.a(context);
            if (a2 != null) {
                ((ViewPager2ViewModel) ViewModelProviders.of((FragmentActivity) a2).get(ViewPager2ViewModel.class)).f72609a.setValue(Integer.valueOf(i));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }
}
