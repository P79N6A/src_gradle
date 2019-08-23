package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.ui.MusicListFragment;
import com.ss.android.ugc.aweme.music.util.d;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public class LocalMusicActivity extends AmeSSActivity implements MusicListFragment.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56447a;

    /* renamed from: b  reason: collision with root package name */
    String f56448b;

    /* renamed from: c  reason: collision with root package name */
    MusicListFragment f56449c;

    /* renamed from: d  reason: collision with root package name */
    public int f56450d;
    @BindView(2131497604)
    TextTitleBar mTitleBar;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f56447a, false, 60142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56447a, false, 60142, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.LocalMusicActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.LocalMusicActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56447a, false, 60143, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56447a, false, 60143, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.LocalMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f56447a, false, 60138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56447a, false, 60138, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public final void a(List<MusicModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f56447a, false, 60140, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f56447a, false, 60140, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.f56449c != null) {
            if (CollectionUtils.isEmpty(list)) {
                this.f56449c.a(getString(C0906R.string.bhh));
            }
            this.f56449c.b(list, 5);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f56447a, false, 60136, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f56447a, false, 60136, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.LocalMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cl);
        b.a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new b.C0400b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56451a;

            public final void a(String[] strArr, int[] iArr) {
                if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f56451a, false, 60144, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f56451a, false, 60144, new Class[]{String[].class, int[].class}, Void.TYPE);
                    return;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    LocalMusicActivity.this.f56448b = LocalMusicActivity.this.getIntent().getStringExtra("mc_name");
                    LocalMusicActivity.this.f56450d = LocalMusicActivity.this.getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
                    LocalMusicActivity localMusicActivity = LocalMusicActivity.this;
                    if (PatchProxy.isSupport(new Object[0], localMusicActivity, LocalMusicActivity.f56447a, false, 60137, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], localMusicActivity, LocalMusicActivity.f56447a, false, 60137, new Class[0], Void.TYPE);
                    } else {
                        localMusicActivity.f56449c = (MusicListFragment) localMusicActivity.getSupportFragmentManager().findFragmentById(C0906R.id.z1);
                        localMusicActivity.mTitleBar.setTitle((CharSequence) localMusicActivity.f56448b);
                        localMusicActivity.mTitleBar.getEndText().setVisibility(8);
                        localMusicActivity.mTitleBar.setColorMode(0);
                        localMusicActivity.mTitleBar.setOnTitleBarClickListener(new a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f56453a;

                            public final void b(View view) {
                            }

                            public final void a(View view) {
                                if (PatchProxy.isSupport(new Object[]{view}, this, f56453a, false, 60145, new Class[]{View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view}, this, f56453a, false, 60145, new Class[]{View.class}, Void.TYPE);
                                    return;
                                }
                                LocalMusicActivity.this.finish();
                            }
                        });
                        if (localMusicActivity.f56449c == null) {
                            localMusicActivity.f56449c = MusicListFragment.a(localMusicActivity.f56450d, (MusicMixAdapter.a) null);
                            FragmentTransaction beginTransaction = localMusicActivity.getSupportFragmentManager().beginTransaction();
                            beginTransaction.add((int) C0906R.id.z1, (Fragment) localMusicActivity.f56449c);
                            beginTransaction.commitAllowingStateLoss();
                        }
                        localMusicActivity.f56449c.f3627e = localMusicActivity;
                    }
                    LocalMusicActivity localMusicActivity2 = LocalMusicActivity.this;
                    if (PatchProxy.isSupport(new Object[0], localMusicActivity2, LocalMusicActivity.f56447a, false, 60141, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], localMusicActivity2, LocalMusicActivity.f56447a, false, 60141, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.b.a.a.a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f56455a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f56455a, false, 60146, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f56455a, false, 60146, new Class[0], Void.TYPE);
                                    return;
                                }
                                final ArrayList arrayList = new ArrayList();
                                d.a((Context) LocalMusicActivity.this, (List<MusicModel>) arrayList);
                                com.ss.android.b.a.a.a.b(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f56457a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f56457a, false, 60147, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f56457a, false, 60147, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        LocalMusicActivity.this.a(arrayList);
                                    }
                                });
                            }
                        });
                    }
                } else {
                    LocalMusicActivity.this.finish();
                }
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.LocalMusicActivity", "onCreate", false);
    }

    public final void a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{musicListFragment, str3, musicModel, str4}, this, f56447a, false, 60139, new Class[]{MusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE)) {
            Object[] objArr = {musicListFragment, str3, musicModel, str4};
            PatchProxy.accessDispatch(objArr, this, f56447a, false, 60139, new Class[]{MusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(musicModel.getMusic().getChallenge()));
        }
        Intent intent = new Intent();
        intent.putExtra("path", str3);
        intent.putExtra("shoot_way", "song_category");
        intent.putExtra("music_origin", str4);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) this, intent);
    }
}
