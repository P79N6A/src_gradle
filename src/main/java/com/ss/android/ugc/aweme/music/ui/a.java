package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;

public final class a extends p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56652a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<Integer> f56653b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private Toast f56654c;

    public final void a(MusicModel musicModel) {
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f56652a, false, 60096, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56652a, false, 60096, new Class[0], Void.TYPE);
            return;
        }
        Downloader instance = Downloader.getInstance(this.g.h());
        if (!CollectionUtils.isEmpty(this.f56653b)) {
            Iterator<Integer> it2 = this.f56653b.iterator();
            while (it2.hasNext()) {
                Integer next = it2.next();
                if (next != null) {
                    instance.cancel(next.intValue());
                }
            }
        }
        super.d();
    }

    public a(c cVar) {
        super(cVar);
    }

    public final boolean a(MusicModel musicModel, Context context) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{musicModel, context}, this, f56652a, false, 60092, new Class[]{MusicModel.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{musicModel, context}, this, f56652a, false, 60092, new Class[]{MusicModel.class, Context.class}, Boolean.TYPE)).booleanValue();
        } else if (musicModel == null || !TextUtils.isEmpty(musicModel.getPath())) {
            try {
                z = g.b().w().booleanValue();
            } catch (com.bytedance.ies.a unused) {
                z = false;
            }
            if ((!z || musicModel == null || musicModel.getMusicType() != MusicModel.MusicType.BAIDU) && (musicModel == null || musicModel.getMusicStatus() != 0)) {
                return true;
            }
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context.getString(C0906R.string.bel);
            }
            a(context, offlineDesc, 0);
            return false;
        } else {
            a(context, context.getString(C0906R.string.beo), 0);
            return false;
        }
    }

    private void a(Context context, String str, int i) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, 0}, this, f56652a, false, 60093, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, 0}, this, f56652a, false, 60093, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f56654c != null) {
            this.f56654c.cancel();
        }
        this.f56654c = Toast.makeText(context, str2, 0);
        if (this.f56654c != null) {
            this.f56654c.setGravity(17, 0, 0);
            b.a(this.f56654c);
        }
    }
}
