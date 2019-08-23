package com.ss.android.ugc.aweme.discover.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.activity.c;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.DiscoverFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchContainerFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchScanView;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.discover.ui.ay;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class HotSearchAndDiscoveryActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3024a;

    /* renamed from: b  reason: collision with root package name */
    public SearchScanView f3025b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f3026c;

    /* renamed from: d  reason: collision with root package name */
    DiscoverFragment.a f3027d;

    /* renamed from: e  reason: collision with root package name */
    private Fragment f3028e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f3029f;
    private View g;
    private ImageView h;
    private ImageView i;
    private boolean j;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35450, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3024a, false, 35451, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3024a, false, 35451, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35446, new Class[0], Void.TYPE);
            return;
        }
        a(false);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35440, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (this.f3027d == DiscoverFragment.a.HOT_SEARCH_WITH_DISCOVER) {
            c.b(this, 3);
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35443, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        this.f3029f.setImageDrawable(a.a(getResources(), 2130839373));
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35449, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35436, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.b()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) C0906R.color.w1).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        }
    }

    @Subscribe
    public void onSearchHistoryEvent(SearchHistory searchHistory) {
        if (PatchProxy.isSupport(new Object[]{searchHistory}, this, f3024a, false, 35445, new Class[]{SearchHistory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchHistory}, this, f3024a, false, 35445, new Class[]{SearchHistory.class}, Void.TYPE);
            return;
        }
        this.f3026c.setText(searchHistory.keyword);
        a(true);
    }

    @OnClick({2131493372})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3024a, false, 35442, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3024a, false, 35442, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f3026c.setText("");
        this.f3026c.clearFocus();
        KeyboardUtils.c(this.f3026c);
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35444, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3027d != DiscoverFragment.a.KEYWORD_SEARCH) {
            onBackPressed();
        }
    }

    @OnTextChanged({2131494165})
    public void onTextChanged(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f3024a, false, 35441, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f3024a, false, 35441, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(charSequence) && this.h.getVisibility() == 8) {
            this.h.setVisibility(0);
        } else if (TextUtils.isEmpty(charSequence) && this.h.getVisibility() == 0) {
            this.h.setVisibility(8);
        }
        if (!this.j) {
            if (TextUtils.isEmpty(charSequence)) {
                this.f3025b.a();
                return;
            }
            this.f3025b.b();
        }
    }

    private void a(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3024a, false, 35447, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3024a, false, 35447, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        String obj = this.f3026c.getText().toString();
        if (!ay.a(obj)) {
            KeyboardUtils.c(this.f3026c);
            this.f3026c.setCursorVisible(false);
            this.f3029f.setImageDrawable(a.a(getResources(), 2130841646));
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            SearchContainerFragment searchContainerFragment = (SearchContainerFragment) supportFragmentManager.findFragmentByTag("container");
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            String obj2 = this.f3026c.getText().toString();
            if (!TextUtils.isEmpty(obj2)) {
                SearchHistoryManager.inst().recordSearchHistory(new SearchHistory(obj2, 0));
            }
            SearchResultParam keyword = new SearchResultParam().setSearchFrom(z ? 1 : 0).setKeyword(obj);
            if (searchContainerFragment == null) {
                searchContainerFragment = SearchContainerFragment.a(keyword);
                beginTransaction.add(C0906R.id.aic, searchContainerFragment, "container");
                if (this.f3027d != DiscoverFragment.a.KEYWORD_SEARCH) {
                    if (this.f3028e != null) {
                        beginTransaction.hide(this.f3028e);
                    }
                    beginTransaction.addToBackStack("container");
                }
                z2 = false;
            }
            searchContainerFragment.a((ViewPager.OnPageChangeListener) new ViewPager.OnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41505a;

                public void onPageScrollStateChanged(int i) {
                }

                public void onPageScrolled(int i, float f2, int i2) {
                }

                public void onPageSelected(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41505a, false, 35458, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41505a, false, 35458, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    HotSearchAndDiscoveryActivity.this.a(i);
                }
            });
            a(searchContainerFragment.a());
            beginTransaction.commitAllowingStateLoss();
            if (z2) {
                searchContainerFragment.b(keyword);
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3024a, false, 35448, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3024a, false, 35448, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            if (i2 != aw.f43134b) {
                if (i2 == aw.f43136d) {
                    this.f3026c.setHint(getString(C0906R.string.bnh));
                    return;
                } else if (i2 == aw.f43138f) {
                    this.f3026c.setHint(getString(C0906R.string.bnf));
                    return;
                } else if (i2 == aw.g) {
                    this.f3026c.setHint(getString(C0906R.string.bng));
                    return;
                } else {
                    int i3 = aw.f43135c;
                }
            }
            this.f3026c.setHint(getString(C0906R.string.bne));
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3024a, false, 35433, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3024a, false, 35433, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bx);
        if (getIntent() != null) {
            this.j = getIntent().getBooleanExtra("intent_extra_from_discover", false);
        }
        if (!PatchProxy.isSupport(new Object[0], this, f3024a, false, 35434, new Class[0], Void.TYPE)) {
            switch (AbTestManager.a().G().intValue()) {
                case 0:
                    this.f3027d = DiscoverFragment.a.KEYWORD_SEARCH;
                    break;
                case 1:
                    this.f3027d = DiscoverFragment.a.HOT_SEARCH;
                    break;
                case 2:
                    this.f3027d = DiscoverFragment.a.HOT_SEARCH_WITH_DISCOVER;
                    break;
            }
        } else {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35434, new Class[0], Void.TYPE);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35439, new Class[0], Void.TYPE);
        } else {
            this.g = findViewById(C0906R.id.aft);
            this.f3029f = (ImageView) findViewById(C0906R.id.ix);
            this.f3025b = (SearchScanView) findViewById(C0906R.id.clv);
            this.f3026c = (EditText) findViewById(C0906R.id.aai);
            this.h = (ImageView) findViewById(C0906R.id.ns);
            this.i = (ImageView) findViewById(C0906R.id.b4s);
            this.f3026c.setOnEditorActionListener(new TextView.OnEditorActionListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41501a;

                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f41501a, false, 35456, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f41501a, false, 35456, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    if (i == 3) {
                        HotSearchAndDiscoveryActivity.this.a();
                        KeyboardUtils.c(HotSearchAndDiscoveryActivity.this.f3026c);
                    } else {
                        z = false;
                    }
                    return z;
                }
            });
            this.f3026c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41503a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41503a, false, 35457, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41503a, false, 35457, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    HotSearchAndDiscoveryActivity.this.f3026c.setCursorVisible(true);
                    HotSearchAndDiscoveryActivity.this.f3025b.b();
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35435, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35435, new Class[0], Void.TYPE);
        } else {
            this.f3029f.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41495a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41495a, false, 35452, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41495a, false, 35452, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    KeyboardUtils.c(HotSearchAndDiscoveryActivity.this.f3026c);
                    HotSearchAndDiscoveryActivity.this.onBackPressed();
                }
            });
            this.g.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41497a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41497a, false, 35453, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41497a, false, 35453, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                }
            });
            this.f3025b.setOnInternalClickListener(new SearchScanView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41499a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41499a, false, 35454, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41499a, false, 35454, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    HotSearchAndDiscoveryActivity.this.a();
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41499a, false, 35455, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41499a, false, 35455, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    r.a("qr_code_scan_enter", (Map) d.a().a("enter_from", "discovery").f34114b);
                    QRCodePermissionActivity.a(HotSearchAndDiscoveryActivity.this, false);
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35438, new Class[0], Void.TYPE);
        } else {
            this.f3026c.setHint(e.e().a("place_holder", o.b(C0906R.string.bne)));
            ImageView imageView = this.f3029f;
            if (this.f3027d == DiscoverFragment.a.HOT_SEARCH) {
                i2 = 2130841646;
            } else {
                i2 = 2130839373;
            }
            imageView.setImageResource(i2);
            if (this.f3027d == DiscoverFragment.a.HOT_SEARCH && Build.VERSION.SDK_INT >= 19) {
                this.f3029f.getDrawable().setAutoMirrored(true);
            }
            ImageView imageView2 = this.f3029f;
            if (PatchProxy.isSupport(new Object[]{imageView2}, null, com.ss.android.ugc.aweme.discover.e.a.f42281a, true, 38295, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{imageView2}, null, com.ss.android.ugc.aweme.discover.e.a.f42281a, true, 38295, new Class[]{View.class}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.base.utils.e.f35018a) {
                imageView2.setBackgroundResource(2130840449);
            }
            if (this.f3027d != DiscoverFragment.a.KEYWORD_SEARCH) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                this.f3028e = DiscoverFragment.a(this.f3027d, false);
                beginTransaction.replace(C0906R.id.aic, this.f3028e);
                beginTransaction.commit();
            } else {
                a();
            }
            if (this.j) {
                this.f3025b.b();
            } else {
                this.f3025b.a();
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3024a, false, 35437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3024a, false, 35437, new Class[0], Void.TYPE);
        } else if (this.f3027d == DiscoverFragment.a.HOT_SEARCH_WITH_DISCOVER) {
            c.a(this, 3);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onCreate", false);
    }
}
