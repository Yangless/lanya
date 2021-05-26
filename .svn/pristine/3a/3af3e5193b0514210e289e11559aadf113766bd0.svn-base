/*
Navicat MySQL Data Transfer

Source Server         : Lanya
Source Server Version : 50528
Source Host           : 118.25.230.12:3306
Source Database       : lanya

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-10-18 10:46:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_code` varchar(20) DEFAULT NULL,
  `pwd` blob,
  `real_name` varchar(10) DEFAULT NULL,
  `idcard` varchar(20) DEFAULT NULL,
  `nick_name` varchar(20) DEFAULT NULL,
  `sex` varchar(3) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `weixin` varchar(30) DEFAULT NULL,
  `qq` varchar(25) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `photo_url` varchar(100) DEFAULT NULL,
  `is_authen` int(11) DEFAULT NULL COMMENT '是否实名认证标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户表';

-- ----------------------------
-- Records of account
-- ----------------------------

-- ----------------------------
-- Table structure for account_role
-- ----------------------------
DROP TABLE IF EXISTS `account_role`;
CREATE TABLE `account_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_1` (`account_id`),
  KEY `FK_Reference_2` (`role_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_role
-- ----------------------------

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `video_audio_id` int(11) DEFAULT NULL,
  `comment_praise_number` int(11) DEFAULT NULL,
  `reply_number` int(11) DEFAULT NULL,
  `content` text,
  `comment_time` datetime DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_14` (`video_audio_id`),
  KEY `FK_Reference_15` (`account_id`),
  KEY `FK_Reference_16` (`teacher_id`),
  CONSTRAINT `FK_Reference_14` FOREIGN KEY (`video_audio_id`) REFERENCES `video_audio` (`id`),
  CONSTRAINT `FK_Reference_15` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `FK_Reference_16` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表';

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `company_nick` varchar(30) DEFAULT NULL,
  `company_name` varchar(50) DEFAULT NULL,
  `logo` varchar(150) DEFAULT NULL,
  `aptitude` varchar(100) DEFAULT NULL,
  `location` varchar(300) DEFAULT NULL,
  `introduce` varchar(100) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `weixin` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_26` (`account_id`),
  CONSTRAINT `FK_Reference_26` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构表';

-- ----------------------------
-- Records of company
-- ----------------------------

-- ----------------------------
-- Table structure for company_student
-- ----------------------------
DROP TABLE IF EXISTS `company_student`;
CREATE TABLE `company_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_28` (`company_id`),
  KEY `FK_Reference_29` (`student_id`),
  CONSTRAINT `FK_Reference_28` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`),
  CONSTRAINT `FK_Reference_29` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company_student
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(50) DEFAULT NULL,
  `course_photo` varchar(150) DEFAULT NULL,
  `introduce` varchar(100) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_9` (`teacher_id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='完整课程';

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for course_collection
-- ----------------------------
DROP TABLE IF EXISTS `course_collection`;
CREATE TABLE `course_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_22` (`student_id`),
  KEY `FK_Reference_23` (`course_id`),
  CONSTRAINT `FK_Reference_22` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`),
  CONSTRAINT `FK_Reference_23` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_collection
-- ----------------------------

-- ----------------------------
-- Table structure for course_system
-- ----------------------------
DROP TABLE IF EXISTS `course_system`;
CREATE TABLE `course_system` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_system_name` varchar(50) DEFAULT NULL,
  `course_system_photo` varchar(150) DEFAULT NULL,
  `introduce` varchar(100) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_8` (`teacher_id`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程体系';

-- ----------------------------
-- Records of course_system
-- ----------------------------

-- ----------------------------
-- Table structure for course_system_collection
-- ----------------------------
DROP TABLE IF EXISTS `course_system_collection`;
CREATE TABLE `course_system_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `course_system_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_20` (`student_id`),
  KEY `FK_Reference_21` (`course_system_id`),
  CONSTRAINT `FK_Reference_20` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`),
  CONSTRAINT `FK_Reference_21` FOREIGN KEY (`course_system_id`) REFERENCES `course_system` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生收藏的课程体系';

-- ----------------------------
-- Records of course_system_collection
-- ----------------------------

-- ----------------------------
-- Table structure for hr
-- ----------------------------
DROP TABLE IF EXISTS `hr`;
CREATE TABLE `hr` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `company` varchar(30) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `introduce` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_17` (`account_id`),
  CONSTRAINT `FK_Reference_17` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人士表';

-- ----------------------------
-- Records of hr
-- ----------------------------

-- ----------------------------
-- Table structure for my_teacher
-- ----------------------------
DROP TABLE IF EXISTS `my_teacher`;
CREATE TABLE `my_teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_30` (`account_id`),
  KEY `FK_Reference_31` (`teacher_id`),
  CONSTRAINT `FK_Reference_30` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `FK_Reference_31` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='我关注的老师';

-- ----------------------------
-- Records of my_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for my_teacher_talk
-- ----------------------------
DROP TABLE IF EXISTS `my_teacher_talk`;
CREATE TABLE `my_teacher_talk` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `my_teacher_id` int(11) DEFAULT NULL,
  `sender_id` int(11) DEFAULT NULL,
  `content` text,
  `send_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_36` (`my_teacher_id`),
  CONSTRAINT `FK_Reference_36` FOREIGN KEY (`my_teacher_id`) REFERENCES `my_teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_teacher_talk
-- ----------------------------

-- ----------------------------
-- Table structure for my_tribe
-- ----------------------------
DROP TABLE IF EXISTS `my_tribe`;
CREATE TABLE `my_tribe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `tribe_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_32` (`account_id`),
  KEY `FK_Reference_33` (`tribe_id`),
  CONSTRAINT `FK_Reference_32` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `FK_Reference_33` FOREIGN KEY (`tribe_id`) REFERENCES `tribes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_tribe
-- ----------------------------

-- ----------------------------
-- Table structure for my_tribe_talk
-- ----------------------------
DROP TABLE IF EXISTS `my_tribe_talk`;
CREATE TABLE `my_tribe_talk` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `my_tribe_id` int(11) DEFAULT NULL,
  `sender_id` int(11) DEFAULT NULL,
  `content` text,
  `send_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_38` (`my_tribe_id`),
  CONSTRAINT `FK_Reference_38` FOREIGN KEY (`my_tribe_id`) REFERENCES `my_tribe` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_tribe_talk
-- ----------------------------

-- ----------------------------
-- Table structure for my_work
-- ----------------------------
DROP TABLE IF EXISTS `my_work`;
CREATE TABLE `my_work` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `word_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_34` (`account_id`),
  KEY `FK_Reference_35` (`word_id`),
  CONSTRAINT `FK_Reference_34` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `FK_Reference_35` FOREIGN KEY (`word_id`) REFERENCES `work_list` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_work
-- ----------------------------

-- ----------------------------
-- Table structure for my_work_talk
-- ----------------------------
DROP TABLE IF EXISTS `my_work_talk`;
CREATE TABLE `my_work_talk` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `my_work_id` int(11) DEFAULT NULL,
  `sender_id` int(11) DEFAULT NULL,
  `content` text,
  `send_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_37` (`my_work_id`),
  CONSTRAINT `FK_Reference_37` FOREIGN KEY (`my_work_id`) REFERENCES `my_work` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_work_talk
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(10) DEFAULT NULL,
  `role_code` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for role_right
-- ----------------------------
DROP TABLE IF EXISTS `role_right`;
CREATE TABLE `role_right` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `right_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_3` (`role_id`),
  KEY `FK_Reference_4` (`right_id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`right_id`) REFERENCES `sys_right` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_right
-- ----------------------------

-- ----------------------------
-- Table structure for stage
-- ----------------------------
DROP TABLE IF EXISTS `stage`;
CREATE TABLE `stage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_system_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `stage_number` varchar(10) DEFAULT NULL,
  `stage_introduce` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_10` (`course_system_id`),
  KEY `FK_Reference_11` (`course_id`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`course_system_id`) REFERENCES `course_system` (`id`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='阶段表';

-- ----------------------------
-- Records of stage
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for sys_right
-- ----------------------------
DROP TABLE IF EXISTS `sys_right`;
CREATE TABLE `sys_right` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `right_name` varchar(20) DEFAULT NULL,
  `right_code` varchar(20) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `right_url` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_right
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `title` varchar(20) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `introduce` varchar(150) DEFAULT NULL,
  `total_share` int(11) DEFAULT NULL,
  `attention` int(11) DEFAULT NULL,
  `total_student` int(11) DEFAULT NULL,
  `praise` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_27` (`company_id`),
  KEY `FK_Reference_7` (`account_id`),
  CONSTRAINT `FK_Reference_27` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教师表';

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for tribes
-- ----------------------------
DROP TABLE IF EXISTS `tribes`;
CREATE TABLE `tribes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `tribe_name` varchar(30) DEFAULT NULL,
  `tribe_label` varchar(100) DEFAULT NULL,
  `tribe_introduce` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_19` (`account_id`),
  CONSTRAINT `FK_Reference_19` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='兴趣部落';

-- ----------------------------
-- Records of tribes
-- ----------------------------

-- ----------------------------
-- Table structure for video_audio
-- ----------------------------
DROP TABLE IF EXISTS `video_audio`;
CREATE TABLE `video_audio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `video_url` varchar(150) DEFAULT NULL,
  `audio_url` varchar(150) DEFAULT NULL,
  `introduce` varchar(100) DEFAULT NULL,
  `praise_number` int(11) DEFAULT NULL,
  `comment_number` int(11) DEFAULT NULL,
  `is_short` int(11) DEFAULT NULL,
  `is_video` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_12` (`teacher_id`),
  KEY `FK_Reference_13` (`course_id`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频或音频';

-- ----------------------------
-- Records of video_audio
-- ----------------------------

-- ----------------------------
-- Table structure for video_audio_collection
-- ----------------------------
DROP TABLE IF EXISTS `video_audio_collection`;
CREATE TABLE `video_audio_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `video_audio_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_25` (`student_id`),
  CONSTRAINT `FK_Reference_24` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`),
  CONSTRAINT `FK_Reference_25` FOREIGN KEY (`student_id`) REFERENCES `video_audio` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of video_audio_collection
-- ----------------------------

-- ----------------------------
-- Table structure for wallet
-- ----------------------------
DROP TABLE IF EXISTS `wallet`;
CREATE TABLE `wallet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL,
  `total_money` double DEFAULT NULL,
  `free_money` double DEFAULT NULL,
  `lock_money` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_5` (`account_id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wallet
-- ----------------------------

-- ----------------------------
-- Table structure for wallet_detail
-- ----------------------------
DROP TABLE IF EXISTS `wallet_detail`;
CREATE TABLE `wallet_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recording_time` datetime DEFAULT NULL,
  `money` double DEFAULT NULL,
  `is_add` int(11) DEFAULT NULL,
  `pay_type` varchar(10) DEFAULT NULL,
  `pay_account` varchar(20) DEFAULT NULL,
  `memo` text,
  `wallet_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_6` (`wallet_id`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`wallet_id`) REFERENCES `wallet` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wallet_detail
-- ----------------------------

-- ----------------------------
-- Table structure for work_list
-- ----------------------------
DROP TABLE IF EXISTS `work_list`;
CREATE TABLE `work_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hr_id` int(11) DEFAULT NULL,
  `work_name` varchar(20) DEFAULT NULL,
  `work_require` varchar(150) DEFAULT NULL,
  `work_introduce` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_18` (`hr_id`),
  CONSTRAINT `FK_Reference_18` FOREIGN KEY (`hr_id`) REFERENCES `hr` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='发布的招聘信息';

-- ----------------------------
-- Records of work_list
-- ----------------------------
