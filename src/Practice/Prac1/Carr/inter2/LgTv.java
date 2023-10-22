package Practice.Prac1.Carr.inter2;

public class LgTv extends Tv implements MultiRemoteController {

    public LgTv(String company) {
        super(company);
    }

    @Override
    public void turnOnOff() {
        setPower(!isPower());
        displayPower(getCompany(), isPower());
    }

    @Override
    public void channelUp() {
        setChannel(getChannel() + 1);
        displayChannel(getChannel());
    }

    @Override
    public void channelDown() {
        setChannel(getChannel() - 1);
        displayChannel(getChannel());
    }

    @Override
    public void volumeUp() {
        setVolume(getVolume() + 1);
        displayVolume(getVolume());
    }

    @Override
    public void volumeDown() {
        setVolume(getVolume() - 1);
        displayVolume(getVolume());
    }
}