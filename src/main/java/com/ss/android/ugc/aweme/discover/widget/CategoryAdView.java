package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.model.CategoryListAdInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.shortvideo.ui.InfiniteLoopPagerAdapter;
import com.ss.android.ugc.aweme.shortvideo.ui.ViewPagerIndicatorLayout;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010&\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020'H\u0014R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u000e\u0010\u001f\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/CategoryAdView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/ss/android/ugc/aweme/discover/model/CategoryListAdInfo;", "ad", "getAd", "()Lcom/ss/android/ugc/aweme/discover/model/CategoryListAdInfo;", "setAd", "(Lcom/ss/android/ugc/aweme/discover/model/CategoryListAdInfo;)V", "adTag", "Landroid/widget/TextView;", "categoryOrAdStartPos", "getCategoryOrAdStartPos", "()I", "setCategoryOrAdStartPos", "(I)V", "indicator", "Lcom/ss/android/ugc/aweme/shortvideo/ui/ViewPagerIndicatorLayout;", "pos", "getPos", "setPos", "title", "viewPager", "Lcom/bytedance/ies/uikit/viewpager/SSViewPager;", "viewPagerAdapter", "Lcom/ss/android/ugc/aweme/discover/widget/CategoryAdView$AdImageListAdapter;", "viewPagerHelper", "Lcom/ss/android/ugc/aweme/discover/helper/ViewPagerSwitchHelper;", "fillUi", "", "onClick", "v", "Landroid/view/View;", "onFinishInflate", "AdImageListAdapter", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CategoryAdView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43270a;

    /* renamed from: b  reason: collision with root package name */
    private SSViewPager f43271b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f43272c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f43273d;

    /* renamed from: e  reason: collision with root package name */
    private ViewPagerIndicatorLayout f43274e;

    /* renamed from: f  reason: collision with root package name */
    private AdImageListAdapter f43275f;
    private i g;
    @Nullable
    private CategoryListAdInfo h;
    private int i;
    private int j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/CategoryAdView$AdImageListAdapter;", "Lcom/bytedance/ies/uikit/viewpager/AbsPagerAdapter;", "context", "Landroid/content/Context;", "layoutInflater", "Landroid/view/LayoutInflater;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Landroid/content/Context;Landroid/view/LayoutInflater;Landroid/view/View$OnClickListener;)V", "imageList", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getImageList", "()Ljava/util/List;", "setImageList", "(Ljava/util/List;)V", "getCount", "", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class AdImageListAdapter extends AbsPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43276a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public List<? extends UrlModel> f43277b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f43278c;

        /* renamed from: d  reason: collision with root package name */
        private final View.OnClickListener f43279d;

        public final int getCount() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f43276a, false, 38215, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43276a, false, 38215, new Class[0], Integer.TYPE)).intValue();
            }
            List<? extends UrlModel> list = this.f43277b;
            if (list != null) {
                i = list.size();
            }
            return i;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AdImageListAdapter(@NotNull Context context, @NotNull LayoutInflater layoutInflater, @NotNull View.OnClickListener onClickListener) {
            super(context, layoutInflater);
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(layoutInflater, "layoutInflater");
            Intrinsics.checkParameterIsNotNull(onClickListener, "onClickListener");
            this.f43278c = context;
            this.f43279d = onClickListener;
        }

        @NotNull
        public final View getView(int i, @Nullable View view, @Nullable ViewGroup viewGroup) {
            View view2;
            View view3 = view;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view3, viewGroup}, this, f43276a, false, 38216, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view3, viewGroup}, this, f43276a, false, 38216, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            }
            if (!(view3 instanceof RemoteImageView)) {
                view2 = null;
            } else {
                view2 = view3;
            }
            RemoteImageView remoteImageView = (RemoteImageView) view2;
            if (remoteImageView == null) {
                remoteImageView = new RemoteImageView(this.f43278c);
            }
            remoteImageView.setOnClickListener(this.f43279d);
            remoteImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) remoteImageView.getHierarchy();
            Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy, "iv.hierarchy");
            genericDraweeHierarchy.setRoundingParams(RoundingParams.fromCornersRadius(4.0f));
            List<? extends UrlModel> list = this.f43277b;
            if (list != null) {
                int i2 = i;
                UrlModel urlModel = (UrlModel) list.get(i);
                if (urlModel != null) {
                    c.b(remoteImageView, urlModel);
                }
            }
            return remoteImageView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "trackUrl", "", "kotlin.jvm.PlatformType", "status", "ts", "", "logMonitor"}, k = 3, mv = {1, 1, 15})
    static final class a implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CategoryListAdInfo f43281b;

        a(CategoryListAdInfo categoryListAdInfo) {
            this.f43281b = categoryListAdInfo;
        }

        public final void a(String str, String str2, long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f43280a, false, 38217, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f43280a, false, 38217, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
                return;
            }
            d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(this.f43281b).b();
        }
    }

    @Nullable
    public final CategoryListAdInfo getAd() {
        return this.h;
    }

    public final int getCategoryOrAdStartPos() {
        return this.j;
    }

    public final int getPos() {
        return this.i;
    }

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f43270a, false, 38210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43270a, false, 38210, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        View findViewById = findViewById(C0906R.id.duu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.viewpager)");
        this.f43271b = (SSViewPager) findViewById;
        View findViewById2 = findViewById(C0906R.id.d1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.ad_tag)");
        this.f43272c = (TextView) findViewById2;
        View findViewById3 = findViewById(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.title)");
        this.f43273d = (TextView) findViewById3;
        View findViewById4 = findViewById(C0906R.id.a6b);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.dot_indicator)");
        this.f43274e = (ViewPagerIndicatorLayout) findViewById4;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        LayoutInflater from = LayoutInflater.from(getContext());
        Intrinsics.checkExpressionValueIsNotNull(from, "LayoutInflater.from(context)");
        View.OnClickListener onClickListener = this;
        this.f43275f = new AdImageListAdapter(context, from, onClickListener);
        SSViewPager sSViewPager = this.f43271b;
        if (sSViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        this.g = new i(sSViewPager);
        i iVar = this.g;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerHelper");
        }
        iVar.a();
        ViewPagerIndicatorLayout viewPagerIndicatorLayout = this.f43274e;
        if (viewPagerIndicatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("indicator");
        }
        SSViewPager sSViewPager2 = this.f43271b;
        if (sSViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        viewPagerIndicatorLayout.setUpViewPager((ViewPager) sSViewPager2);
        setOnClickListener(onClickListener);
        SSViewPager sSViewPager3 = this.f43271b;
        if (sSViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        sSViewPager3.setOnClickListener(onClickListener);
    }

    public final void setCategoryOrAdStartPos(int i2) {
        this.j = i2;
    }

    public final void setPos(int i2) {
        this.i = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryAdView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void onClick(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43270a, false, 38211, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43270a, false, 38211, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CategoryListAdInfo categoryListAdInfo = this.h;
        if (categoryListAdInfo != null) {
            if (com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), categoryListAdInfo.getOpenUrl(), true)) {
                d.a().a("draw_ad").b("open_url_app").g(categoryListAdInfo.getLogExtra()).a(categoryListAdInfo.getCreativeId()).a(getContext());
            } else if (com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), categoryListAdInfo.getWebUrl(), categoryListAdInfo.getWebTitle())) {
                d.a().a("draw_ad").b("open_url_h5").g(categoryListAdInfo.getLogExtra()).a(categoryListAdInfo.getCreativeId()).a(getContext());
            }
            d.a().a("list_ad").b("click").a(categoryListAdInfo.getCreativeId()).g(categoryListAdInfo.getLogExtra()).a((Object) MapsKt.mapOf(TuplesKt.to("topic_order", Integer.valueOf((this.i + 1) - this.j)))).a(getContext());
            UrlModel clickTrackUrlList = categoryListAdInfo.getClickTrackUrlList();
            if (clickTrackUrlList != null) {
                List<String> urlList = clickTrackUrlList.getUrlList();
                if (urlList != null) {
                    g.a((g.a) new a(categoryListAdInfo), (Collection<String>) urlList, true);
                }
            }
        }
    }

    public final void setAd(@Nullable CategoryListAdInfo categoryListAdInfo) {
        String str;
        if (PatchProxy.isSupport(new Object[]{categoryListAdInfo}, this, f43270a, false, 38209, new Class[]{CategoryListAdInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{categoryListAdInfo}, this, f43270a, false, 38209, new Class[]{CategoryListAdInfo.class}, Void.TYPE);
            return;
        }
        this.h = categoryListAdInfo;
        if (categoryListAdInfo == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (PatchProxy.isSupport(new Object[]{categoryListAdInfo}, this, f43270a, false, 38212, new Class[]{CategoryListAdInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{categoryListAdInfo}, this, f43270a, false, 38212, new Class[]{CategoryListAdInfo.class}, Void.TYPE);
            return;
        }
        TextView textView = this.f43273d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(PushConstants.TITLE);
        }
        textView.setText(categoryListAdInfo.getTitle());
        AdImageListAdapter adImageListAdapter = this.f43275f;
        if (adImageListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
        }
        adImageListAdapter.f43277b = categoryListAdInfo.getImageList();
        AdImageListAdapter adImageListAdapter2 = this.f43275f;
        if (adImageListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
        }
        if (adImageListAdapter2.getCount() > 1) {
            SSViewPager sSViewPager = this.f43271b;
            if (sSViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            }
            AdImageListAdapter adImageListAdapter3 = this.f43275f;
            if (adImageListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            }
            sSViewPager.setAdapter(new InfiniteLoopPagerAdapter(adImageListAdapter3));
            ViewPagerIndicatorLayout viewPagerIndicatorLayout = this.f43274e;
            if (viewPagerIndicatorLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("indicator");
            }
            viewPagerIndicatorLayout.setVisibility(0);
        } else {
            SSViewPager sSViewPager2 = this.f43271b;
            if (sSViewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            }
            AdImageListAdapter adImageListAdapter4 = this.f43275f;
            if (adImageListAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            }
            sSViewPager2.setAdapter(adImageListAdapter4);
            ViewPagerIndicatorLayout viewPagerIndicatorLayout2 = this.f43274e;
            if (viewPagerIndicatorLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("indicator");
            }
            viewPagerIndicatorLayout2.setVisibility(8);
        }
        AdImageListAdapter adImageListAdapter5 = this.f43275f;
        if (adImageListAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
        }
        adImageListAdapter5.notifyDataSetChanged();
        i iVar = this.g;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerHelper");
        }
        AdImageListAdapter adImageListAdapter6 = this.f43275f;
        if (adImageListAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
        }
        iVar.f42344c = adImageListAdapter6.getCount();
        AwemeTextLabelModel label = categoryListAdInfo.getLabel();
        if (label != null) {
            str = label.getLabelName();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            TextView textView2 = this.f43272c;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adTag");
            }
            textView2.setText(C0906R.string.ck);
            return;
        }
        TextView textView3 = this.f43272c;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adTag");
        }
        AwemeTextLabelModel label2 = categoryListAdInfo.getLabel();
        Intrinsics.checkExpressionValueIsNotNull(label2, "ad.label");
        textView3.setText(label2.getLabelName());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryAdView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryAdView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }
}
