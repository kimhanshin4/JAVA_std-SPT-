package Week03.inter_TvRemote;

public interface MultiRemoteController {

    void turnOnOff();
    void channelUp();
    void channelDown();
    void volumeUp();
    void volumeDown();

    // 매개변수와 반환타입 다형성 확인 메서드
    default MultiRemoteController getTV(Tv tv) {
        if(tv instanceof SamsungTv) {
            return (SamsungTv) tv;
        } else if(tv instanceof LgTv){
            return (LgTv) tv;
        } else {
            throw new NullPointerException("일치하는 Tv 없음");
        }
    }

}