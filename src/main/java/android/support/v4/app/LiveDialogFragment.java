package android.support.v4.app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.livesdkapi.k.a;

public class LiveDialogFragment extends DialogFragment {
    protected boolean isViewValid;

    /* access modifiers changed from: protected */
    public boolean onBackPressed() {
        return false;
    }

    public void dismiss() {
        dismissAllowingStateLoss();
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    public void onDestroyView() {
        this.isViewValid = false;
        super.onDestroyView();
    }

    public boolean isShowing() {
        if (getDialog() == null || !getDialog().isShowing()) {
            return false;
        }
        return true;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.isViewValid) {
            dismissAllowingStateLoss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.isViewValid = false;
    }

    public static void show(FragmentActivity fragmentActivity, LiveDialogFragment liveDialogFragment) {
        if (fragmentActivity != null && liveDialogFragment != null) {
            liveDialogFragment.show(fragmentActivity.getSupportFragmentManager(), liveDialogFragment.getClass().getCanonicalName());
        }
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.isViewValid = true;
        getDialog().setOnKeyListener(new LiveDialogFragment$$Lambda$0(this));
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        a.a((Object) this, "mDismissed", (Object) Boolean.FALSE);
        a.a((Object) this, "mShownByMe", (Object) Boolean.TRUE);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, str);
        beginTransaction.commitNowAllowingStateLoss();
    }

    public int show(FragmentTransaction fragmentTransaction, String str) {
        a.a((Object) this, "mDismissed", (Object) Boolean.FALSE);
        a.a((Object) this, "mShownByMe", (Object) Boolean.TRUE);
        fragmentTransaction.add((Fragment) this, str);
        a.a((Object) this, "mViewDestroyed", (Object) Boolean.FALSE);
        int commitAllowingStateLoss = fragmentTransaction.commitAllowingStateLoss();
        a.a((Object) this, "mBackStackId", (Object) Integer.valueOf(commitAllowingStateLoss));
        return commitAllowingStateLoss;
    }

    public void show(FragmentManager fragmentManager, String str) {
        a.a((Object) this, "mDismissed", (Object) Boolean.FALSE);
        a.a((Object) this, "mShownByMe", (Object) Boolean.TRUE);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, str);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean lambda$onViewCreated$0$LiveDialogFragment(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (4 != i || 1 != keyEvent.getAction()) {
            return false;
        }
        onBackPressed();
        return false;
    }
}
