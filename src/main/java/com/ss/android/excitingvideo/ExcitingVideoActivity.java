package com.ss.android.excitingvideo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.excitingvideo.sdk.ExcitingVideoFragment;
import com.ss.android.excitingvideo.sdk.IFragmentCloseListener;
import com.ss.android.ugc.aweme.C0906R;

public class ExcitingVideoActivity extends FragmentActivity implements IFragmentCloseListener {
    private ExcitingVideoFragment mVideoFragment;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.excitingvideo.ExcitingVideoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.excitingvideo.ExcitingVideoActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.excitingvideo.ExcitingVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void closeFragment() {
        finish();
    }

    public void onBackPressed() {
        if (this.mVideoFragment == null || !this.mVideoFragment.onBackPressed()) {
            super.onBackPressed();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.excitingvideo.ExcitingVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setRequestedOrientation(1);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(C0906R.id.aaq);
        setContentView(frameLayout);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.mVideoFragment = new ExcitingVideoFragment();
        this.mVideoFragment.setFragmentCloseListener(this);
        supportFragmentManager.beginTransaction().replace(C0906R.id.aaq, this.mVideoFragment).commit();
        ActivityInstrumentation.onTrace("com.ss.android.excitingvideo.ExcitingVideoActivity", "onCreate", false);
    }
}
