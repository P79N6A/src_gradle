package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;

public class SummonFriendActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3350a;

    /* renamed from: b  reason: collision with root package name */
    private int f3351b;

    /* renamed from: c  reason: collision with root package name */
    private String f3352c;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3350a, false, 47475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3350a, false, 47475, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3350a, false, 47476, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3350a, false, 47476, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3350a, false, 47470, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3350a, false, 47470, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        superOverridePendingTransition(C0906R.anim.n, C0906R.anim.s);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f3350a, false, 47473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3350a, false, 47473, new Class[0], Void.TYPE);
            return;
        }
        b.a((Activity) this, findViewById(C0906R.id.y9));
        setResult(0);
        super.onBackPressed();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3350a, false, 47471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3350a, false, 47471, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    @Subscribe
    public void onSummonFriendClickEvent(com.ss.android.ugc.aweme.friends.a.b bVar) {
        com.ss.android.ugc.aweme.friends.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f3350a, false, 47474, new Class[]{com.ss.android.ugc.aweme.friends.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f3350a, false, 47474, new Class[]{com.ss.android.ugc.aweme.friends.a.b.class}, Void.TYPE);
        } else if (bVar2 != null) {
            Intent intent = new Intent();
            intent.putExtra("extra_data", bVar2.f48670a);
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        AtFriendsFragment atFriendsFragment;
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        boolean z;
        int i;
        Class[] clsArr;
        Class<AtFriendsFragment> cls;
        AtFriendsFragment.a aVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3350a, false, 47469, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3350a, false, 47469, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        superOverridePendingTransition(C0906R.anim.r, C0906R.anim.n);
        if (Build.VERSION.SDK_INT >= 19) {
            findViewById(C0906R.id.cv0).getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
        }
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a1c));
        this.f3352c = getIntent().getStringExtra("video_id");
        this.f3351b = getIntent().getIntExtra("source", 0);
        if (PatchProxy.isSupport(new Object[0], this, f3350a, false, 47472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3350a, false, 47472, new Class[0], Void.TYPE);
        } else {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (((Integer) SharePrefCache.inst().getAtFriendsShowType().c()).intValue() == 1) {
                String str = this.f3352c;
                int i2 = this.f3351b;
                if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, null, AtFriendsFragment.f49137a, true, 47040, new Class[]{String.class, Integer.TYPE}, AtFriendsFragment.class)) {
                    objArr = new Object[]{str, Integer.valueOf(i2)};
                    aVar = null;
                    changeQuickRedirect = AtFriendsFragment.f49137a;
                    z = true;
                    i = 47040;
                    clsArr = new Class[]{String.class, Integer.TYPE};
                    cls = AtFriendsFragment.class;
                } else {
                    AtFriendsFragment.a aVar2 = AtFriendsFragment.i;
                    if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, aVar2, AtFriendsFragment.a.f49143a, false, 47041, new Class[]{String.class, Integer.TYPE}, AtFriendsFragment.class)) {
                        objArr = new Object[]{str, Integer.valueOf(i2)};
                        changeQuickRedirect = AtFriendsFragment.a.f49143a;
                        z = false;
                        i = 47041;
                        clsArr = new Class[]{String.class, Integer.TYPE};
                        cls = AtFriendsFragment.class;
                        aVar = aVar2;
                    } else {
                        Intrinsics.checkParameterIsNotNull(str, "videoId");
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("video_id", str);
                        bundle2.putInt("source", i2);
                        AtFriendsFragment atFriendsFragment2 = new AtFriendsFragment();
                        atFriendsFragment2.setArguments(bundle2);
                        atFriendsFragment = atFriendsFragment2;
                    }
                }
                atFriendsFragment = (AtFriendsFragment) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, z, i, clsArr, cls);
            } else {
                String str2 = this.f3352c;
                int i3 = this.f3351b;
                if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i3)}, null, SummonFriendsFragment.f49352a, true, 47477, new Class[]{String.class, Integer.TYPE}, SummonFriendsFragment.class)) {
                    atFriendsFragment = (SummonFriendsFragment) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i3)}, null, SummonFriendsFragment.f49352a, true, 47477, new Class[]{String.class, Integer.TYPE}, SummonFriendsFragment.class);
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("video_id", str2);
                    bundle3.putInt("source", i3);
                    SummonFriendsFragment summonFriendsFragment = new SummonFriendsFragment();
                    summonFriendsFragment.setArguments(bundle3);
                    atFriendsFragment = summonFriendsFragment;
                }
            }
            atFriendsFragment.setUserVisibleHint(true);
            beginTransaction.replace(C0906R.id.y9, atFriendsFragment);
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onCreate", false);
    }

    public static void a(Fragment fragment, int i, String str, int i2) {
        Fragment fragment2 = fragment;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragment2, Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f3350a, true, 47468, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f3350a, true, 47468, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(fragment.getActivity(), SummonFriendActivity.class);
        intent.putExtra("video_id", str2);
        intent.putExtra("source", i2);
        fragment2.startActivityForResult(intent, i);
    }
}
