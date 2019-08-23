package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.common.x;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.api.a.a;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView;
import com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel;
import com.ss.android.ugc.aweme.utils.dz;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class BaseDiscoveryAndSearchFragment extends AmeBaseFragment implements Observer<a<TypeWords>>, SearchIntermediateView.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3046a;

    /* renamed from: b  reason: collision with root package name */
    protected SearchStateViewModel f3047b;

    /* renamed from: c  reason: collision with root package name */
    protected GuessWordsViewModel f3048c;

    /* renamed from: d  reason: collision with root package name */
    protected String f3049d;

    /* renamed from: e  reason: collision with root package name */
    protected Word f3050e;

    /* renamed from: f  reason: collision with root package name */
    private dz f3051f;
    private String g;
    @BindView(2131493216)
    ImageView mBackView;
    @BindView(2131494401)
    FrameLayout mBottomContainer;
    @BindView(2131493372)
    ImageButton mBtnClear;
    @BindView(2131494427)
    View mGapStatusBar;
    @BindView(2131496959)
    SearchIntermediateView mIntermediateView;
    @BindView(2131494165)
    EditText mSearchInputView;
    @BindView(2131498119)
    TextView mTvSearch;

    public void a(Bundle bundle) {
    }

    public abstract void a(View view);

    public abstract void b(SearchResultParam searchResultParam);

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public abstract void h();

    public boolean isRegisterEventBus() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract void l();

    public final String i() {
        if (!PatchProxy.isSupport(new Object[0], this, f3046a, false, 37368, new Class[0], String.class)) {
            return e.e().a("place_holder", o.b(C0906R.string.bne));
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37368, new Class[0], String.class);
    }

    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37375, new Class[0], Void.TYPE);
            return;
        }
        getActivity().getWindow().setSoftInputMode(50);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37384, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37383, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37377, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37377, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37379, new Class[0], Void.TYPE);
            return;
        }
        String obj = this.mSearchInputView.getText().toString();
        if (this.mIntermediateView.a()) {
            this.mIntermediateView.a(obj);
            return;
        }
        this.mIntermediateView.a(obj);
        this.mIntermediateView.setOpenSugFromState(n());
        c(3);
    }

    public final int n() {
        if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37385, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37385, new Class[0], Integer.TYPE)).intValue();
        }
        Integer num = (Integer) this.f3047b.searchState.getValue();
        if (num == null) {
            return f();
        }
        return num.intValue();
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37371, new Class[0], Void.TYPE);
            return;
        }
        this.mBackView.setOnClickListener(new a(this));
        this.mBtnClear.setOnClickListener(new b(this));
        this.mTvSearch.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42784a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f42784a, false, 37391, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f42784a, false, 37391, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                } else if (BaseDiscoveryAndSearchFragment.this.mSearchInputView != null) {
                    BaseDiscoveryAndSearchFragment.this.b(BaseDiscoveryAndSearchFragment.this.mSearchInputView.getText().toString());
                }
            }
        });
        this.f3051f.a(this.mSearchInputView);
        this.mSearchInputView.setHint(i());
        if (com.ss.android.g.a.a()) {
            this.mSearchInputView.setFilters(new InputFilter[]{new x()});
        }
        this.mSearchInputView.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42786a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f42786a, false, 37392, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f42786a, false, 37392, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                BaseDiscoveryAndSearchFragment.this.a((CharSequence) editable.toString());
            }
        });
        this.mSearchInputView.setOnTouchListener(new c(this));
        this.mSearchInputView.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42788a;

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f42788a, false, 37393, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f42788a, false, 37393, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                }
                if (i == 3) {
                    BaseDiscoveryAndSearchFragment.this.b(BaseDiscoveryAndSearchFragment.this.mSearchInputView.getText().toString());
                }
                return true;
            }
        });
    }

    public void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3046a, false, 37373, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3046a, false, 37373, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, null, false);
    }

    public final String a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3046a, false, 37369, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3046a, false, 37369, new Class[]{Integer.TYPE}, String.class);
        }
        if (com.ss.android.g.a.a()) {
            if (i2 == aw.f43135c) {
                return getResources().getString(C0906R.string.c2p);
            }
            if (i2 == aw.f43134b) {
                return getResources().getString(C0906R.string.c20);
            }
        }
        return i();
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3046a, false, 37381, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3046a, false, 37381, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mSearchInputView.setHint(a(i));
    }

    public void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3046a, false, 37386, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3046a, false, 37386, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3047b.searchState.setValue(Integer.valueOf(i));
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            this.mBottomContainer.setVisibility(4);
        } else {
            this.mBottomContainer.setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3046a, false, 37364, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3046a, false, 37364, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f3047b = (SearchStateViewModel) ViewModelProviders.of(getActivity()).get(SearchStateViewModel.class);
        this.f3051f = new dz();
        a(getArguments());
        this.f3048c = (GuessWordsViewModel) ViewModelProviders.of((Fragment) this).get(GuessWordsViewModel.class);
    }

    public void a(@NotNull SearchResultParam searchResultParam) {
        if (PatchProxy.isSupport(new Object[]{searchResultParam}, this, f3046a, false, 37382, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam}, this, f3046a, false, 37382, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        if (SearchStateViewModel.isSearchIntermediate(n()) && !TextUtils.isEmpty(searchResultParam.getKeyword())) {
            b(searchResultParam);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3046a, false, 37387, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3046a, false, 37387, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar.f42102a) {
            TypeWords typeWords = (TypeWords) aVar.f42103b;
            if (typeWords != null && !CollectionUtils.isEmpty(typeWords.words)) {
                Word word = typeWords.words.get(0);
                this.mSearchInputView.setHint(word.getWord());
                this.f3050e = word;
                r.a("trending_words_show", (Map) d.a().a("words_position", 0).a("words_source", "search_bar_outer").a("words_content", word.getWord()).a("group_id", word.getId()).f34114b);
            }
        }
    }

    public final void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f3046a, false, 37378, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f3046a, false, 37378, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(charSequence) && this.mBtnClear.getVisibility() == 8) {
            this.mBtnClear.setVisibility(0);
        } else if (TextUtils.isEmpty(charSequence) && this.mBtnClear.getVisibility() == 0) {
            this.mBtnClear.setVisibility(8);
        }
        if (!TextUtils.equals(this.g, charSequence)) {
            this.g = charSequence.toString();
            if (TextUtils.isEmpty(charSequence)) {
                if (n() != 1) {
                    l();
                }
            } else if (n() != 2) {
                m();
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3046a, false, 37380, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3046a, false, 37380, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SearchIntermediateView searchIntermediateView = this.mIntermediateView;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, searchIntermediateView, SearchIntermediateView.f43001a, false, 37976, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            SearchIntermediateView searchIntermediateView2 = searchIntermediateView;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, searchIntermediateView2, SearchIntermediateView.f43001a, false, 37976, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        searchIntermediateView.f43006f.a(z);
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f43002b;
        if (searchIntermediateViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intermediateViewModel");
        }
        searchIntermediateViewModel.hideIntermediate();
    }

    public final boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3046a, false, 37370, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f3046a, false, 37370, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        int a2 = aw.a();
        for (int i = 0; i < a2; i++) {
            if (TextUtils.equals(str2, a(i))) {
                return true;
            }
        }
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3046a, false, 37367, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3046a, false, 37367, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37366, new Class[0], Void.TYPE);
        } else {
            c(f());
            if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37376, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37376, new Class[0], Void.TYPE);
            } else {
                b.a(this.mGapStatusBar);
            }
            if (PatchProxy.isSupport(new Object[0], this, f3046a, false, 37372, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3046a, false, 37372, new Class[0], Void.TYPE);
            } else {
                SearchIntermediateView searchIntermediateView = this.mIntermediateView;
                if (PatchProxy.isSupport(new Object[]{this, this}, searchIntermediateView, SearchIntermediateView.f43001a, false, 37970, new Class[]{Fragment.class, SearchIntermediateView.b.class}, Void.TYPE)) {
                    ChangeQuickRedirect changeQuickRedirect = SearchIntermediateView.f43001a;
                    PatchProxy.accessDispatch(new Object[]{this, this}, searchIntermediateView, changeQuickRedirect, false, 37970, new Class[]{Fragment.class, SearchIntermediateView.b.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(this, "fragment");
                    Intrinsics.checkParameterIsNotNull(this, "responder");
                    FragmentActivity activity = getActivity();
                    if (activity == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(activity, "fragment.activity!!");
                    searchIntermediateView.f43003c = this;
                    searchIntermediateView.h = getActivity() instanceof SearchResultActivity;
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "fragment.childFragmentManager");
                    searchIntermediateView.f43004d = childFragmentManager;
                    ViewModel viewModel = ViewModelProviders.of(activity).get(SearchIntermediateViewModel.class);
                    Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ateViewModel::class.java)");
                    searchIntermediateView.f43002b = (SearchIntermediateViewModel) viewModel;
                    SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f43002b;
                    if (searchIntermediateViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("intermediateViewModel");
                    }
                    LifecycleOwner lifecycleOwner = this;
                    searchIntermediateViewModel.getIntermediateState().observe(lifecycleOwner, searchIntermediateView.i);
                    SearchIntermediateViewModel searchIntermediateViewModel2 = searchIntermediateView.f43002b;
                    if (searchIntermediateViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("intermediateViewModel");
                    }
                    searchIntermediateViewModel2.getSearchTabIndex().observe(lifecycleOwner, searchIntermediateView.j);
                }
            }
            j();
            g();
        }
        k();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3046a, false, 37365, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3046a, false, 37365, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(e(), viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    public final void a(String str, String str2, boolean z) {
        String str3;
        String str4 = str;
        String str5 = str2;
        int i = 0;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3046a, false, 37374, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, Byte.valueOf(z)}, this, f3046a, false, 37374, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (!z) {
                str3 = "normal_search";
            } else if (com.ss.android.ugc.aweme.discover.helper.b.k()) {
                str3 = "recom_search";
            } else {
                str3 = "default_search_keyword";
            }
            if (!com.ss.android.ugc.aweme.discover.helper.b.i() || (!this.mIntermediateView.b() && (!this.mIntermediateView.a() || this.mIntermediateView.getOpenSugFromState() == 2))) {
                z2 = false;
            }
            SearchResultParam realSearchWord = new SearchResultParam().setKeyword(str).setRealSearchWord(str5);
            if (z) {
                i = 5;
            }
            b(realSearchWord.setSearchFrom(i).setOpenNewSearchContainer(z2).setEnterFrom(str3));
            KeyboardUtils.c(this.mSearchInputView);
            this.f3051f.a("search");
        }
    }
}
