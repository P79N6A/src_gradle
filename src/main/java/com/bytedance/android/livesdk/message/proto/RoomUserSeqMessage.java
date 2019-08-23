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
import java.util.List;
import okio.ByteString;

public final class RoomUserSeqMessage extends Message<RoomUserSeqMessage, Builder> {
    public static final ProtoAdapter<RoomUserSeqMessage> ADAPTER = new ProtoAdapter_RoomUserSeqMessage();
    public static final Long DEFAULT_TOTAL = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String pop_str;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.RoomUserSeqMessage$Contributor#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<Contributor> ranks;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.RoomUserSeqMessage$Contributor#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<Contributor> seats;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long total;

    public static final class Contributor extends Message<Contributor, Builder> {
        public static final ProtoAdapter<Contributor> ADAPTER = new ProtoAdapter_Contributor();
        public static final Long DEFAULT_DELTA = 0L;
        public static final Long DEFAULT_RANK = 0L;
        public static final Long DEFAULT_SCORE = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
        public final Long delta;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long rank;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long score;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
        public final User user;

        public static final class Builder extends Message.Builder<Contributor, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long delta;
            public Long rank;
            public Long score;
            public User user;

            public final Contributor build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12110, new Class[0], Contributor.class)) {
                    return (Contributor) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12110, new Class[0], Contributor.class);
                }
                Contributor contributor = new Contributor(this.score, this.user, this.rank, this.delta, super.buildUnknownFields());
                return contributor;
            }

            public final Builder delta(Long l) {
                this.delta = l;
                return this;
            }

            public final Builder rank(Long l) {
                this.rank = l;
                return this;
            }

            public final Builder score(Long l) {
                this.score = l;
                return this;
            }

            public final Builder user(User user2) {
                this.user = user2;
                return this;
            }
        }

        static final class ProtoAdapter_Contributor extends ProtoAdapter<Contributor> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Contributor() {
                super(FieldEncoding.LENGTH_DELIMITED, Contributor.class);
            }

            public final Contributor redact(Contributor contributor) {
                if (PatchProxy.isSupport(new Object[]{contributor}, this, changeQuickRedirect, false, 12114, new Class[]{Contributor.class}, Contributor.class)) {
                    return (Contributor) PatchProxy.accessDispatch(new Object[]{contributor}, this, changeQuickRedirect, false, 12114, new Class[]{Contributor.class}, Contributor.class);
                }
                Builder newBuilder = contributor.newBuilder();
                if (newBuilder.user != null) {
                    newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Contributor decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12113, new Class[]{ProtoReader.class}, Contributor.class)) {
                    return (Contributor) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12113, new Class[]{ProtoReader.class}, Contributor.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.score((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.user((User) User.ADAPTER.decode(protoReader2));
                                break;
                            case 3:
                                builder.rank((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.delta((Long) ProtoAdapter.INT64.decode(protoReader2));
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

            public final int encodedSize(Contributor contributor) {
                int i;
                int i2;
                int i3;
                Contributor contributor2 = contributor;
                int i4 = 0;
                if (PatchProxy.isSupport(new Object[]{contributor2}, this, changeQuickRedirect, false, 12111, new Class[]{Contributor.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{contributor2}, this, changeQuickRedirect, false, 12111, new Class[]{Contributor.class}, Integer.TYPE)).intValue();
                }
                if (contributor2.score != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, contributor2.score);
                } else {
                    i = 0;
                }
                if (contributor2.user != null) {
                    i2 = User.ADAPTER.encodedSizeWithTag(2, contributor2.user);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (contributor2.rank != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, contributor2.rank);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (contributor2.delta != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, contributor2.delta);
                }
                return i6 + i4 + contributor.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, Contributor contributor) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Contributor contributor2 = contributor;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, contributor2}, this, changeQuickRedirect, false, 12112, new Class[]{ProtoWriter.class, Contributor.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, contributor2}, this, changeQuickRedirect, false, 12112, new Class[]{ProtoWriter.class, Contributor.class}, Void.TYPE);
                    return;
                }
                if (contributor2.score != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, contributor2.score);
                }
                if (contributor2.user != null) {
                    User.ADAPTER.encodeWithTag(protoWriter2, 2, contributor2.user);
                }
                if (contributor2.rank != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, contributor2.rank);
                }
                if (contributor2.delta != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, contributor2.delta);
                }
                protoWriter2.writeBytes(contributor.unknownFields());
            }
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12108, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12108, new Class[0], Integer.TYPE)).intValue();
            }
            int i5 = this.hashCode;
            if (i5 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.score != null) {
                    i = this.score.hashCode();
                } else {
                    i = 0;
                }
                int i6 = (hashCode + i) * 37;
                if (this.user != null) {
                    i2 = this.user.hashCode();
                } else {
                    i2 = 0;
                }
                int i7 = (i6 + i2) * 37;
                if (this.rank != null) {
                    i3 = this.rank.hashCode();
                } else {
                    i3 = 0;
                }
                int i8 = (i7 + i3) * 37;
                if (this.delta != null) {
                    i4 = this.delta.hashCode();
                }
                i5 = i8 + i4;
                this.hashCode = i5;
            }
            return i5;
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12106, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12106, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.score = this.score;
            builder.user = this.user;
            builder.rank = this.rank;
            builder.delta = this.delta;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12109, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12109, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.score != null) {
                sb.append(", score=");
                sb.append(this.score);
            }
            if (this.user != null) {
                sb.append(", user=");
                sb.append(this.user);
            }
            if (this.rank != null) {
                sb.append(", rank=");
                sb.append(this.rank);
            }
            if (this.delta != null) {
                sb.append(", delta=");
                sb.append(this.delta);
            }
            StringBuilder replace = sb.replace(0, 2, "Contributor{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12107, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12107, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Contributor)) {
                    return false;
                }
                Contributor contributor = (Contributor) obj;
                if (!unknownFields().equals(contributor.unknownFields()) || !Internal.equals(this.score, contributor.score) || !Internal.equals(this.user, contributor.user) || !Internal.equals(this.rank, contributor.rank) || !Internal.equals(this.delta, contributor.delta)) {
                    return false;
                }
                return true;
            }
        }

        public Contributor(Long l, User user2, Long l2, Long l3) {
            this(l, user2, l2, l3, ByteString.EMPTY);
        }

        public Contributor(Long l, User user2, Long l2, Long l3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.score = l;
            this.user = user2;
            this.rank = l2;
            this.delta = l3;
        }
    }

    public static final class Builder extends Message.Builder<RoomUserSeqMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String pop_str;
        public List<Contributor> ranks = Internal.newMutableList();
        public List<Contributor> seats = Internal.newMutableList();
        public Long total;

        public final RoomUserSeqMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12105, new Class[0], RoomUserSeqMessage.class)) {
                return (RoomUserSeqMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12105, new Class[0], RoomUserSeqMessage.class);
            }
            RoomUserSeqMessage roomUserSeqMessage = new RoomUserSeqMessage(this.common, this.ranks, this.total, this.pop_str, this.seats, super.buildUnknownFields());
            return roomUserSeqMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder pop_str(String str) {
            this.pop_str = str;
            return this;
        }

        public final Builder total(Long l) {
            this.total = l;
            return this;
        }

        public final Builder ranks(List<Contributor> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12103, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12103, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.ranks = list;
            return this;
        }

        public final Builder seats(List<Contributor> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12104, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12104, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.seats = list;
            return this;
        }
    }

    static final class ProtoAdapter_RoomUserSeqMessage extends ProtoAdapter<RoomUserSeqMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RoomUserSeqMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, RoomUserSeqMessage.class);
        }

        public final RoomUserSeqMessage redact(RoomUserSeqMessage roomUserSeqMessage) {
            if (PatchProxy.isSupport(new Object[]{roomUserSeqMessage}, this, changeQuickRedirect, false, 12118, new Class[]{RoomUserSeqMessage.class}, RoomUserSeqMessage.class)) {
                return (RoomUserSeqMessage) PatchProxy.accessDispatch(new Object[]{roomUserSeqMessage}, this, changeQuickRedirect, false, 12118, new Class[]{RoomUserSeqMessage.class}, RoomUserSeqMessage.class);
            }
            Builder newBuilder = roomUserSeqMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            Internal.redactElements(newBuilder.ranks, Contributor.ADAPTER);
            Internal.redactElements(newBuilder.seats, Contributor.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RoomUserSeqMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12117, new Class[]{ProtoReader.class}, RoomUserSeqMessage.class)) {
                return (RoomUserSeqMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12117, new Class[]{ProtoReader.class}, RoomUserSeqMessage.class);
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
                            builder.ranks.add(Contributor.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.total((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.pop_str((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder.seats.add(Contributor.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(RoomUserSeqMessage roomUserSeqMessage) {
            int i;
            int i2;
            RoomUserSeqMessage roomUserSeqMessage2 = roomUserSeqMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{roomUserSeqMessage2}, this, changeQuickRedirect, false, 12115, new Class[]{RoomUserSeqMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{roomUserSeqMessage2}, this, changeQuickRedirect, false, 12115, new Class[]{RoomUserSeqMessage.class}, Integer.TYPE)).intValue();
            }
            if (roomUserSeqMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, roomUserSeqMessage2.common);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Contributor.ADAPTER.asRepeated().encodedSizeWithTag(2, roomUserSeqMessage2.ranks);
            if (roomUserSeqMessage2.total != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, roomUserSeqMessage2.total);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (roomUserSeqMessage2.pop_str != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, roomUserSeqMessage2.pop_str);
            }
            return i4 + i3 + Contributor.ADAPTER.asRepeated().encodedSizeWithTag(5, roomUserSeqMessage2.seats) + roomUserSeqMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, RoomUserSeqMessage roomUserSeqMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RoomUserSeqMessage roomUserSeqMessage2 = roomUserSeqMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, roomUserSeqMessage2}, this, changeQuickRedirect, false, 12116, new Class[]{ProtoWriter.class, RoomUserSeqMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, roomUserSeqMessage2}, this, changeQuickRedirect, false, 12116, new Class[]{ProtoWriter.class, RoomUserSeqMessage.class}, Void.TYPE);
                return;
            }
            if (roomUserSeqMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, roomUserSeqMessage2.common);
            }
            Contributor.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 2, roomUserSeqMessage2.ranks);
            if (roomUserSeqMessage2.total != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, roomUserSeqMessage2.total);
            }
            if (roomUserSeqMessage2.pop_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, roomUserSeqMessage2.pop_str);
            }
            Contributor.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 5, roomUserSeqMessage2.seats);
            protoWriter2.writeBytes(roomUserSeqMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12101, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12101, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = (((hashCode + i) * 37) + this.ranks.hashCode()) * 37;
            if (this.total != null) {
                i2 = this.total.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (hashCode2 + i2) * 37;
            if (this.pop_str != null) {
                i3 = this.pop_str.hashCode();
            }
            i4 = ((i5 + i3) * 37) + this.seats.hashCode();
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12099, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12099, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.ranks = Internal.copyOf("ranks", this.ranks);
        builder.total = this.total;
        builder.pop_str = this.pop_str;
        builder.seats = Internal.copyOf("seats", this.seats);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12102, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12102, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (!this.ranks.isEmpty()) {
            sb.append(", ranks=");
            sb.append(this.ranks);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (this.pop_str != null) {
            sb.append(", pop_str=");
            sb.append(this.pop_str);
        }
        if (!this.seats.isEmpty()) {
            sb.append(", seats=");
            sb.append(this.seats);
        }
        StringBuilder replace = sb.replace(0, 2, "RoomUserSeqMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12100, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12100, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RoomUserSeqMessage)) {
                return false;
            }
            RoomUserSeqMessage roomUserSeqMessage = (RoomUserSeqMessage) obj;
            if (!unknownFields().equals(roomUserSeqMessage.unknownFields()) || !Internal.equals(this.common, roomUserSeqMessage.common) || !this.ranks.equals(roomUserSeqMessage.ranks) || !Internal.equals(this.total, roomUserSeqMessage.total) || !Internal.equals(this.pop_str, roomUserSeqMessage.pop_str) || !this.seats.equals(roomUserSeqMessage.seats)) {
                return false;
            }
            return true;
        }
    }

    public RoomUserSeqMessage(Common common2, List<Contributor> list, Long l, String str, List<Contributor> list2) {
        this(common2, list, l, str, list2, ByteString.EMPTY);
    }

    public RoomUserSeqMessage(Common common2, List<Contributor> list, Long l, String str, List<Contributor> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.ranks = Internal.immutableCopyOf("ranks", list);
        this.total = l;
        this.pop_str = str;
        this.seats = Internal.immutableCopyOf("seats", list2);
    }
}
