package com.ss.android.ugc.aweme.draft;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.u.aj;
import com.ss.android.ugc.b.b;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class AwemeDraftMusicHolder extends AnimatedViewHolder<c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43363a;

    /* renamed from: b  reason: collision with root package name */
    TextView f43364b;

    /* renamed from: c  reason: collision with root package name */
    TextView f43365c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43366d;

    /* renamed from: e  reason: collision with root package name */
    public Context f43367e;
    private b k;

    abstract class a implements a.h {

        /* renamed from: f  reason: collision with root package name */
        public static ChangeQuickRedirect f43376f;
        d g;
        String h;
        int i = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBeanRemainProgress(5);

        a(d dVar, String str) {
            this.g = dVar;
            this.h = str;
        }

        public final void a(String str, int i2, String str2, int i3) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), str2, Integer.valueOf(i3)}, this, f43376f, false, 38363, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), str2, Integer.valueOf(i3)}, this, f43376f, false, 38363, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            final int i4 = i3;
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43377a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f43377a, false, 38365, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f43377a, false, 38365, new Class[0], Void.TYPE);
                        return;
                    }
                    if (a.this.g != null) {
                        if (i4 > a.this.i) {
                            a.this.g.setProgress(a.this.i);
                            return;
                        }
                        a.this.g.setProgress(i4);
                    }
                }
            });
        }

        public final void a(String str, int i2, String str2, Exception exc) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), str2, exc}, this, f43376f, false, 38364, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), str2, exc}, this, f43376f, false, 38364, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE);
                return;
            }
            UIUtils.displayToast(this.g.getContext(), AwemeDraftMusicHolder.this.f43367e.getString(C0906R.string.a7h));
            AwemeDraftMusicHolder.this.dismiss(this.g);
        }

        public void a(String str, int i2, String str2, float[] fArr) {
            String str3 = str;
            int i3 = i2;
            if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), str2, fArr}, this, f43376f, false, 38362, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i2), str2, fArr}, this, f43376f, false, 38362, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE);
                return;
            }
            if (this.g != null) {
                this.g.setProgress(100);
            }
            if (i3 == 3) {
                com.ss.android.ugc.aweme.video.b.c(str3, this.h);
                AwemeDraftMusicHolder.this.dismiss(this.g);
                return;
            }
            if (i3 == 4) {
                AwemeDraftMusicHolder.this.dismiss(this.g);
            }
        }
    }

    public final void a() {
    }

    public void dismiss(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f43363a, false, 38358, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f43363a, false, 38358, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public AwemeDraftMusicHolder(View view) {
        super(view);
        if (PatchProxy.isSupport(new Object[]{view}, this, f43363a, false, 38353, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43363a, false, 38353, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f43364b = (TextView) ViewCompat.requireViewById(view, C0906R.id.df2);
            this.f43365c = (TextView) ViewCompat.requireViewById(view, C0906R.id.d8x);
        }
        this.f43367e = view.getContext();
        this.k = new b();
    }

    public final void a(final c cVar, int i) {
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f43363a, false, 38354, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f43363a, false, 38354, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
        } else if (cVar != null && cVar.f43438f != null) {
            this.g = cVar;
            if (this.f43366d) {
                this.f43365c.setVisibility(4);
            } else {
                this.f43365c.setVisibility(0);
            }
            this.f43364b.setText(cVar.f43438f.getName());
            this.f43365c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43368a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f43368a, false, 38359, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f43368a, false, 38359, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (ej.a().a(view.getContext()) && com.ss.android.ugc.aweme.port.in.a.i.a(cVar.f43438f, AwemeDraftMusicHolder.this.f43367e, true)) {
                        ej.a().a(cVar.f43438f);
                        String path = cVar.f43438f.getPath();
                        e eVar = cVar.f43438f;
                        Context context = AwemeDraftMusicHolder.this.itemView.getContext();
                        int i = cVar.m;
                        com.ss.android.ugc.aweme.util.c.a("toVideoRecord() called with: path = [" + path + "], context = [], musicModel = [" + eVar + "], start = [" + i + "]");
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        } catch (JSONException unused) {
                        }
                        r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("draft_again").setValue(eVar.getMusicId()).setJsonObject(jSONObject));
                        aj.a("draft_page");
                        AwemeDraftMusicHolder awemeDraftMusicHolder = AwemeDraftMusicHolder.this;
                        if (PatchProxy.isSupport(new Object[]{context, eVar, Integer.valueOf(i)}, awemeDraftMusicHolder, AwemeDraftMusicHolder.f43363a, false, 38355, new Class[]{Context.class, e.class, Integer.TYPE}, Void.TYPE)) {
                            AwemeDraftMusicHolder awemeDraftMusicHolder2 = awemeDraftMusicHolder;
                            PatchProxy.accessDispatch(new Object[]{context, eVar, Integer.valueOf(i)}, awemeDraftMusicHolder2, AwemeDraftMusicHolder.f43363a, false, 38355, new Class[]{Context.class, e.class, Integer.TYPE}, Void.TYPE);
                        } else if (!eVar.getPath().startsWith("http")) {
                            awemeDraftMusicHolder.a(context, null, eVar.getMusicId(), eVar.getPath(), i);
                        } else {
                            AwemeDraftMusicHolder awemeDraftMusicHolder3 = awemeDraftMusicHolder;
                            AnonymousClass2 r11 = new a(d.b(context, context.getString(C0906R.string.f4484cat)), com.ss.android.ugc.b.c.a().a(eVar.getPath()), context, eVar, i) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f43371a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ Context f43372b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ e f43373c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ int f43374d;

                                public final void a(String str, int i, String str2, float[] fArr) {
                                    String str3 = str;
                                    if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str2, fArr}, this, f43371a, false, 38360, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str2, fArr}, this, f43371a, false, 38360, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE);
                                        return;
                                    }
                                    f a2 = f.a();
                                    b bVar = new b(this, str, i, str2, fArr, this.f43372b, this.f43373c, this.f43374d);
                                    a2.a(str3, 5, (f.a) bVar);
                                }

                                {
                                    this.f43372b = r4;
                                    this.f43373c = r5;
                                    this.f43374d = r6;
                                }

                                /* access modifiers changed from: package-private */
                                public final /* synthetic */ void a(String str, int i, String str2, float[] fArr, Context context, e eVar, int i2, com.ss.android.ugc.aweme.shortvideo.f fVar) {
                                    super.a(str, i, str2, fArr);
                                    if (fVar != null) {
                                        AwemeDraftMusicHolder.this.a(context, fVar, eVar.getMusicId(), str, i2);
                                        return;
                                    }
                                    AwemeDraftMusicHolder.this.a(context, null, eVar.getMusicId(), str, i2);
                                }
                            };
                            if (PatchProxy.isSupport(new Object[]{context, eVar, r11}, awemeDraftMusicHolder3, AwemeDraftMusicHolder.f43363a, false, 38357, new Class[]{Context.class, e.class, a.class}, Void.TYPE)) {
                                AwemeDraftMusicHolder awemeDraftMusicHolder4 = awemeDraftMusicHolder;
                                PatchProxy.accessDispatch(new Object[]{context, eVar, r11}, awemeDraftMusicHolder4, AwemeDraftMusicHolder.f43363a, false, 38357, new Class[]{Context.class, e.class, a.class}, Void.TYPE);
                            } else if (context == null || eVar.getMusicStatus() != 0) {
                                com.ss.android.ugc.aweme.port.in.a.i.a(eVar, (a.h) r11);
                            } else {
                                String offlineDesc = eVar.getOfflineDesc();
                                if (TextUtils.isEmpty(offlineDesc)) {
                                    offlineDesc = context.getApplicationContext().getString(C0906R.string.bel);
                                }
                                UIUtils.displayToast(context, offlineDesc);
                            }
                        }
                    }
                }
            });
        }
    }

    public final void a(Context context, com.ss.android.ugc.aweme.shortvideo.f fVar, String str, String str2, int i) {
        Context context2 = context;
        com.ss.android.ugc.aweme.shortvideo.f fVar2 = fVar;
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, fVar2, str3, str4, Integer.valueOf(i)}, this, f43363a, false, 38356, new Class[]{Context.class, com.ss.android.ugc.aweme.shortvideo.f.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, fVar2, str3, str4, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f43363a, false, 38356, new Class[]{Context.class, com.ss.android.ugc.aweme.shortvideo.f.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        String uuid = UUID.randomUUID().toString();
        r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", uuid).a("shoot_way", "draft_again").a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0).a("music_id", str3).f34114b);
        com.ss.android.ugc.aweme.util.c.a("toVideoActivity() called with: context = [ ], path = [" + str4 + "], musicStart = [" + i2 + "]");
        Intent intent = new Intent();
        intent.putExtra("path", str4);
        intent.putExtra("music_start", i2);
        intent.putExtra("record_from", 1);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", "draft_again");
        intent.putExtra("creation_id", uuid);
        if (fVar2 != null) {
            intent.putExtra("music_wave_data", fVar2);
        }
        ej.a().c();
        intent.setClass(context2, VideoRecordPermissionActivity.class);
        context2.startActivity(intent);
    }
}
