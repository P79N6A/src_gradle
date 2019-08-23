package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.WidgetListAdapter;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.choosemusic.b.b;
import com.ss.android.ugc.aweme.choosemusic.b.e;
import com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView;
import com.ss.android.ugc.aweme.choosemusic.view.StickerMusicView;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder;
import com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

public class DiscoverWidgetAdapter extends WidgetListAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f35759e;

    /* renamed from: f  reason: collision with root package name */
    public b f35760f;
    public e g;
    public int h;
    public int i;
    public boolean j;
    public f<com.ss.android.ugc.aweme.choosemusic.a.b> k;
    private int l;
    private RecyclerView m;
    private boolean n;
    private int o;

    public int getBasicItemCount() {
        if (this.n) {
            return this.h + 1;
        }
        return this.h;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35759e, false, 26466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35759e, false, 26466, new Class[0], Void.TYPE);
        } else if (((Integer) this.f34349c.b("music_position", -1)).intValue() != -1) {
            if (this.f35760f != null) {
                this.f35760f.a((MusicModel) null);
            }
            this.f34349c.a("music_position", (Object) -1);
            this.f34349c.a("music_index", (Object) -1);
        }
    }

    public int getBasicItemViewType(int i2) {
        if (this.n) {
            if (i2 == 0) {
                return this.o;
            }
            if (i2 == 1 && this.j) {
                return 3;
            }
            if (i2 == 2) {
                return 1;
            }
            return 2;
        } else if (i2 == 0 && this.j) {
            return 3;
        } else {
            if (i2 == 1) {
                return 1;
            }
            return 2;
        }
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f35759e, false, 26462, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f35759e, false, 26462, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.m = recyclerView;
        this.m.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35761a;

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35761a, false, 26467, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35761a, false, 26467, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                DiscoverWidgetAdapter.this.a(false);
            }
        });
    }

    public final void a(boolean z) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35759e, false, 26461, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35759e, false, 26461, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.m.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i4 = findFirstVisibleItemPosition;
            while (i4 <= findLastVisibleItemPosition) {
                View childAt = this.m.getChildAt(i4 - findFirstVisibleItemPosition);
                if (childAt != null) {
                    if (!this.mShowFooter || i4 != getBasicItemCount()) {
                        ListItemWidget a2 = a(i4);
                        if (a2 instanceof MusicBoardWidget) {
                            if (z) {
                                ((MusicBoardWidget) a2).e();
                            }
                            if (childAt.getTop() > 0) {
                                i2 = 0;
                            } else {
                                i2 = -childAt.getTop();
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            if (childAt.getBottom() > this.i) {
                                i3 = (measuredHeight + this.i) - childAt.getBottom();
                            } else {
                                i3 = childAt.getMeasuredHeight();
                            }
                            MusicBoardWidget musicBoardWidget = (MusicBoardWidget) a2;
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, musicBoardWidget, MusicBoardWidget.f36170b, false, 26987, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                MusicBoardWidget musicBoardWidget2 = musicBoardWidget;
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, musicBoardWidget2, MusicBoardWidget.f36170b, false, 26987, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            } else if (musicBoardWidget.f34346a != null) {
                                ((MusicBoardViewHolder) musicBoardWidget.f34346a).a(i2, i3, musicBoardWidget.t, musicBoardWidget.u);
                                musicBoardWidget.f();
                            }
                        }
                        i4++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final ListItemWidget b(int i2) {
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f35759e, false, 26463, new Class[]{Integer.TYPE}, ListItemWidget.class)) {
            return (ListItemWidget) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f35759e, false, 26463, new Class[]{Integer.TYPE}, ListItemWidget.class);
        }
        switch (getItemViewType(i2)) {
            case 1:
                MusicClassWidget musicClassWidget = new MusicClassWidget();
                if (this.n) {
                    i3 = i2 - 1;
                } else {
                    i3 = i2;
                }
                musicClassWidget.k = i3;
                musicClassWidget.l = musicClassWidget.k + 10086;
                return musicClassWidget;
            case 2:
                MusicBoardWidget musicBoardWidget = new MusicBoardWidget();
                musicBoardWidget.k = this.f35760f;
                musicBoardWidget.s = this.k;
                if (this.n) {
                    i4 = i2 - 1;
                } else {
                    i4 = i2;
                }
                musicBoardWidget.n = i4;
                musicBoardWidget.o = musicBoardWidget.n + 10086;
                return musicBoardWidget;
            case 3:
                MusicRadioWidget musicRadioWidget = new MusicRadioWidget();
                b bVar = this.f35760f;
                if (PatchProxy.isSupport(new Object[]{bVar}, musicRadioWidget, MusicRadioWidget.f36176b, false, 27009, new Class[]{b.class}, MusicRadioWidget.class)) {
                    musicRadioWidget = (MusicRadioWidget) PatchProxy.accessDispatch(new Object[]{bVar}, musicRadioWidget, MusicRadioWidget.f36176b, false, 27009, new Class[]{b.class}, MusicRadioWidget.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(bVar, "ISelectMusic");
                    musicRadioWidget.m = bVar;
                }
                musicRadioWidget.n = this.k;
                e eVar = this.g;
                if (PatchProxy.isSupport(new Object[]{eVar}, musicRadioWidget, MusicRadioWidget.f36176b, false, 27010, new Class[]{e.class}, MusicRadioWidget.class)) {
                    musicRadioWidget = (MusicRadioWidget) PatchProxy.accessDispatch(new Object[]{eVar}, musicRadioWidget, MusicRadioWidget.f36176b, false, 27010, new Class[]{e.class}, MusicRadioWidget.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(eVar, "postSelectMusicListener");
                    musicRadioWidget.o = eVar;
                }
                if (this.n) {
                    i5 = i2 - 1;
                } else {
                    i5 = i2;
                }
                musicRadioWidget.l = i5;
                return musicRadioWidget;
            case 4:
                StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
                stickerMusicWidget.k = this.f35760f;
                stickerMusicWidget.p = this.k;
                stickerMusicWidget.q = this.g;
                stickerMusicWidget.m = -2;
                stickerMusicWidget.n = stickerMusicWidget.m + 10086;
                return stickerMusicWidget;
            case 5:
                ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
                challengeMusicWidget.l = this.f35760f;
                challengeMusicWidget.q = this.k;
                challengeMusicWidget.r = this.g;
                challengeMusicWidget.n = -2;
                challengeMusicWidget.o = challengeMusicWidget.n + 10086;
                return challengeMusicWidget;
            default:
                return null;
        }
    }

    public final void a(boolean z, int i2) {
        this.n = true;
        this.o = i2;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        View view;
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f35759e, false, 26464, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f35759e, false, 26464, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i3 == 1) {
            return new MusicClassViewHolder(a(LayoutInflater.from(viewGroup.getContext()), viewGroup2, i3));
        } else {
            switch (i3) {
                case 3:
                    MusicRadioViewHolder.a aVar = MusicRadioViewHolder.w;
                    LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                    if (PatchProxy.isSupport(new Object[]{from, viewGroup2}, aVar, MusicRadioViewHolder.a.f36145a, false, 26960, new Class[]{LayoutInflater.class, ViewGroup.class}, View.class)) {
                        MusicRadioViewHolder.a aVar2 = aVar;
                        view = (View) PatchProxy.accessDispatch(new Object[]{from, viewGroup2}, aVar2, MusicRadioViewHolder.a.f36145a, false, 26960, new Class[]{LayoutInflater.class, ViewGroup.class}, View.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(from, "inflater");
                        Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
                        view = from.inflate(C0906R.layout.xw, viewGroup2, false);
                        Intrinsics.checkExpressionValueIsNotNull(view, "inflater.inflate(R.layou…_radio, viewGroup, false)");
                    }
                    return new MusicRadioViewHolder(view);
                case 4:
                    StickerMusicView stickerMusicView = new StickerMusicView(a(LayoutInflater.from(viewGroup.getContext()), viewGroup2, i3), this.l);
                    stickerMusicView.f36041e = ((Boolean) this.f34349c.a("mvtheme_music_type")).booleanValue();
                    return stickerMusicView;
                case 5:
                    return new ChallengeMusicView(a(LayoutInflater.from(viewGroup.getContext()), viewGroup2, i3), this.l);
                default:
                    return new MusicBoardViewHolder(a(LayoutInflater.from(viewGroup.getContext()), viewGroup2, i3), this.l);
            }
        }
    }

    private View a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, Integer.valueOf(i2)}, this, f35759e, false, 26465, new Class[]{LayoutInflater.class, ViewGroup.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, Integer.valueOf(i2)}, this, f35759e, false, 26465, new Class[]{LayoutInflater.class, ViewGroup.class, Integer.TYPE}, View.class);
        } else if (i3 == 1) {
            return layoutInflater2.inflate(C0906R.layout.a6m, viewGroup2, false);
        } else {
            if (i3 == 5 || i3 == 4) {
                return layoutInflater2.inflate(C0906R.layout.a1m, viewGroup2, false);
            }
            return layoutInflater2.inflate(C0906R.layout.a6l, viewGroup2, false);
        }
    }

    public DiscoverWidgetAdapter(WidgetManager widgetManager, DataCenter dataCenter, b bVar, e eVar, f<com.ss.android.ugc.aweme.choosemusic.a.b> fVar, int i2) {
        super(widgetManager, dataCenter);
        this.f35760f = bVar;
        this.g = eVar;
        this.k = fVar;
        this.l = i2;
    }
}
