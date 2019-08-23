package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.presenter.f;
import com.ss.android.ugc.aweme.profile.ui.widget.StatedButton;

public class ProfileCoverPreviewActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62115a;

    /* renamed from: b  reason: collision with root package name */
    private UrlModel f62116b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62117c;

    /* renamed from: d  reason: collision with root package name */
    private f f62118d;
    @BindView(2131497827)
    TextView mChangeBtn;
    @BindView(2131494996)
    RemoteImageView mCoverImage;
    @BindView(2131495013)
    StatedButton mDownloadBtn;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f62115a, false, 68649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62115a, false, 68649, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62115a, false, 68650, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62115a, false, 68650, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a() throws Exception {
        a.a((Context) this, (int) C0906R.string.c1f).a();
        this.mDownloadBtn.f63106d = false;
        return null;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f62115a, false, 68648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62115a, false, 68648, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(C0906R.anim.bq, C0906R.anim.br);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62115a, false, 68643, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62115a, false, 68643, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.f62118d != null) {
            this.f62118d.a(bundle);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62115a, false, 68642, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62115a, false, 68642, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.dc);
        ButterKnife.bind((Activity) this);
        overridePendingTransition(C0906R.anim.bq, C0906R.anim.br);
        if (PatchProxy.isSupport(new Object[0], this, f62115a, false, 68645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62115a, false, 68645, new Class[0], Void.TYPE);
        } else {
            this.f62116b = (UrlModel) getIntent().getSerializableExtra("header_cover_url");
            this.f62117c = getIntent().getBooleanExtra("is_self", false);
            TextView textView = this.mChangeBtn;
            if (this.f62117c) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            c.b(this.mCoverImage, this.f62116b);
        }
        this.f62118d = new f(this, null, true);
        this.f62118d.b(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onCreate", false);
    }

    @OnClick({2131494996, 2131497827, 2131495013})
    public void onViewClicked(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62115a, false, 68646, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62115a, false, 68646, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.b08) {
            finish();
        } else if (id == C0906R.id.d_3) {
            this.f62118d.a();
        } else {
            if (id == C0906R.id.b0q) {
                String a2 = c.a(this.f62116b);
                if (!TextUtils.isEmpty(a2)) {
                    if (PatchProxy.isSupport(new Object[]{a2}, this, f62115a, false, 68647, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{a2}, this, f62115a, false, 68647, new Class[]{String.class}, Void.TYPE);
                    } else {
                        b.a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new bz(this, a2));
                    }
                } else {
                    a.b((Context) this, (int) C0906R.string.c17).a();
                }
            }
        }
    }

    public static void a(Context context, UrlModel urlModel, boolean z) {
        Context context2 = context;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{context2, urlModel2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f62115a, true, 68641, new Class[]{Context.class, UrlModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, urlModel2, Byte.valueOf(z)}, null, f62115a, true, 68641, new Class[]{Context.class, UrlModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, ProfileCoverPreviewActivity.class);
        intent.putExtra("header_cover_url", urlModel2);
        intent.putExtra("is_self", z);
        context2.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f62115a, false, 68644, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f62115a, false, 68644, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.f62118d.a(i, i2, intent2);
    }
}
