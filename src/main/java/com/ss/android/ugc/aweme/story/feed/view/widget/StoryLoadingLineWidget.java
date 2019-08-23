package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.view.ui.AudioControlView;
import com.ss.android.ugc.aweme.story.feed.view.ui.StoryLoadingLine;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.player.c;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.e;

public class StoryLoadingLineWidget extends BaseFeedBottomWidget {
    public static ChangeQuickRedirect p;
    public StoryLoadingLine q;
    public AudioControlView r;
    AnimatorSet s;
    AnimatorSet t;
    AnimatorSet u;
    private a v;

    public final int i() {
        return C0906R.layout.at0;
    }

    public final boolean m() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84338, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, p, false, 84338, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (d().getActivity() == null) {
            return false;
        } else {
            b b2 = StoryChange.b(d().getActivity());
            if (b2 != null && g.a(b2, this.f4154b)) {
                z = true;
            }
            return z;
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84333, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("story_show_loading", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("story_hide_loading", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
        this.v = new com.ss.android.ugc.aweme.story.player.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72933a;

            public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f72933a, false, 84342, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f72933a, false, 84342, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
                    return;
                }
                super.a(aVar);
                if (StoryLoadingLineWidget.this.m()) {
                    StoryLoadingLineWidget.this.q.b();
                }
            }

            public final void b(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72933a, false, 84340, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72933a, false, 84340, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                super.b(z);
                if (StoryLoadingLineWidget.this.m()) {
                    StoryLoadingLineWidget.this.q.a();
                }
            }

            public final void a(e eVar) {
                if (PatchProxy.isSupport(new Object[]{eVar}, this, f72933a, false, 84341, new Class[]{e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar}, this, f72933a, false, 84341, new Class[]{e.class}, Void.TYPE);
                    return;
                }
                super.a(eVar);
                if (StoryLoadingLineWidget.this.m()) {
                    StoryLoadingLineWidget.this.q.b();
                }
            }
        };
        c.d().a(this.v);
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84334, new Class[0], Void.TYPE);
            return;
        }
        StoryDetailActivity storyDetailActivity = (StoryDetailActivity) c();
        AnonymousClass2 r9 = new StoryDetailActivity.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72935a;

            public final boolean a(int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f72935a, false, 84343, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f72935a, false, 84343, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (!StoryLoadingLineWidget.this.m()) {
                    return false;
                } else {
                    switch (i) {
                        case 24:
                            StoryLoadingLineWidget storyLoadingLineWidget = StoryLoadingLineWidget.this;
                            if (PatchProxy.isSupport(new Object[0], storyLoadingLineWidget, StoryLoadingLineWidget.p, false, 84336, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], storyLoadingLineWidget, StoryLoadingLineWidget.p, false, 84336, new Class[0], Void.TYPE);
                            } else {
                                storyLoadingLineWidget.t = new AnimatorSet();
                                storyLoadingLineWidget.t.play(storyLoadingLineWidget.r.getShowVolumeAnim()).after(storyLoadingLineWidget.q.getHideAnim());
                                storyLoadingLineWidget.t.addListener(new AnimatorListenerAdapter() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f72939a;

                                    public final void onAnimationEnd(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f72939a, false, 84345, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f72939a, false, 84345, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        AudioControlView audioControlView = StoryLoadingLineWidget.this.r;
                                        if (PatchProxy.isSupport(new Object[]{(byte) 0}, audioControlView, AudioControlView.f72792a, false, 84094, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{(byte) 0}, audioControlView, AudioControlView.f72792a, false, 84094, new Class[]{Boolean.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        audioControlView.a();
                                        audioControlView.b();
                                        audioControlView.f72797f += audioControlView.f72796e;
                                        if (audioControlView.f72797f > audioControlView.f72795d) {
                                            audioControlView.f72797f = audioControlView.f72795d;
                                        }
                                        audioControlView.c();
                                        audioControlView.d();
                                    }
                                });
                                storyLoadingLineWidget.t.start();
                            }
                            return true;
                        case 25:
                            StoryLoadingLineWidget storyLoadingLineWidget2 = StoryLoadingLineWidget.this;
                            if (PatchProxy.isSupport(new Object[0], storyLoadingLineWidget2, StoryLoadingLineWidget.p, false, 84337, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], storyLoadingLineWidget2, StoryLoadingLineWidget.p, false, 84337, new Class[0], Void.TYPE);
                            } else {
                                storyLoadingLineWidget2.s = new AnimatorSet();
                                storyLoadingLineWidget2.s.play(storyLoadingLineWidget2.r.getShowVolumeAnim()).after(storyLoadingLineWidget2.q.getHideAnim());
                                storyLoadingLineWidget2.s.addListener(new AnimatorListenerAdapter() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f72941a;

                                    public final void onAnimationEnd(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f72941a, false, 84346, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f72941a, false, 84346, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        AudioControlView audioControlView = StoryLoadingLineWidget.this.r;
                                        if (PatchProxy.isSupport(new Object[]{(byte) 0}, audioControlView, AudioControlView.f72792a, false, 84092, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{(byte) 0}, audioControlView, AudioControlView.f72792a, false, 84092, new Class[]{Boolean.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        audioControlView.a();
                                        audioControlView.b();
                                        audioControlView.f72797f -= audioControlView.f72796e;
                                        if (audioControlView.f72797f < 0) {
                                            audioControlView.f72797f = 0;
                                        }
                                        audioControlView.c();
                                        audioControlView.d();
                                    }
                                });
                                storyLoadingLineWidget2.s.start();
                            }
                            return true;
                        default:
                            return false;
                    }
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{r9}, storyDetailActivity, StoryDetailActivity.f72443c, false, 83189, new Class[]{StoryDetailActivity.a.class}, Void.TYPE)) {
            StoryDetailActivity storyDetailActivity2 = storyDetailActivity;
            PatchProxy.accessDispatch(new Object[]{r9}, storyDetailActivity2, StoryDetailActivity.f72443c, false, 83189, new Class[]{StoryDetailActivity.a.class}, Void.TYPE);
        } else {
            storyDetailActivity.f72446f.add(r9);
        }
        this.r.setOnAudioControlViewHideListener(new AudioControlView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72937a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f72937a, false, 84344, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72937a, false, 84344, new Class[0], Void.TYPE);
                    return;
                }
                StoryLoadingLineWidget storyLoadingLineWidget = StoryLoadingLineWidget.this;
                if (PatchProxy.isSupport(new Object[0], storyLoadingLineWidget, StoryLoadingLineWidget.p, false, 84335, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], storyLoadingLineWidget, StoryLoadingLineWidget.p, false, 84335, new Class[0], Void.TYPE);
                    return;
                }
                storyLoadingLineWidget.u = new AnimatorSet();
                storyLoadingLineWidget.u.play(storyLoadingLineWidget.q.getShowAnim()).after(storyLoadingLineWidget.r.getHideVolumeAnim());
                storyLoadingLineWidget.u.start();
            }
        });
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84332, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        c.d().b(this.v);
        if (this.q != null) {
            StoryLoadingLine storyLoadingLine = this.q;
            if (PatchProxy.isSupport(new Object[0], storyLoadingLine, StoryLoadingLine.f72804a, false, 84112, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyLoadingLine, StoryLoadingLine.f72804a, false, 84112, new Class[0], Void.TYPE);
                return;
            }
            if (storyLoadingLine.f72806c != null) {
                storyLoadingLine.f72806c.removeAllUpdateListeners();
                storyLoadingLine.f72806c.cancel();
            }
            if (storyLoadingLine.f72807d != null) {
                storyLoadingLine.f72807d.removeAllListeners();
                storyLoadingLine.f72807d.cancel();
            }
            if (storyLoadingLine.f72808e != null) {
                storyLoadingLine.f72808e.removeAllListeners();
                storyLoadingLine.f72808e.cancel();
            }
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 84331, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 84331, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.q = (StoryLoadingLine) view.findViewById(C0906R.id.bja);
        this.q.a();
        this.r = (AudioControlView) view.findViewById(C0906R.id.gk);
    }

    /* renamed from: a */
    public final void onChanged(@Nullable com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, p, false, 84339, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, p, false, 84339, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        super.onChanged(aVar);
        if (aVar != null && this.i) {
            String str = aVar.f34376a;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1355650487) {
                if (hashCode == 1525120260 && str.equals("story_show_loading")) {
                    c2 = 0;
                }
            } else if (str.equals("story_hide_loading")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    this.q.a();
                    return;
                case 1:
                    this.q.b();
                    break;
            }
        }
    }
}
