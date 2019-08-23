package com.ss.android.ugc.aweme.commercialize.link.micro;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.eh;

public final class a extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38976a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.link.video.a f38977b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f38978c;

    /* renamed from: d  reason: collision with root package name */
    private DmtTextView f38979d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f38980e;

    /* renamed from: f  reason: collision with root package name */
    private View f38981f;

    public final void setCommerceTagCallBack(com.ss.android.ugc.aweme.commercialize.link.video.a aVar) {
        this.f38977b = aVar;
    }

    a(Context context) {
        this(context, null);
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38976a, false, 30899, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38976a, false, 30899, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.f38977b != null) {
            this.f38977b.b();
        }
    }

    private a(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(f fVar, com.ss.android.ugc.aweme.commercialize.link.video.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{fVar, aVar}, this, f38976a, false, 30897, new Class[]{f.class, com.ss.android.ugc.aweme.commercialize.link.video.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, aVar}, this, f38976a, false, 30897, new Class[]{f.class, com.ss.android.ugc.aweme.commercialize.link.video.a.class}, Void.TYPE);
        } else if (fVar == null) {
            this.f38978c.setImageResource(17170445);
            this.f38979d.setText("");
        } else {
            this.f38977b = aVar;
            ((GenericDraweeHierarchy) this.f38978c.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
            int type = fVar.getType();
            if (type == 1) {
                this.f38978c.setImageURI(new Uri.Builder().scheme("res").path("2130839686").build());
            } else if (type == 2) {
                this.f38978c.setImageURI(new Uri.Builder().scheme("res").path("2130839690").build());
            }
            if (TextUtils.isEmpty(fVar.getTitle())) {
                str = fVar.getName();
            } else {
                str = fVar.getTitle();
            }
            String a2 = eh.a(this.f38979d.getPaint(), 200.0f, str);
            this.f38979d.setText(a2);
            if (AbTestManager.a().cl()) {
                this.f38980e.setVisibility(0);
                this.f38981f.setVisibility(8);
                eh.a(this.f38980e, a2.endsWith("…"));
                return;
            }
            this.f38980e.setVisibility(8);
            this.f38981f.setVisibility(0);
        }
    }

    private a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a63, this, true);
        setPadding(u.a(5.0d), getTopPaddingOffset(), u.a(4.0d), getBottomPaddingOffset());
        setBackgroundResource(2130838054);
        setGravity(16);
        this.f38978c = (RemoteImageView) findViewById(C0906R.id.bca);
        this.f38979d = (DmtTextView) findViewById(C0906R.id.bc_);
        this.f38980e = (ImageView) findViewById(C0906R.id.b4i);
        this.f38981f = findViewById(C0906R.id.byf);
        setOnClickListener(this);
    }
}
