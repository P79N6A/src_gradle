package com.ss.android.ugc.aweme.hotsearch.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.adapter.FragmentPagerRebuildAdapter;
import com.ss.android.ugc.aweme.discover.base.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0002\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0014¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0014¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/hotsearch/adapter/SourceFragmentPagerAdapter;", "T", "Landroid/support/v4/app/Fragment;", "Lcom/ss/android/ugc/aweme/discover/adapter/FragmentPagerRebuildAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "pages", "", "Lcom/ss/android/ugc/aweme/discover/base/SourceTabPage;", "(Landroid/support/v4/app/FragmentManager;Ljava/util/List;)V", "getFm", "()Landroid/support/v4/app/FragmentManager;", "setFm", "(Landroid/support/v4/app/FragmentManager;)V", "getPages", "()Ljava/util/List;", "setPages", "(Ljava/util/List;)V", "bindFragment", "", "fragment", "position", "", "(Landroid/support/v4/app/Fragment;I)V", "createFragment", "(I)Landroid/support/v4/app/Fragment;", "getPageTitle", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class SourceFragmentPagerAdapter<T extends Fragment> extends FragmentPagerRebuildAdapter<T> {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f49666e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public FragmentManager f49667f;
    @NotNull
    public List<? extends h<T>> g;

    public final void a(@NotNull T t, int i) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2, Integer.valueOf(i)}, this, f49666e, false, 49626, new Class[]{Fragment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2, Integer.valueOf(i)}, this, f49666e, false, 49626, new Class[]{Fragment.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(t2, "fragment");
    }

    @Nullable
    public final T b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49666e, false, 49625, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49666e, false, 49625, new Class[]{Integer.TYPE}, Fragment.class);
        }
        h hVar = (h) this.g.get(i);
        try {
            T t = (Fragment) hVar.f42172a.newInstance();
            t.setArguments(hVar.f42174c);
            return t;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49666e, false, 49627, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return ((h) this.g.get(i)).f42173b;
        }
        return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49666e, false, 49627, new Class[]{Integer.TYPE}, CharSequence.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SourceFragmentPagerAdapter(@NotNull FragmentManager fragmentManager, @NotNull List<? extends h<T>> list) {
        super(fragmentManager, list.size());
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        Intrinsics.checkParameterIsNotNull(list, "pages");
        this.f49667f = fragmentManager;
        this.g = list;
    }
}
