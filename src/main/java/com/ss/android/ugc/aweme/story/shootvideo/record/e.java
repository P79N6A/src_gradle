package com.ss.android.ugc.aweme.story.shootvideo.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryBottomTabHostPresenter;", "", "fragment", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "bottomTab", "Lcom/ss/android/ugc/aweme/story/widget/TabHost;", "tabChangeListener", "Lcom/ss/android/ugc/aweme/story/widget/TabHost$OnTabIndexChangedListener;", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;Lcom/ss/android/ugc/aweme/story/widget/TabHost;Lcom/ss/android/ugc/aweme/story/widget/TabHost$OnTabIndexChangedListener;)V", "isChangeByUser", "", "()Z", "setChangeByUser", "(Z)V", "getCurrentIndex", "", "getDefaultRecordModeIndex", "isNormalRecordMode", "isSceneRecordMode", "isStoryBoomMode", "setCurrentIndex", "", "index", "hasAnimate", "Companion", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73922a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f73923c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f73924b = true;

    /* renamed from: d  reason: collision with root package name */
    private final TabHost f73925d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryBottomTabHostPresenter$Companion;", "", "()V", "STORY_BOOM_MODE", "", "STORY_NORMAL_MODE", "STORY_SCENE_MODE", "STORY_TEXT_MODE", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f73922a, false, 85527, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73922a, false, 85527, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f73925d.getCurrentIndex() == 2) {
            z = true;
        }
        return z;
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f73922a, false, 85528, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73922a, false, 85528, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f73925d.getCurrentIndex() == 3) {
            z = true;
        }
        return z;
    }

    public e(@NotNull final StoryRecordFragment storyRecordFragment, @NotNull TabHost tabHost, @NotNull final TabHost.a aVar) {
        Intrinsics.checkParameterIsNotNull(storyRecordFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(tabHost, "bottomTab");
        Intrinsics.checkParameterIsNotNull(aVar, "tabChangeListener");
        this.f73925d = tabHost;
        this.f73925d.setOnIndexChangedListener(new TabHost.a(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73926a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f73927b;

            {
                this.f73927b = r1;
            }

            public final void a(int i, int i2) {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f73926a, false, 85529, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f73926a, false, 85529, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                aVar.a(i, i2);
                this.f73927b.f73924b = true;
                if (fc.a()) {
                    StoryRecordFragment storyRecordFragment = storyRecordFragment;
                    if (i2 == 0) {
                        z = true;
                    }
                    storyRecordFragment.e(z);
                }
            }
        });
    }

    public static /* synthetic */ void a(e eVar, int i, boolean z, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), (byte) 0}, eVar, f73922a, false, 85525, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            e eVar2 = eVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), (byte) 0}, eVar2, f73922a, false, 85525, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        eVar.f73924b = false;
        eVar.f73925d.setIndexWithoutAnim(i);
    }
}
