package com.ss.android.ugc.aweme.profile.ui;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.bytedance.lighten.core.m;
import com.bytedance.lighten.loader.g;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.commercialize.model.b;
import com.ss.android.ugc.aweme.main.page.PageManager;
import com.ss.android.ugc.aweme.poi.widget.c;
import com.ss.android.ugc.aweme.profile.a;
import com.ss.android.ugc.aweme.profile.d.aa;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ex;
import org.greenrobot.eventbus.Subscribe;

public abstract class BaseDTProfileFragment extends BaseProfileFragment {
    public static ChangeQuickRedirect k;

    /* renamed from: a  reason: collision with root package name */
    private int f3790a;

    /* renamed from: b  reason: collision with root package name */
    private float f3791b;
    protected ViewPager l;
    protected n m;
    @Nullable
    @BindView(2131493214)
    public View mBackBtnBg;
    @Nullable
    @BindView(2131493834)
    public View mCoverMask;
    @Nullable
    @BindView(2131494230)
    public RemoteImageView mFastChatBtn;
    @Nullable
    @BindView(2131494231)
    public DmtTextView mFastFollowBtn;
    @BindView(2131495792)
    public View mMoreBtnBg;
    @BindView(2131497608)
    public View mTitleColorCtrl;
    @BindView(2131494997)
    public RemoteImageView mUserCover;
    protected c n;
    protected aa o;
    @Nullable
    protected aa p;
    float q;
    public int r;
    protected boolean s;

    public final void a() {
    }

    public abstract void a(float f2);

    public void a(UrlModel urlModel) {
    }

    public final void b(String str) {
    }

    public final void c(User user) {
    }

    public final void e(boolean z) {
    }

    public void f(User user) {
    }

    public void m() {
    }

