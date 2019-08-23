package com.ss.android.ugc.aweme.hotsearch.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.base.h;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseRankingListFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00102\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003:\u0001\u0010B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\bj\u0002`\t0\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/hotsearch/adapter/HotSearchRankingPagerAdapter;", "Lcom/ss/android/ugc/aweme/hotsearch/adapter/SourceFragmentPagerAdapter;", "Landroid/support/v4/app/Fragment;", "Lcom/ss/android/ugc/aweme/hotsearch/adapter/CommonFragmentPagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "pages", "", "Lcom/ss/android/ugc/aweme/discover/base/SourceTabPage;", "Lcom/ss/android/ugc/aweme/discover/base/TabPage;", "(Landroid/support/v4/app/FragmentManager;Ljava/util/List;)V", "getItemPositionByType", "", "type", "getItemType", "position", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSearchRankingPagerAdapter extends SourceFragmentPagerAdapter<Fragment> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f49657c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f49658d = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/hotsearch/adapter/HotSearchRankingPagerAdapter$Companion;", "", "()V", "buildPage", "Lcom/ss/android/ugc/aweme/discover/base/SourceTabPage;", "Landroid/support/v4/app/Fragment;", "Lcom/ss/android/ugc/aweme/discover/base/TabPage;", "fragmentClass", "Ljava/lang/Class;", "title", "", "type", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49659a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final h<Fragment> a(@NotNull Class<? extends Fragment> cls, @NotNull String str, int i) {
            Class<? extends Fragment> cls2 = cls;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{cls2, str2, Integer.valueOf(i)}, this, f49659a, false, 49599, new Class[]{Class.class, String.class, Integer.TYPE}, h.class)) {
                return (h) PatchProxy.accessDispatch(new Object[]{cls2, str2, Integer.valueOf(i)}, this, f49659a, false, 49599, new Class[]{Class.class, String.class, Integer.TYPE}, h.class);
            }
            Intrinsics.checkParameterIsNotNull(cls2, "fragmentClass");
            Intrinsics.checkParameterIsNotNull(str2, PushConstants.TITLE);
            return new h<>(cls2, str2, BaseRankingListFragment.a(i), i);
        }
    }

    @JvmStatic
    @NotNull
    public static final h<Fragment> a(@NotNull Class<? extends Fragment> cls, @NotNull String str, int i) {
        Class<? extends Fragment> cls2 = cls;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{cls2, str2, Integer.valueOf(i)}, null, f49657c, true, 49598, new Class[]{Class.class, String.class, Integer.TYPE}, h.class)) {
            return f49658d.a(cls2, str2, i);
        }
        return (h) PatchProxy.accessDispatch(new Object[]{cls2, str2, Integer.valueOf(i)}, null, f49657c, true, 49598, new Class[]{Class.class, String.class, Integer.TYPE}, h.class);
    }

    public final int c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49657c, false, 49596, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49657c, false, 49596, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        h hVar = (h) CollectionsKt.getOrNull(this.g, i);
        if (hVar != null) {
            return hVar.f42175d;
        }
        return -1;
    }

    public final int d(int i) {
        Object obj;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49657c, false, 49597, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49657c, false, 49597, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Iterator it2 = this.g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((h) obj).f42175d == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        h hVar = (h) obj;
        if (hVar != null) {
            return this.g.indexOf(hVar);
        }
        return -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HotSearchRankingPagerAdapter(@NotNull FragmentManager fragmentManager, @NotNull List<? extends h<Fragment>> list) {
        super(fragmentManager, list);
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        Intrinsics.checkParameterIsNotNull(list, "pages");
    }
}
