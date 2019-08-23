package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.Space;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.widget.b.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.shortvideo.fragment.OnlineMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ey;

public class OnlineMusicFragmentActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70517a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f70518b = ey.a((Context) k.a());

    /* renamed from: c  reason: collision with root package name */
    public TextView f70519c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f70520d;

    /* renamed from: e  reason: collision with root package name */
    Space f70521e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPagerBottomSheetBehavior f70522f;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f70517a, false, 80263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70517a, false, 80263, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.OnlineMusicFragmentActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.OnlineMusicFragmentActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70517a, false, 80264, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70517a, false, 80264, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.OnlineMusicFragmentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f70517a, false, 80258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70517a, false, 80258, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        KeyboardUtils.c(this.f70519c);
        overridePendingTransition(0, C0906R.anim.br);
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f70517a, false, 80257, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("music_homepage");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f70517a, false, 80257, new Class[0], Analysis.class);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f70517a, false, 80260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70517a, false, 80260, new Class[0], Void.TYPE);
        } else if (this.f70522f != null) {
            this.f70522f.b(5);
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f70517a, false, 80256, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f70517a, false, 80256, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.OnlineMusicFragmentActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(C0906R.anim.r, 0);
        setContentView((int) C0906R.layout.em);
        this.f70519c = (TextView) findViewById(C0906R.id.dkk);
        this.f70519c.setText(getIntent().getStringExtra(PushConstants.TITLE));
        findViewById(C0906R.id.d9e).setOnClickListener(a.a(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70523a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f70523a, false, 80266, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f70523a, false, 80266, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                KeyboardUtils.c(OnlineMusicFragmentActivity.this.f70519c);
                OnlineMusicFragmentActivity.this.finish();
            }
        }));
        int i = 8;
        findViewById(C0906R.id.d9e).setVisibility(8);
        if (PatchProxy.isSupport(new Object[0], this, f70517a, false, 80261, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70517a, false, 80261, new Class[0], Void.TYPE);
        } else {
            AbTestModel d2 = AbTestManager.a().d();
            this.f70520d = (TextView) findViewById(C0906R.id.de7);
            TextView textView = this.f70520d;
            if (d2.isShowLocalSong) {
                i = 0;
            }
            textView.setVisibility(i);
            this.f70520d.setOnClickListener(a.a(new q(this)));
        }
        this.f70521e = (Space) findViewById(C0906R.id.css);
        this.f70521e.setMinimumHeight(p.c());
        this.f70522f = ViewPagerBottomSheetBehavior.a(findViewById(C0906R.id.a3z));
        this.f70522f.l = new ViewPagerBottomSheetBehavior.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70525a;

            public final void a(@NonNull View view, float f2) {
            }

            public final void a(@NonNull View view, int i) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f70525a, false, 80267, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f70525a, false, 80267, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 5) {
                    OnlineMusicFragmentActivity.this.finish();
                }
            }
        };
        this.f70522f.f34776e = true;
        this.f70522f.a(p.a(this) + p.d(this));
        this.f70522f.f34777f = true;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (((OnlineMusicFragment) supportFragmentManager.findFragmentById(C0906R.id.aic)) == null) {
            supportFragmentManager.beginTransaction().add((int) C0906R.id.aic, (Fragment) OnlineMusicFragment.a(getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0), getIntent().getStringExtra("challenge"), (MusicModel) getIntent().getSerializableExtra("music_model"), MusicMixAdapter.a.BtnConfirm, getIntent().getBooleanExtra("music_allow_clear", false), getIntent().getBundleExtra("arguments"), getIntent().getStringExtra("enter_from"))).commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.OnlineMusicFragmentActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f70517a, false, 80259, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f70517a, false, 80259, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            setResult(-1, intent2);
            finish();
        }
    }

    public static void a(Fragment fragment, int i, String str, int i2, MusicModel musicModel, boolean z, @Nullable Bundle bundle) {
        Fragment fragment2 = fragment;
        String str2 = str;
        MusicModel musicModel2 = musicModel;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{fragment2, Integer.valueOf(i), str2, Integer.valueOf(i2), musicModel2, Byte.valueOf(z ? (byte) 1 : 0), bundle2}, null, f70517a, true, 80254, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE, MusicModel.class, Boolean.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, Integer.valueOf(i), str2, Integer.valueOf(i2), musicModel2, Byte.valueOf(z), bundle2}, null, f70517a, true, 80254, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE, MusicModel.class, Boolean.TYPE, Bundle.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(fragment.getActivity(), OnlineMusicFragmentActivity.class);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getChallenges().size() > 0) {
            intent.putExtra("challenge", ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getChallenges().get(0).cid);
        }
        intent.putExtra(PushConstants.TITLE, str2);
        intent.putExtra("music_model", musicModel2);
        intent.putExtra("music_allow_clear", z);
        if (bundle2 != null) {
            intent.putExtra("arguments", bundle2);
        }
        fragment2.startActivityForResult(intent, i);
    }
}