    public final boolean o() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67842, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, k, false, 67842, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.J != null && this.J.getVerificationType() == 2) {
            z = true;
        }
        return z;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 67853, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.n != null) {
            this.n.d();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 67841, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.m != null) {
            this.m.dismiss();
        }
    }

    public final int p() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67845, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 67845, new Class[0], Integer.TYPE)).intValue();
        } else if (this.w == null) {
            return -1;
        } else {
            return this.w.indexOf(0);
        }
    }

    public final int q() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67847, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 67847, new Class[0], Integer.TYPE)).intValue();
        } else if (this.w == null) {
            return -1;
        } else {
            return this.w.indexOf(1);
        }
    }

    public final int r() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67848, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 67848, new Class[0], Integer.TYPE)).intValue();
        } else if (this.w == null) {
            return -1;
        } else {
            return this.w.indexOf(3);
        }
    }

    public final int t() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67851, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 67851, new Class[0], Integer.TYPE)).intValue();
        } else if (this.w == null) {
            return -1;
        } else {
            return this.w.indexOf(6);
        }
    }

    public final int u() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67852, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 67852, new Class[0], Integer.TYPE)).intValue();
        } else if (this.w == null) {
            return -1;
        } else {
            return this.w.indexOf(7);
        }
    }

    public static int Y_() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, k, true, 67839, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, k, true, 67839, new Class[0], Integer.TYPE)).intValue();
        }
        if (UIUtils.getScreenWidth(GlobalContext.getContext()) * 2 <= UIUtils.getScreenHeight(GlobalContext.getContext())) {
            i = a.d(GlobalContext.getContext());
        }
        return (UIUtils.getScreenWidth(GlobalContext.getContext()) / 3) + (i / 2);
    }

    private int g() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67838, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 67838, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f3790a == 0) {
            this.f3790a = (UIUtils.getScreenWidth(GlobalContext.getContext()) * 9) / 16;
        }
        return this.f3790a;
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 67829, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.mTitle.setAlpha(0.0f);
        if (this.mFastChatBtn != null) {
            this.mFastChatBtn.setAlpha(0.0f);
            this.mFastChatBtn.setEnabled(false);
        }
        if (this.mFastFollowBtn != null) {
            this.mFastFollowBtn.setAlpha(0.0f);
            this.mFastFollowBtn.setEnabled(false);
        }
        g(0);
        a();
        e(false);
    }

    public final int s() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67849, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 67849, new Class[0], Integer.TYPE)).intValue();
        }
        if (!AbTestManager.a().aV() || !ex.g(this.J)) {
            i = 5;
        } else {
            i = 8;
        }
        if (this.w == null) {
            return -1;
        }
        return this.w.indexOf(Integer.valueOf(i));
    }

    public void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, k, false, 67826, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, k, false, 67826, new Class[]{User.class}, Void.TYPE);
            return;
        }
        super.a(user);
        m();
    }

    private void j(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, k, false, 67837, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, k, false, 67837, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mUserCover.getLayoutParams();
        layoutParams.height = i;
        this.mUserCover.setLayoutParams(layoutParams);
    }

    public final boolean a_(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, k, false, 67831, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, k, false, 67831, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || !b.a(user) || (user.isLive() && com.ss.android.ugc.aweme.story.a.a() && !user.isBlock())) {
            return false;
        } else {
            return true;
        }
    }

    public final void h(@NonNull User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, k, false, 67827, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, k, false, 67827, new Class[]{User.class}, Void.TYPE);
            return;
        }
        int indexOf = this.w.indexOf(Integer.valueOf(n(ex.a(user))));
        if (indexOf < 0) {
            indexOf = 0;
        }
        int min = Math.min(this.l.getAdapter().getCount() - 1, indexOf);
        if (this.l.getCurrentItem() != min) {
            this.l.setCurrentItem(min, false);
        }
        onPageSelected(min);
    }

    @Subscribe
    public void onDismissLike2DynamicGuideEvent(com.ss.android.ugc.aweme.profile.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, k, false, 67832, new Class[]{com.ss.android.ugc.aweme.profile.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, k, false, 67832, new Class[]{com.ss.android.ugc.aweme.profile.a.a.class}, Void.TYPE);
            return;
        }
        if (this.n != null && this.n.isShowing()) {
            this.n.dismiss();
        }
    }

    public void a(View view) {
        int i;
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, k, false, 67825, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, k, false, 67825, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.o = new aa();
        if (Build.VERSION.SDK_INT >= 19) {
            i = StatusBarUtils.getStatusBarHeight(getActivity());
            this.mStatusView.getLayoutParams().height = i;
            this.mStatusView.setAlpha(0.0f);
        } else {
            i = 0;
        }
        this.r = i;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67828, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 67828, new Class[0], Void.TYPE);
        } else {
            this.n = new c(getActivity());
            this.n.c(C0906R.string.b5k);
            this.n.b(2, 14);
            c cVar = this.n;
            Typeface defaultFromStyle = Typeface.defaultFromStyle(1);
            if (PatchProxy.isSupport(new Object[]{defaultFromStyle}, cVar, c.f61054a, false, 66939, new Class[]{Typeface.class}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{defaultFromStyle}, cVar2, c.f61054a, false, 66939, new Class[]{Typeface.class}, Void.TYPE);
            } else {
                cVar.f61058e.setTypeface(defaultFromStyle);
            }
            this.n.o = 5000;
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 67834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 67834, new Class[0], Void.TYPE);
        } else {
            int g = g();
            this.mUserCover.getLayoutParams().height = g;
            if (this.mCoverMask != null && !com.ss.android.g.a.b()) {
                this.mCoverMask.getLayoutParams().height = this.E.getBgAvatarMarginTop() + g;
            }
            int Y_ = Y_();
            this.E.setVisibleHeight(Y_);
            this.f3791b = ((float) (Y_ - g)) / 2.0f;
            this.mUserCover.setTranslationY(this.f3791b);
            this.q = (float) g;
            this.mUserCover.setPivotX(((float) UIUtils.getScreenWidth(GlobalContext.getContext())) / 2.0f);
            this.mUserCover.setPivotY(0.0f);
            c(0, this.mScrollableLayout.getMaxY());
        }
        view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61741a;

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f61741a, false, 67854, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f61741a, false, 67854, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                view2.removeOnLayoutChangeListener(this);
                BaseDTProfileFragment.this.mScrollableLayout.setTabsMarginTop(BaseDTProfileFragment.this.r + BaseDTProfileFragment.this.mTitleColorCtrl.getMeasuredHeight() + BaseDTProfileFragment.this.E.H.getMeasuredHeight());
            }
        });
        PageManager.a(getActivity(), this, new PageManager.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61744a;

            public final void a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f61744a, false, 67855, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f61744a, false, 67855, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                TextUtils.equals(str2, "page_profile");
            }
        });
    }

    public final void g(User user) {
        int i;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{user}, this, k, false, 67836, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, k, false, 67836, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (PatchProxy.isSupport(new Object[0], this, k, false, 67840, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, k, false, 67840, new Class[0], Void.TYPE);
            } else {
                ((GenericDraweeHierarchy) this.mUserCover.getHierarchy()).setActualImageScaleType(g.a(m.FIT_XY));
                this.q = (float) g();
                j(g());
            }
            int screenWidth = UIUtils.getScreenWidth(d.a());
            int g = g();
            if (!ex.e(user)) {
                ((GenericDraweeHierarchy) this.mUserCover.getHierarchy()).setPlaceholderImage((int) C0906R.color.a0i);
                if (getContext() != null) {
                    i = (int) UIUtils.dip2Px(getContext(), 100.0f);
                } else {
                    i = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
                }
                if (user.getDefaultAdCoverUrl() != null) {
                    com.ss.android.ugc.aweme.base.c.a(this.mUserCover, user.getDefaultAdCoverUrl(), screenWidth, g);
                    return;
                }
                if (!CollectionUtils.isEmpty(user.getCoverUrls())) {
                    UrlModel urlModel = user.getCoverUrls().get(0);
                    if (PatchProxy.isSupport(new Object[]{urlModel}, null, com.ss.android.ugc.aweme.common.e.a.f40209a, true, 33454, new Class[]{UrlModel.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, null, com.ss.android.ugc.aweme.common.e.a.f40209a, true, 33454, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
                    } else if (urlModel == null || TextUtils.isEmpty(urlModel.getUri())) {
                        z = false;
                    } else {
                        z = TextUtils.equals(urlModel.getUri(), "c8510002be9a3a61aad2");
                    }
                    if (!z) {
                        com.ss.android.ugc.aweme.base.c.a(this.mUserCover, user.getCoverUrls().get(0), screenWidth, g);
                        return;
                    }
                }
                com.ss.android.ugc.aweme.base.c.a(this.mUserCover, com.ss.android.ugc.aweme.common.e.a.a(), screenWidth / 2, i);
            } else if (com.ss.android.ugc.aweme.commercialize.utils.c.c(user)) {
                j(Y_());
                this.f3791b = 0.0f;
                this.q = (float) Y_();
                c(0, this.mScrollableLayout.getMaxY());
                if (user.getCommerceInfo() != null) {
                    UrlModel headImageUrl = user.getCommerceInfo().getHeadImageUrl();
                    if (headImageUrl == null || CollectionUtils.isEmpty(headImageUrl.getUrlList())) {
                        this.mUserCover.setImageURI(new Uri.Builder().scheme("res").path("2130837942").build());
                        return;
                    }
                    com.ss.android.ugc.aweme.base.c.a(this.mUserCover, headImageUrl, screenWidth, g);
                }
            } else {
                this.mUserCover.setImageURI("");
                ((GenericDraweeHierarchy) this.mUserCover.getHierarchy()).setPlaceholderImage(2130837942);
            }
        }
    }

    public void b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, k, false, 67833, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, k, false, 67833, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null && this.n.isShowing()) {
            this.n.dismiss();
        }
    }

    public final void c(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, k, false, 67835, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, k, false, 67835, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float f2 = 1.0f;
        if (i >= 0) {
            this.mUserCover.setTranslationY(this.f3791b - ((float) (i / 2)));
        } else {
            float f3 = (float) (i / 2);
            if (((this.f3791b + f3) + this.q) - this.E.t >= 0.0f) {
                this.mUserCover.setTranslationY(this.f3791b - f3);
            } else {
                this.mUserCover.setTranslationY(0.0f);
                f2 = (((float) (-i)) + this.E.t) / this.q;
            }
        }
        this.mUserCover.setScaleX(f2);
        this.mUserCover.setScaleY(f2);
    }

    public void a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), blueVBrandInfo, user}, this, k, false, 67830, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), blueVBrandInfo, user}, this, k, false, 67830, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && !TextUtils.isEmpty(str)) {
            this.mTitle.setText(str2);
        }
    }
}
