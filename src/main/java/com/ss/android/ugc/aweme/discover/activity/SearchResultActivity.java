package com.ss.android.ugc.aweme.discover.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.activity.c;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.model.SearchEnterParam;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.SearchResultFragment;
import com.ss.android.ugc.aweme.hotsearch.RankingListActivity;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.ea;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;

@AddPageTrace
public class SearchResultActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41521a;

    /* renamed from: b  reason: collision with root package name */
    private SearchResultParam f41522b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f41521a, false, 35480, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41521a, false, 35480, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchResultActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchResultActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41521a, false, 35481, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41521a, false, 35481, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f41521a, false, 35478, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41521a, false, 35478, new Class[0], Void.TYPE);
            return;
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("container");
        if (findFragmentByTag instanceof SearchResultFragment) {
            z = ((SearchResultFragment) findFragmentByTag).a();
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f41521a, false, 35477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41521a, false, 35477, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
        if (a.b()) {
            ea.f75806b.a(this, getWindow(), true);
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41521a, false, 35474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41521a, false, 35474, new Class[0], Void.TYPE);
        } else if (getIntent() != null) {
            Intent intent = getIntent();
            this.f41522b = (SearchResultParam) intent.getSerializableExtra("searchParam");
            SearchEnterParam searchEnterParam = (SearchEnterParam) intent.getSerializableExtra("search_enter_param");
            if (this.f41522b == null) {
                this.f41522b = b();
            }
            if (this.f41522b == null) {
                finish();
                return;
            }
            this.f41522b.setOpenNewSearchContainer(true);
            a(this.f41522b, searchEnterParam);
        } else {
            finish();
        }
    }

    private SearchResultParam b() {
        if (PatchProxy.isSupport(new Object[0], this, f41521a, false, 35475, new Class[0], SearchResultParam.class)) {
            return (SearchResultParam) PatchProxy.accessDispatch(new Object[0], this, f41521a, false, 35475, new Class[0], SearchResultParam.class);
        }
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("keyword");
            String stringExtra2 = intent.getStringExtra("display_keyword");
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = intent.getStringExtra("displayKeyword");
            }
            String stringExtra3 = intent.getStringExtra("enter_from");
            int intExtra = intent.getIntExtra("search_from", 0);
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra3)) {
                SearchResultParam realSearchWord = new SearchResultParam().setRealSearchWord(stringExtra);
                if (!TextUtils.isEmpty(stringExtra2)) {
                    stringExtra = stringExtra2;
                }
                return realSearchWord.setKeyword(stringExtra).setEnterFrom(stringExtra3).setSearchFrom(intExtra);
            }
        }
        return null;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f41521a, false, 35479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41521a, false, 35479, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (this.f41522b != null && (TextUtils.equals(this.f41522b.getEnterFrom(), "douyin_assistant") || TextUtils.equals(this.f41522b.getEnterFrom(), "push"))) {
            if (PatchProxy.isSupport(new Object[]{this, 1}, null, RankingListActivity.f3354a, true, 49508, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, 1}, null, RankingListActivity.f3354a, true, 49508, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            } else {
                Intent intent = new Intent();
                intent.setClass(this, RankingListActivity.class);
                intent.putExtra("enter_animation", 1);
                startActivity(intent);
            }
            c.b(this, 4);
        } else if (!b.i() || (!(ActivityStack.getPreviousActivity() instanceof MainActivity) && !(ActivityStack.getPreviousActivity() instanceof DetailActivity))) {
            c.b(this, 0);
        } else {
            c.b(this, 1);
        }
    }

    public void onNewIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f41521a, false, 35473, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f41521a, false, 35473, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        a();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f41521a, false, 35472, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f41521a, false, 35472, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchResultActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bj);
        a();
        if (this.f41522b == null || this.f41522b.getSearchFrom() != 17) {
            c.a(this, 0);
        } else {
            c.a(this, 1);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchResultActivity", "onCreate", false);
    }

    public static void a(Context context, @NonNull SearchResultParam searchResultParam) {
        Context context2 = context;
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{context2, searchResultParam2}, null, f41521a, true, 35469, new Class[]{Context.class, SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, searchResultParam2}, null, f41521a, true, 35469, new Class[]{Context.class, SearchResultParam.class}, Void.TYPE);
            return;
        }
        a(context2, searchResultParam2, null, null);
    }

    private void a(SearchResultParam searchResultParam, SearchEnterParam searchEnterParam) {
        if (PatchProxy.isSupport(new Object[]{searchResultParam, searchEnterParam}, this, f41521a, false, 35476, new Class[]{SearchResultParam.class, SearchEnterParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam, searchEnterParam}, this, f41521a, false, 35476, new Class[]{SearchResultParam.class, SearchEnterParam.class}, Void.TYPE);
            return;
        }
        SearchResultFragment a2 = SearchResultFragment.a(searchResultParam, searchEnterParam);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(C0906R.id.aic, a2, "container");
        beginTransaction.commitAllowingStateLoss();
    }

    public static void a(Context context, @NonNull SearchResultParam searchResultParam, @Nullable SearchEnterParam searchEnterParam, @Nullable Bundle bundle) {
        Context context2 = context;
        SearchResultParam searchResultParam2 = searchResultParam;
        SearchEnterParam searchEnterParam2 = searchEnterParam;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, searchResultParam2, searchEnterParam2, bundle2}, null, f41521a, true, 35471, new Class[]{Context.class, SearchResultParam.class, SearchEnterParam.class, Bundle.class}, Void.TYPE)) {
            Object[] objArr = {context2, searchResultParam2, searchEnterParam2, bundle2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f41521a, true, 35471, new Class[]{Context.class, SearchResultParam.class, SearchEnterParam.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("searchParam", searchResultParam2);
        intent.putExtra("search_enter_param", searchEnterParam2);
        intent.setClass(context2, SearchResultActivity.class);
        if (bundle2 == null || Build.VERSION.SDK_INT < 21) {
            context2.startActivity(intent);
        } else {
            context2.startActivity(intent, bundle2);
        }
    }
}
