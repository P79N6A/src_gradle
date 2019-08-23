package com.ss.android.ugc.aweme.im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.PopupWindow;
import com.alibaba.fastjson.JSON;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.uikit.toast.PopupToast;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.b.a.g;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.e.k;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.o;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IFollowService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.i;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodWindowContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareRankingListContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.VideoUpdateTipsContent;
import com.ss.android.ugc.aweme.im.sdk.chat.n;
import com.ss.android.ugc.aweme.im.sdk.chat.net.f;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.LoadMoreViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VoiceMessageViewHolder;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog;
import com.ss.android.ugc.aweme.im.sdk.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity;
import com.ss.android.ugc.aweme.im.sdk.resources.k;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.ai;
import com.ss.android.ugc.aweme.im.sdk.utils.as;
import com.ss.android.ugc.aweme.im.sdk.utils.ay;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity;
import com.ss.android.ugc.aweme.im.sdk.widget.DragView;
import com.ss.android.ugc.aweme.im.sdk.widget.f;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class MessageAdapter extends RecyclerView.Adapter<BaseViewHolder> implements n.a, com.ss.android.ugc.aweme.im.sdk.story.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50217a;

    /* renamed from: b  reason: collision with root package name */
    int f50218b;

    /* renamed from: c  reason: collision with root package name */
    public o f50219c;

    /* renamed from: d  reason: collision with root package name */
    public List<com.bytedance.im.core.d.n> f50220d;

    /* renamed from: e  reason: collision with root package name */
    public List<com.bytedance.im.core.d.n> f50221e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f50222f;
    public f g;
    public PopupToast h;
    public com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c i;
    public com.bytedance.im.core.d.n j;
    public com.bytedance.im.core.d.n k;
    public boolean l = true;
    public o m;
    public c n;
    public b o;
    private LoadMoreViewHolder p;
    private View.OnClickListener q;
    private View.OnLongClickListener r;
    private f.a s;
    private i t;
    private Handler u;
    private IMUser v;
    private boolean w;
    private com.bytedance.im.core.d.n x;
    private int y;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemType {
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50258a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.im.core.d.n f50259b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f50258a, false, 50390, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50258a, false, 50390, new Class[0], Void.TYPE);
                return;
            }
            final String str = null;
            BaseContent content = m.content(this.f50259b);
            if (content instanceof ShareUserContent) {
                str = ((ShareUserContent) content).getUid();
            } else if (content instanceof ShareAwemeContent) {
                str = ((ShareAwemeContent) content).getUser();
            } else if (content instanceof ShareLiveContent) {
                str = ((ShareLiveContent) content).getRoomOwnerId();
            }
            if (content != null && !TextUtils.isEmpty(str)) {
                z a2 = z.a();
                String conversationId = MessageAdapter.this.m.getConversationId();
                if (PatchProxy.isSupport(new Object[]{conversationId, str}, a2, z.f52670a, false, 53551, new Class[]{String.class, String.class}, Void.TYPE)) {
                    z zVar = a2;
                    PatchProxy.accessDispatch(new Object[]{conversationId, str}, zVar, z.f52670a, false, 53551, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    r.a(GlobalContext.getContext(), "follow", "chat", str, e.a(conversationId));
                }
                z a3 = z.a();
                String conversationId2 = MessageAdapter.this.m.getConversationId();
                if (PatchProxy.isSupport(new Object[]{conversationId2}, a3, z.f52670a, false, 53552, new Class[]{String.class}, Void.TYPE)) {
                    z zVar2 = a3;
                    PatchProxy.accessDispatch(new Object[]{conversationId2}, zVar2, z.f52670a, false, 53552, new Class[]{String.class}, Void.TYPE);
                } else {
                    long a4 = e.a(conversationId2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("to_user_id", a4);
                    hashMap.put("previous_page", "message");
                    hashMap.put("previous_page_position", "other_places");
                    hashMap.put("enter_from", "chat");
                    hashMap.put("enter_method", "follow_button");
                    r.a("follow", (Map) hashMap);
                }
                ((IFollowService) ServiceManager.get().getService(IFollowService.class)).sendRequest(str, 1, new IFollowService.IFollowCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50261a;

                    public final void onFollowSuccess() {
                        IMUser iMUser;
                        IMUser iMUser2;
                        IMUser iMUser3;
                        if (PatchProxy.isSupport(new Object[0], this, f50261a, false, 50391, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50261a, false, 50391, new Class[0], Void.TYPE);
                        } else if (MessageAdapter.this.f50220d.indexOf(a.this.f50259b) >= 0) {
                            BaseContent content = m.content(a.this.f50259b);
                            if (content instanceof ShareAwemeContent) {
                                ShareAwemeContent shareAwemeContent = (ShareAwemeContent) content;
                                if (PatchProxy.isSupport(new Object[]{shareAwemeContent}, null, com.ss.android.ugc.aweme.im.sdk.d.e.f51217a, true, 51744, new Class[]{ShareAwemeContent.class}, IMUser.class)) {
                                    iMUser3 = (IMUser) PatchProxy.accessDispatch(new Object[]{shareAwemeContent}, null, com.ss.android.ugc.aweme.im.sdk.d.e.f51217a, true, 51744, new Class[]{ShareAwemeContent.class}, IMUser.class);
                                } else {
                                    iMUser3 = new IMUser();
                                    iMUser3.setNickName(shareAwemeContent.getContentName());
                                    iMUser3.setAvatarThumb(shareAwemeContent.getContentThumb());
                                    iMUser3.setSignature("");
                                    iMUser3.setUid(shareAwemeContent.getUser());
                                }
                                iMUser3.setFollowStatus(1);
                                com.ss.android.ugc.aweme.im.sdk.d.e.a().a(iMUser3);
                            } else if (content instanceof ShareUserContent) {
                                ShareUserContent shareUserContent = (ShareUserContent) content;
                                if (PatchProxy.isSupport(new Object[]{shareUserContent}, null, com.ss.android.ugc.aweme.im.sdk.d.e.f51217a, true, 51745, new Class[]{ShareUserContent.class}, IMUser.class)) {
                                    iMUser2 = (IMUser) PatchProxy.accessDispatch(new Object[]{shareUserContent}, null, com.ss.android.ugc.aweme.im.sdk.d.e.f51217a, true, 51745, new Class[]{ShareUserContent.class}, IMUser.class);
                                } else {
                                    iMUser2 = new IMUser();
                                    iMUser2.setNickName(shareUserContent.getName());
                                    iMUser2.setAvatarThumb(shareUserContent.getAvatar());
                                    iMUser2.setSignature("");
                                    iMUser2.setUid(shareUserContent.getUid());
                                }
                                iMUser2.setFollowStatus(1);
                                com.ss.android.ugc.aweme.im.sdk.d.e.a().a(iMUser2);
                            } else if (content instanceof ShareLiveContent) {
                                ShareLiveContent shareLiveContent = (ShareLiveContent) content;
                                if (PatchProxy.isSupport(new Object[]{shareLiveContent}, null, com.ss.android.ugc.aweme.im.sdk.d.e.f51217a, true, 51746, new Class[]{ShareLiveContent.class}, IMUser.class)) {
                                    iMUser = (IMUser) PatchProxy.accessDispatch(new Object[]{shareLiveContent}, null, com.ss.android.ugc.aweme.im.sdk.d.e.f51217a, true, 51746, new Class[]{ShareLiveContent.class}, IMUser.class);
                                } else {
                                    iMUser = new IMUser();
                                    iMUser.setNickName(shareLiveContent.getRoomOwnerName());
                                    iMUser.setAvatarThumb(shareLiveContent.getRoomOwnerAvatar());
                                    iMUser.setSignature("");
                                    iMUser.setUid(shareLiveContent.getRoomOwnerId());
                                }
                                iMUser.setFollowStatus(1);
                                com.ss.android.ugc.aweme.im.sdk.d.e.a().a(iMUser);
                            }
                            MessageAdapter.this.b();
                            com.ss.android.b.a.a.a.a(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f50264a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f50264a, false, 50393, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f50264a, false, 50393, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    UserStruct userStruct = null;
                                    try {
                                        userStruct = (UserStruct) com.ss.android.ugc.aweme.im.sdk.utils.r.a().queryUser(str, j.f51270d.a(com.ss.android.ugc.aweme.im.sdk.d.e.a().b(str), str)).get();
                                    } catch (InterruptedException | ExecutionException unused) {
                                    }
                                    if (!(userStruct == null || userStruct.getUser() == null)) {
                                        com.ss.android.ugc.aweme.im.sdk.d.e.a().a(IMUser.fromUser(userStruct.getUser()));
                                    }
                                }
                            });
                            if (MessageAdapter.this.f50222f != null) {
                                UIUtils.displayToast(MessageAdapter.this.f50222f.getContext(), (int) C0906R.string.arp);
                            }
                        }
                    }

                    public final void onFollowFailed(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f50261a, false, 50392, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f50261a, false, 50392, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        if (MessageAdapter.this.f50222f != null) {
                            UIUtils.displayToast(MessageAdapter.this.f50222f.getContext(), (int) C0906R.string.az3);
                        }
                    }
                });
            }
        }

        public a(com.bytedance.im.core.d.n nVar) {
            this.f50259b = nVar;
        }
    }

    interface b {
        void a(String str);
    }

    interface c {
        void a();
    }

    public final void a(List<com.bytedance.im.core.d.n> list, int i2) {
        List<com.bytedance.im.core.d.n> list2 = list;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i2)}, this, f50217a, false, 50323, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i2)}, this, f50217a, false, 50323, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (list2 != null && !list.isEmpty()) {
            Message obtainMessage = this.u.obtainMessage(1);
            com.bytedance.im.core.d.n nVar = list2.get(0);
            switch (i2) {
                case 0:
                    if (this.f50220d.contains(nVar)) {
                        obtainMessage = this.u.obtainMessage(2);
                        break;
                    } else {
                        obtainMessage = this.u.obtainMessage(5);
                        break;
                    }
                case 1:
                    if (this.f50220d.contains(nVar)) {
                        obtainMessage = this.u.obtainMessage(2);
                        break;
                    } else {
                        obtainMessage = this.u.obtainMessage(5);
                        break;
                    }
                case 2:
                    this.i.a(list2);
                    if (!this.m.isStrangerChat()) {
                        if (list.size() == 1 && !this.f50220d.contains(nVar)) {
                            obtainMessage = this.u.obtainMessage(5);
                            break;
                        } else {
                            obtainMessage = this.u.obtainMessage(2);
                            break;
                        }
                    } else {
                        obtainMessage = this.u.obtainMessage(2);
                        this.m.setChatType(0);
                        break;
                    }
                    break;
                case 3:
                    this.i.c(nVar);
                    break;
                case 4:
                    if (list.size() == this.f50219c.f21292c) {
                        z = true;
                    }
                    this.l = z;
                    this.i.b(list2);
                    break;
                case 5:
                    this.l = list.size() == this.f50219c.f21292c;
                    this.i.c(list2);
                    if (!PatchProxy.isSupport(new Object[0], this, f50217a, false, 50338, new Class[0], Void.TYPE)) {
                        if (this.p != null) {
                            LoadMoreViewHolder loadMoreViewHolder = this.p;
                            if (PatchProxy.isSupport(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f51076a, false, 51478, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f51076a, false, 51478, new Class[0], Void.TYPE);
                            } else {
                                Animation animation = loadMoreViewHolder.f51077b.getAnimation();
                                if (animation != null) {
                                    animation.cancel();
                                }
                                loadMoreViewHolder.f51077b.clearAnimation();
                            }
                        }
                        if (this.y > 0 && this.y != this.f50219c.f21292c) {
                            this.f50219c.f21292c = this.y;
                            this.y = 0;
                        }
                        this.f50218b = 0;
                        if (!(this.f50220d.size() > 1 || this.f50222f == null || this.f50222f.getLayoutManager() == null)) {
                            this.f50222f.getLayoutManager().scrollToPosition(0);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50338, new Class[0], Void.TYPE);
                        break;
                    }
                case 6:
                    if (nVar.isRecalled()) {
                        this.i.c(nVar);
                        obtainMessage = this.u.obtainMessage(4);
                        break;
                    } else if (nVar.getMsgType() == 2 || nVar.getMsgType() == 17) {
                        obtainMessage = this.u.obtainMessage(2);
                        break;
                    } else if (nVar.getMsgType() == 32) {
                        obtainMessage = this.u.obtainMessage(1);
                        break;
                    } else {
                        return;
                    }
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    this.i.c(nVar);
                    obtainMessage = this.u.obtainMessage(2);
                    break;
            }
            obtainMessage.obj = list2;
            this.u.sendMessage(obtainMessage);
        }
    }

    public final void a(List<com.bytedance.im.core.d.n> list) {
        List<com.bytedance.im.core.d.n> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f50217a, false, 50328, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f50217a, false, 50328, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list2 != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f50221e.add(list2.get(size));
            }
        }
        a();
    }

    public final void a(String str, com.bytedance.im.core.d.n nVar, View view) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, nVar, view}, this, f50217a, false, 50357, new Class[]{String.class, com.bytedance.im.core.d.n.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, nVar, view}, this, f50217a, false, 50357, new Class[]{String.class, com.bytedance.im.core.d.n.class, View.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.api.model.f fVar = new com.ss.android.ugc.aweme.story.api.model.f();
        fVar.storyId = str2;
        fVar.detailType = 1;
        ((com.ss.android.ugc.aweme.story.api.i) ServiceManager.get().getService(com.ss.android.ugc.aweme.story.api.i.class)).a(com.ss.android.ugc.aweme.framework.core.a.b().a(), fVar, null, 220, null, view);
        if (nVar != null) {
            String uuid = nVar.getUuid();
            if (PatchProxy.isSupport(new Object[]{this, uuid}, null, com.ss.android.ugc.aweme.im.sdk.story.b.f52424a, true, 53281, new Class[]{com.ss.android.ugc.aweme.im.sdk.story.a.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, uuid}, null, com.ss.android.ugc.aweme.im.sdk.story.b.f52424a, true, 53281, new Class[]{com.ss.android.ugc.aweme.im.sdk.story.a.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(this, "storyMessageSetting");
            Intrinsics.checkParameterIsNotNull(uuid, "msgUUID");
            com.ss.android.ugc.aweme.im.sdk.story.b.f52425b.put(this, uuid);
        }
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f50217a, false, 50359, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f50217a, false, 50359, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (!z) {
            int size = this.f50220d.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.bytedance.im.core.d.n nVar = this.f50220d.get(i2);
                if (TextUtils.equals(nVar.getUuid(), str)) {
                    com.ss.android.ugc.aweme.im.sdk.story.c.a(nVar);
                    return;
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50324, new Class[0], Void.TYPE);
            return;
        }
        this.u.sendMessage(this.u.obtainMessage(1));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50325, new Class[0], Void.TYPE);
            return;
        }
        notifyDataSetChanged();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50331, new Class[0], Void.TYPE);
        } else if (this.f50218b == 1) {
            if (this.p != null) {
                this.p.e();
            }
        } else {
            this.f50218b = 1;
            this.f50219c.a();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50337, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50337, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.getLocalExt().remove("show_unread_message_tips");
        }
    }

    public int getItemCount() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50344, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50344, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f50220d != null) {
            i2 = this.f50220d.size();
        }
        return i2;
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50360, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50360, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.m.getChatType() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50339, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.onDestroy();
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.im.sdk.story.b.f52424a, true, 53280, new Class[]{com.ss.android.ugc.aweme.im.sdk.story.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.im.sdk.story.b.f52424a, true, 53280, new Class[]{com.ss.android.ugc.aweme.im.sdk.story.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(this, "storyMessageSetting");
        if (com.ss.android.ugc.aweme.im.sdk.story.b.f52426c.contains(this)) {
            com.ss.android.ugc.aweme.im.sdk.story.b.f52426c.remove(this);
        }
        com.ss.android.ugc.aweme.im.sdk.story.b.a((com.ss.android.ugc.aweme.im.sdk.story.a) this);
    }

    public final void c() {
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50326, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50326, new Class[0], Void.TYPE);
            return;
        }
        if (this.m.isGroupChat()) {
            this.f50220d.clear();
            List<com.bytedance.im.core.d.n> b2 = this.f50219c.b();
            for (int i2 = 0; i2 < b2.size(); i2++) {
                com.bytedance.im.core.d.n nVar = b2.get(i2);
                if (PatchProxy.isSupport(new Object[]{nVar}, null, ad.f52467a, true, 53661, new Class[]{com.bytedance.im.core.d.n.class}, Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, null, ad.f52467a, true, 53661, new Class[]{com.bytedance.im.core.d.n.class}, Boolean.TYPE)).booleanValue();
                } else if (nVar.getMsgType() != 1002) {
                    z3 = false;
                } else {
                    boolean f2 = ad.f(nVar);
                    if (f2) {
                        m.a();
                        new g(null).a(nVar, true);
                    }
                    z3 = f2;
                }
                if (!z3) {
                    this.f50220d.add(b2.get(i2));
                }
            }
        } else {
            this.f50220d = this.f50219c.b();
        }
        if (this.f50221e != null && !this.f50221e.isEmpty()) {
            this.f50220d.addAll(this.f50221e);
        }
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50352, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50352, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (!com.ss.android.ugc.aweme.im.sdk.utils.m.a() && !this.m.isGroupChat() && !this.m.isStrangerChat()) {
                IMUser singleChatFromUser = this.m.getSingleChatFromUser();
                if (!(singleChatFromUser == null || singleChatFromUser.getFollowStatus() == 2 || !this.w)) {
                    com.ss.android.ugc.aweme.im.sdk.utils.o a2 = com.ss.android.ugc.aweme.im.sdk.utils.o.a();
                    if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.utils.o.f52605a, false, 53447, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.utils.o.f52605a, false, 53447, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        if (a2.f52608b.getInt("show_privacy_hint_count", 0) < 2) {
                            if (System.currentTimeMillis() - a2.f52608b.getLong("show_privacy_hint_time", 0) > 432000000) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        z = true;
                    }
                }
            }
            z = false;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50353, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50353, new Class[0], Void.TYPE);
            } else {
                String string = GlobalContext.getContext().getString(C0906R.string.aya);
                if (PatchProxy.isSupport(new Object[]{string}, this, f50217a, false, 50354, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{string}, this, f50217a, false, 50354, new Class[]{String.class}, Void.TYPE);
                } else {
                    com.bytedance.im.core.d.n nVar2 = new com.bytedance.im.core.d.n();
                    nVar2.setMsgType(1);
                    nVar2.setUuid(UUID.randomUUID().toString());
                    com.bytedance.im.core.d.b a3 = d.a().a(this.m.getConversationId());
                    long j3 = 1;
                    if (a3 != null) {
                        com.bytedance.im.core.d.n lastMessage = a3.getLastMessage();
                        if (lastMessage != null) {
                            j3 = 1 + lastMessage.getOrderIndex();
                        }
                        nVar2.setOrderIndex(j3);
                        if (lastMessage != null) {
                            j2 = lastMessage.getIndex();
                        } else {
                            j2 = a3.getLastMessageIndex();
                        }
                        nVar2.setIndex(j2);
                    } else {
                        nVar2.setOrderIndex(1);
                        nVar2.setIndex(1);
                    }
                    nVar2.setConversationId(this.m.getConversationId());
                    SystemContent systemContent = new SystemContent();
                    systemContent.setTips(string);
                    nVar2.setContent(l.a(systemContent));
                    nVar2.setSender(com.ss.android.ugc.aweme.im.sdk.utils.d.d());
                    nVar2.setCreatedAt(System.currentTimeMillis());
                    nVar2.setMsgStatus(2);
                    o.d(nVar2);
                }
                com.ss.android.ugc.aweme.im.sdk.utils.o a4 = com.ss.android.ugc.aweme.im.sdk.utils.o.a();
                if (PatchProxy.isSupport(new Object[0], a4, com.ss.android.ugc.aweme.im.sdk.utils.o.f52605a, false, 53446, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a4, com.ss.android.ugc.aweme.im.sdk.utils.o.f52605a, false, 53446, new Class[0], Void.TYPE);
                } else {
                    a4.f52608b.edit().putLong("show_privacy_hint_time", System.currentTimeMillis()).commit();
                    a4.f52608b.edit().putInt("show_privacy_hint_count", a4.f52608b.getInt("show_privacy_hint_count", 0) + 1).commit();
                }
            }
        }
        notifyDataSetChanged();
        if (this.n != null) {
            this.n.a();
        }
    }

    public final void d() {
        boolean z;
        com.ss.android.ugc.aweme.im.sdk.feedupdate.b bVar;
        long j2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50329, new Class[0], Void.TYPE);
            return;
        }
        as.a("djjQueryMsg");
        if (this.f50220d != null) {
            this.f50220d.clear();
        }
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50349, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50349, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.m.getChatType() == 3 || !com.ss.android.ugc.aweme.im.sdk.d.a.a().e().showNewStyle() || !(this.m.getEnterFrom() == 3 || this.m.getEnterFrom() == 4)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50350, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50350, new Class[0], Void.TYPE);
            } else {
                IMUser singleChatFromUser = this.m.getSingleChatFromUser();
                if (singleChatFromUser != null) {
                    com.ss.android.ugc.aweme.im.sdk.feedupdate.a a2 = com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a();
                    String uid = singleChatFromUser.getUid();
                    if (PatchProxy.isSupport(new Object[]{uid}, a2, com.ss.android.ugc.aweme.im.sdk.feedupdate.a.f51460a, false, 52063, new Class[]{String.class}, com.ss.android.ugc.aweme.im.sdk.feedupdate.b.class)) {
                        com.ss.android.ugc.aweme.im.sdk.feedupdate.a aVar = a2;
                        bVar = (com.ss.android.ugc.aweme.im.sdk.feedupdate.b) PatchProxy.accessDispatch(new Object[]{uid}, aVar, com.ss.android.ugc.aweme.im.sdk.feedupdate.a.f51460a, false, 52063, new Class[]{String.class}, com.ss.android.ugc.aweme.im.sdk.feedupdate.b.class);
                    } else if (a2.f51462b.containsKey(uid)) {
                        bVar = a2.f51462b.get(uid);
                    } else {
                        bVar = null;
                    }
                    if (!(bVar == null || bVar.getTagCount() == 0)) {
                        com.bytedance.im.core.d.b a3 = d.a().a(this.f50219c.f21291b);
                        if (a3 != null) {
                            com.bytedance.im.core.d.n nVar = new com.bytedance.im.core.d.n();
                            nVar.setMsgType(14);
                            nVar.setUuid(UUID.randomUUID().toString());
                            com.bytedance.im.core.d.n lastMessage = a3.getLastMessage();
                            long j3 = 1;
                            if (lastMessage != null) {
                                j3 = 1 + lastMessage.getOrderIndex();
                            }
                            nVar.setOrderIndex(j3);
                            if (lastMessage != null) {
                                j2 = lastMessage.getIndex();
                            } else {
                                j2 = a3.getLastMessageIndex();
                            }
                            nVar.setIndex(j2);
                            nVar.setConversationId(a3.getConversationId());
                            VideoUpdateTipsContent videoUpdateTipsContent = new VideoUpdateTipsContent();
                            videoUpdateTipsContent.setUid(bVar.getUid());
                            videoUpdateTipsContent.setCover(bVar.getCoverUrl());
                            videoUpdateTipsContent.setAid(bVar.getLastAid());
                            videoUpdateTipsContent.setPhoto(bVar.isPhoto());
                            int tagCount = bVar.getTagCount();
                            if (tagCount > 1) {
                                videoUpdateTipsContent.setTitle(GlobalContext.getContext().getResources().getString(C0906R.string.azg, new Object[]{com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().a(bVar.getTagCount())}));
                            } else if (tagCount == 1) {
                                videoUpdateTipsContent.setTitle(GlobalContext.getContext().getResources().getString(C0906R.string.azh));
                            }
                            if (!TextUtils.isEmpty(bVar.getTitle()) || TextUtils.isEmpty(singleChatFromUser.getNickName())) {
                                videoUpdateTipsContent.setContent(bVar.getTitle());
                            } else {
                                videoUpdateTipsContent.setContent(GlobalContext.getContext().getResources().getString(C0906R.string.azl, new Object[]{singleChatFromUser.getNickName()}));
                            }
                            nVar.setContent(l.a(videoUpdateTipsContent));
                            this.f50219c.f21290a.add(0, nVar);
                            com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().b(singleChatFromUser.getUid());
                        }
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50351, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50351, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            com.bytedance.im.core.d.b a4 = d.a().a(this.m.getConversationId());
            if (a4 != null && a4.getUnreadCount() > 0) {
                z2 = true;
            }
        }
        this.w = z2;
        o oVar = this.f50219c;
        k.a();
        if (!oVar.g) {
            oVar.g = true;
            com.bytedance.im.core.b.d.e.a(new com.bytedance.im.core.b.d.d<List<com.bytedance.im.core.d.n>>() {
                /* renamed from: b */
                public java.util.List<com.bytedance.im.core.d.n> a(
/*
Method generation error in method: com.bytedance.im.core.d.o.1.b():java.util.List<com.bytedance.im.core.d.n>, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.d.o.1.b():java.util.List<com.bytedance.im.core.d.n>, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            }, new com.bytedance.im.core.b.d.c<List<com.bytedance.im.core.d.n>>() {
                public final /* synthetic */ void a(
/*
Method generation error in method: com.bytedance.im.core.d.o.8.a(java.lang.Object):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.d.o.8.a(java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            });
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f50222f = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f50222f = null;
    }

    private boolean a(com.bytedance.im.core.d.n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50217a, false, 50336, new Class[]{com.bytedance.im.core.d.n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, this, f50217a, false, 50336, new Class[]{com.bytedance.im.core.d.n.class}, Boolean.TYPE)).booleanValue();
        } else if (nVar.isSelf()) {
            return false;
        } else {
            int msgType = nVar.getMsgType();
            if (msgType != 14) {
                switch (msgType) {
                    case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST:
                    case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR:
                        break;
                    default:
                        return true;
                }
            }
            return false;
        }
    }

    public long getItemId(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f50217a, false, 50340, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f50217a, false, 50340, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        }
        com.bytedance.im.core.d.n nVar = this.f50220d.get(i2);
        long rowId = nVar.getRowId();
        if (rowId > 0) {
            return rowId;
        }
        long msgId = nVar.getMsgId();
        if (msgId == 0) {
            if (!TextUtils.isEmpty(nVar.getUuid())) {
                msgId = (long) nVar.getUuid().hashCode();
            } else {
                msgId = nVar.getCreatedAt();
            }
        }
        return msgId;
    }

    public int getItemViewType(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f50217a, false, 50342, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return m.valueOf(this.f50220d.get(i2)).getItemViewType();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f50217a, false, 50342, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public MessageAdapter(o oVar) {
        this.m = oVar;
        this.u = new n(this);
        this.f50220d = new ArrayList();
        this.f50221e = new ArrayList();
        this.v = IMUser.fromUser(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser());
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.im.sdk.story.b.f52424a, true, 53279, new Class[]{com.ss.android.ugc.aweme.im.sdk.story.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.im.sdk.story.b.f52424a, true, 53279, new Class[]{com.ss.android.ugc.aweme.im.sdk.story.a.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(this, "storyMessageSetting");
            if (!com.ss.android.ugc.aweme.im.sdk.story.b.f52426c.contains(this)) {
                com.ss.android.ugc.aweme.im.sdk.story.b.f52426c.add(this);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50345, new Class[0], Void.TYPE);
        } else if (this.q == null) {
            this.q = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50223a;

                public final void onClick(View view) {
                    float height;
                    float f2;
                    String str;
                    Runnable runnable;
                    final View view2 = view;
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f50223a, false, 50361, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f50223a, false, 50361, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (view2.getTag(50331648) != null) {
                        int intValue = ((Integer) view2.getTag(50331648)).intValue();
                        if (intValue == 2 || intValue == 8) {
                            String str2 = (String) view2.getTag(67108864);
                            if (!TextUtils.isEmpty(str2)) {
                                h a2 = h.a();
                                a2.a(com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + str2).a("refer", "chat").a("video_from", "from_chat").a());
                            }
                        } else if (intValue == 3) {
                            String str3 = (String) view2.getTag(67108864);
                            if (!TextUtils.isEmpty(str3)) {
                                j.f51270d.c(str3);
                                ay.f52524b.a(str3);
                                z.a().a(str3, "", "pair", "click_head");
                                z.a().b(str3, "chat", "click_head");
                            }
                        } else if (intValue == 4) {
                            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) view2.getTag(100663296);
                            if (shareAwemeContent != null && !TextUtils.isEmpty(shareAwemeContent.getUser())) {
                                z.a().a(shareAwemeContent.getUser(), shareAwemeContent.getItemId(), "others", "click_head");
                                z.a().b(shareAwemeContent.getUser(), "chat", "click_head");
                                ay.f52524b.a(shareAwemeContent.getUser());
                            }
                        } else if (intValue == 5) {
                            com.bytedance.im.core.d.n nVar = (com.bytedance.im.core.d.n) view2.getTag(67108864);
                            if (nVar != null) {
                                com.ss.android.b.a.a.a.a(new a(nVar));
                            }
                        } else if (intValue == 6) {
                            com.bytedance.im.core.d.n nVar2 = (com.bytedance.im.core.d.n) view2.getTag(67108864);
                            if (nVar2 != null && nVar2.isSelf()) {
                                if (MessageAdapter.this.m.getChatType() != 3) {
                                    IMUser singleChatFromUser = MessageAdapter.this.m.getSingleChatFromUser();
                                    if (nVar2.getMsgType() == 2 && (singleChatFromUser == null || singleChatFromUser.getFollowStatus() != 2)) {
                                        UIUtils.displayToast(view.getContext(), (int) C0906R.string.avy);
                                        return;
                                    } else if (nVar2.getMsgType() == 30 && (singleChatFromUser == null || singleChatFromUser.getFollowStatus() != 2)) {
                                        UIUtils.displayToast(view.getContext(), (int) C0906R.string.avz);
                                        return;
                                    }
                                }
                                Context context = view.getContext();
                                if (PatchProxy.isSupport(new Object[]{nVar2}, this, f50223a, false, 50362, new Class[]{com.bytedance.im.core.d.n.class}, Runnable.class)) {
                                    runnable = (Runnable) PatchProxy.accessDispatch(new Object[]{nVar2}, this, f50223a, false, 50362, new Class[]{com.bytedance.im.core.d.n.class}, Runnable.class);
                                } else {
                                    runnable = new h(this, nVar2);
                                }
                                com.ss.android.ugc.aweme.im.sdk.utils.h.a(context, C0906R.string.ats, C0906R.string.apk, C0906R.string.awt, runnable);
                            }
                        } else if (intValue == 7) {
                            Object tag = view2.getTag(100663296);
                            if (tag instanceof OnlyPictureContent) {
                                OnlyPictureContent onlyPictureContent = (OnlyPictureContent) tag;
                                Object tag2 = view.getTag();
                                if (tag2 instanceof RemoteImageView) {
                                    com.ss.android.ugc.aweme.base.c.a((RemoteImageView) tag2, onlyPictureContent.getUrl(), (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f50225a;

                                        public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                                            ImageInfo imageInfo = (ImageInfo) obj;
                                            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f50225a, false, 50364, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f50225a, false, 50364, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                                                return;
                                            }
                                            view2.setVisibility(8);
                                        }
                                    });
                                }
                            }
                        } else {
                            if (intValue == 9 || intValue == 26 || intValue == 27) {
                                com.bytedance.im.core.d.n nVar3 = (com.bytedance.im.core.d.n) view2.getTag(67108864);
                                if (nVar3 != null) {
                                    int[] iArr = new int[2];
                                    view2.getLocationOnScreen(iArr);
                                    BaseContent baseContent = (BaseContent) view2.getTag(100663296);
                                    if (baseContent instanceof OnlyPictureContent) {
                                        OnlyPictureContent onlyPictureContent2 = (OnlyPictureContent) baseContent;
                                        if (onlyPictureContent2.getWidth() == 0 || onlyPictureContent2.getHeight() == 0) {
                                            height = ((float) view.getHeight()) / ((float) view.getWidth());
                                        } else {
                                            height = ((float) onlyPictureContent2.getHeight()) / ((float) onlyPictureContent2.getWidth());
                                        }
                                    } else if (baseContent instanceof StoryPictureContent) {
                                        StoryPictureContent storyPictureContent = (StoryPictureContent) baseContent;
                                        if (storyPictureContent.getWidth() == 0 || storyPictureContent.getHeight() == 0) {
                                            height = ((float) view.getHeight()) / ((float) view.getWidth());
                                        } else {
                                            height = ((float) storyPictureContent.getHeight()) / ((float) storyPictureContent.getWidth());
                                        }
                                    } else {
                                        height = ((float) view.getHeight()) / ((float) view.getWidth());
                                    }
                                    DragView.b bVar = new DragView.b(iArr[0], iArr[1], view.getHeight(), view.getWidth(), (float) view.getResources().getDimensionPixelSize(C0906R.dimen.ha), height);
                                    if (intValue == 26) {
                                        PhotoDetailActivity.a(view.getContext(), nVar3, 1, bVar);
                                    } else if (intValue == 27) {
                                        PhotoDetailActivity.a(view.getContext(), nVar3, 2, bVar);
                                    } else {
                                        PhotoDetailActivity.a(view.getContext(), nVar3, 0, bVar);
                                    }
                                }
                            } else if (intValue == 11) {
                                Object tag3 = view2.getTag(100663296);
                                if (tag3 instanceof VideoUpdateTipsContent) {
                                    VideoUpdateTipsContent videoUpdateTipsContent = (VideoUpdateTipsContent) tag3;
                                    MessageAdapter messageAdapter = MessageAdapter.this;
                                    String uid = videoUpdateTipsContent.getUid();
                                    String aid = videoUpdateTipsContent.getAid();
                                    if (PatchProxy.isSupport(new Object[]{uid, aid}, messageAdapter, MessageAdapter.f50217a, false, 50355, new Class[]{String.class, String.class}, Void.TYPE)) {
                                        MessageAdapter messageAdapter2 = messageAdapter;
                                        PatchProxy.accessDispatch(new Object[]{uid, aid}, messageAdapter2, MessageAdapter.f50217a, false, 50355, new Class[]{String.class, String.class}, Void.TYPE);
                                    } else if (!TextUtils.isEmpty(uid) && !TextUtils.isEmpty(aid)) {
                                        h a3 = h.a();
                                        Activity a4 = com.ss.android.ugc.aweme.framework.core.a.b().a();
                                        a3.a(a4, com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + aid).a("video_from", "from_profile_other").a("video_type", 0).a("userid", uid).a("refer", "update_tips").a());
                                    }
                                }
                            } else if (intValue == 12) {
                                String str4 = (String) view2.getTag(67108864);
                                if (!TextUtils.isEmpty(str4)) {
                                    h a5 = h.a();
                                    a5.a(com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + str4).a("refer", "chat").a("enter_method", "click_token").a("previous_page", "token").a("video_from", "from_chat").a());
                                }
                            } else if (intValue == 14) {
                                CommentContent commentContent = (CommentContent) view2.getTag(100663296);
                                if (commentContent != null) {
                                    h.a().a((Activity) view.getContext(), com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + commentContent.getAwemeId()).a("refer", "chat").a("video_from", "from_chat").a("cid", commentContent.getCommentId()).a());
                                }
                            } else if (intValue == 13) {
                                final com.bytedance.im.core.d.n nVar4 = (com.bytedance.im.core.d.n) view2.getTag(67108864);
                                if (nVar4 != null) {
                                    SayHelloContent sayHelloContent = (SayHelloContent) l.a(nVar4.getContent(), SayHelloContent.class);
                                    if (sayHelloContent != null) {
                                        Object tag4 = view2.getTag(83886080);
                                        final IMUser singleChatFromUser2 = MessageAdapter.this.m.getSingleChatFromUser();
                                        if (singleChatFromUser2 != null) {
                                            if (tag4 == null) {
                                                z.a().a(singleChatFromUser2.getUid(), MessageAdapter.this.m.getConversationId(), sayHelloContent.getEmoji(), true);
                                                o.c(nVar4);
                                                MessageAdapter.this.a();
                                            } else {
                                                final int intValue2 = ((Integer) tag4).intValue();
                                                final List emoji = sayHelloContent.getEmoji();
                                                if (emoji != null && intValue2 < emoji.size()) {
                                                    Context context2 = view.getContext();
                                                    AnonymousClass2 r0 = new com.ss.android.ugc.aweme.im.sdk.a.c() {

                                                        /* renamed from: a  reason: collision with root package name */
                                                        public static ChangeQuickRedirect f50228a;

                                                        public final void sendMsg() {
                                                            if (PatchProxy.isSupport(new Object[0], this, f50228a, false, 50365, new Class[0], Void.TYPE)) {
                                                                PatchProxy.accessDispatch(new Object[0], this, f50228a, false, 50365, new Class[0], Void.TYPE);
                                                                return;
                                                            }
                                                            com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar = (com.ss.android.ugc.aweme.im.sdk.resources.model.a) emoji.get(intValue2);
                                                            String uid = singleChatFromUser2.getUid();
                                                            o.c(nVar4);
                                                            ba.a().a(uid, (BaseContent) EmojiContent.obtain(aVar));
                                                            z.a().c(MessageAdapter.this.m.getConversationId(), uid, String.valueOf(aVar.getId()));
                                                        }
                                                    };
                                                    new com.ss.android.ugc.aweme.im.sdk.a.b(context2, r0).sendMsg();
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (intValue == 19) {
                                com.bytedance.im.core.d.n nVar5 = (com.bytedance.im.core.d.n) view2.getTag(67108864);
                                if (nVar5 != null) {
                                    MessageAdapter.this.k = nVar5;
                                    MessageAdapter.this.i.a(nVar5);
                                }
                            } else if (intValue == 15) {
                                ShareRankingListContent shareRankingListContent = (ShareRankingListContent) view2.getTag(100663296);
                                int type = shareRankingListContent.getType();
                                if (type != 1801) {
                                    if (type == 1802) {
                                        i = 1;
                                    } else if (type == 1803) {
                                        i = 2;
                                    } else if (type == 2301) {
                                        i = 3;
                                    }
                                }
                                if (!com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIsHotSearchBillboardEnable()) {
                                    com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.cn4, 1).a();
                                    return;
                                }
                                h.a().a((Activity) view.getContext(), com.ss.android.ugc.aweme.ag.j.a("aweme://search/trending").a("type", String.valueOf(i)).a());
                                z.a().a(shareRankingListContent, MessageAdapter.this.m.getSingleChatFromUserId(), MessageAdapter.this.m.getConversationId(), true);
                            } else if (intValue == 16) {
                                String str5 = (String) view2.getTag(67108864);
                                String str6 = (String) view2.getTag(50331649);
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("snssdk1128://poi/?id=" + str5 + "&enter_from" + "=chat" + "&to_user_id" + "=" + str6));
                                z a6 = z.a();
                                String conversationId = MessageAdapter.this.m.getConversationId();
                                if (PatchProxy.isSupport(new Object[]{str5, str6, conversationId}, a6, z.f52670a, false, 53591, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                                    z zVar = a6;
                                    PatchProxy.accessDispatch(new Object[]{str5, str6, conversationId}, zVar, z.f52670a, false, 53591, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                                } else {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("poi_id", str5);
                                    hashMap.put("to_user_id", str6);
                                    hashMap.put("conversation_id", conversationId);
                                    r.a("enter_poi_detail", (Map) hashMap);
                                }
                                view.getContext().startActivity(intent);
                            } else if (intValue == 33) {
                                try {
                                    Map map = (Map) view2.getTag(67108864);
                                    String str7 = (String) map.get("poi_id");
                                    String str8 = (String) map.get("activity_id");
                                    String str9 = (String) map.get("coupon_id");
                                    String str10 = (String) map.get("uid");
                                    boolean equals = PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(map.get("is_self"));
                                    if (equals) {
                                        str = str10;
                                    } else {
                                        str = com.ss.android.ugc.aweme.im.sdk.utils.d.b().toString();
                                    }
                                    if (equals) {
                                        str10 = com.ss.android.ugc.aweme.im.sdk.utils.d.b().toString();
                                    }
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("enter_from", "chat");
                                    hashMap2.put("from_user_id", str10);
                                    hashMap2.put("to_user_id", str);
                                    hashMap2.put("conversation_id", MessageAdapter.this.m.getConversationId());
                                    hashMap2.put("poi_id", str7);
                                    hashMap2.put("coupon_id", str9);
                                    hashMap2.put("activity_id", str8);
                                    r.a("click_receive_coupon_inner", (Map) hashMap2);
                                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("snssdk1128://poi/?id=" + str7 + "&enter_from=chat&to_user_id=" + str + "&from_user_id=" + str10 + "&attached_activity_id=" + str8 + "&coupon_id=" + str9 + "&enter_method=click_poi_coupon")));
                                } catch (Exception unused) {
                                }
                            } else if (intValue == 17) {
                                Object tag5 = view2.getTag(100663296);
                                if (tag5 instanceof ShareMusicContent) {
                                    ShareMusicContent shareMusicContent = (ShareMusicContent) tag5;
                                    MessageAdapter messageAdapter3 = MessageAdapter.this;
                                    String musicId = shareMusicContent.getMusicId();
                                    if (PatchProxy.isSupport(new Object[]{musicId}, messageAdapter3, MessageAdapter.f50217a, false, 50356, new Class[]{String.class}, Void.TYPE)) {
                                        MessageAdapter messageAdapter4 = messageAdapter3;
                                        PatchProxy.accessDispatch(new Object[]{musicId}, messageAdapter4, MessageAdapter.f50217a, false, 50356, new Class[]{String.class}, Void.TYPE);
                                    } else if (!TextUtils.isEmpty(musicId)) {
                                        h a7 = h.a();
                                        Activity a8 = com.ss.android.ugc.aweme.framework.core.a.b().a();
                                        a7.a(a8, com.ss.android.ugc.aweme.ag.j.a("aweme://music/detail/" + musicId).a());
                                    }
                                    z a9 = z.a();
                                    String musicId2 = shareMusicContent.getMusicId();
                                    String singleChatFromUserId = MessageAdapter.this.m.getSingleChatFromUserId();
                                    String conversationId2 = MessageAdapter.this.m.getConversationId();
                                    if (PatchProxy.isSupport(new Object[]{musicId2, singleChatFromUserId, conversationId2}, a9, z.f52670a, false, 53589, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                                        z zVar2 = a9;
                                        PatchProxy.accessDispatch(new Object[]{musicId2, singleChatFromUserId, conversationId2}, zVar2, z.f52670a, false, 53589, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                                    } else {
                                        HashMap hashMap3 = new HashMap();
                                        hashMap3.put("to_user_id", singleChatFromUserId);
                                        hashMap3.put("conversation_id", conversationId2);
                                        hashMap3.put("enter_from", "chat");
                                        hashMap3.put("music_id", musicId2);
                                        if (!com.ss.android.ugc.aweme.im.sdk.utils.m.b()) {
                                            hashMap3.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                        } else {
                                            hashMap3.put("_staging_flag", PushConstants.PUSH_TYPE_NOTIFY);
                                        }
                                        r.a("enter_music_detail", (Map) hashMap3);
                                    }
                                }
                            } else if (intValue == 18) {
                                Object tag6 = view2.getTag(67108864);
                                if (tag6 != null) {
                                    String str11 = (String) tag6;
                                    h a10 = h.a();
                                    a10.a("aweme://challenge/detail/" + str11);
                                    z a11 = z.a();
                                    String singleChatFromUserId2 = MessageAdapter.this.m.getSingleChatFromUserId();
                                    String conversationId3 = MessageAdapter.this.m.getConversationId();
                                    if (PatchProxy.isSupport(new Object[]{str11, singleChatFromUserId2, conversationId3}, a11, z.f52670a, false, 53590, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                                        z zVar3 = a11;
                                        PatchProxy.accessDispatch(new Object[]{str11, singleChatFromUserId2, conversationId3}, zVar3, z.f52670a, false, 53590, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                                    } else {
                                        HashMap hashMap4 = new HashMap();
                                        hashMap4.put("to_user_id", singleChatFromUserId2);
                                        hashMap4.put("conversation_id", conversationId3);
                                        hashMap4.put("enter_from", "chat");
                                        hashMap4.put("tag_id", str11);
                                        if (!com.ss.android.ugc.aweme.im.sdk.utils.m.b()) {
                                            hashMap4.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                        } else {
                                            hashMap4.put("_staging_flag", PushConstants.PUSH_TYPE_NOTIFY);
                                        }
                                        r.a("enter_tag_detail", (Map) hashMap4);
                                    }
                                }
                            } else if (intValue == 20) {
                                Object tag7 = view2.getTag(100663296);
                                if (tag7 instanceof ShareMiniAppContent) {
                                    ShareMiniAppContent shareMiniAppContent = (ShareMiniAppContent) tag7;
                                    com.ss.android.ugc.aweme.im.sdk.d.a.a().e().jumpToMiniApp(view.getContext(), shareMiniAppContent.getQuery(), shareMiniAppContent.getAppId(), shareMiniAppContent.isGame(), shareMiniAppContent.getToken(), shareMiniAppContent.getExtraStr());
                                }
                            } else if (intValue == 21) {
                                Object tag8 = view2.getTag(100663296);
                                if (tag8 instanceof ShareUserContent) {
                                    ay.f52524b.a(((ShareUserContent) tag8).getUid());
                                }
                            } else if (intValue == 22) {
                                Object tag9 = view2.getTag(100663296);
                                if (tag9 instanceof ShareWebContent) {
                                    ShareWebContent shareWebContent = (ShareWebContent) tag9;
                                    if (!TextUtils.isEmpty(shareWebContent.getUrl())) {
                                        com.ss.android.ugc.aweme.im.sdk.d.a.a().e().openUrl(view.getContext(), Uri.parse(shareWebContent.getUrl()), false);
                                        Object tag10 = view2.getTag(50331649);
                                        if ((tag10 instanceof Boolean) && ((Boolean) tag10).booleanValue()) {
                                            z.d(view2.getTag(50331650).toString(), view2.getTag(50331650).toString(), "picture");
                                        }
                                    }
                                }
                            } else if (intValue == 23) {
                                ShareLiveContent shareLiveContent = (ShareLiveContent) view2.getTag(100663296);
                                if (shareLiveContent != null) {
                                    com.ss.android.ugc.aweme.im.sdk.d.a.a().e().jumpToLivePage(view.getContext(), shareLiveContent.getRoomOwnerId(), shareLiveContent.getRoomId());
                                }
                            } else if (intValue == 24) {
                                ShareLiveContent shareLiveContent2 = (ShareLiveContent) view2.getTag(100663296);
                                if (shareLiveContent2 != null) {
                                    ay.f52524b.a(shareLiveContent2.getRoomOwnerId());
                                }
                            } else if (intValue == 25) {
                                StoryReplyContent storyReplyContent = (StoryReplyContent) view2.getTag(100663296);
                                if (storyReplyContent != null) {
                                    if (storyReplyContent.getStoryState()) {
                                        MessageAdapter.this.a(storyReplyContent.getStoryContent().getStoryId(), (com.bytedance.im.core.d.n) view2.getTag(67108864), (View) view2.getTag(117440512));
                                    } else {
                                        com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.ayi, 0).a();
                                    }
                                }
                            } else if (intValue == 28 || intValue == 29) {
                                StoryVideoContent storyVideoContent = (StoryVideoContent) view2.getTag(100663296);
                                View view3 = (View) view2.getTag(67108864);
                                if (!(storyVideoContent == null || view3 == null)) {
                                    MessageAdapter messageAdapter5 = MessageAdapter.this;
                                    if (PatchProxy.isSupport(new Object[]{storyVideoContent, view3}, messageAdapter5, MessageAdapter.f50217a, false, 50358, new Class[]{StoryVideoContent.class, View.class}, Void.TYPE)) {
                                        MessageAdapter messageAdapter6 = messageAdapter5;
                                        PatchProxy.accessDispatch(new Object[]{storyVideoContent, view3}, messageAdapter6, MessageAdapter.f50217a, false, 50358, new Class[]{StoryVideoContent.class, View.class}, Void.TYPE);
                                    } else if (storyVideoContent != null) {
                                        Context context3 = view3.getContext();
                                        int[] iArr2 = new int[2];
                                        view3.getLocationOnScreen(iArr2);
                                        if (storyVideoContent.getHeight() == 0 || storyVideoContent.getWidth() == 0) {
                                            f2 = ((float) view3.getHeight()) / ((float) view3.getWidth());
                                        } else {
                                            f2 = ((float) storyVideoContent.getHeight()) / ((float) storyVideoContent.getWidth());
                                        }
                                        DragView.b bVar2 = new DragView.b(iArr2[0], iArr2[1], view3.getHeight(), view3.getWidth(), (float) view3.getResources().getDimensionPixelSize(C0906R.dimen.hf), f2);
                                        Intent intent2 = new Intent(context3, VideoFilePlayerActivity.class);
                                        intent2.putExtra("videoContent", storyVideoContent);
                                        intent2.putExtra("dragViewInfo", bVar2);
                                        intent2.putExtra("localVideo", storyVideoContent.getLocalVideo());
                                        intent2.putExtra("localPoster", storyVideoContent.getLocalPoster());
                                        context3.startActivity(intent2);
                                    }
                                }
                            } else if (intValue == 30) {
                                com.bytedance.im.core.d.n nVar6 = (com.bytedance.im.core.d.n) view2.getTag(67108864);
                                if (nVar6 != null) {
                                    bc.a((Activity) view.getContext(), (Object) com.ss.android.ugc.aweme.im.sdk.d.e.a().b(String.valueOf(e.a(nVar6.getConversationId()))), 12);
                                }
                            } else if (intValue == 32) {
                                SelfStoryReplyContent selfStoryReplyContent = (SelfStoryReplyContent) view2.getTag(100663296);
                                if (selfStoryReplyContent != null) {
                                    if (selfStoryReplyContent.getStoryState()) {
                                        MessageAdapter.this.a(selfStoryReplyContent.getStoryContent().getStoryId(), (com.bytedance.im.core.d.n) view2.getTag(67108864), (View) view2.getTag(117440512));
                                    } else {
                                        com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.ayi, 0).a();
                                    }
                                }
                            } else if (intValue == 34) {
                                ShareGoodContent shareGoodContent = (ShareGoodContent) view2.getTag(67108864);
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("snssdk1128://goods/seeding/?promotion_id=" + shareGoodContent.getPromotionId() + "&product_id=" + shareGoodContent.getProductId() + "&target_uid=" + shareGoodContent.getUserId() + "&sec_target_uid=" + shareGoodContent.getSecUserId() + "&enter_method=" + shareGoodContent.getEnterMethod())));
                            } else if (intValue == 35) {
                                ShareGoodWindowContent shareGoodWindowContent = (ShareGoodWindowContent) view2.getTag(67108864);
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("snssdk1128://goods/shop/?uid=" + shareGoodWindowContent.getUserId() + "&sec_uid=" + shareGoodWindowContent.getSecUserId() + "&entrance_location=" + shareGoodWindowContent.getEntranceLocation())));
                            } else if (intValue != 36 && intValue == 37) {
                                com.bytedance.im.core.d.n nVar7 = (com.bytedance.im.core.d.n) view2.getTag(67108864);
                                if (nVar7 != null && nVar7.getMsgStatus() != 3) {
                                    GroupInviteContent groupInviteContent = (GroupInviteContent) l.a(nVar7.getContent(), GroupInviteContent.class);
                                    if (groupInviteContent != null && groupInviteContent.getGroupInviteCardInfo() != null) {
                                        HashMap hashMap5 = new HashMap();
                                        hashMap5.put("conversation_id", MessageAdapter.this.m.getConversationId());
                                        hashMap5.put("from_user_id", String.valueOf(nVar7.getSender()));
                                        z.a("group_chat_click_invite", (Map<String, String>) hashMap5);
                                        GroupInviteDialog groupInviteDialog = new GroupInviteDialog(view.getContext(), groupInviteContent.getGroupInviteCardInfo().getTicket(), 4);
                                        com.ss.android.ugc.aweme.im.sdk.group.a.c groupInviteCardInfo = groupInviteContent.getGroupInviteCardInfo();
                                        if (PatchProxy.isSupport(new Object[]{groupInviteCardInfo}, groupInviteDialog, GroupInviteDialog.f51581a, false, 52250, new Class[]{com.ss.android.ugc.aweme.im.sdk.group.a.c.class}, Void.TYPE)) {
                                            GroupInviteDialog groupInviteDialog2 = groupInviteDialog;
                                            PatchProxy.accessDispatch(new Object[]{groupInviteCardInfo}, groupInviteDialog2, GroupInviteDialog.f51581a, false, 52250, new Class[]{com.ss.android.ugc.aweme.im.sdk.group.a.c.class}, Void.TYPE);
                                        } else {
                                            Intrinsics.checkParameterIsNotNull(groupInviteCardInfo, "groupInviteCardInfo");
                                            groupInviteDialog.k = groupInviteCardInfo;
                                        }
                                        groupInviteDialog.show();
                                    }
                                }
                            }
                        }
                    }
                }
            };
        }
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50346, new Class[0], Void.TYPE);
            return;
        }
        if (this.r == null) {
            this.r = new View.OnLongClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50237a;

                /* renamed from: b  reason: collision with root package name */
                public DmtButton f50238b;

                /* renamed from: c  reason: collision with root package name */
                public DmtButton f50239c;

                /* renamed from: d  reason: collision with root package name */
                public DmtButton f50240d;

                /* renamed from: e  reason: collision with root package name */
                public DmtButton f50241e;

                /* renamed from: f  reason: collision with root package name */
                public DmtButton f50242f;
                public PopupWindow g;
                int h;
                public BaseContent i;
                public com.bytedance.im.core.d.n j;
                private View.OnClickListener l;

                private void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f50237a, false, 50372, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50237a, false, 50372, new Class[0], Void.TYPE);
                        return;
                    }
                    if (this.l == null) {
                        this.l = new View.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f50245a;

                            public final void onClick(View view) {
                                int i;
                                final View view2 = view;
                                if (PatchProxy.isSupport(new Object[]{view2}, this, f50245a, false, 50378, new Class[]{View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view2}, this, f50245a, false, 50378, new Class[]{View.class}, Void.TYPE);
                                    return;
                                }
                                ClickInstrumentation.onClick(view);
                                if (view2.equals(AnonymousClass2.this.f50238b)) {
                                    if (AnonymousClass2.this.i instanceof TextContent) {
                                        ai.a(view.getContext(), ((TextContent) AnonymousClass2.this.i).getText());
                                    } else if (AnonymousClass2.this.i instanceof StoryReplyContent) {
                                        ai.a(view.getContext(), ((StoryReplyContent) AnonymousClass2.this.i).getStoryReplyText());
                                    } else if (AnonymousClass2.this.i instanceof SelfStoryReplyContent) {
                                        ai.a(view.getContext(), ((SelfStoryReplyContent) AnonymousClass2.this.i).getStoryReplyText());
                                    }
                                } else if (view2.equals(AnonymousClass2.this.f50241e)) {
                                    int indexOf = MessageAdapter.this.f50220d.indexOf(AnonymousClass2.this.j);
                                    if (indexOf != -1) {
                                        AnonymousClass2 r1 = AnonymousClass2.this;
                                        Context context = view.getContext();
                                        com.bytedance.im.core.d.n nVar = AnonymousClass2.this.j;
                                        if (PatchProxy.isSupport(new Object[]{context, nVar, Integer.valueOf(indexOf)}, r1, AnonymousClass2.f50237a, false, 50373, new Class[]{Context.class, com.bytedance.im.core.d.n.class, Integer.TYPE}, Void.TYPE)) {
                                            AnonymousClass2 r12 = r1;
                                            PatchProxy.accessDispatch(new Object[]{context, nVar, Integer.valueOf(indexOf)}, r12, AnonymousClass2.f50237a, false, 50373, new Class[]{Context.class, com.bytedance.im.core.d.n.class, Integer.TYPE}, Void.TYPE);
                                        } else {
                                            bc.a(context, 1, true, (Runnable) new Runnable(nVar, indexOf) {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f50250a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ com.bytedance.im.core.d.n f50251b;

                                                /* renamed from: c  reason: collision with root package name */
                                                final /* synthetic */ int f50252c;

                                                public final void run() {
                                                    int i = 0;
                                                    if (PatchProxy.isSupport(new Object[0], this, f50250a, false, 50382, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f50250a, false, 50382, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    AnonymousClass2 r0 = AnonymousClass2.this;
                                                    com.bytedance.im.core.d.n nVar = this.f50251b;
                                                    int i2 = this.f50252c;
                                                    if (PatchProxy.isSupport(new Object[]{nVar, Integer.valueOf(i2)}, r0, AnonymousClass2.f50237a, false, 50374, new Class[]{com.bytedance.im.core.d.n.class, Integer.TYPE}, Void.TYPE)) {
                                                        Object[] objArr = {nVar, Integer.valueOf(i2)};
                                                        Object[] objArr2 = objArr;
                                                        AnonymousClass2 r9 = r0;
                                                        PatchProxy.accessDispatch(objArr2, r9, AnonymousClass2.f50237a, false, 50374, new Class[]{com.bytedance.im.core.d.n.class, Integer.TYPE}, Void.TYPE);
                                                        return;
                                                    }
                                                    if (r0.h == 1 || r0.h == 2 || r0.h == 9 || r0.h == 8 || r0.h == 10 || r0.h == 14 || r0.h == 11 || r0.h == 19 || r0.h == 16 || r0.h == 17 || r0.h == 18 || r0.h == 15 || r0.h == 20 || r0.h == 21 || r0.h == 22 || r0.h == 23 || r0.h == 26 || r0.h == 27 || r0.h == 25 || r0.h == 28 || r0.h == 29 || r0.h == 30 || r0.h == 31 || r0.h == 32 || r0.h == 33 || r0.h == 34 || r0.h == 35 || r0.h == 36 || r0.h == 37) {
                                                        if (r0.h == 19) {
                                                            com.ss.android.ugc.aweme.im.sdk.chat.net.a a2 = com.ss.android.ugc.aweme.im.sdk.chat.net.a.a();
                                                            if (PatchProxy.isSupport(new Object[]{nVar}, a2, com.ss.android.ugc.aweme.im.sdk.chat.net.a.f50878a, false, 51215, new Class[]{com.bytedance.im.core.d.n.class}, Boolean.TYPE)) {
                                                                com.ss.android.ugc.aweme.im.sdk.chat.net.a aVar = a2;
                                                                ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, aVar, com.ss.android.ugc.aweme.im.sdk.chat.net.a.f50878a, false, 51215, new Class[]{com.bytedance.im.core.d.n.class}, Boolean.TYPE)).booleanValue();
                                                            } else {
                                                                BaseContent content = m.content(nVar);
                                                                if (content != null) {
                                                                    com.ss.android.ugc.aweme.im.sdk.chat.net.e a3 = a2.a(nVar, content);
                                                                    if (a3 != null) {
                                                                        File file = new File(a3.a() + "/" + a3.c("download"));
                                                                        if (file.exists()) {
                                                                            file.delete();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (TextUtils.isEmpty(nVar.getConversationId())) {
                                                            if (PatchProxy.isSupport(new Object[]{nVar, null}, null, com.ss.android.ugc.aweme.im.sdk.utils.r.f52611a, true, 53455, new Class[]{com.bytedance.im.core.d.n.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
                                                                PatchProxy.accessDispatch(new Object[]{nVar, null}, null, com.ss.android.ugc.aweme.im.sdk.utils.r.f52611a, true, 53455, new Class[]{com.bytedance.im.core.d.n.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
                                                            } else {
                                                                com.ss.android.b.a.a.a.a(new Runnable(nVar, null) {

                                                                    /* renamed from: a  reason: collision with root package name */
                                                                    public static ChangeQuickRedirect f52639a;

                                                                    /* renamed from: b  reason: collision with root package name */
                                                                    final /* synthetic */ com.bytedance.im.core.d.n f52640b;

                                                                    /* renamed from: c  reason: collision with root package name */
                                                                    final /* synthetic */ a f52641c;

                                                                    public final void run() {
                                                                        if (PatchProxy.isSupport(new Object[0], this, f52639a, false, 53486, new Class[0], Void.TYPE)) {
                                                                            PatchProxy.accessDispatch(new Object[0], this, f52639a, false, 53486, new Class[0], Void.TYPE);
                                                                            return;
                                                                        }
                                                                        try {
                                                                            e = r.f52612b.deleteStrangerSingleMsg(this.f52640b.getSender(), ad.d(this.f52640b)).get();
                                                                        } catch (InterruptedException | ExecutionException e2) {
                                                                            e = e2;
                                                                        }
                                                                        if (this.f52641c != null) {
                                                                            com.ss.android.b.a.a.a.b(new Runnable() {

                                                                                /* renamed from: a  reason: collision with root package name */
                                                                                public static ChangeQuickRedirect f52642a;

                                                                                public final void run() {
                                                                                    if (PatchProxy.isSupport(new Object[0], this, f52642a, false, 53487, new Class[0], Void.TYPE)) {
                                                                                        PatchProxy.accessDispatch(new Object[0], this, f52642a, false, 53487, new Class[0], Void.TYPE);
                                                                                        return;
                                                                                    }
                                                                                    AnonymousClass9.this.f52641c.run(e);
                                                                                }
                                                                            });
                                                                        }
                                                                    }

                                                                    {
                                                                        this.f52640b = r1;
                                                                        this.f52641c = r2;
                                                                    }
                                                                });
                                                            }
                                                            String uuid = nVar.getUuid();
                                                            int size = MessageAdapter.this.f50221e.size();
                                                            while (true) {
                                                                if (i >= size) {
                                                                    break;
                                                                } else if (TextUtils.equals(MessageAdapter.this.f50221e.get(i).getUuid(), uuid)) {
                                                                    MessageAdapter.this.f50221e.remove(i);
                                                                    break;
                                                                } else {
                                                                    i++;
                                                                }
                                                            }
                                                        } else {
                                                            o.c(nVar);
                                                        }
                                                        MessageAdapter.this.a();
                                                    }
                                                }

                                                {
                                                    this.f50251b = r2;
                                                    this.f50252c = r3;
                                                }
                                            });
                                        }
                                    }
                                } else if (view2.equals(AnonymousClass2.this.f50242f)) {
                                    com.ss.android.ugc.aweme.im.sdk.resources.k a2 = com.ss.android.ugc.aweme.im.sdk.resources.k.a();
                                    if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.resources.k.f52318a, false, 53145, new Class[0], Integer.TYPE)) {
                                        i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.resources.k.f52318a, false, 53145, new Class[0], Integer.TYPE)).intValue();
                                    } else {
                                        i = com.ss.android.ugc.aweme.im.sdk.resources.k.f52322e.size();
                                    }
                                    if (i >= 79) {
                                        com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.auf, 1).a();
                                    } else {
                                        com.ss.android.ugc.aweme.im.sdk.resources.k a3 = com.ss.android.ugc.aweme.im.sdk.resources.k.a();
                                        long imageId = ((EmojiContent) AnonymousClass2.this.i).getImageId();
                                        if (PatchProxy.isSupport(new Object[]{new Long(imageId)}, a3, com.ss.android.ugc.aweme.im.sdk.resources.k.f52318a, false, 53146, new Class[]{Long.TYPE}, Void.TYPE)) {
                                            com.ss.android.ugc.aweme.im.sdk.resources.k kVar = a3;
                                            PatchProxy.accessDispatch(new Object[]{new Long(imageId)}, kVar, com.ss.android.ugc.aweme.im.sdk.resources.k.f52318a, false, 53146, new Class[]{Long.TYPE}, Void.TYPE);
                                        } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                                            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.ave).a();
                                        } else {
                                            a.i.a((Callable<TResult>) new Callable<k.b>(imageId) {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f52346a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ long f52347b;

                                                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
                                                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>} */
                                                /* access modifiers changed from: private */
                                                /* JADX WARNING: Multi-variable type inference failed */
                                                /* renamed from: a */
                                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                                public com.ss.android.ugc.aweme.im.sdk.resources.k.b call() {
                                                    /*
                                                        r9 = this;
                                                        r0 = 0
                                                        java.lang.Object[] r1 = new java.lang.Object[r0]
                                                        com.meituan.robust.ChangeQuickRedirect r3 = f52346a
                                                        java.lang.Class[] r6 = new java.lang.Class[r0]
                                                        java.lang.Class<com.ss.android.ugc.aweme.im.sdk.resources.k$b> r7 = com.ss.android.ugc.aweme.im.sdk.resources.k.b.class
                                                        r4 = 0
                                                        r5 = 53160(0xcfa8, float:7.4493E-41)
                                                        r2 = r9
                                                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                                                        if (r1 == 0) goto L_0x0028
                                                        java.lang.Object[] r2 = new java.lang.Object[r0]
                                                        com.meituan.robust.ChangeQuickRedirect r4 = f52346a
                                                        r5 = 0
                                                        r6 = 53160(0xcfa8, float:7.4493E-41)
                                                        java.lang.Class[] r7 = new java.lang.Class[r0]
                                                        java.lang.Class<com.ss.android.ugc.aweme.im.sdk.resources.k$b> r8 = com.ss.android.ugc.aweme.im.sdk.resources.k.b.class
                                                        r3 = r9
                                                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                                                        com.ss.android.ugc.aweme.im.sdk.resources.k$b r0 = (com.ss.android.ugc.aweme.im.sdk.resources.k.b) r0
                                                        return r0
                                                    L_0x0028:
                                                        r1 = 1
                                                        r2 = 0
                                                        com.ss.android.ugc.aweme.im.sdk.utils.ImApi r3 = com.ss.android.ugc.aweme.im.sdk.utils.r.a()     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        java.lang.String r5 = "["
                                                        r4.<init>(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        long r5 = r9.f52347b     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        r4.append(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        java.lang.String r5 = "]"
                                                        r4.append(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        com.google.common.util.concurrent.q r3 = r3.collectEmoji(r1, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        java.lang.Object r3 = r3.get()     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        com.ss.android.ugc.aweme.im.sdk.resources.model.d r3 = (com.ss.android.ugc.aweme.im.sdk.resources.model.d) r3     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
                                                        goto L_0x004f
                                                    L_0x004e:
                                                        r3 = r2
                                                    L_0x004f:
                                                        if (r3 == 0) goto L_0x005e
                                                        int r4 = r3.status_code
                                                        if (r4 != 0) goto L_0x005e
                                                        java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> r4 = r3.f52355a
                                                        boolean r4 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
                                                        if (r4 != 0) goto L_0x005e
                                                        goto L_0x005f
                                                    L_0x005e:
                                                        r1 = 0
                                                    L_0x005f:
                                                        com.ss.android.ugc.aweme.im.sdk.resources.k$b r4 = new com.ss.android.ugc.aweme.im.sdk.resources.k$b
                                                        com.ss.android.ugc.aweme.im.sdk.resources.k r5 = com.ss.android.ugc.aweme.im.sdk.resources.k.this
                                                        r4.<init>(r5, r0)
                                                        r4.f52352d = r1
                                                        if (r1 != 0) goto L_0x009b
                                                        if (r3 == 0) goto L_0x009b
                                                        r5 = 7279(0x1c6f, float:1.02E-41)
                                                        int r6 = r3.status_code
                                                        if (r5 != r6) goto L_0x0084
                                                        android.content.Context r5 = com.ss.android.common.applog.GlobalContext.getContext()
                                                        android.content.res.Resources r5 = r5.getResources()
                                                        r6 = 2131560580(0x7f0d0884, float:1.8746536E38)
                                                        java.lang.String r5 = r5.getString(r6)
                                                        r4.f52354f = r5
                                                        goto L_0x009b
                                                    L_0x0084:
                                                        r5 = 7280(0x1c70, float:1.0201E-41)
                                                        int r6 = r3.status_code
                                                        if (r5 != r6) goto L_0x009b
                                                        android.content.Context r5 = com.ss.android.common.applog.GlobalContext.getContext()
                                                        android.content.res.Resources r5 = r5.getResources()
                                                        r6 = 2131560376(0x7f0d07b8, float:1.8746123E38)
                                                        java.lang.String r5 = r5.getString(r6)
                                                        r4.f52354f = r5
                                                    L_0x009b:
                                                        boolean r5 = r4.f52352d
                                                        if (r5 != 0) goto L_0x00b8
                                                        java.lang.String r5 = r4.f52354f
                                                        boolean r5 = android.text.TextUtils.isEmpty(r5)
                                                        if (r5 == 0) goto L_0x00b8
                                                        android.content.Context r5 = com.ss.android.common.applog.GlobalContext.getContext()
                                                        android.content.res.Resources r5 = r5.getResources()
                                                        r6 = 2131560615(0x7f0d08a7, float:1.8746607E38)
                                                        java.lang.String r5 = r5.getString(r6)
                                                        r4.f52354f = r5
                                                    L_0x00b8:
                                                        if (r1 == 0) goto L_0x00f6
                                                        java.lang.ref.WeakReference<java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> r1 = com.ss.android.ugc.aweme.im.sdk.resources.k.f52321d
                                                        if (r1 == 0) goto L_0x00c7
                                                        java.lang.ref.WeakReference<java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> r1 = com.ss.android.ugc.aweme.im.sdk.resources.k.f52321d
                                                        java.lang.Object r1 = r1.get()
                                                        r2 = r1
                                                        java.util.List r2 = (java.util.List) r2
                                                    L_0x00c7:
                                                        if (r2 != 0) goto L_0x00d3
                                                        com.ss.android.ugc.aweme.im.sdk.resources.k r1 = com.ss.android.ugc.aweme.im.sdk.resources.k.this
                                                        java.lang.String r1 = r1.f()
                                                        java.util.List r2 = com.ss.android.ugc.aweme.im.sdk.utils.j.a((java.lang.String) r1)
                                                    L_0x00d3:
                                                        if (r2 == 0) goto L_0x00ef
                                                        java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> r1 = r3.f52355a
                                                        java.lang.Object r0 = r1.get(r0)
                                                        r2.add(r0)
                                                        com.ss.android.ugc.aweme.im.sdk.resources.k r0 = com.ss.android.ugc.aweme.im.sdk.resources.k.this
                                                        java.lang.String r0 = r0.f()
                                                        com.ss.android.ugc.aweme.im.sdk.utils.j.a((java.lang.String) r0, (java.util.List<T>) r2)
                                                        java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                                                        r0.<init>(r2)
                                                        com.ss.android.ugc.aweme.im.sdk.resources.k.f52321d = r0
                                                        goto L_0x00f4
                                                    L_0x00ef:
                                                        java.util.ArrayList r2 = new java.util.ArrayList
                                                        r2.<init>()
                                                    L_0x00f4:
                                                        r4.f52353e = r2
                                                    L_0x00f6:
                                                        return r4
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.resources.k.AnonymousClass9.call():com.ss.android.ugc.aweme.im.sdk.resources.k$b");
                                                }

                                                {
                                                    this.f52347b = r2;
                                                }
                                            }, (Executor) a.i.f1051a).a((a.g<TResult, TContinuationResult>) new a.g<k.b, Void>() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f52344a;

                                                /* access modifiers changed from: private */
                                                /* renamed from: a */
                                                public Void then(a.i<b> iVar) {
                                                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f52344a, false, 53159, new Class[]{a.i.class}, Void.class)) {
                                                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52344a, false, 53159, new Class[]{a.i.class}, Void.class);
                                                    }
                                                    b bVar = (b) iVar.e();
                                                    if (bVar != null) {
                                                        k.this.b(bVar.f52353e, bVar.f52352d, bVar.f52354f);
                                                    } else {
                                                        k.this.b(null, false, "");
                                                    }
                                                    return null;
                                                }
                                            }, a.i.f1052b);
                                        }
                                        z a4 = z.a();
                                        if (PatchProxy.isSupport(new Object[0], a4, z.f52670a, false, 53618, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], a4, z.f52670a, false, 53618, new Class[0], Void.TYPE);
                                        } else {
                                            r.a("add_to_emoji", (Map) new HashMap());
                                        }
                                    }
                                } else if (view2.equals(AnonymousClass2.this.f50239c)) {
                                    AnonymousClass2 r0 = AnonymousClass2.this;
                                    Context context2 = view.getContext();
                                    if (PatchProxy.isSupport(new Object[]{context2}, r0, AnonymousClass2.f50237a, false, 50376, new Class[]{Context.class}, Void.TYPE)) {
                                        AnonymousClass2 r122 = r0;
                                        PatchProxy.accessDispatch(new Object[]{context2}, r122, AnonymousClass2.f50237a, false, 50376, new Class[]{Context.class}, Void.TYPE);
                                    } else {
                                        Bundle bundle = new Bundle();
                                        bundle.putSerializable("share_struct", r0.i.generateShareStruct());
                                        bundle.putSerializable("share_content", r0.i);
                                        bundle.putLong("forward_origin_msgid", r0.j.getMsgId());
                                        RelationSelectActivity.a(context2, bundle, (com.ss.android.ugc.aweme.base.a<Boolean>) null);
                                    }
                                } else if (view2.equals(AnonymousClass2.this.f50240d)) {
                                    if (MessageAdapter.this.g == null) {
                                        MessageAdapter.this.g = new com.ss.android.ugc.aweme.im.sdk.widget.f(view.getContext());
                                        com.ss.android.ugc.aweme.im.sdk.widget.f fVar = MessageAdapter.this.g;
                                        String string = GlobalContext.getContext().getString(C0906R.string.awi);
                                        if (PatchProxy.isSupport(new Object[]{string}, fVar, com.ss.android.ugc.aweme.im.sdk.widget.f.f52851a, false, 54095, new Class[]{String.class}, Void.TYPE)) {
                                            com.ss.android.ugc.aweme.im.sdk.widget.f fVar2 = fVar;
                                            PatchProxy.accessDispatch(new Object[]{string}, fVar2, com.ss.android.ugc.aweme.im.sdk.widget.f.f52851a, false, 54095, new Class[]{String.class}, Void.TYPE);
                                        } else {
                                            Intrinsics.checkParameterIsNotNull(string, "loadingTxt");
                                            fVar.f52852b.setText(string);
                                        }
                                    }
                                    MessageAdapter.this.g.show();
                                    com.bytedance.im.core.d.n nVar2 = AnonymousClass2.this.j;
                                    AnonymousClass1 r13 = new com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.n>() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f50247a;

                                        public final void a(com.bytedance.im.core.d.j jVar) {
                                            if (PatchProxy.isSupport(new Object[]{jVar}, this, f50247a, false, 50380, new Class[]{com.bytedance.im.core.d.j.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{jVar}, this, f50247a, false, 50380, new Class[]{com.bytedance.im.core.d.j.class}, Void.TYPE);
                                                return;
                                            }
                                            if (MessageAdapter.this.g != null) {
                                                MessageAdapter.this.g.dismiss();
                                            }
                                            if (MessageAdapter.this.h == null) {
                                                MessageAdapter.this.h = new PopupToast(view2.getContext(), -2, -2, 17);
                                            }
                                            MessageAdapter.this.h.showToast(GlobalContext.getContext().getString(C0906R.string.awh), 17);
                                        }

                                        public final /* synthetic */ void a(Object obj) {
                                            com.bytedance.im.core.d.n nVar = (com.bytedance.im.core.d.n) obj;
                                            if (PatchProxy.isSupport(new Object[]{nVar}, this, f50247a, false, 50379, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{nVar}, this, f50247a, false, 50379, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE);
                                                return;
                                            }
                                            if (MessageAdapter.this.g != null) {
                                                MessageAdapter.this.g.dismiss();
                                            }
                                            MessageAdapter.this.a();
                                        }
                                    };
                                    m.a();
                                    m.a(nVar2, (com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.n>) r13);
                                    String valueOf = String.valueOf(e.a(AnonymousClass2.this.j.getConversationId()));
                                    if (PatchProxy.isSupport(new Object[]{valueOf}, null, z.f52670a, true, 53634, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{valueOf}, null, z.f52670a, true, 53634, new Class[]{String.class}, Void.TYPE);
                                    } else {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("enter_from", "chat");
                                        hashMap.put("to_user_id", valueOf);
                                        r.a("recall_message", (Map) hashMap);
                                    }
                                }
                                PopupWindow popupWindow = AnonymousClass2.this.g;
                                if (PatchProxy.isSupport(new Object[]{popupWindow}, null, i.f50329a, true, 50381, new Class[]{PopupWindow.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{popupWindow}, null, i.f50329a, true, 50381, new Class[]{PopupWindow.class}, Void.TYPE);
                                } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                    popupWindow.dismiss();
                                } else {
                                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                                }
                            }
                        };
                    }
                }

                private void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f50237a, false, 50368, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50237a, false, 50368, new Class[0], Void.TYPE);
                        return;
                    }
                    b();
                    this.f50238b.setOnClickListener(this.l);
                    this.f50241e.setOnClickListener(this.l);
                    this.f50242f.setOnClickListener(this.l);
                    this.f50239c.setOnClickListener(this.l);
                    this.f50240d.setOnClickListener(this.l);
                }

                private void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f50237a, false, 50369, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f50237a, false, 50369, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    int[] a2 = ai.a(view, this.g.getContentView());
                    a2[0] = a2[0] - 20;
                    this.g.setOnDismissListener(new PopupWindow.OnDismissListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f50243a;

                        public final void onDismiss() {
                            if (PatchProxy.isSupport(new Object[0], this, f50243a, false, 50377, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f50243a, false, 50377, new Class[0], Void.TYPE);
                                return;
                            }
                            AnonymousClass2.this.f50238b.setOnClickListener(null);
                            AnonymousClass2.this.f50241e.setOnClickListener(null);
                            AnonymousClass2.this.f50239c.setOnClickListener(null);
                            AnonymousClass2.this.f50242f.setOnClickListener(null);
                        }
                    });
                    this.g.showAtLocation(view, 8388659, a2[0], a2[1]);
                }

                private void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f50237a, false, 50370, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f50237a, false, 50370, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (this.g == null) {
                        this.g = ai.a(view.getContext(), C0906R.layout.rx, view);
                        View contentView = this.g.getContentView();
                        this.f50238b = (DmtButton) contentView.findViewById(C0906R.id.zu);
                        this.f50239c = (DmtButton) contentView.findViewById(C0906R.id.cqn);
                        this.f50240d = (DmtButton) contentView.findViewById(C0906R.id.f4430cat);
                        this.f50241e = (DmtButton) contentView.findViewById(C0906R.id.a3j);
                        this.f50242f = (DmtButton) contentView.findViewById(C0906R.id.ua);
                    }
                    Context context = view.getContext();
                    a(this.f50238b, context.getString(C0906R.string.aqf));
                    a(this.f50239c, context.getString(C0906R.string.ay3));
                    a(this.f50240d, context.getString(C0906R.string.awg));
                    a(this.f50241e, context.getString(C0906R.string.aqm));
                    a(this.f50242f, context.getString(C0906R.string.aos));
                }

                public final boolean onLongClick(View view) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f50237a, false, 50367, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f50237a, false, 50367, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    } else if (view2.getTag(50331648) == null) {
                        return false;
                    } else {
                        this.h = ((Integer) view2.getTag(50331648)).intValue();
                        this.i = (BaseContent) view2.getTag(100663296);
                        this.j = (com.bytedance.im.core.d.n) view2.getTag(134217728);
                        if (this.j == null) {
                            return false;
                        }
                        boolean isSelf = this.j.isSelf();
                        boolean isRecalled = this.j.isRecalled();
                        if (this.j.getMsgStatus() == 2 || this.j.getMsgStatus() == 5) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!(this.i instanceof TextContent) || !((TextContent) this.i).isDefault()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (isRecalled) {
                            return false;
                        }
                        if (this.h == 1 || this.h == 25 || this.h == 32) {
                            b(view);
                            if ((this.i instanceof StoryReplyContent) || (this.i instanceof SelfStoryReplyContent)) {
                                this.f50238b.setText(C0906R.string.aqg);
                                this.f50239c.setVisibility(8);
                            }
                            if (com.ss.android.ugc.aweme.im.sdk.utils.m.a() || !isSelf || !z || z2) {
                                this.f50240d.setVisibility(8);
                            }
                            a();
                            a(view);
                        } else {
                            if (this.h != 2 && this.h != 8 && this.h != 9 && this.h != 10 && this.h != 14 && this.h != 11 && this.h != 19 && this.h != 15 && this.h != 16 && this.h != 17 && this.h != 18 && this.h != 20 && this.h != 21 && this.h != 22 && this.h != 23 && this.h != 26 && this.h != 27 && this.h != 28 && this.h != 29) {
                                if (!(this.h == 30 || this.h == 31 || this.h == 33 || this.h == 34 || this.h == 35 || this.h == 36 || this.h == 37)) {
                                    if (this.h == 3 && MessageAdapter.this.o != null && !this.j.isSelf() && MessageAdapter.this.m.isGroupChat()) {
                                        MessageAdapter.this.o.a(String.valueOf(this.j.getSender()));
                                        return true;
                                    }
                                }
                            }
                            b(view);
                            if (this.h != 31) {
                                this.f50238b.setVisibility(8);
                            }
                            int i2 = this.h;
                            Object[] objArr = {Integer.valueOf(i2)};
                            int i3 = i2;
                            if (PatchProxy.isSupport(objArr, this, f50237a, false, 50375, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                                z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f50237a, false, 50375, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
                            } else {
                                int i4 = i3;
                                if (i4 == 9) {
                                    z4 = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().enableSendPic();
                                } else if (i4 == 10) {
                                    z4 = com.ss.android.ugc.aweme.im.sdk.d.a.b().enableSendEmoji();
                                } else if (i4 == 19 || !(i4 == 1 || i4 == 2 || i4 == 8 || i4 == 16 || i4 == 17 || i4 == 18 || i4 == 15 || i4 == 21 || i4 == 22 || i4 == 23 || i4 == 28 || i4 == 26 || i4 == 33 || i4 == 34 || i4 == 35)) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                this.f50239c.setVisibility(0);
                            } else {
                                this.f50239c.setVisibility(8);
                            }
                            Object tag = view2.getTag(50331649);
                            if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                                this.f50239c.setVisibility(8);
                            }
                            if (com.ss.android.ugc.aweme.im.sdk.utils.m.a() || !isSelf || !z || this.h == 30 || this.h == 11 || this.h == 31) {
                                this.f50240d.setVisibility(8);
                            }
                            a();
                            a(view);
                        }
                        if (this.h == 10) {
                            if (this.i != null && this.i.getType() == 501) {
                                com.ss.android.ugc.aweme.im.sdk.resources.k a2 = com.ss.android.ugc.aweme.im.sdk.resources.k.a();
                                long imageId = ((EmojiContent) this.i).getImageId();
                                if (PatchProxy.isSupport(new Object[]{new Long(imageId)}, a2, com.ss.android.ugc.aweme.im.sdk.resources.k.f52318a, false, 53139, new Class[]{Long.TYPE}, Boolean.TYPE)) {
                                    com.ss.android.ugc.aweme.im.sdk.resources.k kVar = a2;
                                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(imageId)}, kVar, com.ss.android.ugc.aweme.im.sdk.resources.k.f52318a, false, 53139, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
                                } else {
                                    z3 = com.ss.android.ugc.aweme.im.sdk.resources.k.f52322e.contains(Long.valueOf(imageId));
                                }
                                if (!z3) {
                                    this.f50242f.setVisibility(0);
                                }
                            }
                            this.f50242f.setVisibility(8);
                        } else if (this.f50242f != null) {
                            this.f50242f.setVisibility(8);
                        }
                        return false;
                    }
                }

                private void a(DmtButton dmtButton, String str) {
                    DmtButton dmtButton2 = dmtButton;
                    if (PatchProxy.isSupport(new Object[]{dmtButton2, str}, this, f50237a, false, 50371, new Class[]{DmtButton.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dmtButton2, str}, this, f50237a, false, 50371, new Class[]{DmtButton.class, String.class}, Void.TYPE);
                        return;
                    }
                    dmtButton2.setVisibility(0);
                    dmtButton.setText(str);
                }
            };
        }
    }

    public final int a(long j2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f50217a, false, 50335, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f50217a, false, 50335, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        com.bytedance.im.core.d.n nVar = this.f50220d.get(getItemCount() - 1);
        if (nVar != null) {
            if (nVar.getIndex() <= j2) {
                i2 = getItemCount() - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    }
                    com.bytedance.im.core.d.n nVar2 = this.f50220d.get(i2);
                    if (a(nVar2) && nVar2.getIndex() > j2) {
                        this.x = this.f50220d.get(i2);
                        this.x.addLocalExt("show_unread_message_tips", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        notifyItemChanged(i2);
                        break;
                    }
                    i2--;
                }
            } else if (!this.l) {
                int itemCount = getItemCount() - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    } else if (a(this.f50220d.get(i2))) {
                        this.x = this.f50220d.get(i2);
                        this.x.addLocalExt("show_unread_message_tips", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        notifyItemChanged(i2);
                        break;
                    } else {
                        itemCount = i2 - 1;
                    }
                }
            }
        }
        i2 = -1;
        return i2;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f50217a, false, 50330, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f50217a, false, 50330, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y = this.f50219c.f21292c;
        this.f50219c.f21292c = i2;
        e();
    }

    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f50217a, false, 50322, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f50217a, false, 50322, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c.class}, Void.TYPE);
            return;
        }
        this.i = cVar;
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50348, new Class[0], Void.TYPE);
        } else if (this.t == null) {
            this.t = new i() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50256a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f50256a, false, 50387, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50256a, false, 50387, new Class[0], Void.TYPE);
                        return;
                    }
                    MessageAdapter.this.j = null;
                    MessageAdapter.this.a();
                }

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f50256a, false, 50388, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50256a, false, 50388, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.im.sdk.chat.net.b.a().b();
                }

                public final void a() {
                    int i;
                    if (PatchProxy.isSupport(new Object[0], this, f50256a, false, 50386, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50256a, false, 50386, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.im.sdk.chat.net.b a2 = com.ss.android.ugc.aweme.im.sdk.chat.net.b.a();
                    o oVar = MessageAdapter.this.m;
                    if (PatchProxy.isSupport(new Object[]{oVar}, a2, com.ss.android.ugc.aweme.im.sdk.chat.net.b.f50912a, false, 51227, new Class[]{o.class}, com.bytedance.im.core.d.n.class)) {
                        com.ss.android.ugc.aweme.im.sdk.chat.net.b bVar = a2;
                        com.bytedance.im.core.d.n nVar = (com.bytedance.im.core.d.n) PatchProxy.accessDispatch(new Object[]{oVar}, bVar, com.ss.android.ugc.aweme.im.sdk.chat.net.b.f50912a, false, 51227, new Class[]{o.class}, com.bytedance.im.core.d.n.class);
                    } else {
                        com.bytedance.im.core.d.b a3 = d.a().a(oVar.getConversationId());
                        com.bytedance.im.core.d.n lastMessage = a3.getLastMessage();
                        long j = 1;
                        if (lastMessage != null) {
                            j = 1 + lastMessage.getOrderIndex();
                        }
                        com.bytedance.im.core.d.n a4 = new n.a().a(a3).a(17).a("FakeVoiceMessage").a();
                        a4.setOrderIndex(j);
                        a4.setSender(com.ss.android.ugc.aweme.im.sdk.utils.d.d());
                        if (oVar.getChatType() == 3) {
                            i = d.a.f20887b;
                        } else {
                            i = d.a.f20886a;
                        }
                        a4.setConversationType(i);
                        a2.f50913b = a4;
                        ad.b(a4);
                    }
                }

                public final void b(com.bytedance.im.core.d.n nVar) {
                    MessageAdapter.this.k = nVar;
                }

                public final void a(com.bytedance.im.core.d.n nVar) {
                    if (PatchProxy.isSupport(new Object[]{nVar}, this, f50256a, false, 50389, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{nVar}, this, f50256a, false, 50389, new Class[]{com.bytedance.im.core.d.n.class}, Void.TYPE);
                        return;
                    }
                    MessageAdapter.this.j = nVar;
                    MessageAdapter.this.a();
                }

                public final void a(File file, long j) {
                    com.bytedance.im.core.d.n nVar;
                    long j2 = j;
                    int i = 2;
                    if (PatchProxy.isSupport(new Object[]{file, new Long(j2)}, this, f50256a, false, 50384, new Class[]{File.class, Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{file, new Long(j2)}, this, f50256a, false, 50384, new Class[]{File.class, Long.TYPE}, Void.TYPE);
                        return;
                    }
                    if (file == null || !file.exists() || !file.isFile() || file.length() <= 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("tag", "MessageAdapter");
                        if (PatchProxy.isSupport(new Object[]{file}, null, com.ss.android.ugc.aweme.im.sdk.utils.e.f52582a, true, 53363, new Class[]{File.class}, Integer.TYPE)) {
                            i = ((Integer) PatchProxy.accessDispatch(new Object[]{file}, null, com.ss.android.ugc.aweme.im.sdk.utils.e.f52582a, true, 53363, new Class[]{File.class}, Integer.TYPE)).intValue();
                        } else if (file == null) {
                            i = 1;
                        } else if (file.exists()) {
                            if (!file.isFile()) {
                                i = 3;
                            } else if (file.length() == 0) {
                                i = 4;
                            } else {
                                i = 0;
                            }
                        }
                        hashMap.put("error", String.valueOf(i));
                        com.ss.android.ugc.aweme.im.sdk.utils.d.a("audio_message_send", hashMap);
                        com.ss.android.ugc.aweme.im.sdk.chat.net.b.a().b();
                    } else {
                        com.ss.android.ugc.aweme.im.sdk.chat.net.b a2 = com.ss.android.ugc.aweme.im.sdk.chat.net.b.a();
                        String absolutePath = file.getAbsolutePath();
                        if (PatchProxy.isSupport(new Object[]{absolutePath, new Long(j2), null}, a2, com.ss.android.ugc.aweme.im.sdk.chat.net.b.f50912a, false, 51223, new Class[]{String.class, Long.TYPE, ba.a.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.im.sdk.chat.net.b bVar = a2;
                            PatchProxy.accessDispatch(new Object[]{absolutePath, new Long(j2), null}, bVar, com.ss.android.ugc.aweme.im.sdk.chat.net.b.f50912a, false, 51223, new Class[]{String.class, Long.TYPE, ba.a.class}, Void.TYPE);
                        } else {
                            if (!TextUtils.isEmpty(absolutePath)) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("tag", "AudioMsgSender");
                                com.ss.android.ugc.aweme.im.sdk.utils.d.a("audio_message_send", hashMap2);
                                AudioContent audioContent = new AudioContent();
                                audioContent.setMd5(DigestUtils.md5Hex(absolutePath));
                                audioContent.setDuration(j2);
                                if (PatchProxy.isSupport(new Object[]{audioContent, absolutePath}, a2, com.ss.android.ugc.aweme.im.sdk.chat.net.b.f50912a, false, 51226, new Class[]{AudioContent.class, String.class}, com.bytedance.im.core.d.n.class)) {
                                    com.ss.android.ugc.aweme.im.sdk.chat.net.b bVar2 = a2;
                                    nVar = (com.bytedance.im.core.d.n) PatchProxy.accessDispatch(new Object[]{audioContent, absolutePath}, bVar2, com.ss.android.ugc.aweme.im.sdk.chat.net.b.f50912a, false, 51226, new Class[]{AudioContent.class, String.class}, com.bytedance.im.core.d.n.class);
                                } else {
                                    a2.f50913b.setContent(JSON.toJSONString(audioContent));
                                    com.bytedance.im.core.d.a aVar = new com.bytedance.im.core.d.a();
                                    aVar.setMsgUuid(a2.f50913b.getUuid());
                                    aVar.setLocalPath(absolutePath);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(aVar);
                                    a2.f50913b.setMsgStatus(0);
                                    a2.f50913b.setAttachments(arrayList);
                                    nVar = a2.f50913b;
                                }
                                ad.b(nVar);
                                a2.a(nVar);
                            }
                        }
                    }
                }
            };
        }
        i iVar = this.t;
        if (PatchProxy.isSupport(new Object[]{iVar}, cVar, com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c.f50356a, false, 50666, new Class[]{i.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{iVar}, cVar2, com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c.f50356a, false, 50666, new Class[]{i.class}, Void.TYPE);
        } else if (!cVar.g.contains(iVar)) {
            cVar.g.add(iVar);
        }
        if (PatchProxy.isSupport(new Object[0], this, f50217a, false, 50347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50217a, false, 50347, new Class[0], Void.TYPE);
        } else if (this.s == null) {
            this.s = new f.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50254a;

                public final void a(double d2) {
                }

                public final void a(Throwable th) {
                }

                public final void a(String str, UrlModel urlModel) {
                    if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50254a, false, 50383, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50254a, false, 50383, new Class[]{String.class, UrlModel.class}, Void.TYPE);
                        return;
                    }
                    if (MessageAdapter.this.k.getLocalExt().get("localpath") == null || !MessageAdapter.this.k.getLocalExt().get("localpath").equals(str)) {
                        MessageAdapter.this.k.addLocalExt("localpath", str);
                        ad.b(MessageAdapter.this.k);
                    }
                    MessageAdapter.this.i.a(MessageAdapter.this.k);
                }
            };
        }
        cVar.h = this.s;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f50217a, false, 50341, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class)) {
            return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f50217a, false, 50341, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class);
        }
        m valueOf = m.valueOf(i2);
        BaseViewHolder viewHolder = valueOf.getViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(valueOf.getItemLayoutId(), viewGroup, false));
        viewHolder.a(this.q);
        viewHolder.a(this.r);
        return viewHolder;
    }

    public /* synthetic */ void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{baseViewHolder, Integer.valueOf(i2)}, this, f50217a, false, 50343, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseViewHolder, Integer.valueOf(i2)}, this, f50217a, false, 50343, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        as.a("onBindViewHolder");
        if (baseViewHolder.f51050d == 9) {
            this.p = (LoadMoreViewHolder) baseViewHolder;
            this.p.e();
        } else {
            com.bytedance.im.core.d.n nVar = this.f50220d.get(i2);
            if (baseViewHolder instanceof VoiceMessageViewHolder) {
                VoiceMessageViewHolder voiceMessageViewHolder = (VoiceMessageViewHolder) baseViewHolder;
                if (this.j == null) {
                    str = null;
                } else {
                    str = this.j.getUuid();
                }
                voiceMessageViewHolder.s = str;
            }
            if (i2 < this.f50220d.size() - 1) {
                baseViewHolder.a(nVar, this.f50220d.get(i2 + 1), m.content(nVar), i2);
            } else {
                baseViewHolder.a(nVar, null, m.content(nVar), i2);
            }
            if (nVar.isSelf()) {
                baseViewHolder.a(this.v, nVar, i2);
            } else if (this.m.isGroupChat()) {
                baseViewHolder.a(com.ss.android.ugc.aweme.im.sdk.d.e.a().a(String.valueOf(nVar.getSender())), nVar, i2);
            } else {
                baseViewHolder.a(this.m.getSingleChatFromUser(), nVar, i2);
            }
        }
        as.b("onBindViewHolder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50217a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 50327(0xc497, float:7.0523E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50217a
            r3 = 0
            r4 = 50327(0xc497, float:7.0523E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            if (r11 != 0) goto L_0x004a
            return
        L_0x004a:
            r0 = r11
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0124 }
            int r1 = r0.size()     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r2 = r0.get(r8)     // Catch:{ Exception -> 0x0124 }
            com.bytedance.im.core.d.n r2 = (com.bytedance.im.core.d.n) r2     // Catch:{ Exception -> 0x0124 }
            switch(r12) {
                case 0: goto L_0x0100;
                case 1: goto L_0x006c;
                case 2: goto L_0x0124;
                case 3: goto L_0x005c;
                default: goto L_0x005a;
            }     // Catch:{ Exception -> 0x0124 }
        L_0x005a:
            goto L_0x0123
        L_0x005c:
            java.util.List<com.bytedance.im.core.d.n> r3 = r10.f50220d     // Catch:{ Exception -> 0x0124 }
            int r2 = r3.indexOf(r2)     // Catch:{ Exception -> 0x0124 }
            java.util.List<com.bytedance.im.core.d.n> r3 = r10.f50220d     // Catch:{ Exception -> 0x0124 }
            r3.removeAll(r0)     // Catch:{ Exception -> 0x0124 }
            r10.notifyItemRangeRemoved(r2, r1)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0123
        L_0x006c:
            java.util.List<com.bytedance.im.core.d.n> r2 = r10.f50220d     // Catch:{ Exception -> 0x0124 }
            r2.addAll(r8, r0)     // Catch:{ Exception -> 0x0124 }
            r10.notifyItemRangeInserted(r8, r1)     // Catch:{ Exception -> 0x0124 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0124 }
            com.meituan.robust.ChangeQuickRedirect r2 = f50217a     // Catch:{ Exception -> 0x0124 }
            r3 = 0
            r4 = 50333(0xc49d, float:7.0532E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0124 }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0124 }
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x009f
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0124 }
            com.meituan.robust.ChangeQuickRedirect r2 = f50217a     // Catch:{ Exception -> 0x0124 }
            r3 = 0
            r4 = 50333(0xc49d, float:7.0532E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0124 }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0124 }
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0124 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0124 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0124 }
            goto L_0x00c0
        L_0x009f:
            android.support.v7.widget.RecyclerView r0 = r10.f50222f     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x00bf
            android.support.v7.widget.RecyclerView r0 = r10.f50222f     // Catch:{ Exception -> 0x0124 }
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()     // Catch:{ Exception -> 0x0124 }
            boolean r0 = r0 instanceof android.support.v7.widget.LinearLayoutManager     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x00bf
            android.support.v7.widget.RecyclerView r0 = r10.f50222f     // Catch:{ Exception -> 0x0124 }
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()     // Catch:{ Exception -> 0x0124 }
            android.support.v7.widget.LinearLayoutManager r0 = (android.support.v7.widget.LinearLayoutManager) r0     // Catch:{ Exception -> 0x0124 }
            int r0 = r0.findFirstVisibleItemPosition()     // Catch:{ Exception -> 0x0124 }
            r1 = 10
            if (r0 > r1) goto L_0x00bf
            r0 = 1
            goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            if (r0 == 0) goto L_0x0123
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0124 }
            com.meituan.robust.ChangeQuickRedirect r2 = f50217a     // Catch:{ Exception -> 0x0124 }
            r3 = 0
            r4 = 50332(0xc49c, float:7.053E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0124 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0124 }
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x00e6
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0124 }
            com.meituan.robust.ChangeQuickRedirect r2 = f50217a     // Catch:{ Exception -> 0x0124 }
            r3 = 0
            r4 = 50332(0xc49c, float:7.053E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0124 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0124 }
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0123
        L_0x00e6:
            android.support.v7.widget.RecyclerView r0 = r10.f50222f     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x0124
            android.support.v7.widget.RecyclerView r0 = r10.f50222f     // Catch:{ Exception -> 0x0124 }
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()     // Catch:{ Exception -> 0x0124 }
            boolean r0 = r0 instanceof android.support.v7.widget.LinearLayoutManager     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x0124
            android.support.v7.widget.RecyclerView r0 = r10.f50222f     // Catch:{ Exception -> 0x0124 }
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()     // Catch:{ Exception -> 0x0124 }
            android.support.v7.widget.LinearLayoutManager r0 = (android.support.v7.widget.LinearLayoutManager) r0     // Catch:{ Exception -> 0x0124 }
            r0.scrollToPositionWithOffset(r8, r8)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0124
        L_0x0100:
            java.util.List<com.bytedance.im.core.d.n> r3 = r10.f50220d     // Catch:{ Exception -> 0x0124 }
            int r3 = r3.indexOf(r2)     // Catch:{ Exception -> 0x0124 }
            r4 = -1
            if (r3 == r4) goto L_0x0123
        L_0x0109:
            int r4 = r0.size()     // Catch:{ Exception -> 0x0124 }
            if (r8 >= r4) goto L_0x011f
            int r4 = r8 + r3
            int r5 = r10.getItemCount()     // Catch:{ Exception -> 0x0124 }
            if (r4 >= r5) goto L_0x011f
            java.util.List<com.bytedance.im.core.d.n> r5 = r10.f50220d     // Catch:{ Exception -> 0x0124 }
            r5.set(r4, r2)     // Catch:{ Exception -> 0x0124 }
            int r8 = r8 + 1
            goto L_0x0109
        L_0x011f:
            r10.notifyItemRangeChanged(r3, r1)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0124
        L_0x0123:
            return
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.MessageAdapter.a(java.lang.Object, int):void");
    }
}
