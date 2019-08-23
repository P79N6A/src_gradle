package com.ss.android.ugc.aweme.im.sdk.chat;

import a.i;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.MessageAdapter;
import com.ss.android.ugc.aweme.im.sdk.chat.input.IInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordStateView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j;
import com.ss.android.ugc.aweme.im.sdk.chat.net.a.e;
import com.ss.android.ugc.aweme.im.sdk.chat.net.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText;
import com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001TB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u000208H\u0004J\b\u0010:\u001a\u000206H\u0014J\b\u0010;\u001a\u000206H\u0014J\u0010\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020%H\u0016J\b\u0010>\u001a\u000206H\u0016J\b\u0010?\u001a\u000206H\u0016J\"\u0010@\u001a\u0002062\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010F\u001a\u000206H\u0016J\b\u0010G\u001a\u000206H\u0016J\b\u0010H\u001a\u000206H\u0016J\b\u0010I\u001a\u000206H\u0016J\u000e\u0010J\u001a\u0002062\u0006\u0010K\u001a\u00020\u001bJ\b\u0010L\u001a\u000206H\u0016J\u0010\u0010M\u001a\u0002062\u0006\u0010D\u001a\u00020NH\u0004J\u0012\u0010O\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u00010EH\u0002J\u0010\u0010P\u001a\u0002062\u0006\u0010Q\u001a\u00020BH\u0002J\u0010\u0010R\u001a\u0002062\u0006\u0010S\u001a\u000202H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00060!R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/BasePanel;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "rootView", "Landroid/view/View;", "sessionInfo", "Lcom/ss/android/ugc/aweme/im/sdk/chat/SessionInfo;", "(Landroid/arch/lifecycle/LifecycleOwner;Landroid/view/View;Lcom/ss/android/ugc/aweme/im/sdk/chat/SessionInfo;)V", "mActivity", "Landroid/app/Activity;", "getMActivity", "()Landroid/app/Activity;", "mAudioHelper", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/audio/AudioHelper;", "mAudioRecordStateView", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/audio/widget/AudioRecordStateView;", "mContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getMContext", "()Landroid/content/Context;", "mFragment", "Landroid/support/v4/app/Fragment;", "getMFragment", "()Landroid/support/v4/app/Fragment;", "mHasFocus", "", "mInputView", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/IInputView;", "mLinearLayoutManager", "Lcom/ss/android/ugc/aweme/views/WrapLinearLayoutManager;", "mMentionCallback", "Lcom/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel$MentionCallback;", "mMessageAdapter", "Lcom/ss/android/ugc/aweme/im/sdk/chat/MessageAdapter;", "mMessageObserver", "Lcom/ss/android/ugc/aweme/im/sdk/chat/MessageHandle;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "mRecyclerViewGestureDetector", "Landroid/view/GestureDetector;", "getMRecyclerViewGestureDetector", "()Landroid/view/GestureDetector;", "mRecyclerViewGestureDetector$delegate", "Lkotlin/Lazy;", "mRootView", "getMRootView", "()Landroid/view/View;", "mTitleBar", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "mUnreadMessageTipsDelegate", "Lcom/ss/android/ugc/aweme/im/sdk/chat/UnreadMessageTipsDelegate;", "addMentionText", "", "nickname", "", "uid", "handleOnBackPressed", "handleOnFinish", "initMessageObserver", "messageObserver", "initParams", "loadMore", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "onDestroy", "onResume", "onStop", "onWindowFocusChanged", "hasFocus", "refreshData", "refreshStrangerMessage", "Lcom/ss/android/ugc/aweme/im/sdk/model/StrangerMessageList;", "sendEncryptMediaMessage", "smoothScrollToPosition", "position", "updateTitleBar", "titleBar", "MentionCallback", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class BaseChatPanel extends BasePanel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50171a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f50172b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseChatPanel.class), "mRecyclerViewGestureDetector", "getMRecyclerViewGestureDetector()Landroid/view/GestureDetector;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final View f50173c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f50174d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final Activity f50175e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Fragment f50176f;
    public final ImTextTitleBar g;
    final RecyclerView h;
    public final WrapLinearLayoutManager i;
    public final IInputView j;
    public final MessageAdapter k;
    public boolean l;
    final Lazy m;
    public final o n;
    private final AudioRecordStateView s;
    private final com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c t;
    private final c u;
    private final j v;
    private r w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel$mMessageObserver$1$1"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50184a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f50185b;

        a(BaseChatPanel baseChatPanel) {
            this.f50185b = baseChatPanel;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f50184a, false, 50217, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50184a, false, 50217, new Class[0], Void.TYPE);
                return;
            }
            this.f50185b.a(this.f50185b.g);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch", "com/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel$1$4"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50186a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f50187b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f50188c;

        b(RecyclerView recyclerView, BaseChatPanel baseChatPanel) {
            this.f50187b = recyclerView;
            this.f50188c = baseChatPanel;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Object value;
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{view2, motionEvent2}, this, f50186a, false, 50218, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent2}, this, f50186a, false, 50218, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (Intrinsics.areEqual((Object) view2, (Object) this.f50187b)) {
                BaseChatPanel baseChatPanel = this.f50188c;
                if (PatchProxy.isSupport(new Object[0], baseChatPanel, BaseChatPanel.f50171a, false, 50200, new Class[0], GestureDetector.class)) {
                    value = PatchProxy.accessDispatch(new Object[0], baseChatPanel, BaseChatPanel.f50171a, false, 50200, new Class[0], GestureDetector.class);
                } else {
                    value = baseChatPanel.m.getValue();
                }
                if (((GestureDetector) value).onTouchEvent(motionEvent2)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel$MentionCallback;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/MessageAdapter$IMentionCallback;", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel;)V", "onAvatarLongClick", "", "uid", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class c implements MessageAdapter.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50189a;

        public c() {
        }

        public final void a(@Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f50189a, false, 50223, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f50189a, false, 50223, new Class[]{String.class}, Void.TYPE);
                return;
            }
            IMUser b2 = com.ss.android.ugc.aweme.im.sdk.d.e.a().b(str2);
            if (b2 != null) {
                String uid = b2.getUid();
                if (uid != null) {
                    BaseChatPanel baseChatPanel = BaseChatPanel.this;
                    String nickName = b2.getNickName();
                    Intrinsics.checkExpressionValueIsNotNull(nickName, "nickName");
                    baseChatPanel.a(nickName, uid);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/GestureDetector;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<GestureDetector> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BaseChatPanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaseChatPanel baseChatPanel) {
            super(0);
            this.this$0 = baseChatPanel;
        }

        @NotNull
        public final GestureDetector invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50224, new Class[0], GestureDetector.class)) {
                return new GestureDetector(this.this$0.f50174d, new GestureDetector.SimpleOnGestureListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50191a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f50192b;

                    {
                        this.f50192b = r1;
                    }

                    public final boolean onSingleTapUp(@NotNull MotionEvent motionEvent) {
                        MotionEvent motionEvent2 = motionEvent;
                        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f50191a, false, 50225, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f50191a, false, 50225, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        }
                        Intrinsics.checkParameterIsNotNull(motionEvent2, "e");
                        this.f50192b.this$0.j.e();
                        return super.onSingleTapConfirmed(motionEvent);
                    }

                    public final boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f2, float f3) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f50191a, false, 50226, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f50191a, false, 50226, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                        } else if (motionEvent == null || motionEvent2 == null) {
                            return super.onFling(motionEvent, motionEvent2, f2, f3);
                        } else {
                            float x = motionEvent.getX() - motionEvent2.getX();
                            if (motionEvent.getY() < motionEvent2.getY()) {
                                float y = motionEvent2.getY() - motionEvent.getY();
                                if (x == 0.0f) {
                                    x = 1.0f;
                                }
                                if (y / Math.abs(x) > 0.65f && this.f50192b.this$0.i.findLastCompletelyVisibleItemPosition() == this.f50192b.this$0.k.getItemCount() - 1) {
                                    BaseChatPanel baseChatPanel = this.f50192b.this$0;
                                    if (PatchProxy.isSupport(new Object[0], baseChatPanel, BaseChatPanel.f50171a, false, 50210, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], baseChatPanel, BaseChatPanel.f50171a, false, 50210, new Class[0], Void.TYPE);
                                    } else {
                                        baseChatPanel.k.e();
                                    }
                                }
                            }
                            return super.onFling(motionEvent, motionEvent2, f2, f3);
                        }
                    }
                });
            }
            return (GestureDetector) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50224, new Class[0], GestureDetector.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f50194b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Intent f50195c;

        e(BaseChatPanel baseChatPanel, Intent intent) {
            this.f50194b = baseChatPanel;
            this.f50195c = intent;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f50193a, false, 50227, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50193a, false, 50227, new Class[0], Void.TYPE);
                return;
            }
            BaseChatPanel baseChatPanel = this.f50194b;
            Intent intent = this.f50195c;
            if (PatchProxy.isSupport(new Object[]{intent}, baseChatPanel, BaseChatPanel.f50171a, false, 50205, new Class[]{Intent.class}, Void.TYPE)) {
                Object[] objArr = {intent};
                BaseChatPanel baseChatPanel2 = baseChatPanel;
                PatchProxy.accessDispatch(objArr, baseChatPanel2, BaseChatPanel.f50171a, false, 50205, new Class[]{Intent.class}, Void.TYPE);
                return;
            }
            if (intent != null) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("im_edit_texts");
                int intExtra = intent.getIntExtra("im_is_from_gallery", 0);
                int intExtra2 = intent.getIntExtra("im_height", 0);
                int intExtra3 = intent.getIntExtra("im_width", 0);
                String stringExtra = intent.getStringExtra("im_local_path");
                CharSequence stringExtra2 = intent.getStringExtra("im_type");
                if (TextUtils.equals(stringExtra2, "im_photo")) {
                    j jVar = new j();
                    jVar.setFromGallery(intExtra);
                    jVar.setCheckTexts(stringArrayListExtra);
                    jVar.setPath(stringExtra);
                    jVar.setHeight(intExtra2);
                    jVar.setWith(intExtra3);
                    if (bc.c()) {
                        s.a().b(baseChatPanel.n.getConversationId(), CollectionsKt.listOf(jVar));
                    } else {
                        s.a().a(baseChatPanel.n.getConversationId(), CollectionsKt.listOf(jVar));
                    }
                } else {
                    if (TextUtils.equals(stringExtra2, "im_video")) {
                        String stringExtra3 = intent.getStringExtra("im_src_frame_path");
                        String stringExtra4 = intent.getStringExtra("im_video_cover");
                        String stringExtra5 = intent.getStringExtra("im_src_video_md5");
                        f fVar = new f();
                        fVar.setThumbnailPath(stringExtra4);
                        fVar.setFromGallery(intExtra);
                        fVar.setSrcVideoMD5(stringExtra5);
                        fVar.setCheckTexts(stringArrayListExtra);
                        fVar.setCheckPic(stringExtra3);
                        fVar.setVideoPath(stringExtra);
                        fVar.setHeight(intExtra2);
                        fVar.setWidth(intExtra3);
                        com.ss.android.ugc.aweme.im.sdk.chat.net.a.e eVar = com.ss.android.ugc.aweme.im.sdk.chat.net.a.e.f50897b;
                        String conversationId = baseChatPanel.n.getConversationId();
                        if (PatchProxy.isSupport(new Object[]{conversationId, fVar}, eVar, com.ss.android.ugc.aweme.im.sdk.chat.net.a.e.f50896a, false, 51352, new Class[]{String.class, f.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.im.sdk.chat.net.a.e eVar2 = eVar;
                            PatchProxy.accessDispatch(new Object[]{conversationId, fVar}, eVar2, com.ss.android.ugc.aweme.im.sdk.chat.net.a.e.f50896a, false, 51352, new Class[]{String.class, f.class}, Void.TYPE);
                        } else {
                            TextUtils.isEmpty(conversationId);
                            i.a((Callable<TResult>) new e.a<TResult>(fVar, conversationId));
                        }
                    }
                }
            }
        }
    }

    public void a() {
    }

    public void a(@NotNull j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, this, f50171a, false, 50206, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, this, f50171a, false, 50206, new Class[]{j.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(jVar2, "messageObserver");
    }

    public void a(@NotNull ImTextTitleBar imTextTitleBar) {
        ImTextTitleBar imTextTitleBar2 = imTextTitleBar;
        if (PatchProxy.isSupport(new Object[]{imTextTitleBar2}, this, f50171a, false, 50209, new Class[]{ImTextTitleBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imTextTitleBar2}, this, f50171a, false, 50209, new Class[]{ImTextTitleBar.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(imTextTitleBar2, "titleBar");
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50171a, false, 50207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50171a, false, 50207, new Class[0], Void.TYPE);
            return;
        }
        this.k.d();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f50171a, false, 50201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50171a, false, 50201, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        a();
        a(this.v);
        b();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50171a, false, 50202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50171a, false, 50202, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        a(this.g);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f50171a, false, 50204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50171a, false, 50204, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.t.b();
        this.k.g();
        this.v.onDestroy();
        com.ss.android.ugc.aweme.im.sdk.chat.net.a.a().d();
        if (this.f50176f instanceof AbsFragment) {
            ((AbsFragment) this.f50176f).unregisterLifeCycleMonitor(this.v);
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f50171a, false, 50203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50171a, false, 50203, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.t.a();
        r rVar = this.w;
        if (PatchProxy.isSupport(new Object[0], rVar, r.f50709a, false, 50508, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], rVar, r.f50709a, false, 50508, new Class[0], Void.TYPE);
            return;
        }
        rVar.p.f();
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f50171a, false, 50214, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f50171a, false, 50214, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "nickname");
        Intrinsics.checkParameterIsNotNull(str4, "uid");
        this.j.a(str3, str4);
    }

    public void a(int i2, int i3, @Nullable Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f50171a, false, 50211, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f50171a, false, 50211, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i5 == -1 && i4 == 220) {
            if (intent2 != null) {
                Serializable serializableExtra = intent2.getSerializableExtra("extra_story_detail_params");
                if (serializableExtra != null) {
                    if (serializableExtra != null) {
                        com.ss.android.ugc.aweme.im.sdk.story.b.a(((com.ss.android.ugc.aweme.story.api.model.f) serializableExtra).storyState);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.api.model.DetailParams");
                    }
                }
            }
        } else if (i5 == 7 && i4 == 6) {
            this.h.postDelayed(new e(this, intent2), 300);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseChatPanel(@NotNull LifecycleOwner lifecycleOwner, @NotNull View view, @NotNull o oVar) {
        super(lifecycleOwner);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(oVar, "sessionInfo");
        this.n = oVar;
        this.f50173c = view;
        this.f50174d = view.getContext();
        Context context = this.f50174d;
        if (context != null) {
            this.f50175e = (Activity) context;
            this.f50176f = (Fragment) lifecycleOwner;
            View findViewById = view.findViewById(C0906R.id.s7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.chat_title_layout)");
            this.g = (ImTextTitleBar) findViewById;
            View findViewById2 = view.findViewById(C0906R.id.cc4);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.recycle_view)");
            this.h = (RecyclerView) findViewById2;
            this.i = new WrapLinearLayoutManager(this.f50174d);
            View findViewById3 = view.findViewById(C0906R.id.fy);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.arsv_state)");
            this.s = (AudioRecordStateView) findViewById3;
            com.ss.android.ugc.aweme.im.sdk.chat.input.d a2 = com.ss.android.ugc.aweme.im.sdk.chat.input.d.a((ViewGroup) view, this.n);
            Intrinsics.checkExpressionValueIsNotNull(a2, "InputView.inject(rootVie…s ViewGroup, sessionInfo)");
            this.j = a2;
            com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c cVar = new com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c();
            com.ss.android.ugc.aweme.im.sdk.chat.input.audio.b a3 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.b.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AudioCenter.inst()");
            a3.f50355b = new com.ss.android.ugc.aweme.im.sdk.chat.input.audio.a();
            cVar.a(this.j.f(), this.s);
            this.t = cVar;
            this.u = new c();
            MessageAdapter messageAdapter = new MessageAdapter(this.n);
            messageAdapter.setHasStableIds(true);
            messageAdapter.a(this.t);
            messageAdapter.o = this.u;
            this.k = messageAdapter;
            j jVar = new j(this.n.getConversationId(), this.k);
            jVar.f50671d = new a(this);
            this.v = jVar;
            this.l = true;
            this.m = LazyKt.lazy(new d(this));
            RecyclerView recyclerView = this.h;
            recyclerView.setClickable(true);
            AnonymousClass1.AnonymousClass1 r4 = new DefaultItemAnimator() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50181a;

                public final boolean animateChange(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
                    RecyclerView.ViewHolder viewHolder3 = viewHolder;
                    RecyclerView.ViewHolder viewHolder4 = viewHolder2;
                    if (PatchProxy.isSupport(new Object[]{viewHolder3, viewHolder4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f50181a, false, 50220, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                        Object[] objArr = {viewHolder3, viewHolder4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        return ((Boolean) PatchProxy.accessDispatch(objArr, this, f50181a, false, 50220, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                    }
                    Intrinsics.checkParameterIsNotNull(viewHolder3, "oldHolder");
                    Intrinsics.checkParameterIsNotNull(viewHolder4, "newHolder");
                    if (viewHolder3 == viewHolder4) {
                        return super.animateChange(viewHolder, viewHolder2, i, i2, i3, i4);
                    }
                    viewHolder3.itemView.animate().cancel();
                    viewHolder4.itemView.animate().cancel();
                    viewHolder3.itemView.animate().alpha(0.0f).setDuration(125).start();
                    return true;
                }
            };
            r4.setSupportsChangeAnimations(false);
            recyclerView.setItemAnimator(r4);
            WrapLinearLayoutManager wrapLinearLayoutManager = this.i;
            wrapLinearLayoutManager.setReverseLayout(true);
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            recyclerView.setVerticalScrollBarEnabled(true);
            recyclerView.setScrollBarStyle(33554432);
            recyclerView.setAdapter(this.k);
            recyclerView.requestDisallowInterceptTouchEvent(true);
            recyclerView.setOnTouchListener(new b(recyclerView, this));
            recyclerView.addOnScrollListener(new BaseChatPanel$$special$$inlined$apply$lambda$2(this.f50174d, this));
            this.j.a((d.a) new d.a(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50179a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BaseChatPanel f50180b;

                {
                    this.f50180b = r1;
                }

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50179a, false, 50221, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50179a, false, 50221, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 0) {
                        if (this.f50180b.q && !this.f50180b.l && this.f50180b.n.isGroupChat()) {
                            this.f50180b.j.b(4);
                        }
                        BaseChatPanel baseChatPanel = this.f50180b;
                        if (PatchProxy.isSupport(new Object[]{0}, baseChatPanel, BaseChatPanel.f50171a, false, 50215, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            BaseChatPanel baseChatPanel2 = baseChatPanel;
                            PatchProxy.accessDispatch(new Object[]{0}, baseChatPanel2, BaseChatPanel.f50171a, false, 50215, new Class[]{Integer.TYPE}, Void.TYPE);
                        } else if (baseChatPanel.h.getLayoutManager() instanceof LinearLayoutManager) {
                            RecyclerView.LayoutManager layoutManager = baseChatPanel.h.getLayoutManager();
                            if (layoutManager != null) {
                                if (layoutManager != null) {
                                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                            }
                        }
                    }
                }
            });
            this.j.a((MentionEditText.e) new MentionEditText.e(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50182a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BaseChatPanel f50183b;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f50182a, false, 50222, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50182a, false, 50222, new Class[0], Void.TYPE);
                        return;
                    }
                    com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(this.f50183b.n.getConversationId());
                    if (this.f50183b.n.isGroupChat()) {
                        Intrinsics.checkExpressionValueIsNotNull(a2, "conversation");
                        if (a2.getMemberCount() > 1) {
                            this.f50183b.j.e();
                            GroupMemberSelectActivity.f51522b.a(this.f50183b.f50175e, 6, this.f50183b.n.getConversationId(), 223);
                        }
                    }
                }

                {
                    this.f50183b = r1;
                }
            });
            this.w = new r(this.f50173c, this.h, this.k);
            if (this.f50176f instanceof AbsFragment) {
                ((AbsFragment) this.f50176f).registerLifeCycleMonitor(this.v);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }
}
