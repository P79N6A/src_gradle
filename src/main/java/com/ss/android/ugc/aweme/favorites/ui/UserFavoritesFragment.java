package com.ss.android.ugc.aweme.favorites.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.adapter.UserFavoritesPagerAdapter;
import com.ss.android.ugc.aweme.favorites.d.a;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.l;
import java.util.Map;

public class UserFavoritesFragment extends AmeBaseFragment implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44346a;

    /* renamed from: b  reason: collision with root package name */
    boolean f44347b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f44348c;

    /* renamed from: d  reason: collision with root package name */
    public String[] f44349d = {"video", "challenge", "music", "prop"};

    /* renamed from: e  reason: collision with root package name */
    public boolean f44350e;

    /* renamed from: f  reason: collision with root package name */
    public int f44351f;
    protected UserFavoritesPagerAdapter g;
    protected int h;
    public boolean i = true;
    private String j = "personal_homepage";
    private String k;
    private String l;
    @BindView(2131497604)
    protected TextTitleBar mTitleBar;
    @BindView(2131498537)
    protected ViewPager mViewPager;
    @BindView(2131495869)
    AwemeViewPagerNavigator navigator;

    public void onPageScrollStateChanged(int i2) {
    }

    public void onPageScrolled(int i2, float f2, int i3) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        if (this.mViewPager != null) {
            this.mViewPager.setCurrentItem(this.h);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f44346a, false, 39666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44346a, false, 39666, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!this.f44347b && this.g != null) {
            UserFavoritesPagerAdapter userFavoritesPagerAdapter = this.g;
            int i2 = this.h;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, userFavoritesPagerAdapter, UserFavoritesPagerAdapter.f44261a, false, 39420, new Class[]{Integer.TYPE}, Void.TYPE)) {
                UserFavoritesPagerAdapter userFavoritesPagerAdapter2 = userFavoritesPagerAdapter;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, userFavoritesPagerAdapter2, UserFavoritesPagerAdapter.f44261a, false, 39420, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                userFavoritesPagerAdapter.a(i2);
                if (userFavoritesPagerAdapter.f44262b != null && i2 >= 0 && i2 < userFavoritesPagerAdapter.f44262b.size() && (userFavoritesPagerAdapter.f44262b.get(i2) instanceof ProfileListFragment)) {
                    ProfileListFragment profileListFragment = (ProfileListFragment) userFavoritesPagerAdapter.f44262b.get(i2);
                    if (profileListFragment != null) {
                        profileListFragment.j = true;
                    }
                }
            }
        }
        this.f44347b = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f44346a, false, 39663, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f44346a, false, 39663, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f44346a, false, 39661, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f44346a, false, 39661, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (AbTestManager.a().aV()) {
            this.f44348c = new String[]{"video", "location", "goods", "challenge", "music", "prop"};
            return;
        }
        this.f44348c = new String[]{"video", "location", "challenge", "music", "prop"};
    }

    public void onPageSelected(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f44346a, false, 39667, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f44346a, false, 39667, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.g != null && i3 >= 0 && i3 < this.g.getCount()) {
            this.h = i3;
            UserFavoritesPagerAdapter userFavoritesPagerAdapter = this.g;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, userFavoritesPagerAdapter, UserFavoritesPagerAdapter.f44261a, false, 39421, new Class[]{Integer.TYPE}, Void.TYPE)) {
                UserFavoritesPagerAdapter userFavoritesPagerAdapter2 = userFavoritesPagerAdapter;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, userFavoritesPagerAdapter2, UserFavoritesPagerAdapter.f44261a, false, 39421, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            userFavoritesPagerAdapter.a(i3);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, userFavoritesPagerAdapter, UserFavoritesPagerAdapter.f44261a, false, 39422, new Class[]{Integer.TYPE}, Void.TYPE)) {
                UserFavoritesPagerAdapter userFavoritesPagerAdapter3 = userFavoritesPagerAdapter;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, userFavoritesPagerAdapter3, UserFavoritesPagerAdapter.f44261a, false, 39422, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (userFavoritesPagerAdapter.f44262b != null && i3 >= 0 && i3 < userFavoritesPagerAdapter.f44262b.size() && (userFavoritesPagerAdapter.f44262b.get(i3) instanceof ProfileListFragment)) {
                ProfileListFragment profileListFragment = (ProfileListFragment) userFavoritesPagerAdapter.f44262b.get(i3);
                if (profileListFragment != null && profileListFragment.j()) {
                    profileListFragment.H_();
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f44346a, false, 39664, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f44346a, false, 39664, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f44346a, false, 39665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44346a, false, 39665, new Class[0], Void.TYPE);
            return;
        }
        this.navigator.setBackgroundColor(getResources().getColor(C0906R.color.yx));
        this.navigator.setScrollable(true);
        this.g = new UserFavoritesPagerAdapter(getChildFragmentManager(), getActivity());
        this.mViewPager.setAdapter(this.g);
        Intent intent = getActivity().getIntent();
        if (intent != null && intent.hasExtra("index")) {
            this.f44351f = Integer.valueOf(intent.getStringExtra("index")).intValue();
            if (this.f44351f > 0 && this.f44351f < this.g.getCount()) {
                this.h = this.f44351f;
                this.f44350e = true;
            }
            if (intent.hasExtra("enter_from")) {
                this.j = intent.getStringExtra("enter_from");
            } else {
                this.j = "h5";
            }
            if (intent.hasExtra("enter_method")) {
                this.k = intent.getStringExtra("enter_method");
            } else {
                this.k = "click_h5";
            }
            if (intent.hasExtra("tab_name")) {
                this.l = intent.getStringExtra("tab_name");
            }
            d a2 = d.a();
            if (!TextUtils.isEmpty(this.j)) {
                a2.a("enter_from", this.j);
            }
            if (!TextUtils.isEmpty(this.k)) {
                a2.a("enter_method", this.k);
            }
            if (!TextUtils.isEmpty(this.l)) {
                a2.a("tab_name", this.l);
            }
            r.a("enter_personal_favourite", (Map) a2.f34114b);
        }
        this.navigator.a(this.mViewPager, (l) new c(), (AwemeViewPagerNavigator.a) new AwemeViewPagerNavigator.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44352a;

            public final void a(View view, int i) {
                UserFavoritesFragment.this.i = true;
            }

            public final void a(View view, int i, boolean z) {
                String str;
                String[] strArr;
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f44352a, false, 39669, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Byte.valueOf(z)}, this, f44352a, false, 39669, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (UserFavoritesFragment.this.i) {
                    str = "click";
                } else {
                    str = "slide";
                }
                if (c.a()) {
                    strArr = UserFavoritesFragment.this.f44349d;
                } else {
                    strArr = UserFavoritesFragment.this.f44348c;
                }
                if (UserFavoritesFragment.this.f44350e) {
                    if (i2 == UserFavoritesFragment.this.f44351f) {
                        a.a(str, strArr[i2]);
                    }
                    UserFavoritesFragment.this.f44350e = false;
                } else {
                    a.a(str, strArr[i2]);
                }
                UserFavoritesFragment.this.i = false;
            }
        });
        this.mViewPager.addOnPageChangeListener(this);
        this.mViewPager.setOffscreenPageLimit(5);
        this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44354a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44354a, false, 39670, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44354a, false, 39670, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                UserFavoritesFragment userFavoritesFragment = UserFavoritesFragment.this;
                if (PatchProxy.isSupport(new Object[0], userFavoritesFragment, UserFavoritesFragment.f44346a, false, 39660, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], userFavoritesFragment, UserFavoritesFragment.f44346a, false, 39660, new Class[0], Void.TYPE);
                    return;
                }
                if (userFavoritesFragment.getActivity() != null && (userFavoritesFragment.getActivity() instanceof UserFavoritesActivity)) {
                    userFavoritesFragment.getActivity().finish();
                }
            }
        });
        a.f44280b = this.j;
        this.navigator.post(new b(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f44346a, false, 39662, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f44346a, false, 39662, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        getArguments();
        return layoutInflater2.inflate(C0906R.layout.r1, viewGroup2, false);
    }
}
