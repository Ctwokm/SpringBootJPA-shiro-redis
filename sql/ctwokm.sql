/*
Navicat MySQL Data Transfer

Source Server         : Ctwokm
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : ctwokm

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2019-11-13 20:46:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `hibernate_sequence`
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('22');
INSERT INTO `hibernate_sequence` VALUES ('22');
INSERT INTO `hibernate_sequence` VALUES ('22');

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL,
  `create_by` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `del_flag` varchar(255) DEFAULT NULL,
  `href` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `is_show` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `parent_ids` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `sort` bigint(20) DEFAULT NULL,
  `target` varchar(255) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', null, '2019-10-23 17:03:47', null, null, null, null, 'add', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('2', null, '2019-10-23 17:03:47', null, null, null, null, 'delete', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('3', null, '2019-10-23 17:03:47', null, null, null, null, 'use', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('4', null, '2019-10-23 17:03:47', null, null, null, null, 'update', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('5', null, '2019-10-23 17:03:47', null, null, null, null, 'get', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('6', null, '2019-10-23 17:03:47', null, null, null, null, 'put', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('7', null, '2019-10-23 17:03:47', null, null, null, null, 'set', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('8', null, '2019-10-23 17:03:47', null, null, null, null, 'by', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('9', null, '2019-10-23 17:03:47', null, null, null, null, 'off', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('10', null, '2019-10-23 17:03:47', null, null, null, null, 'oute', null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('11', null, '2019-10-23 17:03:47', null, null, null, null, 'up', null, null, 'sys:user:view', null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL,
  `create_by` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `data_scope` varchar(255) DEFAULT NULL,
  `del_flag` varchar(255) DEFAULT NULL,
  `enname` varchar(255) NOT NULL,
  `is_sys` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `role_type` int(11) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `useable` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_int8ty6dv04n5a7b6bq17twav` (`enname`),
  UNIQUE KEY `UK_bqy406dtsr7j7d6fawi1ckyn1` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', null, '2019-10-23 17:03:47', null, null, 'owner', null, '所有者', null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('2', null, '2019-10-23 17:03:47', null, null, 'super', null, '超级管理员', null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('3', null, '2019-10-23 17:03:47', null, null, 'manager', null, '经理', null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('4', null, '2019-10-23 17:03:47', null, null, 'admin', null, '管理员', null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('5', null, '2019-10-23 17:03:47', null, null, 'user', null, '用户', null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `menu_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`menu_id`,`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '1');
INSERT INTO `sys_role_menu` VALUES ('1', '2');
INSERT INTO `sys_role_menu` VALUES ('1', '3');
INSERT INTO `sys_role_menu` VALUES ('1', '4');
INSERT INTO `sys_role_menu` VALUES ('1', '5');
INSERT INTO `sys_role_menu` VALUES ('2', '1');
INSERT INTO `sys_role_menu` VALUES ('2', '2');
INSERT INTO `sys_role_menu` VALUES ('2', '3');
INSERT INTO `sys_role_menu` VALUES ('2', '4');
INSERT INTO `sys_role_menu` VALUES ('2', '5');
INSERT INTO `sys_role_menu` VALUES ('3', '1');
INSERT INTO `sys_role_menu` VALUES ('3', '2');
INSERT INTO `sys_role_menu` VALUES ('3', '3');
INSERT INTO `sys_role_menu` VALUES ('3', '4');
INSERT INTO `sys_role_menu` VALUES ('3', '5');
INSERT INTO `sys_role_menu` VALUES ('4', '1');
INSERT INTO `sys_role_menu` VALUES ('4', '2');
INSERT INTO `sys_role_menu` VALUES ('4', '3');
INSERT INTO `sys_role_menu` VALUES ('4', '4');
INSERT INTO `sys_role_menu` VALUES ('5', '1');
INSERT INTO `sys_role_menu` VALUES ('5', '2');
INSERT INTO `sys_role_menu` VALUES ('5', '3');
INSERT INTO `sys_role_menu` VALUES ('5', '4');
INSERT INTO `sys_role_menu` VALUES ('6', '1');
INSERT INTO `sys_role_menu` VALUES ('6', '2');
INSERT INTO `sys_role_menu` VALUES ('6', '3');
INSERT INTO `sys_role_menu` VALUES ('7', '1');
INSERT INTO `sys_role_menu` VALUES ('7', '2');
INSERT INTO `sys_role_menu` VALUES ('7', '3');
INSERT INTO `sys_role_menu` VALUES ('8', '1');
INSERT INTO `sys_role_menu` VALUES ('8', '2');
INSERT INTO `sys_role_menu` VALUES ('9', '1');
INSERT INTO `sys_role_menu` VALUES ('9', '2');
INSERT INTO `sys_role_menu` VALUES ('10', '1');
INSERT INTO `sys_role_menu` VALUES ('11', '1');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL,
  `create_by` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `del_flag` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `login_date` datetime DEFAULT NULL,
  `login_flag` varchar(255) DEFAULT NULL,
  `login_ip` varchar(255) DEFAULT NULL,
  `login_name` varchar(255) NOT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `salt` varchar(255) NOT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_blyyljcvmmqokx6t10jvmcj98` (`login_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', null, '2019-10-23 17:03:47', null, null, null, '1', null, 'user0', null, null, '468c040862e1e5bfb7ec8c037bde0f1a', null, null, null, 'OZmxu6LLwlmvrNizCBir/Q==', null, null);
INSERT INTO `sys_user` VALUES ('2', null, '2019-10-23 17:03:47', null, null, null, '1', null, 'user1', null, null, '468c040862e1e5bfb7ec8c037bde0f1a', null, null, null, 'OZmxu6LLwlmvrNizCBir/Q==', null, null);
INSERT INTO `sys_user` VALUES ('3', null, '2019-10-23 17:03:47', null, null, null, '1', null, 'user2', null, null, '468c040862e1e5bfb7ec8c037bde0f1a', null, null, null, 'OZmxu6LLwlmvrNizCBir/Q==', null, null);
INSERT INTO `sys_user` VALUES ('4', null, '2019-10-23 17:03:47', null, null, null, '1', null, 'user3', null, null, '468c040862e1e5bfb7ec8c037bde0f1a', null, null, null, 'OZmxu6LLwlmvrNizCBir/Q==', null, null);
INSERT INTO `sys_user` VALUES ('5', null, '2019-10-23 17:03:47', null, null, null, '1', null, 'user4', null, null, '468c040862e1e5bfb7ec8c037bde0f1a', null, null, null, 'OZmxu6LLwlmvrNizCBir/Q==', null, null);

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `role_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`,`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '1');
INSERT INTO `sys_user_role` VALUES ('2', '2');
INSERT INTO `sys_user_role` VALUES ('3', '1');
INSERT INTO `sys_user_role` VALUES ('3', '2');
INSERT INTO `sys_user_role` VALUES ('3', '3');
INSERT INTO `sys_user_role` VALUES ('4', '1');
INSERT INTO `sys_user_role` VALUES ('4', '2');
INSERT INTO `sys_user_role` VALUES ('4', '3');
INSERT INTO `sys_user_role` VALUES ('4', '4');
INSERT INTO `sys_user_role` VALUES ('5', '1');
INSERT INTO `sys_user_role` VALUES ('5', '2');
INSERT INTO `sys_user_role` VALUES ('5', '3');
INSERT INTO `sys_user_role` VALUES ('5', '4');
INSERT INTO `sys_user_role` VALUES ('5', '5');
