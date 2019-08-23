package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.medialib.camera.g;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.AVRecordSurfaceFragment;
import com.ss.android.vesdk.ai;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0007H\u0016J\"\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0007H\u0014J\u001a\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001fH\u0016J%\u0010 \u001a\u00020\u0007*\u00020\u00172\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\"¢\u0006\u0002\b#H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordActivity;", "Lcom/bytedance/ies/uikit/base/AbsActivity;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/FragmentLifeCycleCallback;", "()V", "storyRecordFragment", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "closeStoryPublish", "", "event", "Lcom/ss/android/ugc/aweme/main/event/CloseStoryRecordEvent;", "finish", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFragmentActivityCreated", "fragment", "Landroid/support/v4/app/Fragment;", "onFragmentCreated", "onFragmentDestroyed", "onFragmentStarted", "onFragmentStopped", "onKeyDown", "", "keyCode", "Landroid/view/KeyEvent;", "takeIfIsStoryFragment", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryRecordActivity extends AbsActivity implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4172a;

    /* renamed from: b  reason: collision with root package name */
    private StoryRecordFragment f4173b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<StoryRecordFragment, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryRecordActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StoryRecordActivity storyRecordActivity) {
            super(1);
            this.this$0 = storyRecordActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryRecordFragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final StoryRecordFragment storyRecordFragment) {
            if (PatchProxy.isSupport(new Object[]{storyRecordFragment}, this, changeQuickRedirect, false, 85566, new Class[]{StoryRecordFragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyRecordFragment}, this, changeQuickRedirect, false, 85566, new Class[]{StoryRecordFragment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyRecordFragment, "$receiver");
            storyRecordFragment.a().a(this.this$0, "story", new Function0<Unit>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85567, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85567, new Class[0], Void.TYPE);
                        return;
                    }
                    storyRecordFragment.z();
                }
            });
            j.f73940c.a(this.this$0, AnonymousClass2.INSTANCE, new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85568, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85568, new Class[0], Void.TYPE);
                        return;
                    }
                    this.this$0.this$0.finish();
                }
            });
            storyRecordFragment.A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<StoryRecordFragment, Unit> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryRecordFragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryRecordFragment storyRecordFragment) {
            StoryRecordFragment storyRecordFragment2 = storyRecordFragment;
            if (PatchProxy.isSupport(new Object[]{storyRecordFragment2}, this, changeQuickRedirect, false, 85569, new Class[]{StoryRecordFragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyRecordFragment2}, this, changeQuickRedirect, false, 85569, new Class[]{StoryRecordFragment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyRecordFragment2, "$receiver");
            Context context = storyRecordFragment.getContext();
            ShortVideoContextViewModel r = storyRecordFragment.r();
            Intrinsics.checkExpressionValueIsNotNull(r, "shortVideoContextViewModel");
            fh fhVar = r.f65401b;
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
            g.a(context, fhVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<StoryRecordFragment, Unit> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryRecordFragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryRecordFragment storyRecordFragment) {
            StoryRecordFragment storyRecordFragment2 = storyRecordFragment;
            if (PatchProxy.isSupport(new Object[]{storyRecordFragment2}, this, changeQuickRedirect, false, 85570, new Class[]{StoryRecordFragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyRecordFragment2}, this, changeQuickRedirect, false, 85570, new Class[]{StoryRecordFragment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyRecordFragment2, "$receiver");
            storyRecordFragment.a().j();
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = storyRecordFragment2.j;
            if (bVar != null) {
                bVar.a(false, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<StoryRecordFragment, Unit> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryRecordFragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryRecordFragment storyRecordFragment) {
            StoryRecordFragment storyRecordFragment2 = storyRecordFragment;
            if (PatchProxy.isSupport(new Object[]{storyRecordFragment2}, this, changeQuickRedirect, false, 85571, new Class[]{StoryRecordFragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyRecordFragment2}, this, changeQuickRedirect, false, 85571, new Class[]{StoryRecordFragment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyRecordFragment2, "$receiver");
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = storyRecordFragment2.j;
            if (bVar != null) {
                bVar.b(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<StoryRecordFragment, Unit> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryRecordFragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryRecordFragment storyRecordFragment) {
            StoryRecordFragment storyRecordFragment2 = storyRecordFragment;
            if (PatchProxy.isSupport(new Object[]{storyRecordFragment2}, this, changeQuickRedirect, false, 85572, new Class[]{StoryRecordFragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyRecordFragment2}, this, changeQuickRedirect, false, 85572, new Class[]{StoryRecordFragment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyRecordFragment2, "$receiver");
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = storyRecordFragment2.j;
            if (bVar != null) {
                bVar.b(false);
            }
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f4172a, false, 85564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4172a, false, 85564, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4172a, false, 85565, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4172a, false, 85565, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f4172a, false, 85552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4172a, false, 85552, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        StoryRecordFragment.a.a(false);
        com.ss.android.ugc.aweme.base.activity.c.b(this, 3);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4172a, false, 85553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4172a, false, 85553, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().c(this);
        }
        StoryRecordFragment.a.a(false);
    }

    @Subscribe
    public final void closeStoryPublish(@NotNull com.ss.android.ugc.aweme.main.c.a aVar) {
        com.ss.android.ugc.aweme.main.c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f4172a, false, 85560, new Class[]{com.ss.android.ugc.aweme.main.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f4172a, false, 85560, new Class[]{com.ss.android.ugc.aweme.main.c.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        finish();
    }

    public final void b(@NotNull Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f4172a, false, 85558, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f4172a, false, 85558, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        a(fragment2, (Function1<? super StoryRecordFragment, Unit>) e.INSTANCE);
    }

    public final void c(@NotNull Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f4172a, false, 85559, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f4172a, false, 85559, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        a(fragment2, (Function1<? super StoryRecordFragment, Unit>) c.INSTANCE);
    }

    public final void a(@NotNull Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f4172a, false, 85557, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f4172a, false, 85557, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        a(fragment2, (Function1<? super StoryRecordFragment, Unit>) d.INSTANCE);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f4172a, false, 85550, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f4172a, false, 85550, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordActivity", "onCreate", true);
        super.onCreate(bundle);
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            com.ss.android.ugc.aweme.base.activity.c.a(this, 3);
        }
        getWindow().addFlags(SearchJediMixFeedAdapter.f42517f);
        if (ToolUtils.isFlyme()) {
            StatusBarUtils.setTranslucent(this);
        } else {
            StatusBarUtils.setTransparent(this);
        }
        org.greenrobot.eventbus.c.a().a((Object) this);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("extra_launch_type", 1);
            if (getIntent().hasExtra("shoot_way")) {
                bundle2.putString("shoot_way", getIntent().getStringExtra("shoot_way"));
            }
            bundle2.putString("enter_from", getIntent().getStringExtra("enter_from"));
            bundle2.putString("enter_method", getIntent().getStringExtra("enter_method"));
            bundle2.putString("creation_id", getIntent().getStringExtra("creation_id"));
            bundle2.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", getIntent().getStringExtra("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE"));
            bundle2.putSerializable("send_to_user_head", getIntent().getSerializableExtra("send_to_user_head"));
            this.f4173b = StoryRecordFragment.m.a(bundle2);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            StoryRecordFragment storyRecordFragment = this.f4173b;
            if (storyRecordFragment == null) {
                Intrinsics.throwNpe();
            }
            beginTransaction.add(16908290, (Fragment) storyRecordFragment).commit();
        }
        StoryRecordFragment.a.a(true);
        try {
            ai.a();
        } catch (Exception e2) {
            Exception exc = e2;
            com.ss.android.ugc.aweme.util.c.a("vesdk.monitorClear:" + exc.getMessage());
        }
        j.a(g.b(), getApplicationContext());
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(new StoryFragmentLifeCycleCallback(this), false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordActivity", "onCreate", false);
    }

    private final void a(@NotNull Fragment fragment, Function1<? super StoryRecordFragment, Unit> function1) {
        Fragment fragment2 = fragment;
        Function1<? super StoryRecordFragment, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{fragment2, function12}, this, f4172a, false, 85561, new Class[]{Fragment.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, function12}, this, f4172a, false, 85561, new Class[]{Fragment.class, Function1.class}, Void.TYPE);
            return;
        }
        if (fragment2 instanceof StoryRecordFragment) {
            function12.invoke(fragment2);
        }
    }

    public final boolean onKeyDown(int i, @NotNull KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent2}, this, f4172a, false, 85554, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent2}, this, f4172a, false, 85554, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(keyEvent2, "event");
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById == null) {
            int i2 = i;
        } else if (((AVRecordSurfaceFragment) findFragmentById).a(i, keyEvent2)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void b(@NotNull Fragment fragment, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{fragment, bundle}, this, f4172a, false, 85556, new Class[]{Fragment.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment, bundle}, this, f4172a, false, 85556, new Class[]{Fragment.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        a(fragment, (Function1<? super StoryRecordFragment, Unit>) new a<Object,Unit>(this));
    }

    public final void a(@NotNull Fragment fragment, @Nullable Bundle bundle) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, bundle}, this, f4172a, false, 85555, new Class[]{Fragment.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, bundle}, this, f4172a, false, 85555, new Class[]{Fragment.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        a(fragment2, (Function1<? super StoryRecordFragment, Unit>) b.INSTANCE);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f4172a, false, 85551, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f4172a, false, 85551, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        StoryRecordFragment storyRecordFragment = this.f4173b;
        if (storyRecordFragment != null) {
            storyRecordFragment.onActivityResult(i, i2, intent2);
        }
    }
}
