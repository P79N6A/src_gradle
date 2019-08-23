package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ae.c;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.b;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.presenter.d;
import com.ss.android.ugc.aweme.music.presenter.p;
import com.ss.android.ugc.aweme.music.ui.MusicListFragment;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.bytex.a.a.a;

public class MusicListActivity extends AmeSSActivity implements b, d, MusicListFragment.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56564a;

    /* renamed from: b  reason: collision with root package name */
    String f56565b;

    /* renamed from: c  reason: collision with root package name */
    String f56566c;

    /* renamed from: d  reason: collision with root package name */
    public p f56567d;

    /* renamed from: e  reason: collision with root package name */
    boolean f56568e = true;

    /* renamed from: f  reason: collision with root package name */
    public MusicListFragment f56569f;
    private int g;
    private Challenge h;
    @BindView(2131497604)
    TextTitleBar mTitleBar;

    public final void b() {
        this.f56568e = false;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f56564a, false, 60378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56564a, false, 60378, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56564a, false, 60379, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56564a, false, 60379, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56564a, false, 60375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56564a, false, 60375, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f56564a, false, 60376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56564a, false, 60376, new Class[0], Void.TYPE);
            return;
        }
        bg.b(new com.ss.android.ugc.aweme.music.a.d(null));
        c.a(this);
        super.finish();
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f56564a, false, 60372, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("music_category");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f56564a, false, 60372, new Class[0], Analysis.class);
    }

    public final void a(MusicList musicList) {
        if (PatchProxy.isSupport(new Object[]{musicList}, this, f56564a, false, 60373, new Class[]{MusicList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicList}, this, f56564a, false, 60373, new Class[]{MusicList.class}, Void.TYPE);
        } else if (musicList != null) {
            if (this.f56569f.f3625c != null) {
                if (this.f56567d.f56387d) {
                    this.f56569f.f3625c.resetLoadMoreState();
                } else {
                    this.f56569f.f3625c.showLoadMoreEmpty();
                }
            }
            if (musicList.items != null) {
                this.f56569f.a(musicList.items, 3);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f56564a, false, 60369, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f56564a, false, 60369, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cl);
        this.f56565b = getIntent().getStringExtra("mc_id");
        this.f56566c = getIntent().getStringExtra("title_name");
        this.g = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        this.h = (Challenge) getIntent().getSerializableExtra("challenge");
        if (PatchProxy.isSupport(new Object[0], this, f56564a, false, 60370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56564a, false, 60370, new Class[0], Void.TYPE);
        } else {
            this.mTitleBar.setTitle((CharSequence) this.f56566c);
            this.mTitleBar.setColorMode(0);
            ImageView imageView = (ImageView) this.mTitleBar.findViewById(C0906R.id.ix);
            if (com.bytedance.ies.dmt.ui.common.b.b()) {
                imageView.setImageDrawable(a.a(getResources(), 2130841639));
            }
            this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56570a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f56570a, false, 60380, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f56570a, false, 60380, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    MusicListActivity musicListActivity = MusicListActivity.this;
                    if (PatchProxy.isSupport(new Object[0], musicListActivity, MusicListActivity.f56564a, false, 60374, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicListActivity, MusicListActivity.f56564a, false, 60374, new Class[0], Void.TYPE);
                        return;
                    }
                    musicListActivity.finish();
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f56570a, false, 60381, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f56570a, false, 60381, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    Intent intent = new Intent(MusicListActivity.this, CrossPlatformActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("show_load_dialog", true);
                    intent.putExtra("hide_status_bar", true);
                    intent.putExtra("hide_more", true);
                    intent.putExtras(bundle);
                    intent.setData(Uri.parse("https://aweme.snssdk.com/magic/runtime/?id=845"));
                    MusicListActivity.this.startActivity(intent);
                    r.onEvent(MobClick.obtain().setEventName("upload_music").setLabelName("song_category").setValue(MusicListActivity.this.f56565b));
                }
            });
            this.mTitleBar.setColorMode(0);
            this.mTitleBar.showLine(false);
            this.f56567d = new p(this);
            this.f56569f = (MusicListFragment) getSupportFragmentManager().findFragmentById(C0906R.id.z1);
            if (this.f56569f == null) {
                this.f56569f = MusicListFragment.a(this.g, MusicMixAdapter.a.BtnConfirmAndShoot);
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.add(C0906R.id.z1, this.f56569f, "album_list_tag");
                beginTransaction.commitAllowingStateLoss();
            }
            this.f56569f.f3627e = this;
            if (!TextUtils.isEmpty(this.f56565b)) {
                this.f56567d.a(this.f56565b, 0, 30);
                this.f56569f.g = true;
                this.f56569f.i = new MusicListFragment.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56572a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f56572a, false, 60382, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f56572a, false, 60382, new Class[0], Void.TYPE);
                            return;
                        }
                        if (MusicListActivity.this.f56567d.f56387d) {
                            if (MusicListActivity.this.f56569f.f3625c != null) {
                                MusicListActivity.this.f56569f.f3625c.showLoadMoreLoading();
                            }
                            MusicListActivity.this.f56567d.a(MusicListActivity.this.f56565b);
                        }
                    }
                };
                this.f56569f.f3624b = this.f56566c;
            }
            if (PatchProxy.isSupport(new Object[0], this, f56564a, false, 60371, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f56564a, false, 60371, new Class[0], Void.TYPE);
            } else if (!"860".equals(this.f56565b) || com.ss.android.ugc.aweme.i18n.c.a()) {
                this.mTitleBar.getEndText().setVisibility(8);
            } else {
                this.mTitleBar.getEndText().setVisibility(0);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onCreate", false);
    }

    public static void a(Context context, String str, String str2, int i) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, 1}, null, f56564a, true, 60368, new Class[]{Context.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4, 1}, null, f56564a, true, 60368, new Class[]{Context.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            Intent intent = new Intent(context2, MusicListActivity.class);
            intent.putExtra("mc_id", str3);
            intent.putExtra("title_name", str4);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            context2.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{musicListFragment, str3, musicModel2, str4}, this, f56564a, false, 60377, new Class[]{MusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicListFragment, str3, musicModel2, str4}, this, f56564a, false, 60377, new Class[]{MusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str3);
        intent.putExtra("music_model", musicModel2);
        intent.putExtra("music_origin", str4);
        if (musicListFragment.k() == 0 || musicListFragment.k() == 2) {
            setResult(-1, intent);
            finish();
            return;
        }
        if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(musicModel.getMusic().getChallenge()));
        }
        intent.putExtra("shoot_way", "song_category");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) this, intent);
    }
}
