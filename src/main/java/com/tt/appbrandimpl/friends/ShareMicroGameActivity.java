package com.tt.appbrandimpl.friends;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;

public class ShareMicroGameActivity extends AmeActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91916, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 91915, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 91915, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ci);
        ShareMicroGameFragment shareMicroGameFragment = new ShareMicroGameFragment();
        shareMicroGameFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add((int) C0906R.id.afi, (Fragment) shareMicroGameFragment).commitAllowingStateLoss();
    }

    public static void start(Context context, Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, bundle2}, null, changeQuickRedirect, true, 91914, new Class[]{Context.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bundle2}, null, changeQuickRedirect, true, 91914, new Class[]{Context.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, ShareMicroGameActivity.class);
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        context2.startActivity(intent);
    }
}
