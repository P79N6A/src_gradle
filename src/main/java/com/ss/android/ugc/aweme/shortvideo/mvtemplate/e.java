package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import a.g;
import a.i;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.x.a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68712a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68713b;

    /* renamed from: c  reason: collision with root package name */
    private final a f68714c;

    e(a aVar, a aVar2) {
        this.f68713b = aVar;
        this.f68714c = aVar2;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f68712a, false, 77860, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f68712a, false, 77860, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f68713b;
        a aVar2 = this.f68714c;
        if (aVar.f68478e != null) {
            aVar.f68478e.dismiss();
        }
        if (PatchProxy.isSupport(new Object[]{aVar2}, aVar, a.f68474a, false, 77844, new Class[]{a.class}, Void.TYPE)) {
            Object[] objArr = {aVar2};
            a aVar3 = aVar;
            ChangeQuickRedirect changeQuickRedirect = a.f68474a;
            PatchProxy.accessDispatch(objArr, aVar3, changeQuickRedirect, false, 77844, new Class[]{a.class}, Void.TYPE);
        } else {
            Intent intent = new Intent();
            if (aVar.f68476c != null) {
                aVar2.musicIds = aVar.f68476c.b();
            }
            if (aVar.f68476c != null && !TextUtils.isEmpty(aVar.f68476c.a())) {
                j jVar = new j();
                jVar.mvThemeId = aVar.f68476c.a();
                intent.putExtra("av_upload_struct", jVar);
                if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) aVar.f68476c.b())) {
                    intent.putExtra("first_sticker_music_ids", new Gson().toJson((Object) aVar.f68476c.b()));
                }
                aVar2.mvResUnzipPath = aVar.f68476c.e();
            }
            String a2 = b.a("contact_video");
            aVar2.contactVideoPath = a2 + File.separator + b.b(".mp4");
            intent.putExtra("key_mv_theme_data", aVar2);
            intent.putExtra("key_mv_theme_enter", true);
            if (aVar.f68477d != null) {
                List a3 = GoNextFactoryFactory.a((ArrayList<TimeSpeedModelExtension>) aVar.f68477d.m, aVar.f68477d.K);
                if (aVar.j != null) {
                    if (a3 == null) {
                        a3 = new ArrayList();
                    }
                    a3.add(aVar.j);
                }
                intent.putExtra("challenge", (Serializable) a3);
                intent.putExtra("shoot_way", aVar.f68477d.r);
                intent.putExtra("creation_id", aVar.f68477d.q);
                intent.putExtra("shoot_mode", aVar.f68477d.N);
                intent.putExtra("draft_id", aVar.f68477d.v);
                intent.putExtra("origin", 1);
                intent.putExtra("content_type", "mv");
                intent.putExtra("content_source", "upload");
            }
            intent.putExtra("poi_struct_in_tools_line", aVar.f68477d.D);
            intent.putExtra("commerce_data_in_tools_line", aVar.f68477d.ah);
            VEVideoPublishEditActivity.a((Context) aVar.f68475b, intent, 1);
        }
        return null;
    }
}
