package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000bH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/adapter/VoteViewPagerAdapter;", "Landroid/support/v4/app/FragmentPagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "(Landroid/support/v4/app/FragmentManager;)V", "fragments", "", "Landroid/support/v4/app/Fragment;", "getFragments", "()Ljava/util/List;", "getCount", "", "getItem", "p0", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VoteViewPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69853a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final List<Fragment> f69854b = new ArrayList();

    public final int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f69853a, false, 79496, new Class[0], Integer.TYPE)) {
            return this.f69854b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69853a, false, 79496, new Class[0], Integer.TYPE)).intValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoteViewPagerAdapter(@NotNull FragmentManager fragmentManager) {
        super(fragmentManager);
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
    }

    @NotNull
    public final Fragment getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69853a, false, 79495, new Class[]{Integer.TYPE}, Fragment.class)) {
            return this.f69854b.get(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69853a, false, 79495, new Class[]{Integer.TYPE}, Fragment.class);
    }
}
