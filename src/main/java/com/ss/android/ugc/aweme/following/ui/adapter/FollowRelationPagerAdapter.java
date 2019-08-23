package com.ss.android.ugc.aweme.following.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowRelationPagerAdapter;", "Landroid/support/v4/app/FragmentPagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "fragments", "", "Landroid/support/v4/app/Fragment;", "fragmentTitles", "", "(Landroid/support/v4/app/FragmentManager;Ljava/util/List;Ljava/util/List;)V", "getFm", "()Landroid/support/v4/app/FragmentManager;", "getFragmentTitles", "()Ljava/util/List;", "getFragments", "getCount", "", "getItem", "position", "getPageTitle", "", "updateTitle", "", "title", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowRelationPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48091a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f48092b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final List<Fragment> f48093c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f48094d;

    public final int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f48091a, false, 45096, new Class[0], Integer.TYPE)) {
            return this.f48093c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48091a, false, 45096, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final Fragment getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48091a, false, 45095, new Class[]{Integer.TYPE}, Fragment.class)) {
            return this.f48093c.get(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48091a, false, 45095, new Class[]{Integer.TYPE}, Fragment.class);
    }

    @Nullable
    public final CharSequence getPageTitle(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48091a, false, 45097, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return this.f48094d.get(i);
        }
        return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48091a, false, 45097, new Class[]{Integer.TYPE}, CharSequence.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowRelationPagerAdapter(@NotNull FragmentManager fragmentManager, @NotNull List<Fragment> list, @NotNull List<String> list2) {
        super(fragmentManager);
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        Intrinsics.checkParameterIsNotNull(list, "fragments");
        Intrinsics.checkParameterIsNotNull(list2, "fragmentTitles");
        this.f48092b = fragmentManager;
        this.f48093c = list;
        this.f48094d = list2;
    }
}
