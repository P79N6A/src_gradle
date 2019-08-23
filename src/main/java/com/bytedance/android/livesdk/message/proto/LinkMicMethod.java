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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class LinkMicMethod extends Message<LinkMicMethod, Builder> {
    public static final ProtoAdapter<LinkMicMethod> ADAPTER = new ProtoAdapter_LinkMicMethod();
    public static final Long DEFAULT_ANCHOR_LINKMIC_ID = 0L;
    public static final Long DEFAULT_ANSWER = 0L;
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Long DEFAULT_DIMENSION = 0L;
    public static final Long DEFAULT_DURATION = 0L;
    public static final Long DEFAULT_FAN_TICKET = 0L;
    public static final Long DEFAULT_FROM_USER_ID = 0L;
    public static final Long DEFAULT_INVITE_UID = 0L;
    public static final Long DEFAULT_LAYOUT = 0L;
    public static final Long DEFAULT_LINKMIC_LAYOUT = 0L;
    public static final Long DEFAULT_MATCH_TYPE = 0L;
    public static final Long DEFAULT_MESSAGE_TYPE = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_START_TIME_MS = 0L;
    public static final Long DEFAULT_TOTAL_LINKMIC_FAN_TICKET = 0L;
    public static final Long DEFAULT_TO_USER_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_VENDOR = 0L;
    public static final Boolean DEFAULT_WIN = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String access_key;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long anchor_linkmic_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 14)
    public final Long answer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long channel_id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LinkMicMethod$ContributorList#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 22)
    public final Map<Long, ContributorList> contributors;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
    public final Long dimension;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 16)
    public final Long duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long fan_ticket;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 24)
    public final Long from_user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 13)
    public final Long invite_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
    public final Long layout;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 23)
    public final Long linkmic_layout;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 18)
    public final Long match_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long message_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 20)
    public final String prompts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 15)
    public final Long start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 26)
    public final Long start_time_ms;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public final String theme;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public final String tips;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 21)
    public final Long to_user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long total_linkmic_fan_ticket;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long user_id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LinkMicMethod$UserScores#ADAPTER", label = WireField.Label.REPEATED, tag = 17)
    public final List<UserScores> user_scores;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public final Long vendor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 19)
    public final Boolean win;

    public static final class Contributor extends Message<Contributor, Builder> {
        public static final ProtoAdapter<Contributor> ADAPTER = new ProtoAdapter_Contributor();
        public static final Long DEFAULT_RANK = 0L;
        public static final Long DEFAULT_SCORE = 0L;
        public static final Long DEFAULT_USER_ID = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long rank;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long score;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 4)
        public final User user;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long user_id;

        public static final class Builder extends Message.Builder<Contributor, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long rank;
            public Long score;
            public User user;
            public Long user_id;

            public final Contributor build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11692, new Class[0], Contributor.class)) {
                    return (Contributor) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11692, new Class[0], Contributor.class);
                }
                Contributor contributor = new Contributor(this.score, this.rank, this.user_id, this.user, super.buildUnknownFields());
                return contributor;
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

            public final Builder user_id(Long l) {
                this.user_id = l;
                return this;
            }
        }

        static final class ProtoAdapter_Contributor extends ProtoAdapter<Contributor> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Contributor() {
                super(FieldEncoding.LENGTH_DELIMITED, Contributor.class);
            }

            public final Contributor redact(Contributor contributor) {
                if (PatchProxy.isSupport(new Object[]{contributor}, this, changeQuickRedirect, false, 11696, new Class[]{Contributor.class}, Contributor.class)) {
                    return (Contributor) PatchProxy.accessDispatch(new Object[]{contributor}, this, changeQuickRedirect, false, 11696, new Class[]{Contributor.class}, Contributor.class);
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
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11695, new Class[]{ProtoReader.class}, Contributor.class)) {
                    return (Contributor) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11695, new Class[]{ProtoReader.class}, Contributor.class);
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
                                builder.rank((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.user((User) User.ADAPTER.decode(protoReader2));
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
                if (PatchProxy.isSupport(new Object[]{contributor2}, this, changeQuickRedirect, false, 11693, new Class[]{Contributor.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{contributor2}, this, changeQuickRedirect, false, 11693, new Class[]{Contributor.class}, Integer.TYPE)).intValue();
                }
                if (contributor2.score != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, contributor2.score);
                } else {
                    i = 0;
                }
                if (contributor2.rank != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, contributor2.rank);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (contributor2.user_id != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, contributor2.user_id);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (contributor2.user != null) {
                    i4 = User.ADAPTER.encodedSizeWithTag(4, contributor2.user);
                }
                return i6 + i4 + contributor.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, Contributor contributor) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Contributor contributor2 = contributor;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, contributor2}, this, changeQuickRedirect, false, 11694, new Class[]{ProtoWriter.class, Contributor.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, contributor2}, this, changeQuickRedirect, false, 11694, new Class[]{ProtoWriter.class, Contributor.class}, Void.TYPE);
                    return;
                }
                if (contributor2.score != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, contributor2.score);
                }
                if (contributor2.rank != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, contributor2.rank);
                }
                if (contributor2.user_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, contributor2.user_id);
                }
                if (contributor2.user != null) {
                    User.ADAPTER.encodeWithTag(protoWriter2, 4, contributor2.user);
                }
                protoWriter2.writeBytes(contributor.unknownFields());
            }
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11690, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11690, new Class[0], Integer.TYPE)).intValue();
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
                if (this.rank != null) {
                    i2 = this.rank.hashCode();
                } else {
                    i2 = 0;
                }
                int i7 = (i6 + i2) * 37;
                if (this.user_id != null) {
                    i3 = this.user_id.hashCode();
                } else {
                    i3 = 0;
                }
                int i8 = (i7 + i3) * 37;
                if (this.user != null) {
                    i4 = this.user.hashCode();
                }
                i5 = i8 + i4;
                this.hashCode = i5;
            }
            return i5;
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11688, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11688, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.score = this.score;
            builder.rank = this.rank;
            builder.user_id = this.user_id;
            builder.user = this.user;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11691, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11691, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.score != null) {
                sb.append(", score=");
                sb.append(this.score);
            }
            if (this.rank != null) {
                sb.append(", rank=");
                sb.append(this.rank);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.user != null) {
                sb.append(", user=");
                sb.append(this.user);
            }
            StringBuilder replace = sb.replace(0, 2, "Contributor{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11689, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11689, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Contributor)) {
                    return false;
                }
                Contributor contributor = (Contributor) obj;
                if (!unknownFields().equals(contributor.unknownFields()) || !Internal.equals(this.score, contributor.score) || !Internal.equals(this.rank, contributor.rank) || !Internal.equals(this.user_id, contributor.user_id) || !Internal.equals(this.user, contributor.user)) {
                    return false;
                }
                return true;
            }
        }

        public Contributor(Long l, Long l2, Long l3, User user2) {
            this(l, l2, l3, user2, ByteString.EMPTY);
        }

        public Contributor(Long l, Long l2, Long l3, User user2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.score = l;
            this.rank = l2;
            this.user_id = l3;
            this.user = user2;
        }
    }

    public static final class ContributorList extends Message<ContributorList, Builder> {
        public static final ProtoAdapter<ContributorList> ADAPTER = new ProtoAdapter_ContributorList();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LinkMicMethod$Contributor#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
        public final List<Contributor> contributor_list;

        public static final class Builder extends Message.Builder<ContributorList, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public List<Contributor> contributor_list = Internal.newMutableList();

            public final ContributorList build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11702, new Class[0], ContributorList.class)) {
                    return new ContributorList(this.contributor_list, super.buildUnknownFields());
                }
                return (ContributorList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11702, new Class[0], ContributorList.class);
            }

            public final Builder contributor_list(List<Contributor> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11701, new Class[]{List.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11701, new Class[]{List.class}, Builder.class);
                }
                Internal.checkElementsNotNull(list);
                this.contributor_list = list;
                return this;
            }
        }

        static final class ProtoAdapter_ContributorList extends ProtoAdapter<ContributorList> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_ContributorList() {
                super(FieldEncoding.LENGTH_DELIMITED, ContributorList.class);
            }

            public final ContributorList decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11705, new Class[]{ProtoReader.class}, ContributorList.class)) {
                    return (ContributorList) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11705, new Class[]{ProtoReader.class}, ContributorList.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader2.endMessage(beginMessage);
                        return builder.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                    } else {
                        builder.contributor_list.add(Contributor.ADAPTER.decode(protoReader2));
                    }
                }
            }

            public final int encodedSize(ContributorList contributorList) {
                ContributorList contributorList2 = contributorList;
                if (!PatchProxy.isSupport(new Object[]{contributorList2}, this, changeQuickRedirect, false, 11703, new Class[]{ContributorList.class}, Integer.TYPE)) {
                    return Contributor.ADAPTER.asRepeated().encodedSizeWithTag(1, contributorList2.contributor_list) + contributorList.unknownFields().size();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[]{contributorList2}, this, changeQuickRedirect, false, 11703, new Class[]{ContributorList.class}, Integer.TYPE)).intValue();
            }

            public final ContributorList redact(ContributorList contributorList) {
                if (PatchProxy.isSupport(new Object[]{contributorList}, this, changeQuickRedirect, false, 11706, new Class[]{ContributorList.class}, ContributorList.class)) {
                    return (ContributorList) PatchProxy.accessDispatch(new Object[]{contributorList}, this, changeQuickRedirect, false, 11706, new Class[]{ContributorList.class}, ContributorList.class);
                }
                Builder newBuilder = contributorList.newBuilder();
                Internal.redactElements(newBuilder.contributor_list, Contributor.ADAPTER);
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final void encode(ProtoWriter protoWriter, ContributorList contributorList) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                ContributorList contributorList2 = contributorList;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, contributorList2}, this, changeQuickRedirect, false, 11704, new Class[]{ProtoWriter.class, ContributorList.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, contributorList2}, this, changeQuickRedirect, false, 11704, new Class[]{ProtoWriter.class, ContributorList.class}, Void.TYPE);
                    return;
                }
                Contributor.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 1, contributorList2.contributor_list);
                protoWriter2.writeBytes(contributorList.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11697, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11697, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.contributor_list = Internal.copyOf("contributor_list", this.contributor_list);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11699, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11699, new Class[0], Integer.TYPE)).intValue();
            }
            int i = this.hashCode;
            if (i == 0) {
                i = (unknownFields().hashCode() * 37) + this.contributor_list.hashCode();
                this.hashCode = i;
            }
            return i;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11700, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11700, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (!this.contributor_list.isEmpty()) {
                sb.append(", contributor_list=");
                sb.append(this.contributor_list);
            }
            StringBuilder replace = sb.replace(0, 2, "ContributorList{");
            replace.append('}');
            return replace.toString();
        }

        public ContributorList(List<Contributor> list) {
            this(list, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11698, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11698, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof ContributorList)) {
                    return false;
                }
                ContributorList contributorList = (ContributorList) obj;
                if (!unknownFields().equals(contributorList.unknownFields()) || !this.contributor_list.equals(contributorList.contributor_list)) {
                    return false;
                }
                return true;
            }
        }

        public ContributorList(List<Contributor> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.contributor_list = Internal.immutableCopyOf("contributor_list", list);
        }
    }

    public static final class UserScores extends Message<UserScores, Builder> {
        public static final ProtoAdapter<UserScores> ADAPTER = new ProtoAdapter_UserScores();
        public static final Long DEFAULT_SCORE = 0L;
        public static final Long DEFAULT_USER_ID = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long score;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long user_id;

        public static final class Builder extends Message.Builder<UserScores, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long score;
            public Long user_id;

            public final UserScores build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11715, new Class[0], UserScores.class)) {
                    return new UserScores(this.score, this.user_id, super.buildUnknownFields());
                }
                return (UserScores) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11715, new Class[0], UserScores.class);
            }

            public final Builder score(Long l) {
                this.score = l;
                return this;
            }

            public final Builder user_id(Long l) {
                this.user_id = l;
                return this;
            }
        }

        static final class ProtoAdapter_UserScores extends ProtoAdapter<UserScores> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_UserScores() {
                super(FieldEncoding.LENGTH_DELIMITED, UserScores.class);
            }

            public final int encodedSize(UserScores userScores) {
                int i;
                UserScores userScores2 = userScores;
                int i2 = 0;
                if (PatchProxy.isSupport(new Object[]{userScores2}, this, changeQuickRedirect, false, 11716, new Class[]{UserScores.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{userScores2}, this, changeQuickRedirect, false, 11716, new Class[]{UserScores.class}, Integer.TYPE)).intValue();
                }
                if (userScores2.score != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, userScores2.score);
                } else {
                    i = 0;
                }
                if (userScores2.user_id != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, userScores2.user_id);
                }
                return i + i2 + userScores.unknownFields().size();
            }

            public final UserScores redact(UserScores userScores) {
                if (PatchProxy.isSupport(new Object[]{userScores}, this, changeQuickRedirect, false, 11719, new Class[]{UserScores.class}, UserScores.class)) {
                    return (UserScores) PatchProxy.accessDispatch(new Object[]{userScores}, this, changeQuickRedirect, false, 11719, new Class[]{UserScores.class}, UserScores.class);
                }
                Builder newBuilder = userScores.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final UserScores decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11718, new Class[]{ProtoReader.class}, UserScores.class)) {
                    return (UserScores) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11718, new Class[]{ProtoReader.class}, UserScores.class);
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
                                builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, UserScores userScores) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                UserScores userScores2 = userScores;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, userScores2}, this, changeQuickRedirect, false, 11717, new Class[]{ProtoWriter.class, UserScores.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, userScores2}, this, changeQuickRedirect, false, 11717, new Class[]{ProtoWriter.class, UserScores.class}, Void.TYPE);
                    return;
                }
                if (userScores2.score != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, userScores2.score);
                }
                if (userScores2.user_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, userScores2.user_id);
                }
                protoWriter2.writeBytes(userScores.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11711, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11711, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.score = this.score;
            builder.user_id = this.user_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11713, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11713, new Class[0], Integer.TYPE)).intValue();
            }
            int i3 = this.hashCode;
            if (i3 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.score != null) {
                    i = this.score.hashCode();
                } else {
                    i = 0;
                }
                int i4 = (hashCode + i) * 37;
                if (this.user_id != null) {
                    i2 = this.user_id.hashCode();
                }
                i3 = i4 + i2;
                this.hashCode = i3;
            }
            return i3;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11714, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11714, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.score != null) {
                sb.append(", score=");
                sb.append(this.score);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            StringBuilder replace = sb.replace(0, 2, "UserScores{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11712, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11712, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof UserScores)) {
                    return false;
                }
                UserScores userScores = (UserScores) obj;
                if (!unknownFields().equals(userScores.unknownFields()) || !Internal.equals(this.score, userScores.score) || !Internal.equals(this.user_id, userScores.user_id)) {
                    return false;
                }
                return true;
            }
        }

        public UserScores(Long l, Long l2) {
            this(l, l2, ByteString.EMPTY);
        }

        public UserScores(Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.score = l;
            this.user_id = l2;
        }
    }

    public static final class Builder extends Message.Builder<LinkMicMethod, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String access_key;
        public Long anchor_linkmic_id;
        public Long answer;
        public Long channel_id;
        public Common common;
        public Map<Long, ContributorList> contributors = Internal.newMutableMap();
        public Long dimension;
        public Long duration;
        public Long fan_ticket;
        public Long from_user_id;
        public Long invite_uid;
        public Long layout;
        public Long linkmic_layout;
        public Long match_type;
        public Long message_type;
        public String prompts;
        public Long start_time;
        public Long start_time_ms;
        public String theme;
        public String tips;
        public Long to_user_id;
        public Long total_linkmic_fan_ticket;
        public Long user_id;
        public List<UserScores> user_scores = Internal.newMutableList();
        public Long vendor;
        public Boolean win;

        public final LinkMicMethod build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11687, new Class[0], LinkMicMethod.class)) {
                return (LinkMicMethod) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11687, new Class[0], LinkMicMethod.class);
            }
            LinkMicMethod linkMicMethod = new LinkMicMethod(this.common, this.message_type, this.access_key, this.anchor_linkmic_id, this.user_id, this.fan_ticket, this.total_linkmic_fan_ticket, this.channel_id, this.layout, this.vendor, this.dimension, this.theme, this.invite_uid, this.answer, this.start_time, this.duration, this.user_scores, this.match_type, this.win, this.prompts, this.to_user_id, this.contributors, this.linkmic_layout, this.from_user_id, this.tips, this.start_time_ms, super.buildUnknownFields());
            return linkMicMethod;
        }

        public final Builder access_key(String str) {
            this.access_key = str;
            return this;
        }

        public final Builder anchor_linkmic_id(Long l) {
            this.anchor_linkmic_id = l;
            return this;
        }

        public final Builder answer(Long l) {
            this.answer = l;
            return this;
        }

        public final Builder channel_id(Long l) {
            this.channel_id = l;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder dimension(Long l) {
            this.dimension = l;
            return this;
        }

        public final Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public final Builder fan_ticket(Long l) {
            this.fan_ticket = l;
            return this;
        }

        public final Builder from_user_id(Long l) {
            this.from_user_id = l;
            return this;
        }

        public final Builder invite_uid(Long l) {
            this.invite_uid = l;
            return this;
        }

        public final Builder layout(Long l) {
            this.layout = l;
            return this;
        }

        public final Builder linkmic_layout(Long l) {
            this.linkmic_layout = l;
            return this;
        }

        public final Builder match_type(Long l) {
            this.match_type = l;
            return this;
        }

        public final Builder message_type(Long l) {
            this.message_type = l;
            return this;
        }

        public final Builder prompts(String str) {
            this.prompts = str;
            return this;
        }

        public final Builder start_time(Long l) {
            this.start_time = l;
            return this;
        }

        public final Builder start_time_ms(Long l) {
            this.start_time_ms = l;
            return this;
        }

        public final Builder theme(String str) {
            this.theme = str;
            return this;
        }

        public final Builder tips(String str) {
            this.tips = str;
            return this;
        }

        public final Builder to_user_id(Long l) {
            this.to_user_id = l;
            return this;
        }

        public final Builder total_linkmic_fan_ticket(Long l) {
            this.total_linkmic_fan_ticket = l;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }

        public final Builder vendor(Long l) {
            this.vendor = l;
            return this;
        }

        public final Builder win(Boolean bool) {
            this.win = bool;
            return this;
        }

        public final Builder contributors(Map<Long, ContributorList> map) {
            if (PatchProxy.isSupport(new Object[]{map}, this, changeQuickRedirect, false, 11686, new Class[]{Map.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{map}, this, changeQuickRedirect, false, 11686, new Class[]{Map.class}, Builder.class);
            }
            Internal.checkElementsNotNull(map);
            this.contributors = map;
            return this;
        }

        public final Builder user_scores(List<UserScores> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11685, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11685, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.user_scores = list;
            return this;
        }
    }

    static final class ProtoAdapter_LinkMicMethod extends ProtoAdapter<LinkMicMethod> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ProtoAdapter<Map<Long, ContributorList>> contributors = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, ContributorList.ADAPTER);

        ProtoAdapter_LinkMicMethod() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkMicMethod.class);
        }

        public final LinkMicMethod redact(LinkMicMethod linkMicMethod) {
            if (PatchProxy.isSupport(new Object[]{linkMicMethod}, this, changeQuickRedirect, false, 11710, new Class[]{LinkMicMethod.class}, LinkMicMethod.class)) {
                return (LinkMicMethod) PatchProxy.accessDispatch(new Object[]{linkMicMethod}, this, changeQuickRedirect, false, 11710, new Class[]{LinkMicMethod.class}, LinkMicMethod.class);
            }
            Builder newBuilder = linkMicMethod.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            Internal.redactElements(newBuilder.user_scores, UserScores.ADAPTER);
            Internal.redactElements(newBuilder.contributors, ContributorList.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(LinkMicMethod linkMicMethod) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            LinkMicMethod linkMicMethod2 = linkMicMethod;
            int i24 = 0;
            if (PatchProxy.isSupport(new Object[]{linkMicMethod2}, this, changeQuickRedirect, false, 11707, new Class[]{LinkMicMethod.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{linkMicMethod2}, this, changeQuickRedirect, false, 11707, new Class[]{LinkMicMethod.class}, Integer.TYPE)).intValue();
            }
            if (linkMicMethod2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, linkMicMethod2.common);
            } else {
                i = 0;
            }
            if (linkMicMethod2.message_type != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, linkMicMethod2.message_type);
            } else {
                i2 = 0;
            }
            int i25 = i + i2;
            if (linkMicMethod2.access_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, linkMicMethod2.access_key);
            } else {
                i3 = 0;
            }
            int i26 = i25 + i3;
            if (linkMicMethod2.anchor_linkmic_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, linkMicMethod2.anchor_linkmic_id);
            } else {
                i4 = 0;
            }
            int i27 = i26 + i4;
            if (linkMicMethod2.user_id != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, linkMicMethod2.user_id);
            } else {
                i5 = 0;
            }
            int i28 = i27 + i5;
            if (linkMicMethod2.fan_ticket != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, linkMicMethod2.fan_ticket);
            } else {
                i6 = 0;
            }
            int i29 = i28 + i6;
            if (linkMicMethod2.total_linkmic_fan_ticket != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, linkMicMethod2.total_linkmic_fan_ticket);
            } else {
                i7 = 0;
            }
            int i30 = i29 + i7;
            if (linkMicMethod2.channel_id != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, linkMicMethod2.channel_id);
            } else {
                i8 = 0;
            }
            int i31 = i30 + i8;
            if (linkMicMethod2.layout != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, linkMicMethod2.layout);
            } else {
                i9 = 0;
            }
            int i32 = i31 + i9;
            if (linkMicMethod2.vendor != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, linkMicMethod2.vendor);
            } else {
                i10 = 0;
            }
            int i33 = i32 + i10;
            if (linkMicMethod2.dimension != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, linkMicMethod2.dimension);
            } else {
                i11 = 0;
            }
            int i34 = i33 + i11;
            if (linkMicMethod2.theme != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(12, linkMicMethod2.theme);
            } else {
                i12 = 0;
            }
            int i35 = i34 + i12;
            if (linkMicMethod2.invite_uid != null) {
                i13 = ProtoAdapter.INT64.encodedSizeWithTag(13, linkMicMethod2.invite_uid);
            } else {
                i13 = 0;
            }
            int i36 = i35 + i13;
            if (linkMicMethod2.answer != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(14, linkMicMethod2.answer);
            } else {
                i14 = 0;
            }
            int i37 = i36 + i14;
            if (linkMicMethod2.start_time != null) {
                i15 = ProtoAdapter.INT64.encodedSizeWithTag(15, linkMicMethod2.start_time);
            } else {
                i15 = 0;
            }
            int i38 = i37 + i15;
            if (linkMicMethod2.duration != null) {
                i16 = ProtoAdapter.INT64.encodedSizeWithTag(16, linkMicMethod2.duration);
            } else {
                i16 = 0;
            }
            int encodedSizeWithTag = i38 + i16 + UserScores.ADAPTER.asRepeated().encodedSizeWithTag(17, linkMicMethod2.user_scores);
            if (linkMicMethod2.match_type != null) {
                i17 = ProtoAdapter.INT64.encodedSizeWithTag(18, linkMicMethod2.match_type);
            } else {
                i17 = 0;
            }
            int i39 = encodedSizeWithTag + i17;
            if (linkMicMethod2.win != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(19, linkMicMethod2.win);
            } else {
                i18 = 0;
            }
            int i40 = i39 + i18;
            if (linkMicMethod2.prompts != null) {
                i19 = ProtoAdapter.STRING.encodedSizeWithTag(20, linkMicMethod2.prompts);
            } else {
                i19 = 0;
            }
            int i41 = i40 + i19;
            if (linkMicMethod2.to_user_id != null) {
                i20 = ProtoAdapter.INT64.encodedSizeWithTag(21, linkMicMethod2.to_user_id);
            } else {
                i20 = 0;
            }
            int encodedSizeWithTag2 = i41 + i20 + this.contributors.encodedSizeWithTag(22, linkMicMethod2.contributors);
            if (linkMicMethod2.linkmic_layout != null) {
                i21 = ProtoAdapter.INT64.encodedSizeWithTag(23, linkMicMethod2.linkmic_layout);
            } else {
                i21 = 0;
            }
            int i42 = encodedSizeWithTag2 + i21;
            if (linkMicMethod2.from_user_id != null) {
                i22 = ProtoAdapter.INT64.encodedSizeWithTag(24, linkMicMethod2.from_user_id);
            } else {
                i22 = 0;
            }
            int i43 = i42 + i22;
            if (linkMicMethod2.tips != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(25, linkMicMethod2.tips);
            } else {
                i23 = 0;
            }
            int i44 = i43 + i23;
            if (linkMicMethod2.start_time_ms != null) {
                i24 = ProtoAdapter.INT64.encodedSizeWithTag(26, linkMicMethod2.start_time_ms);
            }
            return i44 + i24 + linkMicMethod.unknownFields().size();
        }

        public final LinkMicMethod decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11709, new Class[]{ProtoReader.class}, LinkMicMethod.class)) {
                return (LinkMicMethod) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11709, new Class[]{ProtoReader.class}, LinkMicMethod.class);
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
                            builder.message_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.access_key((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.anchor_linkmic_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.fan_ticket((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.total_linkmic_fan_ticket((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 8:
                            builder.channel_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 9:
                            builder.layout((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 10:
                            builder.vendor((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 11:
                            builder.dimension((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.theme((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 13:
                            builder.invite_uid((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 14:
                            builder.answer((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 15:
                            builder.start_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                            builder.duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 17:
                            builder.user_scores.add(UserScores.ADAPTER.decode(protoReader2));
                            break;
                        case 18:
                            builder.match_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 19:
                            builder.win((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 20:
                            builder.prompts((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 21:
                            builder.to_user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 22:
                            builder.contributors.putAll((Map) this.contributors.decode(protoReader2));
                            break;
                        case 23:
                            builder.linkmic_layout((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 24:
                            builder.from_user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 25:
                            builder.tips((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 26:
                            builder.start_time_ms((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, LinkMicMethod linkMicMethod) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LinkMicMethod linkMicMethod2 = linkMicMethod;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, linkMicMethod2}, this, changeQuickRedirect, false, 11708, new Class[]{ProtoWriter.class, LinkMicMethod.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, linkMicMethod2}, this, changeQuickRedirect, false, 11708, new Class[]{ProtoWriter.class, LinkMicMethod.class}, Void.TYPE);
                return;
            }
            if (linkMicMethod2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, linkMicMethod2.common);
            }
            if (linkMicMethod2.message_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, linkMicMethod2.message_type);
            }
            if (linkMicMethod2.access_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, linkMicMethod2.access_key);
            }
            if (linkMicMethod2.anchor_linkmic_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, linkMicMethod2.anchor_linkmic_id);
            }
            if (linkMicMethod2.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, linkMicMethod2.user_id);
            }
            if (linkMicMethod2.fan_ticket != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, linkMicMethod2.fan_ticket);
            }
            if (linkMicMethod2.total_linkmic_fan_ticket != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, linkMicMethod2.total_linkmic_fan_ticket);
            }
            if (linkMicMethod2.channel_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, linkMicMethod2.channel_id);
            }
            if (linkMicMethod2.layout != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 9, linkMicMethod2.layout);
            }
            if (linkMicMethod2.vendor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, linkMicMethod2.vendor);
            }
            if (linkMicMethod2.dimension != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 11, linkMicMethod2.dimension);
            }
            if (linkMicMethod2.theme != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 12, linkMicMethod2.theme);
            }
            if (linkMicMethod2.invite_uid != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 13, linkMicMethod2.invite_uid);
            }
            if (linkMicMethod2.answer != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 14, linkMicMethod2.answer);
            }
            if (linkMicMethod2.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 15, linkMicMethod2.start_time);
            }
            if (linkMicMethod2.duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 16, linkMicMethod2.duration);
            }
            UserScores.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 17, linkMicMethod2.user_scores);
            if (linkMicMethod2.match_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 18, linkMicMethod2.match_type);
            }
            if (linkMicMethod2.win != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 19, linkMicMethod2.win);
            }
            if (linkMicMethod2.prompts != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 20, linkMicMethod2.prompts);
            }
            if (linkMicMethod2.to_user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 21, linkMicMethod2.to_user_id);
            }
            this.contributors.encodeWithTag(protoWriter2, 22, linkMicMethod2.contributors);
            if (linkMicMethod2.linkmic_layout != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 23, linkMicMethod2.linkmic_layout);
            }
            if (linkMicMethod2.from_user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 24, linkMicMethod2.from_user_id);
            }
            if (linkMicMethod2.tips != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 25, linkMicMethod2.tips);
            }
            if (linkMicMethod2.start_time_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 26, linkMicMethod2.start_time_ms);
            }
            protoWriter2.writeBytes(linkMicMethod.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11681, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11681, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.message_type = this.message_type;
        builder.access_key = this.access_key;
        builder.anchor_linkmic_id = this.anchor_linkmic_id;
        builder.user_id = this.user_id;
        builder.fan_ticket = this.fan_ticket;
        builder.total_linkmic_fan_ticket = this.total_linkmic_fan_ticket;
        builder.channel_id = this.channel_id;
        builder.layout = this.layout;
        builder.vendor = this.vendor;
        builder.dimension = this.dimension;
        builder.theme = this.theme;
        builder.invite_uid = this.invite_uid;
        builder.answer = this.answer;
        builder.start_time = this.start_time;
        builder.duration = this.duration;
        builder.user_scores = Internal.copyOf("user_scores", this.user_scores);
        builder.match_type = this.match_type;
        builder.win = this.win;
        builder.prompts = this.prompts;
        builder.to_user_id = this.to_user_id;
        builder.contributors = Internal.copyOf("contributors", this.contributors);
        builder.linkmic_layout = this.linkmic_layout;
        builder.from_user_id = this.from_user_id;
        builder.tips = this.tips;
        builder.start_time_ms = this.start_time_ms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11683, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11683, new Class[0], Integer.TYPE)).intValue();
        }
        int i25 = this.hashCode;
        if (i25 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i26 = (hashCode + i) * 37;
            if (this.message_type != null) {
                i2 = this.message_type.hashCode();
            } else {
                i2 = 0;
            }
            int i27 = (i26 + i2) * 37;
            if (this.access_key != null) {
                i3 = this.access_key.hashCode();
            } else {
                i3 = 0;
            }
            int i28 = (i27 + i3) * 37;
            if (this.anchor_linkmic_id != null) {
                i4 = this.anchor_linkmic_id.hashCode();
            } else {
                i4 = 0;
            }
            int i29 = (i28 + i4) * 37;
            if (this.user_id != null) {
                i5 = this.user_id.hashCode();
            } else {
                i5 = 0;
            }
            int i30 = (i29 + i5) * 37;
            if (this.fan_ticket != null) {
                i6 = this.fan_ticket.hashCode();
            } else {
                i6 = 0;
            }
            int i31 = (i30 + i6) * 37;
            if (this.total_linkmic_fan_ticket != null) {
                i7 = this.total_linkmic_fan_ticket.hashCode();
            } else {
                i7 = 0;
            }
            int i32 = (i31 + i7) * 37;
            if (this.channel_id != null) {
                i8 = this.channel_id.hashCode();
            } else {
                i8 = 0;
            }
            int i33 = (i32 + i8) * 37;
            if (this.layout != null) {
                i9 = this.layout.hashCode();
            } else {
                i9 = 0;
            }
            int i34 = (i33 + i9) * 37;
            if (this.vendor != null) {
                i10 = this.vendor.hashCode();
            } else {
                i10 = 0;
            }
            int i35 = (i34 + i10) * 37;
            if (this.dimension != null) {
                i11 = this.dimension.hashCode();
            } else {
                i11 = 0;
            }
            int i36 = (i35 + i11) * 37;
            if (this.theme != null) {
                i12 = this.theme.hashCode();
            } else {
                i12 = 0;
            }
            int i37 = (i36 + i12) * 37;
            if (this.invite_uid != null) {
                i13 = this.invite_uid.hashCode();
            } else {
                i13 = 0;
            }
            int i38 = (i37 + i13) * 37;
            if (this.answer != null) {
                i14 = this.answer.hashCode();
            } else {
                i14 = 0;
            }
            int i39 = (i38 + i14) * 37;
            if (this.start_time != null) {
                i15 = this.start_time.hashCode();
            } else {
                i15 = 0;
            }
            int i40 = (i39 + i15) * 37;
            if (this.duration != null) {
                i16 = this.duration.hashCode();
            } else {
                i16 = 0;
            }
            int hashCode2 = (((i40 + i16) * 37) + this.user_scores.hashCode()) * 37;
            if (this.match_type != null) {
                i17 = this.match_type.hashCode();
            } else {
                i17 = 0;
            }
            int i41 = (hashCode2 + i17) * 37;
            if (this.win != null) {
                i18 = this.win.hashCode();
            } else {
                i18 = 0;
            }
            int i42 = (i41 + i18) * 37;
            if (this.prompts != null) {
                i19 = this.prompts.hashCode();
            } else {
                i19 = 0;
            }
            int i43 = (i42 + i19) * 37;
            if (this.to_user_id != null) {
                i20 = this.to_user_id.hashCode();
            } else {
                i20 = 0;
            }
            int hashCode3 = (((i43 + i20) * 37) + this.contributors.hashCode()) * 37;
            if (this.linkmic_layout != null) {
                i21 = this.linkmic_layout.hashCode();
            } else {
                i21 = 0;
            }
            int i44 = (hashCode3 + i21) * 37;
            if (this.from_user_id != null) {
                i22 = this.from_user_id.hashCode();
            } else {
                i22 = 0;
            }
            int i45 = (i44 + i22) * 37;
            if (this.tips != null) {
                i23 = this.tips.hashCode();
            } else {
                i23 = 0;
            }
            int i46 = (i45 + i23) * 37;
            if (this.start_time_ms != null) {
                i24 = this.start_time_ms.hashCode();
            }
            i25 = i46 + i24;
            this.hashCode = i25;
        }
        return i25;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11684, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11684, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.access_key != null) {
            sb.append(", access_key=");
            sb.append(this.access_key);
        }
        if (this.anchor_linkmic_id != null) {
            sb.append(", anchor_linkmic_id=");
            sb.append(this.anchor_linkmic_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.fan_ticket != null) {
            sb.append(", fan_ticket=");
            sb.append(this.fan_ticket);
        }
        if (this.total_linkmic_fan_ticket != null) {
            sb.append(", total_linkmic_fan_ticket=");
            sb.append(this.total_linkmic_fan_ticket);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.layout != null) {
            sb.append(", layout=");
            sb.append(this.layout);
        }
        if (this.vendor != null) {
            sb.append(", vendor=");
            sb.append(this.vendor);
        }
        if (this.dimension != null) {
            sb.append(", dimension=");
            sb.append(this.dimension);
        }
        if (this.theme != null) {
            sb.append(", theme=");
            sb.append(this.theme);
        }
        if (this.invite_uid != null) {
            sb.append(", invite_uid=");
            sb.append(this.invite_uid);
        }
        if (this.answer != null) {
            sb.append(", answer=");
            sb.append(this.answer);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (!this.user_scores.isEmpty()) {
            sb.append(", user_scores=");
            sb.append(this.user_scores);
        }
        if (this.match_type != null) {
            sb.append(", match_type=");
            sb.append(this.match_type);
        }
        if (this.win != null) {
            sb.append(", win=");
            sb.append(this.win);
        }
        if (this.prompts != null) {
            sb.append(", prompts=");
            sb.append(this.prompts);
        }
        if (this.to_user_id != null) {
            sb.append(", to_user_id=");
            sb.append(this.to_user_id);
        }
        if (!this.contributors.isEmpty()) {
            sb.append(", contributors=");
            sb.append(this.contributors);
        }
        if (this.linkmic_layout != null) {
            sb.append(", linkmic_layout=");
            sb.append(this.linkmic_layout);
        }
        if (this.from_user_id != null) {
            sb.append(", from_user_id=");
            sb.append(this.from_user_id);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        if (this.start_time_ms != null) {
            sb.append(", start_time_ms=");
            sb.append(this.start_time_ms);
        }
        StringBuilder replace = sb.replace(0, 2, "LinkMicMethod{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11682, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11682, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LinkMicMethod)) {
                return false;
            }
            LinkMicMethod linkMicMethod = (LinkMicMethod) obj;
            if (!unknownFields().equals(linkMicMethod.unknownFields()) || !Internal.equals(this.common, linkMicMethod.common) || !Internal.equals(this.message_type, linkMicMethod.message_type) || !Internal.equals(this.access_key, linkMicMethod.access_key) || !Internal.equals(this.anchor_linkmic_id, linkMicMethod.anchor_linkmic_id) || !Internal.equals(this.user_id, linkMicMethod.user_id) || !Internal.equals(this.fan_ticket, linkMicMethod.fan_ticket) || !Internal.equals(this.total_linkmic_fan_ticket, linkMicMethod.total_linkmic_fan_ticket) || !Internal.equals(this.channel_id, linkMicMethod.channel_id) || !Internal.equals(this.layout, linkMicMethod.layout) || !Internal.equals(this.vendor, linkMicMethod.vendor) || !Internal.equals(this.dimension, linkMicMethod.dimension) || !Internal.equals(this.theme, linkMicMethod.theme) || !Internal.equals(this.invite_uid, linkMicMethod.invite_uid) || !Internal.equals(this.answer, linkMicMethod.answer) || !Internal.equals(this.start_time, linkMicMethod.start_time) || !Internal.equals(this.duration, linkMicMethod.duration) || !this.user_scores.equals(linkMicMethod.user_scores) || !Internal.equals(this.match_type, linkMicMethod.match_type) || !Internal.equals(this.win, linkMicMethod.win) || !Internal.equals(this.prompts, linkMicMethod.prompts) || !Internal.equals(this.to_user_id, linkMicMethod.to_user_id) || !this.contributors.equals(linkMicMethod.contributors) || !Internal.equals(this.linkmic_layout, linkMicMethod.linkmic_layout) || !Internal.equals(this.from_user_id, linkMicMethod.from_user_id) || !Internal.equals(this.tips, linkMicMethod.tips) || !Internal.equals(this.start_time_ms, linkMicMethod.start_time_ms)) {
                return false;
            }
            return true;
        }
    }

    public LinkMicMethod(Common common2, Long l, String str, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str2, Long l10, Long l11, Long l12, Long l13, List<UserScores> list, Long l14, Boolean bool, String str3, Long l15, Map<Long, ContributorList> map, Long l16, Long l17, String str4, Long l18) {
        this(common2, l, str, l2, l3, l4, l5, l6, l7, l8, l9, str2, l10, l11, l12, l13, list, l14, bool, str3, l15, map, l16, l17, str4, l18, ByteString.EMPTY);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkMicMethod(Common common2, Long l, String str, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str2, Long l10, Long l11, Long l12, Long l13, List<UserScores> list, Long l14, Boolean bool, String str3, Long l15, Map<Long, ContributorList> map, Long l16, Long l17, String str4, Long l18, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.message_type = l;
        this.access_key = str;
        this.anchor_linkmic_id = l2;
        this.user_id = l3;
        this.fan_ticket = l4;
        this.total_linkmic_fan_ticket = l5;
        this.channel_id = l6;
        this.layout = l7;
        this.vendor = l8;
        this.dimension = l9;
        this.theme = str2;
        this.invite_uid = l10;
        this.answer = l11;
        this.start_time = l12;
        this.duration = l13;
        this.user_scores = Internal.immutableCopyOf("user_scores", list);
        this.match_type = l14;
        this.win = bool;
        this.prompts = str3;
        this.to_user_id = l15;
        this.contributors = Internal.immutableCopyOf("contributors", map);
        this.linkmic_layout = l16;
        this.from_user_id = l17;
        this.tips = str4;
        this.start_time_ms = l18;
    }
}
