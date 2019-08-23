package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public class ProfileEditActivity extends AmeSlideSSActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f62135b;

    /* renamed from: c  reason: collision with root package name */
    public ProfileEditFragment f62136c;

    public interface a {
        void a();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f62135b, false, 68672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62135b, false, 68672, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62135b, false, 68673, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62135b, false, 68673, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f62135b, false, 68671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62135b, false, 68671, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(C0906R.anim.cx, C0906R.anim.da);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f62135b, false, 68665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62135b, false, 68665, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setCustomStatusBarInLayout(this);
        } else {
            StatusBarUtils.setTransparent(this);
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f62135b, false, 68668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62135b, false, 68668, new Class[0], Void.TYPE);
            return;
        }
        ProfileEditFragment profileEditFragment = this.f62136c;
        if (PatchProxy.isSupport(new Object[0], profileEditFragment, ProfileEditFragment.f62137a, false, 68709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], profileEditFragment, ProfileEditFragment.f62137a, false, 68709, new Class[0], Void.TYPE);
            return;
        }
        profileEditFragment.a((View) null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f62135b, false, 68670, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f62135b, false, 68670, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        ProfileEditFragment profileEditFragment = this.f62136c;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, profileEditFragment, ProfileEditFragment.f62137a, false, 68727, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            ProfileEditFragment profileEditFragment2 = profileEditFragment;
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, profileEditFragment2, ProfileEditFragment.f62137a, false, 68727, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (motionEvent.getAction() == 0) {
                View currentFocus = profileEditFragment.getActivity().getCurrentFocus();
                if (PatchProxy.isSupport(new Object[]{currentFocus, motionEvent}, null, ProfileEditFragment.f62137a, true, 68728, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{currentFocus, motionEvent}, null, ProfileEditFragment.f62137a, true, 68728, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (currentFocus != null && (currentFocus instanceof EditText)) {
                        int[] iArr = {0, 0};
                        currentFocus.getLocationInWindow(iArr);
                        int i = iArr[0];
                        int i2 = iArr[1];
                        int height = currentFocus.getHeight() + i2;
                        int width = currentFocus.getWidth() + i;
                        if (motionEvent.getX() <= ((float) i) || motionEvent.getX() >= ((float) width) || motionEvent.getY() <= ((float) i2) || motionEvent.getY() >= ((float) height)) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    FragmentActivity activity = profileEditFragment.getActivity();
                    if (PatchProxy.isSupport(new Object[]{activity, currentFocus}, profileEditFragment, ProfileEditFragment.f62137a, false, 68711, new Class[]{Context.class, View.class}, Boolean.TYPE)) {
                        ProfileEditFragment profileEditFragment3 = profileEditFragment;
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, currentFocus}, profileEditFragment3, ProfileEditFragment.f62137a, false, 68711, new Class[]{Context.class, View.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                        if (inputMethodManager == null || !inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        z = true;
                    }
                }
            }
            z = false;
        }
        if (z || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62135b, false, 68664, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62135b, false, 68664, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ae);
        if (!com.ss.android.g.a.a()) {
            getWindow().setSoftInputMode(48);
        }
        if (PatchProxy.isSupport(new Object[0], this, f62135b, false, 68666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62135b, false, 68666, new Class[0], Void.TYPE);
        } else {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            this.f62136c = (ProfileEditFragment) getSupportFragmentManager().findFragmentByTag("user_profile_edit_fragment");
            if (this.f62136c == null) {
                IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                if (iBridgeService != null) {
                    this.f62136c = iBridgeService.createUserProfileEditFragment();
                }
                if (this.f62136c == null) {
                    this.f62136c = new ProfileEditFragment();
                }
                ProfileEditFragment profileEditFragment = this.f62136c;
                if (PatchProxy.isSupport(new Object[0], this, f62135b, false, 68667, new Class[0], Bundle.class)) {
                    bundle2 = (Bundle) PatchProxy.accessDispatch(new Object[0], this, f62135b, false, 68667, new Class[0], Bundle.class);
                } else {
                    bundle2 = new Bundle();
                    if (getIntent() != null) {
                        bundle2.putInt("jump_school_edit", getIntent().getIntExtra("jump_school_edit", 0));
                        bundle2.putBoolean("need_focus_id_input", getIntent().getBooleanExtra("need_focus_id_input", false));
                    }
                }
                profileEditFragment.setArguments(bundle2);
                beginTransaction.replace(C0906R.id.aic, this.f62136c, "user_profile_edit_fragment");
            }
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", false);
    }

    public static void a(Activity activity, @Nullable Bundle bundle) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2}, null, f62135b, true, 68663, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle2}, null, f62135b, true, 68663, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
        } else if (activity2 != null) {
            if (bundle2 == null) {
                activity2.startActivity(new Intent(activity2, ProfileEditActivity.class));
                return;
            }
            Intent intent = new Intent(activity2, ProfileEditActivity.class);
            intent.putExtras(bundle2);
            activity2.startActivity(intent);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f62135b, false, 68669, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f62135b, false, 68669, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.f62136c.onActivityResult(i, i2, intent2);
    }
}
