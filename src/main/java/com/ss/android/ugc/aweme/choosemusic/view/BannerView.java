package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicBannerAdapter;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.aweme.shortvideo.ui.InfiniteLoopPagerAdapter;
import com.ss.android.ugc.aweme.utils.dp;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BannerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35994a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<Banner> f35995b = Arrays.asList(new Banner[]{new Banner()});

    /* renamed from: c  reason: collision with root package name */
    private MusicBannerAdapter f35996c;

    /* renamed from: d  reason: collision with root package name */
    private final i f35997d;

    /* renamed from: e  reason: collision with root package name */
    private Context f35998e;

    /* renamed from: f  reason: collision with root package name */
    private int f35999f;
    @BindView(2131493231)
    RelativeLayout mBannerLayout;
    @BindView(2131494013)
    IndicatorView mIndicator;
    @BindView(2131495536)
    ViewGroup mLlBannerContainer;
    @BindView(2131497328)
    View mStatusBar;
    @BindView(2131498537)
    ViewPager mViewPager;

    public BannerView(View view, int i) {
        this.f35998e = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f35999f = i;
        Context context = this.f35998e;
        if (PatchProxy.isSupport(new Object[]{context}, this, f35994a, false, 26799, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f35994a, false, 26799, new Class[]{Context.class}, Void.TYPE);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mLlBannerContainer.getLayoutParams();
            marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(this.mLlBannerContainer.getContext(), 16.0f);
            marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
            ViewGroup.LayoutParams layoutParams = this.mBannerLayout.getLayoutParams();
            layoutParams.height = (int) (((float) (UIUtils.getScreenWidth(context) - ((int) (UIUtils.dip2Px(context, 16.0f) * 2.0f)))) * 0.26239067f);
            this.mBannerLayout.setLayoutParams(layoutParams);
            if (Build.VERSION.SDK_INT >= 21) {
                this.mBannerLayout.setOutlineProvider(new dp((int) UIUtils.dip2Px(this.f35998e, 2.0f)));
                this.mBannerLayout.setClipToOutline(true);
            }
        }
        this.f35997d = new i(this.mViewPager, 3000);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mStatusBar.getLayoutParams().height = UIUtils.getStatusBarHeight(view.getContext());
        }
        ViewCompat.setLayoutDirection(this.mIndicator, 0);
    }

    public final void a(List<Banner> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, (byte) 1}, this, f35994a, false, 26800, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, (byte) 1}, this, f35994a, false, 26800, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f35998e;
        if (!f35995b.equals(list)) {
            if (this.f35996c == null) {
                this.f35996c = new MusicBannerAdapter(context, LayoutInflater.from(context), this.f35999f);
                this.mViewPager.setAdapter(new InfiniteLoopPagerAdapter(this.f35996c));
            }
            boolean a2 = ey.a(context);
            if (a2) {
                Collections.reverse(list);
            }
            this.f35997d.f42344c = list.size();
            this.f35996c.a(list);
            this.mIndicator.a(this.mViewPager);
            if (a2) {
                this.mViewPager.setCurrentItem(list.size() - 1);
            }
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f35994a, false, 26801, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f35994a, false, 26801, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f35997d.a();
        }
    }
}
