package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ListAdapter;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.livewallpaper.a;
import com.ss.android.ugc.aweme.livewallpaper.c.c;
import com.ss.android.ugc.aweme.livewallpaper.c.e;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.profile.ui.ag;
import java.util.ArrayList;
import java.util.Map;

public class LiveWallPaperPreviewActivity extends AmeSSActivity implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53701a;

    /* renamed from: b  reason: collision with root package name */
    public LiveWallPaperBean f53702b;

    /* renamed from: c  reason: collision with root package name */
    private a f53703c;
    @BindView(2131497065)
    SurfaceView mPreviewSurface;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53701a, false, 56235, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53701a, false, 56235, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53701a, false, 56236, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53701a, false, 56236, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53701a, false, 56230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53701a, false, 56230, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        c.a().a("paper_set");
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f53701a, false, 56226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53701a, false, 56226, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    @OnClick({2131495097})
    public void onClickMore() {
        if (PatchProxy.isSupport(new Object[0], this, f53701a, false, 56234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53701a, false, 56234, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ag.a(getResources().getString(C0906R.string.a4f), false));
        arrayList.add(new ag.a(getResources().getString(C0906R.string.pm), false));
        final ag agVar = new ag(this, arrayList);
        aVar.a((ListAdapter) agVar, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53706a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                String str;
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53706a, false, 56238, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53706a, false, 56238, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dialogInterface.dismiss();
                ag agVar = agVar;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, agVar, ag.f62453a, false, 68133, new Class[]{Integer.TYPE}, String.class)) {
                    Object[] objArr = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect = ag.f62453a;
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    str = (String) PatchProxy.accessDispatch(objArr, agVar, changeQuickRedirect2, false, 68133, new Class[]{Integer.TYPE}, String.class);
                } else {
                    str = (String) agVar.f62454b.get(i);
                }
                if (LiveWallPaperPreviewActivity.this.getResources().getString(C0906R.string.a4f).equals(str)) {
                    new a.C0185a(LiveWallPaperPreviewActivity.this).b(LiveWallPaperPreviewActivity.this.getResources().getString(C0906R.string.a4n)).a(LiveWallPaperPreviewActivity.this.getResources().getString(C0906R.string.a0v), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f53709a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53709a, false, 56239, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53709a, false, 56239, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            c.a().b(LiveWallPaperPreviewActivity.this.f53702b.getId());
                            LiveWallPaperPreviewActivity.this.finish();
                        }
                    }).b(LiveWallPaperPreviewActivity.this.getResources().getString(C0906R.string.pm), (DialogInterface.OnClickListener) null).a().a();
                }
            }
        });
        try {
            aVar.b();
        } catch (Resources.NotFoundException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    @OnClick({2131498134})
    public void setLiveWallPaper() {
        if (PatchProxy.isSupport(new Object[0], this, f53701a, false, 56232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53701a, false, 56232, new Class[0], Void.TYPE);
        } else if (!e.a((Activity) this, this.f53702b.getId())) {
            c.a().a("paper_set", new c.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53704a;

                public final void a(boolean z, String str) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f53704a, false, 56237, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f53704a, false, 56237, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    if (z) {
                        com.bytedance.ies.dmt.ui.d.a.a(LiveWallPaperPreviewActivity.this.getApplicationContext(), (int) C0906R.string.c4j).a();
                        e.a(0, "");
                        LiveWallPaperPreviewActivity.this.finish();
                    } else {
                        e.a(1, str);
                    }
                    e.a(LiveWallPaperPreviewActivity.this.f53702b.getId(), "paper_set", z);
                }
            });
            this.f53702b.setSource("paper_set");
            c a2 = c.a();
            LiveWallPaperBean liveWallPaperBean = this.f53702b;
            if (PatchProxy.isSupport(new Object[]{liveWallPaperBean}, a2, c.f53673a, false, 56267, new Class[]{LiveWallPaperBean.class}, Void.TYPE)) {
                c cVar = a2;
                PatchProxy.accessDispatch(new Object[]{liveWallPaperBean}, cVar, c.f53673a, false, 56267, new Class[]{LiveWallPaperBean.class}, Void.TYPE);
            } else {
                a2.f53674b.setId(liveWallPaperBean.getId());
                a2.f53674b.setThumbnailPath(liveWallPaperBean.getThumbnailPath());
                a2.f53674b.setVideoPath(liveWallPaperBean.getVideoPath());
                a2.f53674b.setWidth(liveWallPaperBean.getWidth());
                a2.f53674b.setHeight(liveWallPaperBean.getHeight());
                a2.f53674b.setSource(liveWallPaperBean.getSource());
            }
            c.a().a((Activity) this);
            String id = this.f53702b.getId();
            if (PatchProxy.isSupport(new Object[]{id}, null, e.f53685a, true, 56272, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{id}, null, e.f53685a, true, 56272, new Class[]{String.class}, Void.TYPE);
            } else if (com.ss.android.g.a.a()) {
                r.a("wall_paper_click", (Map) d.a().a("group_id", id).a("enter_from", "paper_set").f34114b);
            } else {
                r.onEvent(MobClick.obtain().setEventName("wall_paper_click").setLabelName("set_wall_paper").setValue(id));
            }
        }
    }

    @OnClick({2131493213})
    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f53701a, false, 56231, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f53701a, false, 56231, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder surfaceHolder2 = surfaceHolder;
        if (PatchProxy.isSupport(new Object[]{surfaceHolder2}, this, f53701a, false, 56229, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder2}, this, f53701a, false, 56229, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        this.f53703c.a(surfaceHolder2);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f53701a, false, 56227, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f53701a, false, 56227, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        this.f53703c.a(surfaceHolder, this.f53702b.getVideoPath(), this.f53702b.getWidth(), this.f53702b.getHeight(), true);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53701a, false, 56225, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53701a, false, 56225, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f53702b = (LiveWallPaperBean) getIntent().getParcelableExtra("live_wall_paper");
        if (this.f53702b == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
            return;
        }
        setContentView((int) C0906R.layout.c7);
        b.a(findViewById(C0906R.id.cv0));
        this.mPreviewSurface.getHolder().addCallback(this);
        this.f53703c = new com.ss.android.ugc.aweme.livewallpaper.a(null);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f53701a, false, 56233, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f53701a, false, 56233, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 100 && e.a((Context) this, getPackageName())) {
            com.bytedance.ies.dmt.ui.d.a.a(getApplicationContext(), (int) C0906R.string.c4j).a();
            e.a(this.f53702b.getId(), "paper_set", true);
            e.a(0, "");
            finish();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder surfaceHolder2 = surfaceHolder;
        if (PatchProxy.isSupport(new Object[]{surfaceHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53701a, false, 56228, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53701a, false, 56228, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f53703c.a(surfaceHolder2, i, i2, i3);
    }
}
