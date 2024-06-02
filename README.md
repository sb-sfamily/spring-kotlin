| API명 | 메소드명 | URL | 방식  | 입력값 | 응답값 | 설명  |
| --- | --- | --- | --- | --- | --- | --- |
| 이벤트 상세 정보 | GetEvent | {id} | GET | {id} : 행사 ID | Event 객체 | 행사 ID를 이용하여 행사내용을 가져온다 |
| 이벤트 조회 | GetListEvent | /list | POST | SearchEvent | 조회된 이벤트 상세내용 | 제목, 시작일자, 상태로 이벤트 목록을 조회 |
| 이벤트 추가 | InsertListEvent | /insert | POST | InsertEvent | 이벤트 추가 | 추가할 값들을 입력하여 이벤트를 추가함 |
| 이벤트 상태 | SelectListEventByStatus | /status | GET | SearchEvent | 이벤트 진행상황 조회 | 시작일과 종료일을 기준으로 이벤트의 상태를 나타냄 |
| 이벤트 삭제 | DeleteEvent | {id} | Delete | {id}: 행사 ID | 이벤트 삭제 | id를 기준으로 이벤트를 삭제함 |
| 이벤트 수정 | UpdateEvents | /update | POST | UpdateEvent | 이벤트 수정 | id를 기준으로 이벤트를 수정함 |