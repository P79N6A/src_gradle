package android.support.v4.app;

public class BaseDialogFragmentV2 extends DialogFragment {
    public int show(FragmentTransaction fragmentTransaction, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        fragmentTransaction.add((Fragment) this, str);
        this.mViewDestroyed = false;
        this.mBackStackId = fragmentTransaction.commitAllowingStateLoss();
        return this.mBackStackId;
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, str);
        try {
            beginTransaction.commitNowAllowingStateLoss();
        } catch (Throwable unused) {
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, str);
        beginTransaction.commitAllowingStateLoss();
    }
}
