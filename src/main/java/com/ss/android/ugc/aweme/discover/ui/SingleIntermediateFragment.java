package com.ss.android.ugc.aweme.discover.ui;

import a.g;
import a.i;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.ss.android.ugc.aweme.discover.api.HotSearchApi;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001'B\u0005¢\u0006\u0002\u0010\u0005J\n\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J \u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b0\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SingleIntermediateFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateFragment;", "", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IHotSearchHandler;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IGuessWordHandler;", "()V", "guessWordObserver", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/TypeWords;", "hotSearchObserver", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "hotSearchWordBundleObserver", "Lcom/ss/android/ugc/aweme/arch/BundleData;", "", "mFirstLoad", "", "mGuessWordsViewModel", "Lcom/ss/android/ugc/aweme/discover/viewmodel/GuessWordsViewModel;", "mHotSearchViewModel", "Lcom/ss/android/ugc/aweme/discover/viewmodel/HotSearchViewModel;", "mSearchStateViewModel", "Lcom/ss/android/ugc/aweme/discover/model/SearchStateViewModel;", "getLabelName", "getPageIndex", "", "handleGuessWordItemClick", "", "word", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "position", "handleHotSearchItemClick", "item", "enterFrom", "initAdapter", "initPresenter", "openSearchSquare", "refreshHotSearchOrGuessWord", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SingleIntermediateFragment extends SearchIntermediateFragment<Object> implements ak.a, ak.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43045a;
    public static final a i = new a((byte) 0);
    public SearchStateViewModel h;
    private HotSearchViewModel j;
    private GuessWordsViewModel k;
    private boolean l = true;
    private final Observer<com.ss.android.ugc.aweme.discover.api.a.a<List<HotSearchItem>>> m = new c(this);
    private final Observer<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>> n = new b(this);
    private final Observer<com.ss.android.ugc.aweme.arch.b<String, Object>> o = new d(this);
    private HashMap p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SingleIntermediateFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/discover/ui/SingleIntermediateFragment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/TypeWords;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SingleIntermediateFragment f43047b;

        b(SingleIntermediateFragment singleIntermediateFragment) {
            this.f43047b = singleIntermediateFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.discover.api.a.a aVar = (com.ss.android.ugc.aweme.discover.api.a.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f43046a, false, 38097, new Class[]{com.ss.android.ugc.aweme.discover.api.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f43046a, false, 38097, new Class[]{com.ss.android.ugc.aweme.discover.api.a.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                if (aVar.f42102a) {
                    TypeWords typeWords = (TypeWords) aVar.f42103b;
                    if (typeWords == null) {
                        Intrinsics.throwNpe();
                    }
                    List<Word> list = typeWords.words;
                    if (list != null && list.size() < 3) {
                        list = null;
                    }
                    this.f43047b.h().b(list);
                    return;
                }
                this.f43047b.h().b(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<com.ss.android.ugc.aweme.discover.api.a.a<List<? extends HotSearchItem>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SingleIntermediateFragment f43049b;

        c(SingleIntermediateFragment singleIntermediateFragment) {
            this.f43049b = singleIntermediateFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.discover.api.a.a aVar = (com.ss.android.ugc.aweme.discover.api.a.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f43048a, false, 38098, new Class[]{com.ss.android.ugc.aweme.discover.api.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f43048a, false, 38098, new Class[]{com.ss.android.ugc.aweme.discover.api.a.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                if (aVar.f42102a) {
                    this.f43049b.h().a((List) aVar.f42103b);
                } else if (this.f43049b.isViewValid()) {
                    Context context = this.f43049b.getContext();
                    Context context2 = this.f43049b.getContext();
                    if (context2 == null) {
                        Intrinsics.throwNpe();
                    }
                    com.bytedance.ies.dmt.ui.d.a.b(context, context2.getString(C0906R.string.b85)).a();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/arch/BundleData;", "", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<com.ss.android.ugc.aweme.arch.b<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SingleIntermediateFragment f43051b;

        d(SingleIntermediateFragment singleIntermediateFragment) {
            this.f43051b = singleIntermediateFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.arch.b bVar = (com.ss.android.ugc.aweme.arch.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f43050a, false, 38099, new Class[]{com.ss.android.ugc.aweme.arch.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f43050a, false, 38099, new Class[]{com.ss.android.ugc.aweme.arch.b.class}, Void.TYPE);
                return;
            }
            SearchStateViewModel searchStateViewModel = this.f43051b.h;
            if (searchStateViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStateViewModel");
            }
            MutableLiveData<com.ss.android.ugc.aweme.arch.b<String, Object>> mutableLiveData = searchStateViewModel.hotSearchLiveData;
            Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "mSearchStateViewModel.hotSearchLiveData");
            mutableLiveData.setValue(bVar);
        }
    }

    @Nullable
    public final String b() {
        return null;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f43045a, false, 38094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43045a, false, 38094, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.p.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final int c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f43045a, false, 38086, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43045a, false, 38086, new Class[0], Integer.TYPE)).intValue();
        }
        Integer num = (Integer) i().getSearchTabIndex().getValue();
        if (num != null) {
            i2 = num.intValue();
        }
        return i2;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f43045a, false, 38087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43045a, false, 38087, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel = ViewModelProviders.of(activity).get(SearchStateViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.h = (SearchStateViewModel) viewModel;
        ViewModel viewModel2 = ViewModelProviders.of((Fragment) this).get(HotSearchViewModel.class);
        HotSearchViewModel hotSearchViewModel = (HotSearchViewModel) viewModel2;
        LifecycleOwner lifecycleOwner = this;
        hotSearchViewModel.f43234b.observe(lifecycleOwner, this.m);
        hotSearchViewModel.f43235c.observe(lifecycleOwner, this.o);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(th…archWordBundleObserver) }");
        this.j = hotSearchViewModel;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel3 = ViewModelProviders.of(parentFragment).get(GuessWordsViewModel.class);
        GuessWordsViewModel guessWordsViewModel = (GuessWordsViewModel) viewModel3;
        guessWordsViewModel.f43225b.observe(lifecycleOwner, this.n);
        Intrinsics.checkExpressionValueIsNotNull(viewModel3, "ViewModelProviders.of(pa…his, guessWordObserver) }");
        this.k = guessWordsViewModel;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f43045a, false, 38089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43045a, false, 38089, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (PatchProxy.isSupport(new Object[0], this, f43045a, false, 38090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43045a, false, 38090, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            SearchSquareAdapter h2 = h();
            if (this.l) {
                if (com.ss.android.ugc.aweme.discover.helper.b.k()) {
                    h2.b(GuessWordsViewHolder.j);
                } else {
                    h2.a(HotSearchWordViewHolder.i);
                }
            }
            this.l = false;
            h2.g.f42247d = true;
            if (com.ss.android.ugc.aweme.discover.helper.b.k()) {
                GuessWordsViewModel guessWordsViewModel = this.k;
                if (guessWordsViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGuessWordsViewModel");
                }
                if (PatchProxy.isSupport(new Object[0], guessWordsViewModel, GuessWordsViewModel.f43223a, false, 38165, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], guessWordsViewModel, GuessWordsViewModel.f43223a, false, 38165, new Class[0], Void.TYPE);
                } else {
                    ((SuggestWordsApi) com.ss.android.ugc.aweme.discover.api.a.b.f42106b.create(SuggestWordsApi.class)).getSuggestWords("10005").a((g<TResult, TContinuationResult>) new GuessWordsViewModel.b<TResult,TContinuationResult>(guessWordsViewModel), i.f1052b);
                }
            } else {
                HotSearchViewModel hotSearchViewModel = this.j;
                if (hotSearchViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHotSearchViewModel");
                }
                if (PatchProxy.isSupport(new Object[0], hotSearchViewModel, HotSearchViewModel.f43232a, false, 38170, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hotSearchViewModel, HotSearchViewModel.f43232a, false, 38170, new Class[0], Void.TYPE);
                    return;
                }
                Single.fromObservable(HotSearchApi.a.a().getHotSearchList(0, 0, "")).subscribeOn(Schedulers.io()).map(HotSearchViewModel.e.f43242b).observeOn(AndroidSchedulers.mainThread()).map(new HotSearchViewModel.f(hotSearchViewModel)).subscribe((SingleObserver<? super T>) new HotSearchViewModel.g<Object>(hotSearchViewModel));
                if (PatchProxy.isSupport(new Object[0], hotSearchViewModel, HotSearchViewModel.f43232a, false, 38171, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hotSearchViewModel, HotSearchViewModel.f43232a, false, 38171, new Class[0], Void.TYPE);
                    return;
                }
                Single.fromObservable(HotSearchApi.a.a().getHotSearchList(1, 0, "").map(HotSearchViewModel.c.f43239b).subscribeOn(Schedulers.io())).observeOn(AndroidSchedulers.mainThread()).subscribe((SingleObserver<? super T>) new HotSearchViewModel.d<Object>());
            }
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f43045a, false, 38088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43045a, false, 38088, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        SearchSquareAdapter h2 = h();
        ak.b bVar = this;
        if (PatchProxy.isSupport(new Object[]{bVar}, h2, SearchSquareAdapter.f41869a, false, 35873, new Class[]{ak.b.class}, Void.TYPE)) {
            SearchSquareAdapter searchSquareAdapter = h2;
            PatchProxy.accessDispatch(new Object[]{bVar}, searchSquareAdapter, SearchSquareAdapter.f41869a, false, 35873, new Class[]{ak.b.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(bVar, "handler");
            com.ss.android.ugc.aweme.discover.delegate.a.b bVar2 = h2.g;
            if (PatchProxy.isSupport(new Object[]{bVar}, bVar2, com.ss.android.ugc.aweme.discover.delegate.a.b.f42243a, false, 36227, new Class[]{ak.b.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.discover.delegate.a.b bVar3 = bVar2;
                PatchProxy.accessDispatch(new Object[]{bVar}, bVar3, com.ss.android.ugc.aweme.discover.delegate.a.b.f42243a, false, 36227, new Class[]{ak.b.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(bVar, "handler");
                bVar2.f42246c = bVar;
            }
            com.ss.android.ugc.aweme.discover.delegate.a.a aVar = h2.f41872d;
            if (PatchProxy.isSupport(new Object[]{bVar}, aVar, com.ss.android.ugc.aweme.discover.delegate.a.a.f42240a, false, 36223, new Class[]{ak.b.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.discover.delegate.a.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{bVar}, aVar2, com.ss.android.ugc.aweme.discover.delegate.a.a.f42240a, false, 36223, new Class[]{ak.b.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(bVar, "handler");
                aVar.f42241b = bVar;
            }
        }
        SearchSquareAdapter h3 = h();
        ak.a aVar3 = this;
        if (PatchProxy.isSupport(new Object[]{aVar3}, h3, SearchSquareAdapter.f41869a, false, 35874, new Class[]{ak.a.class}, Void.TYPE)) {
            SearchSquareAdapter searchSquareAdapter2 = h3;
            PatchProxy.accessDispatch(new Object[]{aVar3}, searchSquareAdapter2, SearchSquareAdapter.f41869a, false, 35874, new Class[]{ak.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar3, "handler");
        com.ss.android.ugc.aweme.discover.delegate.a.b bVar4 = h3.g;
        if (PatchProxy.isSupport(new Object[]{aVar3}, bVar4, com.ss.android.ugc.aweme.discover.delegate.a.b.f42243a, false, 36228, new Class[]{ak.a.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.discover.delegate.a.b bVar5 = bVar4;
            PatchProxy.accessDispatch(new Object[]{aVar3}, bVar5, com.ss.android.ugc.aweme.discover.delegate.a.b.f42243a, false, 36228, new Class[]{ak.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar3, "handler");
        bVar4.f42245b = aVar3;
    }

    public final void a(@NotNull Word word, int i2) {
        Word word2 = word;
        if (PatchProxy.isSupport(new Object[]{word2, Integer.valueOf(i2)}, this, f43045a, false, 38091, new Class[]{Word.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{word2, Integer.valueOf(i2)}, this, f43045a, false, 38091, new Class[]{Word.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(word2, "word");
        SearchResultParam keyword = new SearchResultParam().setSearchFrom(16).setEnterFrom("recom_search").setKeyword(word.getWord());
        Intrinsics.checkExpressionValueIsNotNull(keyword, "param");
        a(keyword);
    }

    public final void a(@NotNull HotSearchItem hotSearchItem, int i2, @NotNull String str) {
        HotSearchItem hotSearchItem2 = hotSearchItem;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem2, Integer.valueOf(i2), str2}, this, f43045a, false, 38092, new Class[]{HotSearchItem.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem2, Integer.valueOf(i2), str2}, this, f43045a, false, 38092, new Class[]{HotSearchItem.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hotSearchItem2, "item");
        Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
        SearchResultParam openNewSearchContainer = new SearchResultParam().setKeyword(hotSearchItem.getWord()).setRealSearchWord(hotSearchItem.getRealSearchWord()).setAd(hotSearchItem.isAd()).setSearchFrom(2).setEnterFrom(str2).setSource("hot_search_section").setOpenNewSearchContainer(!com.ss.android.g.a.a());
        if (com.ss.android.ugc.aweme.discover.helper.b.e()) {
            HotSpotDetailActivity.a aVar = HotSpotDetailActivity.i;
            Context context = getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(openNewSearchContainer, "param");
            aVar.a(context, openNewSearchContainer);
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(openNewSearchContainer, "param");
        a(openNewSearchContainer);
    }
}
