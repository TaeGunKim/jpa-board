아아아주 간단한 jpa board

1. application.yml에 보면 db 정보가 있음(각자 local에 맞게 수정)
2. 위에서, JPA 설정에 generate-ddl 을 true로 했기 떄문에 로컬에 DB 설치 후, 설정만 맞다면 entity에 맞게 create table이 됨 (운영에서 사용하면 안되는 설정)
3. 기동하면 localhost:8080 으로 접속 (resources/templates/board/list.html이 보임, server : BoardController.java >  @GetMapping("/")  public String list
