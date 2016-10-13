/*
Navicat MySQL Data Transfer

Source Server         : 太铁==验证cms
Source Server Version : 50620
Source Host           : mysql.rdsmsgmvjhsbv8j.rds.bj.baidubce.com:3306
Source Database       : db_cms

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2016-09-02 10:54:06
*/

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `sex` varchar(30) DEFAULT NULL,
  `tel` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'sdfdf', '10', '154154515');
INSERT INTO `user` VALUES ('2', 'sdfd', '12', '2425121251');