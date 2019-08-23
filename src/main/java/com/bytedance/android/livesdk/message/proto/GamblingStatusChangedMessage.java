package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GamblingStatusChangedMessage extends Message<GamblingStatusChangedMessage, Builder> {
    public static final ProtoAdapter<GamblingStatusChangedMessage> ADAPTER = new ProtoAdapter_GamblingStatusChangedMessage();
    public static final Long DEFAULT_PREV_STATUS = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.GamblingStatusChangedMessage$GameQuizInfo#ADAPTER", tag = 3)
    public final GameQuizInfo game_quiz_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long prev_status;

    public static final class GameQuizInfo extends Message<GameQuizInfo, Builder> {
        public static final ProtoAdapter<GameQuizInfo> ADAPTER = new ProtoAdapter_GameQuizInfo();
        public static final Long DEFAULT_ID = 0L;
        public static final Long DEFAULT_ROOM_ID = 0L;
        public static final Long DEFAULT_STATUS = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long id;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long room_id;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long status;

        public static final class Builder extends Message.Builder<GameQuizInfo, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long id;
            public Long room_id;
            public Long status;

            public final GameQuizInfo build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11493, new Class[0], GameQuizInfo.class)) {
                    return new GameQuizInfo(this.id, this.room_id, this.status, super.buildUnknownFields());
                }
                return (GameQuizInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11493, new Class[0], GameQuizInfo.class);
            }

            public final Builder id(Long l) {
                this.id = l;
                return this;
            }

            public final Builder room_id(Long l) {
                this.room_id = l;
                return this;
            }

            public final Builder status(Long l) {
                this.status = l;
                return this;
            }
        }

        static final class ProtoAdapter_GameQuizInfo extends ProtoAdapter<GameQuizInfo> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_GameQuizInfo() {
                super(FieldEncoding.LENGTH_DELIMITED, GameQuizInfo.class);
            }

            public final int encodedSize(GameQuizInfo gameQuizInfo) {
                int i;
                int i2;
                GameQuizInfo gameQuizInfo2 = gameQuizInfo;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[]{gameQuizInfo2}, this, changeQuickRedirect, false, 11494, new Class[]{GameQuizInfo.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{gameQuizInfo2}, this, changeQuickRedirect, false, 11494, new Class[]{GameQuizInfo.class}, Integer.TYPE)).intValue();
                }
                if (gameQuizInfo2.id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, gameQuizInfo2.id);
                } else {
                    i = 0;
                }
                if (gameQuizInfo2.room_id != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, gameQuizInfo2.room_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (gameQuizInfo2.status != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, gameQuizInfo2.status);
                }
                return i4 + i3 + gameQuizInfo.unknownFields().size();
            }

            public final GameQuizInfo redact(GameQuizInfo gameQuizInfo) {
                if (PatchProxy.isSupport(new Object[]{gameQuizInfo}, this, changeQuickRedirect, false, 11497, new Class[]{GameQuizInfo.class}, GameQuizInfo.class)) {
                    return (GameQuizInfo) PatchProxy.accessDispatch(new Object[]{gameQuizInfo}, this, changeQuickRedirect, false, 11497, new Class[]{GameQuizInfo.class}, GameQuizInfo.class);
                }
                Builder newBuilder = gameQuizInfo.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final GameQuizInfo decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11496, new Class[]{ProtoReader.class}, GameQuizInfo.class)) {
                    return (GameQuizInfo) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11496, new Class[]{ProtoReader.class}, GameQuizInfo.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.room_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.status((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                        }
                    } else {
                        protoReader2.endMessage(beginMessage);
                        return builder.build();
                    }
                }
            }

            public final void encode(ProtoWriter protoWriter, GameQuizInfo gameQuizInfo) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                GameQuizInfo gameQuizInfo2 = gameQuizInfo;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, gameQuizInfo2}, this, changeQuickRedirect, false, 11495, new Class[]{ProtoWriter.class, GameQuizInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, gameQuizInfo2}, this, changeQuickRedirect, false, 11495, new Class[]{ProtoWriter.class, GameQuizInfo.class}, Void.TYPE);
                    return;
                }
                if (gameQuizInfo2.id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, gameQuizInfo2.id);
                }
                if (gameQuizInfo2.room_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, gameQuizInfo2.room_id);
                }
                if (gameQuizInfo2.status != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, gameQuizInfo2.status);
                }
                protoWriter2.writeBytes(gameQuizInfo.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11489, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11489, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.id = this.id;
            builder.room_id = this.room_id;
            builder.status = this.status;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11491, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11491, new Class[0], Integer.TYPE)).intValue();
            }
            int i4 = this.hashCode;
            if (i4 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.id != null) {
                    i = this.id.hashCode();
                } else {
                    i = 0;
                }
                int i5 = (hashCode + i) * 37;
                if (this.room_id != null) {
                    i2 = this.room_id.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = (i5 + i2) * 37;
                if (this.status != null) {
                    i3 = this.status.hashCode();
                }
                i4 = i6 + i3;
                this.hashCode = i4;
            }
            return i4;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11492, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11492, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.room_id != null) {
                sb.append(", room_id=");
                sb.append(this.room_id);
            }
            if (this.status != null) {
                sb.append(", status=");
                sb.append(this.status);
            }
            StringBuilder replace = sb.replace(0, 2, "GameQuizInfo{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11490, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11490, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof GameQuizInfo)) {
                    return false;
                }
                GameQuizInfo gameQuizInfo = (GameQuizInfo) obj;
                if (!unknownFields().equals(gameQuizInfo.unknownFields()) || !Internal.equals(this.id, gameQuizInfo.id) || !Internal.equals(this.room_id, gameQuizInfo.room_id) || !Internal.equals(this.status, gameQuizInfo.status)) {
                    return false;
                }
                return true;
            }
        }

        public GameQuizInfo(Long l, Long l2, Long l3) {
            this(l, l2, l3, ByteString.EMPTY);
        }

        public GameQuizInfo(Long l, Long l2, Long l3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = l;
            this.room_id = l2;
            this.status = l3;
        }
    }

    public static final class Builder extends Message.Builder<GamblingStatusChangedMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public GameQuizInfo game_quiz_info;
        public Long prev_status;

        public final GamblingStatusChangedMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11488, new Class[0], GamblingStatusChangedMessage.class)) {
                return new GamblingStatusChangedMessage(this.common, this.prev_status, this.game_quiz_info, super.buildUnknownFields());
            }
            return (GamblingStatusChangedMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11488, new Class[0], GamblingStatusChangedMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder game_quiz_info(GameQuizInfo gameQuizInfo) {
            this.game_quiz_info = gameQuizInfo;
            return this;
        }

        public final Builder prev_status(Long l) {
            this.prev_status = l;
            return this;
        }
    }

    static final class ProtoAdapter_GamblingStatusChangedMessage extends ProtoAdapter<GamblingStatusChangedMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_GamblingStatusChangedMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, GamblingStatusChangedMessage.class);
        }

        public final int encodedSize(GamblingStatusChangedMessage gamblingStatusChangedMessage) {
            int i;
            int i2;
            GamblingStatusChangedMessage gamblingStatusChangedMessage2 = gamblingStatusChangedMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{gamblingStatusChangedMessage2}, this, changeQuickRedirect, false, 11498, new Class[]{GamblingStatusChangedMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{gamblingStatusChangedMessage2}, this, changeQuickRedirect, false, 11498, new Class[]{GamblingStatusChangedMessage.class}, Integer.TYPE)).intValue();
            }
            if (gamblingStatusChangedMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, gamblingStatusChangedMessage2.common);
            } else {
                i = 0;
            }
            if (gamblingStatusChangedMessage2.prev_status != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, gamblingStatusChangedMessage2.prev_status);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (gamblingStatusChangedMessage2.game_quiz_info != null) {
                i3 = GameQuizInfo.ADAPTER.encodedSizeWithTag(3, gamblingStatusChangedMessage2.game_quiz_info);
            }
            return i4 + i3 + gamblingStatusChangedMessage.unknownFields().size();
        }

        public final GamblingStatusChangedMessage redact(GamblingStatusChangedMessage gamblingStatusChangedMessage) {
            if (PatchProxy.isSupport(new Object[]{gamblingStatusChangedMessage}, this, changeQuickRedirect, false, 11501, new Class[]{GamblingStatusChangedMessage.class}, GamblingStatusChangedMessage.class)) {
                return (GamblingStatusChangedMessage) PatchProxy.accessDispatch(new Object[]{gamblingStatusChangedMessage}, this, changeQuickRedirect, false, 11501, new Class[]{GamblingStatusChangedMessage.class}, GamblingStatusChangedMessage.class);
            }
            Builder newBuilder = gamblingStatusChangedMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.game_quiz_info != null) {
                newBuilder.game_quiz_info = (GameQuizInfo) GameQuizInfo.ADAPTER.redact(newBuilder.game_quiz_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GamblingStatusChangedMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11500, new Class[]{ProtoReader.class}, GamblingStatusChangedMessage.class)) {
                return (GamblingStatusChangedMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11500, new Class[]{ProtoReader.class}, GamblingStatusChangedMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.prev_status((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.game_quiz_info((GameQuizInfo) GameQuizInfo.ADAPTER.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GamblingStatusChangedMessage gamblingStatusChangedMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            GamblingStatusChangedMessage gamblingStatusChangedMessage2 = gamblingStatusChangedMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, gamblingStatusChangedMessage2}, this, changeQuickRedirect, false, 11499, new Class[]{ProtoWriter.class, GamblingStatusChangedMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, gamblingStatusChangedMessage2}, this, changeQuickRedirect, false, 11499, new Class[]{ProtoWriter.class, GamblingStatusChangedMessage.class}, Void.TYPE);
                return;
            }
            if (gamblingStatusChangedMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, gamblingStatusChangedMessage2.common);
            }
            if (gamblingStatusChangedMessage2.prev_status != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, gamblingStatusChangedMessage2.prev_status);
            }
            if (gamblingStatusChangedMessage2.game_quiz_info != null) {
                GameQuizInfo.ADAPTER.encodeWithTag(protoWriter2, 3, gamblingStatusChangedMessage2.game_quiz_info);
            }
            protoWriter2.writeBytes(gamblingStatusChangedMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11484, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11484, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.prev_status = this.prev_status;
        builder.game_quiz_info = this.game_quiz_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11486, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11486, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.prev_status != null) {
                i2 = this.prev_status.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.game_quiz_info != null) {
                i3 = this.game_quiz_info.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11487, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11487, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.prev_status != null) {
            sb.append(", prev_status=");
            sb.append(this.prev_status);
        }
        if (this.game_quiz_info != null) {
            sb.append(", game_quiz_info=");
            sb.append(this.game_quiz_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GamblingStatusChangedMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11485, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11485, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof GamblingStatusChangedMessage)) {
                return false;
            }
            GamblingStatusChangedMessage gamblingStatusChangedMessage = (GamblingStatusChangedMessage) obj;
            if (!unknownFields().equals(gamblingStatusChangedMessage.unknownFields()) || !Internal.equals(this.common, gamblingStatusChangedMessage.common) || !Internal.equals(this.prev_status, gamblingStatusChangedMessage.prev_status) || !Internal.equals(this.game_quiz_info, gamblingStatusChangedMessage.game_quiz_info)) {
                return false;
            }
            return true;
        }
    }

    public GamblingStatusChangedMessage(Common common2, Long l, GameQuizInfo gameQuizInfo) {
        this(common2, l, gameQuizInfo, ByteString.EMPTY);
    }

    public GamblingStatusChangedMessage(Common common2, Long l, GameQuizInfo gameQuizInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.prev_status = l;
        this.game_quiz_info = gameQuizInfo;
    }
}
