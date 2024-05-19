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