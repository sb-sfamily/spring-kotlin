INSERT INTO sbapi.event
(title, operator_id, event_type, reg_date, from_dt
, to_dt, DESCRIPTION, place_name, place_addr, create_dt
, create_user_id)
VALUES (
         '어버이날', 1, 'A0001', CURDATE(), STR_TO_DATE('2024-05-08 09:00:00','%Y-%m-%d %H:%i:%s')
       , STR_TO_DATE('2024-05-08 17:00:00','%Y-%m-%d %H:%i:%s'), '어버이의 은혜를 기리는 날입니다', '성사체육공원', '성사동', CURTIME(),  1);


INSERT INTO sbapi.event
(title, operator_id, event_type, reg_date, from_dt
, to_dt, DESCRIPTION, place_name, place_addr, create_dt
, create_user_id)
VALUES (
         '현충일', 1, 'A0001', CURDATE(), STR_TO_DATE('2024-06-05 09:00:00','%Y-%m-%d %H:%i:%s')
       , STR_TO_DATE('2024-06-08 17:00:00','%Y-%m-%d %H:%i:%s'), '순국열사의 뜻을 기립니다.', '성사체육공원', '성사동', CURTIME(),  1);


-- sbapi.event definition

CREATE TABLE `event` (
                         `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '행사 번호',
                         `title` varchar(200) NOT NULL COMMENT '행사 제목',
                         `operator_id` int(10) NOT NULL COMMENT '운영자',
                         `event_type` char(5) NOT NULL COMMENT '행사 유형-코드 구분: A0001',
                         `reg_date` date NOT NULL COMMENT '행사 등록일자',
                         `from_dt` datetime NOT NULL COMMENT '행사 시작시간',
                         `to_dt` datetime NOT NULL COMMENT '행사 시작시간',
                         `description` varchar(300) NOT NULL COMMENT '행사 내용',
                         `place_name` varchar(100) NOT NULL COMMENT '행사 장소',
                         `place_addr` varchar(100) NOT NULL COMMENT '행사 주소',
                         `create_dt` datetime NOT NULL COMMENT '등록 날짜',
                         `update_dt` datetime DEFAULT NULL COMMENT '수정 날짜',
                         `create_user_id` int(10) NOT NULL COMMENT '등록한 사용자',
                         `update_user_id` int(10) DEFAULT NULL COMMENT '수정한 사용자',
                         `status_of_event` varchar(100) DEFAULT NULL,
                         PRIMARY KEY (`id`) USING BTREE,
                         KEY `IDX01_from_dt` (`from_dt`,`to_dt`) USING BTREE,
                         KEY `IDX02_to_dt` (`to_dt`) USING BTREE,
                         KEY `IDX03_title` (`title`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='행사';