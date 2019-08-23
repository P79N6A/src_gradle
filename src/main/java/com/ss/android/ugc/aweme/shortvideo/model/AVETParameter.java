package com.ss.android.ugc.aweme.shortvideo.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/AVETParameter;", "Ljava/io/Serializable;", "()V", "contentSource", "", "getContentSource", "()Ljava/lang/String;", "setContentSource", "(Ljava/lang/String;)V", "contentType", "getContentType", "setContentType", "creationId", "getCreationId", "setCreationId", "draftId", "", "getDraftId", "()I", "setDraftId", "(I)V", "shootMode", "getShootMode", "setShootMode", "shootWay", "getShootWay", "setShootWay", "storySceneId", "getStorySceneId", "setStorySceneId", "storyShootEntrance", "getStoryShootEntrance", "setStoryShootEntrance", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class AVETParameter implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private String contentSource = "shoot";
    @NotNull
    private String contentType = "video";
    @NotNull
    private String creationId = "";
    private int draftId;
    private int shootMode;
    @NotNull
    private String shootWay = "";
    @NotNull
    private String storySceneId = "";
    @NotNull
    private String storyShootEntrance = "";

    @NotNull
    public final String getContentSource() {
        return this.contentSource;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftId() {
        return this.draftId;
    }

    public final int getShootMode() {
        return this.shootMode;
    }

    @NotNull
    public final String getShootWay() {
        return this.shootWay;
    }

    @NotNull
    public final String getStorySceneId() {
        return this.storySceneId;
    }

    @NotNull
    public final String getStoryShootEntrance() {
        return this.storyShootEntrance;
    }

    public final void setDraftId(int i) {
        this.draftId = i;
    }

    public final void setShootMode(int i) {
        this.shootMode = i;
    }

    public final void setContentSource(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 77608, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 77608, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.contentSource = str2;
    }

    public final void setContentType(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 77607, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 77607, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.contentType = str2;
    }

    public final void setCreationId(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 77604, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 77604, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.creationId = str2;
    }

    public final void setShootWay(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 77605, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 77605, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.shootWay = str2;
    }

    public final void setStorySceneId(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 77606, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 77606, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.storySceneId = str2;
    }

    public final void setStoryShootEntrance(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 77609, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 77609, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.storyShootEntrance = str2;
    }
}
