package com.ss.android.ugc.aweme.discover.ui;

import a.g;
import a.i;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.api.SuggestApi;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.ss.android.ugc.aweme.discover.viewmodel.SuggestUserViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/UserIntermediateFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateFragment;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestUser;", "()V", "mSuggestUserViewModel", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SuggestUserViewModel;", "suggestUserObserver", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "", "getLabelName", "", "getPageIndex", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "openSearchSquare", "sendSuggestUserShowEvent", "list", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserIntermediateFragment extends SearchIntermediateFragment<SuggestUser> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43062a;
    private SuggestUserViewModel h;
    private final Observer<com.ss.android.ugc.aweme.discover.api.a.a<List<SuggestUser>>> i = new a(this);
    private HashMap j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestUser;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<com.ss.android.ugc.aweme.discover.api.a.a<List<? extends SuggestUser>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43063a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserIntermediateFragment f43064b;

        a(UserIntermediateFragment userIntermediateFragment) {
            this.f43064b = userIntermediateFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.discover.api.a.a aVar = (com.ss.android.ugc.aweme.discover.api.a.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f43063a, false, 38122, new Class[]{com.ss.android.ugc.aweme.discover.api.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f43063a, false, 38122, new Class[]{com.ss.android.ugc.aweme.discover.api.a.a.class}, Void.TYPE);
                return;
            }
            if (this.f43064b.isViewValid()) {
                List list = null;
                if (aVar != null && aVar.f42102a) {
                    list = (List) aVar.f42103b;
                }
                this.f43064b.h().c(list);
                UserIntermediateFragment userIntermediateFragment = this.f43064b;
                if (PatchProxy.isSupport(new Object[]{list}, userIntermediateFragment, UserIntermediateFragment.f43062a, false, 38119, new Class[]{List.class}, Void.TYPE)) {
                    UserIntermediateFragment userIntermediateFragment2 = userIntermediateFragment;
                    PatchProxy.accessDispatch(new Object[]{list}, userIntermediateFragment2, UserIntermediateFragment.f43062a, false, 38119, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                Collection collection = list;
                if (!CollectionUtils.isEmpty(collection)) {
                    StringBuilder sb = new StringBuilder();
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    int size = collection.size();
                    for (int i = 0; i < size; i++) {
                        User user = ((SuggestUser) list.get(i)).user;
                        if (user != null) {
                            sb.append(user.getUid());
                            if (i < list.size() - 1) {
                                sb.append(",");
                            }
                        }
                    }
                    r.a("search_for_you_show", (Map) d.a().a("search_type", userIntermediateFragment.b()).a("user_list", sb.toString()).f34114b);
                }
            }
        }
    }

    @Nullable
    public final String b() {
        return AllStoryActivity.f73306b;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f43062a, false, 38121, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43062a, false, 38121, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final int c() {
        return aw.f43136d;
    }

    public final void d() {
        i iVar;
        if (PatchProxy.isSupport(new Object[0], this, f43062a, false, 38118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43062a, false, 38118, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (b.d()) {
            SuggestUserViewModel suggestUserViewModel = this.h;
            if (suggestUserViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSuggestUserViewModel");
            }
            if (PatchProxy.isSupport(new Object[0], suggestUserViewModel, SuggestUserViewModel.f43265a, false, 38204, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], suggestUserViewModel, SuggestUserViewModel.f43265a, false, 38204, new Class[0], Void.TYPE);
                return;
            }
            SuggestApi suggestApi = SuggestApi.f42099c;
            if (PatchProxy.isSupport(new Object[0], suggestApi, SuggestApi.f42097a, false, 36075, new Class[0], i.class)) {
                iVar = (i) PatchProxy.accessDispatch(new Object[0], suggestApi, SuggestApi.f42097a, false, 36075, new Class[0], i.class);
            } else {
                iVar = ((SuggestApi.RealApi) SuggestApi.f42098b.create(SuggestApi.RealApi.class)).getSuggestUsers();
            }
            iVar.a((g<TResult, TContinuationResult>) new SuggestUserViewModel.a<TResult,TContinuationResult>(suggestUserViewModel), i.f1052b);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43062a, false, 38117, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43062a, false, 38117, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        ViewModel viewModel = ViewModelProviders.of((Fragment) this).get(SuggestUserViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(th…serViewModel::class.java)");
        this.h = (SuggestUserViewModel) viewModel;
        SuggestUserViewModel suggestUserViewModel = this.h;
        if (suggestUserViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSuggestUserViewModel");
        }
        suggestUserViewModel.f43266b.observe(this, this.i);
    }
}
