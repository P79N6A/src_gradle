package com.ss.android.ugc.aweme.discover.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/activity/MusicianMusicListActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "attachFragment", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicianMusicListActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41518a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f41519b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/activity/MusicianMusicListActivity$Companion;", "", "()V", "TAG_CONTAINER", "", "start", "", "context", "Landroid/content/Context;", "author", "cardDetailPosition", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41520a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f41518a, false, 35464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41518a, false, 35464, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).fitsSystemWindows(true).statusBarDarkFont(com.ss.android.g.a.b()).init();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        MusicianMusicListFragment musicianMusicListFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f41518a, false, 35462, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f41518a, false, 35462, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.f4505cn);
        if (PatchProxy.isSupport(new Object[0], this, f41518a, false, 35463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41518a, false, 35463, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("param_music_author");
            if (stringExtra != null) {
                int intExtra = getIntent().getIntExtra("param_holder_postion", 0);
                MusicianMusicListFragment.c cVar = MusicianMusicListFragment.f42942e;
                if (PatchProxy.isSupport(new Object[]{stringExtra, Integer.valueOf(intExtra)}, cVar, MusicianMusicListFragment.c.f42946a, false, 37756, new Class[]{String.class, Integer.TYPE}, MusicianMusicListFragment.class)) {
                    MusicianMusicListFragment.c cVar2 = cVar;
                    musicianMusicListFragment = (MusicianMusicListFragment) PatchProxy.accessDispatch(new Object[]{stringExtra, Integer.valueOf(intExtra)}, cVar2, MusicianMusicListFragment.c.f42946a, false, 37756, new Class[]{String.class, Integer.TYPE}, MusicianMusicListFragment.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(stringExtra, "author");
                    MusicianMusicListFragment musicianMusicListFragment2 = new MusicianMusicListFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("param_music_author", stringExtra);
                    bundle2.putInt("param_holder_postion", intExtra);
                    musicianMusicListFragment2.setArguments(bundle2);
                    musicianMusicListFragment = musicianMusicListFragment2;
                }
                getSupportFragmentManager().beginTransaction().replace(C0906R.id.aic, musicianMusicListFragment, "container").commitAllowingStateLoss();
            }
        }
    }
}
