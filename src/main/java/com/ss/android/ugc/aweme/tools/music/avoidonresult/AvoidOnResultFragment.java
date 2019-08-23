package com.ss.android.ugc.aweme.tools.music.avoidonresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.music.avoidonresult.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0002J\"\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J*\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\f\u001a\u00020\u0007J\u001e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0007R6\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResultFragment;", "Landroid/support/v4/app/Fragment;", "()V", "mCallbacks", "Ljava/util/HashMap;", "", "", "Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResult$Callback;", "Lkotlin/collections/HashMap;", "addIntoCallbackList", "", "requestCode", "callback", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "removeFromCallbackList", "startForResult", "runnable", "Lkotlin/Function1;", "intent", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AvoidOnResultFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74799a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Integer, List<a.C0774a>> f74800b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private HashMap f74801c;

    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74799a, false, 87219, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74799a, false, 87219, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f74799a, false, 87221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74799a, false, 87221, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f74799a, false, 87220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74799a, false, 87220, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74799a, false, 87222, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74799a, false, 87222, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f74799a, false, 87218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74799a, false, 87218, new Class[0], Void.TYPE);
            return;
        }
        if (this.f74801c != null) {
            this.f74801c.clear();
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f74799a, false, 87216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74799a, false, 87216, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        Set<Integer> keySet = this.f74800b.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "mCallbacks.keys");
        for (Integer remove : keySet) {
            this.f74800b.remove(remove);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f74799a, false, 87210, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f74799a, false, 87210, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    private final void a(int i, a.C0774a aVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar}, this, f74799a, false, 87212, new Class[]{Integer.TYPE, a.C0774a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar}, this, f74799a, false, 87212, new Class[]{Integer.TYPE, a.C0774a.class}, Void.TYPE);
            return;
        }
        List list = this.f74800b.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
        }
        list.add(list.size(), aVar);
        this.f74800b.put(Integer.valueOf(i), list);
    }

    public final void a(int i, @NotNull Function1<? super Fragment, Unit> function1, @NotNull a.C0774a aVar) {
        Function1<? super Fragment, Unit> function12 = function1;
        a.C0774a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), function12, aVar2}, this, f74799a, false, 87215, new Class[]{Integer.TYPE, Function1.class, a.C0774a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), function12, aVar2}, this, f74799a, false, 87215, new Class[]{Integer.TYPE, Function1.class, a.C0774a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "runnable");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        int i2 = i;
        a(i, aVar2);
        function12.invoke(this);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        a.C0774a aVar;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f74799a, false, 87211, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f74799a, false, 87211, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74799a, false, 87213, new Class[]{Integer.TYPE}, a.C0774a.class)) {
            aVar = (a.C0774a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74799a, false, 87213, new Class[]{Integer.TYPE}, a.C0774a.class);
        } else {
            List list = this.f74800b.get(Integer.valueOf(i));
            if (list == null || list.isEmpty()) {
                this.f74800b.remove(Integer.valueOf(i));
                aVar = null;
            } else {
                a.C0774a aVar2 = (a.C0774a) list.remove(list.size() - 1);
                if (list.isEmpty()) {
                    this.f74800b.remove(Integer.valueOf(i));
                }
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            int i3 = i2;
            aVar.a(i2, intent2);
        }
    }
}
