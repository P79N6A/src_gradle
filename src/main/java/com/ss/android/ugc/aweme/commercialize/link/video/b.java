package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.model.h;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/video/DouPlusLinkContent;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "close", "Landroid/widget/ImageView;", "commerceTagCallBack", "Lcom/ss/android/ugc/aweme/commercialize/link/video/CommerceTagCallBack;", "desc", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "icon", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "bind", "", "douPlusLinkData", "Lcom/ss/android/ugc/aweme/commercialize/model/DouPlusLinkData;", "onClick", "v", "Landroid/view/View;", "view", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38986a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f38987b;

    /* renamed from: c  reason: collision with root package name */
    private DmtTextView f38988c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f38989d;

    /* renamed from: e  reason: collision with root package name */
    private a f38990e;

    @NotNull
    public final View a() {
        return this;
    }

    public final void onClick(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38986a, false, 30913, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38986a, false, 30913, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        if (this.f38990e != null) {
            a aVar = this.f38990e;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.b();
        }
    }

    public final void a(@Nullable h hVar, @NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{hVar, aVar}, this, f38986a, false, 30912, new Class[]{h.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, aVar}, this, f38986a, false, 30912, new Class[]{h.class, a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "commerceTagCallBack");
        this.f38990e = aVar;
        if (hVar == null) {
            this.f38987b.setImageResource(17170445);
            this.f38988c.setText("");
            return;
        }
        ((GenericDraweeHierarchy) this.f38987b.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
        UrlModel urlModel = hVar.avatarIcon;
        if (urlModel == null || CollectionUtils.isEmpty(urlModel.getUrlList())) {
            this.f38987b.setImageResource(17170445);
        } else {
            c.b(this.f38987b, hVar.avatarIcon);
        }
        this.f38989d.setVisibility(8);
        this.f38988c.setText(hVar.title);
    }

    @JvmOverloads
    private b(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0906R.layout.a5i, this, true);
        setPadding(u.a(5.0d), getTopPaddingOffset(), u.a(5.0d), getBottomPaddingOffset());
        setBackgroundResource(2130838054);
        setGravity(16);
        View findViewById = findViewById(C0906R.id.bca);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.link_icon)");
        this.f38987b = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(C0906R.id.bc_);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.link_desc)");
        this.f38988c = (DmtTextView) findViewById2;
        View findViewById3 = findViewById(C0906R.id.bcf);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.link_naming_close)");
        this.f38989d = (ImageView) findViewById3;
        setOnClickListener(this);
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }
}
