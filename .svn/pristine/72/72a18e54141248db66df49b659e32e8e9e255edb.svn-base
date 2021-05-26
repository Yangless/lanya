drop table if exists account;

drop table if exists account_role;

drop table if exists comment;

drop table if exists company;

drop table if exists company_student;

drop table if exists course;

drop table if exists course_collection;

drop table if exists course_system;

drop table if exists course_system_collection;

drop table if exists hr;

drop table if exists my_teacher;

drop table if exists my_teacher_talk;

drop table if exists my_tribe;

drop table if exists my_tribe_talk;

drop table if exists my_work;

drop table if exists my_work_talk;

drop table if exists role;

drop table if exists role_right;

drop table if exists stage;

drop table if exists student;

drop table if exists sys_right;

drop table if exists teacher;

drop table if exists tribes;

drop table if exists video_audio;

drop table if exists video_audio_collection;

drop table if exists wallet;

drop table if exists wallet_detail;

drop table if exists work_list;

/*==============================================================*/
/* Table: account                                               */
/*==============================================================*/
create table account
(
   id                   int not null,
   account_code         varchar(20),
   pwd                  blob,
   real_name            varchar(10),
   idcard               varchar(20),
   nick_name            varchar(20),
   sex                  varchar(3),
   age                  int,
   weixin               varchar(30),
   qq                   varchar(25),
   phone                varchar(15),
   email                varchar(30),
   photo_url            varchar(100),
   is_authen            int comment '是否实名认证标记',
   primary key (id)
);

alter table account comment '账户表';

/*==============================================================*/
/* Table: account_role                                          */
/*==============================================================*/
create table account_role
(
   id                   int not null,
   account_id           int,
   role_id              int,
   primary key (id)
);

/*==============================================================*/
/* Table: comment                                               */
/*==============================================================*/
create table comment
(
   id                   int not null,
   account_id           int,
   teacher_id           int,
   video_audio_id       int,
   comment_praise_number int,
   reply_number         int,
   content              text,
   comment_time         datetime,
   parent_id            int,
   primary key (id)
);

alter table comment comment '评论表';

/*==============================================================*/
/* Table: company                                               */
/*==============================================================*/
create table company
(
   id                   int not null,
   account_id           int,
   company_nick         varchar(30),
   company_name         varchar(50),
   logo                 varchar(150),
   aptitude             varchar(100),
   location             varchar(300),
   introduce            varchar(100),
   phone                varchar(15),
   qq                   varchar(20),
   weixin               varchar(30),
   email                varchar(50),
   primary key (id)
);

alter table company comment '机构表';

/*==============================================================*/
/* Table: company_student                                       */
/*==============================================================*/
create table company_student
(
   id                   int not null,
   student_id           int,
   company_id           int,
   primary key (id)
);

/*==============================================================*/
/* Table: course                                                */
/*==============================================================*/
create table course
(
   id                   int not null,
   course_name          varchar(50),
   course_photo         varchar(150),
   introduce            varchar(100),
   teacher_id           int,
   primary key (id)
);

alter table course comment '完整课程';

/*==============================================================*/
/* Table: course_collection                                     */
/*==============================================================*/
create table course_collection
(
   id                   int not null,
   student_id           int,
   course_id            int,
   primary key (id)
);

/*==============================================================*/
/* Table: course_system                                         */
/*==============================================================*/
create table course_system
(
   id                   int not null,
   course_system_name   varchar(50),
   course_system_photo  varchar(150),
   introduce            varchar(100),
   teacher_id           int,
   primary key (id)
);

alter table course_system comment '课程体系';

/*==============================================================*/
/* Table: course_system_collection                              */
/*==============================================================*/
create table course_system_collection
(
   id                   int not null,
   student_id           int,
   course_system_id     int,
   primary key (id)
);

alter table course_system_collection comment '学生收藏的课程体系';

/*==============================================================*/
/* Table: hr                                                    */
/*==============================================================*/
create table hr
(
   id                   int not null,
   account_id           int,
   company              varchar(30),
   location             varchar(100),
   introduce            varchar(100),
   primary key (id)
);

alter table hr comment '人士表';

/*==============================================================*/
/* Table: my_teacher                                            */
/*==============================================================*/
create table my_teacher
(
   id                   int not null,
   account_id           int,
   teacher_id           int,
   primary key (id)
);

