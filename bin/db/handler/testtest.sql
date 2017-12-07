/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : testtest

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2017-11-26 13:37:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `addressid` varchar(100) NOT NULL,
  `companyid` varchar(100) NOT NULL,
  `userid` varchar(100) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `createdate` datetime DEFAULT NULL,
  `modifieddate` datetime DEFAULT NULL,
  `classname` varchar(100) DEFAULT NULL,
  `classpk` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `street1` varchar(100) DEFAULT NULL,
  `street2` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `zip` varchar(100) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `fax` varchar(100) DEFAULT NULL,
  `cell` varchar(100) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  PRIMARY KEY (`addressid`),
  KEY `addres_userid_index` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('101', 'dotcms.org', 'dotcms.org.2557', '', null, null, '', '', 'work', '3059 Grand', 'suite 440', 'Coconut grove', 'FL', '33133', '', '.305-305-3055', '', '', '0');
INSERT INTO `address` VALUES ('14', 'dotcms.org', 'dotcms.org.10', '', null, null, '', '', 'work', '1234 Maion Street', '', 'Miami', 'FL', '33141', '', '123-456-7890', '', '', '0');
INSERT INTO `address` VALUES ('181', 'dotcms.org', 'dotcms.org.2636', '', null, null, '', '', 'home', 'asd', 'asd', 'asd', 'asdsad', 'asd', '', 'asd', '', '', '0');
INSERT INTO `address` VALUES ('182', 'dotcms.org', 'dotcms.org.2637', '', null, null, '', '', 'home', 'asd', 'asd', 'asd', 'asdsad', 'asd', '', 'asd', '', '', '0');
INSERT INTO `address` VALUES ('183', 'dotcms.org', 'dotcms.org.2638', '', null, null, '', '', 'home', 'asd', 'asd', 'asd', 'asdsad', 'asd', '', 'asd', '', '', '0');
INSERT INTO `address` VALUES ('184', 'dotcms.org', 'dotcms.org.2639', '', null, null, '', '', 'home', 'asd', 'asd', 'asd', 'asdsad', 'asd', '', 'asd', '', '', '0');
INSERT INTO `address` VALUES ('192', 'dotcms.org', 'dotcms.org.2645', '', null, null, '', '', 'home', 'asd', 'asd', 'asd', 'asd', 'asd', '', 'asd', '', '', '0');
INSERT INTO `address` VALUES ('193', 'dotcms.org', 'dotcms.org.2646', '', null, null, '', '', 'home', 'asd', 'asd', 'asd', 'asd', 'asd', '', 'asd', '', '', '0');
INSERT INTO `address` VALUES ('194', 'dotcms.org', 'dotcms.org.2647', '', null, null, '', '', 'home', 'asd', 'asd', 'asd', 'asd', 'asd', '', 'asd', '', '', '0');
INSERT INTO `address` VALUES ('209', 'dotcms.org', 'dotcms.org.2662', '', null, null, '', '', 'work', 'test', '', 'test', 'test', 'test', '', 'test', '', '', '0');
INSERT INTO `address` VALUES ('219', 'dotcms.org', 'dotcms.org.2673', '', null, null, '', '', 'home', '299 S. Main', '', 'Andover', 'MA', '01810', '', '978-496-2359', '', '', '0');
INSERT INTO `address` VALUES ('220', 'dotcms.org', 'dotcms.org.2674', '', null, null, '', '', 'home', '299 S. Main', '', 'Andover', 'MA', '01810', '', '978-496-2359', '', '', '0');
INSERT INTO `address` VALUES ('221', 'dotcms.org', 'dotcms.org.2675', '', null, null, '', '', 'Homes', 'Street1', 'Street2', 'city', 'mq', '33133', 'United States of America', '30585815422', '', '', '0');
INSERT INTO `address` VALUES ('236', 'dotcms.org', 'dotcms.org.2675', '', null, null, '', '', 'Work', 'asd', '', 'asd', 'as', 'asas', 'United States of America', 'asas', '', '', '0');
INSERT INTO `address` VALUES ('296', 'dotcms.org', 'dotcms.org.2695', '', null, null, '', '', 'work', '3059 Grand Ave', 'suite 440', 'Miami', 'FL', '33133', 'United States of America', '305.858.1422', '', '', '0');
INSERT INTO `address` VALUES ('314', 'dotcms.org', 'dotcms.org.1', '', null, null, '', '', 'dotCMS Office', '3059 Grand Ave.', 'suite 440', 'Miami', 'FL', '33133', 'United States of America', '305.858.1422', '', '', '0');
INSERT INTO `address` VALUES ('324', 'dotcms.org', 'dotcms.org.2713', '', null, null, '', '', 'work', '3059 Grand Ave.', 'suite 440', 'Miami', 'Florida', '33133', '', '305.858.1422', '', '', '0');
INSERT INTO `address` VALUES ('332', 'dotcms.org', 'dotcms.org.2715', '', null, null, '', '', 'work', 'asdasd', '', 'asdasd', 'sadsadsad', 'asdasd', '', 'asdasd', '', '', '0');
INSERT INTO `address` VALUES ('333', 'dotcms.org', 'dotcms.org.2716', '', null, null, '', '', 'work', 'asdasd', '', 'asdasd', 'sadsadsad', 'asdasd', '', 'asdasd', '', '', '0');
INSERT INTO `address` VALUES ('336', 'dotcms.org', 'dotcms.org.2719', '', null, null, '', '', 'work', 'asdasd', 'asdsad', 'asdasd', 'asdsad', 'asdasd', '', 'asdasd', 'asdsad', '', '0');
INSERT INTO `address` VALUES ('339', 'dotcms.org', 'dotcms.org.2727', '', null, null, '', '', 'home', '299 S. Main', '', 'Anvoder', 'MA', '01810', 'United States of America', '305.858.1422', '', '', '0');
INSERT INTO `address` VALUES ('340', 'dotcms.org', 'dotcms.org.2728', '', null, null, '', '', 'home', '299 S. Main', '', 'Anvoder', 'MA', '01810', 'United States of America', '305.858.1422', '', '', '0');
INSERT INTO `address` VALUES ('352', 'dotcms.org', 'dotcms.org.2781', '', null, null, '', '', 'Home', 'Street1', 'Street2', 'City', 'State', '55555', 'Vanuatu', '555-55-55', '777-77-77', '', '0');
INSERT INTO `address` VALUES ('355', 'dotcms.org', 'dotcms.org.2781', '', null, null, '', '', 'Work', 'WStreet1', 'WStreet2', 'WCity', 'WState', '77777', 'Vanuatu', '777-77-77', '999-99-99', '', '0');
INSERT INTO `address` VALUES ('360', 'dotcms.org', 'dotcms.org.2785', '', null, null, '', '', 'home1', 'add1', '2', 'c2', 's2', '1234', 'Angola', '4567', '789', '', '0');
INSERT INTO `address` VALUES ('364', 'dotcms.org', 'dotcms.org.2800', '', null, null, '', '', 'work', 'Av. 11', '', 'Miami', 'Florida', '33166', 'USA', '123456789', '', '', '0');
INSERT INTO `address` VALUES ('365', 'dotcms.org', 'dotcms.org.2802', '', null, null, '', '', 'work', '2137 Beckenham Drive', '', 'Mount Pleasant', 'SC', '29466', 'US', '555-555-5555', '', '', '0');
INSERT INTO `address` VALUES ('384', 'dotcms.org', 'dotcms.org.2806', '', null, null, '', '', 'work', '2137 Beckenham Drive', '', 'Mount Pleasant', 'South Carolina', '29466', 'US', '18435551234', '18435555678', '18435559123', '0');
INSERT INTO `address` VALUES ('91', 'dotcms.org', 'dotcms.org.2549', '', null, null, '', '', 'work', '1 test test', '', 'city', 'IN', 'zip', '', 'phone', '', '', '0');

