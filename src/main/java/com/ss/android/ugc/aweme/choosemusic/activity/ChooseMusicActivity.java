package com.ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.Space;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public class ChooseMusicActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35747a;

    /* renamed from: b  reason: collision with root package name */
    public DmtTextView f35748b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f35749c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPagerBottomSheetBehavior f35750d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f35751e;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f35747a, false, 26450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35747a, false, 26450, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35747a, false, 26451, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35747a, false, 26451, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f35747a, false, 26446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35747a, false, 26446, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        KeyboardUtils.c(this.f35748b);
        overridePendingTransition(0, C0906R.anim.s);
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f35747a, false, 26445, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("music_homepage");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f35747a, false, 26445, new Class[0], Analysis.class);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f35747a, false, 26448, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35747a, false, 26448, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.onBackPressed();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f35747a, false, 26447, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35747a, false, 26447, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35747a, false, 26443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35747a, false, 26443, new Class[0], Void.TYPE);
        } else if (this.f35749c) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
            Intent intent = new Intent();
            intent.putExtra("is_cancel_current_choose_music", true);
            setResult(-1, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        ChooseMusicFragment chooseMusicFragment;
        boolean z;
        int i;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35747a, false, 26440, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35747a, false, 26440, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(C0906R.anim.r, 0);
        setContentView((int) C0906R.layout.ap);
        this.f35748b = (DmtTextView) findViewById(C0906R.id.dkk);
        this.f35748b.setText(getIntent().getStringExtra(PushConstants.TITLE));
        this.f35748b.setFontType(c.f20595b);
        if (PatchProxy.isSupport(new Object[0], this, f35747a, false, 26441, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35747a, false, 26441, new Class[0], Void.TYPE);
        } else {
            AbTestManager.a().d();
            this.f35751e = (TextView) findViewById(C0906R.id.dhp);
            try {
                z = g.b().u().booleanValue();
            } catch (a unused) {
                z = false;
            }
            TextView textView = this.f35751e;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            this.f35751e.setOnClickListener(com.ss.android.ugc.aweme.base.widget.b.a.a(new b(this)));
        }
        findViewById(C0906R.id.ix).setOnClickListener(new a(this));
        ((Space) findViewById(C0906R.id.css)).setMinimumHeight(p.c());
        this.f35750d = ViewPagerBottomSheetBehavior.a(findViewById(C0906R.id.a3z));
        this.f35750d.l = new ViewPagerBottomSheetBehavior.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35752a;

            public final void a(@NonNull View view, float f2) {
            }

            public final void a(@NonNull View view, int i) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f35752a, false, 26454, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f35752a, false, 26454, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 5) {
                    ChooseMusicActivity.this.a();
                    ChooseMusicActivity chooseMusicActivity = ChooseMusicActivity.this;
                    if (PatchProxy.isSupport(new Object[0], chooseMusicActivity, ChooseMusicActivity.f35747a, false, 26449, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], chooseMusicActivity, ChooseMusicActivity.f35747a, false, 26449, new Class[0], Void.TYPE);
                        return;
                    }
                    chooseMusicActivity.finish();
                    chooseMusicActivity.overridePendingTransition(0, 0);
                }
            }
        };
        this.f35750d.f34776e = true;
        this.f35750d.a(p.a(this) + p.d(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (((ChooseMusicFragment) supportFragmentManager.findFragmentById(C0906R.id.aic)) == null) {
            int intExtra = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setMusicChooseType(intExtra);
            String stringExtra = getIntent().getStringExtra("challenge");
            String stringExtra2 = getIntent().getStringExtra("creation_id");
            String stringExtra3 = getIntent().getStringExtra("shoot_way");
            MusicModel musicModel = (MusicModel) getIntent().getSerializableExtra("music_model");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            Bundle bundleExtra = getIntent().getBundleExtra("arguments");
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            MusicMixAdapter.a aVar = MusicMixAdapter.a.BtnConfirm;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intExtra), stringExtra, musicModel, aVar, Byte.valueOf(booleanExtra ? (byte) 1 : 0), bundleExtra, stringExtra3, stringExtra2}, null, ChooseMusicFragment.f2831a, true, 26523, new Class[]{Integer.TYPE, String.class, MusicModel.class, MusicMixAdapter.a.class, Boolean.TYPE, Bundle.class, String.class, String.class}, ChooseMusicFragment.class)) {
                chooseMusicFragment = (ChooseMusicFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intExtra), stringExtra, musicModel, aVar, Byte.valueOf(booleanExtra), bundleExtra, stringExtra3, stringExtra2}, null, ChooseMusicFragment.f2831a, true, 26523, new Class[]{Integer.TYPE, String.class, MusicModel.class, MusicMixAdapter.a.class, Boolean.TYPE, Bundle.class, String.class, String.class}, ChooseMusicFragment.class);
            } else {
                chooseMusicFragment = new ChooseMusicFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", intExtra);
                bundle2.putSerializable("challenge", stringExtra);
                bundle2.putSerializable("music_model", musicModel);
                bundle2.putSerializable("music_style", aVar);
                bundle2.putBoolean("music_allow_clear", booleanExtra);
                bundle2.putString("creation_id", stringExtra2);
                bundle2.putString("shoot_way", stringExtra3);
                if (bundleExtra != null) {
                    bundle2.putAll(bundleExtra);
                }
                chooseMusicFragment.setArguments(bundle2);
            }
            beginTransaction.add((int) C0906R.id.aic, (Fragment) chooseMusicFragment).commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f35747a, false, 26444, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f35747a, false, 26444, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            setResult(-1, intent2);
            finish();
        }
    }
}
