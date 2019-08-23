package com.ss.android.ugc.aweme.profile.presenter;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w.a.b;
import java.util.List;

public final class y extends b<RecommendCommonUserModel, o> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61665a;

    public final void a(int i, String str, int i2, int i3, String str2, int i4, String str3) {
        if (PatchProxy.isSupport(new Object[]{30, str, Integer.valueOf(i2), Integer.valueOf(i3), null, Integer.valueOf(i4), str3}, this, f61665a, false, 67608, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{30, str, Integer.valueOf(i2), Integer.valueOf(i3), null, Integer.valueOf(i4), str3}, this, f61665a, false, 67608, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(30, str, i2, 0, i3, null, i4, str3, null);
    }

    public final void a(int i, String str, int i2, int i3, String str2, int i4) {
        if (PatchProxy.isSupport(new Object[]{30, str, 2, Integer.valueOf(i3), str2, Integer.valueOf(i4)}, this, f61665a, false, 67609, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {30, str, 2, Integer.valueOf(i3), str2, Integer.valueOf(i4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f61665a, false, 67609, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(30, str, 2, 0, i3, str2, i4);
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f61665a, false, 67613, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f61665a, false, 67613, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        ((o) this.f76547e).onRecommendFailed(exc2);
    }

    public final void a(List<User> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f61665a, false, 67616, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f61665a, false, 67616, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.f76546d != null) {
            ((RecommendCommonUserModel) this.f76546d).setData(list);
        }
    }

    public final void a(int i, String str, int i2, int i3, int i4, String str2) {
        if (PatchProxy.isSupport(new Object[]{30, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, this, f61665a, false, 67619, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {30, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f61665a, false, 67619, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(30, str, i2, 0, i3, i4, str2);
    }

    public final RecommendList d() {
        return (RecommendList) ((RecommendCommonUserModel) this.f76546d).mData;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f61665a, false, 67615, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61665a, false, 67615, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76546d != null) {
            ((RecommendCommonUserModel) this.f76546d).removeFollowedUser();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61665a, false, 67612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61665a, false, 67612, new Class[0], Void.TYPE);
            return;
        }
        k.a().c();
        if (((RecommendCommonUserModel) this.f76546d).mQueryType == 1) {
            ((o) this.f76547e).onRefreshRecommendSuccess((RecommendList) ((RecommendCommonUserModel) this.f76546d).mData);
            return;
        }
        if (((RecommendCommonUserModel) this.f76546d).mQueryType == 4) {
            ((o) this.f76547e).onLoadMoreRecommendSuccess((RecommendList) ((RecommendCommonUserModel) this.f76546d).mData);
        }
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61665a, false, 67614, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f61665a, false, 67614, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (this.f76546d != null) {
            ((RecommendCommonUserModel) this.f76546d).removeData(user);
        }
    }

    public final int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61665a, false, 67617, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f61665a, false, 67617, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.f76546d != null) {
            return ((RecommendCommonUserModel) this.f76546d).getUserImprOrder(str);
        } else {
            return 0;
        }
    }

    public y(RecommendCommonUserModel recommendCommonUserModel, o oVar) {
        super(recommendCommonUserModel, oVar);
        ((RecommendCommonUserModel) this.f76546d).addNotifyListener(this);
    }

    public final void a(int i, String str, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{30, str, 2, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f61665a, false, 67618, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{30, str, 2, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f61665a, false, 67618, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{30, str, 2, 0, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f61665a, false, 67620, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{30, str, 2, 0, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f61665a, false, 67620, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(30, str, 2, 0, i3, i4, (String) null);
    }

    private void a(int i, String str, int i2, int i3, int i4, int i5, String str2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2}, this, f61665a, false, 67621, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2}, this, f61665a, false, 67621, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        ((RecommendCommonUserModel) this.f76546d).loadMore(i, str, i2, i3, i4, i5, str2, null);
    }

    private void a(int i, String str, int i2, int i3, int i4, String str2, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), 0, Integer.valueOf(i4), str2, Integer.valueOf(i5)}, this, f61665a, false, 67610, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), 0, Integer.valueOf(i4), str2, Integer.valueOf(i5)}, this, f61665a, false, 67610, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i, str, i2, 0, i4, str2, i5, null, null);
    }

    @SuppressLint({"TooManyMethodParam"})
    private void a(int i, String str, int i2, int i3, int i4, String str2, int i5, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5), str3, null}, this, f61665a, false, 67611, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5), str3, null}, this, f61665a, false, 67611, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        ((RecommendCommonUserModel) this.f76546d).refreshRecommendUser(i, str, i2, i3, i4, str2, i5, str3, null);
    }
}
