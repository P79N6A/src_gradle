package com.ss.android.ugc.aweme.discover.presenter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.discover.adapter.SearchChallengeAdapter;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.ui.SearchOriginalFragment;
import com.ss.android.ugc.aweme.discover.ui.aw;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchChallengeFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchOriginalFragment;", "Lcom/ss/android/ugc/aweme/discover/model/SearchChallenge;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "()V", "labelName", "", "getLabelName", "()Ljava/lang/String;", "initAdapter", "", "initPresenter", "setKeyword", "keyword", "shouldShowSearchAdH5", "", "inI18n", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchChallengeFragment extends SearchOriginalFragment<SearchChallenge> implements c<SearchChallenge> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42674a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f42675b;

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42674a, false, 37213, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42674a, false, 37213, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f42675b == null) {
            this.f42675b = new HashMap();
        }
        View view = (View) this.f42675b.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.f42675b.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public final boolean a(boolean z) {
        return z;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f42674a, false, 37214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42674a, false, 37214, new Class[0], Void.TYPE);
            return;
        }
        if (this.f42675b != null) {
            this.f42675b.clear();
        }
    }

    @NotNull
    public final String i() {
        return "tag";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public SearchChallengeFragment() {
        this.j = aw.g;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f42674a, false, 37211, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42674a, false, 37211, new Class[0], Void.TYPE);
            return;
        }
        a((BaseAdapter<D>) new SearchChallengeAdapter<D>(new s(false), this.h));
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f42674a, false, 37210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42674a, false, 37210, new Class[0], Void.TYPE);
            return;
        }
        a((k<?>) new m<Object>());
        k<?> E = E();
        if (E != null) {
            ((m) E).a(new l());
            E().a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchChallengePresenter");
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42674a, false, 37212, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42674a, false, 37212, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        if (v() != null) {
            BaseAdapter v = v();
            if (v != null) {
                ((SearchChallengeAdapter) v).h = str2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchChallengeAdapter");
            }
        }
    }
}
