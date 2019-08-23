package com.ss.android.ugc.aweme.effect;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.utils.ad;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0018\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/effect/EffectListItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "fromMe", "", "(Landroid/view/View;Z)V", "mContext", "Landroid/content/Context;", "mFromMe", "mIvEffect", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getMIvEffect", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "setMIvEffect", "(Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;)V", "mSticker", "Lcom/ss/android/ugc/aweme/feed/model/NewFaceSticker;", "mTvEffectDesc", "Landroid/widget/TextView;", "getMTvEffectDesc", "()Landroid/widget/TextView;", "setMTvEffectDesc", "(Landroid/widget/TextView;)V", "mTvEffectName", "getMTvEffectName", "setMTvEffectName", "mTvUsedCount", "getMTvUsedCount", "setMTvUsedCount", "bindData", "", "sticker", "onClick", "v", "onItemClick", "method", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EffectListItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43513a;
    public static final a h = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public TextView f43514b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public TextView f43515c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public TextView f43516d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public RemoteImageView f43517e;

    /* renamed from: f  reason: collision with root package name */
    NewFaceSticker f43518f;
    final Context g;
    private final boolean i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/EffectListItemViewHolder$Companion;", "", "()V", "createView", "Landroid/view/View;", "viewGroup", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43519a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onClick(@NotNull View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f43513a, false, 38565, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43513a, false, 38565, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        int id = view.getId();
        if (id == C0906R.id.bio) {
            a(view, "name");
        } else if (id == C0906R.id.b0v) {
            a(view, "head");
        } else {
            if (id == C0906R.id.b6d) {
                IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                if (iAVService == null || !iAVService.needLoginBeforeRecord()) {
                    IAVService iAVService2 = (IAVService) ServiceManager.get().getService(IAVService.class);
                    Intrinsics.checkExpressionValueIsNotNull(iAVService2, "avService");
                    if (iAVService2.getPublishService().checkIsAlreadyPublished(this.g)) {
                        String uuid = UUID.randomUUID().toString();
                        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
                        d a2 = d.a();
                        if (this.i) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        d a3 = a2.a("enter_from", str).a("creation_id", uuid).a("scene_id", "1008").a("shoot_way", "prop_tab");
                        NewFaceSticker newFaceSticker = this.f43518f;
                        if (newFaceSticker == null) {
                            Intrinsics.throwNpe();
                        }
                        d a4 = a3.a("prop_id", newFaceSticker.getEffectId());
                        NewFaceSticker newFaceSticker2 = this.f43518f;
                        if (newFaceSticker2 == null) {
                            Intrinsics.throwNpe();
                        }
                        r.a("shoot", (Map) a4.a("from_user_id", newFaceSticker2.getOwnerId()).f34114b);
                        Intent intent = new Intent();
                        intent.putExtra("shoot_way", "prop");
                        intent.putExtra("translation_type", 3);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
                        NewFaceSticker newFaceSticker3 = this.f43518f;
                        if (newFaceSticker3 == null) {
                            Intrinsics.throwNpe();
                        }
                        intent.putExtra("first_face_sticker", newFaceSticker3.getEffectId());
                        intent.putExtra("creation_id", uuid);
                        Object service = ServiceManager.get().getService(IAVService.class);
                        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
                        ((IAVService) service).getVideoRecordEntranceService().startToolPermissionActivity(this.g, intent);
                    }
                } else {
                    String string = this.g.getResources().getString(C0906R.string.c7i);
                    Context context = this.g;
                    if (context != null) {
                        e.a((Activity) context, "personal_homepage", "click_challenge_shoot", ad.a().a("login_title", string).f75487b);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectListItemViewHolder(@NotNull View view, boolean z) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.g = context;
        this.i = z;
        this.f43517e = (RemoteImageView) view.findViewById(C0906R.id.b0v);
        this.f43516d = (TextView) view.findViewById(C0906R.id.dld);
        this.f43514b = (TextView) view.findViewById(C0906R.id.dbc);
        this.f43515c = (TextView) view.findViewById(C0906R.id.dba);
        View.OnClickListener onClickListener = this;
        view.findViewById(C0906R.id.bio).setOnClickListener(onClickListener);
        view.findViewById(C0906R.id.b6d).setOnClickListener(onClickListener);
        view.findViewById(C0906R.id.b0v).setOnClickListener(onClickListener);
    }

    private final void a(View view, String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{view, str}, this, f43513a, false, 38566, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, str}, this, f43513a, false, 38566, new Class[]{View.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (this.i) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        d a3 = a2.a("enter_from", str2).a("enter_method", str);
        NewFaceSticker newFaceSticker = this.f43518f;
        if (newFaceSticker == null) {
            Intrinsics.throwNpe();
        }
        d a4 = a3.a("prop_id", newFaceSticker.getEffectId()).a("scene_id", "1001");
        NewFaceSticker newFaceSticker2 = this.f43518f;
        if (newFaceSticker2 == null) {
            Intrinsics.throwNpe();
        }
        d a5 = a4.a("from_user_id", newFaceSticker2.getOwnerId());
        NewFaceSticker newFaceSticker3 = this.f43518f;
        if (newFaceSticker3 == null) {
            Intrinsics.throwNpe();
        }
        r.a("enter_prop_detail", (Map) a5.a("log_pb", newFaceSticker3.getLogPb()).f34114b);
        ArrayList arrayList = new ArrayList();
        NewFaceSticker newFaceSticker4 = this.f43518f;
        if (newFaceSticker4 == null) {
            Intrinsics.throwNpe();
        }
        String effectId = newFaceSticker4.getEffectId();
        if (effectId == null) {
            Intrinsics.throwNpe();
        }
        arrayList.add(effectId);
        StickerPropDetailActicity.a(view.getContext(), null, null, null, arrayList);
    }
}