alter table my_teacher comment '我关注的老师';

/*==============================================================*/
/* Table: my_teacher_talk                                       */
/*==============================================================*/
create table my_teacher_talk
(
   id                   int not null,
   my_teacher_id        int,
   sender_id            int,
   content              text,
   send_time            datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: my_tribe                                              */
/*==============================================================*/
create table my_tribe
(
   id                   int not null,
   account_id           int,
   tribe_id             int,
   primary key (id)
);

/*==============================================================*/
/* Table: my_tribe_talk                                         */
/*==============================================================*/
create table my_tribe_talk
(
   id                   int not null,
   my_tribe_id          int,
   sender_id            int,
   content              text,
   send_time            datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: my_work                                               */
/*==============================================================*/
create table my_work
(
   id                   int not null,
   account_id           int,
   word_id              int,
   primary key (id)
);

/*==============================================================*/
/* Table: my_work_talk                                          */
/*==============================================================*/
create table my_work_talk
(
   id                   int not null,
   my_work_id           int,
   sender_id            int,
   content              text,
   send_time            datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   int not null,
   role_name            varchar(10),
   role_code            varchar(10),
   primary key (id)
);

alter table role comment '角色表';

/*==============================================================*/
/* Table: role_right                                            */
/*==============================================================*/
create table role_right
(
   id                   int not null,
   role_id              int,
   right_id             int,
   primary key (id)
);

/*==============================================================*/
/* Table: stage                                                 */
/*==============================================================*/
create table stage
(
   id                   int not null,
   course_system_id     int,
   course_id            int,
   stage_number         varchar(10),
   stage_introduce      varchar(100),
   primary key (id)
);

alter table stage comment '阶段表';

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   id                   int not null,
   account_id           int,
   primary key (id)
);

alter table student comment '学生信息表';

/*==============================================================*/
/* Table: sys_right                                             */
/*==============================================================*/
create table sys_right
(
   id                   int not null,
   right_name           varchar(20),
   right_code           varchar(20),
   parent_id            int,
   right_url            varchar(150),
   primary key (id)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   id                   int not null,
   account_id           int,
   company_id           int,
   title                varchar(20),
   location             varchar(100),
   introduce            varchar(150),
   total_share          int,
   attention            int,
   total_student        int,
   praise               int,
   primary key (id)
);

alter table teacher comment '教师表';

/*==============================================================*/
/* Table: tribes                                                */
/*==============================================================*/
create table tribes
(
   id                   int not null,
   account_id           int,
   tribe_name           varchar(30),
   tribe_label          varchar(100),
   tribe_introduce      varchar(100),
   primary key (id)
);

alter table tribes comment '兴趣部落';

/*==============================================================*/
/* Table: video_audio                                           */
/*==============================================================*/
create table video_audio
(
   id                   int not null,
   teacher_id           int,
   course_id            int,
   video_url            varchar(150),
   audio_url            varchar(150),
   introduce            varchar(100),
   praise_number        int,
   comment_number       int,
   is_short             int,
   is_video             int,
   primary key (id)
);

alter table video_audio comment '视频或音频';

/*==============================================================*/
/* Table: video_audio_collection                                */
/*==============================================================*/
create table video_audio_collection
(
   id                   int not null,
   student_id           int,
   video_audio_id       int,
   primary key (id)
);

/*==============================================================*/
/* Table: wallet                                                */
/*==============================================================*/
create table wallet
(
   id                   int not null,
   account_id           int,
   total_money          double,
   free_money           double,
   lock_money           double,
   primary key (id)
);

/*==============================================================*/
/* Table: wallet_detail                                         */
/*==============================================================*/
create table wallet_detail
(
   id                   int not null,
   recording_time       datetime,
   money                double,
   is_add               int,
   pay_type             varchar(10),
   pay_account          varchar(20),
   memo                 text,
   wallet_id            int,
   primary key (id)
);

/*==============================================================*/
/* Table: work_list                                             */
/*==============================================================*/
create table work_list
(
   id                   int not null,
   hr_id                int,
   work_name            varchar(20),
   work_require         varchar(150),
   work_introduce       varchar(150),
   primary key (id)
);

alter table work_list comment '发布的招聘信息';

alter table account_role add constraint FK_Reference_1 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table account_role add constraint FK_Reference_2 foreign key (role_id)
      references role (id) on delete restrict on update restrict;

alter table comment add constraint FK_Reference_14 foreign key (video_audio_id)
      references video_audio (id) on delete restrict on update restrict;

alter table comment add constraint FK_Reference_15 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table comment add constraint FK_Reference_16 foreign key (teacher_id)
      references teacher (id) on delete restrict on update restrict;

alter table company add constraint FK_Reference_26 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table company_student add constraint FK_Reference_28 foreign key (company_id)
      references company (id) on delete restrict on update restrict;

alter table company_student add constraint FK_Reference_29 foreign key (student_id)
      references student (id) on delete restrict on update restrict;

alter table course add constraint FK_Reference_9 foreign key (teacher_id)
      references teacher (id) on delete restrict on update restrict;

alter table course_collection add constraint FK_Reference_22 foreign key (student_id)
      references student (id) on delete restrict on update restrict;

alter table course_collection add constraint FK_Reference_23 foreign key (course_id)
      references course (id) on delete restrict on update restrict;

alter table course_system add constraint FK_Reference_8 foreign key (teacher_id)
      references teacher (id) on delete restrict on update restrict;

alter table course_system_collection add constraint FK_Reference_20 foreign key (student_id)
      references student (id) on delete restrict on update restrict;

alter table course_system_collection add constraint FK_Reference_21 foreign key (course_system_id)
      references course_system (id) on delete restrict on update restrict;

alter table hr add constraint FK_Reference_17 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table my_teacher add constraint FK_Reference_30 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table my_teacher add constraint FK_Reference_31 foreign key (teacher_id)
      references teacher (id) on delete restrict on update restrict;

alter table my_teacher_talk add constraint FK_Reference_36 foreign key (my_teacher_id)
      references my_teacher (id) on delete restrict on update restrict;

alter table my_tribe add constraint FK_Reference_32 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table my_tribe add constraint FK_Reference_33 foreign key (tribe_id)
      references tribes (id) on delete restrict on update restrict;

alter table my_tribe_talk add constraint FK_Reference_38 foreign key (my_tribe_id)
      references my_tribe (id) on delete restrict on update restrict;

alter table my_work add constraint FK_Reference_34 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table my_work add constraint FK_Reference_35 foreign key (word_id)
      references work_list (id) on delete restrict on update restrict;

alter table my_work_talk add constraint FK_Reference_37 foreign key (my_work_id)
      references my_work (id) on delete restrict on update restrict;

alter table role_right add constraint FK_Reference_3 foreign key (role_id)
      references role (id) on delete restrict on update restrict;

alter table role_right add constraint FK_Reference_4 foreign key (right_id)
      references sys_right (id) on delete restrict on update restrict;

alter table stage add constraint FK_Reference_10 foreign key (course_system_id)
      references course_system (id) on delete restrict on update restrict;

alter table stage add constraint FK_Reference_11 foreign key (course_id)
      references course (id) on delete restrict on update restrict;

alter table teacher add constraint FK_Reference_27 foreign key (company_id)
      references company (id) on delete restrict on update restrict;

alter table teacher add constraint FK_Reference_7 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table tribes add constraint FK_Reference_19 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table video_audio add constraint FK_Reference_12 foreign key (teacher_id)
      references teacher (id) on delete restrict on update restrict;

alter table video_audio add constraint FK_Reference_13 foreign key (course_id)
      references course (id) on delete restrict on update restrict;

alter table video_audio_collection add constraint FK_Reference_24 foreign key (student_id)
      references student (id) on delete restrict on update restrict;

alter table video_audio_collection add constraint FK_Reference_25 foreign key (student_id)
      references video_audio (id) on delete restrict on update restrict;

alter table wallet add constraint FK_Reference_5 foreign key (account_id)
      references account (id) on delete restrict on update restrict;

alter table wallet_detail add constraint FK_Reference_6 foreign key (wallet_id)
      references wallet (id) on delete restrict on update restrict;

alter table work_list add constraint FK_Reference_18 foreign key (hr_id)
      references hr (id) on delete restrict on update restrict;
