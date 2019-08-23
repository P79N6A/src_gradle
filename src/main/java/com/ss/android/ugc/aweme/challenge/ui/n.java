package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ShowItemsStruct;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.ChallengeViewPager;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020!J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!J\b\u0010'\u001a\u00020%H\u0002J\u0016\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!J\u0016\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-J\u0012\u0010/\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\b\u00102\u001a\u00020\u001eH\u0002J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/CommerceDelegate;", "", "viewRoot", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeDetailFragment;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeDetailFragment;)V", "mChallenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "mChallengeDetail", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "mContext", "Landroid/content/Context;", "mNavigator", "Lcom/ss/android/ugc/aweme/views/AwemeViewPagerNavigator;", "mNavigatorDiv", "mNewFaceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/NewFaceStickerBean;", "mPagerAdapter", "Lcom/ss/android/ugc/aweme/profile/ui/ProfileFragmentAdapter;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "getMPagerAdapter", "()Lcom/ss/android/ugc/aweme/profile/ui/ProfileFragmentAdapter;", "mScrollLayout", "Lcom/ss/android/ugc/aweme/common/widget/scrollablelayout/ScrollableLayout;", "mStartRecordIv", "Landroid/widget/ImageView;", "mViewPager", "Landroid/support/v4/view/ViewPager;", "bindData", "", "data", "showTabIndex", "", "getRnTab", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "handleClickAction", "", "id", "handleStartRecordClick", "onScroll", "translationY", "maxY", "onScrolled", "dx", "", "dy", "sendChangeInterTagEvent", "tagName", "", "updateCommerceLockSticker", "updateFragment", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35704a;

    /* renamed from: b  reason: collision with root package name */
    final ViewPager f35705b;

    /* renamed from: c  reason: collision with root package name */
    final Context f35706c;

    /* renamed from: d  reason: collision with root package name */
    ChallengeDetail f35707d;

    /* renamed from: e  reason: collision with root package name */
    public Challenge f35708e;

    /* renamed from: f  reason: collision with root package name */
    d f35709f;
    public final ChallengeDetailFragment g;
    private final AwemeViewPagerNavigator h;
    private final View i;
    private final ImageView j;
    private final ScrollableLayout k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/ss/android/ugc/aweme/challenge/ui/CommerceDelegate$updateCommerceLockSticker$1", "Lcom/google/gson/reflect/TypeToken;", "Lcom/ss/android/ugc/aweme/sticker/model/NewFaceStickerBean;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends TypeToken<d> {
        a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/challenge/ui/CommerceDelegate$updateFragment$6", "Lcom/ss/android/ugc/aweme/views/AwemeViewPagerNavigator$OnTabSelectedListener;", "onClick", "", "tab", "Landroid/view/View;", "position", "", "onSelect", "isSetupSelected", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements AwemeViewPagerNavigator.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f35711b;

        b(n nVar) {
            this.f35711b = nVar;
        }

        public final void a(@Nullable View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f35710a, false, 26185, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f35710a, false, 26185, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f35711b.g.c(i);
        }

        public final void a(@Nullable View view, int i, boolean z) {
            String type;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f35710a, false, 26184, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Byte.valueOf(z)}, this, f35710a, false, 26184, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (!z) {
                n nVar = this.f35711b;
                if (i == 0) {
                    type = "output";
                } else {
                    Challenge challenge = this.f35711b.f35708e;
                    if (challenge == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                    }
                    type = challenge.showItems.get(i - 1).getType();
                }
                String str = type;
                if (PatchProxy.isSupport(new Object[]{str}, nVar, n.f35704a, false, 26183, new Class[]{String.class}, Void.TYPE)) {
                    n nVar2 = nVar;
                    PatchProxy.accessDispatch(new Object[]{str}, nVar2, n.f35704a, false, 26183, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                Challenge challenge2 = nVar.f35708e;
                if (challenge2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                }
                r.a("change_inter_tag", (Map) a2.a("tag_id", challenge2.getCid()).a("tag_name", str).f34114b);
            }
        }
    }

    public final ProfileFragmentAdapter<AmeBaseFragment> a() {
        if (PatchProxy.isSupport(new Object[0], this, f35704a, false, 26174, new Class[0], ProfileFragmentAdapter.class)) {
            return (ProfileFragmentAdapter) PatchProxy.accessDispatch(new Object[0], this, f35704a, false, 26174, new Class[0], ProfileFragmentAdapter.class);
        }
        PagerAdapter adapter = this.f35705b.getAdapter();
        if (adapter != null) {
            return (ProfileFragmentAdapter) adapter;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter<com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment>");
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35704a, false, 26177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35704a, false, 26177, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            try {
                Gson gson = new Gson();
                Challenge challenge = this.f35708e;
                if (challenge == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                }
                this.f35709f = (d) gson.fromJson(challenge.getChallengeStickerDetail(), new a().getType());
            } catch (Exception unused) {
            }
            if (this.f35709f != null) {
                Object service = ServiceManager.get().getService(IAVService.class);
                Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
                IStickerUtilsService stickerUtilsService = ((IAVService) service).getStickerUtilsService();
                d dVar = this.f35709f;
                if (dVar == null) {
                    Intrinsics.throwNpe();
                }
                if (stickerUtilsService.isLockCommerceFaceSticker(dVar)) {
                    this.j.setImageResource(2130840580);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f35704a, false, 26178, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f35704a, false, 26178, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Challenge challenge = this.f35708e;
        if (challenge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
        }
        if (challenge.commerceSubType != 0) {
            Challenge challenge2 = this.f35708e;
            if (challenge2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
            }
            if (!CollectionUtils.isEmpty(challenge2.showItems)) {
                ViewPager viewPager = this.f35705b;
                if (viewPager != null) {
                    ((ChallengeViewPager) viewPager).setPagingEnable(true);
                    ((ChallengeViewPager) this.f35705b).setOffscreenPageLimit(2);
                    this.h.setVisibility(0);
                    if (com.ss.android.g.a.b()) {
                        this.i.setVisibility(0);
                    }
                    Ref.IntRef intRef = new Ref.IntRef();
                    intRef.element = ((ChallengeViewPager) this.f35705b).getCurrentItem();
                    AmeBaseFragment ameBaseFragment = (AmeBaseFragment) a().f62230d.get(0);
                    Intrinsics.checkExpressionValueIsNotNull(ameBaseFragment, "fragment");
                    ameBaseFragment.isCommerce = true;
                    List<AbstractBaseDetailFragment.a> m = this.g.m();
                    m.clear();
                    m.add(this.g.m().get(0));
                    List<T> list = a().f62230d;
                    list.clear();
                    list.add(ameBaseFragment);
                    List<Integer> list2 = a().f62231e;
                    list2.clear();
                    list2.add(a().f62231e.get(0));
                    Challenge challenge3 = this.f35708e;
                    if (challenge3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                    }
                    List<ShowItemsStruct> list3 = challenge3.showItems;
                    Intrinsics.checkExpressionValueIsNotNull(list3, "mChallenge.showItems");
                    for (ShowItemsStruct showItemsStruct : list3) {
                        CommerceChallengeFragment commerceChallengeFragment = new CommerceChallengeFragment();
                        commerceChallengeFragment.f2868b = showItemsStruct.getDesc();
                        commerceChallengeFragment.f2869c = showItemsStruct.getSchema();
                        Challenge challenge4 = this.f35708e;
                        if (challenge4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                        }
                        commerceChallengeFragment.a(challenge4.getCid());
                        this.g.m().add(commerceChallengeFragment);
                        a().f62230d.add(commerceChallengeFragment);
                        a().f62231e.add(Integer.valueOf(commerceChallengeFragment.hashCode()));
                    }
                    for (AbstractBaseDetailFragment.a a2 : this.g.m()) {
                        a2.a(true);
                    }
                    a().notifyDataSetChanged();
                    int size = a().f62230d.size();
                    if (i2 >= 0 && size > i2) {
                        intRef.element = i2;
                    }
                    this.h.a(this.f35705b, new com.ss.android.ugc.aweme.views.d(), new b(this), intRef.element);
                    ((ChallengeViewPager) this.f35705b).setCurrentItem(intRef.element);
                    this.f35705b.addOnPageChangeListener(new CommerceDelegate$updateFragment$7(this, intRef));
                    this.g.onPageSelected(intRef.element);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.views.ChallengeViewPager");
            }
        }
        this.h.setVisibility(8);
    }

    public n(@NotNull View view, @NotNull ChallengeDetailFragment challengeDetailFragment) {
        Intrinsics.checkParameterIsNotNull(view, "viewRoot");
        Intrinsics.checkParameterIsNotNull(challengeDetailFragment, "parent");
        this.g = challengeDetailFragment;
        View findViewById = view.findViewById(C0906R.id.duu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "viewRoot.findViewById(R.id.viewpager)");
        this.f35705b = (ViewPager) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.bq0);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "viewRoot.findViewById(R.id.navigator)");
        this.h = (AwemeViewPagerNavigator) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.bq1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "viewRoot.findViewById(R.id.navigator_div)");
        this.i = findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.cur);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "viewRoot.findViewById(R.id.start_record_img)");
        this.j = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.ck9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "viewRoot.findViewById(R.id.scroll_layout)");
        this.k = (ScrollableLayout) findViewById5;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "viewRoot.context");
        this.f35706c = context;
    }
}
