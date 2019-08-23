package com.ss.android.ugc.aweme.im.sdk.detail;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.model.BlockResponse;
import com.ss.android.ugc.aweme.im.sdk.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.ay;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020\u001aH\u0002J\u0012\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010)\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0014J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u000201H\u0002J\u001a\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u00105\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/FriendChatDetailActivity;", "Lcom/ss/android/ugc/aweme/im/sdk/detail/BaseChatDetailActivity;", "Lcom/bytedance/common/utility/collection/WeakHandler$IHandler;", "()V", "mAvatarImage", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "mAvatarLayout", "Landroid/widget/RelativeLayout;", "mBlockLayout", "mBlockStatus", "", "mBlockStatus$annotations", "mBlockText", "Landroid/widget/TextView;", "mDetailText", "mHandler", "Lcom/bytedance/common/utility/collection/WeakHandler;", "mIsStranger", "", "mReportText", "mUser", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "mUserNameText", "mVerifyImage", "Landroid/widget/ImageView;", "doBlockTask", "", "getDetailText", "", "user", "handleMsg", "msg", "Landroid/os/Message;", "initEvents", "initLayoutRes", "initParams", "initViews", "onBlock", "onBlockCheckResponse", "obj", "", "onBlockResponse", "onClick", "v", "Landroid/view/View;", "onReport", "onResume", "refreshUser", "userStruct", "Lcom/ss/android/ugc/aweme/im/sdk/model/UserStruct;", "setTextViewState", "view", "str", "updateUserInfoViews", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendChatDetailActivity extends BaseChatDetailActivity implements WeakHandler.IHandler {
    public static ChangeQuickRedirect g;
    public static final a j = new a((byte) 0);
    public IMUser h;
    public WeakHandler i;
    private RelativeLayout k;
    private AvatarImageView l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private RelativeLayout r;
    private boolean s;
    private int t;
    private HashMap u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/FriendChatDetailActivity$Companion;", "", "()V", "MSG_BLOCK_OR_UNBLOCK", "", "MSG_CHECK_BLOCK", "start", "", "context", "Landroid/app/Activity;", "user", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "isStranger", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51372a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/FriendChatDetailActivity$doBlockTask$1", "Ljava/lang/Runnable;", "run", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendChatDetailActivity f51374b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f51373a, false, 51933, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51373a, false, 51933, new Class[0], Void.TYPE);
                return;
            }
            FriendChatDetailActivity.a(this.f51374b).setFollowStatus(0);
            e.a().a(FriendChatDetailActivity.a(this.f51374b));
        }

        b(FriendChatDetailActivity friendChatDetailActivity) {
            this.f51374b = friendChatDetailActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/FriendChatDetailActivity$onBlock$onClickListener$1", "Landroid/content/DialogInterface$OnClickListener;", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendChatDetailActivity f51376b;

        c(FriendChatDetailActivity friendChatDetailActivity) {
            this.f51376b = friendChatDetailActivity;
        }

        public final void onClick(@Nullable DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51375a, false, 51934, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51375a, false, 51934, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            } else if (i == -1) {
                String b2 = j.f51270d.b(FriendChatDetailActivity.a(this.f51376b));
                WeakHandler weakHandler = this.f51376b.i;
                if (weakHandler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                }
                r.a(weakHandler, FriendChatDetailActivity.a(this.f51376b).getUid(), b2, 1, 1);
                z.a().a("success", FriendChatDetailActivity.a(this.f51376b).getUid(), "chat");
            } else {
                z.a().a("cancel", FriendChatDetailActivity.a(this.f51376b).getUid(), "chat");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/FriendChatDetailActivity$onReport$1", "Lcom/ss/android/ugc/aweme/framework/services/IReportService$IReportCallback;", "onReportEnd", "", "onReportStart", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements IReportService.IReportCallback {
        public final void onReportEnd() {
        }

        public final void onReportStart() {
        }

        d() {
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 51927, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 51927, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.u == null) {
            this.u = new HashMap();
        }
        View view = (View) this.u.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.u.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final int d() {
        return C0906R.layout.bl;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, g, false, 51929, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, g, false, 51929, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onCreate", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, g, false, 51930, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, g, false, 51930, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51912, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onResume", true);
        super.onResume();
        j jVar = j.f51270d;
        IMUser iMUser = this.h;
        if (iMUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        String b2 = jVar.b(iMUser);
        WeakHandler weakHandler = this.i;
        if (weakHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
        }
        Handler handler = weakHandler;
        IMUser iMUser2 = this.h;
        if (iMUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        r.a(handler, (CharSequence) iMUser2.getUid(), b2, 0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onResume", false);
    }

    public final void e() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51913, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        if (intent.getExtras() != null) {
            Intent intent2 = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
            Bundle extras = intent2.getExtras();
            if (extras == null) {
                Intrinsics.throwNpe();
            }
            if (extras.getSerializable("simple_uesr") != null) {
                Intent intent3 = getIntent();
                Intrinsics.checkExpressionValueIsNotNull(intent3, "intent");
                Bundle extras2 = intent3.getExtras();
                if (extras2 == null) {
                    Intrinsics.throwNpe();
                }
                Serializable serializable = extras2.getSerializable("simple_uesr");
                if (serializable != null) {
                    this.h = (IMUser) serializable;
                    IMUser iMUser = this.h;
                    if (iMUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUser");
                    }
                    String uid = iMUser.getUid();
                    CharSequence charSequence = uid;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        try {
                            this.f51335f = new com.bytedance.im.core.d.e(com.bytedance.im.core.d.e.a(Long.parseLong(uid)));
                        } catch (Exception unused) {
                        }
                    }
                    Intent intent4 = getIntent();
                    Intrinsics.checkExpressionValueIsNotNull(intent4, "intent");
                    Bundle extras3 = intent4.getExtras();
                    if (extras3 == null) {
                        Intrinsics.throwNpe();
                    }
                    this.s = extras3.getBoolean("is_stranger", false);
                    this.i = new WeakHandler(this);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        finish();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51918, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        RelativeLayout relativeLayout = this.k;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarLayout");
        }
        View.OnClickListener onClickListener = this;
        relativeLayout.setOnClickListener(onClickListener);
        AvatarImageView avatarImageView = this.l;
        if (avatarImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarImage");
        }
        avatarImageView.setOnClickListener(onClickListener);
        TextView textView = this.p;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBlockText");
        }
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.q;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReportText");
        }
        textView2.setOnClickListener(onClickListener);
        au.a h2 = au.a.h();
        View[] viewArr = new View[2];
        RelativeLayout relativeLayout2 = this.k;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarLayout");
        }
        viewArr[0] = relativeLayout2;
        AvatarImageView avatarImageView2 = this.l;
        if (avatarImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarImage");
        }
        viewArr[1] = avatarImageView2;
        h2.a(viewArr);
        int color = getResources().getColor(C0906R.color.a7l);
        int color2 = getResources().getColor(C0906R.color.pm);
        View[] viewArr2 = new View[2];
        TextView textView3 = this.p;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBlockText");
        }
        viewArr2[0] = textView3;
        TextView textView4 = this.q;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReportText");
        }
        viewArr2[1] = textView4;
        au.a(color, color2, viewArr2);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 51914, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        RelativeLayout relativeLayout = (RelativeLayout) a((int) C0906R.id.ic);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "avatar_rl");
        this.k = relativeLayout;
        AvatarImageView avatarImageView = (AvatarImageView) a((int) C0906R.id.i4);
        Intrinsics.checkExpressionValueIsNotNull(avatarImageView, "avatar_iv");
        this.l = avatarImageView;
        ImageView imageView = (ImageView) a((int) C0906R.id.dr5);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "verify_iv");
        this.m = imageView;
        DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.bps);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "name_tv");
        this.n = dmtTextView;
        DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.a49);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "detail_tv");
        this.o = dmtTextView2;
        RelativeLayout relativeLayout2 = (RelativeLayout) a((int) C0906R.id.ln);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "block_rl");
        this.r = relativeLayout2;
        DmtTextView dmtTextView3 = (DmtTextView) a((int) C0906R.id.cdr);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "report_tv");
        this.q = dmtTextView3;
        DmtTextView dmtTextView4 = (DmtTextView) a((int) C0906R.id.lp);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "block_tv");
        this.p = dmtTextView4;
        if (this.s) {
            RelativeLayout relativeLayout3 = (RelativeLayout) a((int) C0906R.id.b9g);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "layout_mute");
            relativeLayout3.setVisibility(8);
            RelativeLayout relativeLayout4 = (RelativeLayout) a((int) C0906R.id.b_t);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "layout_stick_top");
            relativeLayout4.setVisibility(8);
        }
        IMUser iMUser = this.h;
        if (iMUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        a(iMUser);
        IMUser iMUser2 = this.h;
        if (iMUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        if (TextUtils.equals(iMUser2.getUid(), com.ss.android.ugc.aweme.im.sdk.utils.d.b())) {
            RelativeLayout relativeLayout5 = this.r;
            if (relativeLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBlockLayout");
            }
            relativeLayout5.setVisibility(8);
        }
    }

    public static final /* synthetic */ IMUser a(FriendChatDetailActivity friendChatDetailActivity) {
        IMUser iMUser = friendChatDetailActivity.h;
        if (iMUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUser");
        }
        return iMUser;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.im.service.model.IMUser r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = g
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 51915(0xcacb, float:7.2748E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 51915(0xcacb, float:7.2748E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
            java.lang.String r1 = "user.avatarThumb"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
            java.lang.String r1 = "user.avatarThumb"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.List r0 = r0.getUrlList()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x006d
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r9.l
            if (r0 != 0) goto L_0x0063
            java.lang.String r1 = "mAvatarImage"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0063:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r10.getAvatarThumb()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            goto L_0x007e
        L_0x006d:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r9.l
            if (r0 != 0) goto L_0x0076
            java.lang.String r1 = "mAvatarImage"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0076:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            r1 = 2130839027(0x7f0205f3, float:1.7283053E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
        L_0x007e:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r9.l
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = "mAvatarImage"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0087:
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.im.sdk.utils.a.a((android.widget.ImageView) r0, (com.ss.android.ugc.aweme.im.service.model.IMUser) r10)
            android.widget.TextView r0 = r9.n
            if (r0 != 0) goto L_0x0095
            java.lang.String r1 = "mUserNameText"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0095:
            java.lang.String r1 = r10.getDisplayName()
            r9.a(r0, r1)
            android.widget.TextView r0 = r9.o
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = "mDetailText"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00a5:
            java.lang.String r1 = r9.b(r10)
            r9.a(r0, r1)
            android.widget.ImageView r0 = r9.m
            if (r0 != 0) goto L_0x00b5
            java.lang.String r1 = "mVerifyImage"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00b5:
            com.ss.android.ugc.aweme.im.sdk.utils.ax.a((android.widget.ImageView) r0, (com.ss.android.ugc.aweme.im.service.model.IMUser) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity.a(com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    private final String b(IMUser iMUser) {
        String str;
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, g, false, 51916, new Class[]{IMUser.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iMUser}, this, g, false, 51916, new Class[]{IMUser.class}, String.class);
        } else if (TextUtils.isEmpty(iMUser.getRemarkName()) || TextUtils.isEmpty(iMUser.getNickName())) {
            if (TextUtils.isEmpty(iMUser.getSignature())) {
                str = getString(C0906R.string.apf);
            } else if (m.b()) {
                str = getString(C0906R.string.ap0) + iMUser.getSignature();
            } else {
                str = iMUser.getSignature();
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (TextUtils.isEmpty(us…          }\n            }");
            return str;
        } else {
            String string = getString(C0906R.string.avn, new Object[]{iMUser.getNickName()});
            Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.im_nickname, user.nickName)");
            return string;
        }
    }

    public final void handleMsg(@NotNull Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, g, false, 51919, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, g, false, 51919, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(message, "msg");
        switch (message.what) {
            case 0:
                Object obj = message.obj;
                if (PatchProxy.isSupport(new Object[]{obj}, this, g, false, 51920, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj}, this, g, false, 51920, new Class[]{Object.class}, Void.TYPE);
                    break;
                } else {
                    if (obj instanceof UserStruct) {
                        UserStruct userStruct = (UserStruct) obj;
                        if (userStruct.getUser() != null) {
                            if (userStruct.getUser().isBlock()) {
                                this.t = 1;
                                TextView textView = this.p;
                                if (textView == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mBlockText");
                                }
                                textView.setText(C0906R.string.az_);
                            } else {
                                this.t = 0;
                                TextView textView2 = this.p;
                                if (textView2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mBlockText");
                                }
                                textView2.setText(C0906R.string.apg);
                            }
                            if (PatchProxy.isSupport(new Object[]{userStruct}, this, g, false, 51921, new Class[]{UserStruct.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{userStruct}, this, g, false, 51921, new Class[]{UserStruct.class}, Void.TYPE);
                                break;
                            } else {
                                IMUser fromUser = IMUser.fromUser(userStruct.getUser());
                                Intrinsics.checkExpressionValueIsNotNull(fromUser, "IMUser.fromUser(userStruct.user)");
                                this.h = fromUser;
                                IMUser iMUser = this.h;
                                if (iMUser == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                                }
                                a(iMUser);
                                e a2 = e.a();
                                IMUser iMUser2 = this.h;
                                if (iMUser2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                                }
                                a2.a(iMUser2);
                            }
                        }
                    }
                    return;
                }
            case 1:
                Object obj2 = message.obj;
                if (!PatchProxy.isSupport(new Object[]{obj2}, this, g, false, 51922, new Class[]{Object.class}, Void.TYPE)) {
                    if (!(obj2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                        if (obj2 instanceof BlockResponse) {
                            BlockResponse blockResponse = (BlockResponse) obj2;
                            if (blockResponse.getBlockStaus() != 1) {
                                if (blockResponse.getBlockStaus() == 0) {
                                    this.t = 0;
                                    TextView textView3 = this.p;
                                    if (textView3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mBlockText");
                                    }
                                    textView3.setText(C0906R.string.apg);
                                    UIUtils.displayToast((Context) this, (int) C0906R.string.aza);
                                    break;
                                }
                            } else {
                                this.t = 1;
                                TextView textView4 = this.p;
                                if (textView4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mBlockText");
                                }
                                textView4.setText(C0906R.string.az_);
                                UIUtils.displayToast((Context) this, (int) C0906R.string.apj);
                                if (PatchProxy.isSupport(new Object[0], this, g, false, 51923, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, g, false, 51923, new Class[0], Void.TYPE);
                                    break;
                                } else {
                                    WeakHandler weakHandler = this.i;
                                    if (weakHandler == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                                    }
                                    weakHandler.post(new b(this));
                                    return;
                                }
                            }
                        }
                    } else {
                        UIUtils.displayToast((Context) this, (int) C0906R.string.ara);
                        return;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[]{obj2}, this, g, false, 51922, new Class[]{Object.class}, Void.TYPE);
                    return;
                }
                break;
        }
    }

    public final void onClick(@NotNull View view) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, g, false, 51924, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, g, false, 51924, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        super.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.ic || id == C0906R.id.i4) {
            j jVar = j.f51270d;
            IMUser iMUser = this.h;
            if (iMUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUser");
            }
            jVar.c(iMUser.getUid());
            ay ayVar = ay.f52524b;
            IMUser iMUser2 = this.h;
            if (iMUser2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUser");
            }
            ayVar.a(iMUser2.getUid());
            return;
        }
        String str = null;
        if (id == C0906R.id.lp) {
            if (PatchProxy.isSupport(new Object[0], this, g, false, 51925, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 51925, new Class[0], Void.TYPE);
            } else if (this.t == 0) {
                c cVar = new c(this);
                IMUser iMUser3 = this.h;
                if (iMUser3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                if (iMUser3.getFollowStatus() != 2) {
                    z = false;
                }
                bc.a((Context) this, z, (DialogInterface.OnClickListener) cVar);
                z a2 = z.a();
                IMUser iMUser4 = this.h;
                if (iMUser4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                a2.a("chat", iMUser4.getUid(), (String) null);
            } else {
                j jVar2 = j.f51270d;
                IMUser iMUser5 = this.h;
                if (iMUser5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                String b2 = jVar2.b(iMUser5);
                WeakHandler weakHandler = this.i;
                if (weakHandler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                }
                Handler handler = weakHandler;
                IMUser iMUser6 = this.h;
                if (iMUser6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                r.a(handler, iMUser6.getUid(), b2, 0, 1);
                z a3 = z.a();
                IMUser iMUser7 = this.h;
                if (iMUser7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                a3.c(iMUser7.getUid());
            }
        } else if (id == C0906R.id.cdr) {
            if (PatchProxy.isSupport(new Object[0], this, g, false, 51926, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 51926, new Class[0], Void.TYPE);
                return;
            }
            IReportService iReportService = (IReportService) ServiceManager.get().getService(IReportService.class);
            if (iReportService != null) {
                Activity activity = this;
                IMUser iMUser8 = this.h;
                if (iMUser8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                String uid = iMUser8.getUid();
                IMUser iMUser9 = this.h;
                if (iMUser9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                iReportService.showReportDialog(activity, "im", uid, iMUser9.getUid(), new d());
            }
            z a4 = z.a();
            com.bytedance.im.core.d.e eVar = this.f51335f;
            if (eVar != null) {
                str = eVar.f21270a;
            }
            a4.e(str, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
        }
    }

    private final void a(TextView textView, String str) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, str}, this, g, false, 51917, new Class[]{TextView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, str}, this, g, false, 51917, new Class[]{TextView.class, String.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            textView2.setVisibility(0);
            textView2.setText(charSequence);
            return;
        }
        textView2.setVisibility(4);
    }
}
