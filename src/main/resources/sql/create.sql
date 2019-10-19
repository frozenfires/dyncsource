-- ----------------------------------------------------
--  �û�
-- ----------------------------------------------------
--  Table structure for `sys_user`
-- ----------------------------------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '���',
  `name` varchar(50) NOT NULL COMMENT '�û���',
  `password` varchar(100) COMMENT '����',
  `salt` varchar(40) COMMENT '��',
  `email` varchar(100) COMMENT '����',
  `mobile` varchar(100) COMMENT '�ֻ���',
  `status` tinyint COMMENT '״̬  0������   1������',
  `dept_id` bigint(20) COMMENT '����ID',
  `create_by` varchar(50) COMMENT '������',
  `create_time` datetime COMMENT '����ʱ��',
  `last_update_by` varchar(50) COMMENT '������',
  `last_update_time` datetime COMMENT '����ʱ��',
  `del_flag` tinyint DEFAULT 0 COMMENT '�Ƿ�ɾ��  -1����ɾ��  0������',
  PRIMARY KEY (`id`),
  UNIQUE INDEX (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û�';