package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishPermissionFragment;

public class PublishPermissionActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65392a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f65392a, false, 74440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65392a, false, 74440, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65392a, false, 74441, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65392a, false, 74441, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f65392a, false, 74438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65392a, false, 74438, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onCreate(Bundle bundle) {
        PublishPermissionFragment publishPermissionFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65392a, false, 74437, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65392a, false, 74437, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.de);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("extra.TYPE", 0);
        final int intExtra2 = intent.getIntExtra("extra.PERMISSION", 0);
        int intExtra3 = intent.getIntExtra("extra.Private.DESCRIPTION", 0);
        int intExtra4 = intent.getIntExtra("extra.Friend.DESCRIPTION", 0);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (((PublishPermissionFragment) supportFragmentManager.findFragmentById(C0906R.id.aic)) == null) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Integer.valueOf(intExtra4)}, null, PublishPermissionFragment.f70536a, true, 80287, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, PublishPermissionFragment.class)) {
                publishPermissionFragment = (PublishPermissionFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Integer.valueOf(intExtra4)}, null, PublishPermissionFragment.f70536a, true, 80287, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, PublishPermissionFragment.class);
            } else {
                PublishPermissionFragment publishPermissionFragment2 = new PublishPermissionFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra.TYPE", intExtra);
                bundle2.putInt("extra.PERMISSION", intExtra2);
                bundle2.putInt("extra.Private.DESCRIPTION", intExtra3);
                bundle2.putInt("extra.Friend.DESCRIPTION", intExtra4);
                publishPermissionFragment2.setArguments(bundle2);
                publishPermissionFragment = publishPermissionFragment2;
            }
            supportFragmentManager.beginTransaction().add((int) C0906R.id.aic, (Fragment) publishPermissionFragment).commit();
        }
        ((NormalTitleBar) findViewById(C0906R.id.d3m)).setOnTitleBarClickListener(new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65393a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65393a, false, 74442, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65393a, false, 74442, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                PublishPermissionActivity publishPermissionActivity = PublishPermissionActivity.this;
                int i = intExtra2;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, publishPermissionActivity, PublishPermissionActivity.f65392a, false, 74439, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect = PublishPermissionActivity.f65392a;
                    PublishPermissionActivity publishPermissionActivity2 = publishPermissionActivity;
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    PatchProxy.accessDispatch(objArr, publishPermissionActivity2, changeQuickRedirect2, false, 74439, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("extra.PERMISSION", i);
                publishPermissionActivity.setResult(-1, intent);
                publishPermissionActivity.finish();
            }
        });
        ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).fitsSystemWindows(true).statusBarDarkFont(com.ss.android.g.a.b()).init();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onCreate", false);
    }

    public static void a(Fragment fragment, int i, int i2, @StringRes int i3, @StringRes int i4, int i5) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 2}, null, f65392a, true, 74435, new Class[]{Fragment.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 2}, null, f65392a, true, 74435, new Class[]{Fragment.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(fragment.getActivity(), PublishPermissionActivity.class);
        intent.putExtra("extra.TYPE", i);
        intent.putExtra("extra.PERMISSION", i2);
        intent.putExtra("extra.Private.DESCRIPTION", i3);
        intent.putExtra("extra.Friend.DESCRIPTION", i4);
        fragment2.startActivityForResult(intent, 2);
    }
}
