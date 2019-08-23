package com.ss.android.ugc.aweme.commercialize.loft.adapter;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.j;
import com.ss.android.ugc.aweme.feed.adapter.MultiTypePagerAdapter;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.video.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014J\u0012\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J$\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\"\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010(\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u001fH\u0002J \u00105\u001a\u0002032\u0006\u0010-\u001a\u00020+2\u0006\u00106\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/adapter/LoftPagerAdapter;", "Lcom/ss/android/ugc/aweme/feed/adapter/MultiTypePagerAdapter;", "activity", "Landroid/support/v4/app/FragmentActivity;", "inflater", "Landroid/view/LayoutInflater;", "viewTypeCount", "", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "loftAnimationStyle", "", "(Landroid/support/v4/app/FragmentActivity;Landroid/view/LayoutInflater;ILcom/ss/android/ugc/aweme/feed/DialogController;Z)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "getDialogController", "()Lcom/ss/android/ugc/aweme/feed/DialogController;", "getInflater", "()Landroid/view/LayoutInflater;", "getLoftAnimationStyle", "()Z", "setLoftAnimationStyle", "(Z)V", "mItems", "", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideo;", "getMItems", "()Ljava/util/List;", "setMItems", "(Ljava/util/List;)V", "mLoftId", "", "getMLoftId", "()Ljava/lang/String;", "setMLoftId", "(Ljava/lang/String;)V", "mPlayerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "getCount", "getItemViewType", "position", "getItemViewTypeForConvertView", "view", "Landroid/view/View;", "getView", "convertView", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", "holder", "Lcom/ss/android/ugc/aweme/commercialize/loft/adapter/ILoftViewHolder;", "id", "onCreateViewHolder", "type", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftPagerAdapter extends MultiTypePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39126a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f39127b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public List<j> f39128c = new ArrayList();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final FragmentActivity f39129d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f39130e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final d f39131f;
    public boolean g;
    private final o h = new o(true);

    public final int a(int i) {
        return 0;
    }

    public final int a(@Nullable View view) {
        return 0;
    }

    public final int getCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f39126a, false, 31131, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39126a, false, 31131, new Class[0], Integer.TYPE)).intValue();
        }
        List<j> list = this.f39128c;
        if (list != null) {
            i = list.size();
        }
        return i;
    }

    @NotNull
    public final View a(int i, @Nullable View view, @Nullable ViewGroup viewGroup) {
        View view2;
        a aVar;
        int i2 = i;
        ViewGroup viewGroup2 = viewGroup;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f39126a, false, 31130, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f39126a, false, 31130, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        }
        if (view == null) {
            View inflate = this.n.inflate(C0906R.layout.wd, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "loftView");
            boolean z = this.g;
            if (PatchProxy.isSupport(new Object[]{inflate, 0, Byte.valueOf(z ? (byte) 1 : 0)}, this, f39126a, false, 31132, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[]{inflate, 0, Byte.valueOf(z)}, this, f39126a, false, 31132, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, a.class);
            } else {
                b bVar = new b(inflate, this.f39129d, this.h, this.f39131f, z);
                aVar = bVar;
            }
            inflate.setTag(aVar);
            view2 = inflate;
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                aVar = (a) tag;
                view2 = view;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.loft.adapter.ILoftViewHolder");
            }
        }
        a aVar2 = aVar;
        String str = this.f39127b;
        if (PatchProxy.isSupport(new Object[]{aVar2, Integer.valueOf(i), str}, this, f39126a, false, 31133, new Class[]{a.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Integer.valueOf(i), str}, this, f39126a, false, 31133, new Class[]{a.class, Integer.TYPE, String.class}, Void.TYPE);
        } else {
            List<j> list = this.f39128c;
            if (list != null) {
                j jVar = list.get(i2);
                if (!(jVar == null || jVar.getAweme() == null)) {
                    List<j> list2 = this.f39128c;
                    if (list2 != null) {
                        i3 = list2.size();
                    }
                    aVar2.a(str, jVar, i2, i3);
                }
            }
        }
        return view2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoftPagerAdapter(@NotNull FragmentActivity fragmentActivity, @NotNull LayoutInflater layoutInflater, int i, @NotNull d dVar, boolean z) {
        super(fragmentActivity, layoutInflater, 1);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        this.f39129d = fragmentActivity;
        this.f39130e = layoutInflater;
        this.f39131f = dVar;
        this.g = z;
    }
}
