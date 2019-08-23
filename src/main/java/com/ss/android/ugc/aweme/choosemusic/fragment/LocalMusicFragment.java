package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.choosemusic.b.a;
import com.ss.android.ugc.aweme.choosemusic.d.o;
import com.ss.android.ugc.aweme.choosemusic.view.h;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;

public class LocalMusicFragment extends BaseMusicListFragment implements a<MusicModel> {
    public static ChangeQuickRedirect i;
    private o j;

    public final /* bridge */ /* synthetic */ void a(Object obj, int i2) {
    }

    public final String b() {
        return "local_music_list_data";
    }

    public final String c() {
        return "local_music_list_status";
    }

    public final String d() {
        return null;
    }

    public final int k() {
        return 5;
    }

    public final String l() {
        return "";
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26596, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = new o(this.f2830f);
        f();
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26599, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a(new WeakReference(getActivity()));
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26600, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26597, new Class[0], Void.TYPE);
        } else if (getActivity() != null) {
            if (ContextCompat.checkSelfPermission(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || this.j == null) {
                b.a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new g(this));
                return;
            }
            this.j.a(new WeakReference(getActivity()));
        }
    }

    public final c b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 26598, new Class[]{View.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 26598, new Class[]{View.class}, c.class);
        }
        h hVar = new h(getContext(), view, this, C0906R.string.bhh, null, null, this.h);
        hVar.a((int) C0906R.string.bf1);
        hVar.a((com.ss.android.ugc.aweme.choosemusic.b.b) this);
        hVar.a(new com.ss.android.ugc.aweme.choosemusic.a("change_music_page_detail", "local_music", "click_button", com.ss.android.ugc.aweme.choosemusic.f.c.a()));
        return hVar;
    }

    public final void a(String str, MusicModel musicModel, String str2, Activity activity) {
        String str3;
        String str4;
        String str5 = str;
        MusicModel musicModel2 = musicModel;
        String str6 = str2;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{str5, musicModel2, str6, activity2}, this, i, false, 26601, new Class[]{String.class, MusicModel.class, String.class, Activity.class}, Void.TYPE)) {
            Object[] objArr = {str5, musicModel2, str6, activity2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, i, false, 26601, new Class[]{String.class, MusicModel.class, String.class, Activity.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str5);
        intent.putExtra("music_model", musicModel2);
        intent.putExtra("music_origin", str6);
        if (musicModel2 == null) {
            str3 = "";
        } else {
            str3 = musicModel.getName();
        }
        intent.putExtra("local_music_name", str3);
        if (musicModel2 == null) {
            str4 = "";
        } else {
            str4 = musicModel.getPath();
        }
        intent.putExtra("local_music_path", str4);
        activity2.setResult(-1, intent);
        activity.finish();
    }
}