-- ----------------------------
-- Table structure for adminconfig
-- ----------------------------
DROP TABLE IF EXISTS `adminconfig`;
CREATE TABLE `adminconfig` (
  `configid` varchar(100) NOT NULL,
  `companyid` varchar(100) NOT NULL,
  `type_` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `config` longtext,
  PRIMARY KEY (`configid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of adminconfig
-- ----------------------------
INSERT INTO `adminconfig` VALUES ('42', 'dotcms.org', 'USER_CONFIG', 'USER_CONFIG', '0');

-- ----------------------------
-- Table structure for analytic_summary
-- ----------------------------
DROP TABLE IF EXISTS `analytic_summary`;
CREATE TABLE `analytic_summary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `summary_period_id` bigint(20) NOT NULL,
  `host_id` varchar(36) NOT NULL,
  `visits` bigint(20) DEFAULT NULL,
  `page_views` bigint(20) DEFAULT NULL,
  `unique_visits` bigint(20) DEFAULT NULL,
  `new_visits` bigint(20) DEFAULT NULL,
  `direct_traffic` bigint(20) DEFAULT NULL,
  `referring_sites` bigint(20) DEFAULT NULL,
  `search_engines` bigint(20) DEFAULT NULL,
  `bounce_rate` int(11) DEFAULT NULL,
  `avg_time_on_site` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `summary_period_id` (`summary_period_id`,`host_id`),
  KEY `idx_analytic_summary_1` (`host_id`),
  KEY `idx_analytic_summary_2` (`visits`),
  KEY `idx_analytic_summary_3` (`page_views`),
  KEY `fk9e1a7f4b7b46300` (`summary_period_id`),
  CONSTRAINT `fk9e1a7f4b7b46300` FOREIGN KEY (`summary_period_id`) REFERENCES `analytic_summary_period` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of analytic_summary
-- ----------------------------

-- ----------------------------
-- Table structure for analytic_summary_404
-- ----------------------------
DROP TABLE IF EXISTS `analytic_summary_404`;
CREATE TABLE `analytic_summary_404` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `summary_period_id` bigint(20) NOT NULL,
  `host_id` varchar(36) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  `referer_uri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_analytic_summary_404_1` (`host_id`),
  KEY `fk7050866db7b46300` (`summary_period_id`),
  CONSTRAINT `fk7050866db7b46300` FOREIGN KEY (`summary_period_id`) REFERENCES `analytic_summary_period` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of analytic_summary_404
-- ----------------------------

-- ----------------------------
-- Table structure for analytic_summary_content
-- ----------------------------
DROP TABLE IF EXISTS `analytic_summary_content`;
CREATE TABLE `analytic_summary_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `summary_id` bigint(20) NOT NULL,
  `inode` varchar(255) DEFAULT NULL,
  `hits` bigint(20) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk53cb4f2eed30e054` (`summary_id`),
  CONSTRAINT `fk53cb4f2eed30e054` FOREIGN KEY (`summary_id`) REFERENCES `analytic_summary` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of analytic_summary_content
-- ----------------------------

-- ----------------------------
-- Table structure for analytic_summary_pages
-- ----------------------------
DROP TABLE IF EXISTS `analytic_summary_pages`;
CREATE TABLE `analytic_summary_pages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `summary_id` bigint(20) NOT NULL,
  `inode` varchar(255) DEFAULT NULL,
  `hits` bigint(20) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fka1ad33b9ed30e054` (`summary_id`),
  CONSTRAINT `fka1ad33b9ed30e054` FOREIGN KEY (`summary_id`) REFERENCES `analytic_summary` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of analytic_summary_pages
-- ----------------------------

-- ----------------------------
-- Table structure for analytic_summary_period
-- ----------------------------
DROP TABLE IF EXISTS `analytic_summary_period`;
CREATE TABLE `analytic_summary_period` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `full_date` datetime DEFAULT NULL,
  `day` int(11) DEFAULT NULL,
  `week` int(11) DEFAULT NULL,
  `month` int(11) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  `dayname` varchar(50) NOT NULL,
  `monthname` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `full_date` (`full_date`),
  KEY `idx_analytic_summary_period_4` (`month`),
  KEY `idx_analytic_summary_period_3` (`week`),
  KEY `idx_analytic_summary_period_2` (`day`),
  KEY `idx_analytic_summary_period_5` (`year`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of analytic_summary_period
-- ----------------------------

-- ----------------------------
-- Table structure for analytic_summary_referer
-- ----------------------------
DROP TABLE IF EXISTS `analytic_summary_referer`;
CREATE TABLE `analytic_summary_referer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `summary_id` bigint(20) NOT NULL,
  `hits` bigint(20) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk5bc0f3e2ed30e054` (`summary_id`),
  CONSTRAINT `fk5bc0f3e2ed30e054` FOREIGN KEY (`summary_id`) REFERENCES `analytic_summary` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of analytic_summary_referer
-- ----------------------------

-- ----------------------------
-- Table structure for analytic_summary_visits
-- ----------------------------
DROP TABLE IF EXISTS `analytic_summary_visits`;
CREATE TABLE `analytic_summary_visits` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `summary_period_id` bigint(20) NOT NULL,
  `host_id` varchar(36) DEFAULT NULL,
  `visit_time` datetime DEFAULT NULL,
  `visits` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_analytic_summary_visits_2` (`visit_time`),
  KEY `idx_analytic_summary_visits_1` (`host_id`),
  KEY `fk9eac9733b7b46300` (`summary_period_id`),
  CONSTRAINT `fk9eac9733b7b46300` FOREIGN KEY (`summary_period_id`) REFERENCES `analytic_summary_period` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of analytic_summary_visits
-- ----------------------------

-- ----------------------------
-- Table structure for analytic_summary_workstream
-- ----------------------------
DROP TABLE IF EXISTS `analytic_summary_workstream`;
CREATE TABLE `analytic_summary_workstream` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `inode` varchar(255) DEFAULT NULL,
  `asset_type` varchar(255) DEFAULT NULL,
  `mod_user_id` varchar(255) DEFAULT NULL,
  `host_id` varchar(36) DEFAULT NULL,
  `mod_date` datetime DEFAULT NULL,
  `action` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_dashboard_workstream_2` (`host_id`),
  KEY `idx_dashboard_workstream_1` (`mod_user_id`),
  KEY `idx_dashboard_workstream_3` (`mod_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of analytic_summary_workstream
-- ----------------------------

-- ----------------------------
-- Table structure for broken_link
-- ----------------------------
DROP TABLE IF EXISTS `broken_link`;
CREATE TABLE `broken_link` (
  `id` varchar(36) NOT NULL,
  `inode` varchar(36) NOT NULL,
  `field` varchar(36) NOT NULL,
  `link` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `status_code` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_brokenl_content` (`inode`),
  KEY `fk_brokenl_field` (`field`),
  CONSTRAINT `fk_brokenl_content` FOREIGN KEY (`inode`) REFERENCES `contentlet` (`inode`) ON DELETE CASCADE,
  CONSTRAINT `fk_brokenl_field` FOREIGN KEY (`field`) REFERENCES `field` (`inode`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of broken_link
-- ----------------------------

-- ----------------------------
-- Table structure for calendar_reminder
-- ----------------------------
DROP TABLE IF EXISTS `calendar_reminder`;
CREATE TABLE `calendar_reminder` (
  `user_id` varchar(255) NOT NULL,
  `event_id` varchar(36) NOT NULL,
  `send_date` datetime NOT NULL,
  PRIMARY KEY (`user_id`,`event_id`,`send_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of calendar_reminder
-- ----------------------------

-- ----------------------------
-- Table structure for campaign
-- ----------------------------
DROP TABLE IF EXISTS `campaign`;
CREATE TABLE `campaign` (
  `inode` varchar(36) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `from_email` varchar(255) DEFAULT NULL,
  `from_name` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `message` longtext,
  `user_id` varchar(255) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `completed_date` datetime DEFAULT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '0',
  `locked` tinyint(1) DEFAULT NULL,
  `sends_per_hour` varchar(15) DEFAULT NULL,
  `sendemail` tinyint(1) DEFAULT NULL,
  `communicationinode` varchar(36) DEFAULT NULL,
  `userfilterinode` varchar(36) DEFAULT NULL,
  `sendto` varchar(15) DEFAULT NULL,
  `isrecurrent` tinyint(1) DEFAULT NULL,
  `wassent` tinyint(1) DEFAULT NULL,
  `expiration_date` datetime DEFAULT NULL,
  `parent_campaign` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`inode`),
  KEY `idx_campaign_4` (`expiration_date`),
  KEY `idx_campaign_3` (`completed_date`),
  KEY `idx_campaign_2` (`start_date`),
  KEY `idx_campaign_1` (`user_id`),
  KEY `fkf7a901105fb51eb` (`inode`),
  CONSTRAINT `fkf7a901105fb51eb` FOREIGN KEY (`inode`) REFERENCES `inode` (`inode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of campaign
-- ----------------------------

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `inode` varchar(36) NOT NULL,
  `category_name` varchar(255) DEFAULT NULL,
  `category_key` varchar(255) DEFAULT NULL,
  `sort_order` int(11) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `keywords` longtext,
  `category_velocity_var_name` varchar(255) NOT NULL,
  `mod_date` datetime DEFAULT NULL,
  PRIMARY KEY (`inode`),
  KEY `idx_category_1` (`category_name`),
  KEY `idx_category_2` (`category_key`),
  KEY `fk302bcfe5fb51eb` (`inode`),
  CONSTRAINT `fk302bcfe5fb51eb` FOREIGN KEY (`inode`) REFERENCES `inode` (`inode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('141ac1fc-0f66-4d5a-baff-295acbcd044a', 'Pages', 'cPages', null, '1', '', 'pages', '2017-11-13 13:49:54');
INSERT INTO `category` VALUES ('175c7518-b12c-4105-a4cc-9e480ee1f6c3', 'United States', 'us', '0', '1', '', 'us', '2017-11-09 08:32:30');
INSERT INTO `category` VALUES ('1a8ab198-14b4-4bc7-a66c-5d98cf2785ac', 'Servers', 'servers', null, '1', '', 'servers', '2017-11-09 08:29:16');
INSERT INTO `category` VALUES ('1e615d95-191c-4dad-b14e-d68021ed0464', 'Content', 'kContent', null, '1', '', 'content', '2017-11-13 13:51:30');
INSERT INTO `category` VALUES ('20cdf9f1-bf66-4303-92e0-8822f8081cfc', 'Wealth Management', null, '0', '1', null, 'wealthManagement', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('2d5e7026-46e2-454e-89b8-4522570fd0d0', 'Regions', 'region', '0', '1', '', 'region', '2017-11-09 16:03:49');
INSERT INTO `category` VALUES ('36abf3c4-d58b-4e42-8e1d-e9a1fe661831', 'First Time Investor', '', '0', '1', '', 'firstTimeInvestor', '2017-03-08 19:18:42');
INSERT INTO `category` VALUES ('375341a2-0912-422f-b903-2602b6105c70', 'Event Types', 'event', '0', '1', null, 'eventTypes', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('3a7bcd3f-fafb-40c5-a89f-94dc54520fcb', 'Canada', 'ca', '1', '1', '', 'canada', '2017-11-09 08:32:23');
INSERT INTO `category` VALUES ('3b8c53ec-f6ba-4b81-adef-6b7ed38a8490', 'Webinars', 'webinars', '0', '1', null, 'webinars', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('3d5d641b-e5fd-409e-a283-b6fe7ab780d1', 'Topic', 'topic', '0', '1', null, 'topic', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('3fb03a0d-49a3-4639-a678-ff15260bb207', 'Oceania', 'anz', null, '1', '', 'oceania', '2017-11-09 15:35:19');
INSERT INTO `category` VALUES ('4948c9d5-e106-42ef-b544-9ea60a05fa0f', 'B2B', 'b2b', null, '1', '', 'b2b', '2017-11-09 15:36:06');
INSERT INTO `category` VALUES ('5193736b-b98c-425d-a12c-0391d2bef6a9', 'Seminars', 'seminars', '0', '1', null, 'seminars', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('5566e3f9-e177-46e8-9ffb-85b387e736de', 'Stores', 'stores', null, '1', '', 'stores', '2017-11-09 15:35:55');
INSERT INTO `category` VALUES ('597295aa-025d-4894-8a77-6e5a1912202d', 'Latin & South America', 'la', null, '1', '', 'latinSouthAmerica', '2017-11-09 15:34:50');
INSERT INTO `category` VALUES ('5ad2fb00-74b8-4b44-9954-99787d7457f4', 'Release Dates', 'releasedates', '0', '1', null, 'releaseDates', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('66ef8e60-9426-4781-ae69-8b822bc8c6a3', 'Home', 'kHome', null, '1', '', 'home', '2017-11-13 13:50:23');
INSERT INTO `category` VALUES ('8042b475-2dea-4280-b93d-0d27e4104ce9', 'North America', 'na', null, '1', '', 'northAmerica', '2017-11-09 15:34:41');
INSERT INTO `category` VALUES ('9a282198-e50d-47c1-8ef8-beaba6d0b242', 'France', 'fr', '2', '1', '', 'france', '2017-11-09 08:32:30');
INSERT INTO `category` VALUES ('9cd9a53f-4122-4ed4-9a85-d6def99912e8', 'Europ', 'europe', null, '1', '', 'europ', '2017-11-09 15:34:57');
INSERT INTO `category` VALUES ('a412bbf0-16ff-4ed9-9b0c-a1e124a2e6b9', 'Business Laptops', 'business-laptops', null, '1', '', 'businessLaptops', '2017-11-09 08:29:54');
INSERT INTO `category` VALUES ('a8f9dd0e-1a8d-4276-b935-a17a5dea6658', 'Middle East & Africa', 'mea', null, '1', '', 'middleEastAfrica', '2017-11-09 15:35:05');
INSERT INTO `category` VALUES ('ac117b80-66f5-4981-9c41-2b47040b8581', 'Conferences', 'conferences', '0', '1', null, 'conferences', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('b29f318e-b620-4c0d-ae97-bd1801ab0e4b', 'All', '*', null, '1', '', 'all', '2017-11-13 13:50:09');
INSERT INTO `category` VALUES ('bad4cc1e-8b8c-48e3-8475-b4257a4994c5', 'Product Detail', 'kProductDetail', null, '1', '', 'productDetail', '2017-11-13 13:50:33');
INSERT INTO `category` VALUES ('bba0fcba-eb79-46dc-ae36-fe2f3d9cf1e7', 'Retirement', '', '0', '1', '', 'retirement', '2017-03-08 19:18:31');
INSERT INTO `category` VALUES ('c2a1602d-1102-4954-93d0-132576cd3356', 'Asia', 'ap', null, '1', '', 'asia', '2017-11-09 15:35:12');
INSERT INTO `category` VALUES ('cce81b4d-81d5-4a91-a5c3-de181cd78bb8', 'Countries', 'countries', null, '1', '', 'countries', '2017-11-09 08:27:33');
INSERT INTO `category` VALUES ('cf140e2a-d01d-4d48-8ab0-e87aceb22b33', 'Private Banking', null, '0', '1', null, 'banking', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('d1e963ee-b6ba-4ca6-b060-5f696437a328', 'Investment Banking', null, '0', '1', null, 'investing', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('e0b02c59-a303-4e88-a4bb-b925dfea4e02', 'Gaming Laptops', 'gaming-laptops', null, '1', '', 'gamingLaptops', '2017-11-09 08:29:40');
INSERT INTO `category` VALUES ('e0e9ef6d-2fa9-400a-962b-a06f17522fad', 'B2C', 'b2c', null, '1', '', 'b2c', '2017-11-09 15:36:12');
INSERT INTO `category` VALUES ('e5b4487b-4f96-4e74-a284-ddc83d2ef71a', 'Laptops & Notebooks', 'laptops-notebooks', null, '1', '', 'laptopsNotebooks', '2017-11-09 08:28:59');
INSERT INTO `category` VALUES ('edab9302-fdc7-4384-8a8f-db103c140b8b', 'Desktops', 'desktops', null, '1', '', 'desktops', '2017-11-09 08:29:07');
INSERT INTO `category` VALUES ('ede13663-ff06-4d01-ab99-a8976e995010', 'Research', null, '0', '1', null, 'research', '2014-03-21 09:11:20');
INSERT INTO `category` VALUES ('f667bbfb-2937-4d7a-ae8d-cdf3cb670469', 'Components', 'components', null, '1', '', 'components', '2017-11-15 04:51:04');
INSERT INTO `category` VALUES ('fc43bb63-d255-40af-9f1e-85491732f523', 'Products', 'products', null, '1', '', 'products', '2017-11-09 08:28:40');

-- ----------------------------
-- Table structure for chain
-- ----------------------------
DROP TABLE IF EXISTS `chain`;
CREATE TABLE `chain` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `key_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `success_value` varchar(255) NOT NULL,
  `failure_value` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `key_name` (`key_name`),
  KEY `idx_chain_key_name` (`key_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chain
-- ----------------------------

-- ----------------------------
-- Table structure for chain_link_code
-- ----------------------------
DROP TABLE IF EXISTS `chain_link_code`;
CREATE TABLE `chain_link_code` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) DEFAULT NULL,
  `code` longtext NOT NULL,
  `last_mod_date` datetime NOT NULL,
  `language` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `class_name` (`class_name`),
  KEY `idx_chain_link_code_classname` (`class_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chain_link_code
-- ----------------------------

-- ----------------------------
-- Table structure for chain_state
-- ----------------------------
DROP TABLE IF EXISTS `chain_state`;
CREATE TABLE `chain_state` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `chain_id` bigint(20) NOT NULL,
  `link_code_id` bigint(20) NOT NULL,
  `state_order` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_state_chain` (`chain_id`),
  KEY `fk_state_code` (`link_code_id`),
  CONSTRAINT `fk_state_chain` FOREIGN KEY (`chain_id`) REFERENCES `chain` (`id`),
  CONSTRAINT `fk_state_code` FOREIGN KEY (`link_code_id`) REFERENCES `chain_link_code` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chain_state
-- ----------------------------

-- ----------------------------
-- Table structure for chain_state_parameter
-- ----------------------------
DROP TABLE IF EXISTS `chain_state_parameter`;
CREATE TABLE `chain_state_parameter` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `chain_state_id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `value` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_parameter_state` (`chain_state_id`),
  CONSTRAINT `fk_parameter_state` FOREIGN KEY (`chain_state_id`) REFERENCES `chain_state` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chain_state_parameter
-- ----------------------------
