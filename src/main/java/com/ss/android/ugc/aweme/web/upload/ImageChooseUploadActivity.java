package com.ss.android.ugc.aweme.web.upload;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import com.ss.android.ugc.aweme.web.upload.ImageChooseAdapter;
import java.util.List;
import java.util.Map;

public class ImageChooseUploadActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76884a;
    public static a h;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f76885b;

    /* renamed from: c  reason: collision with root package name */
    DmtTextView f76886c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressBar f76887d;

    /* renamed from: e  reason: collision with root package name */
    public DmtTextView f76888e;

    /* renamed from: f  reason: collision with root package name */
    public ImageChooseAdapter f76889f;
    List<String> g;
    public ImageChooseAdapter.b i = new c(this);
    public ImageChooseAdapter.a j = new d(this);
    private DmtTextView k;
    private Boolean l = Boolean.TRUE;
    private int m = 1;
    private final int n = 4;
    private String o = "";

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f76884a, false, 90110, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76884a, false, 90110, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.web.upload.ImageChooseUploadActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.web.upload.ImageChooseUploadActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76884a, false, 90111, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76884a, false, 90111, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.web.upload.ImageChooseUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f76884a, false, 90109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76884a, false, 90109, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        a("cancel_image_choose");
        if (h != null) {
            h.a();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f76884a, false, 90108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76884a, false, 90108, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (h != null) {
            h.b();
        }
        h = null;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76884a, false, 90107, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f76884a, false, 90107, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a(str2, (Map) new d().a("enter_from", this.o).f34114b);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f76884a, false, 90104, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f76884a, false, 90104, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.web.upload.ImageChooseUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bc);
        this.f76885b = (RecyclerView) findViewById(C0906R.id.cio);
        this.f76885b.setLayoutManager(new WrapGridLayoutManager(null, 4));
        this.f76885b.addItemDecoration(new GridSpacingItemDecoration(4, (int) UIUtils.dip2Px(this, 1.0f), false));
        this.f76887d = (ProgressBar) findViewById(C0906R.id.bwy);
        this.f76888e = (DmtTextView) findViewById(C0906R.id.dff);
        this.f76886c = (DmtTextView) findViewById(C0906R.id.dk4);
        this.k = (DmtTextView) findViewById(C0906R.id.d9v);
        this.k.setOnClickListener(new e(this));
        this.f76886c.setOnClickListener(new f(this));
        if (getIntent().hasExtra("shouldWithCamera")) {
            this.l = Boolean.valueOf(getIntent().getBooleanExtra("shouldWithCamera", true));
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.m = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from")) {
            this.o = getIntent().getStringExtra("enter_from");
        }
        ImageChooseAdapter imageChooseAdapter = new ImageChooseAdapter(this, 4, this.m, this.l, 1.0d, 1.5f, 0);
        this.f76889f = imageChooseAdapter;
        if (PatchProxy.isSupport(new Object[0], this, f76884a, false, 90105, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76884a, false, 90105, new Class[0], Void.TYPE);
        } else {
            this.f76887d.setVisibility(0);
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76890a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f76890a, false, 90118, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f76890a, false, 90118, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.b.a.a.a.b(new i(this, ((IAVService) ServiceManager.get().getService(IAVService.class)).getMediaLoaderImages(ImageChooseUploadActivity.this)));
                }
            });
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.web.upload.ImageChooseUploadActivity", "onCreate", false);
    }
}
