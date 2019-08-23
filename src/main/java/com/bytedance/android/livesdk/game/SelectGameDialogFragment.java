package com.bytedance.android.livesdk.game;

import android.app.Dialog;
import android.arch.lifecycle.Lifecycle;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.autodispose.ae;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.v.j;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class SelectGameDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14636a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnDismissListener f14637b;

    /* renamed from: c  reason: collision with root package name */
    GamesAdapter f14638c;

    /* renamed from: d  reason: collision with root package name */
    private CircularProgressView f14639d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f14640e;

    /* renamed from: f  reason: collision with root package name */
    private Game f14641f;
    private a g;

    static class GameVH extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14645a;

        /* renamed from: b  reason: collision with root package name */
        public final View f14646b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f14647c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f14648d;

        private GameVH(View view) {
            super(view);
            this.f14647c = (ImageView) view.findViewById(C0906R.id.aqu);
            this.f14648d = (TextView) view.findViewById(C0906R.id.bpt);
            this.f14646b = view.findViewById(C0906R.id.lx);
        }

        /* synthetic */ GameVH(View view, byte b2) {
            this(view);
        }
    }

    static class GamesAdapter extends RecyclerView.Adapter<GameVH> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14649a;

        /* renamed from: b  reason: collision with root package name */
        final List<Game> f14650b;

        /* renamed from: c  reason: collision with root package name */
        public a f14651c;

        /* renamed from: d  reason: collision with root package name */
        Game f14652d;

        private GamesAdapter() {
            this.f14650b = new ArrayList();
        }

        public int getItemCount() {
            if (PatchProxy.isSupport(new Object[0], this, f14649a, false, 9197, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14649a, false, 9197, new Class[0], Integer.TYPE)).intValue();
            } else if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
                return this.f14650b.size() + 1;
            } else {
                return this.f14650b.size();
            }
        }

        /* synthetic */ GamesAdapter(byte b2) {
            this();
        }

        public long getItemId(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14649a, false, 9198, new Class[]{Integer.TYPE}, Long.TYPE)) {
                return this.f14650b.get(i).gameId;
            }
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14649a, false, 9198, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        }

        public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            int i2;
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f14649a, false, 9195, new Class[]{ViewGroup.class, Integer.TYPE}, GameVH.class)) {
                return (GameVH) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f14649a, false, 9195, new Class[]{ViewGroup.class, Integer.TYPE}, GameVH.class);
            }
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
                i2 = C0906R.layout.aja;
            } else {
                i2 = C0906R.layout.aj_;
            }
            return new GameVH(from.inflate(i2, viewGroup2, false), (byte) 0);
        }

        public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            GameVH gameVH = (GameVH) viewHolder;
            if (PatchProxy.isSupport(new Object[]{gameVH, Integer.valueOf(i)}, this, f14649a, false, 9196, new Class[]{GameVH.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gameVH, Integer.valueOf(i)}, this, f14649a, false, 9196, new Class[]{GameVH.class, Integer.TYPE}, Void.TYPE);
            } else if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1 && i == 0) {
                gameVH.f14647c.setImageResource(2130841374);
                gameVH.f14648d.setText(C0906R.string.dk7);
                if (this.f14652d == null) {
                    gameVH.f14646b.setVisibility(0);
                    gameVH.f14648d.setTextColor(ac.b((int) C0906R.color.ahr));
                } else {
                    gameVH.f14646b.setVisibility(4);
                    gameVH.f14648d.setTextColor(ac.b((int) C0906R.color.si));
                }
                gameVH.itemView.setOnClickListener(new d(this));
            } else {
                Game game = this.f14650b.get(i - ((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue());
                if (PatchProxy.isSupport(new Object[]{game}, gameVH, GameVH.f14645a, false, 9192, new Class[]{Game.class}, Void.TYPE)) {
                    GameVH gameVH2 = gameVH;
                    PatchProxy.accessDispatch(new Object[]{game}, gameVH2, GameVH.f14645a, false, 9192, new Class[]{Game.class}, Void.TYPE);
                } else {
                    if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
                        b.a(gameVH.f14647c, game.icon, gameVH.f14647c.getWidth(), gameVH.f14647c.getHeight(), 0);
                    } else {
                        b.b(gameVH.f14647c, game.icon, gameVH.f14647c.getWidth(), gameVH.f14647c.getHeight(), 0);
                    }
                    gameVH.f14648d.setText(game.name);
                }
                if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
                    if (this.f14652d == null || game.gameId != this.f14652d.gameId) {
                        gameVH.f14646b.setVisibility(4);
                        gameVH.f14648d.setTextColor(ac.b((int) C0906R.color.si));
                    } else {
                        gameVH.f14646b.setVisibility(0);
                        gameVH.f14648d.setTextColor(ac.b((int) C0906R.color.ahr));
                    }
                }
                gameVH.itemView.setOnClickListener(new e(this, game));
            }
        }
    }

    public interface a {
        void a(Game game);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f14636a, false, 9184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14636a, false, 9184, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.onDestroyView();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14636a, false, 9186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14636a, false, 9186, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14639d.getVisibility() == 0) {
            this.f14639d.c();
            this.f14639d.setVisibility(8);
        }
    }

    public final void a(a aVar) {
        this.g = aVar;
        if (this.f14638c != null) {
            this.f14638c.f14651c = aVar;
        }
    }

    public static SelectGameDialogFragment a(Game game) {
        Game game2 = game;
        if (PatchProxy.isSupport(new Object[]{game2}, null, f14636a, true, 9178, new Class[]{Game.class}, SelectGameDialogFragment.class)) {
            return (SelectGameDialogFragment) PatchProxy.accessDispatch(new Object[]{game2}, null, f14636a, true, 9178, new Class[]{Game.class}, SelectGameDialogFragment.class);
        }
        SelectGameDialogFragment selectGameDialogFragment = new SelectGameDialogFragment();
        selectGameDialogFragment.f14641f = game2;
        return selectGameDialogFragment;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f14636a, false, 9187, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f14636a, false, 9187, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.f14637b != null) {
            this.f14637b.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f14636a, false, 9182, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f14636a, false, 9182, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f14636a, false, 9179, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f14636a, false, 9179, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
            i = C0906R.style.vm;
        } else {
            i = C0906R.style.wj;
        }
        setStyle(1, i);
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f14636a, false, 9180, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f14636a, false, 9180, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f14636a, false, 9183, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f14636a, false, 9183, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f14639d = (CircularProgressView) view2.findViewById(C0906R.id.c81);
        this.f14640e = (RecyclerView) view2.findViewById(C0906R.id.ccc);
        this.f14640e.setLayoutManager(new GridLayoutManager(getContext(), 4, 1, false));
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 0) {
            this.f14640e.addItemDecoration(new RecyclerView.ItemDecoration() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14642a;

                /* renamed from: b  reason: collision with root package name */
                final int f14643b = SelectGameDialogFragment.this.getResources().getDimensionPixelSize(C0906R.dimen.pz);

                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    Rect rect2 = rect;
                    View view2 = view;
                    RecyclerView recyclerView2 = recyclerView;
                    if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f14642a, false, 9191, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f14642a, false, 9191, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                    } else if (recyclerView2.getChildAdapterPosition(view2) < 4) {
                        rect2.set(0, this.f14643b, 0, this.f14643b);
                    } else {
                        rect2.set(0, 0, 0, this.f14643b);
                    }
                }
            });
        }
        this.f14638c = new GamesAdapter((byte) 0);
        this.f14638c.f14651c = this.g;
        GamesAdapter gamesAdapter = this.f14638c;
        Game game = this.f14641f;
        if (PatchProxy.isSupport(new Object[]{game}, gamesAdapter, GamesAdapter.f14649a, false, 9193, new Class[]{Game.class}, Void.TYPE)) {
            GamesAdapter gamesAdapter2 = gamesAdapter;
            PatchProxy.accessDispatch(new Object[]{game}, gamesAdapter2, GamesAdapter.f14649a, false, 9193, new Class[]{Game.class}, Void.TYPE);
        } else {
            gamesAdapter.f14652d = game;
            gamesAdapter.notifyDataSetChanged();
        }
        this.f14640e.setAdapter(this.f14638c);
        if (PatchProxy.isSupport(new Object[0], this, f14636a, false, 9185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14636a, false, 9185, new Class[0], Void.TYPE);
        } else {
            if (this.f14639d.getVisibility() != 0) {
                this.f14639d.setVisibility(0);
            }
            this.f14639d.a();
        }
        ((ab) ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getLiveGameList(((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue()).compose(i.a()).doOnSubscribe(new a(this)).as(e.a((ae) com.bytedance.android.live.core.rxutils.autodispose.a.a(this, Lifecycle.Event.ON_DESTROY)))).a(new b(this), new c(this));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f14636a, false, 9181, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f14636a, false, 9181, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
            i = C0906R.layout.ahd;
        } else {
            i = C0906R.layout.ahc;
        }
        return (ViewGroup) from.inflate(i, null);
    }
}
