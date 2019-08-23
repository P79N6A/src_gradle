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

public final class Rank extends Message<Rank, Builder> {
    public static final ProtoAdapter<Rank> ADAPTER = new ProtoAdapter_Rank();
    public static final Long DEFAULT_DELTA = 0L;
    public static final Long DEFAULT_RANK = 0L;
    public static final Long DEFAULT_SCORE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long delta;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String gap_description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long score;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 1)
    public final User user;

    public static final class Builder extends Message.Builder<Rank, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long delta;
        public String gap_description;
        public Long rank;
        public Long score;
        public User user;

        public final Rank build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12030, new Class[0], Rank.class)) {
                return (Rank) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12030, new Class[0], Rank.class);
            }
            Rank rank2 = new Rank(this.user, this.score, this.rank, this.gap_description, this.delta, super.buildUnknownFields());
            return rank2;
        }

        public final Builder delta(Long l) {
            this.delta = l;
            return this;
        }

        public final Builder gap_description(String str) {
            this.gap_description = str;
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

    static final class ProtoAdapter_Rank extends ProtoAdapter<Rank> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_Rank() {
            super(FieldEncoding.LENGTH_DELIMITED, Rank.class);
        }

        public final Rank redact(Rank rank) {
            if (PatchProxy.isSupport(new Object[]{rank}, this, changeQuickRedirect, false, 12034, new Class[]{Rank.class}, Rank.class)) {
                return (Rank) PatchProxy.accessDispatch(new Object[]{rank}, this, changeQuickRedirect, false, 12034, new Class[]{Rank.class}, Rank.class);
            }
            Builder newBuilder = rank.newBuilder();
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final Rank decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12033, new Class[]{ProtoReader.class}, Rank.class)) {
                return (Rank) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12033, new Class[]{ProtoReader.class}, Rank.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.score((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.rank((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.gap_description((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
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

        public final int encodedSize(Rank rank) {
            int i;
            int i2;
            int i3;
            int i4;
            Rank rank2 = rank;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{rank2}, this, changeQuickRedirect, false, 12031, new Class[]{Rank.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{rank2}, this, changeQuickRedirect, false, 12031, new Class[]{Rank.class}, Integer.TYPE)).intValue();
            }
            if (rank2.user != null) {
                i = User.ADAPTER.encodedSizeWithTag(1, rank2.user);
            } else {
                i = 0;
            }
            if (rank2.score != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, rank2.score);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (rank2.rank != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, rank2.rank);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (rank2.gap_description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, rank2.gap_description);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (rank2.delta != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, rank2.delta);
            }
            return i8 + i5 + rank.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, Rank rank) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            Rank rank2 = rank;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, rank2}, this, changeQuickRedirect, false, 12032, new Class[]{ProtoWriter.class, Rank.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, rank2}, this, changeQuickRedirect, false, 12032, new Class[]{ProtoWriter.class, Rank.class}, Void.TYPE);
                return;
            }
            if (rank2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 1, rank2.user);
            }
            if (rank2.score != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, rank2.score);
            }
            if (rank2.rank != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, rank2.rank);
            }
            if (rank2.gap_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, rank2.gap_description);
            }
            if (rank2.delta != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, rank2.delta);
            }
            protoWriter2.writeBytes(rank.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12026, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12026, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.user = this.user;
        builder.score = this.score;
        builder.rank = this.rank;
        builder.gap_description = this.gap_description;
        builder.delta = this.delta;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12028, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12028, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.user != null) {
                i = this.user.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.score != null) {
                i2 = this.score.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.rank != null) {
                i3 = this.rank.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.gap_description != null) {
                i4 = this.gap_description.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.delta != null) {
                i5 = this.delta.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12029, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12029, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.score != null) {
            sb.append(", score=");
            sb.append(this.score);
        }
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        if (this.gap_description != null) {
            sb.append(", gap_description=");
            sb.append(this.gap_description);
        }
        if (this.delta != null) {
            sb.append(", delta=");
            sb.append(this.delta);
        }
        StringBuilder replace = sb.replace(0, 2, "Rank{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12027, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12027, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof Rank)) {
                return false;
            }
            Rank rank2 = (Rank) obj;
            if (!unknownFields().equals(rank2.unknownFields()) || !Internal.equals(this.user, rank2.user) || !Internal.equals(this.score, rank2.score) || !Internal.equals(this.rank, rank2.rank) || !Internal.equals(this.gap_description, rank2.gap_description) || !Internal.equals(this.delta, rank2.delta)) {
                return false;
            }
            return true;
        }
    }

    public Rank(User user2, Long l, Long l2, String str, Long l3) {
        this(user2, l, l2, str, l3, ByteString.EMPTY);
    }

    public Rank(User user2, Long l, Long l2, String str, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = user2;
        this.score = l;
        this.rank = l2;
        this.gap_description = str;
        this.delta = l3;
    }
}
