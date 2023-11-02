package Practice.TempA;

public class temp {

    //방의 예약 가능 여부를 판단하는 메서드
    //방의 상태 == 예약가능 => 에약하는 날 != 예약한 날

    public void currentDate() {
        // 현재의 UTC 날짜와 시간을 얻습니다.
        Instant instant = Instant.now();

        // ISO 8601 형식으로 포맷팅합니다.
        DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
        String formattedDate = formatter.format(instant);
    }
    //UTC / ISO 8601
    //getTimeZone() / Date클래스 / after(), before(), compareTo() /

}
